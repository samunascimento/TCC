package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp.CPP14Lexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.python3.Python3Lexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.python3.Python3Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.CommitData;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictFile;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.DeveloperDecision;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.PathDontExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class RepositoryAnalysis {

    /*---------------------------------------------------------------------------------------
                                        Tools
    ---------------------------------------------------------------------------------------*/
    private static File createSandbox(String repositoryPath) throws IOException {
        File sandbox;
        if (repositoryPath.contains("\\")) {
            sandbox = new File(Paths.get(repositoryPath).getParent().toString() + "\\RepositoryAnalysisSandbox");
        } else {
            sandbox = new File(Paths.get(repositoryPath).getParent().toString() + "/RepositoryAnalysisSandbox");
        }
        try {
            Git.clone(repositoryPath, Paths.get(repositoryPath).getParent().toString(), "RepositoryAnalysisSandbox");
        } catch (RepositoryNotFound ex) {
            System.out.println("ERROR: RepositoryNotFound error!");
            throw new IOException();
        } catch (UrlNotFound ex) {
            System.out.println("ERROR: UrlNotFound error!");
            throw new IOException();
        }
        return sandbox;
    }

    private static boolean deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            File[] children = dir.listFiles();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDirectory(children[i]);
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

    private static List<String> getFileContent(String folderPath) throws IOException {
        List<String> content = new ArrayList<>();
        File file = new File(folderPath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            content.add(st);
        }
        return content;
    }

    /*---------------------------------------------------------------------------------------
                                        ANTLR4
    ---------------------------------------------------------------------------------------*/
    public static List<SyntaxStructure> analyzeJavaSyntaxTree(String filePath) throws IOException {
        if (filePath.endsWith(".java")) {
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            JavaLexer lexer = new JavaLexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaParser parser = new JavaParser(tokens);
            ParseTree tree = parser.compilationUnit();

            JavaVisitor visitor = new JavaVisitor();
            visitor.visit(tree);

            return visitor.getList();
        } else {
            throw new IOException();
        }
    }

    public static List<SyntaxStructure> analyzeCPPSyntaxTree(String filePath) throws IOException {
        if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            CPP14Lexer lexer = new CPP14Lexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CPP14Parser parser = new CPP14Parser(tokens);
            ParseTree tree = parser.translationunit();

            CPPVisitor visitor = new CPPVisitor();
            visitor.visit(tree);

            return visitor.getList();
        } else {

            throw new IOException();
        }
    }

    public static List<SyntaxStructure> analyzePythonSyntaxTree(String filePath) throws IOException {
        if (filePath.endsWith(".py")) {
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            Python3Lexer lexer = new Python3Lexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Python3Parser parser = new Python3Parser(tokens);
            ParseTree tree = parser.file_input();

            CPPVisitor visitor = new CPPVisitor();
            visitor.visit(tree);

            return visitor.getList();
        } else {

            throw new IOException();
        }
    }

    public static List<SyntaxStructure> getStructureTypeInInterval(String filePath, int start, int stop) throws IOException {
        try {
            List<SyntaxStructure> list = new ArrayList();
            if (filePath.endsWith(".java")) {
                for (SyntaxStructure ss : analyzeJavaSyntaxTree(filePath)) {
                    if (ss.getStartLine() >= start && ss.getStopLine() <= stop) {
                        list.add(ss);
                    }
                }
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
                for (SyntaxStructure ss : analyzeCPPSyntaxTree(filePath)) {
                    if (ss.getStartLine() >= start && ss.getStopLine() <= stop) {
                        list.add(ss);
                    }
                }
            } else if (filePath.endsWith(".py")) {
                for (SyntaxStructure ss : analyzePythonSyntaxTree(filePath)) {
                    if (ss.getStartLine() >= start && ss.getStopLine() <= stop) {
                        list.add(ss);
                    }
                }
            } else {
                return null;
            }
            return list;
        } catch (IOException ex) {
            System.out.println("ERROR: FilePath of analyseSyntaxTree: " + filePath + " does not exist!");
            throw new IOException();
        }
    }


    /*---------------------------------------------------------------------------------------
                                        Main function
    ---------------------------------------------------------------------------------------*/
    public static List<MergeEvent> searchAllMerges(String repositoryPath, int linesContext) throws IOException {

        //Main list
        List<MergeEvent> list = new ArrayList<>();

        //MergeEvent's field
        CommitData hash;
        List<CommitData> parents = new ArrayList<>();
        List<ConflictFile> conflictFiles = new ArrayList<>();
        CommitData commonAncestorOfParents;

        //ConflictFile's field
        String fileName;
        String filePath;
        List<ConflictRegion> conflictRegion = new ArrayList<>();

        //ConflictRegion's field
        List<String> afterContext = new ArrayList<>();
        List<String> beforeContext = new ArrayList<>();
        List<String> v1 = new ArrayList<>();
        List<String> v2 = new ArrayList<>();
        List<String> solution = new ArrayList<>();
        List<String> solutionWithoutContext = new ArrayList<>();
        int beginLine;
        int separatorLine;
        int endLine;
        int solutionFirstLine;
        int solutionFinalLine;
        int originalV1FirstLine;
        int originalV2FirstLine;

        //Assistants
        ReturnNewLineNumber rnln = new ReturnNewLineNumber();
        String[] auxArray;
        String insideFilePath;
        List<String> allFile;
        double progress;
        double analysed = 0.0;
        double analysedPercentage = 0.0;
        File sandbox = RepositoryAnalysis.createSandbox(repositoryPath);
        int auxInt;

        //Start
        try {
            //Getting all merges's hashes
            List<String> allMerges = Git.giveAllMerges(repositoryPath);

            //Scanning and processing the hash list
            for (String merge : allMerges) {

                //Getting hash from merge
                auxArray = merge.split(",");
                hash = new CommitData(auxArray[1], repositoryPath);

                //Getting parents from merge
                for (String parent : auxArray[0].split(" ")) {
                    parents.add(new CommitData(parent, repositoryPath));
                }

                //Getting commonAncestorOfParents from parents's array
                commonAncestorOfParents = new CommitData(Git.mergeBaseCommand(repositoryPath, Arrays.asList(merge.split(",")[0].split(" "))), repositoryPath);

                //Moving to first parent
                Git.checkout(parents.get(0).getCommitHash(), repositoryPath);

                //Checking if merge is a conflcit 
                if (Git.mergeIsConflicting(parents.get(1).getCommitHash(), repositoryPath, false, false)) {

                    //Processing conflcit
                    for (FileDiff fileDiff : Git.diff(repositoryPath, "", "", false)) {
                        //
                        if (!fileDiff.getLines().isEmpty()) {
                            //Getting file name ("if" to differentiate the operating system: CMD and Linux)

                            if (repositoryPath.contains("\\")) {
                                filePath = repositoryPath + fileDiff.getFilePathSource().replaceAll("/", "\\\\");
                                insideFilePath = fileDiff.getFilePathSource().replaceAll("/", "\\\\");
                            } else {
                                filePath = repositoryPath + fileDiff.getFilePathSource();
                                insideFilePath = fileDiff.getFilePathSource();
                            }
                            auxArray = fileDiff.getFilePathSource().split("/");
                            fileName = auxArray[auxArray.length - 1];

                            //Getting conflcit file content
                            allFile = RepositoryAnalysis.getFileContent(repositoryPath + fileDiff.getFilePathSource());

                            //Geting conflict regions from conflict file
                            for (int i = 0; i < allFile.size(); i++) {
                                if (allFile.get(i).contains("<<<<<<")) {
                                    beginLine = i + 1;
                                    for (int j = i - linesContext; j < i; j++) {
                                        if (j < 0) {
                                            j = -1;
                                        } else {
                                            beforeContext.add(allFile.get(j));
                                        }
                                    }
                                    i++;
                                    while (!allFile.get(i).contains("=====")) {
                                        v1.add(allFile.get(i));
                                        i++;
                                    }
                                    separatorLine = i + 1;
                                    i++;
                                    while (!allFile.get(i).contains(">>>>>")) {
                                        v2.add(allFile.get(i));
                                        i++;
                                    }
                                    endLine = i + 1;
                                    for (int j = i + 1; j < i + 1 + linesContext; j++) {
                                        if (j >= allFile.size()) {
                                            break;
                                        } else {
                                            afterContext.add(allFile.get(j));
                                        }
                                    }
                                    //Getting original v1 and v2 first line
                                    originalV1FirstLine = -1;
                                    originalV2FirstLine = -1;
                                    if (!v1.isEmpty()) {
                                        Git.checkout(parents.get(0).getCommitHash(), sandbox.getPath());
                                        originalV1FirstLine = rnln.initReturnNewLineNumberFile(sandbox.getPath(), filePath, sandbox.getPath() + insideFilePath, beginLine + 1);
                                        Git.checkout("master", sandbox.getPath());
                                    }
                                    if (!v2.isEmpty()) {
                                        Git.checkout(parents.get(1).getCommitHash(), sandbox.getPath());
                                        originalV2FirstLine = rnln.initReturnNewLineNumberFile(sandbox.getPath(), filePath, sandbox.getPath() + insideFilePath, separatorLine + 1);
                                        Git.checkout("master", sandbox.getPath());
                                    }

                                    //Getting solution
                                    Git.checkout(hash.getCommitHash(), sandbox.getPath());
                                    if (!beforeContext.isEmpty()) {
                                        solutionFirstLine = rnln.initReturnNewLineNumberFile(sandbox.getPath(), filePath, sandbox.getPath() + insideFilePath, beginLine - 1);
                                    } else {
                                        solutionFirstLine = 0;
                                    }
                                    if (!afterContext.isEmpty()) {
                                        solutionFinalLine = rnln.initReturnNewLineNumberFile(sandbox.getPath(), filePath, sandbox.getPath() + insideFilePath, endLine + 1);
                                    } else {
                                        solutionFinalLine = 0;
                                    }
                                    if(solutionFirstLine == 0 && solutionFinalLine == 0){
                                        solution = getFileContent(sandbox.getPath() + insideFilePath);
                                        solution.add(0,"<SOF>");
                                        solution.add("<EOF>");
                                    } else if (solutionFirstLine == 0){
                                        solution = ListUtils.getSubList(getFileContent(sandbox.getPath() + insideFilePath),0, solutionFinalLine - 1);
                                        solution.add(0,"<SOF>");
                                    } else if (solutionFinalLine == 0){
                                        solution = ListUtils.getSubList(getFileContent(sandbox.getPath() + insideFilePath),solutionFirstLine - 1,getFileContent(sandbox.getPath() + insideFilePath).size() - 1);
                                        solution.add("<EOF>");
                                    } else if (solutionFirstLine > 0 && solutionFinalLine > 0) {
                                        solution = ListUtils.getSubList(getFileContent(sandbox.getPath() + insideFilePath), solutionFirstLine - 1, solutionFinalLine - 1);
                                    }
                                    Git.checkout("master", sandbox.getPath());

                                    //Adding a new conflict region
                                    conflictRegion.add(new ConflictRegion(new ArrayList<>(beforeContext), new ArrayList<>(afterContext), new ArrayList<>(v1),
                                            new ArrayList<>(v2), new ArrayList<>(solution), beginLine, separatorLine, endLine, originalV1FirstLine, originalV2FirstLine));

                                    //Reseting variables
                                    beforeContext.clear();
                                    afterContext.clear();
                                    v1.clear();
                                    v2.clear();
                                    solution.clear();
                                }
                            }

                            //Adding a new list of conflcit regions
                            conflictFiles.add(new ConflictFile(fileName, filePath, new ArrayList<>(conflictRegion)));

                            //Reseting conflictRegion
                            conflictRegion.clear();

                        }

                        //Search and getting special types of conflcit
                        for (String line : fileDiff.getAllMessage()) {
                            if (line.startsWith("* Unmerged path")) {
                                auxArray = line.split("/");
                                conflictFiles.add(new ConflictFile(auxArray[auxArray.length - 1], null, null));
                            }
                        }

                    }

                    //Aborting conflictuos merge
                    Git.mergeAbort(repositoryPath);

                }

                //Return to master and reseting repository
                Git.checkout("master", repositoryPath);
                Git.reset(repositoryPath, true, false, false, null);
                Git.clean(repositoryPath, true, 0);

                //Adding merge event in list
                list.add(new MergeEvent(hash, new ArrayList<>(parents), new ArrayList<>(conflictFiles), commonAncestorOfParents));

                //Reseting conflict files and parents
                conflictFiles.clear();
                parents.clear();

                //Progress
                progress = Math.ceil((analysed / allMerges.size()) * 100);
                if (progress > analysedPercentage) {
                    System.out.println((int) progress + "%...");
                    analysedPercentage = progress;
                }
                analysed = analysed + 1.0;

            }
            deleteDirectory(sandbox);
            for (MergeEvent merge : list) {
                for (ConflictFile file : merge.getConflictFiles()) {
                    if (!file.getConflictRegion().isEmpty()) {
                        for (ConflictRegion region : file.getConflictRegion()) {
                            region.setSyntaxV1SyntaxV2(repositoryPath, file.getFilePath(), merge.getParents().get(0).getCommitHash(), merge.getParents().get(1).getCommitHash());
                        }
                    }
                }
            }
            return list;

        } catch (CheckoutError ex) {
            System.out.println("ERROR: CheckoutError error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (NoRemoteForTheCurrentBranch ex) {
            System.out.println("ERROR: NoRemoteForTheCurrentBranch error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (ThereIsNoMergeInProgress ex) {
            System.out.println("ERROR: ThereIsNoMergeInProgress error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (ThereIsNoMergeToAbort ex) {
            System.out.println("ERROR: ThereIsNoMergeToAbort error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (AlreadyUpToDate ex) {
            System.out.println("ERROR: AlreadyUpToDate error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (NotSomethingWeCanMerge ex) {
            System.out.println("ERROR: NotSomethingWeCanMerge error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (InvalidCommitHash ex) {
            System.out.println("ERROR: InvalidCommitHash error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (UnknownSwitch ex) {
            System.out.println("ERROR: UnknownSwitch error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (RefusingToClean ex) {
            System.out.println("ERROR: RefusingToClean error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (IsOutsideRepository ex) {
            System.out.println("ERROR: IsOutsideRepository error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (InvalidDocument ex) {
            System.out.println("ERROR: InvalidDocument error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("ERROR: LocalRepositoryNotAGitRepository error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (PathDontExist ex) {
            System.out.println("ERROR: PathDontExist error!");
            deleteDirectory(sandbox);
            throw new IOException();
        } catch (IOException ex) {
            deleteDirectory(sandbox);
            throw new IOException();
        }
    }

}
