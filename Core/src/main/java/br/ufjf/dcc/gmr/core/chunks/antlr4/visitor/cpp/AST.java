/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.cpp;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.MethodCallBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.MethodDeclarationBinding;
import static br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.PrimitiveTypes.isCompatibleType;
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

/**
 *
 * @author ketleen
 */
public class AST {

    static List<List<MethodDeclarationBinding>> methodDeclaration = new ArrayList<>();
    static List<List<MethodCallBinding>> methodCall = new ArrayList<>();

    public static ANTLR4Results analyzeCPPSyntaxTree(String filePath, boolean openTree) throws IOException {
        if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
            List<SyntaxStructure> comments = new ArrayList<>();
            ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
            CPP14Lexer lexer = new CPP14Lexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CPP14Parser parser = new CPP14Parser(tokens);
            ParseTree tree = parser.translationunit();
            //Visitor1 visitor;
            Visitor2 visitor2;
            Visitor3 visitor3;
            if (parser.getNumberOfSyntaxErrors() > 0) {
                // visitor = new Visitor1();
                visitor2 = new Visitor2();
                visitor3 = new Visitor3(visitor2.getMethodDeclaration());
                comments = ANTLR4Tools.getCommentsFromChannel2(tokens, true, Language.CPP);
            } else {
                //  visitor = new Visitor1();
                visitor2 = new Visitor2();
                visitor3 = new Visitor3(visitor2.getMethodDeclaration());
                comments = ANTLR4Tools.getCommentsFromChannel2(tokens, true, Language.CPP);
            }
            // visitor.visit(tree);
            visitor2.visit(tree);
            visitor3.visit(tree);
            //Imprimir_arvore-------------------------------------------------------
            if (openTree) {
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                //viewer.open();
            }
            //----------------------------------------------------------------------*/
            System.out.println("============ VARIABLE DECLARATION =============");
            for (int i = 0; i < visitor3.getVariableDeclaration().size(); i++) {
                System.out.println(visitor3.getVariableDeclaration().get(i));
            }

            System.out.println("============ VARIABLE USAGE =============");
            for (int i = 0; i < visitor3.getVariableUsage().size(); i++) {
                System.out.println(visitor3.getVariableUsage().get(i));
            }

            System.out.println("============ METHOD CALL =============");
            methodCall.add(visitor3.getMethodCall());
            for (int i = 0; i < visitor3.getMethodCall().size(); i++) {
                System.out.println(visitor3.getMethodCall().get(i));
            }

            System.out.println("============ METHOD DECLARATION =============");
            methodDeclaration.add(visitor2.getMethodDeclaration());
            for (int i = 0; i < visitor2.getMethodDeclaration().size(); i++) {
                System.out.println(visitor2.getMethodDeclaration().get(i));
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

    public static void comparaNome() {

        for (int i = 0; i < methodDeclaration.size(); i++) {
            for (int j = 0; j < methodDeclaration.get(i).size(); j++) {
                for (int k = 0; k < methodCall.size(); k++) {
                    for (int l = 0; l < methodCall.get(k).size(); l++) {
                        if (i != k) {

//                            //compara nome
//                            if (verifica(methodDeclaration.get(i).get(j).getName(), methodCall.get(k).get(l).getName())) {
//
//                                //compara quantidade de parametro
//                                if (methodDeclaration.get(i).get(j).getQtParameters() == methodCall.get(k).get(l).getQtParameters()) {
//
//                                    for (int p = 0; p < methodDeclaration.get(i).get(j).getParametersBindings().size(); p++) {
//
//                                        //compara tipos exatos nos parametros
//                                        // if (methodDeclaration.get(i).get(j).getParametersBindings().get(p).getTypeBinding().getName().equals(methodCall.get(k).get(l).getParameters().get(p).getTypeBinding().getName())) {
//                                        if(isCompatibleType(methodCall.get(k).get(l).getParameters().get(p).getTypeBinding().getName(),methodDeclaration.get(i).get(j).getParametersBindings().get(p).getTypeBinding().getName())){
//                                        System.out.println("=============== COMPARA ==================");
//                                        System.out.println("MD: " + methodDeclaration.get(i).get(j).toString() + " linha: "
//                                                + methodDeclaration.get(i).get(j).getCtx().getStart().getLine()
//                                                + "\nMC: " + methodCall.get(k).get(l).toString() + " linha: "
//                                                + methodCall.get(k).get(l).getCtx().getStart().getLine());
//                                        }
//                                    }
//                                }
//                            }
                            
                            if(methodDeclaration.get(i).get(j).equalsTo(methodCall.get(k).get(l))) {
                                System.out.println("=============== COMPARA ==================");
                                        System.out.println("MD: " + methodDeclaration.get(i).get(j).toString() + " linha: "
                                                + methodDeclaration.get(i).get(j).getCtx().getStart().getLine()
                                                + "\nMC: " + methodCall.get(k).get(l).toString() + " linha: "
                                                + methodCall.get(k).get(l).getCtx().getStart().getLine());
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean verifica(String nome1, String nome2) {
        return (nome1 == null ? nome2 == null : nome1.equals(nome2));
    }

    public static void main(String args[]) throws IOException {

        String path = "/home/goldner/Documentos/grafos-master/main2.cpp";
        String pathh = "/home/goldner/Documentos/grafos-master/main2.cpp";
        analyzeCPPSyntaxTree(path, true);
        analyzeCPPSyntaxTree(pathh, true);
        comparaNome();

    }
}
