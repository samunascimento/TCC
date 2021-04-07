package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.exception.*;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.*;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class teste {

    private static String projectPath = "";

    public static void main(String[] args) throws RepositoryNotFound, ParseException {
        String[] projects = {"D:/projects/SAIM", "D:/projects/modeler", "D:/projects/spring-data-neo4j",
                "D:/projects/fongo", "D:/projects/pojobuilder", "D:/projects/Phenex", "D:/projects/OpenMEAP"};
        String[] sha = {"044a3c", "0587bc", "042b1d", "0033c8", "09b977", "0985bf", "0af9d5"};
        List<Version> versions = new ArrayList<>();
        try {
            int i = 1;
            projectPath = projects[i];
            System.out.println("Running project: " + projectPath);
            Version version = start(sha[i]);
            versions.add(version);
            ParserJava parserJava = new ParserJava(version, projectPath);
            ParserJava.main();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<ConflictChunk> createConflictChunksList(String filePath) {

        List<ConflictChunk> result = new ArrayList<>();
        ConflictChunk chunk = new ConflictChunk();

        List<String> content = ListUtils.readFile(filePath);

        int chunkNumber = 0;

        for (int i = 0; i < content.size(); i++) {

            if (content.get(i).startsWith("<<<<<<<")) {
                chunk = new ConflictChunk();
                chunk.setBegin(new Line(ListUtils.getSubList(content, i, i), i));
            }

            if (content.get(i).startsWith("=======")) {
                chunk.setSeparator(new Line(ListUtils.getSubList(content, i, i), i));
            }

            if (content.get(i).startsWith(">>>>>>>")) {
                chunk.setEnd(new Line(ListUtils.getSubList(content, i, i), i));
                chunk.setErrorContent(ListUtils.getSubList(content, chunk.getBegin().getLineNumber(), chunk.getEnd().getLineNumber()));
                chunk.setPath(filePath);
                chunk.setLabel("CC" + (++chunkNumber));
                result.add(chunk);
            }
        }
        return result;
    }

    private static MyFile updateFile(MyFile file) {

        MyFile result = file;
        result.setType(null);
        result.setChunks(createConflictChunksList(result.getPath()));
        result.setContent(ListUtils.readFile(result.getPath()));
        return result;
    }

    public static Version updateVersion(String pathProject, Version version) throws LocalRepositoryNotAGitRepository, OptionNotExist, IOException, RepositoryNotFound, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository, CheckoutError, ThereIsNoMergeToAbort, ThereIsNoMergeToAbort, NotSomethingWeCanMerge, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, AlreadyUpToDate, NotSomethingWeCanMerge {

        Version result = version;

        if (result.getParent().size() == 2) {

            String firstParent = result.getParent().get(0);
            String secondParent = result.getParent().get(1);

            Git.reset(pathProject, true, false, false, null);
            Git.clean(pathProject, true, 0);
            Git.checkout(firstParent, pathProject);

            if (Git.isFailedMerge(pathProject, firstParent, secondParent)) {

                List<MyFile> statusUnmerged = Git.statusUnmerged(pathProject);
                //version.setFile(removeDifferentsExtends(version.getFile()));

                for (MyFile file : statusUnmerged) {
                    if (file.getPath().endsWith(".java")) {
                        while (file.getPath().startsWith(" ")) {
                            file.setPath(file.getPath().replaceFirst(" ", ""));
                        }
                        file.setPath(pathProject.concat("/").concat(file.getPath()));
                        result.getFile().add(updateFile(file));
                    }

                }

                result.setStatus(MergeStatus.CONFLICT);

            } else {
                result.setStatus(MergeStatus.NON_CONFLICT);
            }

        } else {
            result.setMerge(false);
            result.setStatus(MergeStatus.NON_CONFLICT);
        }

        result.setCommiter(null);

        return result;
    }

    private static List<MyFile> removeDifferentsExtends(List<MyFile> files) {

        List<MyFile> result = new ArrayList<>();

        for (MyFile file : files) {
            if (file.getPath().endsWith(".java")) {
                result.add(file);
            }
        }

        return result;
    }

    public static Version start(String sha) throws RepositoryNotFound, ParseException, OptionNotExist, LocalRepositoryNotAGitRepository, IOException {

        Project result = new Project();
        result.setPath(teste.projectPath);

        Version version = new Version();
        version.setSHA(sha);

        List<String> parent = Git.parent(projectPath, sha);
        version.setParent(parent);

        try {
            version = updateVersion(teste.projectPath, version);
        } catch (LocalRepositoryNotAGitRepository | OptionNotExist | IOException | RepositoryNotFound | InvalidDocument | UnknownSwitch | RefusingToClean | IsOutsideRepository | CheckoutError | ThereIsNoMergeToAbort | NotSomethingWeCanMerge | NoRemoteForTheCurrentBranch | ThereIsNoMergeInProgress | AlreadyUpToDate ex) {
            Logger.getLogger(InitProject.class.getName()).log(Level.SEVERE, null, ex);
        }

        return version;
    }

}
