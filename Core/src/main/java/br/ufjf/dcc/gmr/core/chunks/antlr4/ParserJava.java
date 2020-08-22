package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor1;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor2;
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
import java.util.Set;
import javax.swing.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParserJava {

    private static boolean reachedEnd = false;
    private GlobalEnviroment globalEnviroment;

    public ParserJava() {
        this.globalEnviroment = new GlobalEnviroment();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        List<List> pathAndOpenViewList = view();
        List<Boolean> booleanList = pathAndOpenViewList.get(0);
        List<String> pathsList = pathAndOpenViewList.get(1);
        ParserJava parserJava = new ParserJava();

        int j = 0, i = 0;

        ASTExtractor1(pathsList, booleanList, parserJava.getGlobalEnviroment());

        ASTExtractor2(pathsList, parserJava.getGlobalEnviroment());

        ASTExtractor3(pathsList, parserJava.getGlobalEnviroment());

        Set<String> paths = parserJava.getGlobalEnviroment().getEnviroment().keySet();

        for (String pathAST1 : pathsList) {
            for (String pathAST2 : pathsList) {
                TypeBinding ast1 = new TypeBinding();
                TypeBinding ast2 = new TypeBinding();

                for (String path : paths) {
                    if (pathAST1.endsWith(replaceAll(path, File.separator))) {
                        ast1 = parserJava.getGlobalEnviroment().getEnviroment().get(path);
                    }
                }

                for (String path : paths) {
                    if (pathAST2.endsWith(replaceAll(path, File.separator))) {
                        ast2 = parserJava.getGlobalEnviroment().getEnviroment().get(path);
                    }
                }

                if (j != i) {
                    System.out.println("\n" + ast1.getName() + " // " + ast2.getName() + "\n");
                    compare(ast1, ast2);
                }
                i++;
            }
            i = 0;
            j++;

        }

        System.out.println("***************GlobalEnviromentTypes***************");
        for (TypeBinding value : parserJava.getGlobalEnviroment().getEnviroment().values()) {
            System.out.println(value);
        }
    }

    private static void compare(TypeBinding AST1, TypeBinding AST2) {

        System.out.println("***************MethodDeclarationAST1***************");
        for (MethodDeclarationBinding methodDeclarationBinding : AST1.getMdbList()) {
            System.out.println(methodDeclarationBinding.toString());
        }

        System.out.println("***************MethodCallAST1***************");
        for (MethodDeclarationBinding methodDeclarationBinding : AST1.getMdbList()) {
            for (List<BaseBinding> context : methodDeclarationBinding.getMethodEnviromentBinding().getEnviroment()) {
                for (BaseBinding baseBinding : context) {

                    if (baseBinding instanceof MethodCallBinding) {
                        System.out.println(baseBinding);
                    }
                }
            }
        }

        System.out.println("***************MethodDeclarationAST2***************");
        for (MethodDeclarationBinding methodDeclarationBinding : AST2.getMdbList()) {
            System.out.println(methodDeclarationBinding.toString());
        }

        System.out.println("***************MethodCallAST2***************");
        for (MethodDeclarationBinding methodDeclarationBinding : AST2.getMdbList()) {
            for (List<BaseBinding> context : methodDeclarationBinding.getMethodEnviromentBinding().getEnviroment()) {
                for (BaseBinding baseBinding : context) {

                    if (baseBinding instanceof MethodCallBinding) {
                        System.out.println(baseBinding);
                    }
                }
            }
        }

//        System.out.println("***************Dependencies***************");
//        System.out.println("--------------AST1 --> AST2--------------");
//        Dependencies.methodDeclarationCallList(AST1.getMethodDeclarationBinding(), AST2.getMethodCallBiding());
//        System.out.println("--------------AST2 --> AST1--------------");
//        Dependencies.methodDeclarationCallList(AST2.getMethodDeclarationBinding(), AST1.getMethodCallBiding());
//
//        System.out.println("***************Variables***************");
//        for (VariableBinding variableBinding : AST1.getVariableBindingForList()) {
//            System.out.println(variableBinding.toString());
//        }
    }

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
        List<String> javaFiles2 = javaFiles("src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis/example2");

        javaFiles.addAll(javaFiles2);

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

    private static void ASTExtractor1(List<String> pathList, List<Boolean> openTreeList, GlobalEnviroment globalEnviroment) throws IOException, HeadlessException, RecognitionException {
        List<String> unprocessed = null;
        List<String> copyPathList = new ArrayList<>(pathList);
        do {
            unprocessed = new ArrayList<>();
            for (int i = 0; i < copyPathList.size(); i++) {
                ANTLRFileStream fileStream = new ANTLRFileStream(copyPathList.get(i));
                JavaLexer lexer = new JavaLexer(fileStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                JavaParser parser = new JavaParser(tokens);
                ParseTree tree = parser.compilationUnit();

                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.setSize(new Dimension(500, 600));

                if (openTreeList.get(i)) {
                    viewer.open();
                }

                Visitor1 visitor = new Visitor1(globalEnviroment);

                visitor.visit(tree);
                if (visitor.isError()) {
                    unprocessed.add(copyPathList.get(i));
                }
            }
            copyPathList = unprocessed;
        } while (!unprocessed.isEmpty());
    }

    private static void ASTExtractor2(List<String> pathList, GlobalEnviroment globalEnviroment) throws IOException, HeadlessException, RecognitionException {
        for (int i = 0; i < pathList.size(); i++) {

            ANTLRFileStream fileStream = new ANTLRFileStream(pathList.get(i));
            JavaLexer lexer = new JavaLexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            JavaParser parser = new JavaParser(tokens);
            ParseTree tree = parser.compilationUnit();

            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.setSize(new Dimension(500, 600));

            Visitor2 visitor = new Visitor2(globalEnviroment);

            visitor.visit(tree);
        }
    }

    private static void ASTExtractor3(List<String> pathList, GlobalEnviroment globalEnviroment) throws IOException, HeadlessException, RecognitionException {
        for (int i = 0; i < pathList.size(); i++) {

            ANTLRFileStream fileStream = new ANTLRFileStream(pathList.get(i));
            JavaLexer lexer = new JavaLexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            JavaParser parser = new JavaParser(tokens);
            ParseTree tree = parser.compilationUnit();

            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.setSize(new Dimension(500, 600));

            Visitor3 visitor = new Visitor3(globalEnviroment);

            visitor.visit(tree);
        }
    }

    public static String replaceAll(String str, String replace) {
        String aux = "";
        aux = aux.concat(str);
        str = "";
        for (String string : aux.split("\\.")) {
            if (!string.equals("java")) {
                str = str.concat(string).concat(replace);
            } else {
                str = str.substring(0, str.length() - 1).concat(".java");
            }
        }
        return str;
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

    /**
     * @return the globalEnviroment
     */
    public GlobalEnviroment getGlobalEnviroment() {
        return globalEnviroment;
    }

    /**
     * @param aGlobalEnviroment the globalEnviroment to set
     */
    public void setGlobalEnviroment(GlobalEnviroment aGlobalEnviroment) {
        globalEnviroment = aGlobalEnviroment;
    }

}
