package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp.CPP14Lexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.python3.Python3Lexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.python3.Python3Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
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
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author joao_lima
 */
public interface ConflictAnalysisTools {

    public static File createSandbox(String repositoryPath) throws IOException {
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

    public static List<SyntaxStructure> analyzeJavaSyntaxTree(String filePath) throws IOException {
        if (filePath.endsWith(".java")) {
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            JavaLexer lexer = new JavaLexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaParser parser = new JavaParser(tokens);
            ParseTree tree = parser.compilationUnit();

            JavaVisitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new JavaVisitor(true);
            } else {
                visitor = new JavaVisitor(false);
            }
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

            CPPVisitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new CPPVisitor(true);
            } else {
                visitor = new CPPVisitor(false);
            }
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

            Python3Visitor visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new Python3Visitor(true);
            } else {
                visitor = new Python3Visitor(false);
            }
            visitor.visit(tree);

            return visitor.getList();
        } else {

            throw new IOException();
        }
    }

    public static List<SyntaxStructure> getStructureTypeInInterval(String filePath, int start, int stop) throws IOException {
        try {

            List<SyntaxStructure> rawList = null;
            List<SyntaxStructure> list = new ArrayList();

            if (filePath.endsWith(".java")) {
                rawList = analyzeJavaSyntaxTree(filePath);
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
                rawList = analyzeCPPSyntaxTree(filePath);
            } else if (filePath.endsWith(".py")) {
                rawList = analyzePythonSyntaxTree(filePath);
            } else {
                return null;
            }

            if (rawList != null) {
                for (SyntaxStructure ss : rawList) {
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

}
