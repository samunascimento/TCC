package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.visitors.CPPVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.visitors.Python3Visitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.visitors.JavaVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.visitors.Java9Visitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp.CPP14Lexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java9.Java9Lexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java9.Java9Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.python3.Python3Lexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.python3.Python3Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SSCShelf;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author João,Luan
 */
public class ConflictAnalysisTools {

    public static File createSandbox(String repositoryPath, String projectName) throws IOException, RepositoryAlreadyExist {
        File sandbox;
        if (repositoryPath.contains("\\")) {
            sandbox = new File(Paths.get(repositoryPath).getParent().toString() + "\\RepositoryAnalysisSandbox_" + projectName);
        } else {
            sandbox = new File(Paths.get(repositoryPath).getParent().toString() + "/RepositoryAnalysisSandbox_" + projectName);
        }
        try {
            Git.clone(repositoryPath, Paths.get(repositoryPath).getParent().toString(), "RepositoryAnalysisSandbox_" + projectName);
        } catch (RepositoryNotFound ex) {
            System.out.println("ERROR: RepositoryNotFound error!");
            throw new IOException();
        } catch (UrlNotFound ex) {
            System.out.println("ERROR: UrlNotFound error!");
            throw new IOException();
        }
        return sandbox;
    }

    public static boolean deleteDirectory(File dir) {
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

    public static SSCShelf analyzeJavaSyntaxTree(String filePath) throws IOException {
        if (filePath.endsWith(".java")) {
            List<SyntaxStructure> comments;
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            JavaLexer lexer = new JavaLexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaParser parser = new JavaParser(tokens);
            ParseTree tree = parser.compilationUnit();
            JavaVisitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new JavaVisitor(true);
                comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            } else {
                visitor = new JavaVisitor(false);
                comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            }
            visitor.visit(tree);
            return new SSCShelf(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static SSCShelf analyzeJava9SyntaxTree(String filePath) throws IOException {
        if (filePath.endsWith(".java")) {
            List<SyntaxStructure> comments;
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            Java9Lexer lexer = new Java9Lexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Java9Parser parser = new Java9Parser(tokens);
            ParseTree tree = parser.compilationUnit();
            Java9Visitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new Java9Visitor(true);
                comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            } else {
                visitor = new Java9Visitor(false);
                comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, false);
            }
            visitor.visit(tree);
            return new SSCShelf(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static SSCShelf analyzeCPPSyntaxTree(String filePath) throws IOException {
        if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
            List<SyntaxStructure> comments;
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            CPP14Lexer lexer = new CPP14Lexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CPP14Parser parser = new CPP14Parser(tokens);
            ParseTree tree = parser.translationunit();
            CPPVisitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new CPPVisitor(true);
                comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            } else {
                visitor = new CPPVisitor(false);
                comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            }
            visitor.visit(tree);
            return new SSCShelf(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static SSCShelf analyzePythonSyntaxTree(String filePath) throws IOException {
        if (filePath.endsWith(".py")) {
            List<SyntaxStructure> comments;
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            Python3Lexer lexer = new Python3Lexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Python3Parser parser = new Python3Parser(tokens);
            ParseTree tree = parser.file_input();
            Python3Visitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new Python3Visitor(true);
                comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            } else {
                visitor = new Python3Visitor(false);
                comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            }
            visitor.visit(tree);
            return new SSCShelf(visitor.getList(), comments);
        } else {

            throw new IOException();
        }
    }

    public static List<SyntaxStructure> getStructureTypeInInterval(String filePath, int start, int stop, boolean outmost) throws IOException {
        try {
            SSCShelf shelf;
            List<SyntaxStructure> result = new ArrayList();
            List<SyntaxStructure> comments = new ArrayList();
            if (filePath.endsWith(".java")) {
                shelf = analyzeJava9SyntaxTree(filePath);
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
                shelf = analyzeCPPSyntaxTree(filePath);
            } else if (filePath.endsWith(".py")) {
                shelf = analyzePythonSyntaxTree(filePath);
            } else {
                return null;
            }
            for (SyntaxStructure ss : shelf.getCommentAnalysis()) {
                if (ss.getStartLine() >= start && ss.getStopLine() <= stop) {
                    comments.add(ss);
                }
            }
            if (outmost) {
                boolean isOutmost = true;
                result = getOutmostStructures(shelf.getNormalAnalysis(), start, stop);
                for (SyntaxStructure comment : comments) {
                    isOutmost = true;
                    for (SyntaxStructure ss : result) {
                        if (ss.getStartCharIndex() <= comment.getStartCharIndex() && ss.getStopCharIndex() >= comment.getStopCharIndex()) {
                            isOutmost = false;
                            break;
                        }
                    }
                    if (isOutmost) {
                        result.add(comment);
                    }
                }
            } else {
                for (SyntaxStructure ss : shelf.getNormalAnalysis()) {
                    if (ss.getStartLine() >= start && ss.getStopLine() <= stop) {
                        result.add(ss);
                    }
                }
                result.addAll(comments);
            }
            return result;
        } catch (IOException ex) {
            System.out.println("ERROR: FilePath of analyseSyntaxTree: " + filePath + " does not exist!");
            throw new IOException();
        }
    }

    public static List<SyntaxStructure> getCommentsFromChannel2(CommonTokenStream tokens, boolean warning) throws IOException {
        List<SyntaxStructure> result = new ArrayList<>();
        for (int index = 0; index < tokens.size(); index++) {
            Token token = tokens.get(index);
            List<Token> hiddenTokensToLeft = tokens.getHiddenTokensToLeft(index, 2);
            for (int i = 0; hiddenTokensToLeft != null && i < hiddenTokensToLeft.size(); i++) {
                if (hiddenTokensToLeft.get(i).getChannel() == 2) {
                    result.add(new SyntaxStructure(hiddenTokensToLeft.get(i), warning));

                }
            }
        }
        return result;
    }

    private static List<SyntaxStructure> getOutmostStructures(List<SyntaxStructure> rawList, int beginLine, int endLine) {
        if (beginLine < 1 || endLine < 1) {
            return null;
        } else {
            int currentLine = beginLine;
            int currentColumn = 0;
            List<SyntaxStructure> list = new ArrayList();
            SyntaxStructure auxStructure = null;
            if (rawList != null) {
                while (currentLine <= endLine) {
                    auxStructure = null;
                    for (SyntaxStructure ss : rawList) {
                        if (ss.getStartLine() >= currentLine && ss.getStartCharIndex() >= currentColumn && ss.getStopLine() <= endLine) {
                            if (auxStructure == null) {
                                auxStructure = ss;
                            } else {
                                if (auxStructure.getStartLine() > ss.getStartLine()) {
                                    auxStructure = ss;
                                } else {
                                    if (auxStructure.getStartLine() == ss.getStartLine() && auxStructure.getStartCharIndex() > ss.getStartCharIndex()) {
                                        auxStructure = ss;
                                    }
                                }
                            }
                        }

                    }
                    if (auxStructure != null) {
                        list.add(auxStructure);
                        currentLine = auxStructure.getStopLine();
                        currentColumn = auxStructure.getStopCharIndex();
                    } else {
                        currentLine++;
                        currentColumn = 0;
                    }
                }
            } else {
                return null;
            }
            return list;
        }
    }
    
        private static List<SyntaxStructure> getOutmostStructures2(List<SyntaxStructure> rawList, int beginLine, int endLine) {
        if ((beginLine < 1 || endLine < 1) || rawList == null) {
            return null;
        } else {
            List<SyntaxStructure> list = new ArrayList();
            SyntaxStructure auxStructure = null;
            for (SyntaxStructure ss : rawList) {
                if (!(ss.getStartLine() >= beginLine && ss.getStopLine() <= endLine)) {
                    list.add(ss);
                }
            }
           for (SyntaxStructure ssList : list) {
                rawList.remove(ssList);
            }
           list.clear();
            if (!rawList.isEmpty()) {
                for (int i = 0; i < rawList.size(); i++) {
                    for (int j = i + 1 ; j < rawList.size(); j++) {
                        if ((rawList.get(i).getStartCharIndex() <= rawList.get(j).getStartCharIndex() 
                                && rawList.get(i).getStopCharIndex() >= rawList.get(j).getStopCharIndex()) 
                                && !rawList.get(i).equals(rawList.get(j))) {
                            list.add(rawList.get(j));
                        }
                    }
                }
            }
            for (SyntaxStructure ssList : list) {
                rawList.remove(ssList);
            }
            return rawList;
        }
    }
}
