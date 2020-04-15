/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.exception.*;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.*;
import java.io.BufferedReader;
import java.io.File;
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
                
                if (str.get(i).startsWith("<<<<<<<")) {
                    chunk = new Chunk();
                    chunk.setBegin(new Line(ListUtils.getSubList(str, i, i), i + 1));
                }

                if (str.get(i).startsWith("=======")) {
                    chunk.setSeparator(new Line(ListUtils.getSubList(str, i, i), i + 1));
                }

                if (str.get(i).startsWith(">>>>>>>")) {
                    chunk.setEnd(new Line(ListUtils.getSubList(str, i, i), i + 1));
                    chunk.setContent(ListUtils.getSubList(str, chunk.getBegin().getLineNumber() - 1, chunk.getEnd().getLineNumber() - 1));
                    result.add(chunk);
                }
            }

        } catch (IOException e) {
            System.out.println("filePath: " + filePath);
            e.printStackTrace();
        }
        return result;
    }



    private static MyFile updateFile(MyFile file) {

        MyFile result = file;
        result.setType(null);
        result.setChuncks(createConflictChunksList(result.getPath()));

        return result;
    }

    private static Version updateVersion(String pathProject, Version version) throws LocalRepositoryNotAGitRepository, OptionNotExist, IOException, RepositoryNotFound, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository, CheckoutError, ThereIsNoMergeToAbort, ThereIsNoMergeToAbort, NotSomethingWeCanMerge, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, AlreadyUpToDate, NotSomethingWeCanMerge {

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
                
            }else result.setStatus(MergeStatus.NON_CONFLICT);
            
           
        } else{
            result.setMerge(false);
            result.setStatus(MergeStatus.NON_CONFLICT);
        }
        
      
       
        
        result.setCommiter(null);
         
        return result;
    }

    public static Project createProject(String name, String projectPath) throws IOException, LocalRepositoryNotAGitRepository, ParseException, OptionNotExist, RepositoryNotFound, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository, CheckoutError, ThereIsNoMergeToAbort, NotSomethingWeCanMerge, NoRemoteForTheCurrentBranch, AlreadyUpToDate, ThereIsNoMergeInProgress {

        Project result = new Project();
        result.setName(name);
        result.setPath(projectPath);
        
        List<Version> versions = Git.logAllVersion(projectPath);
             
        
        for (Version version : versions) {            
          
            version = updateVersion(projectPath, version);            
          
        }
        result.setVersions(versions);

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
