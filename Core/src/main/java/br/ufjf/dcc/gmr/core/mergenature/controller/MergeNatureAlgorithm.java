package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.exception.CheckoutException;
import br.ufjf.dcc.gmr.core.exception.DiffException;
import br.ufjf.dcc.gmr.core.exception.GitException;
import br.ufjf.dcc.gmr.core.exception.LogException;
import br.ufjf.dcc.gmr.core.exception.MergeBaseException;
import br.ufjf.dcc.gmr.core.exception.MergeException;
import br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException;
import br.ufjf.dcc.gmr.core.exception.ShowException;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictType;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import br.ufjf.dcc.gmr.core.vcs.types.LineType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 * The main algorithm of merge nature, its function is catch all merges, all
 * conflict files and all conflict regions, besides catalog all regions with
 * ANTLR4
 *
 * @author João Pedro Lima
 * @since 14-10-2020
 */
public class MergeNatureAlgorithm {

    private String repositoryLocation;
    private int contextLines;
    private Project project;
    private JProgressBar progressBar;

    private boolean solutionFileWasRenamed;
    private List<IntegerInterval> contextIntervals;

    public MergeNatureAlgorithm(String repositoryLocation, int contextLines) {
        this.repositoryLocation = repositoryLocation;
        this.contextLines = contextLines;
        this.project = null;
        this.progressBar = null;
    }

    public MergeNatureAlgorithm(String repositoryLocation, int contextLines, JProgressBar progressBar) {
        this.repositoryLocation = repositoryLocation;
        this.contextLines = contextLines;
        this.project = null;
        this.progressBar = progressBar;
    }

    public void startAlgorithm() {
        try {
            this.project = projectLayer();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.project = null;
        }
    }

    public Project getProject() {
        return project;
    }

    private Project projectLayer() throws IOException, NotGitRepositoryException, ShowException, MergeException, CheckoutException, MergeBaseException, LogException, DiffException {

        Project project = new Project();
        String[] auxStringArray;
        String repositoryPath = "";

        if (MergeNatureTools.isDirectory(repositoryLocation)) {
            if (repositoryLocation.contains("\\")) {
                repositoryLocation = repositoryLocation.replaceAll("\\\\", "/");
            }
            if (repositoryLocation.endsWith("/")) {
                repositoryPath = this.repositoryLocation;
            } else {
                repositoryPath = this.repositoryLocation + "/";
            }
            project.setName(Paths.get(this.repositoryLocation).getFileName().toString());
            project.setUrl(Git.getRemoteURL(repositoryPath).replaceAll("\n", ""));
            if (project.getUrl().equals("Unknown")) {
                project.setOrganization("Unknown");
            } else if (project.getUrl().contains("@")) {
                auxStringArray = project.getUrl().split(":")[1].split("/");
                project.setOrganization(auxStringArray[0]);
            } else {
                auxStringArray = project.getUrl().split("/");
                project.setOrganization(auxStringArray[auxStringArray.length - 2]);
            }
        } else {
            System.out.println("Analysis Download is not avaliable!");
        }
        MergeNatureTools.prepareAnalysis(repositoryPath);
        List<String> log;
        log = Git.getAllMerges(repositoryPath);
        int numberOfMerges = log.size();
        int status = 0;
        if (this.progressBar != null) {
            this.progressBar.setMinimum(1);
            progressBar.setIndeterminate(false);
            this.progressBar.setMaximum(numberOfMerges);
        }
        System.out.println("[" + project.getName() + "] " + status + File.separator + numberOfMerges + " merges processed...");
        for (String logLine : log) {
            project.addMerge(mergeLayer(project, logLine, repositoryPath));
            if (this.progressBar != null) {
                this.progressBar.setValue(++status);
                System.out.println("[" + project.getName() + "] " + status + File.separator + numberOfMerges + " merges processed...");
            } else {
                System.out.println("[" + project.getName() + "] " + ++status + File.separator + numberOfMerges + " merges processed...");
            }
        }

        return project;

    }

    private Merge mergeLayer(Project project, String logLine, String repositoryPath) throws IOException, NotGitRepositoryException, ShowException, MergeException, CheckoutException, MergeBaseException, DiffException {

        Merge merge = new Merge();
        String[] auxStringArray;
        List<String> mergeMessage;
        String auxString;
        boolean unrelatedHistories = false;

        merge.setProject(project);
        auxStringArray = logLine.split("/");
        merge.setMerge(new Commit(auxStringArray[0], repositoryPath));
        auxStringArray = auxStringArray[1].split(" ");
        if (auxStringArray.length > 2) {
            merge.setMergeType(MergeType.OCTOPUS_MERGE);
        }
        for (String parent : auxStringArray) {
            merge.addParent(new Commit(parent, repositoryPath));
        }
        auxString = Git.mergeBase(repositoryPath, auxStringArray);
        if ("No ancestor".equals(auxString)) {
            merge.setAncestor(null);
            unrelatedHistories = true;
        } else {
            merge.setAncestor(new Commit(auxString, repositoryPath));
        }
        if (merge.getMergeType() != MergeType.OCTOPUS_MERGE) {
            Git.checkout(merge.getParents().get(0).getCommitHash(), repositoryPath);
            mergeMessage = Git.merge(merge.getParents().get(1).getCommitHash(), repositoryPath);
            if (mergeMessage.contains("Automatic merge failed; fix conflicts and then commit the result.")) {
                if (unrelatedHistories) {
                    merge.setMergeType(MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES);
                } else {
                    merge.setMergeType(MergeType.CONFLICTED_MERGE);
                }
                for (String conflictMessage : mergeMessage) {
                    if (conflictMessage.contains("CONFLICT")) {
                        try {
                            merge.addConflict(conflictLayer(merge, conflictMessage, repositoryPath));
                        } catch (OutOfMemoryError er) {
                            merge.setConflicts(new ArrayList<>());
                            merge.setMergeType(MergeType.OUT_OF_MEMORY);
                            break;
                        }
                    }
                }
                MergeNatureTools.prepareAnalysis(repositoryPath);
            } else {
                if (unrelatedHistories) {
                    merge.setMergeType(MergeType.NOT_CONFLICTED_MERGE_OF_UNRELATED_HISTORIES);
                } else {
                    merge.setMergeType(MergeType.NOT_CONFLICTED_MERGE);
                }
            }
        } else if (unrelatedHistories) {
            merge.setMergeType(MergeType.OCTOPUS_MERGE_OF_UNRELATED_HISTORIES);
        }
        return merge;
    }

    private Conflict conflictLayer(Merge merge, String conflictMessage, String repositoryPath) throws IOException, OutOfMemoryError, NotGitRepositoryException, ShowException, DiffException {

        Conflict conflict = MergeMessageReader.getConflictFromMessage(conflictMessage);

        conflict.setMerge(merge);

        if (conflict.getConflictType() == ConflictType.CONTENT
                || conflict.getConflictType() == ConflictType.COINCIDENCE_ADDING
                || conflict.getConflictType() == ConflictType.FILE_RENAME) {
            contextIntervals = new ArrayList<>();

            conflict.setConflictRegions(conflictRegionsLayer(conflict, MergeNatureTools.getFileContentInList(repositoryPath + conflict.getParent1FilePath()), repositoryPath));
            if (contextIntervals != null) {
                conflict = outsideAlterationsLayer(conflict, repositoryPath, contextIntervals);
            } else {
                conflict.setHasOutsideAlterations(true);
                conflict.setHasOutsideAlterationsIgnoringFormatting(true);
            }
        }
        if (!conflict.getConflictRegions().isEmpty()) {
            conflict = antlr4Layer(conflict, repositoryPath);
        }

        return conflict;
    }

    private List<ConflictRegion> conflictRegionsLayer(Conflict conflict, List<String> fileContent, String repositoryPath) throws IOException, NotGitRepositoryException, ShowException {
        String[] auxArray;
        List<ConflictRegion> conflictRegions = new ArrayList<>();
        ConflictRegion conflictRegion;
        String auxString = "";
        int beforeContextSize;
        int afterContextSize;
        for (int i = 0; i < fileContent.size(); i++) {
            if (MergeNatureTools.checkIfIsBegin(fileContent.get(i))) {
                try {
                    beforeContextSize = 0;
                    afterContextSize = 0;
                    conflictRegion = new ConflictRegion();
                    conflictRegion.setConflict(conflict);
                    for (int j = i - contextLines; j != i; j++) {
                        if (j > -1) {
                            auxString = auxString + "\n" + fileContent.get(j);
                            beforeContextSize++;
                        } else if (j == -1) {
                            auxString = auxString + "\n<SOF>";
                            break;
                        }
                    }
                    if (conflict.getConflictType() == ConflictType.CONTENT && fileContent.get(i).contains(":")) {
                        auxArray = fileContent.get(i).split(":");
                        if (!auxArray[auxArray.length - 1].equals(conflict.getParent1FilePath())
                                && Git.fileExistInCommit(conflict.getMerge().getParents().get(0).getCommitHash(), auxArray[auxArray.length - 1], repositoryPath)) {
                            conflict.setParent1FilePath(auxArray[auxArray.length - 1]);
                            conflict.setConflictFilePath(Conflict.PARENT2_FILE);
                            conflict.setConflictType(ConflictType.CONTENT_WITH_UNILATERAL_RENAMNING);
                        }
                    }
                    conflictRegion.setBeforeContext(auxString.replaceFirst("\n", ""));
                    auxString = "";
                    conflictRegion.setBeginLine(i + 1);
                    i++;
                    while (!MergeNatureTools.checkIfIsSeparator(fileContent.get(i))) {
                        auxString = auxString + "\n" + fileContent.get(i);
                        i++;
                    }
                    conflictRegion.setV1Text(auxString.replaceFirst("\n", ""));
                    auxString = "";
                    conflictRegion.setSeparatorLine(i + 1);
                    i++;
                    while (!MergeNatureTools.checkIfIsEnd(fileContent.get(i))) {
                        auxString = auxString + "\n" + fileContent.get(i);
                        i++;
                    }
                    if (conflict.getConflictType() == ConflictType.CONTENT && fileContent.get(i).contains(":")) {
                        auxArray = fileContent.get(i).split(":");
                        if (!auxArray[auxArray.length - 1].equals(conflict.getParent2FilePath())
                                && Git.fileExistInCommit(conflict.getMerge().getParents().get(1).getCommitHash(), auxArray[auxArray.length - 1], repositoryPath)) {
                            conflict.setParent2FilePath(auxArray[auxArray.length - 1]);
                            conflict.setConflictFilePath(Conflict.PARENT1_FILE);
                            conflict.setConflictType(ConflictType.CONTENT_WITH_UNILATERAL_RENAMNING);
                        }
                    }
                    conflictRegion.setV2Text(auxString.replaceFirst("\n", ""));
                    auxString = "";
                    conflictRegion.setEndLine(i + 1);
                    i++;
                    for (int j = i; j < i + contextLines; j++) {
                        if (j < fileContent.size()) {
                            auxString = auxString + "\n" + fileContent.get(j);
                            afterContextSize++;
                        } else {
                            auxString = auxString + "\n<EOF>";
                            i = j;
                            break;
                        }
                    }
                    conflictRegion.setAfterContext(auxString.replaceFirst("\n", ""));
                    conflictRegion.setRawConflict(ListUtils.getTextListStringToString(ListUtils.getSubList(fileContent,
                            conflictRegion.getBeginIndex() - beforeContextSize,
                            conflictRegion.getEndIndex() + afterContextSize)));
                    conflictRegion = solutionLayer(conflictRegion, repositoryPath);
                    conflictRegion = originalLinesLayer(conflictRegion, repositoryPath);
                    conflictRegions.add(conflictRegion);
                } catch (DiffException ex) {
                    Logger.getLogger(MergeNatureAlgorithm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return conflictRegions;
    }

    private ConflictRegion solutionLayer(ConflictRegion conflictRegion, String repositoryPath) throws IOException, NotGitRepositoryException, DiffException, ShowException {
        if (conflictRegion.getBeforeContext().endsWith("<SOF>") || conflictRegion.getAfterContext().startsWith("<EOF>")) {
            conflictRegion.setSolutionText("The context is not a line, the solution cannot be obtained accurately");
            conflictRegion.setDeveloperDecision(DeveloperDecision.IMPRECISE);
            contextIntervals = null;
        } else {
            String mergeCommit = conflictRegion.getConflict().getMerge().getMerge().getCommitHash();
            String conflictFilePath = conflictRegion.getConflict().getConflictFilePath();
            String parentFilePath = conflictRegion.getConflict().getParent1FilePath();
            int solutionFirstLine;
            int solutionFinalLine;
            try {
                solutionFirstLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, mergeCommit, "", parentFilePath, conflictFilePath, false, conflictRegion.getBeginLine() - 1);
                solutionFinalLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, mergeCommit, "", parentFilePath, conflictFilePath, false, conflictRegion.getEndLine() + 1);
                if (solutionFirstLine == ReturnNewLineNumber.REMOVED_FILE || solutionFinalLine == ReturnNewLineNumber.REMOVED_FILE) {
                    parentFilePath = conflictRegion.getConflict().getParent2FilePath();
                    solutionFirstLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, mergeCommit, "", parentFilePath, conflictFilePath, false, conflictRegion.getBeginLine() - 1);
                    solutionFinalLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, mergeCommit, "", parentFilePath, conflictFilePath, false, conflictRegion.getEndLine() + 1);
                    if (solutionFirstLine == ReturnNewLineNumber.REMOVED_FILE || solutionFinalLine == ReturnNewLineNumber.REMOVED_FILE) {
                        conflictRegion.setSolutionText("The solution to the conflict was to delete the file.");
                        conflictRegion.setDeveloperDecision(DeveloperDecision.FILE_DELETED);
                        contextIntervals = null;
                        return conflictRegion;
                    } else {
                        solutionFileWasRenamed = true;
                    }
                } else {
                    solutionFileWasRenamed = false;
                }
                if (solutionFirstLine == ReturnNewLineNumber.REMOVED_LINE || solutionFinalLine == ReturnNewLineNumber.REMOVED_LINE) {
                    contextIntervals = null;
                    conflictRegion.setSolutionText("The context was altered, so the solution cannot be obtained accurately");
                    conflictRegion.setDeveloperDecision(DeveloperDecision.IMPRECISE);
                } else if (solutionFirstLine == ReturnNewLineNumber.POSTPONED || solutionFinalLine == ReturnNewLineNumber.POSTPONED) {
                    contextIntervals = null;
                    conflictRegion.setSolutionText(conflictRegion.getRawConflict());
                    conflictRegion.setDeveloperDecision(DeveloperDecision.POSTPONED_3);
                } else {
                    if (solutionFirstLine <= 0 || solutionFinalLine <= 0) {
                        contextIntervals = null;
                        conflictRegion.setSolutionText("DIFF PROBLEM!");
                        conflictRegion.setDeveloperDecision(DeveloperDecision.DIFF_PROBLEM);
                    } else {
                        if (contextIntervals != null) {
                            contextIntervals.add(new IntegerInterval(solutionFirstLine, solutionFinalLine));
                        }
                        conflictRegion.setSolutionText(ListUtils.getTextListStringToString(ListUtils.getSubList(Git.getFileContentFromCommit(mergeCommit, parentFilePath.replaceFirst(repositoryPath, ""), repositoryPath), solutionFirstLine - 1, solutionFinalLine - 1)));
                        conflictRegion = developerDecisionLayer(conflictRegion);
                    }
                }
            } catch (IOException ex) {
                throw new IOException(ex);
            }
        }
        return conflictRegion;
    }

    private ConflictRegion developerDecisionLayer(ConflictRegion conflictRegion) {
        String solution = MergeNatureTools.getRawForm(conflictRegion.getSolutionTextWithoutContext());
        String v1 = MergeNatureTools.getRawForm(conflictRegion.getV1Text());
        String v2 = MergeNatureTools.getRawForm(conflictRegion.getV2Text());
        if (solution.equals("")) {
            conflictRegion.setDeveloperDecision(DeveloperDecision.NONE);
        } else if (solution.equals(v1.concat(v2)) || solution.equals(v2.concat(v1))) {
            conflictRegion.setDeveloperDecision(DeveloperDecision.CONCATENATION);
        } else if (solution.equals(v1)) {
            conflictRegion.setDeveloperDecision(DeveloperDecision.VERSION1);
        } else if (solution.equals(v2)) {
            conflictRegion.setDeveloperDecision(DeveloperDecision.VERSION2);
        } else {
            List<String> solutionList = MergeNatureTools.stringTextToListText(conflictRegion.getSolutionTextWithoutContext());
            int markers = numberOfMarkers(solutionList);
            solutionList = MergeNatureTools.getRawForm(solutionList);
            switch (markers) {
                case 0:
                    List<String> v1List = MergeNatureTools.getRawForm(MergeNatureTools.stringTextToListText(conflictRegion.getV1Text()));
                    List<String> v2List = MergeNatureTools.getRawForm(MergeNatureTools.stringTextToListText(conflictRegion.getV2Text()));
                    for (String solutionLine : solutionList) {
                        if (!(v1List.contains(solutionLine) || v2List.contains(solutionLine))) {
                            conflictRegion.setDeveloperDecision(DeveloperDecision.NEWCODE);
                            return conflictRegion;
                        }
                    }
                    conflictRegion.setDeveloperDecision(DeveloperDecision.COMBINATION);
                    break;
                case 1:
                    conflictRegion.setDeveloperDecision(DeveloperDecision.POSTPONED_1);
                    break;
                case 2:
                    conflictRegion.setDeveloperDecision(DeveloperDecision.POSTPONED_2);
                    break;
                case 3:
                    conflictRegion.setDeveloperDecision(DeveloperDecision.POSTPONED_3);
                    break;
                default:
                    break;
            }
        }
        return conflictRegion;
    }

    private ConflictRegion originalLinesLayer(ConflictRegion conflictRegion, String repositoryPath) throws IOException, NotGitRepositoryException, DiffException {
        String conflictFilePath = conflictRegion.getConflict().getConflictFilePath();
        String parent1FilePath = conflictRegion.getConflict().getParent1FilePath();
        String parent2FilePath = conflictRegion.getConflict().getParent2FilePath();
        if (conflictRegion.getBeginLine() + 1 == conflictRegion.getSeparatorLine()) {
            conflictRegion.setOriginalV1FirstLine(0);
        } else {
            String parent1Commit = conflictRegion.getConflict().getMerge().getParents().get(0).getCommitHash();
            int conflictV1Line = conflictRegion.getBeginLine() + 1;
            int originalV1FirstLine;
            try {
                originalV1FirstLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, parent1Commit, "", parent1FilePath, conflictFilePath, false, conflictV1Line);
            } catch (IOException ex) {
                throw new IOException(ex);
            }
            conflictRegion.setOriginalV1FirstLine(originalV1FirstLine);
        }
        if (conflictRegion.getOriginalV1FirstLine() < 0) {
            conflictRegion.setOriginalV1FirstLine(-1);
            conflictRegion.setOriginalV2FirstLine(-1);
        } else if (conflictRegion.getSeparatorLine() + 1 == conflictRegion.getEndLine()) {
            conflictRegion.setOriginalV2FirstLine(0);
        } else {
            String parent2Commit = conflictRegion.getConflict().getMerge().getParents().get(1).getCommitHash();
            int conflictV2Line = conflictRegion.getSeparatorLine() + 1;
            int originalV2FirstLine;
            try {
                originalV2FirstLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, parent2Commit, "", parent2FilePath, conflictFilePath, false, conflictV2Line);
            } catch (IOException ex) {
                throw new IOException(ex);
            }
            if (originalV2FirstLine < 0) {
                conflictRegion.setOriginalV1FirstLine(-1);
                conflictRegion.setOriginalV2FirstLine(-1);
            } else {
                conflictRegion.setOriginalV2FirstLine(originalV2FirstLine);
            }
        }

        return conflictRegion;

    }

    private Conflict outsideAlterationsLayer(Conflict conflict, String repositoryPath, List<IntegerInterval> contextIntervals) throws IOException, NotGitRepositoryException, DiffException {
        List<LineInformation> allLines;
        if (solutionFileWasRenamed) {
            allLines = Git.diff(repositoryPath,
                    conflict.getMerge().getMerge().getCommitHash() + ":" + conflict.getParent2FilePath(),
                    conflict.getConflictFilePath(), true, 0).get(0).getLines();
        } else {
            allLines = Git.diff(repositoryPath,
                    conflict.getMerge().getMerge().getCommitHash() + ":" + conflict.getParent1FilePath(),
                    conflict.getConflictFilePath(), true, 0).get(0).getLines();
        }
        List<LineInformation> outsideAlterations = new ArrayList<>();
        boolean isOutsideAlteration = true;
        for (LineInformation line : allLines) {
            isOutsideAlteration = true;
            for (IntegerInterval contextInterval : contextIntervals) {
                if (contextInterval.begin <= line.getLineNumber() && contextInterval.end >= line.getLineNumber()) {
                    isOutsideAlteration = false;
                    break;
                }
            }
            if (isOutsideAlteration) {
                outsideAlterations.add(line);
            }
        }
        if (outsideAlterations.isEmpty()) {
            conflict.setHasOutsideAlterations(false);
            conflict.setHasOutsideAlterationsIgnoringFormatting(false);
            return conflict;
        } else {
            conflict.setHasOutsideAlterations(true);
            List<String> addeds = new ArrayList<>();
            List<String> removeds = new ArrayList<>();
            for (LineInformation line : outsideAlterations) {
                if (!line.getContent().replaceAll(" ", "").replaceAll("\t", "").equals("")) {
                    if (line.getType() == LineType.ADDED) {
                        addeds.add(line.getContent().replaceAll(" ", "").replaceAll("\t", ""));
                    } else {
                        removeds.add(line.getContent().replaceAll(" ", "").replaceAll("\t", ""));
                    }
                }
            }
            if (addeds.size() != removeds.size()) {
                conflict.setHasOutsideAlterationsIgnoringFormatting(true);
            } else {
                for (int i = 0; i < addeds.size(); i++) {
                    if (!addeds.get(i).equals(removeds.get(i))) {
                        conflict.setHasOutsideAlterationsIgnoringFormatting(true);
                        return conflict;
                    }

                }
                conflict.setHasOutsideAlterationsIgnoringFormatting(false);
            }
            return conflict;
        }
    }

    private Conflict antlr4Layer(Conflict conflict, String repositoryPath) throws IOException, OutOfMemoryError, NotGitRepositoryException, ShowException {
        if (conflict.getConflictRegions().get(0).getOriginalV1FirstLine() < 0) {
            for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                conflictRegion.setStructures("Untreatable git's error");
                conflictRegion.setStructures("Untreatable git's error");
            }
        } else {
            String parent1FilePath = conflict.getParent1FilePath();
            ANTLR4Results rawParent1Results = ANTLR4Tools.getANTLR4Results(parent1FilePath, conflict.getMerge().getParents().get(0).getCommitHash(), repositoryPath);
            if (rawParent1Results == null) {
                for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                    conflictRegion.setStructures(conflict.getParent1FilePath() + " has an extension not parseable!");
                    conflictRegion.setOutmostedStructures(conflict.getParent1FilePath() + " has an extension not parseable!");
                }
                return conflict;
            } else {
                String parent2FilePath = conflict.getParent2FilePath();
                ANTLR4Results rawParent2Results = ANTLR4Tools.getANTLR4Results(parent2FilePath, conflict.getMerge().getParents().get(1).getCommitHash(), repositoryPath);
                if (rawParent2Results == null) {
                    for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                        conflictRegion.setStructures(conflict.getParent2FilePath() + " has an extension not parseable!");
                        conflictRegion.setOutmostedStructures(conflict.getParent2FilePath() + " has an extension not parseable!");
                    }
                    return conflict;
                } else {
                    ANTLR4Results parent1Results = null;
                    List<String> v1Structures;
                    List<String> v1OutmostedStructures;
                    ANTLR4Results parent2Results = null;
                    List<String> v2Structures;
                    List<String> v2OutmostedStructures;
                    String rawString = "";
                    String outmostedRawString = "";
                    for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                        v1Structures = new ArrayList<>();
                        v1OutmostedStructures = new ArrayList<>();
                        v2Structures = new ArrayList<>();
                        v2OutmostedStructures = new ArrayList<>();
                        if (conflictRegion.getOriginalV1FirstLine() == 0) {
                            v1Structures.add("Blank");
                            v1OutmostedStructures.add("Blank");
                        } else {
                            parent1Results = ANTLR4Tools.filterAndGetOutmost(rawParent1Results, conflictRegion.getOriginalV1FirstLine(), conflictRegion.getOriginalV1FinalLine());
                            rawString = rawString + "\n" + parent1Results.getStringAll();
                            outmostedRawString = outmostedRawString + "\n" + parent1Results.getStringAllOutmosted();
                            v1Structures = ANTLR4Tools.getTranslatedStrucutures(parent1Results.getAll(), parent1FilePath, isEmpty(conflictRegion, true));
                            v1OutmostedStructures = ANTLR4Tools.getTranslatedStrucutures(parent1Results.getAllOutmosted(), parent1FilePath, isEmpty(conflictRegion, true));
                        }
                        if (conflictRegion.getOriginalV2FirstLine() == 0) {
                            v2Structures.add("Blank");
                            v2OutmostedStructures.add("Blank");
                        } else {
                            parent2Results = ANTLR4Tools.filterAndGetOutmost(rawParent2Results, conflictRegion.getOriginalV2FirstLine(), conflictRegion.getOriginalV2FinalLine());
                            rawString = rawString + "\n" + parent2Results.getStringAll();
                            outmostedRawString = outmostedRawString + "\n" + parent2Results.getStringAllOutmosted();
                            v2Structures = ANTLR4Tools.getTranslatedStrucutures(parent2Results.getAll(), parent2FilePath, isEmpty(conflictRegion, false));
                            v2OutmostedStructures = ANTLR4Tools.getTranslatedStrucutures(parent2Results.getAllOutmosted(), parent2FilePath, isEmpty(conflictRegion, false));
                        }
                        for (String str : v2Structures) {
                            if (!v1Structures.contains(str)) {
                                v1Structures.add(str);
                            }
                        }
                        for (String str : v2OutmostedStructures) {
                            if (!v1OutmostedStructures.contains(str)) {
                                v1OutmostedStructures.add(str);
                            }
                        }
                        Collections.sort(v1Structures);
                        Collections.sort(v1OutmostedStructures);
                        conflictRegion.setStructures(ListUtils.getTextListStringToString(v1Structures) + "\n\n" + rawString);
                        conflictRegion.setOutmostedStructures(ListUtils.getTextListStringToString(v1OutmostedStructures) + "\n\n" + outmostedRawString);
                    }
                }
            }
        }
        return conflict;
    }

    private class IntegerInterval {

        int begin;
        int end;

        public IntegerInterval(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

    }

    private boolean isEmpty(ConflictRegion conflictRegion, boolean v1) {
        if (v1) {
            return conflictRegion.getV1Text().replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", "").equals("");
        } else {
            return conflictRegion.getV2Text().replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", "").equals("");
        }
    }

    private int numberOfMarkers(List<String> solutionTextWithoutContext) {
        int result = 0;
        boolean begin = false;
        boolean separator = false;
        boolean end = false;
        for (String line : solutionTextWithoutContext) {
            if (!begin && MergeNatureTools.checkIfIsBegin(line)) {
                begin = true;
            } else if (!separator && MergeNatureTools.checkIfIsSeparator(line)) {
                separator = true;
            } else if (!end && MergeNatureTools.checkIfIsEnd(line)) {
                end = true;
            }
            if (begin && separator && end) {
                return 3;
            }
        }
        if (begin) {
            result += 1;
        }
        if (separator) {
            result += 1;
        }
        if (end) {
            result += 1;
        }
        return result;
    }

}
