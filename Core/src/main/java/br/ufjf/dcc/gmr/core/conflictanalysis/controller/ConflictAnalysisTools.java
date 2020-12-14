package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.CPPVisitor;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.Python3Visitor;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.JavaVisitor;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.Java9Visitor;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java9.Java9Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java9.Java9Parser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3.Python3Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3.Python3Parser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
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
        sandbox = new File(Paths.get(repositoryPath).getParent().toString() + File.separator + ".repositoryAnalysisSandbox_" + projectName + File.separator);
        try {
            Git.clone(repositoryPath, Paths.get(repositoryPath).getParent().toString(), ".repositoryAnalysisSandbox_" + projectName + File.separator);
        } catch (RepositoryNotFound ex) {
            System.out.println("ERROR: RepositoryNotFound error!");
            throw new IOException();
        } catch (UrlNotFound ex) {
            System.out.println("ERROR: UrlNotFound error!");
            throw new IOException();
        }
        return sandbox;
    }

    public static boolean isDirectory(File dir) {
        if (dir.isDirectory()) {
            return true;
        } else {
            return false;
        }
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

    public static ANTLR4Results analyzeJavaSyntaxTree(String filePath) throws IOException {
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
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzeJava9SyntaxTree(String filePathProjectAsRoot, String commit, String repositoryPath) throws IOException {
        if (filePathProjectAsRoot.endsWith(".java")) {
            String fileContent = ListUtils.getTextListStringToString(Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath));
            List<SyntaxStructure> comments;
            Java9Lexer lexer = new Java9Lexer(new ANTLRInputStream(fileContent));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Java9Parser parser = new Java9Parser(tokens);
            ParseTree tree = parser.compilationUnit();
            Java9Visitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new Java9Visitor(true);
            } else {
                visitor = new Java9Visitor(false);
            }
            visitor.visit(tree);
            comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzeJava9SyntaxTree(String filePath) throws IOException {
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
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzeCPPSyntaxTree(String filePathProjectAsRoot, String commit, String repositoryPath) throws IOException {
        if (filePathProjectAsRoot.endsWith(".java")) {
            String fileContent = ListUtils.getTextListStringToString(Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath));
            List<SyntaxStructure> comments;
            CPP14Lexer lexer = new CPP14Lexer(new ANTLRInputStream(fileContent));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CPP14Parser parser = new CPP14Parser(tokens);
            ParseTree tree = parser.translationunit();
            CPPVisitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new CPPVisitor(true);
            } else {
                visitor = new CPPVisitor(false);
            }
            visitor.visit(tree);
            comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzeCPPSyntaxTree(String filePath) throws IOException {
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
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzePythonSyntaxTree(String filePathProjectAsRoot, String commit, String repositoryPath) throws IOException {
        if (filePathProjectAsRoot.endsWith(".java")) {
            String fileContent = ListUtils.getTextListStringToString(Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath));
            List<SyntaxStructure> comments;
            Python3Lexer lexer = new Python3Lexer(new ANTLRInputStream(fileContent));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Python3Parser parser = new Python3Parser(tokens);
            ParseTree tree = parser.file_input();
            Python3Visitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new Python3Visitor(true);
            } else {
                visitor = new Python3Visitor(false);
            }
            visitor.visit(tree);
            comments = ConflictAnalysisTools.getCommentsFromChannel2(tokens, true);
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzePythonSyntaxTree(String filePath) throws IOException {
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
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results getANTLR4Results(String filePathProjectAsRoot, String commit, String repositoryPath) throws IOException {
        try {
            ANTLR4Results results;
            if (filePathProjectAsRoot.endsWith(".java")) {
                results = analyzeJava9SyntaxTree(filePathProjectAsRoot, commit, repositoryPath);
            } else if (filePathProjectAsRoot.endsWith(".cpp") || filePathProjectAsRoot.endsWith(".h")) {
                results = analyzeCPPSyntaxTree(filePathProjectAsRoot);
            } else if (filePathProjectAsRoot.endsWith(".py")) {
                results = analyzePythonSyntaxTree(filePathProjectAsRoot);
            } else {
                return null;
            }
            return results;
        } catch (IOException ex) {
            System.out.println("ERROR: FilePath of analyseSyntaxTree: " + repositoryPath + filePathProjectAsRoot + " does not exist in!");
            throw ex;
        }
    }

    public static ANTLR4Results getANTLR4ResultsInInterval(String filePath, int start, int stop) throws IOException {
        try {
            ANTLR4Results results;
            List<SyntaxStructure> normalAnalysis = new ArrayList<>();
            List<SyntaxStructure> commentAnalysis = new ArrayList<>();
            List<SyntaxStructure> outmostedNormalAnalysis = new ArrayList<>();
            List<SyntaxStructure> outmostedCommentAnalysis = new ArrayList<>();
            boolean isOutmost;
            if (filePath.endsWith(".java")) {
                results = analyzeJava9SyntaxTree(filePath);
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
                results = analyzeCPPSyntaxTree(filePath);
            } else if (filePath.endsWith(".py")) {
                results = analyzePythonSyntaxTree(filePath);
            } else {
                return null;
            }
            for (SyntaxStructure ss : results.getNormalAnalysis()) {
                if (ss.getStartLine() >= start && ss.getStopLine() <= stop) {
                    normalAnalysis.add(ss);
                }
            }
            for (SyntaxStructure ss : results.getCommentAnalysis()) {
                if ((ss.getStartLine() >= start && ss.getStartLine() <= stop) || (ss.getStopLine() >= start && ss.getStopLine() <= stop)) {
                    commentAnalysis.add(ss);
                }
            }
            isOutmost = true;
            outmostedNormalAnalysis = getOutmostStructures(results.getNormalAnalysis(), start, stop);
            for (SyntaxStructure comment : commentAnalysis) {
                isOutmost = true;
                for (SyntaxStructure ss : outmostedNormalAnalysis) {
                    if (ss.getStartCharIndex() <= comment.getStartCharIndex() && ss.getStopCharIndex() >= comment.getStopCharIndex()) {
                        isOutmost = false;
                        break;
                    }
                }
                if (isOutmost) {
                    outmostedCommentAnalysis.add(comment);
                }
            }
            return new ANTLR4Results(normalAnalysis, commentAnalysis, outmostedNormalAnalysis, outmostedCommentAnalysis);

        } catch (IOException ex) {
            System.out.println("ERROR: FilePath of analyseSyntaxTree: " + filePath + " does not exist!");
            throw ex;
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

    public static ANTLR4Results fillOutmost(ANTLR4Results results, int beginLine, int endLine) {
        List<SyntaxStructure> filteredComments = new ArrayList<>();
        List<SyntaxStructure> outmostedFilteredComments = new ArrayList<>();
        boolean isOutmost;
        results.setOutmostedNormalAnalysis(getOutmostStructures(results.getNormalAnalysis(), beginLine, endLine));
        for (SyntaxStructure ss : results.getCommentAnalysis()) {
            if ((ss.getStartLine() >= beginLine && ss.getStartLine() <= endLine) || (ss.getStopLine() >= beginLine && ss.getStopLine() <= endLine)) {
                filteredComments.add(ss);
            }
        }
        for (SyntaxStructure comment : filteredComments) {
            isOutmost = true;
            for (SyntaxStructure ss : outmostedFilteredComments) {
                if (ss.getStartCharIndex() <= comment.getStartCharIndex() && ss.getStopCharIndex() >= comment.getStopCharIndex()) {
                    isOutmost = false;
                    break;
                }
            }
            if (isOutmost) {
                outmostedFilteredComments.add(comment);
            }
        }
        results.setOutmostedCommentAnalysis(outmostedFilteredComments);
        return results;

    }

    public static List<SyntaxStructure> getOutmostStructures(List<SyntaxStructure> rawList, int beginLine, int endLine) {
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
                    for (int j = i + 1; j < rawList.size(); j++) {
                        if ((rawList.get(i).getStartCharIndex() <= rawList.get(j).getStartCharIndex()
                                && rawList.get(i).getStopCharIndex() >= rawList.get(j).getStopCharIndex())
                                && !rawList.get(i).equals(rawList.get(j))) {
                            list.add(rawList.get(j));
                        }
                        if (rawList.get(i).getStopCharIndex() < rawList.get(j).getStartCharIndex()) {
                            break;
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
