package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.MyVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import static java.awt.Frame.*;
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
        /*
        Path dir = FileSystems.getDefault().getPath("src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example");
        try ( DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file : stream) {
                MyVisitor AST = ASTExtractor(dir.toString().concat(file.getFileName().toString()));
            }
        } catch (IOException | DirectoryIteratorException x) {
            System.err.println(x);
        }*/

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
        List<JCheckBox> checkBoxs = new ArrayList<>();

        JPanel mainPanel = new JPanel();

        Path dir = FileSystems.getDefault().getPath("src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example");
        try ( DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {

            for (Path file : stream) {
                JCheckBox checkBox = new JCheckBox(dir.toString().concat(file.getFileName().toString()));
                checkBox.setLayout(new BorderLayout());
                checkBox.setVisible(true);
                checkBoxs.add(checkBox);
            }

        } catch (IOException | DirectoryIteratorException x) {
            System.err.println(x);
        }

        Boolean[] isTreeOpen = new Boolean[checkBoxs.size()];

        mainPanel.updateUI();
        mainFrame.setExtendedState(MAXIMIZED_BOTH);
        mainFrame.setResizable(false);

        mainFrame.setLayout(new BorderLayout());
        mainPanel.setLayout(new BorderLayout());

        mainPanel.setBackground(Color.red);

        mainFrame.add(mainPanel, BorderLayout.CENTER);
        mainPanel.add(checkBoxs.get(0), BorderLayout.WEST);
        System.out.println("Size:" + checkBoxs.size());
        mainFrame.setVisible(true);
        for (int i = 0; i < checkBoxs.size(); i++) {
            Thread.sleep(100l);
            mainPanel.add(checkBoxs.get(i));
            mainPanel.updateUI();
        }

        mainPanel.setVisible(true);

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
