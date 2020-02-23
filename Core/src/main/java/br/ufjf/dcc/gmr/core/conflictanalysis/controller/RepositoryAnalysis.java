/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.JavaVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public interface RepositoryAnalysis {

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
