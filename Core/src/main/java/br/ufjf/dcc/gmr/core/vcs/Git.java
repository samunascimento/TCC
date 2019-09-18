/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs;

import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.exception.BranchAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
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

    public static void log(String repositoryPath) {
        String command1 = "git log";
        GitExample g = new GitExample();
        try {
            g.execute(command1, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Antônio 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Beatriz 
    --------------------------------------------------------------------------*/
    /// STATUS GIT
    public void gitStatus(String repositoryPath) {
        String command = "git status";
        GitExample g = new GitExample();
        try {
            g.execute(command, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ///GIT CLONE
    /**
     * description 
     * @param url
     * @param directory
     * @throws RepositoryNotFound 
     */
    public static boolean gitClone(String url, String directory) throws RepositoryNotFound {
        
        String command = "git clone " + url;
        CLIExecution execution = null;
        
        try {
            execution = CLIExecute.execute(command, directory);
            System.out.println(execution);
            
            if(!execution.getError().isEmpty()){
                for (String line : execution.getError()) {
                    if(line.contains("does not exist"))
                        throw new RepositoryNotFound();
                    else if(line.contains("already exists and is not an empty directory"))
                        System.out.println("Exception...");
                }
            }
                
            
            System.out.println(execution);
            
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Beatriz 
    --------------------------------------------------------------------------*/

 /*--------------------------------------------------------------------------
     * Inicio comandos do Felippe 
    --------------------------------------------------------------------------*/
    //Git PULL. If you need to send options to be executed with pull, you must send a string with the options 
    //and the final parameter as true. Otherwise just send an empty string in the options and false in the last parameter.
    public static void pull(String repositoryPath, String options, String repository, Boolean executeOptions) {

        GitExample g = new GitExample();

        String command = null;

        if (executeOptions) {
            command = "git pull " + options + " " + repository;
        } else {
            command = "git pull ";
        }

        try {
            g.execute(command, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Git PUSH. If you need to send options to be executed with push, you must send a string with the options 
    //and the final parameter as true. Otherwise just send an empty string in the options and false in the last parameter.
    public static void push(String repositoryPath, String options, String repository, Boolean executeOptions) {

        GitExample g = new GitExample();

        String command = null;

        if (executeOptions) {
            command = "git push " + options + " " + repository;
        } else {
            command = "git push ";
        }

        try {
            g.execute(command, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
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
