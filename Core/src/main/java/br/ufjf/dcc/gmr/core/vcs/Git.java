/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs;

import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.CanNotMerge;
import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.cli.Model;
import br.ufjf.dcc.gmr.core.exception.BranchAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.CanNotMerge;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.HasNoUpstreamBranch;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RemoteRefBranchNotFound;
import br.ufjf.dcc.gmr.core.exception.RequiresAValue;
import br.ufjf.dcc.gmr.core.exception.RequiresAValue_Merge;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.exception.UnknownOption;
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
            for (String line : execution.getOutput()) {
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
    public static boolean status(String repositoryPath) throws RepositoryNotFound, IOException {
        String command = "git status";

        if (repositoryPath == null || repositoryPath.isEmpty()) {
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
     *
     * @param url
     * @param directory
     * @param name
     * @return
     * @throws RepositoryNotFound
     */
    public static boolean clone(String url, String directory, String name) throws RepositoryNotFound, UrlNotFound {

        String command = "git clone " + url;
        if (name != null) {
            command = command.concat(" ").concat(name);
        }

        if (url == null || url.isEmpty()) {
            throw new UrlNotFound();
        }
        try {

            CLIExecution execution = CLIExecute.execute(command, directory);

            if (!execution.getError().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.contains("does not exist")) {
                        throw new RepositoryNotFound();
                    } else if (line.contains("already exists and is not an empty directory")) {
                        System.out.println("Repository already exists.");
                    }
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
    public static boolean pull(String repositoryPath, String options, String repository, Boolean executeOptions) throws RemoteRefBranchNotFound, LocalRepositoryNotAGitRepository, OptionNotExist {

        CLIExecution execution = null;
        String command = null;

        if (executeOptions) {
            command = "git pull " + options + " " + repository;
        } else {
            command = "git pull ";
        }

        try {
            execution = CLIExecute.execute(command, repositoryPath);
            System.out.println("execution");

            if (!execution.getError().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.contains("Couldn't find remote ref branch")) {
                        throw new RemoteRefBranchNotFound();
                    } else if (line.contains("not a git repository")) {
                        throw new LocalRepositoryNotAGitRepository();
                    } else if (line.contains(" is not a git command")) {
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
        } else if (options != null && executeOnlyOptions == true) {
            command = "git push " + options;
        } else if (options == null) {
            command = "git push ";
        }

        try {
            execution = CLIExecute.execute(command, repositoryPath);
            System.out.println("execution");

            if (!execution.getError().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.contains("The current branch master has no upstream branch.")) {
                        throw new HasNoUpstreamBranch();
                    } else if (line.contains("not a git repository")) {
                        throw new LocalRepositoryNotAGitRepository();
                    } else if (line.contains(" is not a git command")) {
                        throw new OptionNotExist();
                    }

                }
            }
        } catch (IOException ex) {
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
    public void tag(String repositoryPath, String options, Boolean executeOptions) throws LocalRepositoryNotAGitRepository {
        String command = "git tag";
        CLIExecution execution = null;
        if (executeOptions) {
            command = "git tag " + options;
        } else {
            command = "git tag";
        }
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            System.out.println(execution);
            if (!execution.getError().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.contains("not a git repository")) {
                        throw new LocalRepositoryNotAGitRepository();
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void parent(String repositoryPath, String commit) throws LocalRepositoryNotAGitRepository, OptionNotExist {
        String command = "git log --pretty=%P -n 1 ";
        CLIExecution execution = null;
        command = command + commit;
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            System.out.println(execution);
            //verifica se há comandos no Output ou no Error
            if (execution.getError().isEmpty() && execution.getOutput().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.isEmpty()) {
                        System.out.println("não há pais");
                    }

                }
                //verifica se há comandos apenas em erro
            } else if (!execution.getError().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.contains("not a git repository")) {
                        throw new LocalRepositoryNotAGitRepository();
                    } else if (line.contains("fatal: ambiguous argument")) {
                        throw new OptionNotExist();
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Guilherme 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Ian 
    --------------------------------------------------------------------------*/

    ///clean
    /**
     * description 
     * @param interactiveCleaning
     * @param dryRun
     * @param force
     * @param option
     * @param path
     * @throws UnknownSwitch, RefusingToClean, IsOutsideRepository, RequiresAValue
     */
    public static boolean clean(String path, boolean interactiveCleaning, boolean dryRun, boolean force, String option) throws UnknownSwitch, RefusingToClean, IsOutsideRepository, RequiresAValue {
        String command = "git clean ";
        if(interactiveCleaning == true){
            if(dryRun == true){
                if(force == true){
                    command += "-i -d -f" + option + path;
                }
                else{
                    command += "-i -d" + option + path;
                }
            } else {
                if (force == true) {
                    command += "-i -f" + option;
                } else {
                    command += "-i" + option;
                }
            }
        }else{
            if (dryRun == true) {
                if (force == true) {
                    command += "-d -f" + option;
                }
            }else{
            command += "-d" + option;
            }
        }
        if(force == true){
            command += "-f" + option + path;
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
                        throw new UnknownSwitch(line);
                    } 
                    else{                        
                        if(line.contains("refusing to clean")){
                            throw new RefusingToClean(line);
                        }
                        else{
                            if(line.contains("is outside repository")){
                                throw new IsOutsideRepository(line);
                            }
                            else 
                                if(line.contains("requires a value")){
                                    throw new RequiresAValue(line);
                            }
                        }
                    }
                }
            }
        return true;
    }
    ///merge
    /**
     * description 
     * @param directory
     * @param filePath
     * @exception CanNotMerge
     * @exception NoRemoteForTheCurrentBranch
     * @exception UnknownOption
     * @exception ThereIsNoMergeInProgress
     */
    public static boolean merge(String directory, String filePath) throws CanNotMerge, NoRemoteForTheCurrentBranch, UnknownOption, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, RequiresAValue_Merge  {
        String command = "git merge " + filePath;
        CLIExecution execution = null;
        try {
            execution = CLIExecute.execute(command, directory);
            System.out.println(execution);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!execution.getError().isEmpty()){
            for (String line : execution.getError()){
                if(line.contains("if(!execution.getError().isEmpty()){")){
                    throw new CanNotMerge(line);
                }else
                    if(line.contains(" No remote for the current branch.")){
                        throw new NoRemoteForTheCurrentBranch(line);
                    }else 
                        if(line.contains("unknown option")){
                            throw new UnknownOption(line);
                        }else 
                            if(line.contains("There is no merge in progress")){
                                throw new ThereIsNoMergeInProgress(line);
                            }else if(line.contains("There is no merge to abort")){
                                throw new ThereIsNoMergeToAbort(line);
                            }else 
                                if(line.contains("requires a value")){
                                    throw new RequiresAValue_Merge(line);
                                }
            }
        }
        return true;
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Ian 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do João 
    --------------------------------------------------------------------------*/
    public static void branch(String option, String branchName, String secundaryBranchName) throws Exception {
        // List, create, delete, rename and copy branches 
        String command = "git branch " + option + " " + branchName + " " + secundaryBranchName;
        CLIExecution cliE = new CLIExecution();
        try {
            cliE = CLIExecute.execute(command, null);
            if (!cliE.getError().isEmpty()) {
                if (cliE.getError().contains("unknown switch")) {
                    throw new OptionNotExist();
                } else if (cliE.getError().contains("already exists")) {
                    throw new BranchAlreadyExist();
                } else if (cliE.getError().contains("not found")) {
                    throw new BranchNotFound();
                }
            } else {
                System.out.println(cliE.getOutput());
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean checkout(String option, String entityName) throws Exception {
        // Update files in working tree and switch between branches
        /* The "entityName" is a variable that represents any entity
        in the working tree such as branches, files, commits, paths
        and pathspecs
         */
        String command = "git checkout " + option + " " + entityName;
        CLIExecution cliE = new CLIExecution();
        try {
            cliE = CLIExecute.execute(command, null);
            if (!cliE.getError().isEmpty()) {
                for (String error : cliE.getError()) {
                    throw new CheckoutError(error);
                }
                return false;
            } else {
                System.out.println(cliE.getOutput());
                return true;
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    /*--------------------------------------------------------------------------
     * Fim comandos do João 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Luan 
    --------------------------------------------------------------------------*/
    public static void reset(String type) throws OptionNotExist {

        CLIExecution cliE = new CLIExecution();
        try {
            if ("hard".equals(type) && !"mixed".equals(type) && !"soft".equals(type) || !"hard".equals(type) && "mixed".equals(type) && !"soft".equals(type) || !"hard".equals(type) && !"mixed".equals(type) && "soft".equals(type)) {

                String command = "git reset -- " + type;
                CLIExecution execution = null;

                execution = CLIExecute.execute(command, null);
                System.out.println(execution);
            } else {
                throw new OptionNotExist();
            }
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void diff(boolean modificado, boolean head, boolean cached) {

        // Existe o diff sem modificadores e com, se o booleano for falso modificação tem que ser null
        String command = "git diff " + " ";
        try {

            if (modificado) {

                if (head && !cached) {

                    command += "HEAD";

                } else if (cached && !head) {

                    command += "-cached";
                }

                CLIExecution execution = new CLIExecution();
                execution = CLIExecute.execute(command, null);
                System.out.println(execution);
            }
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

/*--------------------------------------------------------------------------
     * Fim comandos do Luan 
    --------------------------------------------------------------------------*/
}
