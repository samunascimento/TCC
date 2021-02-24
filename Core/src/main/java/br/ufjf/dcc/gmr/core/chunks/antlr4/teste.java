package br.ufjf.dcc.gmr.core.chunks.antlr4;

import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;
import br.ufjf.dcc.gmr.core.vcs.types.Line;
import br.ufjf.dcc.gmr.core.vcs.types.MergeStatus;
import br.ufjf.dcc.gmr.core.vcs.types.MyFile;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class teste {

    private static String projectPath = "/home/felipepe/Documentos/projetos/exercicio/lorsource";

    public static void main(String[] args) throws RepositoryNotFound, ParseException, Exception {

         Version version = start();
         
         ParserJava parserJava = new ParserJava(version, teste.projectPath);
         
         String[] arg = null;
         ParserJava.main(arg);

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

                for (MyFile file : statusUnmerged) {
                    while (file.getPath().startsWith(" ")) {
                        file.setPath(file.getPath().replaceFirst(" ", ""));
                    }
                    file.setPath(pathProject.concat(File.separator).concat(file.getPath()));
                    result.getFile().add(updateFile(file));
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

    public static Version start() throws RepositoryNotFound, ParseException {

      

        Project result = new Project();
        result.setPath(teste.projectPath);

        Version version = new Version();
        version.setSHA("159d31");

        List<String> parent = new ArrayList<>();
        parent.add("3ff364c28");
        parent.add("9170a3528");
        version.setParent(parent);

        try {
            version = updateVersion(teste.projectPath, version);
        } catch (LocalRepositoryNotAGitRepository | OptionNotExist | IOException | RepositoryNotFound | InvalidDocument | UnknownSwitch | RefusingToClean | IsOutsideRepository | CheckoutError | ThereIsNoMergeToAbort | NotSomethingWeCanMerge | NoRemoteForTheCurrentBranch | ThereIsNoMergeInProgress | AlreadyUpToDate ex) {
            Logger.getLogger(InitProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return version;
    }

}
