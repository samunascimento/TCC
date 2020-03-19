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
import br.ufjf.dcc.gmr.core.vcs.types.Chunk;
import br.ufjf.dcc.gmr.core.vcs.types.File;
import br.ufjf.dcc.gmr.core.vcs.types.FileUnmerged;
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

/**
 *
 * @author felip
 *
 */
public class InitProject {

    public Project project(String name, String path) throws IOException, LocalRepositoryNotAGitRepository, ParseException, OptionNotExist, RepositoryNotFound, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, NotSomethingWeCanMerge, ThereIsNoMergeToAbort, AlreadyUpToDate {

        
        Project project = new Project();

        project.setName(name);
        project.setPath(path);

        //createVersionList(project);
        //createFileList(project);
        //printOutVersionList(project.getVersions(), false);
        //printOutVersionList(project.getVersions(), true);
        /* List<Formats> mergeList = Conflicts.getMerges(repository);
        try {
            Conflicts.getConflicts(mergeList, repository);
        } catch (LocalRepositoryNotAGitRepository | OptionNotExist | IOException | RepositoryNotFound | CheckoutError e) {
        }
        FileStatus status = null;
        try {
            status = Git.status(repository);
        } catch (RepositoryNotFound | IOException e) {
        }

        System.out.println("||||||||||||||||||||||||||||MERGES||||||||||||||||||||||||||");
         for (Object statu : status.files.allStatus) {
            System.out.println(statu);
         }*/
        return project;
    }

    public static List<Chunk> createConflictChunksList(String filePath) {

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

    public static File createFile(String pathFile) {

        File result = new File();

        result.setPath(pathFile);
        result.setStatus(Status.UNMERGED);
        result.setType(null);
        result.setChuncks(createConflictChunksList(pathFile));

        return result;
    }

    public static Version createVersion(String pathProject, String SHA) throws LocalRepositoryNotAGitRepository, OptionNotExist, IOException, RepositoryNotFound, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository, CheckoutError, ThereIsNoMergeToAbort, ThereIsNoMergeToAbort, NotSomethingWeCanMerge, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, AlreadyUpToDate, NotSomethingWeCanMerge {

        Version result = new Version();

        List<String> parents = Git.parent(pathProject, SHA);

        if (parents.size() == 2) {

            Git.reset(pathProject, true, false, false, null);

            Git.clean(pathProject, true, 0);

            Git.checkout(parents.get(0), pathProject);

            if (Git.mergeIsConflicting(parents.get(0), pathProject, true, true)) {

                Git.merge(pathProject, parents.get(1), false, true);

                List<String> statusUnmerged = Git.statusUnmerged(pathProject);

                for (String file : statusUnmerged) {

                    result.getFile().add(createFile(file));
                }

            }

        }

        return result;
    }

    public static void printOutVersionList(List<Version> versionList, boolean parentPrint) {
        //get the biggest author name for the formatting be correct
        String biggestAuthorName = versionList.get(0).getAuthor();
        String spaceAux = new String();

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||START|||||||||||||||||||||||||||||||||||||||||||");
        if (parentPrint) {
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||ONLY MERGE VERSIONS|||||||||||||||||||||||||||||||||||||||||||");
            for (int i = 1; i < versionList.size(); i++) {
                if (biggestAuthorName.length() < versionList.get(i).getAuthor().length()) {
                    biggestAuthorName = versionList.get(i).getAuthor();
                }
            }
            for (int i = versionList.size() - 1; i >= 0; i--) {

                if (versionList.get(i).isMerge()) {
                    System.out.print(versionList.get(i).getAuthor());
                    //calculates how much blank spaces are needed for the formatting be correct 
                    for (int j = 0; j < biggestAuthorName.length() - versionList.get(i).getAuthor().length(); j++) {
                        spaceAux += " ";
                    }

                    System.out.print(spaceAux + " || ");
                    spaceAux = "";
                    System.out.print(versionList.get(i).getSHA());
                    System.out.print(" || ");
                    System.out.print(versionList.get(i).getDate());
                    System.out.print(" || ");
                    System.out.print(versionList.get(i).getParent());
                    System.out.print(" || ");
                    System.out.println(versionList.get(i).getDescription());
                }
            }
        } else {
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||ALL VERSIONS|||||||||||||||||||||||||||||||||||||||||||");
            for (int i = 1; i < versionList.size(); i++) {
                if (biggestAuthorName.length() < versionList.get(i).getAuthor().length()) {
                    biggestAuthorName = versionList.get(i).getAuthor();
                }
            }
            for (int i = versionList.size() - 1; i >= 0; i--) {
                System.out.print(versionList.get(i).getAuthor());
                //calculates how much blank spaces are needed for the formatting be correct 
                for (int j = 0; j < biggestAuthorName.length() - versionList.get(i).getAuthor().length(); j++) {
                    spaceAux += " ";
                }

                System.out.print(spaceAux + " || ");
                spaceAux = "";
                System.out.print(versionList.get(i).getSHA());
                System.out.print(" || ");
                System.out.print(versionList.get(i).getDate());
                System.out.print(" || ");
                System.out.println(versionList.get(i).getDescription());

            }
        }
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||END|||||||||||||||||||||||||||||||||||||||||||");
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
