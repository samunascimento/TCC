/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.cpp;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.mergenature.controller.visitors.CPPVisitor;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author ketleen
 */
public class AST {

    public static ANTLR4Results analyzeCPPSyntaxTree(String filePath, boolean openTree ) throws IOException {
        if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
            List<SyntaxStructure> comments;
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            CPP14Lexer lexer = new CPP14Lexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CPP14Parser parser = new CPP14Parser(tokens);
            ParseTree tree = parser.translationunit();
            Visitor1 visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new Visitor1();
                comments = ANTLR4Tools.getCommentsFromChannel2(tokens, true);
            } else {
                visitor = new Visitor1();
                comments = ANTLR4Tools.getCommentsFromChannel2(tokens, true);
            }
            visitor.visit(tree);
           //Imprimir_arvore-------------------------------------------------------
            if(openTree){
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();
            }
            //----------------------------------------------------------------------*/
            return null;
//            return new ANTLR4Results(visitor.getList(), comments);
        } else {
            throw new IOException();
        }
    }
//trocar e arrumar .java para .cpp e .h
    private static List<String> cppFiles(String dir) {
        List<String> cppFiles = new ArrayList<>();
        File file = new File(dir);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getAbsolutePath().endsWith(".cpp")||file1.getAbsolutePath().endsWith(".h")) {
                cppFiles.add(file1.getAbsolutePath());
            } else if (file1.isDirectory()) {
                cppFiles.addAll(cppFiles(file1.getAbsolutePath()));
            }
        }
        return cppFiles;
    }
    
    public static void main(String args[]) throws IOException{
        String path = "/home/ketleen/Documentos/grafos-master/main.cpp";
        analyzeCPPSyntaxTree(path, true);
        
        
    }
}
