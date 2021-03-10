/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.cpp;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.Language;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.VariableUsageBinding;

/**
 *
 * @author ketleen
 */
public class AST {

    public static ANTLR4Results analyzeCPPSyntaxTree(String filePath, boolean openTree) throws IOException {
        if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
            List<SyntaxStructure> comments;
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            CPP14Lexer lexer = new CPP14Lexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CPP14Parser parser = new CPP14Parser(tokens);
            ParseTree tree = parser.translationunit();
            Visitor3 visitor;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                visitor = new Visitor3();
                comments = ANTLR4Tools.getCommentsFromChannel2(tokens, true, Language.CPP);
            } else {
                visitor = new Visitor3();
                comments = ANTLR4Tools.getCommentsFromChannel2(tokens, true, Language.CPP);
            }
            visitor.visit(tree);
            //Imprimir_arvore-------------------------------------------------------
            if (openTree) {
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();
            }
            //----------------------------------------------------------------------*/
            System.out.println("============ VARIABLE DECLARATION =============");
            for (int i = 0; i < visitor.getVariableDeclaration().size(); i++) {
                System.out.println(visitor.getVariableDeclaration().get(i));
            }
            System.out.println("============ VARIABLE USAGE =============");
            for (int i = 0; i < visitor.getVariableUsage().size(); i++) {
                System.out.println(visitor.getVariableUsage().get(i));
            }
             System.out.println("============ METHOD CALL =============");
            for (int i = 0; i < visitor.getMethodCall().size(); i++) {
                System.out.println(visitor.getMethodCall().get(i));
                for(int j =0; j<visitor.getMethodCall().get(i).getParameters().size(); j++)
                    System.out.print(visitor.getMethodCall().get(i).getParameters().get(j)+ "  ");
                 System.out.println("");
            }
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
            
            if (file1.isFile() && file1.getAbsolutePath().endsWith(".cpp") || file1.getAbsolutePath().endsWith(".h")) {
                cppFiles.add(file1.getAbsolutePath());
            } else if (file1.isDirectory()) {
                cppFiles.addAll(cppFiles(file1.getAbsolutePath()));
            }
        }
        return cppFiles;
    }

    public static void main(String args[]) throws IOException {

        String path = "/home/ketleen/Documentos/testeArvore/main.cpp";
        analyzeCPPSyntaxTree(path, true);

        /*
            lista declaraçao de variavel; (nome e tipo) OK
            lista de chamada ou uso de variavel; (nome)ok
            
            lista de declaraçao de metodos; (nome e tipo, e qnt de paremetro) 
            lista de chamada de metodos; ok
        
            "considerar o Variable Declaration"
         */
    }
}
