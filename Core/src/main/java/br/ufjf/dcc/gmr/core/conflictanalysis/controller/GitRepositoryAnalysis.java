package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.CommitData;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictFile;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.RepositoryAnalysisProcessData;
import br.ufjf.dcc.gmr.core.conflictanalysis.view.ConflictAnalysisProgressBarPanel;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.EmptyOutput;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.PathDontExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * This is the main class of Conflict Analysis, here is analysed all the project
 * and generate a List of MergeEvent. If the mergeEventList is null, the
 * repositoryPath is not a Git Repository or the project can content a not
 * treated type of conflict, caused by a Git update (this version was created
 * based in version 2.27.0 of Git). An instace of this class can anlyze only one
 * directory.
 *
 * ATENCION: The global username and the global e-mail of Git must defined, if
 * not is, use these commands:
 *
 * git config --global user.name "Your Name" git config --global user.email
 * "youremail@yourdomain.com"
 *
 * ATENCION: This class can only use in Linux,
 *
 * To make an analysis, just use startAnalysis method after the instace.
 *
 * @author João Pedro Lima
 * @version 1.0
 * @since 17-06-2020
 */
public class GitRepositoryAnalysis {

    /**
     * The result of Analysis, before the analysis, is null.
     *
     * @see br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent
     */
    private List<MergeEvent> mergeEventList;
    /**
     * Is the path of root of project on PC.
     */
    private final String repositoryPath;
    /**
     * This integer is the number of lines that will be catch after and before
     * the conflict, this lines is called context, cannot be less than 1.
     */
    private final int linesContext;
    /**
     * If is necessary filter the ANTLR structures to the outmost structures,
     * input true.
     */
    private boolean useOutmost;
    private RepositoryAnalysisProcessData processData;
    private ConflictAnalysisProgressBarPanel progressBarPanel;
    private JProgressBar progressBar;
    private JLabel processLabel;
    private boolean analysisDone;
    private String projectName;

    /**
     *
     * @param repositoryPath Is the path of root of project on PC.
     * @param linesContext This integer is the number of lines that will be
     * catch after and before the conflict, this lines is called context, 
     * cannot be less than 1.
     * @param useOutmost If is necessary filter the ANTLR structures to the
     * outmost structures, input true.
     */
    public GitRepositoryAnalysis(String repositoryPath, int linesContext, boolean useOutmost) {
        this.mergeEventList = new ArrayList<>();
        this.repositoryPath = repositoryPath;
        this.linesContext = linesContext;
        this.useOutmost = useOutmost;
        this.processData = new RepositoryAnalysisProcessData();
        this.progressBarPanel = null;
        this.progressBar = null;
        this.processLabel = null;
        this.analysisDone = false;
        String[] auxArray = this.repositoryPath.split("/");
        this.projectName = auxArray[auxArray.length - 1];
    }

    /**
     *
     * @param repositoryPath Is the path of root of project on PC.
     * @param linesContext This integer is the number of lines that will be
     * catch after and before the conflict, this lines is called context,
     * cannot be less than 1.
     * @param useOutmost If is necessary filter the ANTLR structures to the
     * outmost structures, input true.
     * @param progressBar Input a ConflictAnalysisProgressBar if its use in a GUI
     */
    public GitRepositoryAnalysis(String repositoryPath, int linesContext, ConflictAnalysisProgressBarPanel progressBarPanel, boolean useOutmost) {
        this.mergeEventList = new ArrayList<>();
        this.repositoryPath = repositoryPath;
        this.linesContext = linesContext;
        this.useOutmost = useOutmost;
        this.processData = new RepositoryAnalysisProcessData();
        this.progressBarPanel = progressBarPanel;
        this.progressBar = this.progressBarPanel.getProgressBar();
        this.processLabel = this.progressBarPanel.getProcessLabel();
        this.analysisDone = false;
        String[] auxArray = this.repositoryPath.split("/");
        this.projectName = auxArray[auxArray.length - 1];
    }
    
    /**
     * 
     * @return The analysis 
     */
    public List<MergeEvent> getMergeEventList() {
        if (analysisDone) {
            return mergeEventList;
        } else {
            return null;
        }
    }
    
    /**
     * Iniciate the analysis.
     * @throws IOException Any error is returned like an 
     * IOException, but the expected errors is the a 
     * negative number in the linesContext or a path 
     * that isn't a Git Repository in repositoryPath
     */
    public void startAnalysis() throws IOException{
        if (analysisDone == true) {
            System.out.println("The repository has already been analyzed!");
        } else {
            if(this.linesContext < 1){
                this.exceptionProtocol("ERROR: IOException error!");
                throw new IOException();
            }
            try {
                if (progressBar == null) {
                    this.firstProcessingLayer();
                } else {
                    this.firstProcessingLayerGUI();
                }
            } catch (CheckoutError ex) {
                this.exceptionProtocol("ERROR: CheckoutError error!");
                ConflictAnalysisTools.deleteDirectory(this.processData.sandbox);
            } catch (NoRemoteForTheCurrentBranch ex) {
                this.exceptionProtocol("ERROR: NoRemoteForTheCurrentBranch error!");
                throw new IOException();
            } catch (ThereIsNoMergeInProgress ex) {
                this.exceptionProtocol("ERROR: ThereIsNoMergeInProgress error!");
                throw new IOException();
            } catch (ThereIsNoMergeToAbort ex) {
                this.exceptionProtocol("ERROR: ThereIsNoMergeToAbort error!");
                throw new IOException();
            } catch (AlreadyUpToDate ex) {
                this.exceptionProtocol("ERROR: AlreadyUpToDate error!");
                throw new IOException();
            } catch (NotSomethingWeCanMerge ex) {
                this.exceptionProtocol("ERROR: NotSomethingWeCanMerge error!");
                throw new IOException();
            } catch (InvalidCommitHash ex) {
                this.exceptionProtocol("ERROR: InvalidCommitHash error!");
                throw new IOException();
            } catch (UnknownSwitch ex) {
                this.exceptionProtocol("ERROR: UnknownSwitch error!");
                throw new IOException();
            } catch (RefusingToClean ex) {
                this.exceptionProtocol("ERROR: RefusingToClean error!");
                throw new IOException();
            } catch (IsOutsideRepository ex) {
                this.exceptionProtocol("ERROR: IsOutsideRepository error!");
                throw new IOException();
            } catch (InvalidDocument ex) {
                this.exceptionProtocol("ERROR: InvalidDocument error!");
                throw new IOException();
            } catch (LocalRepositoryNotAGitRepository ex) {
                this.exceptionProtocol("ERROR: LocalRepositoryNotAGitRepository error!");
                throw new IOException();
            } catch (PathDontExist ex) {
                this.exceptionProtocol("ERROR: PathDontExist error!");
                throw new IOException();
            } catch (EmptyOutput ex) {
                this.exceptionProtocol("ERROR: EmptyOutput error!");
                throw new IOException();
            } catch (IOException ex) {
                this.exceptionProtocol("ERROR: IOException error!");
                throw new IOException();
            } catch (RepositoryAlreadyExist ex) {
                this.exceptionProtocol("ERROR: RepositoryAlreadyExist error!");
                throw new IOException();
            }
            this.analysisDone = true;
        }
    }

    private void firstProcessingLayerGUI() throws IOException, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, InvalidCommitHash, PathDontExist, EmptyOutput, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository, RepositoryAlreadyExist {

        int status = 0;
        int mergeNumber;
        List<String> allMerges = Git.giveAllMerges(this.repositoryPath);
        mergeNumber = allMerges.size();
        this.prepareAnalysis();
        this.processData.sandbox = ConflictAnalysisTools.createSandbox(this.repositoryPath, this.projectName);
        this.progressBar.setIndeterminate(false);
        this.progressBar.setMinimum(1);
        this.progressBar.setMaximum(allMerges.size());
        this.processLabel.setText("Main Process...");
        System.out.println(status + "/" + mergeNumber + " merges processed...");
        for (String merge : allMerges) {
            this.catchCommits(merge);
            Git.checkout(this.processData.parents.get(0).getCommitHash(), this.repositoryPath);
            if (Git.mergeIsConflicting(this.processData.parents.get(1).getCommitHash(), repositoryPath, false, false)) {
                this.secondProcessingLayer();
            }
            this.resetRepository();
            this.addMergeEvent();
            this.resetMergeEventData();
            this.progressBar.setValue(++status);
            System.out.println(status + "/" + mergeNumber + " merges processed...");
        }
        ConflictAnalysisTools.deleteDirectory(this.processData.sandbox);
        System.out.println("Starting ANTLR analysis...");
        this.startANTLRProcessGUI();

    }

    private void firstProcessingLayer() throws IOException, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, InvalidCommitHash, PathDontExist, EmptyOutput, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository, RepositoryAlreadyExist {

        int status = 0;
        int mergeNumber;
        List<String> allMerges = Git.giveAllMerges(this.repositoryPath);
        mergeNumber = allMerges.size();
        this.prepareAnalysis();
        this.processData.sandbox = ConflictAnalysisTools.createSandbox(this.repositoryPath, this.projectName);
        System.out.println(status + "/" + mergeNumber + " merges processed...");
        for (String merge : allMerges) {
            this.catchCommits(merge);
            Git.checkout(this.processData.parents.get(0).getCommitHash(), this.repositoryPath);
            if (Git.mergeIsConflicting(this.processData.parents.get(1).getCommitHash(), repositoryPath, false, false)) {
                this.secondProcessingLayer();
            }
            this.resetRepository();
            this.addMergeEvent();
            this.resetMergeEventData();
            status++;
            System.out.println(status + "/" + mergeNumber + " merges processed...");
        }
        ConflictAnalysisTools.deleteDirectory(this.processData.sandbox);
        System.out.println("Starting ANTLR analysis...");
        this.startANTLRProcess();

    }

    private void secondProcessingLayer() throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, PathDontExist, EmptyOutput, CheckoutError {
        for (FileDiff fileDiff : Git.diff(this.repositoryPath, "", "", false)) {
            if (!fileDiff.getLines().isEmpty()) {
                this.catchMainConflictFileInfo(fileDiff.getFilePathSource());
                this.thirdProcessingLayer(ConflictAnalysisTools.getFileContent(this.processData.filePath));
                this.addConflictFile();
                this.resetConflictFileData();
                this.catchUnmergedFiles(fileDiff.getAllMessage());
            }
        }
        Git.mergeAbort(repositoryPath);
    }

    private void thirdProcessingLayer(List<String> fileContent) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash, PathDontExist, EmptyOutput, CheckoutError {
        this.processFileContent(fileContent);
    }

    private void prepareAnalysis() {
        ConflictAnalysisTools.deleteDirectory(new File(Paths.get(this.repositoryPath).getParent().toString() + "/RepositoryAnalysisSandbox_" + this.projectName));
        try {
            Git.reset(this.repositoryPath, true, false, false, null);
        } catch (IOException ex) {
        } catch (LocalRepositoryNotAGitRepository ex) {
        } catch (InvalidDocument ex) {
        }
        try {
            Git.checkout("master", this.repositoryPath);
        } catch (IOException ex) {
        } catch (LocalRepositoryNotAGitRepository ex) {
        } catch (CheckoutError ex) {
        }
        try {
            Git.clean(this.repositoryPath, true, 0);
        } catch (IOException ex) {
        } catch (UnknownSwitch ex) {
        } catch (RefusingToClean ex) {
        } catch (IsOutsideRepository ex) {
        }

    }

    private void catchCommits(String merge) throws IOException, LocalRepositoryNotAGitRepository {
        String[] stringArray = merge.split(",");
        this.processData.hash = new CommitData(stringArray[0], this.repositoryPath);
        stringArray = stringArray[1].split(" ");
        this.processData.parents.add(new CommitData(stringArray[0], this.repositoryPath));
        this.processData.parents.add(new CommitData(stringArray[1], this.repositoryPath));
        this.processData.commonAncestorOfParents = new CommitData(Git.mergeBaseCommand(this.repositoryPath, stringArray[0], stringArray[1]), this.repositoryPath);

    }

    private void catchMainConflictFileInfo(String filePath) {
        this.processData.filePath = repositoryPath + filePath;
        this.processData.insideFilePath = filePath;
        this.processData.auxArray = filePath.split("/");
        this.processData.fileName = this.processData.auxArray[this.processData.auxArray.length - 1];
    }

    private void processFileContent(List<String> fileContent) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash, PathDontExist, EmptyOutput, CheckoutError {
        for (int i = 0; i < fileContent.size(); i++) {
            if (fileContent.get(i).contains("<<<<<<")) {
                if (fileContent.get(i).contains(":") && this.processData.extraFileName == "") {
                    this.processData.auxArray = fileContent.get(i).split("/");
                    if (this.processData.auxArray[this.processData.auxArray.length - 1] != this.processData.fileName) {
                        this.processData.extraFileName = this.processData.auxArray[this.processData.auxArray.length - 1];
                        this.processData.auxArray = fileContent.get(i).split(":");
                        this.processData.extraInsideFilePath = this.processData.auxArray[this.processData.auxArray.length - 1];
                        this.processData.extraFilePath = repositoryPath + "/" + this.processData.extraInsideFilePath;
                        this.processData.extraFileInV1 = true;
                    }
                    this.processData.extraFileInV1 = false;
                }
                this.processData.beginLine = i + 1;
                for (int j = i - linesContext; j < i; j++) {
                    if (j < 0) {
                        j = -1;
                    } else {
                        this.processData.beforeContext.add(fileContent.get(j));
                    }
                }
                i++;
                while (!fileContent.get(i).contains("=====")) {
                    this.processData.v1.add(fileContent.get(i));
                    i++;
                }
                this.processData.separatorLine = i + 1;
                i++;
                while (!fileContent.get(i).contains(">>>>>")) {
                    this.processData.v2.add(fileContent.get(i));
                    i++;
                }
                this.processData.endLine = i + 1;
                if (fileContent.get(i).contains(":") && this.processData.extraFileName == "") {
                    this.processData.auxArray = fileContent.get(i).split("/");
                    if (this.processData.auxArray[this.processData.auxArray.length - 1] != this.processData.fileName) {
                        this.processData.extraFileName = this.processData.auxArray[this.processData.auxArray.length - 1];
                        this.processData.auxArray = fileContent.get(i).split(":");
                        this.processData.extraInsideFilePath = this.processData.auxArray[this.processData.auxArray.length - 1];
                        this.processData.extraFilePath = repositoryPath + "/" + this.processData.extraInsideFilePath;
                    }
                }
                for (int j = i + 1; j < i + 1 + linesContext; j++) {
                    if (j >= fileContent.size()) {
                        break;
                    } else {
                        this.processData.afterContext.add(fileContent.get(j));
                    }
                }
                this.catchOriginalLines();
                this.catchSolutionLines();
                this.addConflictRegion();
                this.resetConflictRegionData();
            }
        }
    }

    private void catchOriginalLines() throws CheckoutError, EmptyOutput, PathDontExist, InvalidCommitHash, LocalRepositoryNotAGitRepository, IOException {
        this.processData.originalV1FirstLine = -1;
        this.processData.originalV2FirstLine = -1;
        if (!this.processData.v1.isEmpty()) {
            Git.checkout(this.processData.parents.get(0).getCommitHash(), this.processData.sandbox.getPath());
            if (!this.processData.extraIsEmpty() && this.processData.extraFileInV1 == true) {
                this.processData.originalV1FirstLine = ReturnNewLineNumber.initReturnNewLineNumberFile(this.processData.sandbox.getPath(),
                        this.processData.extraFilePath, this.processData.sandbox.getPath() + this.processData.extraInsideFilePath,
                        this.processData.beginLine + 1);
            } else {
                this.processData.originalV1FirstLine = ReturnNewLineNumber.initReturnNewLineNumberFile(this.processData.sandbox.getPath(), this.processData.filePath, this.processData.sandbox.getPath()
                        + this.processData.insideFilePath, this.processData.beginLine + 1);
            }
            Git.checkout("master", this.processData.sandbox.getPath());
        }
        if (!this.processData.v2.isEmpty()) {
            Git.checkout(this.processData.parents.get(1).getCommitHash(), this.processData.sandbox.getPath());
            if (!this.processData.extraIsEmpty() && this.processData.extraFileInV1 == false) {
                this.processData.originalV2FirstLine = ReturnNewLineNumber.initReturnNewLineNumberFile(this.processData.sandbox.getPath(),
                        this.processData.extraFilePath, this.processData.sandbox.getPath() + this.processData.extraInsideFilePath,
                        this.processData.separatorLine + 1);
            } else {
                this.processData.originalV2FirstLine = ReturnNewLineNumber.initReturnNewLineNumberFile(this.processData.sandbox.getPath(),
                        this.processData.filePath, this.processData.sandbox.getPath() + this.processData.insideFilePath,
                        this.processData.separatorLine + 1);
            }
            Git.checkout("master", this.processData.sandbox.getPath());
        }
    }

    private void catchSolutionLines() throws EmptyOutput, PathDontExist, InvalidCommitHash, CheckoutError, LocalRepositoryNotAGitRepository, IOException {

        Git.checkout(this.processData.hash.getCommitHash(), this.processData.sandbox.getPath());
        if (!this.processData.beforeContext.isEmpty()) {
            this.processData.solutionFirstLine = ReturnNewLineNumber.initReturnNewLineNumberFile(this.processData.sandbox.getPath(),
                    this.processData.filePath,
                    this.processData.sandbox.getPath() + this.processData.insideFilePath,
                    this.processData.beginLine - 1);
        } else {
            this.processData.solutionFirstLine = 0;
        }
        if (!this.processData.afterContext.isEmpty()) {
            this.processData.solutionFinalLine = ReturnNewLineNumber.initReturnNewLineNumberFile(this.processData.sandbox.getPath(),
                    this.processData.filePath,
                    this.processData.sandbox.getPath() + this.processData.insideFilePath,
                    this.processData.endLine + 1);
        } else {
            this.processData.solutionFinalLine = 0;
        }
        if (this.processData.solutionFirstLine == ReturnNewLineNumber.REMOVED_FILE || this.processData.solutionFinalLine == ReturnNewLineNumber.REMOVED_FILE) {
            this.processData.auxBool = Git.deletedFile(this.processData.sandbox.getPath(),
                    this.processData.filePath,
                    this.processData.parents.get(0).getCommitHash(),
                    this.processData.hash.getCommitHash());
            if (this.processData.auxBool == false) {
                this.processData.auxBool = Git.deletedFile(this.processData.sandbox.getPath(),
                        this.processData.filePath,
                        this.processData.parents.get(1).getCommitHash(),
                        this.processData.hash.getCommitHash());
                if (this.processData.auxBool == false) {
                    throw new EmptyOutput();
                } else {
                    this.processData.solution = null;
                }
            } else {
                this.processData.solution = null;
            }
        } else if (this.processData.solutionFirstLine == ReturnNewLineNumber.POSTPONED || this.processData.solutionFinalLine == ReturnNewLineNumber.POSTPONED) {
            List<String> listAux = new ArrayList<>();
            listAux.add("POSTPONED");
            this.processData.solution = listAux;
        } else if (this.processData.solutionFirstLine == 0 && this.processData.solutionFinalLine == 0) {
            this.processData.solution = ConflictAnalysisTools.getFileContent(this.processData.sandbox.getPath() + this.processData.insideFilePath);
            this.processData.solution.add(0, "<SOF>");
            this.processData.solution.add("<EOF>");
        } else if (this.processData.solutionFirstLine == 0) {
            this.processData.solution = ListUtils.getSubList(ConflictAnalysisTools.getFileContent(this.processData.sandbox.getPath() + this.processData.insideFilePath),
                    0,
                    this.processData.solutionFinalLine - 1);
            this.processData.solution.add(0, "<SOF>");
        } else if (this.processData.solutionFinalLine == 0) {
            this.processData.solution = ListUtils.getSubList(ConflictAnalysisTools.getFileContent(this.processData.sandbox.getPath() + this.processData.insideFilePath),
                    this.processData.solutionFirstLine - 1,
                    ConflictAnalysisTools.getFileContent(this.processData.sandbox.getPath() + this.processData.insideFilePath).size() - 1);
            this.processData.solution.add("<EOF>");
        } else if (this.processData.solutionFirstLine > 0 && this.processData.solutionFinalLine > 0) {
            this.processData.solution = ListUtils.getSubList(ConflictAnalysisTools.getFileContent(this.processData.sandbox.getPath() + this.processData.insideFilePath),
                    this.processData.solutionFirstLine - 1, this.processData.solutionFinalLine - 1);
        }
        Git.checkout("master", this.processData.sandbox.getPath());

    }

    private void addConflictRegion() {
        if (this.processData.solution != null) {
            this.processData.conflictRegion.add(new ConflictRegion(new ArrayList<>(this.processData.beforeContext),
                    new ArrayList<>(this.processData.afterContext),
                    new ArrayList<>(this.processData.v1),
                    new ArrayList<>(this.processData.v2),
                    new ArrayList<>(this.processData.solution),
                    this.processData.beginLine,
                    this.processData.separatorLine,
                    this.processData.endLine,
                    this.processData.originalV1FirstLine,
                    this.processData.originalV2FirstLine));
        } else {
            this.processData.conflictRegion.add(new ConflictRegion(new ArrayList<>(this.processData.beforeContext),
                    new ArrayList<>(this.processData.afterContext),
                    new ArrayList<>(this.processData.v1),
                    new ArrayList<>(this.processData.v2),
                    null,
                    this.processData.beginLine,
                    this.processData.separatorLine,
                    this.processData.endLine,
                    this.processData.originalV1FirstLine,
                    this.processData.originalV2FirstLine));
        }
    }

    private void resetConflictRegionData() {
        this.processData.beforeContext.clear();
        this.processData.afterContext.clear();
        this.processData.v1.clear();
        this.processData.v2.clear();
        if (this.processData.solution == null) {
            this.processData.solution = new ArrayList<>();
        } else {
            this.processData.solution.clear();
        }
    }

    private void addConflictFile() {
        if (this.processData.extraFileName == "") {
            this.processData.conflictFiles.add(new ConflictFile(this.processData.fileName,
                    this.processData.filePath,
                    this.processData.insideFilePath,
                    new ArrayList<>(this.processData.conflictRegion)));
        } else {
            this.processData.conflictFiles.add(new ConflictFile(this.processData.fileName,
                    this.processData.filePath,
                    this.processData.insideFilePath,
                    this.processData.extraFileName,
                    this.processData.extraFilePath,
                    this.processData.extraInsideFilePath,
                    new ArrayList<>(this.processData.conflictRegion)));
        }
    }

    private void resetConflictFileData() {
        this.processData.extraFileName = "";
        this.processData.extraFilePath = "";
        this.processData.extraInsideFilePath = "";
        this.processData.conflictRegion.clear();
    }

    private void catchUnmergedFiles(List<String> diffMessage) {
        for (String line : diffMessage) {
            if (line.startsWith("* Unmerged path")) {
                this.processData.auxArray = line.split("/");
                this.processData.conflictFiles.add(new ConflictFile(this.processData.auxArray[this.processData.auxArray.length - 1], null, null, null));
            }
        }
    }

    private void resetRepository() throws IOException, LocalRepositoryNotAGitRepository, CheckoutError, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository {
        Git.checkout("master", this.repositoryPath);
        Git.reset(this.repositoryPath, true, false, false, null);
        Git.clean(this.repositoryPath, true, 0);
    }

    private void addMergeEvent() {
        this.mergeEventList.add(new MergeEvent(this.processData.hash,
                new ArrayList<>(this.processData.parents),
                new ArrayList<>(this.processData.conflictFiles),
                this.processData.commonAncestorOfParents));
    }

    private void resetMergeEventData() {
        this.processData.conflictFiles.clear();
        this.processData.parents.clear();
    }

    private void startANTLRProcess() throws IOException {
        int conflictsNumber = 0;
        int status = 0;
        for (MergeEvent merge : this.mergeEventList) {
            conflictsNumber += merge.getNumberOfConflictRegions();
        }
        System.out.println(status + "/" + conflictsNumber + " conflicts processed...");
        for (MergeEvent merge : this.mergeEventList) {
            if (merge.getConflictFiles() != null) {
                for (ConflictFile file : merge.getConflictFiles()) {
                    if (file.getConflictRegion() != null) {
                        for (ConflictRegion region : file.getConflictRegion()) {
                            if (file.getExtraFileName() != null) {
                                region.setSyntaxV1SyntaxV2(this.repositoryPath, file.getFilePath(), file.getExtraFilePath(), merge.getParents().get(0).getCommitHash(), merge.getParents().get(1).getCommitHash(), this.useOutmost);
                            } else {
                                region.setSyntaxV1SyntaxV2(this.repositoryPath, file.getFilePath(), merge.getParents().get(0).getCommitHash(), merge.getParents().get(1).getCommitHash(), this.useOutmost);
                            }
                            status++;
                            System.out.println(status + "/" + conflictsNumber + " conflicts processed...");
                        }
                    }
                }
            }
        }
    }
    
    /**
     * 
     * @return The name of Project 
     */
    public String getProjectName() {
        return projectName;
    }

    private void startANTLRProcessGUI() throws IOException {
        int conflictsNumber = 0;
        int status = 0;
        this.progressBar.setValue(1);
        this.processLabel.setText("ANTLR Process...");
        for (MergeEvent merge : this.mergeEventList) {
            conflictsNumber += merge.getNumberOfConflictRegions();
        }
        this.progressBar.setMaximum(conflictsNumber);
        System.out.println(status + "/" + conflictsNumber + " conflicts processed...");
        for (MergeEvent merge : this.mergeEventList) {
            if (merge.getConflictFiles() != null) {
                for (ConflictFile file : merge.getConflictFiles()) {
                    if (file.getConflictRegion() != null) {
                        for (ConflictRegion region : file.getConflictRegion()) {
                            if (file.getExtraFileName() != null) {
                                region.setSyntaxV1SyntaxV2(this.repositoryPath, file.getFilePath(), file.getExtraFilePath(), merge.getParents().get(0).getCommitHash(), merge.getParents().get(1).getCommitHash(), this.useOutmost);
                            } else {
                                region.setSyntaxV1SyntaxV2(this.repositoryPath, file.getFilePath(), merge.getParents().get(0).getCommitHash(), merge.getParents().get(1).getCommitHash(), this.useOutmost);
                            }
                            this.progressBar.setValue(++status);
                            System.out.println(status + "/" + conflictsNumber + " conflicts processed...");
                        }
                    }
                }
            }
        }
    }

    private void exceptionProtocol(String message) {
        System.out.println(message);
        ConflictAnalysisTools.deleteDirectory(this.processData.sandbox);
        this.mergeEventList = null;
        this.analysisDone = true;
    }
}
