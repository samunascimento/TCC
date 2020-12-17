package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ReturnNewLineNumber;
import br.ufjf.dcc.gmr.core.exception.EmptyOutput;
import br.ufjf.dcc.gmr.core.exception.ImpossibleLineNumber;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.PathDontExist;
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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The main algorithm of merge nature, its function is catch all merges, all
 * conflict files and all conflict regions, besides catalog all regions with
 * ANTLR4
 *
 * @author João Pedro Lima
 * @since 14-10-2020
 */
public class MergeNatureAlgorithm {

    String repositoryLocation;
    int contextLines;
    Project project;

    public MergeNatureAlgorithm(String repositoryLocation, int contextLines) {
        this.repositoryLocation = repositoryLocation;
        this.contextLines = contextLines;
        this.project = null;
    }

    public void startAlgorithm() {
        try {
            this.project = projectLayer();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Project getProject() {
        return project;
    }
    
    private Project projectLayer() throws IOException {

        Project project = new Project();
        String[] auxStringArray;
        String repositoryPath = "";

        if (MergeNatureTools.isDirectory(repositoryLocation)) {
            repositoryPath = this.repositoryLocation;
            auxStringArray = this.repositoryLocation.split(File.separator);
            project.setName(auxStringArray[auxStringArray.length - 1]);
            project.setUrl(MergeNatureTools.getULROfProjectFromConfig(repositoryLocation));
            if (project.getUrl().equals("Unknow")) {
                project.setOrganization("Unknow");
            } else {
                auxStringArray = project.getUrl().split("/");
                project.setOrganization(auxStringArray[auxStringArray.length - 2]);
            }
        } else {
            System.out.println("Downloading analysis is not avaliable!");
        }
        MergeNatureTools.prepareAnalysis(repositoryPath);
        List<String> log = Git.giveAllMerges(repositoryPath);
        System.out.println(log.size());
        int i = 0;
        for (String logLine : Git.giveAllMerges(repositoryPath)) {
            project.addMerge(mergeLayer(project, logLine, repositoryPath));
            System.out.println(++i);
        }

        return project;

    }

    private Merge mergeLayer(Project project, String logLine, String repositoryPath) throws IOException {

        Merge merge = new Merge();
        String[] auxStringArray;
        List<String> mergeMessage;
        String auxString;

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
        auxString = Git.mergeBaseCommand(repositoryPath, auxStringArray);
        if ("No ancestor".equals(auxString)) {
            merge.setAncestor(Commit.NO_EXIST);
        } else {
            merge.setAncestor(new Commit(auxString, repositoryPath));
        }
        merge.setAncestor(new Commit(Git.mergeBaseCommand(repositoryPath, auxStringArray), repositoryPath));
        if (merge.getMergeType() != MergeType.OCTOPUS_MERGE) {
            Git.checkout(merge.getParents().get(0).getCommitHash(), repositoryPath);
            mergeMessage = Git.merge(merge.getParents().get(1).getCommitHash(), repositoryPath);
            if (mergeMessage.contains("Automatic merge failed; fix conflicts and then commit the result.")) {
                merge.setMergeType(MergeType.CONFLICTED_MERGE);
                for (String conflictMessage : mergeMessage) {
                    if (conflictMessage.contains("CONFLICT")) {
                        merge.addConflicts(conflictLayer(merge, conflictMessage, repositoryPath));
                    }
                }
                Git.reset(repositoryPath, true, false, false, null);
            } else {
                merge.setMergeType(MergeType.NOT_CONFLICTED_MERGE);
            }
        }

        return merge;

    }

    private Conflict conflictLayer(Merge merge, String conflictMessage, String repositoryPath) throws IOException {

        Conflict conflict = MergeMessageReader.getConflictFromMessage(conflictMessage);

        conflict.setMerge(merge);

        if (conflict.getConflictType() == ConflictType.CONTENT
                || conflict.getConflictType() == ConflictType.COINCIDENCE_ADDING
                || conflict.getConflictType() == ConflictType.FILE_RENAME) {
            conflict.setConflictRegions(conflictRegionsLayer(conflict, MergeNatureTools.getFileContent(repositoryPath + conflict.getParent1FilePath()), repositoryPath));
        }
        if (!conflict.getConflictRegions().isEmpty()) {
            conflict = antlr4Layer(conflict, repositoryPath);
        }

        return conflict;
    }

    private List<ConflictRegion> conflictRegionsLayer(Conflict conflict, List<String> fileContent, String repositoryPath) throws IOException {
        List<ConflictRegion> conflictRegions = new ArrayList<>();
        ConflictRegion conflictRegion;
        String auxString = "";
        for (int i = 0; i < fileContent.size(); i++) {
            if (MergeNatureTools.checkIfIsBegin(fileContent.get(i))) {
                conflictRegion = new ConflictRegion();
                conflictRegion.setConflict(conflict);
                for (int j = i - contextLines; j != i; j++) {
                    if (j > -1) {
                        auxString = auxString + "\n" + fileContent.get(j);
                    } else if (j == -1) {
                        auxString = auxString + "\n<SOF>";
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
                conflictRegion.setV2Text(auxString.replaceFirst("\n", ""));
                auxString = "";
                conflictRegion.setEndLine(i + 1);
                i++;
                for (int j = i; j < i + contextLines; j++) {
                    if (j < fileContent.size()) {
                        auxString = auxString + "\n" + fileContent.get(j);
                    } else {
                        auxString = auxString + "\n<EOF>";
                        i = j;
                        break;
                    }
                }
                conflictRegion.setAfterContext(auxString.replaceFirst("\n", ""));
                conflictRegion.setRawConflict(ListUtils.getTextListStringToString(ListUtils.getSubList(fileContent, conflictRegion.getBeginLine() - conflictRegion.getBeforeContextSize() - 1, conflictRegion.getEndLine() + conflictRegion.getAfterContextSize() - 1)));
                conflictRegion = solutionLayer(conflictRegion, repositoryPath);
                conflictRegion = originalLinesLayer(conflictRegion, repositoryPath);
                conflictRegions.add(conflictRegion);
            }
        }
        return conflictRegions;
    }

    private ConflictRegion solutionLayer(ConflictRegion conflictRegion, String repositoryPath) throws IOException {
        if (conflictRegion.getBeforeContext().endsWith("<SOF>") || conflictRegion.getAfterContext().startsWith("<EOF>")) {
            conflictRegion.setSolutionText("The context is not a line, the solution cannot be obtained accurately");
            conflictRegion.setDeveloperDecision(DeveloperDecision.IMPRECISE);
        } else {
            String mergeCommit = conflictRegion.getConflict().getMerge().getMerge().getCommitHash();
            String parentFilePath = conflictRegion.getConflict().getParent1FilePath();
            int solutionFirstLine;
            int solutionFinalLine;
            try {
                solutionFirstLine = ReturnNewLineNumber.initReturnNewLineNumberAdapted(repositoryPath, mergeCommit, parentFilePath, conflictRegion.getBeginLine() - 1);
                solutionFinalLine = ReturnNewLineNumber.initReturnNewLineNumberAdapted(repositoryPath, mergeCommit, parentFilePath, conflictRegion.getEndLine() + 1);
                if (solutionFirstLine == ReturnNewLineNumber.REMOVED_FILE || solutionFinalLine == ReturnNewLineNumber.REMOVED_FILE) {
                    parentFilePath = conflictRegion.getConflict().getParent2FilePath();
                    solutionFirstLine = ReturnNewLineNumber.initReturnNewLineNumberAdapted(repositoryPath, mergeCommit, parentFilePath, conflictRegion.getBeginLine() - 1);
                    solutionFinalLine = ReturnNewLineNumber.initReturnNewLineNumberAdapted(repositoryPath, mergeCommit, parentFilePath, conflictRegion.getEndLine() + 1);
                    if (solutionFirstLine == ReturnNewLineNumber.REMOVED_FILE || solutionFinalLine == ReturnNewLineNumber.REMOVED_FILE) {
                        conflictRegion.setSolutionText("The solution to the conflict was to delete the file.");
                        conflictRegion.setDeveloperDecision(DeveloperDecision.FILE_DELETED);
                        return conflictRegion;
                    }
                }
                if (solutionFirstLine == ReturnNewLineNumber.REMOVED_LINE || solutionFinalLine == ReturnNewLineNumber.REMOVED_LINE) {
                    conflictRegion.setSolutionText("The context was altered, so the solution cannot be obtained accurately");
                    conflictRegion.setDeveloperDecision(DeveloperDecision.IMPRECISE);
                } else if (solutionFirstLine == ReturnNewLineNumber.POSTPONED || solutionFinalLine == ReturnNewLineNumber.POSTPONED) {
                    conflictRegion.setSolutionText("(The developer postponed/ignored the conflict, so the solution is the conflict)\n\n\n" + conflictRegion.getRawConflict());
                    conflictRegion.setDeveloperDecision(DeveloperDecision.POSTPONED);
                } else {
                    if (solutionFirstLine <= 0 || solutionFinalLine <= 0) {
                        conflictRegion.setSolutionText("DIFF PROBLEM!");
                        conflictRegion.setDeveloperDecision(DeveloperDecision.DIFF_PROBLEM);
                    } else {
                        conflictRegion.setSolutionText(ListUtils.getTextListStringToString(ListUtils.getSubList(Git.getFileContentFromCommit(mergeCommit, parentFilePath.replaceFirst(repositoryPath, ""), repositoryPath), solutionFirstLine + 1, solutionFinalLine - 1)));
                        conflictRegion = developerDecisionLayer(conflictRegion);
                    }
                }
            } catch (IOException | LocalRepositoryNotAGitRepository | InvalidCommitHash | PathDontExist | EmptyOutput | ImpossibleLineNumber ex) {
                throw new IOException(ex);
            }
        }
        return conflictRegion;
    }

    private ConflictRegion developerDecisionLayer(ConflictRegion conflictRegion) {
        String solution = conflictRegion.getSolutionText().replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", "");
        String v1 = conflictRegion.getV1Text().replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", "");
        String v2 = conflictRegion.getV2Text().replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", "");

        if (solution.equals("")) {
            conflictRegion.setDeveloperDecision(DeveloperDecision.NONE);
        } else if (solution.equals(v1.concat(v2)) || solution.equals(v2.concat(v1))) {
            conflictRegion.setDeveloperDecision(DeveloperDecision.CONCATENATION);
        } else if (solution.equals(v1)) {
            conflictRegion.setDeveloperDecision(DeveloperDecision.VERSION1);
        } else if (solution.equals(v2)) {
            conflictRegion.setDeveloperDecision(DeveloperDecision.VERSION2);
        } else {
            solution = conflictRegion.getSolutionText().replaceAll(" ", "").replaceAll("\t", "");
            for (String solutionLine : solution.split("\n")) {
                if (!(v1.contains(solutionLine) || v2.contains(solutionLine))) {
                    conflictRegion.setDeveloperDecision(DeveloperDecision.NEWCODE);
                    return conflictRegion;
                }
            }
            conflictRegion.setDeveloperDecision(DeveloperDecision.COMBINATION);
        }
        return conflictRegion;
    }

    private ConflictRegion originalLinesLayer(ConflictRegion conflictRegion, String repositoryPath) throws IOException {

        if (conflictRegion.getBeginLine() + 1 == conflictRegion.getSeparatorLine()) {
            conflictRegion.setOriginalV1FirstLine(0);
        } else {
            String parent1Commit = conflictRegion.getConflict().getMerge().getParents().get(0).getCommitHash();
            String parent1FilePath = conflictRegion.getConflict().getParent1FilePath();
            int conflictV1Line = conflictRegion.getBeginLine() + 1;
            int originalV1FirstLine;
            try {
                originalV1FirstLine = ReturnNewLineNumber.initReturnNewLineNumberAdapted(repositoryPath, parent1Commit, parent1FilePath, conflictV1Line);
            } catch (IOException | LocalRepositoryNotAGitRepository | InvalidCommitHash | PathDontExist | EmptyOutput | ImpossibleLineNumber ex) {
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
            String parent2FilePath = conflictRegion.getConflict().getParent2FilePath();
            int conflictV2Line = conflictRegion.getSeparatorLine() + 1;
            int originalV2FirstLine;
            try {
                originalV2FirstLine = ReturnNewLineNumber.initReturnNewLineNumberAdapted(repositoryPath, parent2Commit, parent2FilePath, conflictV2Line);
            } catch (IOException | LocalRepositoryNotAGitRepository | InvalidCommitHash | PathDontExist | EmptyOutput | ImpossibleLineNumber ex) {
                throw new IOException(ex);
            }
            if (conflictRegion.getOriginalV2FirstLine() < 0) {
                conflictRegion.setOriginalV1FirstLine(-1);
                conflictRegion.setOriginalV2FirstLine(-1);
            } else {
                conflictRegion.setOriginalV2FirstLine(originalV2FirstLine);
            }
        }

        return conflictRegion;

    }

    private Conflict antlr4Layer(Conflict conflict, String repositoryPath) throws IOException {
        String parent1FilePath = conflict.getParent1FilePath();
        ANTLR4Results parent1Results = ANTLR4Tools.getANTLR4Results(parent1FilePath, conflict.getMerge().getParents().get(0).getCommitHash(), repositoryPath);
        if (parent1Results == null) {
            for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                conflictRegion.setStructures(conflict.getParent1FilePath() + " has an extension not parseable!");
                conflictRegion.setOutmostedStructures(conflict.getParent1FilePath() + " has an extension not parseable!");
            }
            return conflict;
        } else {
            String parent2FilePath = conflict.getParent2FilePath();
            ANTLR4Results parent2Results = ANTLR4Tools.getANTLR4Results(parent2FilePath, conflict.getMerge().getParents().get(1).getCommitHash(), repositoryPath);
            if (parent2Results == null) {
                for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                    conflictRegion.setStructures(conflict.getParent2FilePath() + " has an extension not parseable!");
                    conflictRegion.setOutmostedStructures(conflict.getParent2FilePath() + " has an extension not parseable!");
                }
                return conflict;
            } else {
                List<String> v1Structures;
                List<String> v1OutmostedStructures;
                List<String> v2Structures;
                List<String> v2OutmostedStructures;
                for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                    if (conflictRegion.getOriginalV1FirstLine() < 0 || conflictRegion.getOriginalV2FirstLine() < 0) {
                        conflictRegion.setStructures("DIFF PROBLEM!");
                        conflictRegion.setOutmostedStructures("DIFF PROBLEM!");
                    } else {
                        v1Structures = new ArrayList<>();
                        v1OutmostedStructures = new ArrayList<>();
                        v2Structures = new ArrayList<>();
                        v2OutmostedStructures = new ArrayList<>();
                        if (conflictRegion.getOriginalV1FirstLine() == 0) {
                            v1Structures.add("Blank");
                            v1OutmostedStructures.add("Blank");
                        } else {
                            parent1Results = ANTLR4Tools.fillOutmost(parent1Results, conflictRegion.getOriginalV1FirstLine(), conflictRegion.getOriginalV1FinalLine());
                            v1Structures = ANTLR4Tools.getTranslatedStrucutures(parent1Results.getAll(), parent1FilePath);
                            v1OutmostedStructures = ANTLR4Tools.getTranslatedStrucutures(parent1Results.getAllOutmosted(), parent1FilePath);
                        }
                        if (conflictRegion.getOriginalV2FirstLine() == 0) {
                            v2Structures.add("Blank");
                            v2OutmostedStructures.add("Blank");
                        } else {
                            parent2Results = ANTLR4Tools.fillOutmost(parent2Results, conflictRegion.getOriginalV2FirstLine(), conflictRegion.getOriginalV2FinalLine());
                            v2Structures = ANTLR4Tools.getTranslatedStrucutures(parent2Results.getAll(), parent2FilePath);
                            v2OutmostedStructures = ANTLR4Tools.getTranslatedStrucutures(parent2Results.getAllOutmosted(), parent2FilePath);
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
                        conflictRegion.setStructures(ListUtils.getTextListStringToString(v1Structures));
                        conflictRegion.setStructures(ListUtils.getTextListStringToString(v1OutmostedStructures));
                    }
                }
            }
        }
        return conflict;
    }
}
