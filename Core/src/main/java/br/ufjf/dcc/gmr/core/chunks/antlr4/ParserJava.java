package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.MyVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.awt.Dimension;
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
import java.util.Map;
import javax.swing.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParserJava {

    private static boolean reachedEnd = false;

    public static void main(String[] args) throws IOException, InterruptedException {

        List<List> pathAndOpenViewList = view();
        List<Boolean> booleanList = pathAndOpenViewList.get(0);
        List<String> pathsList = pathAndOpenViewList.get(1);
        List<MyVisitor> asts = new ArrayList<>();
        int j = 0, i = 0;

        for (int aux = 0; aux < pathsList.size(); aux++) {
            asts.add(ASTExtractor(pathsList.get(aux), booleanList.get(aux)));
        }

        for (MyVisitor ast1 : asts) {
            for (MyVisitor ast2 : asts) {
                if (j != i) {
                    System.out.println("\n+=+=+=+=+=+=+=+= " + ast1.getTypeBinding().getName() + " // " + ast2.getTypeBinding().getName() + " +=+=+=+=+=+=+=+=\n");
                    compare(ast1, ast2);
                }
                i++;
            }

            i = 0;
            j++;
        }

        System.out.println("+=+=+=+=+=+=+GlobalEnviroment Types+=+=+=+=+=+=+");
        Map<String, TypeBinding> enviroment = asts.get(asts.size() - 1).getGlobalEnviroment().getEnviroment();
        for (TypeBinding value : enviroment.values()) {
            System.out.println(value);
        }
    }

    private static void compare(MyVisitor AST1, MyVisitor AST2) {

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

    private static List<List> view() throws InterruptedException {
        List<List> returnList = new ArrayList<>();
        List<Boolean> booleanReturnList = new ArrayList<>();
        List<String> pathsReturnList = new ArrayList<>();
        JFrame mainFrame = new JFrame();
        JButton closeButton = new JButton("close");
        List<JCheckBox> list = new ArrayList<>();
        closeButton.addActionListener(new CloseButtonActionPerformed(list, booleanReturnList, mainFrame, ParserJava.reachedEnd));

        Path dir = FileSystems.getDefault().getPath("src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {

            for (Path file : stream) {
                String path = dir.toString().concat("/").concat(file.getFileName().toString());
                JCheckBox checkBox = new JCheckBox(path);
                checkBox.setVisible(true);
                list.add(checkBox);
                pathsReturnList.add(path);
            }

        } catch (IOException | DirectoryIteratorException x) {
            System.err.println(x);
        }

        mainFrame.setLayout(new GridLayout(list.size() + 2, 5));

        for (JCheckBox checkBox : list) {
            mainFrame.add(checkBox);
        }

        JCheckBox checkBox = new JCheckBox("Select all");
        checkBox.addMouseListener(new CheckBoxMouseListener(checkBox, list));
        checkBox.setVisible(true);

        mainFrame.add(checkBox);
        mainFrame.add(closeButton);

        mainFrame.setExtendedState(MAXIMIZED_BOTH);

        mainFrame.setLayout(new GridLayout(list.size(), 1));

        mainFrame.setVisible(true);

        returnList.add(booleanReturnList);
        returnList.add(pathsReturnList);

        while (ParserJava.reachedEnd == false) {
            Thread.sleep(1000);
        }
        ParserJava.reachedEnd = false;
        return returnList;
    }

    private static MyVisitor ASTExtractor(String path, boolean openTree) throws IOException, HeadlessException, RecognitionException {
        ANTLRFileStream fileStream = new ANTLRFileStream(path);
        JavaLexer lexer = new JavaLexer(fileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setSize(new Dimension(500, 600));

        if (openTree) {
            viewer.open();
        }

        MyVisitor visitor = new MyVisitor();

        visitor.visitFirst(tree);
        visitor.visitSecond(tree);

        return visitor;
    }

    /**
     * @return the reachedEnd
     */
    public static boolean isReachedEnd() {
        return reachedEnd;
    }

    /**
     * @param aReachEnd the reachedEnd to set
     */
    public static void setReachedEnd(boolean aReachEnd) {
        reachedEnd = aReachEnd;
    }

}
