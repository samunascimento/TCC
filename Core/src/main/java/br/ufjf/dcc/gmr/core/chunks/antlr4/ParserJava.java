package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.model.ConflictChunk;
import br.ufjf.dcc.gmr.core.chunks.antlr4.model.Chunk;
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
import br.ufjf.dcc.gmr.core.chunks.jung.*;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.MyFile;
import br.ufjf.dcc.gmr.core.vcs.types.Version;

public class ParserJava {

    private static boolean reachedEnd = false;
    private GlobalEnviroment globalEnviroment;
    private static Version version;
    private static String pathProject;

    public ParserJava() {
        this.globalEnviroment = new GlobalEnviroment();
        this.version = new Version();
    }

    public ParserJava(Version version, String pathProject) {
        this.version = version;
        this.globalEnviroment = new GlobalEnviroment();
        this.pathProject = pathProject;
    }

    public static void main(String[] args) throws Exception {

//        GlobalEnviroment parent1 = new GlobalEnviroment();
//        GlobalEnviroment parent2 = new GlobalEnviroment();
//
//        int cont = 1;
//
//        List<String> javaFiles = javaFiles("src/main/java/br/ufjf/dcc/gmr/core/chunks/antlr4/analysis");
//
//        for (String parent : version.getParent()) {
//
//            Git.reset(ParserJava.pathProject, true, false, false, null);
//            Git.clean(ParserJava.pathProject, true, 0);
//            Git.checkout(parent, ParserJava.pathProject);
//
//            ParserJava parserJava = new ParserJava();
//
//            int j = 0, i = 0;
//
//            ASTExtractor1(javaFiles, parserJava.getGlobalEnviroment());
//
//            ASTExtractor2(javaFiles, parserJava.getGlobalEnviroment());
//
//            ASTExtractor3(javaFiles, parserJava.getGlobalEnviroment());
//
//            Set<String> paths = parserJava.getGlobalEnviroment().getEnviroment().keySet();
//
//            for (String pathAST1 : javaFiles) {
//                for (String pathAST2 : javaFiles) {
//                    TypeBinding ast1 = new TypeBinding();
//                    TypeBinding ast2 = new TypeBinding();
//
//                    for (String path : paths) {
//                        if (pathAST1.endsWith(replaceAll(path, File.separator))) {
//                            ast1 = parserJava.getGlobalEnviroment().getEnviroment().get(path);
//                        }
//                    }
//
//                    for (String path : paths) {
//                        if (pathAST2.endsWith(replaceAll(path, File.separator))) {
//                            ast2 = parserJava.getGlobalEnviroment().getEnviroment().get(path);
//                        }
//                    }
//
//                    if (j != i) {
//                        System.out.println("\n" + ast1.getName() + " // " + ast2.getName() + "\n");
//                        compare(ast1, ast2, parserJava.getGlobalEnviroment());
//                    }
//                    i++;
//                }
//                i = 0;
//                j++;
//
//            }
//
//            System.out.println("***************GlobalEnviromentTypes***************");
//            for (TypeBinding value : parserJava.getGlobalEnviroment().getEnviroment().values()) {
//                System.out.println(value);
//
//            }
//            if (cont == 1) {
//                parent1 = parserJava.getGlobalEnviroment();
//            } else if (cont == 2) {
//                parent2 = parserJava.getGlobalEnviroment();
//            }
//            
//            
//           
//        }
//        
//         
//         
//        for (MyFile myFile : version.getFile()) {
//            
//            List<FileDiff> fileDiffList = Git.diff(pathProject, , , myFile.getContent().size());
//            
//            for (br.ufjf.dcc.gmr.core.vcs.types.Chunk chunck : myFile.getChuncks()) {
//
//                Chunk chunkA = new Chunk();
//                chunkA.setLineBegin(chunck.getBegin().getLineNumber());
//                chunkA.setLineEnd(chunck.getEnd().getLineNumber());
//                chunkA.setType(myFile.getPath());
//                chunkA.setLanguageConstruct(parent1.findLanguageConstructs(chunkA));
//
//                Chunk chunkB = new Chunk();
//                chunkA.setLineBegin(chunck.getBegin().getLineNumber());
//                chunkA.setLineEnd(chunck.getEnd().getLineNumber());
//                chunkA.setType(myFile.getPath());
//                chunkA.setLanguageConstruct(parent2.findLanguageConstructs(chunkA));
//
//                ConflictChunk conflictChunk = new ConflictChunk();
//                conflictChunk.setChunkVersion1(chunkA);
//                conflictChunk.setChunkVersion2(chunkB);
//
//            }
//        }

//        Chunk chunkA = new Chunk();
//        chunkA.setLineBegin(26);
//        chunkA.setLineEnd(31);
//        chunkA.setType("br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example.Main.java");
//        chunkA.setLanguageConstruct(parserJava.globalEnviroment.findLanguageConstructs(chunkA));
//        ConflictChunk conflictChunkA = new ConflictChunk();
//        conflictChunkA.setChunkVersion1(chunkA);
//
//        Chunk chunkB = new Chunk();
//        chunkB.setLineBegin(32);
//        chunkB.setLineEnd(45);
//        chunkB.setType("br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example.Main.java");
//        chunkB.setLanguageConstruct(parserJava.globalEnviroment.findLanguageConstructs(chunkB));
//        ConflictChunk conflictChunkB = new ConflictChunk();
//        conflictChunkB.setChunkVersion1(chunkB);
//
//        List<ConflictChunk> conflictChunkList = new ArrayList<>();
//        conflictChunkList.add(conflictChunkA);
//        conflictChunkList.add(conflictChunkB);
//
//        Main jung = new Main(parserJava.getGlobalEnviroment(), conflictChunkList, paths);
//        jung.main(args);
    }

    private static List<Chunk> getChunkBinding(ParserJava parserJava) {

        List<Chunk> listChunk = new ArrayList<>();
        for (MyFile myFile : version.getFile()) {
            for (br.ufjf.dcc.gmr.core.vcs.types.Chunk chunk : myFile.getChuncks()) {
                Chunk chunkBinding = new Chunk();
                chunkBinding.setLineBegin(chunk.getBegin().getLineNumber());
                chunkBinding.setLineEnd(chunk.getEnd().getLineNumber());
                chunkBinding.setType(myFile.getPath());
                chunkBinding.setText(chunk.getContent());
                chunkBinding.setLanguageConstruct(parserJava.getGlobalEnviroment().findLanguageConstructs(chunkBinding));
                listChunk.add(chunkBinding);
            }
        }

        return null;
    }

    private static void compare(TypeBinding AST1, TypeBinding AST2, GlobalEnviroment globalEnviroment) {

        System.out.println("***************MethodDeclarationAST1***************");
        for (MethodDeclarationBinding methodDeclarationBinding : AST1.getMethodsBinding()) {
            System.out.println(methodDeclarationBinding.toString());
        }

        System.out.println("***************MethodCallAST1***************");

        for (MethodDeclarationBinding methodDeclarationBinding : AST1.getMethodsBinding()) {
            for (MethodCallBinding methodCall : methodDeclarationBinding.getMethodCallBindings()) {
                System.out.println(methodCall);
            }
        }

        System.out.println("***************MethodDeclarationAST2***************");
        for (MethodDeclarationBinding methodDeclarationBinding : AST2.getMethodsBinding()) {
            System.out.println(methodDeclarationBinding.toString());
        }

        System.out.println("***************MethodCallAST2***************");
        for (MethodDeclarationBinding methodDeclarationBinding : AST2.getMethodsBinding()) {
            for (MethodCallBinding methodCall : methodDeclarationBinding.getMethodCallBindings()) {
                System.out.println(methodCall);
            }
        }

        System.out.println("***************Dependencies***************");
        System.out.println("--------------AST1 --> AST2--------------");
        Dependencies.methodDeclarationCallList(AST1.getAllMethodsDeclaration(), AST1, AST2.getAllMethodsCallBinding());
        System.out.println("--------------AST2 --> AST1--------------");
        Dependencies.methodDeclarationCallList(AST2.getAllMethodsDeclaration(), AST2, AST1.getAllMethodsCallBinding());
        System.out.println("***************Chunks***************");

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
    
    private static void ASTExtractor1(List<String> pathList, GlobalEnviroment globalEnviroment) throws IOException, HeadlessException, RecognitionException {
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

    /**
     * @return the version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Version version) {
        this.version = version;
    }

    /**
     * @return the pathProject
     */
    public String getPathProject() {
        return pathProject;
    }

    /**
     * @param pathProject the pathProject to set
     */
    public void setPathProject(String pathProject) {
        this.pathProject = pathProject;
    }

}
