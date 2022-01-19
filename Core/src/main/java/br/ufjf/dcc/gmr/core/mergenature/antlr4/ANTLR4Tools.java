package br.ufjf.dcc.gmr.core.mergenature.antlr4;

import br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException;
import br.ufjf.dcc.gmr.core.exception.ShowException;
import br.ufjf.dcc.gmr.core.mergenature.controller.Translator;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java9.Java9Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java9.Java9Parser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3.PythonLexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3.PythonParser;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.CPPVisitor;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.Java9Visitor;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.PythonVisitor;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.gui.TreeViewer;
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

    public static void writeSyntaxErrors(String fileName, String fileContent, List<SyntaxError> syntaxErrors) throws IOException {

        File directory = new File(System.getProperty("user.dir") + File.separator + "syntaxErrors" + File.separator + fileName.replaceAll("\\.", "-") + File.separator);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        MergeNatureTools.createAndWriteInFile(directory.getAbsolutePath() + File.separator + fileName, fileContent);
        String errors = "";
        for (SyntaxError syntaxError : syntaxErrors) {
            errors = errors + "\n\n\nLine: " + syntaxError.getLine() + "\nChar Position: " + syntaxError.getCharPositionInLine() + "\nError Message:\n" + syntaxError.getMessage();
        }
        MergeNatureTools.createAndWriteInFile(directory.getAbsolutePath() + File.separator + "errors.txt", errors.replaceFirst("\n\n\n", ""));
    }

    public static ANTLR4Results analyzeJava9SyntaxTree(String filePathProjectAsRoot, String commit, String repositoryPath, boolean printTree) throws IOException, OutOfMemoryError, NotGitRepositoryException, ShowException {
        if (filePathProjectAsRoot.endsWith(".java")) {
            String fileContent;
            fileContent = ListUtils.getTextListStringToString(Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath));
            List<SyntaxStructure> comments;
            Java9Lexer lexer = new Java9Lexer(new ANTLRInputStream(fileContent + (fileContent.endsWith("\n") ? "" : "\n")));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Java9Parser parser = new Java9Parser(tokens);
            SyntaxErrorListener listener = new SyntaxErrorListener();
            parser.addErrorListener(listener);
            ParseTree tree;
            try {
                tree = parser.compilationUnit();
            } catch (OutOfMemoryError ex) {
                throw ex;
            }
            Java9Visitor visitor = new Java9Visitor();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                comments = getCommentsFromChannel2(tokens, true, Language.JAVA);
                writeSyntaxErrors(MergeNatureTools.getFileName(filePathProjectAsRoot), fileContent, listener.getSyntaxErrors());
            } else {
                comments = getCommentsFromChannel2(tokens, false, Language.JAVA);
            }
            visitor.visit(tree);
            if (printTree) {
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();
            }
            return new ANTLR4Results(visitor.getList(), comments, listener.getSyntaxErrors());
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzeJava9SyntaxTree(String filePath, boolean printTree) throws IOException {
        if (filePath.endsWith(".java")) {
            String fileContent;
            fileContent = MergeNatureTools.getFileContentInString(filePath);
            List<SyntaxStructure> comments;
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            Java9Lexer lexer = new Java9Lexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Java9Parser parser = new Java9Parser(tokens);
            SyntaxErrorListener listener = new SyntaxErrorListener();
            parser.addErrorListener(listener);
            ParseTree tree;
            try {
                tree = parser.compilationUnit();
            } catch (OutOfMemoryError ex) {
                throw ex;
            }
            Java9Visitor visitor = new Java9Visitor();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                comments = getCommentsFromChannel2(tokens, true, Language.JAVA);
                writeSyntaxErrors(MergeNatureTools.getFileName(filePath), fileContent, listener.getSyntaxErrors());
            } else {
                comments = getCommentsFromChannel2(tokens, false, Language.JAVA);
            }
            visitor.visit(tree);
            if (printTree) {
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();
            }
            return new ANTLR4Results(visitor.getList(), comments, listener.getSyntaxErrors());
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzeCPPSyntaxTree(String filePathProjectAsRoot, String commit, String repositoryPath, boolean printTree) throws IOException, OutOfMemoryError, NotGitRepositoryException, ShowException {
        if (filePathProjectAsRoot.endsWith(".cpp") || filePathProjectAsRoot.endsWith(".h")
                || filePathProjectAsRoot.endsWith(".cc") || filePathProjectAsRoot.endsWith(".cxx")
                || filePathProjectAsRoot.endsWith(".cp") || filePathProjectAsRoot.endsWith(".hxx")
                || filePathProjectAsRoot.endsWith(".hpp")) {
            String fileContent;
            fileContent = ListUtils.getTextListStringToString(Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath));
            List<SyntaxStructure> comments;
            CPP14Lexer lexer = new CPP14Lexer(new ANTLRInputStream(fileContent + (fileContent.endsWith("\n") ? "" : "\n")));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CPP14Parser parser = new CPP14Parser(tokens);
            SyntaxErrorListener listener = new SyntaxErrorListener();
            parser.addErrorListener(listener);
            ParseTree tree;
            try {
                tree = parser.translationUnit();
            } catch (OutOfMemoryError ex) {
                throw ex;
            }
            CPPVisitor visitor = new CPPVisitor();
            if (parser.getNumberOfSyntaxErrors() > 0) {

                comments = getCommentsFromChannel2(tokens, true, Language.CPP);
                writeSyntaxErrors(MergeNatureTools.getFileName(filePathProjectAsRoot), fileContent, listener.getSyntaxErrors());
            } else {
                comments = getCommentsFromChannel2(tokens, false, Language.CPP);

            }
            visitor.visit(tree);
            if (printTree) {
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();
            }
            return new ANTLR4Results(visitor.getList(), comments, listener.getSyntaxErrors());
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzeCPPSyntaxTree(String filePath, boolean printTree) throws IOException {
        if (filePath.endsWith(".cpp") || filePath.endsWith(".h")
                || filePath.endsWith(".cc") || filePath.endsWith(".cxx")
                || filePath.endsWith(".cp") || filePath.endsWith(".hxx")
                || filePath.endsWith(".hpp")) {
            String fileContent;
            fileContent = MergeNatureTools.getFileContentInString(filePath);
            List<SyntaxStructure> comments;
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            CPP14Lexer lexer = new CPP14Lexer(new ANTLRInputStream(fileContent));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CPP14Parser parser = new CPP14Parser(tokens);
            SyntaxErrorListener listener = new SyntaxErrorListener();
            parser.addErrorListener(listener);
            ParseTree tree;
            try {

                tree = parser.translationUnit();
            } catch (OutOfMemoryError ex) {
                throw ex;
            }
            CPPVisitor visitor = new CPPVisitor();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                comments = getCommentsFromChannel2(tokens, true, Language.CPP);
                writeSyntaxErrors(MergeNatureTools.getFileName(filePath), fileContent, listener.getSyntaxErrors());
            } else {
                comments = getCommentsFromChannel2(tokens, false, Language.CPP);

            }
            visitor.visit(tree);
            if (printTree) {
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();
            }
            return new ANTLR4Results(visitor.getList(), comments, listener.getSyntaxErrors());
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzePythonSyntaxTree(String filePathProjectAsRoot, String commit, String repositoryPath, boolean printTree) throws IOException, OutOfMemoryError, NotGitRepositoryException, ShowException {
        if (filePathProjectAsRoot.endsWith(".py")) {
            String fileContent;
            fileContent = ListUtils.getTextListStringToString(Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath));
            List<SyntaxStructure> comments;
            PythonLexer lexer = new PythonLexer(new ANTLRInputStream(fileContent + (fileContent.endsWith("\n") ? "" : "\n")));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PythonParser parser = new PythonParser(tokens);
            SyntaxErrorListener listener = new SyntaxErrorListener();
            parser.addErrorListener(listener);
            ParseTree tree;
            try {
                tree = parser.file_input();
            } catch (OutOfMemoryError ex) {
                throw ex;
            }
            PythonVisitor visitor = new PythonVisitor();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                comments = getCommentsFromChannel2(tokens, true, Language.PYTHON);
                writeSyntaxErrors(MergeNatureTools.getFileName(filePathProjectAsRoot), fileContent, listener.getSyntaxErrors());
            } else {
                comments = getCommentsFromChannel2(tokens, false, Language.PYTHON);
            }
            visitor.visit(tree);
            if (printTree) {
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();
            }
            return new ANTLR4Results(visitor.getList(), comments, listener.getSyntaxErrors());
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results analyzePythonSyntaxTree(String filePath, boolean printTree) throws IOException {
        if (filePath.endsWith(".py")) {
            String fileContent;
            fileContent = MergeNatureTools.getFileContentInString(filePath);
            List<SyntaxStructure> comments;
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            PythonLexer lexer = new PythonLexer(new ANTLRInputStream(fileContent + (fileContent.endsWith("\n") ? "" : "\n")));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PythonParser parser = new PythonParser(tokens);
            SyntaxErrorListener listener = new SyntaxErrorListener();
            parser.addErrorListener(listener);
            ParseTree tree;
            try {
                tree = parser.file_input();
            } catch (OutOfMemoryError ex) {
                throw ex;
            }
            PythonVisitor visitor = new PythonVisitor();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                comments = getCommentsFromChannel2(tokens, true, Language.PYTHON);
                writeSyntaxErrors(MergeNatureTools.getFileName(filePath), fileContent, listener.getSyntaxErrors());
            } else {
                comments = getCommentsFromChannel2(tokens, false, Language.PYTHON);
            }
            visitor.visit(tree);
            if (printTree) {
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();
            }
            return new ANTLR4Results(visitor.getList(), comments, listener.getSyntaxErrors());
        } else {
            throw new IOException();
        }
    }

    public static ANTLR4Results getANTLR4Results(String filePathProjectAsRoot, String commit, String repositoryPath) throws IOException, OutOfMemoryError, NotGitRepositoryException, ShowException {
        try {
            ANTLR4Results results;
            if (filePathProjectAsRoot.endsWith(".java")) {
                results = analyzeJava9SyntaxTree(filePathProjectAsRoot, commit, repositoryPath, false);
            } else if (filePathProjectAsRoot.endsWith(".cpp") || filePathProjectAsRoot.endsWith(".h")
                    || filePathProjectAsRoot.endsWith(".cc") || filePathProjectAsRoot.endsWith(".cxx")
                    || filePathProjectAsRoot.endsWith(".cp") || filePathProjectAsRoot.endsWith(".hxx")
                    || filePathProjectAsRoot.endsWith(".hpp")) {
                results = analyzeCPPSyntaxTree(filePathProjectAsRoot, commit, repositoryPath, false);
            } else if (filePathProjectAsRoot.endsWith(".py")) {
                results = analyzePythonSyntaxTree(filePathProjectAsRoot, commit, repositoryPath, false);
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
            List<SyntaxError> syntaxErrors = new ArrayList<>();
            boolean isOutmost;
            if (filePath.endsWith(".java")) {
                results = analyzeJava9SyntaxTree(filePath, false);
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")
                    || filePath.endsWith(".cc") || filePath.endsWith(".cxx")
                    || filePath.endsWith(".cp") || filePath.endsWith(".hxx")
                    || filePath.endsWith(".hpp")) {
                results = analyzeCPPSyntaxTree(filePath, false);
            } else if (filePath.endsWith(".py")) {
                results = analyzePythonSyntaxTree(filePath, false);
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
            for (SyntaxError se : results.getSyntaxErrors()) {
                if ((se.getLine() >= start && se.getLine() <= stop)) {
                    syntaxErrors.add(se);
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
            return new ANTLR4Results(normalAnalysis, commentAnalysis, outmostedNormalAnalysis, outmostedCommentAnalysis, syntaxErrors);

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
        List<SyntaxError> syntaxErrors = new ArrayList<>();
        boolean isOutmost = false;

        for (SyntaxStructure ss : inputResults.normalAnalysis) {
            if (ss.getStartLine() >= beginLine && ss.getStopLine() <= endLine) {
                normalAnalysis.add(ss);
            }
        }

        outmostedNormalAnalysis = getOutmostStructures(new ArrayList<>(normalAnalysis));

        for (SyntaxStructure ss : inputResults.commentAnalysis) {
            if ((ss.getStartLine() >= beginLine && ss.getStartLine() <= endLine) || (ss.getStopLine() >= beginLine && ss.getStopLine() <= endLine)
                    || (ss.getStartLine() <= beginLine && ss.getStopLine() >= endLine)) {
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

        for (SyntaxError se : inputResults.getSyntaxErrors()) {
            if ((se.getLine() >= beginLine && se.getLine() <= endLine)) {
                syntaxErrors.add(se);
            }
        }

        return new ANTLR4Results(normalAnalysis, commentAnalysis, outmostedNormalAnalysis, outmostedCommentAnalysis, syntaxErrors);
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

    public static List<String> getTranslatedStrucutures(List<SyntaxStructure> rawList, String filePath, boolean isEmpty, boolean containErrors) {
        List<String> translatedList;
        List<String> untranslatedList = new ArrayList<>();
        if (isEmpty) {
            translatedList = new ArrayList<>();
            translatedList.add("Blank");
        } else if (rawList.isEmpty()) {
            translatedList = new ArrayList<>();
            translatedList.add("Other");
        } else {
            for (SyntaxStructure struc : rawList) {
                if (!untranslatedList.contains(struc.getStructureType())) {
                    untranslatedList.add(struc.getStructureType());
                }
            }
            if(containErrors){
                untranslatedList.add("Error");
            }
            if (filePath.endsWith(".java")) {
                translatedList = Translator.JavaTranslator(untranslatedList);
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")
                    || filePath.endsWith(".cc") || filePath.endsWith(".cxx")
                    || filePath.endsWith(".cp") || filePath.endsWith(".hxx")
                    || filePath.endsWith(".hpp")) {
                translatedList = Translator.CPPTranslator(untranslatedList);
            } else if (filePath.endsWith(".py")) {
                translatedList = Translator.PythonTranslator(untranslatedList);
            } else {
                return null;
            }
        }
        return translatedList;
    }

}
