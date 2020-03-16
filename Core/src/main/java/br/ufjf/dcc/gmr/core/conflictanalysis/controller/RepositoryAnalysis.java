package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.CommitData;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictFile;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.JavaVisitor;
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
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public interface RepositoryAnalysis {

    public static List<String> getFileContent(String folderPath) throws IOException {
        List<String> content = new ArrayList<>();
        File file = new File(folderPath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            content.add(st);
        }
        return content;
    }

    public static List<SyntaxStructure> analyzeJavaSyntaxTree(String filePath) throws IOException {

        ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
        JavaLexer lexer = new JavaLexer(fileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        JavaVisitor visitor = new JavaVisitor();
        visitor.visit(tree);

        return visitor.getList();
    }

    public static List<SyntaxStructure> getStructureTypeInInterval(String filePath, int start, int stop) throws IOException {
        List<SyntaxStructure> list = new ArrayList<>();
        for (SyntaxStructure ss : analyzeJavaSyntaxTree(filePath)) {
            if (ss.isOneLine() && ss.getStart().getLine() >= start && ss.getStop().getLine() <= stop) {
                start = ss.getStart().getLine() + 1;
                list.add(ss);
            }
            if (start > stop) {
                break;
            }
        }
        return list;
    }

    public static List<SyntaxStructure> getStructureTypeInInterval(List<SyntaxStructure> main, int start, int stop) throws IOException {
        List<SyntaxStructure> list = new ArrayList<>();
        for (SyntaxStructure ss : main) {
            if (ss.isOneLine() && ss.getStart().getLine() >= start && ss.getStop().getLine() <= stop) {
                start = ss.getStart().getLine() + 1;
                list.add(ss);
            }
            if (start > stop) {
                break;
            }
        }
        return list;
    }
    
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
        List<ConflictRegion> conflictRegion = new ArrayList<>();

        //ConflictRegion's field
        List<String> afterContext = new ArrayList<>();
        List<String> beforeContext = new ArrayList<>();
        List<String> v1 = new ArrayList<>();
        List<String> v2 = new ArrayList<>();
        int beginLine;
        int separatorLine;
        int endLine;

        //Assistants
        String[] auxArray;
        List<String> allFile;
        double progress;
        double analysed = 0.0;
        double analysedPercentage = 0.0;

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
                            if (fileDiff.getFilePathSource().contains("/")) {
                                auxArray = fileDiff.getFilePathSource().split("/");
                            } else {
                                auxArray = fileDiff.getFilePathSource().split("\\");
                            }
                            fileName = auxArray[auxArray.length - 1];

                            //Getting conflcit file content
                            allFile = RepositoryAnalysis.getFileContent(repositoryPath + fileDiff.getFilePathSource());

                            //Geting conflict regions from conflict file
                            for (int i = 0; i < allFile.size(); i++) {
                                if (allFile.get(i).contains("<<<<<<")) {
                                    beginLine = i + 1;
                                    for (int j = i - linesContext; j < i; j++) {
                                        if (j < 0) {
                                            j = 1;
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
                                        if (j == allFile.size()) {
                                            break;
                                        } else {
                                            afterContext.add(allFile.get(j));
                                        }
                                    }
                                    //Adding a new conflict region
                                    conflictRegion.add(new ConflictRegion(new ArrayList<>(beforeContext), new ArrayList<>(afterContext), new ArrayList<>(v1), new ArrayList<>(v2), beginLine, separatorLine, endLine));

                                    //Reseting variables
                                    beforeContext.clear();
                                    afterContext.clear();
                                    v1.clear();
                                    v2.clear();
                                }
                            }

                            //Adding a new list of conflcit regions
                            conflictFiles.add(new ConflictFile(fileName, new ArrayList<>(conflictRegion)));

                            //Reseting conflictRegion
                            conflictRegion.clear();

                        }

                        //Search and getting special types of conflcit
                        for (String line : fileDiff.getAllMessage()) {
                            if (line.startsWith("* Unmerged path")) {
                                auxArray = line.split("/");
                                conflictFiles.add(new ConflictFile(auxArray[auxArray.length - 1], null));
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
        } catch (CheckoutError ex) {
            System.out.println("ERROR: CheckoutError error!");
            throw new IOException();
        } catch (NoRemoteForTheCurrentBranch ex) {
            System.out.println("ERROR: NoRemoteForTheCurrentBranch error!");
            throw new IOException();
        } catch (ThereIsNoMergeInProgress ex) {
            System.out.println("ERROR: ThereIsNoMergeInProgress error!");
            throw new IOException();
        } catch (ThereIsNoMergeToAbort ex) {
            System.out.println("ERROR: ThereIsNoMergeToAbort error!");
            throw new IOException();
        } catch (AlreadyUpToDate ex) {
            System.out.println("ERROR: AlreadyUpToDate error!");
            throw new IOException();
        } catch (NotSomethingWeCanMerge ex) {
            System.out.println("ERROR: NotSomethingWeCanMerge error!");
            throw new IOException();
        } catch (InvalidCommitHash ex) {
            System.out.println("ERROR: InvalidCommitHash error!");
            throw new IOException();
        } catch (UnknownSwitch ex) {
            System.out.println("ERROR: UnknownSwitch error!");
            throw new IOException();
        } catch (RefusingToClean ex) {
            System.out.println("ERROR: RefusingToClean error!");
            throw new IOException();
        } catch (IsOutsideRepository ex) {
            System.out.println("ERROR: IsOutsideRepository error!");
            throw new IOException();
        } catch (InvalidDocument ex) {
            System.out.println("ERROR: InvalidDocument error!");
            throw new IOException();
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("ERROR: LocalRepositoryNotAGitRepository error!");
            throw new IOException();
        } catch (IOException ex) {
            throw new IOException();
        }

        return list;
    }

   

}
