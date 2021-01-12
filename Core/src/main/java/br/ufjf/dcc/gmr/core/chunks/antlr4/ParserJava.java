package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.model.Chunk;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor1;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor2;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor3;
import br.ufjf.dcc.gmr.core.chunks.jung.Main;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.utils.DiffTranslator;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import java.awt.Dimension;
import java.awt.HeadlessException;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;
import br.ufjf.dcc.gmr.core.vcs.types.MyFile;
import br.ufjf.dcc.gmr.core.vcs.types.Version;

public class ParserJava {

    private static boolean reachedEnd = false;

    private GlobalEnviroment globalEnviroment;
    private static Version version;
    private static String pathProject;

    public ParserJava(Version version) {
        this.globalEnviroment = new GlobalEnviroment();
    }

    public ParserJava(Version version, String pathProject) {
        this.version = version;
        this.globalEnviroment = new GlobalEnviroment();
        this.pathProject = pathProject;
    }

    public static void main(String[] args) throws Exception {

        GlobalEnviroment parent1 = new GlobalEnviroment();
        GlobalEnviroment parent2 = new GlobalEnviroment();
        int cont = 0;

        //Definindo os arquivos com erros
        List<String> javaFiles = new ArrayList<>();
        for (MyFile myFile : version.getFile()) {
            String filePath = myFile.getPath();
            javaFiles.add(filePath);
        }

        List<String> filesToCheckParent1 = new ArrayList<>();
        List<String> filesToCheckParent2 = new ArrayList<>();

        List<List<String>> filesToStringParent1 = new ArrayList<>();
        List<List<String>> filesToStringParent2 = new ArrayList<>();

        String pathRepositoryCopy = "";
        String pathRepositoryCopy1 = "";
        String pathRepositoryCopy2 = "";

        for (String parent : version.getParent()) {

            Git.reset(ParserJava.pathProject, true, false, false, null);
            Git.clean(ParserJava.pathProject, true, 0);
            Git.checkout(parent, ParserJava.pathProject);

            ParserJava parserJava = new ParserJava(version);

            int j = 0, i = 0;
            String nameNewDir;

            if (cont == 0) {
                nameNewDir = "parent1";
                pathRepositoryCopy = createDiffRepository(ParserJava.pathProject, nameNewDir);
                pathRepositoryCopy1 = pathRepositoryCopy;
            } else {
                nameNewDir = "parent2";
                pathRepositoryCopy = createDiffRepository(ParserJava.pathProject, nameNewDir);
                pathRepositoryCopy2 = pathRepositoryCopy;
            }

            File cloneDirectory = new File(pathRepositoryCopy);
            if (cloneDirectory.isDirectory()) {
                List<String> jaja = javaFiles(pathRepositoryCopy);

                for (String javaFile : javaFiles) {
                    String[] split = javaFile.split("/");
                    for (String string : jaja) {
                        if (string.endsWith(split[split.length - 1])) {
                            if (cont == 0) {
                                filesToCheckParent1.add(string);
                            } else {
                                filesToCheckParent2.add(string);
                            }

                        }
                    }
                }
            }

            System.out.println(pathRepositoryCopy);

            ASTExtractor(filesToCheckParent1, parserJava.getGlobalEnviroment());
            Set<String> paths = parserJava.getGlobalEnviroment().getEnviroment().keySet();

            for (String pathAST1 : javaFiles) {
                for (String pathAST2 : javaFiles) {
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
                        compare(ast1, ast2, parserJava.getGlobalEnviroment());
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

            if (cont == 0) {
                parent1 = parserJava.getGlobalEnviroment();
                for (String path : filesToCheckParent1) {
                    filesToStringParent1.add(ListUtils.readFile(path));
                }

            } else if (cont == 1) {
                parent2 = parserJava.getGlobalEnviroment();
                for (String path : filesToCheckParent2) {
                    filesToStringParent2.add(ListUtils.readFile(path));
                }
            }

            cont++;

        }

        int context = 10;

        for (int i = 0; i < version.getFile().size(); i++) {
            for (int z = 0; z < version.getFile().get(i).getChunks().size(); z++) {

                int begin = version.getFile().get(i).getChunks().get(z).getBegin().getLineNumber();
                int end = version.getFile().get(i).getChunks().get(z).getEnd().getLineNumber();

                version.getFile().get(i).getChunks().get(z).getBeforeContext().setLineBegin(begin - context);
                version.getFile().get(i).getChunks().get(z).getBeforeContext().setLineEnd(begin - 1);

                version.getFile().get(i).getChunks().get(z).getAfterContext().setLineBegin(end - 1);
                version.getFile().get(i).getChunks().get(z).getAfterContext().setLineEnd(end + context);

                int beforeBegin = version.getFile().get(i).getChunks().get(z).getBeforeContext().getLineBegin();
                int beforeEnd = version.getFile().get(i).getChunks().get(z).getBeforeContext().getLineEnd();

                int afterBegin = version.getFile().get(i).getChunks().get(z).getAfterContext().getLineBegin();
                int afterEnd = version.getFile().get(i).getChunks().get(z).getAfterContext().getLineEnd();
                boolean notConflict = true;
                for (int j = 0; j < version.getFile().get(i).getContent().size(); j++) {

                    if ((version.getFile().get(i).getContent().get(j).contains("<<<<<<<"))) {
                        notConflict = false;

                    }
                    if (version.getFile().get(i).getContent().get(j).contains(">>>>>>>")) {
                        notConflict = true;

                    }
                    if ((j > beforeBegin && j < beforeEnd && notConflict)) {

                        version.getFile().get(i).getChunks().get(z).getBeforeContext().getText().add(version.getFile().get(i).getContent().get(j));
                    }

                    if (j < afterEnd && j > afterBegin && notConflict) {

                        version.getFile().get(i).getChunks().get(z).getAfterContext().getText().add(version.getFile().get(i).getContent().get(j));
                    }
                }

            }
        }

//        boolean foundAfterContext = false;
//        int validate = 0;
//        for (int i = 0; i < filesToStringParent1.size(); i++) {
//            for (int j = 0; j < filesToStringParent1.get(i).size(); j++) {
//                for (ConflictChunk conflictChunk : version.getFile().get(i).getChunks()) {
//                    for (int z=0; z < conflictChunk.getBeforeContext().getText().size(); z++) {
//                        if (filesToStringParent1.get(i).get(j).equals(conflictChunk.getBeforeContext().getText().get(z)) && validate == j) {
//                            conflictChunk.getChunkVersion1().setLineBegin(j+1);
//                            validate++;
//                        }
//                    }
//                    for (String line : conflictChunk.getAfterContext().getText()) {
//                        if (filesToStringParent1.get(i).get(j).equals(line) && !foundAfterContext) {
//                            conflictChunk.getChunkVersion1().setLineEnd(j+1);
//                            foundAfterContext = true;
//                        }
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < filesToStringParent1.size(); i++) {
//            for (ConflictChunk conflictChunk : version.getFile().get(i).getChunks()) {
//                for (int j = 0, z = 0; j < filesToStringParent1.get(i).size(); j++) {
//                    String beforeContext = conflictChunk.getBeforeContext().getText().get(z);
//                    if (beforeContext.equals(filesToStringParent1.get(i).get(j))) {
//                        z++;
//                        conflictChunk.getChunkVersion1().setLineBegin(j + 1);
//                    }
//                    if (z == conflictChunk.getBeforeContext().getText().size()) {
//                        break;
//                    }
//                }
//
//                for (int j = 0; j < filesToStringParent1.get(i).size(); j++) {
//
//                    if (conflictChunk.getAfterContext().getText().contains(filesToStringParent1.get(i).get(j).toString())) {
//                        conflictChunk.getChunkVersion1().setLineEnd(j + 1);
//                        break;
//                    }
//                }
//
//            }
//        }
//
//        for (int i = 0; i < filesToStringParent2.size(); i++) {
//            for (ConflictChunk conflictChunk : version.getFile().get(i).getChunks()) {
//                for (int j = 0, z = 0; j < filesToStringParent2.get(i).size(); j++) {
//                    String beforeContext = conflictChunk.getBeforeContext().getText().get(z);
//                    if (beforeContext.equals(filesToStringParent2.get(i).get(j))) {
//                        z++;
//                        conflictChunk.getChunkVersion2().setLineBegin(j + 1);
//                    }
//                    if (z == conflictChunk.getBeforeContext().getText().size()) {
//                        break;
//                    }
//                }
//
//                for (int j = 0; j < filesToStringParent2.get(i).size(); j++) {
//
//                    if (conflictChunk.getAfterContext().getText().contains(filesToStringParent1.get(i).get(j).toString())) {
//                        conflictChunk.getChunkVersion2().setLineEnd(j + 1);
//                        break;
//                    }
//                }
//
//            }
//        }
        for (int y = 0; y < version.getFile().size(); y++) {
            DiffTranslator diffTranslator = new DiffTranslator();
            diffTranslator.translator(filesToCheckParent1.get(y), filesToCheckParent2.get(y), pathRepositoryCopy1);
            diffTranslator.findIntervals(version);

            for (ConflictChunk chunk : version.getFile().get(y).getChunks()) {

                chunk.getChunkVersion1().setLanguageConstruct(parent1.findLanguageConstructs((String) parent1.getEnviroment().keySet().toArray()[y], chunk.getChunkVersion1()));
                chunk.getChunkVersion2().setLanguageConstruct(parent2.findLanguageConstructs((String) parent2.getEnviroment().keySet().toArray()[y], chunk.getChunkVersion2()));

            }

        }

        Main jung = new Main(parent1, parent2, version.getFile().get(0).getChunks(), parent1.getEnviroment().keySet(), parent2.getEnviroment().keySet());
        jung.main(args);

        File dirParent = new File("/home/felipepe/Área de Trabalho/projetos/sandbox/");

        try {
            FileUtils.deleteDirectory(dirParent);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static List<Chunk> getChunkBinding(ParserJava parserJava) {

        List<Chunk> listChunk = new ArrayList<>();
        for (MyFile myFile : version.getFile()) {

            for (br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk chunk
                    : myFile.getChunks()) {
                Chunk chunkBinding = new Chunk();
                chunkBinding.setLineBegin(chunk.getBegin().getLineNumber());
                chunkBinding.setLineEnd(chunk.getEnd().getLineNumber());
                chunkBinding.setLanguageConstruct(parserJava.getGlobalEnviroment().findLanguageConstructs(chunk.getPath(), chunkBinding));
                listChunk.add(chunkBinding);
            }
        }

        return listChunk;
    }

    private static String createDiffRepository(String path, String pasta) throws IOException {

        String source = path;
        File srcDir = new File(source);

        String destination = "/home/felipepe/Documentos/projetos/sandbox/" + pasta;
        File destDir = new File(destination);

        try {
            FileUtils.copyDirectory(srcDir, destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return destination;
    }

    //TODO
    //
    //Achar as linhas originais: 
    // primera linha pré e pós marcação de conflito
    // encontrar essas linhas na v1 e v2
    // pegar bindings entre os intervalos nas v1 e v2
    // comparar modificações v1 do chunk 1 com v2 chunk 1,2
    // comparar modificações v2 do chunk 1 com v1 chunk 1,2
    //
    //Bindings trocar para na linhas originais
    //Compara-las para verificar dependencias
    //BaseMerge ( Checar mudanças estruturais )
    //
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

    private static void ASTExtractor(List<String> pathList, GlobalEnviroment globalEnviroment) throws IOException {
        ASTExtractor1(pathList, globalEnviroment);

        ASTExtractor2(pathList, globalEnviroment);

        ASTExtractor3(pathList, globalEnviroment);
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
        for (String string : aux.split(".")) {
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
