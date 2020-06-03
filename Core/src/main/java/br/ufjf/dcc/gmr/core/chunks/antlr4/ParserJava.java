package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.MyVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.awt.Dimension;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class ParserJava {
      public static void main(String[] args) throws IOException {
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/JavaExample.java";
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/DiaSemana.java";
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/Rectangle.java";
        String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/RectangleElement.java";
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/example/GFG.java";
        //String path = "src/main/java/br/ufjf/dcc/gmr/core/vcs/Git.java";

        ANTLRFileStream fileStream = new ANTLRFileStream(path);
        JavaLexer lexer = new JavaLexer(fileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        //Console
        System.out.println(tree.toStringTree(parser));

        //GUI 
        JFrame frame = new JFrame("Java parser");
        JPanel panel = new JPanel();

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setSize(new Dimension(500, 600));
        

        

        MyVisitor visitor = new MyVisitor();

        visitor.visit(tree);
        
//        frame.add(viewer);
//        frame.setVisible(true);
//        frame.setSize(new Dimension(500,600));
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();

    }
}
