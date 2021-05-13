package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;
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
import java.awt.HeadlessException;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
    private static int context = 0;
    private static ConfigurationFile configurationFile;
    private static GlobalEnviroment parent1 = new GlobalEnviroment();
    private static GlobalEnviroment parent2 = new GlobalEnviroment();
    private static List<String> javaFiles = new ArrayList<>();
    private static List<ConflictChunk> conflictChunkList = new ArrayList<>();

    public ParserJava(Version version) {
        this.version = version;
        this.globalEnviroment = new GlobalEnviroment();

    }

    public ParserJava(Version version, ConfigurationFile configurationFile) {
        this.configurationFile = configurationFile;
        this.version = version;
        this.globalEnviroment = new GlobalEnviroment();

    }

    public static void main() throws Exception {
        //Definindo os arquivos com conflitos
        for (MyFile myFile : version.getFile()) {
            String filePath = myFile.getPath();
            javaFiles.add(filePath);
        }
        String[] SHA = {version.getParent().get(0), version.getParent().get(1)};

        ParserJava.parent1 = extractParents(configurationFile.getProjectPath(), configurationFile.getSandboxPath(), SHA[0], "parent1", javaFiles);
        ParserJava.parent2 = extractParents(configurationFile.getProjectPath(), configurationFile.getSandboxPath(), SHA[1], "parent2", javaFiles);
        
        setBeforeAndAfterContext();

        createConflictChunkList();

        //createJungGraph(parent1, parent2, conflictChunkList);
        List<List<DependencyType>> dependency = parent1.findDependencies(conflictChunkList);
        
        System.out.println("");
    }

    private static void createConflictChunkList() throws IOException {

        DiffTranslator diffTranslator = new DiffTranslator();

        for (int y = 0; y < version.getFile().size(); y++) {

            for (ConflictChunk chunk : version.getFile().get(y).getChunks()) {
                System.out.println("");
                List<List<String>> conflictContent = ParserTools.cutConflitcContent(chunk.getErrorContent());
                int version1[] = new int[2];
                int version2[] = new int[2];

                if (conflictContent.get(0).size() == 0) {
                    version2 = ParserTools.getParentLines(configurationFile.getFilesToCheckParent2().get(y), conflictContent.get(1));
                    version1[0] = diffTranslator.inicializeFindLine(configurationFile.getFilesToCheckParent1().get(y), configurationFile.getFilesToCheckParent2().get(y), configurationFile.getProjectPath(), version2[0]);
                    version1[1] = diffTranslator.inicializeFindLine(configurationFile.getFilesToCheckParent1().get(y), configurationFile.getFilesToCheckParent2().get(y), configurationFile.getProjectPath(), version2[1]);

                } else {
                    if (conflictContent.get(1).size() == 0) {
                        version1 = ParserTools.getParentLines(configurationFile.getFilesToCheckParent1().get(y), conflictContent.get(0));
                        version2[0] = diffTranslator.inicializeFindLine(configurationFile.getFilesToCheckParent1().get(y), configurationFile.getFilesToCheckParent2().get(y), configurationFile.getProjectPath(), version1[0]);
                        version2[1] = diffTranslator.inicializeFindLine(configurationFile.getFilesToCheckParent1().get(y), configurationFile.getFilesToCheckParent2().get(y), configurationFile.getProjectPath(), version1[1]);

                    } else {
                        version1 = ParserTools.getParentLines(configurationFile.getFilesToCheckParent1().get(y), conflictContent.get(0));
                        version2 = ParserTools.getParentLines(configurationFile.getFilesToCheckParent2().get(y), conflictContent.get(1));
                    }

                }

                chunk.getChunkVersion1().setLineBegin(version1[0]);
                chunk.getChunkVersion2().setLineBegin(version2[0]);

                chunk.getChunkVersion1().setLineEnd(version1[1]);
                chunk.getChunkVersion2().setLineEnd(version2[1]);

                chunk.getChunkVersion1().setLanguageConstruct(parent1.findLanguageConstructs(configurationFile.getFilesToCheckParent1().get(y), chunk.getChunkVersion1()));
                chunk.getChunkVersion2().setLanguageConstruct(parent2.findLanguageConstructs(configurationFile.getFilesToCheckParent2().get(y), chunk.getChunkVersion2()));
            }
            conflictChunkList.addAll(version.getFile().get(y).getChunks());

        }

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
    private static GlobalEnviroment extractParents(String projectPath, String sandboxPath, String SHA, String parent, List<String> javaFiles) throws IOException, UnknownSwitch, RefusingToClean, IsOutsideRepository {

        String pathRepositoryClone;

        List<String> filesToCheckParent = new ArrayList<>();

        ParserJava parserJavaParent = new ParserJava(version);

        List<List<String>> filesToStringParent1 = new ArrayList<>();
        List<List<String>> filesToStringParent2 = new ArrayList<>();

        ParserTools.checkoutToParent(projectPath, SHA);
        pathRepositoryClone = pathRepositoryClone(projectPath, sandboxPath, parent, SHA);
        filesToCheckParent = ParserTools.filesToCheckParent(pathRepositoryClone, javaFiles);
        ASTExtractor(filesToCheckParent, parserJavaParent.getGlobalEnviroment());
        Set<String> pathsParent = parserJavaParent.getGlobalEnviroment().getEnviroment().keySet();

        filesToStringParent1 = ParserTools.filesToStringParent(filesToCheckParent);

        if (parent.equals("parent1")) {
            configurationFile.setFilesToCheckParent1(filesToCheckParent);
        }
        if (parent.equals("parent2")) {
            configurationFile.setFilesToCheckParent2(filesToCheckParent);
        }

        return parserJavaParent.getGlobalEnviroment();

//        ParserTools.printCompare(javaFiles, pathsParent, parserJavaParent1.getGlobalEnviroment(), parserJavaParent2.getGlobalEnviroment());
//        String[] SHA = {version.getParent().get(0), version.getParent().get(1)};
//
//        String pathRepositoryClone1;
//        String pathRepositoryClone2;
//
//        List<String> filesToCheckParent1 = new ArrayList<>();
//        List<String> filesToCheckParent2 = new ArrayList<>();
//
//        ParserJava parserJavaParent1 = new ParserJava(version);
//        ParserJava parserJavaParent2 = new ParserJava(version);
//
//        List<List<String>> filesToStringParent1 = new ArrayList<>();
//        List<List<String>> filesToStringParent2 = new ArrayList<>();
//
//        /* parent1 zone
//         */
//        ParserTools.checkoutToParent(configurationFile.getProjectPath(), SHA[0]);
//        pathRepositoryClone1 = pathRepositoryClone(configurationFile.getProjectPath(), configurationFile.getSandboxPath(), "parent1", SHA[0]);
//        filesToCheckParent1 = ParserTools.filesToCheckParent(pathRepositoryClone1, javaFiles);
//        ASTExtractor(filesToCheckParent1, parserJavaParent1.getGlobalEnviroment());
//        Set<String> pathsParent1 = parserJavaParent1.getGlobalEnviroment().getEnviroment().keySet();
//        parent1 = parserJavaParent1.getGlobalEnviroment();
//        filesToStringParent1 = ParserTools.filesToStringParent(filesToCheckParent1);
//
//        /*parent2 zone
//         */
//        ParserTools.checkoutToParent(configurationFile.getProjectPath(), SHA[1]);
//        pathRepositoryClone2 = pathRepositoryClone(configurationFile.getProjectPath(), configurationFile.getSandboxPath(), "parent2", SHA[1]);
//        filesToCheckParent2 = ParserTools.filesToCheckParent(pathRepositoryClone2, javaFiles);
//        ASTExtractor(filesToCheckParent2, parserJavaParent2.getGlobalEnviroment());
//        Set<String> pathsParent2 = parserJavaParent2.getGlobalEnviroment().getEnviroment().keySet();
//        parent2 = parserJavaParent2.getGlobalEnviroment();
//        filesToStringParent2 = ParserTools.filesToStringParent(filesToCheckParent2);
//
//        configurationFile.setFilesToCheckParent1(filesToCheckParent1);
//        configurationFile.setFilesToCheckParent2(filesToCheckParent2);
//
//        ParserTools.printCompare(javaFiles, pathsParent1, parserJavaParent1.getGlobalEnviroment(), parserJavaParent2.getGlobalEnviroment());
    }

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

    private static String pathRepositoryClone(String pathProject, String pathSandbox, String parent, String SHA) throws IOException {

        return createDiffRepository(pathProject, pathSandbox, parent, SHA);

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

    static protected void compare(TypeBinding AST1, TypeBinding AST2, GlobalEnviroment globalEnviroment) {

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

    public static int getContext() {
        return context;
    }

    public static void setContext(int context) {
        ParserJava.context = context;
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

    /**
     * @return the configurationFile
     */
    public ConfigurationFile getConfigurationFile() {
        return configurationFile;
    }

    /**
     * @param configurationFile the configurationFile to set
     */
    public void setConfigurationFile(ConfigurationFile configurationFile) {
        this.configurationFile = configurationFile;
    }

}
