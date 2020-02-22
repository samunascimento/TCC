package br.ufjf.dcc.gmr.core.conflictanalysis.models;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.conflictanalysis.models.ConflictFile;
import br.ufjf.dcc.gmr.core.conflictanalysis.models.ConflictRegion;
import br.ufjf.dcc.gmr.core.conflictanalysis.models.MergeEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            if (ss.isOneLine() && ss.getStartLine() >= start && ss.getFinalLine() <= stop) {
                start = ss.getStartLine() + 1;
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
            if (ss.isOneLine() && ss.getStartLine() >= start && ss.getFinalLine() <= stop) {
                start = ss.getStartLine() + 1;
                list.add(ss);
            }
            if (start > stop) {
                break;
            }
        }
        return list;
    }

    public static List<MergeEvent> searchAllConflicts(String repositoryPath, int linesContext, boolean printProgress) throws IOException {

        List<String> allMerges = null;
        String[] family = null;
        String[] parents = null;
        String[] auxArray = null;
        MergeEvent mergeEvent = new MergeEvent();
        List<MergeEvent> list = new ArrayList<>();
        ConflictFile conflictFile = new ConflictFile();
        ConflictRegion conflictRegion = new ConflictRegion();
        List<String> conflict = new ArrayList<>();
        int auxInt = 0;
        int soType = -1;
        double analysed = 1.0;
        double analysedPercentage = 0.0;
        double progress = 0.0;

        try {
            allMerges = Git.giveAllMerges(repositoryPath);
            if (repositoryPath.contains("\\")) {
                soType = 1;
                if (!repositoryPath.endsWith("\\")) {
                    repositoryPath = repositoryPath + "\\";
                }
            } else if (repositoryPath.contains("/")) {
                soType = 0;
                if (!repositoryPath.endsWith("/")) {
                    repositoryPath = repositoryPath + "/";
                }
            }
            for (String merge : allMerges) {
                family = merge.split(",");
                mergeEvent.setHash(new CommitData(family[1], repositoryPath));
                parents = family[0].split(" ");
                for (String parent : parents) {
                    mergeEvent.addParents(new CommitData(parent, repositoryPath));
                }
                mergeEvent.setCommonAncestorOfParents(new CommitData(Git.mergeBaseCommand(repositoryPath, Arrays.asList(parents)), repositoryPath));
                Git.reset(repositoryPath, true, false, false, null);
                Git.clean(repositoryPath, true, 0);
                Git.checkout(mergeEvent.getParents().get(0).getCommitHash(), repositoryPath);
                if (Git.mergeIsConflicting(mergeEvent.getParents().get(1).getCommitHash(), repositoryPath, false, false)) {
                    mergeEvent.setConflict(true);
                    for (FileDiff fileDiff : Git.diff(repositoryPath, "", "", false)) {
                        if (!fileDiff.getLines().isEmpty()) {
                            switch (soType) {
                                case 0:
                                    auxArray = fileDiff.getFilePathSource().split("/");
                                    break;
                                case 1:
                                    auxArray = fileDiff.getFilePathSource().split("\\");
                                    break;
                            }
                            conflictFile.setFileName(auxArray[auxArray.length - 1]);
                            conflict = getFileContent(repositoryPath + fileDiff.getFilePathSource());
                            auxInt = conflict.size();
                            for (int i = 0; i < auxInt; i++) {
                                if (conflict.get(i).contains("<<<<<<")) {
                                    conflictRegion.setBeginLine(i + 1);
                                    for (int j = i - linesContext; j < i; j++) {
                                        if (j < 0) {
                                            j = -1;
                                        } else {
                                            conflictRegion.getBeforeContext().add(conflict.get(j));
                                        }
                                    }
                                    i++;
                                    while (!conflict.get(i).contains("=====")) {
                                        conflictRegion.getV1().add(conflict.get(i));
                                        i++;
                                    }
                                    conflictRegion.setSeparatorLine(i + 1);
                                    i++;
                                    while (!conflict.get(i).contains(">>>>>")) {
                                        conflictRegion.getV2().add(conflict.get(i));
                                        i++;
                                    }
                                    conflictRegion.setEndLine(i + 1);
                                    for (int j = i + 1; j < i + 1 + linesContext; j++) {
                                        if (j == conflict.size()) {
                                            break;
                                        } else {
                                            conflictRegion.getAfterContext().add(conflict.get(j));
                                        }
                                    }
                                    conflictFile.addConflictRegion(conflictRegion);
                                    conflictRegion = new ConflictRegion();
                                }
                            }
                            mergeEvent.addConflictFiles(conflictFile);
                            conflictFile = new ConflictFile();
                            conflict.clear();
                        }
                        for (String line : fileDiff.getAllMessage()) {
                            if (line.startsWith("* Unmerged path")) {
                                auxArray = line.split("/");
                                conflictFile.setFileName(auxArray[auxArray.length - 1]);
                                mergeEvent.addConflictFiles(conflictFile);
                                conflictFile = new ConflictFile();
                            }
                        }
                    }
                    Git.mergeAbort(repositoryPath);
                }
                Git.checkout("master", repositoryPath);
                list.add(mergeEvent);
                mergeEvent = new MergeEvent();
                conflictFile = new ConflictFile();
                conflictRegion = new ConflictRegion();
                if (printProgress) {
                    progress = Math.ceil((analysed / allMerges.size()) * 100);
                    if (progress > analysedPercentage) {
                        System.out.println((int) progress + "%...");
                        analysedPercentage = progress;
                    }
                    analysed = analysed + 1.0;
                }
            }
        } catch (CheckoutError ex) {
            System.out.println("ERROR: CheckoutError error!");
        } catch (NoRemoteForTheCurrentBranch ex) {
            System.out.println("ERROR: NoRemoteForTheCurrentBranch error!");
        } catch (ThereIsNoMergeInProgress ex) {
            System.out.println("ERROR: ThereIsNoMergeInProgress error!");
        } catch (ThereIsNoMergeToAbort ex) {
            System.out.println("ERROR: ThereIsNoMergeToAbort error!");
        } catch (AlreadyUpToDate ex) {
            System.out.println("ERROR: AlreadyUpToDate error!");
        } catch (NotSomethingWeCanMerge ex) {
            System.out.println("ERROR: NotSomethingWeCanMerge error!");
        } catch (InvalidCommitHash ex) {
            System.out.println("ERROR: InvalidCommitHash error!");
        } catch (UnknownSwitch ex) {
            System.out.println("ERROR: UnknownSwitch error!");
        } catch (RefusingToClean ex) {
            System.out.println("ERROR: RefusingToClean error!");
        } catch (IsOutsideRepository ex) {
            System.out.println("ERROR: IsOutsideRepository error!");
        } catch (InvalidDocument ex) {
            System.out.println("ERROR: InvalidDocument error!");
        } catch (IOException ex) {
            throw new IOException();
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("ERROR: LocalRepositoryNotAGitRepository error!");
        }
        return list;
    }

    public static int returnNewLineNumber(String directory, String commitSource, String commitTarget, int originalLineNumber) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        //Verificar se a linha existe no arquivo original, e se existir
        List<String> output = new ArrayList<>();

        int counter = 0;
        output = Git.auxiliardiff(directory, commitSource, commitTarget);
        for (String line : output) {
            if (line.charAt(0) == '@' && line.charAt(1) == '@') {
                String c = line.substring(5);

            }

        }

        return 0;

    }
}
