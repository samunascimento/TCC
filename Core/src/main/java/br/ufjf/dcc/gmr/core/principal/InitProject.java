/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.principal;

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
import br.ufjf.dcc.gmr.core.vcs.Git;
import static br.ufjf.dcc.gmr.core.vcs.Git.mergeIsConflicting;
import static br.ufjf.dcc.gmr.core.vcs.Git.status;
import br.ufjf.dcc.gmr.core.vcs.types.Chunk;
import br.ufjf.dcc.gmr.core.vcs.types.File;
import br.ufjf.dcc.gmr.core.vcs.types.FileUnmerged;
import br.ufjf.dcc.gmr.core.vcs.types.Formats;
import br.ufjf.dcc.gmr.core.vcs.types.Line;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import br.ufjf.dcc.gmr.core.vcs.types.Status;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;

/**
 *
 * @author felip
 *
 */
public class InitProject {

    public Project project(String name, String path) throws AlreadyUpToDate, ThereIsNoMergeInProgress, NoRemoteForTheCurrentBranch, NotSomethingWeCanMerge, ThereIsNoMergeToAbort, CheckoutError, RepositoryNotFound, OptionNotExist, ParseException, LocalRepositoryNotAGitRepository, IsOutsideRepository, RefusingToClean, UnknownSwitch, InvalidDocument, IOException {
      
        return createProject(name, path);
    }

    private static List<Chunk> createConflictChunksList(String filePath) {

        List<Chunk> result = new ArrayList<>();
        Chunk chunk = new Chunk();

        try {

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String linha;
            List<String> str = new ArrayList<>();

            while ((linha = br.readLine()) != null) {
                str.add(linha);
            }

            for (int i = 0; i < str.size(); i++) {

                if (str.get(i).contains("<<<<<<<")) {
                    chunk = new Chunk();
                    chunk.setBegin(new Line(getSubList(str, i, i), i + 1));
                }

                if (str.get(i).startsWith("=======")) {
                    chunk.setSeparator(new Line(getSubList(str, i, i), i + 1));
                }

                if (str.get(i).contains(">>>>>>>")) {
                    chunk.setEnd(new Line(getSubList(str, i, i), i + 1));
                    chunk.setContent(getSubList(str, chunk.getBegin().getLineNumber() - 1, chunk.getEnd().getLineNumber() - 1));
                }
            }

        } catch (IOException e) {
            System.out.println("File not found!");
        }
        return result;
    }

    private static List<String> getSubList(List<String> content, int begin, int end) {

        List<String> result = new ArrayList<>();

        for (int i = begin; i <= end; i++) {
            result.add(content.get(i));
        }

        return result;

    }

    private static File createFile(String pathFile) {

        File result = new File();

        result.setPath(pathFile);
        result.setStatus(Status.UNMERGED);
        result.setType(null);
        result.setChuncks(createConflictChunksList(pathFile));

        return result;
    }

    private static Version createVersion(String pathProject, String SHA) throws LocalRepositoryNotAGitRepository, OptionNotExist, IOException, RepositoryNotFound, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository, CheckoutError, ThereIsNoMergeToAbort, ThereIsNoMergeToAbort, NotSomethingWeCanMerge, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, AlreadyUpToDate, NotSomethingWeCanMerge {

        Version result = new Version();

        List<String> parents = Git.parent(pathProject, SHA);
        result.setParent(parents);

        if (parents.size() == 2) {

            Git.reset(pathProject, true, false, false, null);

            Git.clean(pathProject, true, 0);

            Git.checkout(parents.get(0), pathProject);

            if (Git.mergeIsConflicting(parents.get(0), pathProject, true, true)) {

                Git.merge(pathProject, parents.get(1), false, true);

                FileUnmerged statusUnmerged = Git.statusUnmerged(pathProject);

                for (String file : statusUnmerged.file.unmerged) {

                    result.getFile().add(createFile(file));
                }

            }

        }

        return result;
    }
    
    private static Project createProject(String name, String pathProject) throws IOException, LocalRepositoryNotAGitRepository, ParseException, OptionNotExist, RepositoryNotFound, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository, CheckoutError, ThereIsNoMergeToAbort, NotSomethingWeCanMerge, NoRemoteForTheCurrentBranch, AlreadyUpToDate, ThereIsNoMergeInProgress {
        
        Project result = new Project();
        List<Version> aux = new ArrayList<>();
        result.setName(name);
        result.setPath(pathProject);
        
        List<Formats> logs = Git.log(pathProject);
        
        for (Formats log : logs) {
            
            aux.add(createVersion(pathProject,log.getCommitHash()));
        }
        
        result.setVersions(aux);
        
        return result;
    }

   
}

/*List<Formats> list = new ArrayList<>();
        List<Version> versionList = new ArrayList<>();

        try {
            list = Git.logAll(pathProject);
        } catch (IOException | LocalRepositoryNotAGitRepository | ParseException e) {
        }

        for (Formats item : list) {
            Version version;
            version = new Version(item.getCommitHash(), item.getAuthorName(), item.getAuthorDate(), Git.parent(project.getPath(), item.getCommitHash()).size() > 1, Git.parent(project.getPath(), item.getCommitHash()), item.getCommitDescription());

            versionList.add(version);
        }

        project.setVersions(versionList);*/
