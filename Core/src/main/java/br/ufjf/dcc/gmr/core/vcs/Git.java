/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs;

import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.BranchAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.HasNoUpstreamBranch;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RemoteRefBranchNotFound;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.vcs.example.GitExample;
import br.ufjf.dcc.gmr.core.vcs.types.Files;
import br.ufjf.dcc.gmr.core.vcs.types.Status;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    /**
     * @param repositoryString
     * @param hashCommit
     * @return
     */
    public static List<String> show(String repositoryString, String hashCommit) throws IOException, LocalRepositoryNotAGitRepository {
        CLIExecution execution = null;
        String command = "git show" + " " + hashCommit + " --pretty=oneline";
        List<String> list = new ArrayList<>();
        execution = CLIExecute.execute(command, repositoryString);
        for (String line : execution.getError()) {
            if (line.contains("not a git repository"))
                    throw new LocalRepositoryNotAGitRepository();
        }
        for (String line : execution.getOutput()) {
            list.add(line);
        }

        return list;
    }

    /**
     * 
     * @param repositoryString
     * @param hashCommit
     * @return return command git show from hashCommit
     * @throws IOException 
     */
    public static List<String> showCommiterName(String repositoryString, String hashCommit) throws IOException{
        CLIExecution execution = null;
        List<String> list = new ArrayList<>();
        String command = "git show" + " " + hashCommit + " --pretty=oneline";
        execution = CLIExecute.execute(command, repositoryString);
        for (String line : execution.getOutput()) {
            list.add(line);
        }
        return list;
    }
    
    /**
     * @author antonio
     * @param repositoryPath
     * @param merge
     * @return list of Formats
     * @throws IOException 
     */
    private static List<Formats> log(String repositoryPath, boolean merge) throws IOException, LocalRepositoryNotAGitRepository, ParseException {
        CLIExecution execution = null;
        String command = "git log ";
        if (merge) {
            command = command.concat(" --merges ");
        }

        //log method formatting
        command = command.concat("--pretty=format:\"%an,%H,%ai,%s\"");
        List<Formats> list = new ArrayList<>();
        Formats model = null;

        execution = CLIExecute.execute(command, repositoryPath);
            execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty()) {
               for (String line : execution.getError()) {
                    if (line.contains("not a git repository"))
                        throw new LocalRepositoryNotAGitRepository();
                }
            }
            //size: Number of Parameters
            String array[];
            int i = 0;
            for (String line : execution.getOutput()) {
                array = line.split(",", 4);
                String authorName = array[0];
                String commitHash = array[1];
                String authorDate = array[2];
                String commitDescription = array[3];
                
                //Split Date
                array = array[2].split(" ",3);
                String dateForm = array[0];
                String time = array[1];
                String localization = array[2];
                SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
                Date dateFormat = format.parse(authorDate);
                //end
                
                model = new Formats(authorName, commitHash, dateFormat, commitDescription);
                list.add(model);
                i++;
            }
            
        return list;
    }

    /**
     * @param repositoryPath
     * @return list of Formats
     * @throws IOException 
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository 
     */
    public static List<Formats> log(String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository, ParseException{
        return Git.log(repositoryPath, false);
    }

    /**
     * @param repositoryPath
     * @return
     * @throws IOException 
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository 
     */
    public static List<Formats> logMerge(String repositoryPath) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException {
        return Git.log(repositoryPath, true);
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Antônio 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Beatriz 
    --------------------------------------------------------------------------*/
    /// STATUS GIT
    /**
     * @param repositoryPath
     * @return 
     * @throws br.ufjf.dcc.gmr.core.exception.RepositoryNotFound
     * @throws java.io.IOException
     * @TODO:What is the meaning when this method returns true or false? Would
     * you improve the output?
     */
    public static List<String> status(String repositoryPath) throws RepositoryNotFound, IOException {
        String command = "git status --short";
        CLIExecution execute;
        Files file = new Files();
        
        if (repositoryPath == null || repositoryPath.isEmpty()) {
            throw new RepositoryNotFound(); 
        }
        
        execute = CLIExecute.execute(command, repositoryPath);
        String array[];
        for(String line: execute.getOutput()){
            array = line.split("core");
            if(line.contains("M")){
                String linha = Status.MODIFIED.toString();
                file.status.add(linha.concat(" ").concat(array[1]));  
            }
            if(line.contains("?")){
                String linha = Status.UNTRACKED.toString();
                file.status.add(linha.concat(" ").concat(array[1]));  
            }
            
            if(line.contains("U")){
                String linha = Status.UNMERGED.toString();
                file.status.add(linha.concat(" ").concat(array[1]));   
            }
            
            if(line.contains("")){
                String linha = Status.UNMODIFIED.toString();
                file.status.add(linha.concat(" ").concat(array[1])); 
            }
            
            if(line.contains("A")){
                String linha = Status.ADDED.toString();
                file.status.add(linha.concat(" ").concat(array[1])); 
            }
            
            if(line.contains("C")){
                String linha = Status.COPIED.toString();
                file.status.add(linha.concat(" ").concat(array[1]));  
            }
            
            if(line.contains("D")){
                String linha = Status.DELETED.toString();
                file.status.add(linha.concat(" ").concat(array[1]));  

            }
            
            if(line.contains("R")){
                String linha = Status.RENAMED.toString();
                file.status.add(linha.concat(" ").concat(array[1])); 
            }
            
        }
        
        
        return file.status;
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
    /**
     * Description TODO: Test implementation
     *
     * @author felip
     * @param repositoryPath: git repository path in your pc.
     * @param remoteBranch: remote branch name's, like "origin master".
     * @param quiet: defines whether the command will be used or not.
     * @return true
     * @throws RemoteRefBranchNotFound
     * @throws LocalRepositoryNotAGitRepository
     * @throws OptionNotExist
     * @throws IOException
     */
    /**
     * @throws IOException
     * @TODO:Please improve the options
     */
    public static boolean pull(String repositoryPath, String remoteBranch, Boolean quiet) throws RemoteRefBranchNotFound, LocalRepositoryNotAGitRepository, OptionNotExist, IOException {

        CLIExecution execution = null;
        String command = "git pull ";

        if (remoteBranch != null) {
            command = command.concat(" " + remoteBranch);
        }

        if (quiet) {
            command = command.concat(" --quiet ");
        }

        execution = CLIExecute.execute(command, repositoryPath);
        System.out.println("execution");

//        if (quiet && !remotePull && !verbose) {
//            command = "git pull --quiet";
//        } else if (!quiet && !remotePull && verbose) {
//            command = "git pull --verbose";
//        } else if (!quiet && remotePull && !verbose) {
//            command = "git pull " + remoteName + " " + branch;
//        } else if (!quiet && !remotePull && !verbose) {
//            command = "git pull";
//        }
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
        return true;
    }

    /**
     * @author felip
     * @param repositoryPath: git repository path in your pc.
     * @param remoteBranch: remote branch name's, like "origin master".
     * @param setUpstream: boolean param to set up stream your branch.
     * @param pushTags boolean param to push all tags.
     * @return true
     * @throws HasNoUpstreamBranch
     * @throws LocalRepositoryNotAGitRepository
     * @throws OptionNotExist
     * @throws IOException
     *
     */
    public static boolean push(String repositoryPath, String remoteBranch, Boolean setUpstream, Boolean pushTags) throws HasNoUpstreamBranch, LocalRepositoryNotAGitRepository, OptionNotExist, IOException {

        CLIExecution execution = null;
        String command = "git push ";

        if (setUpstream && remoteBranch != null && !pushTags) {
            command = command.concat(" --set-upstream " + remoteBranch);
        }
        if (remoteBranch != null && !setUpstream && !pushTags) {
            command = command.concat(" " + remoteBranch);
        }
        if (pushTags && !setUpstream) {
            command = command.concat(" origin --tags");
        }

        execution = CLIExecute.execute(command, repositoryPath);
        System.out.println("execution");

        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains(" has no upstream branch.")) {
                    throw new HasNoUpstreamBranch();
                } else if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                } else if (line.contains(" is not a git command")) {
                    throw new OptionNotExist();
                }

            }
        }

        return true;
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Felippe 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Guilherme 
    --------------------------------------------------------------------------*/
    /**
     *
     * @param repositoryPath repository
     * @return return a String List with tags
     * @throws LocalRepositoryNotAGitRepository
     * @throws java.io.IOException
     * @throws br.ufjf.dcc.gmr.core.exception.RepositoryNotFound
     */
    public static List<String> listTag(String repositoryPath) throws LocalRepositoryNotAGitRepository, IOException, RepositoryNotFound {
        String command = "git tag";
        CLIExecution execution = null;
        List<String> lista = new ArrayList<>();
        execution = CLIExecute.execute(command, repositoryPath);
        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                }
                else if (line.contains("Repository not found")) {
                    throw new RepositoryNotFound();
                }
            }
        }
        lista = execution.getOutput();
        return lista;
    }

    /**
     * @param repositoryPath
     * @param tag tag name to create
     * @param message tag message
     * @param commit version hash
     * @return return true if execution was successful and false if unsuccessful
     * @throws LocalRepositoryNotAGitRepository
     * @throws java.io.IOException
     * @throws br.ufjf.dcc.gmr.core.exception.OptionNotExist
     * @throws br.ufjf.dcc.gmr.core.exception.RepositoryNotFound
     */
    public static boolean createTag(String repositoryPath, String tag, String message, String commit) throws LocalRepositoryNotAGitRepository, IOException, OptionNotExist, RepositoryNotFound {
        String command = "git tag";
        CLIExecution execution = null;
        if (message == null && commit == null) {
            command = command + " " + tag;
        } else if (message == null && commit != null) {
            command = command + " " + tag + " " + commit;
        } else if (message != null && commit == null) {
            command = command + " -a " + tag + " -m " + message;
        } else {
            command = command + " " + tag + " " + commit + " -m " + message;
        }
        boolean success = false;
        execution = CLIExecute.execute(command, repositoryPath);
        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                } else if (line.contains("Repository not found")) {
                    throw new RepositoryNotFound();
                }
            }
        } else {
            success = true;
        }
        return success;
    }

    /**
     * @param repositoryPath
     * @param tag tag name to remove
     * @return return true if execution was successful and false if unsuccessful
     * @throws LocalRepositoryNotAGitRepository
     * @throws java.io.IOException
     * @throws br.ufjf.dcc.gmr.core.exception.RepositoryNotFound
     */
    public static boolean removeTag(String repositoryPath, String tag) throws IOException, LocalRepositoryNotAGitRepository, RepositoryNotFound {
        String command = "git tag --delete ";
        CLIExecution execution = null;
        command = command + tag;
        boolean sucess = false;
        execution = CLIExecute.execute(command, repositoryPath);
        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                } else if (line.contains("Repository not found")) {
                    throw new RepositoryNotFound();
                }
            }
        } else {
            sucess = true;
        }
        return sucess;
    }

    /**
     *
     * @param repositoryPath repository
     * @param commit version hash
     * @return return a String List with parents
     * @throws LocalRepositoryNotAGitRepository
     * @throws OptionNotExist
     * @throws java.io.IOException
     * @throws br.ufjf.dcc.gmr.core.exception.RepositoryNotFound
     */
    public static List<String> parent(String repositoryPath, String commit) throws LocalRepositoryNotAGitRepository, OptionNotExist, IOException, RepositoryNotFound {
        String command = "git log --pretty=%P -n 1 ";
        CLIExecution execution;
        execution = null;
        List<String> lista = new ArrayList<>();
        command = command + commit;
        execution = CLIExecute.execute(command, repositoryPath);
        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                } else if (line.contains("fatal: ambiguous argument")) {
                    throw new OptionNotExist();
                } else if (line.contains("Repository not found")) {
                    throw new RepositoryNotFound();
                }
            }
        }
        
        String[] split = execution.getOutput().get(0).split(" ");
        
        for (String parent : split) {
            lista.add(parent);
        }
        
        return lista;
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Guilherme 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Ian 
    --------------------------------------------------------------------------*/
    ///clean
    /**
     * @param repositoryPath - String used to recive the repository path.
     * @param force - If the Git configuration variable clean.requireForce is not set to false, Git will refuse to delete directories with .git sub directory or file unless a second -f is given.
     * @param ignoredFiles - if == 0 allows removing all untracked files, including build products. if == 1 Remove only files ignored by Git. if you don`t wanna use it, just let it blanck.
     * @return boolean - True if no exception is thrown, else false.
     * @exception UnknownSwitch
     * @exception RefusingToClean
     * @exception IsOutsideRepository
     * @throws java.io.IOException
     */
    public static boolean clean(String repositoryPath, boolean force, int ignoredFiles) throws IOException, UnknownSwitch, RefusingToClean, IsOutsideRepository {
        String command = "git clean ";

        if (force) {
            command = command.concat(" -f");
        }
        
        if(ignoredFiles == 0){
            command = command.concat(" -x");
        }else if(ignoredFiles == 1){
            command = command.concat(" -X");
        }

        CLIExecution execution = null;

        execution = CLIExecute.execute(command, repositoryPath);
        System.out.println(execution);

        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("unknown switch")) {
                    throw new UnknownSwitch(line);
                } else if (line.contains("refusing to clean")) {
                    throw new RefusingToClean(line);
                } else if (line.contains("is outside repository")) {
                    throw new IsOutsideRepository(line);
                }
            }
            return false;
        }

        return true;
    }

///mergeBase
    /**
     * Private method used by the other merge methods to execute a merge.
     * @return boolean - True if no exception is thrown, else false. 
     * @param repositoryPath - String used to recive the repository path.
     * @param version - String used to recive all the commands generated by the other merge methods.
     * @exception CanNotMerge
     * @exception NoRemoteForTheCurrentBranch
     * @exception ThereIsNoMergeInProgress
     * @exception ThereIsNoMergeToAbort
     * @exception AlreadyUpToDate
     * @exception NotSomethingWeCanMerge
     */
    private static boolean mergeBase(String repositoryPath, String version) throws NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, IOException, AlreadyUpToDate, NotSomethingWeCanMerge {
        String command = "git merge " + version;
        CLIExecution execution = null;

        execution = CLIExecute.execute(command, repositoryPath);
        System.out.println(execution);

        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("No remote for the current branch.")) {
                    throw new NoRemoteForTheCurrentBranch(line);
                } else if (line.contains("There is no merge in progress")) {
                    throw new ThereIsNoMergeInProgress(line);
                } else if (line.contains("There is no merge to abort")) {
                    throw new ThereIsNoMergeToAbort(line);
                } else if(line.contains("Already up to date")){
                    throw new AlreadyUpToDate(line);
                } else if(line.contains("not something we can merge")){
                    throw new NotSomethingWeCanMerge(line);
                }
            }
            return false;
        }
        return true;
    }
    ///mergeBranch
    /**
     * This method merge 2 branches. 
     * @param branch1 - String used to recive the name of the branch 1.
     * @param branch2 - String used to recive the name of the branch 2.
     * @param commitMessage - String used to recive the commit message.
     * @return boolean - True if no exception is thrown else false.
     * @param repositoryPath - String used to recive the repository path.
     * @exception NoRemoteForTheCurrentBranch
     * @exception ThereIsNoMergeInProgress
     * @exception ThereIsNoMergeToAbort
     * @exception AlreadyUpToDate
     * @exception NotSomethingWeCanMerge
     * @throws java.io.IOException
     * @
     */
    public static boolean mergeBranch(String repositoryPath, String branch1, String branch2, String commitMessage) throws NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, IOException, AlreadyUpToDate, NotSomethingWeCanMerge {
        String command = branch1.concat(" ").concat(branch2).concat(" -m \"").concat(commitMessage).concat("\"");
        return mergeBase(repositoryPath,command);
    }
    ///mergeAbort
    /**
     * This method abort a merge that resulted in conflicts.
     * @return boolean - True if no exception is thrown else false. 
     * @param repositoryPath - String used to recive the repository path.
     * @exception NoRemoteForTheCurrentBranch
     * @exception ThereIsNoMergeInProgress
     * @exception ThereIsNoMergeToAbort
     * @exception AlreadyUpToDate
     * @exception NotSomethingWeCanMerge
     * @throws java.io.IOException
     */    
    public static boolean mergeAbort(String repositoryPath) throws  NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, IOException, AlreadyUpToDate, NotSomethingWeCanMerge {
        return mergeBase(repositoryPath, "--abort");
    }
    ///mergeContinue
    /**
     * This method continue a merge that resulted in conflicts.
     * @return boolean - True if no exception is thrown else false.
     * @param repositoryPath - String used to recive the repository path.
     * @exception NoRemoteForTheCurrentBranch
     * @exception ThereIsNoMergeInProgress
     * @exception ThereIsNoMergeToAbort
     * @exception AlreadyUpToDate
     * @exception NotSomethingWeCanMerge
     * @throws java.io.IOException
     */    
    public static boolean mergeContinue(String repositoryPath) throws  NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, IOException, AlreadyUpToDate, NotSomethingWeCanMerge {
        return mergeBase(repositoryPath, "--continue");
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Ian 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do João 
    --------------------------------------------------------------------------*/
    /**
     *
     * @param branchName This parameter is a String that contains the name of branch that goes be create
     * @param switchTo This parameter is a boolean that goes determinate if user wants to switch to the new branch 
     * @param directory This parameter is a String that contains the directory where the command that goes be executed
     * @return Returns a boolean that goes show if command worked or not 
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository
     * @throws BranchAlreadyExist
     */
    public static boolean createBranch(String branchName, boolean switchTo, String directory) throws IOException, LocalRepositoryNotAGitRepository, BranchAlreadyExist {
        String command = "git branch " + branchName;
        boolean check = true;
        CLIExecution cliE = null;
        cliE = CLIExecute.execute(command, directory);
        if (!cliE.getError().isEmpty()) {
            for (String line : cliE.getError()) {
                if (line.contains("fatal: not a git repository (or any of the parent directories): .git")) {
                    throw new LocalRepositoryNotAGitRepository();
                } else if (line.contains("already exists")) {
                    throw new BranchAlreadyExist(branchName);
                } else {
                    check = false;
                }
            }
        } else {
            for (String string : cliE.getOutput()) {
                System.out.println(string);
            }
            if (switchTo) {
                command = "git checkout " + branchName;
                cliE = CLIExecute.execute(command, directory);
                for (String string : cliE.getOutput()) {
                    System.out.println(string);
                }
            }
        }
        return check;
    }

    /**
     * 
     * @param branchName This parameter is a String that contains the name of branch that goes be create
     * @param directory This parameter is a String that contains the directory where the command that goes be executed
     * @return Returns a boolean that goes show if command worked or not 
     * @throws LocalRepositoryNotAGitRepository
     * @throws BranchNotFound
     * @throws IOException 
     */
    public static boolean deleteBranch(String branchName, String directory) throws LocalRepositoryNotAGitRepository, BranchNotFound, IOException {
        CLIExecution cliE = null;
        boolean check = true;
        cliE = CLIExecute.execute("git branch --all", directory);
        if (cliE.getError().contains("fatal: not a git repository (or any of the parent directories): .git")) {
            throw new LocalRepositoryNotAGitRepository();
        } else if (cliE.getOutput().toString().contains(branchName)) {
            if (cliE.getOutput().toString().contains("* " + branchName)) {
                cliE = CLIExecute.execute("git checkout master", directory);
            }
            cliE = CLIExecute.execute("git branch -d " + branchName, directory);
        } else {
            check = false;
            throw new BranchNotFound(branchName);
        }
        return check;
    }

    /**
     * 
     * @param print This parameter is a boolean that goes determinate if user wants to print     
     * @param directory This parameter is a String that contains the directory where the command that goes be executed
     * @return Return a List<String> that contain all the branches of repository 
     * @throws Exception 
     */
    public static List<String> listBranches(boolean print, String directory) throws Exception {
        CLIExecution cliE = null;
        cliE = CLIExecute.execute("git branch --all", directory);
        if (cliE.getError().toString().contains("fatal: not a git repository (or any of the parent directories): .git")) {
            throw new LocalRepositoryNotAGitRepository();
        } else {
            cliE.getOutput().remove(0);
            if (print) {
                for (String line : cliE.getOutput()) {
                    System.out.println(line);
                }
            }
        }
        return cliE.getOutput();
    }

    /**
     * 
     * @param entity This parameter that represents any path that can be checkout like branches and commits 
     * @param directory This parameter is a String that contains the directory where the command that goes be executed
     * @return Returns a boolean that goes show if command worked or not
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository
     * @throws CheckoutError 
     */
    public static boolean checkout(String entity, String directory) throws IOException, LocalRepositoryNotAGitRepository, CheckoutError {
        CLIExecution cliE = null;
        boolean check = true;
        cliE = CLIExecute.execute("git checkout " + entity, directory);
        if (!cliE.getError().isEmpty()) {
            if(cliE.getError().toString().contains("fatal: not a git repository (or any of the parent directories): .git")){
                throw new LocalRepositoryNotAGitRepository();
            }
            for(String string : cliE.getError()){
                if(string.contains("did not match any file(s) known to git")){
                    check = false;
                    throw new CheckoutError(string); 
                }else if(string.contains("Already on")){
                    check = false;
                   throw new CheckoutError(string);
                }
            }
        }
        return check;
    }

    /**
     * description 
     * @param indexPath
     * @param directory
     * @return
     * @throws LocalRepositoryNotAGitRepository
     */
    public static boolean checkoutRemovePathFromIndex(String indexPath, String directory) throws LocalRepositoryNotAGitRepository {
        CLIExecution cliE = null;
        boolean check = true;
        try {
            cliE = CLIExecute.execute("git checkout " + indexPath, directory);
            if (cliE.getError().contains("fatal: not a git repository (or any of the parent directories): .git")) {
                throw new LocalRepositoryNotAGitRepository();
            }
            System.out.println(cliE.getOutput().get(0));
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LocalRepositoryNotAGitRepository ex) {
            check = false;
        }
        return check;
    }
    /**
     * 
     * @param directory
     * @return 
     */
    public static boolean checkoutRemoveAllFromIndex(String directory) {
        CLIExecution cliE = null;
        boolean check = true;
        try {
            cliE = CLIExecute.execute("git checkout .", directory);
            if (cliE.getError().contains("fatal: not a git repository (or any of the parent directories): .git")) {
                throw new LocalRepositoryNotAGitRepository();
            } else {
                System.out.println(cliE.getOutput().get(0));
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LocalRepositoryNotAGitRepository ex) {
            check = false;
        }
        return check;
    }
    /*--------------------------------------------------------------------------
     * Fim comandos do João 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Luan 
    --------------------------------------------------------------------------*/
    /**
     * 
     ** Description This method executes the git command 'reset'. This command
     * can be called without any modifier or with one of the three,
     * 'hard','mixed' and 'soft' The command undo the last commit or merge you
     * did;
     
     * @TODO Test implementation
     * @param directory
     * @param hard
     * @param mixed
     * @param soft
     * @throws IOException
     *
     * Esse metodo executa o comando reset, esse comando refaz o ultimo commit
     * feito usando o formato "hard","mixed" ou "soft"
     */
    public static boolean reset(String directory, boolean hard, boolean mixed, boolean soft,String Document) throws IOException, LocalRepositoryNotAGitRepository {

        String command = "git reset ";

        if (hard) {
            command = command.concat(" --hard");
        } else if (mixed) {
            command = command.concat(" --mixed --");
            command=command.concat(Document);
        } else if (soft) {
            command = command.concat(" --soft");
        }
try{
        CLIExecution execution = CLIExecute.execute(command, directory);

        if (!execution.getError().isEmpty()) {
              if (execution.getError().contains("fatal: not a git repository (or any of the parent directories): .git")) {
                throw new LocalRepositoryNotAGitRepository();}
                else
                throw new IOException();
        } else {
            return true;
        }
}catch (LocalRepositoryNotAGitRepository ex) {
            
        }

        return false;

    }

    /**
     * @deprecated @TODO: insert the repository path to run the method (test the
     * implementation)
     * @TODO: What is the output?
     * @param modificado
     * @param head
     * @param cached
     *
     * O comando diff mostra a difenreça entre o seu repositorio e o repositorio
     * remoto
     *//*
    public static void diff(boolean modificado, boolean head, boolean cached) {

        // Existe o diff sem modificadores e com, se o booleano for falso modificação
        // tem que ser null
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
    }*/

    public static List<FileDiff> diff(String directory, String commitSource, String commitTarget) throws IOException,LocalRepositoryNotAGitRepository {

        List<FileDiff> result = new ArrayList<>();
       
        String command = "diff " + commitSource +  " "+ commitTarget ;
        try{
        CLIExecution execution = CLIExecute.execute(command, directory);
        
         if (!execution.getError().isEmpty()) {
            if (execution.getError().contains("not a git repository"))
              throw new LocalRepositoryNotAGitRepository();
        }
        for (String line : execution.getOutput()) {
            
            
            
            
        }
        } catch (LocalRepositoryNotAGitRepository ex) {
            
        }
        
        
        
     return result;  
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Luan 
    --------------------------------------------------------------------------*/
}
