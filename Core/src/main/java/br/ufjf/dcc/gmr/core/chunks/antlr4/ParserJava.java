package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.MyVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.Frame.*;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParserJava {

    public static void main(String[] args) throws IOException, InterruptedException {
        String path1 = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example/Main.java";
        String path2 = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example/Person.java";
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
        //view();
    }

    private static Boolean[] view() throws InterruptedException {
        JFrame mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        List<String> list = new ArrayList<>();
        Path dir = FileSystems.getDefault().getPath("src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example");

        try ( DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {

            for (Path file : stream) {
                list.add(dir.toString().concat(file.getFileName().toString()));

            }

        } catch (IOException | DirectoryIteratorException x) {
            System.err.println(x);
        }
        mainFrame.setLayout(new GridLayout(list.size(), 1));

        for (String path : list) {
            JCheckBox checkBox = new JCheckBox(path);
            checkBox.setVisible(true);
            mainFrame.add(checkBox);
        }

        mainFrame.setExtendedState(MAXIMIZED_BOTH);
        mainFrame.setResizable(false);

        mainFrame.setLayout(new GridLayout(ERROR, ABORT));

        mainFrame.setVisible(true);

        return null;
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
        String[] aux = path.split("/");
        String fileName = aux[aux.length - 1];
        Object message = "Want to open the view dialog for the file: " + fileName + "?";
        if (JOptionPane.showConfirmDialog(null, message) == 0) {
            viewer.open();
        }

        MyVisitor visitor = new MyVisitor();

        visitor.visit(tree);

        return visitor;
    }
}
