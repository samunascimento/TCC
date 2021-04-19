package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.model.Chunk;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor1;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor2;
import br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.Visitor3;
import br.ufjf.dcc.gmr.core.chunks.jung.Main;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
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
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParserJava {

    private static boolean reachedEnd = false;

    private GlobalEnviroment globalEnviroment;
    private static Version version;
    private static String pathProject = "";
    private static String pathSandbox = "";
    private static int context = 0;
    private static String pathRepositoryCopy = "";
    private static String pathRepositoryCopy1 = "";
    private static String pathRepositoryCopy2 = "";
    private static List<String> filesToCheckParent1 = new ArrayList<>();
    private static List<String> filesToCheckParent2 = new ArrayList<>();
    private static List<List<String>> filesToStringParent1 = new ArrayList<>();
    private static List<List<String>> filesToStringParent2 = new ArrayList<>();
    private static GlobalEnviroment parent1 = new GlobalEnviroment();
    private static GlobalEnviroment parent2 = new GlobalEnviroment();
    private static List<String> javaFiles = new ArrayList<>();
    private static List<ConflictChunk> conflictChunkList = new ArrayList<>();

    public ParserJava(Version version) {
        this.version = version;
        this.globalEnviroment = new GlobalEnviroment();

    }

    public ParserJava(Version version, String pathProject, String pathSandbox) {
        this.pathSandbox = pathSandbox;
        this.version = version;
        this.globalEnviroment = new GlobalEnviroment();
        this.pathProject = pathProject;

    }

    public static void main() throws Exception {
        //Definindo os arquivos com conflitos
        for (MyFile myFile : version.getFile()) {
            String filePath = myFile.getPath();
            javaFiles.add(filePath);
        }

        extractParents();

        setBeforeAndAfterContext();

        createConflictChunkList();

        createJungGraph(parent1, parent2, conflictChunkList);
    }

    private static void createConflictChunkList() throws IOException {
        for (int y = 0; y < version.getFile().size(); y++) {

            for (ConflictChunk chunk : version.getFile().get(y).getChunks()) {
                System.out.println("");
                List<List<String>> conflictContent = cutConflitcContent(chunk.getErrorContent());
                int version1[] = new int[2];
                int version2[] = new int[2];

                if (conflictContent.get(0).size() == 0) {
                    version2 = getParentLines(filesToCheckParent2.get(y), conflictContent.get(1));
                    version1[0] = foundLine(filesToCheckParent1.get(y), filesToCheckParent2.get(y), version2[0]);
                    version1[1] = foundLine(filesToCheckParent1.get(y), filesToCheckParent2.get(y), version2[1]);

                } else {
                    if (conflictContent.get(1).size() == 0) {
                        version1 = getParentLines(filesToCheckParent1.get(y), conflictContent.get(0));
                        version2[0] = foundLine(filesToCheckParent1.get(y), filesToCheckParent2.get(y), version1[0]);
                        version2[1] = foundLine(filesToCheckParent1.get(y), filesToCheckParent2.get(y), version1[1]);

                    } else {
                        version1 = getParentLines(filesToCheckParent1.get(y), conflictContent.get(0));
                        version2 = getParentLines(filesToCheckParent2.get(y), conflictContent.get(1));
                    }

                }

                chunk.getChunkVersion1().setLineBegin(version1[0]);
                chunk.getChunkVersion2().setLineBegin(version2[0]);

                chunk.getChunkVersion1().setLineEnd(version1[1]);
                chunk.getChunkVersion2().setLineEnd(version2[1]);
                if (version1[1] == -1) {
                    System.out.println("debug");
                }

                chunk.getChunkVersion1().setLanguageConstruct(parent1.findLanguageConstructs(filesToCheckParent1.get(y), chunk.getChunkVersion1()));
                chunk.getChunkVersion2().setLanguageConstruct(parent2.findLanguageConstructs(filesToCheckParent2.get(y), chunk.getChunkVersion2()));
            }
            conflictChunkList.addAll(version.getFile().get(y).getChunks());

        }
        System.out.println("debug");
    }

    private static int foundLine(String sourcePath, String targetPath, int sourceLine) throws IOException {

        int result;
        DiffTranslator diffTranslator = new DiffTranslator();
        diffTranslator.translator(sourcePath, targetPath, pathProject);
        result = diffTranslator.findLines(sourcePath, targetPath, sourceLine);

        return result;
    }

    private static int[] getParentLines(String targetFile, List<String> sourceBlock) {
        int result[] = {0, 0};

        int preContext = 0;
        int posContext = 0;
        List<String> targetContent = ListUtils.readFile(targetFile);
        int j = 0;
        for (int i = 0; i < targetContent.size() && j < sourceBlock.size(); i++) {
            if (targetContent.get(i).equals(sourceBlock.get(j))) {
                j++;
            }
            posContext = i;
        }
        preContext = posContext - j;
        posContext += 1;

        result[0] = preContext;
        result[1] = posContext;

        return result;
    }

    private static List<List<String>> cutConflitcContent(List<String> content) {

        List<List<String>> result = new ArrayList<>();

        List<String> aux = new ArrayList<>();
        int i = 1;
        while (!content.get(i).contains("=======")) {

            aux.add(content.get(i));
            i++;
        }
        result.add(aux);
        aux = new ArrayList<>();
        i++;
        while (!content.get(i).contains(">>>>>>>")) {
            aux.add(content.get(i));
            i++;
        }
        result.add(aux);

        return result;

    }

    private static void createJungGraph(GlobalEnviroment parent1, GlobalEnviroment parent2, List<ConflictChunk> conflictChunkList) {
        Main jung = new Main(parent1, parent2, conflictChunkList, parent1.getEnviroment().keySet(), parent2.getEnviroment().keySet());
        jung.main();
        File dirParent = new File("/Documentos/projetos/sandbox/");

        try {
            FileUtils.deleteDirectory(dirParent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* 
    Refactoring
     */
    private static void extractParents() throws IOException, UnknownSwitch, RefusingToClean, IsOutsideRepository {
        int cont = 0;
        for (String parent : version.getParent()) {

            Git.reset(ParserJava.pathProject, true, false, false, null);
            Git.clean(ParserJava.pathProject, true, 0);
            Git.checkout(parent, ParserJava.pathProject);

            ParserJava parserJava = new ParserJava(version);

            int j = 0, i = 0;

            /*
            begin
            */
            if (cont == 0) {
                pathRepositoryCopy = createDiffRepository(ParserJava.pathProject, ParserJava.pathSandbox, "parent11", version.getParent().get(0));
                pathRepositoryCopy1 = pathRepositoryCopy;
            } else {
                pathRepositoryCopy = createDiffRepository(ParserJava.pathProject, ParserJava.pathSandbox, "parent2", version.getParent().get(0));
                pathRepositoryCopy2 = pathRepositoryCopy;
            }

            /*
            end
            */
            
            File cloneDirectory = new File(pathRepositoryCopy);
            if (cloneDirectory.isDirectory()) {
                List<String> jaja = javaFiles(pathRepositoryCopy);

                for (String javaFile : javaFiles) {
                    String[] split = javaFile.split("/");
                    for (String string : jaja) {
                        String[] stringSplited = string.split("\\\\");
                        if (stringSplited[stringSplited.length - 1].equals(split[split.length - 1])) {
                            if (cont == 0) {
                                filesToCheckParent1.add(string);
                            } else {
                                filesToCheckParent2.add(string);
                            }
                        }
                    }
                }
            }

            if (cont == 0) {
                ASTExtractor(filesToCheckParent1, parserJava.getGlobalEnviroment());
            } else {
                ASTExtractor(filesToCheckParent2, parserJava.getGlobalEnviroment());
            }

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

            } else {
                parent2 = parserJava.getGlobalEnviroment();
                for (String path : filesToCheckParent2) {
                    filesToStringParent2.add(ListUtils.readFile(path));
                }
            }

            cont++;

        }
    }

    //aqui ta setando só o numero da linha por enquanto pelo visto
    private static void setBeforeAndAfterContext() {
        for (int i = 0; i < version.getFile().size(); i++) {
            for (int z = 0; z < version.getFile().get(i).getChunks().size(); z++) {

                int begin = version.getFile().get(i).getChunks().get(z).getBegin().getLineNumber();
                int end = version.getFile().get(i).getChunks().get(z).getEnd().getLineNumber();

                version.getFile().get(i).getChunks().get(z).getBeforeContext().setLineEnd(begin - 1);

                if (((begin - 1) - context) > 0) {
                    version.getFile().get(i).getChunks().get(z).getBeforeContext().setLineBegin((begin - 1) - context);
                    version.getFile().get(i).getChunks().get(z).getBeforeContext().setText(setContextContent((begin - 1) - context, begin - 1, version.getFile().get(i)));
                    // aqui ele pega as strings /\

                } else {
                    version.getFile().get(i).getChunks().get(z).getBeforeContext().setLineBegin(0);
                    version.getFile().get(i).getChunks().get(z).getBeforeContext().setText(setContextContent(0, begin - 1, version.getFile().get(i)));
                }

                if ((end + context) < version.getFile().get(i).getContent().size()) {
                    version.getFile().get(i).getChunks().get(z).getAfterContext().setLineEnd(end + context);
                    version.getFile().get(i).getChunks().get(z).getAfterContext().setText(setContextContent(end + 1, end + context, version.getFile().get(i)));
                } else {
                    version.getFile().get(i).getChunks().get(z).getAfterContext().setLineEnd(version.getFile().get(i).getContent().size() - 1);
                    version.getFile().get(i).getChunks().get(z).getAfterContext().setText(setContextContent(end + 1, version.getFile().get(i).getContent().size() - 1, version.getFile().get(i)));
                }
                version.getFile().get(i).getChunks().get(z).getAfterContext().setLineBegin(end + 1);

            }
        }
    }

    private static List<String> setContextContent(int begin, int end, MyFile file) {

        List<String> result = new ArrayList<>();

        for (int i = begin; i <= end; i++) {
            result.add(file.getContent().get(i));
        }

        return result;
    }

    private static String createDiffRepository(String path, String sandbox, String pasta, String targetSHA) throws IOException {

        File srcDir = new File(path);
        File destDir = new File(sandbox, pasta);
        try {

            Git.clone(srcDir.getAbsolutePath(), sandbox, pasta);
            Git.reset(destDir.getAbsolutePath(), true, false, false, null);
            Git.clean(destDir.getAbsolutePath(), true, 0);
            Git.checkout(targetSHA, destDir.getAbsolutePath());
            

        } catch (RepositoryNotFound ex) {
            Logger.getLogger(ParserJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UrlNotFound ex) {
            Logger.getLogger(ParserJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RepositoryAlreadyExist ex) {
            Logger.getLogger(ParserJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownSwitch ex) {
            Logger.getLogger(ParserJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RefusingToClean ex) {
            Logger.getLogger(ParserJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IsOutsideRepository ex) {
            Logger.getLogger(ParserJava.class.getName()).log(Level.SEVERE, null, ex);
        }

        return destDir.getAbsolutePath();
    }

    private static void compare(TypeBinding AST1, TypeBinding AST2, GlobalEnviroment globalEnviroment) {

        /*System.out.println("***************MethodDeclarationAST1***************");
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
         */
        //System.out.println("***************Dependencies***************");
        //System.out.println("--------------AST1 --> AST2--------------");
        Dependencies.methodDeclarationCallList(AST1.getAllMethodsDeclaration(), AST1, AST2.getAllMethodsCallBinding());
        //System.out.println("--------------AST2 --> AST1--------------");
        Dependencies.methodDeclarationCallList(AST2.getAllMethodsDeclaration(), AST2, AST1.getAllMethodsCallBinding());
        //System.out.println("***************Chunks***************");

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

                //TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                //viewer.setSize(new Dimension(500, 600));
                //viewer.open();
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

            //TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            //viewer.setSize(new Dimension(500, 600));
            //viewer.open();
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

            //TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            //viewer.setSize(new Dimension(500, 600));
            //viewer.open();
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

    public static int getContext() {
        return context;
    }

    public static void setContext(int context) {
        ParserJava.context = context;
    }

    /**
     * @return the filesToCheckParent1
     */
    public List<String> getFilesToCheckParent1() {
        return filesToCheckParent1;
    }

    /**
     * @param filesToCheckParent1 the filesToCheckParent1 to set
     */
    public void setFilesToCheckParent1(List<String> filesToCheckParent1) {
        this.filesToCheckParent1 = filesToCheckParent1;
    }

    /**
     * @return the filesToCheckParent2
     */
    public List<String> getFilesToCheckParent2() {
        return filesToCheckParent2;
    }

    /**
     * @param filesToCheckParent2 the filesToCheckParent2 to set
     */
    public void setFilesToCheckParent2(List<String> filesToCheckParent2) {
        this.filesToCheckParent2 = filesToCheckParent2;
    }

    /**
     * @return the filesToStringParent1
     */
    public List<List<String>> getFilesToStringParent1() {
        return filesToStringParent1;
    }

    /**
     * @param filesToStringParent1 the filesToStringParent1 to set
     */
    public void setFilesToStringParent1(List<List<String>> filesToStringParent1) {
        this.filesToStringParent1 = filesToStringParent1;
    }

    /**
     * @return the filesToStringParent2
     */
    public List<List<String>> getFilesToStringParent2() {
        return filesToStringParent2;
    }

    /**
     * @param filesToStringParent2 the filesToStringParent2 to set
     */
    public void setFilesToStringParent2(List<List<String>> filesToStringParent2) {
        this.filesToStringParent2 = filesToStringParent2;
    }

    /**
     * @return the parent1
     */
    public GlobalEnviroment getParent1() {
        return parent1;
    }

    /**
     * @param parent1 the parent1 to set
     */
    public void setParent1(GlobalEnviroment parent1) {
        this.parent1 = parent1;
    }

    /**
     * @return the parent2
     */
    public GlobalEnviroment getParent2() {
        return parent2;
    }

    /**
     * @param parent2 the parent2 to set
     */
    public void setParent2(GlobalEnviroment parent2) {
        this.parent2 = parent2;
    }

}
