package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.Dependencies;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.MethodCallBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.MethodDeclarationBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.VariableBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.MyVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParserJava {

    public static void main(String[] args) throws IOException {
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/JavaExample.java";
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/DiaSemana.java";
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/Rectangle.java";
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/RectangleElement.java";
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/GFG.java";
        String path1 = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example/Main.java";
        String path2 = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example/Employee.java";
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/vcs/Git.java";
        MyVisitor AST1 = ASTExtractor(path1);
        MyVisitor AST2 = ASTExtractor(path2);
            
        
        System.out.println("=============MethodDeclarationAST1=============");
        for (MethodDeclarationBinding methodDeclarationBinding : AST1.getMethodDeclarationBinding()) {
            System.out.println(methodDeclarationBinding);
        }

        System.out.println("=============MethodCallAST1=============");
        for (MethodCallBinding methodCallBinding : AST1.getMethodCallBiding()) {
            System.out.println(methodCallBinding);
        }

        System.out.println("=============MethodDeclarationAST2=============");
        for (MethodDeclarationBinding methodDeclarationBinding : AST2.getMethodDeclarationBinding()) {
            System.out.println(methodDeclarationBinding);
        }

        System.out.println("=============MethodCallAST2=============");
        for (MethodCallBinding methodCallBinding : AST2.getMethodCallBiding()) {
            System.out.println(methodCallBinding);
        }

        System.out.println("=============Dependencies=============");
        System.out.println("============= AST1 --> AST2 =============");
        Dependencies.methodDeclarationCallList(AST1.getMethodDeclarationBinding(), AST2.getMethodCallBiding());
        System.out.println("============= AST2 --> AST1 =============");
        Dependencies.methodDeclarationCallList(AST2.getMethodDeclarationBinding(), AST1.getMethodCallBiding());
    
        System.out.println("=============Variables=============");
        for (VariableBinding variableBinding : AST1.getVariableBindingList()) {
            System.out.println(variableBinding.toString());
        }
    }

    private static MyVisitor ASTExtractor(String path) throws IOException, HeadlessException, RecognitionException {
        ANTLRFileStream fileStream = new ANTLRFileStream(path);
        JavaLexer lexer = new JavaLexer(fileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        //Console
        System.out.println(tree.toStringTree(parser));

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setSize(new Dimension(500, 600));     
        viewer.open();

        MyVisitor visitor = new MyVisitor();

        visitor.visit(tree);

        return visitor;
    }
}
