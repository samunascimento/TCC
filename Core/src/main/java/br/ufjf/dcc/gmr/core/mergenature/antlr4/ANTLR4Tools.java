package br.ufjf.dcc.gmr.core.mergenature.antlr4;

import br.ufjf.dcc.gmr.core.exception.FileNotExistInCommitException;
import br.ufjf.dcc.gmr.core.mergenature.controller.Translator;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java9.Java9Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java9.Java9Parser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3.Python3Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3.Python3Parser;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.CPPVisitor;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.Java9Visitor;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.JavaVisitor;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.Python3Visitor;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Auxiliaries methods for ANTLR4's utilities
 *
 * @author João Pedro Lima
 * @since 14-12-2020
 */
public class ANTLR4Tools {

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
                comments = getCommentsFromChannel2(tokens, true, Language.JAVA);
            } else {
                visitor = new JavaVisitor(false);
                comments = getCommentsFromChannel2(tokens, true, Language.JAVA);
            }
            visitor.visit(tree);
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzeJava9SyntaxTree(String filePathProjectAsRoot, String commit, String repositoryPath) throws IOException {
        if (filePathProjectAsRoot.endsWith(".java")) {
            String fileContent;
            try {
                fileContent = ListUtils.getTextListStringToString(Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath));
            } catch (FileNotExistInCommitException ex) {
                throw new IOException(ex);
            }
            List<SyntaxStructure> comments;
            Java9Lexer lexer = new Java9Lexer(new ANTLRInputStream(fileContent));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Java9Parser parser = new Java9Parser(tokens);
            ParseTree tree = null;
            try {
                tree = parser.compilationUnit();
            } catch (Exception ex) {
                System.out.println("");
            }
            Java9Visitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new Java9Visitor(true);
            } else {
                visitor = new Java9Visitor(false);
            }
            visitor.visit(tree);
            comments = getCommentsFromChannel2(tokens, true, Language.JAVA);
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
                comments = getCommentsFromChannel2(tokens, true, Language.JAVA);
            } else {
                visitor = new Java9Visitor(false);
                comments = getCommentsFromChannel2(tokens, false, Language.JAVA);
            }
            visitor.visit(tree);
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzeCPPSyntaxTree(String filePathProjectAsRoot, String commit, String repositoryPath) throws IOException {
        if (filePathProjectAsRoot.endsWith(".cpp") || filePathProjectAsRoot.endsWith(".h")) {
            String fileContent;
            try {
                fileContent = ListUtils.getTextListStringToString(Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath));
            } catch (FileNotExistInCommitException ex) {
                throw new IOException(ex);
            }
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
            comments = getCommentsFromChannel2(tokens, true, Language.CPP);
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
                comments = getCommentsFromChannel2(tokens, true, Language.CPP);
            } else {
                visitor = new CPPVisitor(false);
                comments = getCommentsFromChannel2(tokens, true, Language.CPP);
            }
            visitor.visit(tree);
            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzePythonSyntaxTree(String filePathProjectAsRoot, String commit, String repositoryPath) throws IOException {
        if (filePathProjectAsRoot.endsWith(".py")) {
            String fileContent;
            try {
                fileContent = ListUtils.getTextListStringToString(Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath));
            } catch (FileNotExistInCommitException ex) {
                throw new IOException(ex);
            }
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
            comments = getCommentsFromChannel2(tokens, true, Language.PYTHON);
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
                comments = getCommentsFromChannel2(tokens, true, Language.PYTHON);
            } else {
                visitor = new Python3Visitor(false);
                comments = getCommentsFromChannel2(tokens, true, Language.PYTHON);
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
                results = analyzeCPPSyntaxTree(filePathProjectAsRoot, commit, repositoryPath);
            } else if (filePathProjectAsRoot.endsWith(".py")) {
                results = analyzePythonSyntaxTree(filePathProjectAsRoot, commit, repositoryPath);
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
            outmostedNormalAnalysis = getOutmostStructures(normalAnalysis);
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

    public static List<SyntaxStructure> getCommentsFromChannel2(CommonTokenStream tokens, boolean warning, Language language) throws IOException {
        List<SyntaxStructure> result = new ArrayList<>();
        for (int index = 0; index < tokens.size(); index++) {
            List<Token> hiddenTokensToLeft = tokens.getHiddenTokensToLeft(index, 2);
            for (int i = 0; hiddenTokensToLeft != null && i < hiddenTokensToLeft.size(); i++) {
                if (hiddenTokensToLeft.get(i).getChannel() == 2) {
                    result.add(new SyntaxStructure(hiddenTokensToLeft.get(i), warning, language));

                }
            }
        }
        return result;
    }

    public static ANTLR4Results filterAndGetOutmost(ANTLR4Results inputResults, int beginLine, int endLine) {

        List<SyntaxStructure> normalAnalysis = new ArrayList<>();
        List<SyntaxStructure> commentAnalysis = new ArrayList<>();
        List<SyntaxStructure> outmostedNormalAnalysis = new ArrayList<>();
        List<SyntaxStructure> outmostedCommentAnalysis = new ArrayList<>();
        boolean isOutmost = false;

        for (SyntaxStructure ss : inputResults.normalAnalysis) {
            if (ss.getStartLine() >= beginLine && ss.getStopLine() <= endLine) {
                normalAnalysis.add(ss);
            }
        }

        outmostedNormalAnalysis = getOutmostStructures(new ArrayList<>(normalAnalysis));

        for (SyntaxStructure ss : inputResults.commentAnalysis) {
            if (ss.getStartLine() >= beginLine && ss.getStartLine() <= endLine || ss.getStopLine() >= beginLine && ss.getStopLine() <= endLine) {
                commentAnalysis.add(ss);
            }
        }

        for (SyntaxStructure comment : commentAnalysis) {
            isOutmost = true;
            for (SyntaxStructure outmostedNormal : outmostedNormalAnalysis) {
                if (comment.getStartCharIndex() >= outmostedNormal.getStartCharIndex() && comment.getStopCharIndex() <= outmostedNormal.getStopCharIndex()) {
                    isOutmost = false;
                    break;
                }
            }
            if (isOutmost) {
                outmostedCommentAnalysis.add(comment);
            }
        }

        return new ANTLR4Results(normalAnalysis, commentAnalysis, outmostedNormalAnalysis, outmostedCommentAnalysis);
    }

    public static List<SyntaxStructure> getOutmostStructures(List<SyntaxStructure> rawList) {
        List<SyntaxStructure> result = rawList;
        List<SyntaxStructure> toRemove = new ArrayList();
        toRemove.clear();
        if (!result.isEmpty()) {
            for (int i = 0; i < result.size(); i++) {
                for (int j = i + 1; j < result.size(); j++) {
                    if ((result.get(i).getStartCharIndex() <= result.get(j).getStartCharIndex()
                            && result.get(i).getStopCharIndex() >= result.get(j).getStopCharIndex())
                            && !result.get(i).equals(result.get(j))) {
                        toRemove.add(result.get(j));
                    }
                    if (result.get(i).getStopCharIndex() < result.get(j).getStartCharIndex()) {
                        break;
                    }
                }
            }
        }
        for (SyntaxStructure ssList : toRemove) {
            result.remove(ssList);
        }
        return result;

    }

    public static List<String> getTranslatedStrucutures(List<SyntaxStructure> rawList, String filePath) {
        List<String> translatedList;
        List<String> untranslatedList = new ArrayList<>();
        if (rawList.isEmpty()) {
            translatedList = new ArrayList<>();
            translatedList.add("Nothing");
        } else {
            for (SyntaxStructure struc : rawList) {
                if (!untranslatedList.contains(struc.getStructureType())) {
                    untranslatedList.add(struc.getStructureType());
                }
            }
            if (filePath.endsWith(".java")) {
                translatedList = Translator.JavaTranslator(untranslatedList);
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
                translatedList = Translator.CPPTranslator(untranslatedList);
            } else if (filePath.endsWith(".py")) {
                translatedList = Translator.PythonTranslator(untranslatedList);
            } else {
                return null;
            }
            if (rawList.get(0).getWarning()) {
                translatedList.add("WARNING!");
            }
        }
        return translatedList;
    }

}
