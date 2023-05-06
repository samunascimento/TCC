package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.exception.DiffException;
import br.ufjf.dcc.gmr.core.exception.GitException;
import br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException;
import br.ufjf.dcc.gmr.core.exception.ShowException;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.model.*;
import br.ufjf.dcc.gmr.core.mergenature.dao.*;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LanguageConstructs;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import br.ufjf.dcc.gmr.core.vcs.types.LineType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import java.util.Collections;
import javax.swing.JProgressBar;

public class Algorithm {

    private final String CODE_VERSION = "1.0.0";
    private final String DOWNLOAD_NAME = ".MergeNatureDownload";
    private Connection sqlConnection;
    private int ctxLines = 3;
    private boolean devMode = false;
    private JProgressBar progressBar;

    private boolean solutionFileWasRenamed;

    private List<IntegerInterval> contextIntervals;

    public Algorithm() {

    }

    public Connection getSqlConnection() {
        return sqlConnection;
    }

    public void setSqlConnection(Connection sqlConnection) {
        this.sqlConnection = sqlConnection;
    }

    public int getCtxLines() {
        return ctxLines;
    }

    public void setCtxLines(int ctxLines) {
        this.ctxLines = ctxLines;
    }

    public boolean isDevMode() {
        return devMode;
    }

    public void setDevMode(boolean devMode) {
        this.devMode = devMode;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public Project run(String repositoryURL, String downloadPath) throws IOException, GitException, SQLException {
        String repositoryPath = null;
        try {
            Project project = null;
            if (repositoryURL == null) {
                throw new IOException("[FATAL]: repositoryURL is null!");
            } else if (downloadPath == null) {
                throw new IOException("[FATAL]: downloadPath is null!");
            } else {
                downloadPath = pathTreatment(downloadPath);
                repositoryPath = downloadPath + DOWNLOAD_NAME + "/";
                if (repositoryURL.endsWith(".git")) {
                    repositoryURL = repositoryURL.replaceAll("\\.git", "");
                }
                FileUtils.deleteDirectory(new File(repositoryPath));
                Git.clone(downloadPath, repositoryURL, DOWNLOAD_NAME);
                project = projectLayer(repositoryPath, repositoryURL);
                FileUtils.deleteDirectory(new File(repositoryPath));
            }
            return project;
        } catch (Exception ex) {
            if (repositoryPath != null) {
                FileUtils.deleteDirectory(new File(repositoryPath));
            }
            throw ex;
        }
    }

    public Project run(String repositoryPath) throws IOException, GitException, SQLException {
        if (repositoryPath == null) {
            throw new IOException("[FATAL]: repositoryPath is null!");
        } else if (!repositoryPath.endsWith("/")) {
            repositoryPath = pathTreatment(repositoryPath);
            repositoryPath = repositoryPath.concat("/");
        }
        return projectLayer(repositoryPath, null);
    }

    private Project projectLayer(String repositoryPath, String repositoryURL) throws IOException, GitException, SQLException {
        Project project = getProjectData(repositoryPath, repositoryURL);
        Merge merge;
        int analysisID = getAnalysisID(project);
        List<String> log;
        log = Git.getAllMerges(repositoryPath);

        int numberOfMerges = log.size();
        int status = 0;
        if (this.progressBar != null) {
            this.progressBar.setMinimum(1);
            progressBar.setIndeterminate(false);
            this.progressBar.setMaximum(numberOfMerges);
        }
        System.out.println("[" + project.getName() + "] " + status + "/" + numberOfMerges + " merges processed...");
        for (String logLine : log) {
            try {
                merge = mergeLayer(repositoryPath, project, logLine, analysisID);
                project.addMerge(merge);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if (this.progressBar != null) {
                this.progressBar.setValue(++status);
                System.out.println("[" + project.getName() + "] " + status + "/" + numberOfMerges + " merges processed... " + logLine);
            } else {
                System.out.println("[" + project.getName() + "] " + ++status + "/" + numberOfMerges + " merges processed... " + logLine);
            }
        }

        if (sqlConnection != null) {
            AnalysisDAO.updateCompleted(sqlConnection, analysisID, true);
        }

        return project;
    }

    private Merge mergeLayer(String repositoryPath, Project project, String logLine, int analysisID) throws SQLException, IOException, GitException {
        Merge merge = getMergeData(repositoryPath, project, logLine, analysisID);
        ConflictFile conflictFile;
        if (sqlConnection == null || !Merge_AnalysisDAO.selectCompleted(sqlConnection, merge.getId(), analysisID)) {
            List<String> mergeMessage = getMergeMessage(repositoryPath, merge);
            merge.setMergeType(getMergeType(mergeMessage, (merge.getMergeCommit() == null)));
            merge.setId(insertMergeInDatabase(merge, project, analysisID));
            if (merge.getMergeType() == MergeType.CONFLICTED_MERGE || merge.getMergeType() == MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES) {
                if (sqlConnection != null) {
                    List<Integer> conflictFileIDs = Merge_ConflictFile_AnalysisDAO.selectConflictFiles(sqlConnection, merge.getId(), analysisID);
                    int conflictIndex = 0;
                    for (String conflictMessage : mergeMessage) {
                        if (conflictMessage.contains("CONFLICT")) {
                            try {
                                conflictFile = conflictFileLayer(repositoryPath, merge, conflictMessage,
                                        analysisID, (conflictIndex < conflictFileIDs.size() ? conflictFileIDs.get(conflictIndex) : 0));
                                merge.addConflictFile(conflictFile);
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                            conflictIndex += 1;
                        }
                    }
                } else {
                    for (String conflictMessage : mergeMessage) {
                        if (conflictMessage.contains("CONFLICT")) {
                            try {
                                conflictFile = conflictFileLayer(repositoryPath, merge, conflictMessage,
                                        analysisID, 0);
                                merge.addConflictFile(conflictFile);
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        List<FileDiff> fileDiffs = Git.diff(repositoryPath, "", merge.getMergeCommit().getHash(), false, 0);
        FileOA fileOA;
        boolean hasConflict = false;
        for (FileDiff fileDiff : fileDiffs) {
            hasConflict = false;
            for (ConflictFile conflictFile1 : merge.getConflictFiles()) {
                if (conflictFile1.getConflictFilePath().equals(fileDiff.getFilePathTarget().replaceFirst("/", "")) && !conflictFile1.getChunks().isEmpty()) {
                    hasConflict = true;
                    break;
                }
            }
            if (!hasConflict) {
                fileOA = new FileOA();
                fileOA.setFilePath(fileDiff.getFilePathTarget().replaceFirst("/", ""));
                for (LineInformation line : fileDiff.getLines()) {
                    fileOA.addAlteration(new Alteration(line.getContent(), line.getType() == LineType.ADDED, false));
                }
                merge.addFileOA(fileOA);
            }
        }
        if (sqlConnection != null) {
            Merge_AnalysisDAO.update(sqlConnection, merge.getId(), analysisID, merge.hasOutOfMemory(), true);
        }
        return merge;
    }

    private ConflictFile conflictFileLayer(String repositoryPath, Merge merge, String conflictMessage, int analysisID, int conflictFileID) throws IOException, SQLException, GitException {
        ConflictFile conflictFile;
        List<Chunk> chunks;
        if (sqlConnection != null && conflictFileID > 0) {
            if (Merge_ConflictFile_AnalysisDAO.select(sqlConnection, merge.getId(), conflictFileID, analysisID)) {
                return ConflictFileDAO.select(sqlConnection, conflictFileID, analysisID);
            } else {
                conflictFile = ConflictFileDAO.select(sqlConnection, conflictFileID, analysisID);
            }
        } else {
            conflictFile = MergeMessageReader.getConflictFileFromMessage(conflictMessage);
        }
        conflictFile.setMerge(merge);
        conflictFile.setOutOfMemory(false);
        if (conflictFile.getId() == 0) {
            if (conflictFile.getConflictFileType() == ConflictFileType.CONTENT
                    || conflictFile.getConflictFileType() == ConflictFileType.COINCIDENCE_ADDING
                    || conflictFile.getConflictFileType() == ConflictFileType.FILE_RENAME) {
                contextIntervals = new ArrayList<>();
                try {
                    chunks = chunkLayer(conflictFile, MergeNatureTools.getFileContentInList(repositoryPath + conflictFile.getParent1FilePath()), repositoryPath);
                    conflictFile.setChunks(chunks);
                } catch (OutOfMemoryError ex) {
                    System.out.println("OutOfMemoryError getting chunks");
                    conflictFile.setOutOfMemory(true);
                    return conflictFile;
                } catch (Exception ex) {
                    ex.printStackTrace();
                    return conflictFile;
                }
                if (contextIntervals != null && !conflictFile.getChunks().isEmpty()) {
                    conflictFile = outsideAlterationsLayer(conflictFile, repositoryPath, contextIntervals);
                } else if (contextIntervals == null) {
                    conflictFile.getMerge().addFileOA(new FileOA(conflictFile.getConflictFilePath(), null, conflictFile));
                    conflictFile.setHasOutsideAlterations(HasOutsideAlterations.YES);
                } else {
                    conflictFile.setHasOutsideAlterations(HasOutsideAlterations.YES);
                }
                addUncopletedConflictFile(conflictFile, analysisID);
            }
        }
        if (!conflictFile.getChunks().isEmpty()) {
            try {
                conflictFile = antlr4Layer(conflictFile, repositoryPath);
            } catch (OutOfMemoryError ex) {
                System.out.println("OutOfMemoryError get language contructs");
                conflictFile.setAllLanguageConstructs(LanguageConstructs.OUT_OF_MEMORY);
                conflictFile.setOutOfMemory(true);
                return conflictFile;
            } catch (Exception ex) {
                ex.printStackTrace();
                conflictFile.setAllLanguageConstructs(LanguageConstructs.ERROR);
                return conflictFile;
            }
            updateChunksInDatabase(conflictFile, analysisID);
        }
        return conflictFile;
    }

    private List<Chunk> chunkLayer(ConflictFile conflictFile, List<String> fileContent, String repositoryPath) throws IOException, GitException {
        List<Chunk> chunks = new ArrayList<>();
        String[] auxArray;
        Chunk chunk;
        boolean eof;
        boolean bof;
        for (int i = 0; i < fileContent.size(); i++) {
            if (MergeNatureTools.checkIfIsBegin(fileContent.get(i))) {
                chunk = new Chunk();
                chunk.setConflictFile(conflictFile);
                bof = i - ctxLines < 0;
                chunk.setFirstPrefixLine(bof ? 1 : i - ctxLines + 1);
                if (conflictFile.getConflictFileType() == ConflictFileType.CONTENT && fileContent.get(i).contains(":")) {
                    auxArray = fileContent.get(i).split(":");
                    if (!auxArray[auxArray.length - 1].equals(conflictFile.getParent1FilePath())
                            && Git.fileExistInCommit(conflictFile.getMerge().getParents().get(0).getHash(), auxArray[auxArray.length - 1], repositoryPath)) {
                        conflictFile.setParent1FilePath(auxArray[auxArray.length - 1]);
                        conflictFile.setConflictFilePath(ConflictFile.PARENT2_FILE);
                        conflictFile.setConflictFileType(ConflictFileType.CONTENT_WITH_UNILATERAL_RENAMNING);
                    }
                }
                chunk.setBeginLine(i + 1);
                i++;
                while (!MergeNatureTools.checkIfIsSeparator(fileContent.get(i))) {
                    i++;
                }
                chunk.setSeparatorLine(i + 1);
                i++;
                while (!MergeNatureTools.checkIfIsEnd(fileContent.get(i))) {
                    i++;
                }
                if (conflictFile.getConflictFileType() == ConflictFileType.CONTENT && fileContent.get(i).contains(":")) {
                    auxArray = fileContent.get(i).split(":");
                    if (!auxArray[auxArray.length - 1].equals(conflictFile.getParent2FilePath())
                            && Git.fileExistInCommit(conflictFile.getMerge().getParents().get(1).getHash(), auxArray[auxArray.length - 1], repositoryPath)) {
                        conflictFile.setParent2FilePath(auxArray[auxArray.length - 1]);
                        conflictFile.setConflictFilePath(ConflictFile.PARENT1_FILE);
                        conflictFile.setConflictFileType(ConflictFileType.CONTENT_WITH_UNILATERAL_RENAMNING);
                    }
                }
                chunk.setEndLine(i + 1);
                i++;
                eof = i + ctxLines >= fileContent.size();
                chunk.setLastSuffixLine(i + ctxLines >= fileContent.size() ? fileContent.size() : i + ctxLines);
                chunk.setChunkText(
                        (bof ? "<BOF>\n" : "")
                        + ListUtils.getTextListStringToString(
                                ListUtils.getSubList(
                                        fileContent,
                                        chunk.getFirstPrefixIndex(),
                                        chunk.getLastSuffixIndex()))
                        + (eof ? "\n<EOF>" : "")
                );
                chunk = solutionLayer(chunk, repositoryPath);
                chunk = originalLinesLayer(chunk, repositoryPath);
                chunks.add(chunk);

            }
        }
        return chunks;
    }

    private Chunk solutionLayer(Chunk chunk, String repositoryPath) throws IOException, NotGitRepositoryException, DiffException, ShowException {
        String mergeCommit = chunk.getConflictFile().getMerge().getMergeCommit().getHash();
        String conflictFilePath = chunk.getConflictFile().getConflictFilePath();
        String parentFilePath = chunk.getConflictFile().getParent1FilePath();
        int solutionFirstLine = (chunk.getFirstPrefixLine() == chunk.getBeginLine() ? ReturnNewLineNumber.OUT_OF_BOUNDS : 0);
        int solutionFinalLine = (chunk.getLastSuffixLine() == chunk.getEndLine() ? ReturnNewLineNumber.OUT_OF_BOUNDS : 0);
        try {
            if (solutionFirstLine != ReturnNewLineNumber.OUT_OF_BOUNDS) {
                solutionFirstLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, mergeCommit, "", parentFilePath, conflictFilePath, false, chunk.getBeginLine() - 1);
            }
            if (solutionFinalLine != ReturnNewLineNumber.OUT_OF_BOUNDS) {
                solutionFinalLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, mergeCommit, "", parentFilePath, conflictFilePath, false, chunk.getEndLine() + 1);
            }
            if (solutionFirstLine == ReturnNewLineNumber.REMOVED_FILE || solutionFinalLine == ReturnNewLineNumber.REMOVED_FILE) {
                parentFilePath = chunk.getConflictFile().getParent2FilePath();
                if (solutionFirstLine != ReturnNewLineNumber.OUT_OF_BOUNDS) {
                    solutionFirstLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, mergeCommit, "", parentFilePath, conflictFilePath, false, chunk.getBeginLine() - 1);
                }
                if (solutionFinalLine != ReturnNewLineNumber.OUT_OF_BOUNDS) {
                    solutionFinalLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, mergeCommit, "", parentFilePath, conflictFilePath, false, chunk.getEndLine() + 1);
                }
                if (solutionFirstLine == ReturnNewLineNumber.REMOVED_FILE || solutionFinalLine == ReturnNewLineNumber.REMOVED_FILE) {
                    chunk.setSolutionText("The solution to the conflict was to delete the file.");
                    chunk.setDeveloperDecision(DeveloperDecision.FILE_DELETED);
                    contextIntervals = null;
                    return chunk;
                } else {
                    solutionFileWasRenamed = true;
                }
            } else {
                solutionFileWasRenamed = false;
            }
            if (solutionFirstLine == ReturnNewLineNumber.REMOVED_LINE || solutionFinalLine == ReturnNewLineNumber.REMOVED_LINE) {
                contextIntervals = null;
                chunk.setSolutionText("The context was altered, so the solution cannot be obtained accurately");
                chunk.setDeveloperDecision(DeveloperDecision.IMPRECISE);
            } else if (solutionFirstLine == ReturnNewLineNumber.POSTPONED || solutionFinalLine == ReturnNewLineNumber.POSTPONED) {
                contextIntervals.add(new IntegerInterval(chunk.getBeginLine() - 1, chunk.getEndLine() - 1));
                chunk.setSolutionText(chunk.getChunkText());
                chunk.setDeveloperDecision(DeveloperDecision.POSTPONED_3);
            } else {
                if ((solutionFirstLine <= 0 && solutionFirstLine != ReturnNewLineNumber.OUT_OF_BOUNDS)
                        || (solutionFinalLine <= 0 && solutionFinalLine != ReturnNewLineNumber.OUT_OF_BOUNDS)) {
                    contextIntervals = null;
                    chunk.setSolutionText("Diff Error!");
                    chunk.setDeveloperDecision(DeveloperDecision.DIFF_PROBLEM);
                } else {
                    if (contextIntervals != null) {
                        contextIntervals.add(new IntegerInterval(solutionFirstLine, solutionFinalLine));
                    }
                    List<String> solutionFileContent = Git.getFileContentFromCommit(mergeCommit, parentFilePath.replaceFirst(repositoryPath, ""), repositoryPath);
                    chunk.setSolutionText(
                            (solutionFirstLine == ReturnNewLineNumber.OUT_OF_BOUNDS ? "<BOF>\n" : "")
                            + ListUtils.getTextListStringToString(
                                    ListUtils.getSubList(
                                            solutionFileContent,
                                            (solutionFirstLine == ReturnNewLineNumber.OUT_OF_BOUNDS ? 0 : solutionFirstLine - 1),
                                            (solutionFinalLine == ReturnNewLineNumber.OUT_OF_BOUNDS ? solutionFileContent.size() - 1 : solutionFinalLine - 1)
                                    ))
                            + (solutionFinalLine == ReturnNewLineNumber.OUT_OF_BOUNDS ? "\n<EOF>" : "")
                    );
                    chunk = developerDecisionLayer(chunk);
                }
            }
        } catch (Exception ex) {
            throw new IOException(ex);
        }

        return chunk;
    }

    private Chunk developerDecisionLayer(Chunk chunk) {
        String solution = MergeNatureTools.getRawForm(chunk.getSolutionTextWithoutContext());
        String v1 = MergeNatureTools.getRawForm(chunk.getV1());
        String v2 = MergeNatureTools.getRawForm(chunk.getV2());
        if (solution.equals(v1)) {
            chunk.setDeveloperDecision(DeveloperDecision.VERSION1);
        } else if (solution.equals(v2)) {
            chunk.setDeveloperDecision(DeveloperDecision.VERSION2);
        } else if (solution.equals("")) {
            chunk.setDeveloperDecision(DeveloperDecision.NONE);
        } else if (solution.equals(v1.concat(v2)) || solution.equals(v2.concat(v1))) {
            chunk.setDeveloperDecision(DeveloperDecision.CONCATENATION);
        } else {
            List<String> solutionList = MergeNatureTools.stringTextToListText(chunk.getSolutionTextWithoutContext());
            int markers = numberOfMarkers(solutionList);
            solutionList = MergeNatureTools.getRawForm(solutionList);
            switch (markers) {
                case 0:
                    List<String> v1List = MergeNatureTools.getRawForm(MergeNatureTools.stringTextToListText(chunk.getV1()));
                    List<String> v2List = MergeNatureTools.getRawForm(MergeNatureTools.stringTextToListText(chunk.getV2()));
                    for (String solutionLine : solutionList) {
                        if (!(v1List.contains(solutionLine) || v2List.contains(solutionLine))) {
                            chunk.setDeveloperDecision(DeveloperDecision.NEWCODE);
                            return chunk;
                        }
                    }
                    chunk.setDeveloperDecision(DeveloperDecision.COMBINATION);
                    break;
                case 1:
                    chunk.setDeveloperDecision(DeveloperDecision.POSTPONED_1);
                    break;
                case 2:
                    chunk.setDeveloperDecision(DeveloperDecision.POSTPONED_2);
                    break;
                case 3:
                    chunk.setDeveloperDecision(DeveloperDecision.POSTPONED_3);
                    break;
                default:
                    break;
            }
        }
        return chunk;
    }

    private Chunk originalLinesLayer(Chunk chunk, String repositoryPath) throws IOException, NotGitRepositoryException, DiffException {
        String conflictFilePath = chunk.getConflictFile().getConflictFilePath();
        String parent1FilePath = chunk.getConflictFile().getParent1FilePath();
        String parent2FilePath = chunk.getConflictFile().getParent2FilePath();
        if (chunk.getBeginLine() + 1 == chunk.getSeparatorLine()) {
            chunk.setOriginalV1FirstLine(0);
        } else {
            String parent1Commit = chunk.getConflictFile().getMerge().getParents().get(0).getHash();
            int conflictV1Line = chunk.getBeginLine() + 1;
            int originalV1FirstLine;
            try {
                originalV1FirstLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, parent1Commit, "", parent1FilePath, conflictFilePath, false, conflictV1Line);
            } catch (IOException ex) {
                throw new IOException(ex);
            }
            chunk.setOriginalV1FirstLine(originalV1FirstLine);
        }
        if (chunk.getOriginalV1FirstLine() < 0) {
            chunk.setOriginalV1FirstLine(-1);
            chunk.setOriginalV2FirstLine(-1);
        } else if (chunk.getSeparatorLine() + 1 == chunk.getEndLine()) {
            chunk.setOriginalV2FirstLine(0);
        } else {
            String parent2Commit = chunk.getConflictFile().getMerge().getParents().get(1).getHash();
            int conflictV2Line = chunk.getSeparatorLine() + 1;
            int originalV2FirstLine;
            try {
                originalV2FirstLine = ReturnNewLineNumber.getLineInAnotherCommit(repositoryPath, parent2Commit, "", parent2FilePath, conflictFilePath, false, conflictV2Line);
            } catch (IOException ex) {
                throw new IOException(ex);
            }
            if (originalV2FirstLine < 0) {
                chunk.setOriginalV1FirstLine(-1);
                chunk.setOriginalV2FirstLine(-1);
            } else {
                chunk.setOriginalV2FirstLine(originalV2FirstLine);
            }
        }

        return chunk;

    }

    private ConflictFile outsideAlterationsLayer(ConflictFile conflictFile, String repositoryPath, List<IntegerInterval> contextIntervals) throws IOException, NotGitRepositoryException, DiffException {
        List<LineInformation> allLines;
        if (solutionFileWasRenamed) {
            allLines = Git.diff(repositoryPath,
                    conflictFile.getMerge().getMergeCommit().getHash() + ":" + conflictFile.getParent2FilePath(),
                    conflictFile.getConflictFilePath(), true, 0).get(0).getLines();
        } else {
            allLines = Git.diff(repositoryPath,
                    conflictFile.getMerge().getMergeCommit().getHash() + ":" + conflictFile.getParent1FilePath(),
                    conflictFile.getConflictFilePath(), true, 0).get(0).getLines();
        }
        List<LineInformation> outsideAlterationsLines = new ArrayList<>();
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
                outsideAlterationsLines.add(line);
            }
        }
        if (outsideAlterationsLines.isEmpty()) {
            conflictFile.setHasOutsideAlterations(HasOutsideAlterations.NO);
            return conflictFile;
        } else {
            FileOA fileOA = new FileOA();
            fileOA.setFilePath(conflictFile.getConflictFilePath());
            fileOA.setConflictFile(conflictFile);
            for (LineInformation line : outsideAlterationsLines) {
                fileOA.addAlteration(new Alteration(line.getContent(),
                        line.getType() == LineType.ADDED,
                        conflictFile.wasInsideChunk(line.getContent())));
            }
            conflictFile.getMerge().addFileOA(fileOA);

            List<String> addeds = new ArrayList<>();
            List<String> removeds = new ArrayList<>();
            for (LineInformation line : outsideAlterationsLines) {
                if (!line.getContent().replaceAll(" ", "").replaceAll("\t", "").equals("")) {
                    if (line.getType() == LineType.ADDED) {
                        addeds.add(line.getContent().replaceAll(" ", "").replaceAll("\t", ""));
                    } else {
                        removeds.add(line.getContent().replaceAll(" ", "").replaceAll("\t", ""));
                    }
                }
            }
            if (addeds.size() != removeds.size()) {
                conflictFile.setHasOutsideAlterations(HasOutsideAlterations.YES);
            } else {
                for (int i = 0; i < addeds.size(); i++) {
                    if (!addeds.get(i).equals(removeds.get(i))) {
                        conflictFile.setHasOutsideAlterations(HasOutsideAlterations.YES);
                        return conflictFile;
                    }

                }
                conflictFile.setHasOutsideAlterations(HasOutsideAlterations.NO_IGNORING_FORMATTING);
            }
            return conflictFile;
        }
    }

    private ConflictFile antlr4Layer(ConflictFile conflictFile, String repositoryPath) throws IOException, OutOfMemoryError, NotGitRepositoryException, ShowException {
        if (conflictFile.getChunks().get(0).getOriginalV1FirstLine() < 0) {
            for (Chunk chunk : conflictFile.getChunks()) {
                chunk.setLanguageConstructs(LanguageConstructs.SYNTAX_ERROR);
            }
        } else {
            String parent1FilePath = conflictFile.getParent1FilePath();
            ANTLR4Results rawParent1Results = ANTLR4Tools.getANTLR4Results(parent1FilePath, conflictFile.getMerge().getParents().get(0).getHash(), repositoryPath);
            if (rawParent1Results == null) {
                for (Chunk chunk : conflictFile.getChunks()) {
                    chunk.setLanguageConstructs(LanguageConstructs.NOT_PARSEABLE);
                }
                return conflictFile;
            } else {
                String parent2FilePath = conflictFile.getParent2FilePath();
                ANTLR4Results rawParent2Results = ANTLR4Tools.getANTLR4Results(parent2FilePath, conflictFile.getMerge().getParents().get(1).getHash(), repositoryPath);
                if (rawParent2Results == null) {
                    for (Chunk chunk : conflictFile.getChunks()) {
                        chunk.setLanguageConstructs(LanguageConstructs.NOT_PARSEABLE);
                    }
                    return conflictFile;
                } else {
                    ANTLR4Results parent1Results = null;
                    List<String> v1Structures;
                    List<String> v1LanguageConstructs;
                    ANTLR4Results parent2Results = null;
                    List<String> v2Structures;
                    List<String> v2LanguageConstructs;
                    String devModeText = "";
                    for (Chunk chunk : conflictFile.getChunks()) {
                        v1Structures = new ArrayList<>();
                        v1LanguageConstructs = new ArrayList<>();
                        v2Structures = new ArrayList<>();
                        v2LanguageConstructs = new ArrayList<>();
                        if (chunk.getOriginalV1FirstLine() == 0) {
                            v1Structures.add("Blank");
                            v1LanguageConstructs.add("Blank");
                        } else {
                            parent1Results = ANTLR4Tools.filterAndGetOutmost(rawParent1Results, chunk.getOriginalV1FirstLine(), chunk.getOriginalV1FinalLine());
                            devModeText += parent1Results.getStringAllOutmosted();
                            v1LanguageConstructs = ANTLR4Tools.getTranslatedStrucutures(parent1Results.getAllOutmosted(), parent1FilePath, isEmpty(chunk, true), !parent1Results.getSyntaxErrors().isEmpty());
                        }
                        if (chunk.getOriginalV2FirstLine() == 0) {
                            v2Structures.add("Blank");
                            v2LanguageConstructs.add("Blank");
                        } else {
                            parent2Results = ANTLR4Tools.filterAndGetOutmost(rawParent2Results, chunk.getOriginalV2FirstLine(), chunk.getOriginalV2FinalLine());
                            devModeText += parent2Results.getStringAllOutmosted();
                            v2LanguageConstructs = ANTLR4Tools.getTranslatedStrucutures(parent2Results.getAllOutmosted(), parent2FilePath, isEmpty(chunk, false), !parent2Results.getSyntaxErrors().isEmpty());
                        }
                        for (String str : v2LanguageConstructs) {
                            if (!v1LanguageConstructs.contains(str)) {
                                v1LanguageConstructs.add(str);
                            }
                        }
                        Collections.sort(v1LanguageConstructs);
                        chunk.setLanguageConstructs(ListUtils.getTextListStringToString(v1LanguageConstructs) + (devMode ? devModeText : ""));
                    }
                }
            }
        }
        return conflictFile;
    }

    private Project getProjectData(String repositoryPath, String repositoryURL) throws IOException, GitException, SQLException {
        Project project = null;
        if (repositoryURL == null) {
            repositoryURL = Git.getRemoteURL(repositoryPath);
        }
        if (sqlConnection != null && repositoryURL != "Unknown") {
            project = getProjectDataInDatabase(repositoryURL);
        }
        if (project == null) {
            project = getProjectDataInSystem(repositoryPath, repositoryURL);
        }
        return project;
    }

    private Project getProjectDataInDatabase(String repositoryURL) throws IOException, SQLException {
        if (sqlConnection != null && repositoryURL != null) {
            List<Project> projects = ProjectDAO.selectByURL(sqlConnection, repositoryURL);
            if (projects != null && !projects.isEmpty()) {
                return projects.get(0);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private Project getProjectDataInSystem(String repositoryPath, String repositoryURL) throws IOException, GitException {
        Project project = new Project();
        String[] auxStringArray;
        project.setUrl(repositoryURL);
        if (project.getUrl() == "Unknown") {
            project.setName(Paths.get(repositoryPath).getFileName().toString());
            project.setOrganization("Unknown");
        } else {
            if (project.getUrl().contains("@")) {
                auxStringArray = project.getUrl().split(":")[1].split("/");
                project.setName(auxStringArray[1]);
                project.setOrganization(auxStringArray[0]);
            } else {
                auxStringArray = project.getUrl().split("/");
                project.setName(auxStringArray[auxStringArray.length - 1]);
                project.setOrganization(auxStringArray[auxStringArray.length - 2]);
            }
        }
        return project;
    }

    private int getAnalysisID(Project project) throws SQLException, IOException {
        int analysisID = 0;
        if (sqlConnection != null) {
            if (project.getId() == 0) {
                project.setId(ProjectDAO.insert(sqlConnection, project));
            }
            if (project.getUrl() == "Unknown") {
                analysisID = AnalysisDAO.insert(sqlConnection, CODE_VERSION, false);
                Project_AnalysisDAO.insert(sqlConnection, project.getId(), analysisID);
            } else {
                analysisID = getAnalysisUncompletedInSameVersion(project.getId());
                if (analysisID == 0) {
                    analysisID = AnalysisDAO.insert(sqlConnection, CODE_VERSION, false);
                    Project_AnalysisDAO.insert(sqlConnection, project.getId(), analysisID);
                }
            }
        }
        return analysisID;
    }

    private int getAnalysisUncompletedInSameVersion(int projectID) throws SQLException, IOException {
        List<Integer> analysisIDs = Project_AnalysisDAO.selectByProjectID(sqlConnection, projectID);
        for (Integer id : analysisIDs) {
            if (!AnalysisDAO.selectCompleted(sqlConnection, id)
                    && this.CODE_VERSION.equals(AnalysisDAO.selectCodeVersion(sqlConnection, id))) {
                return id;
            }
        }
        return 0;
    }

    private Merge getMergeData(String repositoryPath, Project project, String logLine, int analysisID) throws SQLException, IOException, GitException {
        Merge merge = null;
        if (sqlConnection != null) {
            merge = getMergeDataInDatabase(project.getId(), logLine.split("/")[0]);
            if (merge != null && Merge_AnalysisDAO.selectCompleted(sqlConnection, merge.getId(), analysisID)) {
                //pegar conflict files
            }
        }
        if (merge == null) {
            merge = getMergeDataInSystem(repositoryPath, logLine);
        }
        merge.setProject(project);
        return merge;
    }

    private Merge getMergeDataInDatabase(int projectID, String mergeHash) throws SQLException, IOException {
        if (sqlConnection != null && projectID != 0) {
            List<Integer> mergeIDs = Project_MergeDAO.selectByProjectIDAndMergeHash(sqlConnection, projectID, mergeHash);
            if (mergeIDs != null && !mergeIDs.isEmpty()) {
                return MergeDAO.selectByID(sqlConnection, mergeIDs.get(0));
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private Merge getMergeDataInSystem(String repositoryPath, String logLine) throws IOException, GitException {
        Merge merge = new Merge();
        String[] auxStringArray;
        String auxString;
        auxStringArray = logLine.split("/");
        merge.setMergeCommit(new Commit(auxStringArray[0], repositoryPath));
        auxStringArray = auxStringArray[1].split(" ");
        for (String parent : auxStringArray) {
            merge.addParent(new Commit(parent, repositoryPath));
        }
        auxString = Git.mergeBase(repositoryPath, auxStringArray);
        merge.setMergeBase((auxString == null ? null : new Commit(auxString, repositoryPath)));
        return merge;
    }

    private List<String> getMergeMessage(String repositoryPath, Merge merge) throws IOException, GitException {
        List<String> mergeMessage = null;
        if (merge.getParents().size() == 2) {
            MergeNatureTools.prepareAnalysis(repositoryPath);
            Git.checkout(merge.getParents().get(0).getHash(), repositoryPath);
            MergeNatureTools.prepareAnalysis(repositoryPath);
            mergeMessage = Git.merge(merge.getParents().get(1).getHash(), repositoryPath);
        }
        return mergeMessage;
    }

    private MergeType getMergeType(List<String> mergeMessage, boolean unrelatedHistories) {
        if (mergeMessage == null) {
            return (unrelatedHistories ? MergeType.OCTOPUS_MERGE_OF_UNRELATED_HISTORIES : MergeType.OCTOPUS_MERGE);
        } else if (mergeMessage.contains("Automatic merge failed; fix conflicts and then commit the result.")) {
            return (unrelatedHistories ? MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES : MergeType.CONFLICTED_MERGE);
        } else {
            return (unrelatedHistories ? MergeType.NOT_CONFLICTED_MERGE_OF_UNRELATED_HISTORIES : MergeType.NOT_CONFLICTED_MERGE);
        }
    }

    private int insertMergeInDatabase(Merge merge, Project project, int analysisID) throws SQLException, IOException {
        if (sqlConnection != null) {
            sqlConnection.setAutoCommit(false);
            if (merge.getId() == 0) {
                merge.setId(MergeDAO.insert(sqlConnection, merge));
                Project_MergeDAO.insert(sqlConnection, project.getId(), merge.getId(), merge.getMergeCommit().getHash());
            }
            if (!Merge_AnalysisDAO.contains(sqlConnection, merge.getId(), analysisID)) {
                Merge_AnalysisDAO.insert(sqlConnection, merge.getId(), analysisID, false, false);
            }
            sqlConnection.commit();
            sqlConnection.setAutoCommit(true);
        }
        return merge.getId();
    }

    private void addUncopletedConflictFile(ConflictFile conflictFile, int analysisID) throws IOException, SQLException {
        if (sqlConnection != null) {
            sqlConnection.setAutoCommit(false);
            conflictFile.setId(ConflictFileDAO.contains(sqlConnection, conflictFile));
            if (conflictFile.getId() == 0) {
                conflictFile.setId(ConflictFileDAO.insert(sqlConnection, conflictFile));
            }
            Merge_ConflictFile_AnalysisDAO.insert(sqlConnection, conflictFile.getMerge().getId(), conflictFile.getId(), analysisID, false);
            for (Chunk chunk : conflictFile.getChunks()) {
                chunk.setId(ChunkDAO.containsWithoutStructures(sqlConnection, chunk));
                if (chunk.getId() == 0) {
                    chunk.setId(ChunkDAO.insert(sqlConnection, chunk));
                }
                ConflictFile_Chunk_AnalysisDAO.insert(sqlConnection, conflictFile.getId(), chunk.getId(), analysisID);
            }
            sqlConnection.commit();
            sqlConnection.setAutoCommit(true);
        }
    }

    private void updateChunksInDatabase(ConflictFile conflictFile, int analysisID) throws IOException, SQLException {
        if (sqlConnection != null) {
            int newId = 0;
            sqlConnection.setAutoCommit(false);
            for (Chunk chunk : conflictFile.getChunks()) {
                newId = ChunkDAO.contains(sqlConnection, chunk);
                if (newId == chunk.getId()) {
                    continue;
                } else {
                    ChunkDAO.updateStructures(sqlConnection, chunk.getId(), chunk.getLanguageConstructs());
                }
            }
            Merge_ConflictFile_AnalysisDAO.updateComplete(sqlConnection, conflictFile.getMerge().getId(), conflictFile.getId(), analysisID, true);
            sqlConnection.commit();
            sqlConnection.setAutoCommit(true);
        }
    }

    private class IntegerInterval {

        int begin;
        int end;

        public IntegerInterval(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }
    }

    private boolean isEmpty(Chunk chunk, boolean v1) {
        if (v1) {
            return chunk.getV1().replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", "").equals("");
        } else {
            return chunk.getV2().replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", "").equals("");
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

    private String pathTreatment(String path) {
        if (path.contains("\\")) {
            path = path.replaceAll("\\\\", "/");
        }
        if (path.endsWith("/")) {
            path = path;
        } else {
            path = path + "/";
        }
        return path;
    }

}
