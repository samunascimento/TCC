package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor1;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor3;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.awt.BorderLayout;
import java.awt.Dimension;
import static java.awt.Frame.*;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
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
        List<Visitor1> asts = new ArrayList<>();
        int j = 0, i = 0;

        for (int aux = 0; aux < pathsList.size(); aux++) {
            asts.add(ASTExtractor(pathsList.get(aux), booleanList.get(aux)));
        }

        for (Visitor1 ast1 : asts) {
            for (Visitor1 ast2 : asts) {
                if (j != i) {
                    System.out.println("\n+=+=+=+=+=+=+=+= " + ast1.getTypeBinding().getName() + " // " + ast2.getTypeBinding().getName() + " +=+=+=+=+=+=+=+=\n");
                    //compare(ast1, ast2);
                }
                i++;
            }
            i = 0;
            j++;
        }

        System.out.println("***************GlobalEnviromentTypes***************");
        Map<String, TypeBinding> enviroment = asts.get(asts.size() - 1).getGlobalEnviroment().getEnviroment();
        for (TypeBinding value : enviroment.values()) {
            System.out.println(value);
        }
    }

    /*private static void compare(Visitor1 AST1, Visitor1 AST2) {

        System.out.println("***************MethodDeclarationAST1***************");
        for (MethodDeclarationBinding methodDeclarationBinding : AST1.getMethodDeclarationBinding()) {
            System.out.println(methodDeclarationBinding);
        }

        System.out.println("***************MethodCallAST1***************");
        for (MethodCallBinding methodCallBinding : AST1.getMethodCallBiding()) {
            System.out.println(methodCallBinding);
        }

        System.out.println("***************MethodDeclarationAST2***************");
        for (MethodDeclarationBinding methodDeclarationBinding : AST2.getMethodDeclarationBinding()) {
            System.out.println(methodDeclarationBinding);
        }

        System.out.println("***************MethodCallAST2***************");
        for (MethodCallBinding methodCallBinding : AST2.getMethodCallBiding()) {
            System.out.println(methodCallBinding);
        }

        System.out.println("***************Dependencies***************");
        System.out.println("--------------AST1 --> AST2--------------");
        Dependencies.methodDeclarationCallList(AST1.getMethodDeclarationBinding(), AST2.getMethodCallBiding());
        System.out.println("--------------AST2 --> AST1--------------");
        Dependencies.methodDeclarationCallList(AST2.getMethodDeclarationBinding(), AST1.getMethodCallBiding());

        System.out.println("***************Variables***************");
        for (VariableBinding variableBinding : AST1.getVariableBindingForList()) {
            System.out.println(variableBinding.toString());
        }

    }
*/
    private static List<String> javaFiles(String dir) {
        List<String> javaFiles = new ArrayList<>();
        File file = new File(dir);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getAbsolutePath().endsWith(".java")) {
                javaFiles.add(file1.getAbsolutePath());
            } else if (file1.isDirectory()) {
                javaFiles.addAll(javaFiles(file1.getAbsolutePath()));
            }
        }
        return javaFiles;
    }

    private static List<List> view() throws InterruptedException {
        List<List> returnList = new ArrayList<>();
        List<Boolean> booleanReturnList = new ArrayList<>();

        JPanel panel = new JPanel(new BorderLayout());

        JPanel checkBoxPanel = new JPanel();

        JFrame mainFrame = new JFrame();
        mainFrame.add(panel);
        mainFrame.setExtendedState(MAXIMIZED_BOTH);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton closeButton = new JButton("close");

        List<JCheckBox> list = new ArrayList<>();

        closeButton.addActionListener(new CloseButtonActionPerformed(list, booleanReturnList, mainFrame, ParserJava.reachedEnd));

        JScrollPane scrollPane = new JScrollPane(checkBoxPanel);

        List<String> javaFiles = javaFiles("src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example");
        int i = 0;
        for (String javaFile : javaFiles) {
            JCheckBox checkBox = new JCheckBox(i + ": " + javaFile);
            checkBoxPanel.add(checkBox);
            list.add(checkBox);
            i++;
        }
        checkBoxPanel.setLayout(new GridLayout(list.size(), 1));
        mainFrame.setLayout(new GridLayout());

        panel.add(scrollPane);
        panel.add(closeButton, BorderLayout.SOUTH);

        returnList.add(booleanReturnList);
        returnList.add(javaFiles);

        mainFrame.setVisible(true);
        while (ParserJava.reachedEnd == false) {
            Thread.sleep(1000);
        }
        return returnList;
    }

    private static Visitor1 ASTExtractor(String path, boolean openTree) throws IOException, HeadlessException, RecognitionException {
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

        Visitor1 visitor = new Visitor1();
        visitor.visit(tree);
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
