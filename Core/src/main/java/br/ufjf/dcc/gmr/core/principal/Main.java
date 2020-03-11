/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
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
import br.ufjf.dcc.gmr.core.vcs.types.File;
import br.ufjf.dcc.gmr.core.vcs.types.FileStatus;
import br.ufjf.dcc.gmr.core.vcs.types.FileUnmerged;
import br.ufjf.dcc.gmr.core.vcs.types.Formats;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author felip
 */

public class Main {
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, ParseException, OptionNotExist, RepositoryNotFound, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, NotSomethingWeCanMerge, ThereIsNoMergeToAbort, AlreadyUpToDate {
         
               
        Project project = new Project();
        
        project.setName("Dependencia de Conflitos");
        project.setPath("C:\\Users\\felip\\Desktop\\CODE\\Projetos\\sistema-da-igreja");
        
        List<Version> versionList = createVersionList(project.getPath());
        
        project.setVersions(versionList);
        
        //printOutVersionList(project.getVersions(), false);
        //printOutVersionList(project.getVersions(), true);
      
        createFileList(project);
        int a =0, k = 0, g=0;
        for (int i=0; i < project.getVersions().size(); i++){
            if(project.getVersions().get(i).getFile() != null){
                for(int j=0; j < project.getVersions().get(i).getFile().size(); j++ )
                System.out.println(project.getVersions().get(i).getFile().get(j).getPath());
            }
        }
        System.out.println(a +" | "+ k +" | "+g);
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
    }
    
    /**
     *
     * @param repository
     * @return 
     * @throws br.ufjf.dcc.gmr.core.exception.RepositoryNotFound 
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository 
     * @throws br.ufjf.dcc.gmr.core.exception.OptionNotExist 
     * @throws java.io.IOException 
     * 
     */
    
      public static void createFileList(Project project) throws IOException, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, RepositoryNotFound{
        
        
        FileUnmerged status = new FileUnmerged();
        for(int i=0; i < project.getVersions().size(); i++){
            
            if( project.getVersions().get(i).isMerge() ){
                
                try{
                    Git.checkout(project.getVersions().get(i).getParent().get(0), project.getPath());
                }catch (CheckoutError | LocalRepositoryNotAGitRepository | IOException ex) {
                    System.out.println("ERROR : "+ ex);
                }
                
                try{
                    Git.mergeBranch(project.getPath(), project.getVersions().get(i).getParent().get(1), "Teste");
                }catch ( IOException ex){
                    System.out.println("ERROR : "+ ex);
                }
                
                try{
                   status = Git.statusUnmerged(project.getPath());
                }catch  ( IOException ex){
                    System.out.println("ERROR : "+ex);
                }
                
                List<File> files = new ArrayList<>();
                
                for (int i1 = 0; i1 < status.file.unmerged.size(); i1++) {
                    
                    System.out.println(status.file.unmerged.get(i1));
                    String aux[] = status.file.unmerged.get(i1).split(" ");
                    
                    
                    File file = new File(aux[0], aux[1]);
                    files.add(file);
                    
                   
                }
                 project.getVersions().get(i).setFile(files);

            }
                    
        }
              
    }
    public static List<Version> createVersionList(String repository) throws RepositoryNotFound, LocalRepositoryNotAGitRepository, OptionNotExist, IOException{
        
        List<Formats> list = new ArrayList<>();
        List<Version> versionList = new ArrayList<>();
        
         try {
            list = Git.logAll(repository);
        } catch (IOException | LocalRepositoryNotAGitRepository | ParseException e) {
        }
        
        for(Formats item: list){
            Version version;         
            version = new Version(item.getCommitHash(), item.getAuthorName(), item.getAuthorDate(), Git.parent(repository, item.getCommitHash()).size() > 1, Git.parent(repository, item.getCommitHash()), item.getCommitDescription());
            
            versionList.add(version);            
        }
       
        return versionList;
        
        
    }    
        
    public static void printOutVersionList(List<Version> versionList, boolean parentPrint){
          //get the biggest author name for the formatting be correct
        String biggestAuthorName = versionList.get(0).getAuthor();
        String spaceAux = new String();
        
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||START|||||||||||||||||||||||||||||||||||||||||||");
        if ( parentPrint ){
              System.out.println("|||||||||||||||||||||||||||||||||||||||||||ONLY MERGE VERSIONS|||||||||||||||||||||||||||||||||||||||||||");
            for (int i = 1; i < versionList.size(); i++) {
                if (biggestAuthorName.length() < versionList.get(i).getAuthor().length()) {
                    biggestAuthorName = versionList.get(i).getAuthor();
                }
            }
            for (int i = versionList.size() - 1; i >= 0; i--) {
                
                if( versionList.get(i).isMerge()){
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
        }else{
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