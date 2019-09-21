/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs;

import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.cli.Model;
import br.ufjf.dcc.gmr.core.exception.BranchAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.HasNoUpstreamBranch;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RemoteRefBranchNotFound;
import br.ufjf.dcc.gmr.core.vcs.example.GitExample;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class created to implement Git commands
 *
 * @author gleiph
 */
public class Git {

    /*--------------------------------------------------------------------------
     * Inicio comandos do Antônio 
    --------------------------------------------------------------------------*/
    public static void show(String repositoryPath) {
        String command1 = "git show";
        GitExample g = new GitExample();
        try {
            g.execute(command1, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Model[] log(String repositoryPath) {
        CLIExecution execution = null;
        String command = "git log --pretty=format:\"%an,%H\"";
        GitExample g = new GitExample();
        Model model[] = null;
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            model = new Model[execution.getNumberLine()];
            //System.out.println(execution.getNumberLine());
            //tamanho = numero de parametros do Model
            String array[] = new String[2];
            int i = 0;
            for(String line : execution.getOutput()){
                System.out.println("");
                array = line.split(",");
                model[i] = new Model(array[0], array[1]);
                //System.out.println(model[i].getAuthorName());
                //System.out.println(model[i].getCommitHash());
                i++;
            }
            
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return model;
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Antônio 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Beatriz 
    --------------------------------------------------------------------------*/
    /// STATUS GIT
    public static boolean status (String repositoryPath) throws RepositoryNotFound, IOException {
        String command = "git status";
        
        if(repositoryPath == null || repositoryPath.isEmpty()){
            throw new RepositoryNotFound();
        }
        
        try {
            GitExample.execute(command, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    ///GIT CLONE
    /**
     * description 
     * @param url
     * @param directory
     * @param name
     * @return 
     * @throws RepositoryNotFound 
     */
    
    public static boolean clone(String url, String directory, String name) throws RepositoryNotFound, UrlNotFound {
        
        String command = "git clone " + url;
        if(name != null){
            command = command.concat(" ").concat(name);
        }
        
        if(url == null || url.isEmpty()){
            throw new UrlNotFound();
        }
        try {
            
            CLIExecution execution = CLIExecute.execute(command, directory);
            
            if(!execution.getError().isEmpty()){
                for (String line : execution.getError()) {
                    if(line.contains("does not exist"))
                        throw new RepositoryNotFound();
                    else if(line.contains("already exists and is not an empty directory"))
                        System.out.println("Repository already exists.");      
                }
            } 
            System.out.println(execution);
            
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public static boolean clone(String url, String directory, String name, String username, String password) throws RepositoryNotFound, UrlNotFound {
        String[] split = url.split("//");
        
        String command = split[0].concat("//").concat(username).concat(":").concat(password).concat("@").concat(split[1]);
        
        return clone(command, directory, name);
    }
    /*--------------------------------------------------------------------------
     * Fim comandos do Beatriz 
    --------------------------------------------------------------------------*/

 /*--------------------------------------------------------------------------
     * Inicio comandos do Felippe 
    --------------------------------------------------------------------------*/
    //Git PULL
    /**
     * 
     * @param repositoryPath
     * @param options
     * @param repository
     * @param executeOptions
     * @return
     * @throws RemoteRefBranchNotFound
     * @throws LocalRepositoryNotAGitRepository
     * @throws OptionNotExist
     */
    public static boolean pull (String repositoryPath, String options, String repository, Boolean executeOptions) throws RemoteRefBranchNotFound,LocalRepositoryNotAGitRepository, OptionNotExist {

     
        CLIExecution execution = null;        
        String command = null;

        if (executeOptions) {
            command = "git pull " + options + " " + repository;
        }else{
        	command = "git pull ";
        }

        try {
            execution = CLIExecute.execute(command, repositoryPath);
            System.out.println("execution");
            
            if(!execution.getError().isEmpty()) {
            	for(String line: execution.getError()) {
            		  if(line.contains("Couldn't find remote ref branch")) {
            			  throw new RemoteRefBranchNotFound();
            		  }else if (line.contains("not a git repository")) {
            			  throw new LocalRepositoryNotAGitRepository();
            		  }else if (line.contains(" is not a git command")) {
            			  throw new OptionNotExist();
            		  }
            	}            	
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    /**
     * 
     * @param repositoryPath
     * @param remote
     * @param branch
     * @param executeOnlyOptions
     * @return
     * @throws HasNoUpstreamBranch
     * @throws LocalRepositoryNotAGitRepository
     * @throws OptionNotExist 
     */
    //Git PUSH
    public static boolean push(String repositoryPath, String options, String branch, Boolean executeOnlyOptions) throws HasNoUpstreamBranch, LocalRepositoryNotAGitRepository, OptionNotExist {

    	CLIExecution execution = null;
        String command = null;

        if (options != null && branch != null && executeOnlyOptions == false) {
            command = "git push " + options + " " + branch;
        } else if(options != null && executeOnlyOptions == true) {
            command = "git push " + options;
        }else if (options == null) {
        	command = "git push ";
        }
        
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            System.out.println("execution");
            
            if(!execution.getError().isEmpty()) {
            	for(String line: execution.getError()) {
            		if(line.contains("The current branch master has no upstream branch.")) {
            			throw new HasNoUpstreamBranch();
            		}else if (line.contains("not a git repository")) {
            			throw new LocalRepositoryNotAGitRepository();
            		}else if (line.contains(" is not a git command")) {
          			  throw new OptionNotExist();
          		  }
            		
            		
            	}
            }
        }            
        catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Felippe 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Guilherme 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Fim comandos do Guilherme 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Guilherme 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Fim comandos do Guilherme 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Ian 
    --------------------------------------------------------------------------*/
    
    ///clean
    /*
     * description 
     * @param path
     * @param option
     * @throws UnknownSwitch, RefusingToClean
    */
    
    public static boolean clean(String path, boolean interactiveCleaning, boolean dryRun, boolean force, String option) throws UnknownSwitch, RefusingToClean {
        String command = "git clean ";
        if(interactiveCleaning == true){
            if(dryRun == true){
                if(force == true){
                    command += "-i -d -f" + option;
                }
                else{
                    command += "-i -d" + option;
                }
            }else{
                if(force == true){
                    command += "-i -f" + option;
                }else{
                    command += "-i" + option;
                }
            }
        }else{
            if(dryRun == true){
                if(force == true){
                    command += "-d -f" + option;
                }else{
                    command += "-d" + option;
                }
            }else{
                if(force == true){
                    command += "-f" + option;
                }
            }
        }
        CLIExecution execution = null;
        try {
            execution = CLIExecute.execute(command, null);
            System.out.println(execution);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!execution.getError().isEmpty()){
                for (String line : execution.getError()) {
                    if(line.contains("unknown switch")){
                        throw new UnknownSwitch();
                    } 
                    else{
                        //error: clean.requireForce defaults to true and neither -i, -n, nor -f given; refusing to clean
                        if(line.contains("refusing to clean")){
                            throw new RefusingToClean();
                        }
                    }
                }
            }
        return true;
    }
    ///merge
    /*
     * description 
     * @param directory
     * @param filePath
    */
    public static void merge(String directory, String filePath){
        String command = "git merge " + filePath;
        CLIExecution execution = null;
        try{
            execution = CLIExecute.execute(command, directory);
            System.out.println(execution);
        } catch (IOException ex){
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 /*--------------------------------------------------------------------------
     * Fim comandos do Ian 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do João 
    --------------------------------------------------------------------------*/
    
    public static void branch(String option, String branchName, String secundaryBranchName) throws Exception {
        // List, create, delete, rename and copy branches 
        String command = "git branch " + option + branchName + secundaryBranchName;
        CLIExecution cliE = new CLIExecution();
        try{
            cliE = CLIExecute.execute(command,null);
            if(!cliE.getError().isEmpty()){
                if(cliE.getError().contains("unknown switch")){
                    throw new OptionNotExist();
                }
                else if (cliE.getError().contains("already exists")){
                    throw new BranchAlreadyExist();
                }
                    else if (cliE.getError().contains("not found")){
                        throw new BranchNotFound();
                    }
            }
            else{
                System.out.println(cliE.getOutput());
            }
        }
        catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
 /*--------------------------------------------------------------------------
     * Fim comandos do João 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Luan 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Fim comandos do Luan 
    --------------------------------------------------------------------------*/
}
