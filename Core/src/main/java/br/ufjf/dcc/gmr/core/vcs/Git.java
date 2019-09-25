/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs;

import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.exception.BranchAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.CanNotMerge;
import br.ufjf.dcc.gmr.core.exception.CouldNotReadFile;
import br.ufjf.dcc.gmr.core.exception.ExceptionNotTreated_Clean;
import br.ufjf.dcc.gmr.core.exception.ExceptionNotTreated_Merge;
import br.ufjf.dcc.gmr.core.exception.ExpectsnoArguments;
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
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.IOException;
import java.util.ArrayList;
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
     * @TODO: Please improve this command to extract information that git show
     * presents
     */
    public static void show(String repositoryPath) {
        String command1 = "git show";
        GitExample g = new GitExample();
        try {
            //Stop using this method and use the one in the class CLIExecute
            g.execute(command1, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static List<Formats> log(String repositoryPath) {
        CLIExecution execution = null;
        String command = "git log --pretty=format:\"%an,%h,%ai,%s\"";
        List<Formats> list = new ArrayList<>();
        Formats model = null;
        try {
            execution = CLIExecute.execute(command, repositoryPath);

            //tamanho = numero de parametros do Formats
            String array[] = new String[4];
            int i = 0;
            for (String line : execution.getOutput()) {
                System.out.println("");
                array = line.split(",");
                model = new Formats(array[0], array[1], array[2], array[3]);
                list.add(model);
                //System.out.println(model[i].getAuthorName());
                //System.out.println(model[i].getCommitHash());
                i++;
            }

        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public static List<String> logSimple(String repositoryPath) {
        CLIExecution execution = null;
        String command = "git log";
        List <String> merge = new ArrayList<>();

        
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            for(String line: execution.getOutput()){
                if(line.contains("Merge")){
                    int mergeIndex = line.indexOf("Merge");
                    merge.add(line.substring(mergeIndex, line.length() ));
                    System.out.println(merge);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return merge;
 
    }
    /*--------------------------------------------------------------------------
     * Fim comandos do Antônio 
    --------------------------------------------------------------------------*/
 /*--------------------------------------------------------------------------
     * Inicio comandos do Beatriz 
    --------------------------------------------------------------------------*/
    /// STATUS GIT
    /**
     * @TODO:What is the meaning when this method returns true or false? Would
     * you improve the output?
     */
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
    /**
     * @TODO:Please improve the options
     */
    public static boolean pull(String repositoryPath, String branch, String remoteName, Boolean remotePull, Boolean quiet, Boolean verbose ) throws RemoteRefBranchNotFound, LocalRepositoryNotAGitRepository, OptionNotExist {

        CLIExecution execution = null;
        String command = null;
        
        if (quiet && !remotePull && !verbose) {
            command = "git pull --quiet";
        } else if(!quiet && !remotePull && verbose){
            command = "git pull --verbose";
        } else if(!quiet && remotePull && !verbose) {
        	command = "git pull "+remoteName+" "+branch;
        } else if(!quiet && !remotePull && !verbose) {
        	command ="git pull";
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
     * @TODO:Please improve the options
     */
    //Git PUSH
    public static boolean push(String repositoryPath, String remoteName, String branch, Boolean remotePush, Boolean setUpstream, Boolean pushTags) throws HasNoUpstreamBranch, LocalRepositoryNotAGitRepository, OptionNotExist {

        CLIExecution execution = null;
        String command = null;

        if (remotePush && !setUpstream && !pushTags) {
            command = "git push " + remoteName + " " + branch;
        } else if (!remotePush && !setUpstream && pushTags) {
        	command = "git push " + remoteName + " --tags";
        } else if(!remotePush && setUpstream && !pushTags){
        	command = "git push --set-upstream origin" + branch;        	
        } else if (!remotePush && !setUpstream && !pushTags) {
            command = "git push";
        }

        try {
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
    /**
     * @TODO: improve the output
     * @param repositoryPath
     * @throws LocalRepositoryNotAGitRepository
     */
    public boolean listtag(String repositoryPath) throws LocalRepositoryNotAGitRepository {
        String command = "git tag";
        CLIExecution execution = null;
        boolean sucess = false;
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
            else{
            sucess = true;
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sucess;
    }
    /**
     * @TODO: improve the output. How I know that a tag was created?
     * @param repositoryPath
     * @param tag
     * @param message
     * @throws LocalRepositoryNotAGitRepository
     */
    public boolean createtag(String repositoryPath, String tag, String message) throws LocalRepositoryNotAGitRepository {
        String command = "git tag";
        CLIExecution execution = null;
        command = command + " -a " + tag + " -m " + message;
        boolean sucess = false;
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
            else{
                sucess = true;
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sucess;
    }

    /**
     * @TODO: improve the output. How I know that a tag was deleted?
     * @param repositoryPath
     * @param tag
     * @throws LocalRepositoryNotAGitRepository
     */
    public boolean removetag(String repositoryPath, String tag) throws LocalRepositoryNotAGitRepository {
        String command = "git tag --delete ";
        CLIExecution execution = null;
        command = command + tag;
        boolean sucess = false;
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
            else{   
            sucess=true;
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sucess;
    }

    public List<String> parent(String repositoryPath, String commit) throws LocalRepositoryNotAGitRepository, OptionNotExist {
        String command = "git log --pretty=%P -n 1 ";
        CLIExecution execution = null;
        List<String> lista = new ArrayList<>();
        command = command + commit;
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            System.out.println(execution);
            if (execution.getError().isEmpty() && execution.getOutput().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.isEmpty()) {
                        System.out.println("não há pais");
                    }

                }
            } else if (!execution.getError().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.contains("not a git repository")) {
                        throw new LocalRepositoryNotAGitRepository();
                    } else if (line.contains("fatal: ambiguous argument")) {
                        throw new OptionNotExist();
                    }
                }
            }
            lista = execution.getOutput();
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
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
     * @TODO: Put the repository path as a parameter to use in the method
     * execute description
     *
     * @param option
     * @param repositoryPath 
     * @exception UnknownSwitch
     * @exception RefusingToClean
     * @exception IsOutsideRepository
     * @exception RequiresAValue
     * @exception ExceptionNotTreated_Clean
     */
    public static boolean clean(String option, String repositoryPath) throws UnknownSwitch, RefusingToClean, IsOutsideRepository, RequiresAValue, ExceptionNotTreated_Clean {
        String command = "git clean " + option;

        CLIExecution execution = null;
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            System.out.println(execution);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("unknown switch")) {
                    throw new UnknownSwitch(line);
                } else if (line.contains("refusing to clean")) {
                    throw new RefusingToClean(line);
                } else if (line.contains("is outside repository")) {
                    throw new IsOutsideRepository(line);
                } else if (line.contains("requires a value")) {
                    throw new RequiresAValue(line);
                } else if (!line.isEmpty()) {
                    throw new ExceptionNotTreated_Clean();
                }
            }
        }
        return true;
    }

    ///merge
    /**
     * @TODO: Put the repository path as a parameter to use in the method
     * execute
     *
     * @param options
     * @param repositoryPath 
     * @exception CanNotMerge
     * @exception NoRemoteForTheCurrentBranch
     * @exception UnknownOption
     * @exception ThereIsNoMergeInProgress
     * @exception ThereIsNoMergeToAbort
     * @exception RequiresAValue_Merge
     * @exception CouldNotReadFile
     * @exception ExpectsnoArguments
     * @exception ExceptionNotTreated_Merge
     */
    public static boolean merge(String options, String repositoryPath) throws CanNotMerge, NoRemoteForTheCurrentBranch, UnknownOption, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, RequiresAValue_Merge, CouldNotReadFile, ExpectsnoArguments, ExceptionNotTreated_Merge {
        String command = "git merge " + options;
        CLIExecution execution = null;
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            System.out.println(execution);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("can not merge")) {
                    throw new CanNotMerge(line);
                } else if (line.contains("No remote for the current branch.")) {
                    throw new NoRemoteForTheCurrentBranch(line);
                } else if (line.contains("unknown option")) {
                    throw new UnknownOption(line);
                } else if (line.contains("There is no merge in progress")) {
                    throw new ThereIsNoMergeInProgress(line);
                } else if (line.contains("There is no merge to abort")) {
                    throw new ThereIsNoMergeToAbort(line);
                } else if (line.contains("requires a value")) {
                    throw new RequiresAValue_Merge(line);
                } else if (line.contains("could not read file")) {
                    throw new CouldNotReadFile(line);
                } else if (line.contains("expects no arguments")) {
                    throw new ExpectsnoArguments(line);
                } else if (!line.isEmpty()) {
                    throw new ExceptionNotTreated_Merge();
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
    /**
     * @TODO: return something to show that the branch was created...
     * @param branchName
     * @param switchTo
     * @param directory
     * @throws Exception
     */
    public static void branchCreate(String branchName, boolean switchTo, String directory) throws Exception {
        // Create a branch and switch to it if user wants
        String command = "git branch " + branchName;
        try {
            System.out.println("\nCreating " + branchName + "...");
            CLIExecution cliE = CLIExecute.execute(command, directory);
            if (!cliE.getError().isEmpty()) {
                if (cliE.getError().contains("already exists")) {
                    throw new BranchAlreadyExist(branchName);
                }
            } else {
                for (String string : cliE.getOutput()) {
                    System.out.println(string);
                }
                if (switchTo) {
                    System.out.println("\nSwitching to " + branchName + "...");
                    command = "git checkout " + branchName;
                    cliE = CLIExecute.execute(command, directory);
                    for (String string : cliE.getOutput()) {
                        System.out.println(string);
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    /**
     * @TODO: return something to show that the branch was created...
     * @param branchName
     * @param directory
     * @throws Exception 
     */
    public static void branchDelete(String branchName, String directory) throws Exception {
        try {
            CLIExecution cliE = CLIExecute.execute("git branch --all", directory);
            if (cliE.getOutput().contains(branchName)) {
                if (cliE.getOutput().contains("* " + branchName)) {
                    //Need to switch to master
                    System.out.println("Switching to master...");
                    cliE = CLIExecute.execute("git checkout master", directory);
                    System.out.println(cliE.getOutput().get(0));
                    System.out.println("Deleting " + branchName + "...");
                    cliE = CLIExecute.execute("git branch -d " + branchName, directory);
                    System.out.println(cliE.getOutput().get(0));
                } else {
                    //Just delete
                    System.out.println("Deleting " + branchName + "...");
                    cliE = CLIExecute.execute("git branch -d " + branchName, directory);
                    System.out.println(cliE.getOutput().get(0));
                }
            } else {
                //Branch not exist
                throw new BranchNotFound(branchName);
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @TODO: return something to list the branches (List<Strings>)
     * @param print
     * @param directory
     * @return
     * @throws Exception 
     */
    public static String branchAll(boolean print, String directory) throws Exception {
        CLIExecution cliE = CLIExecute.execute("git branch --all", directory);
        String output = "";
        for (String string : cliE.getOutput()) {
            if (print) {
                System.out.println(string);
            }
            output += string + "\n";
        }
        return output;
    }

    public static boolean checkout(String option, String entityName, String directory) throws Exception {
        // Update files in working tree and switch between branches
        /* The "entityName" is a variable that represents any entity
        in the working tree such as branches, files, commits, paths
        and pathspecs
         */
        String command = "git checkout";
        if (option != null) {
            command += " " + option;
        }
        if (entityName != null) {
            command += " " + entityName;
        }
        try {
            CLIExecution cliE = CLIExecute.execute(command, directory);
            System.out.println("========== Running " + command + " ==========");
            if (!cliE.getOutput().isEmpty()) {
                for (String string : cliE.getOutput()) {
                    System.out.println(string);
                }
                System.out.println("========== End of " + command + " ==========\n");
                return true;
            } else {
                if (cliE.getError().contains("usage: git checkout [<options>] <branch>")) {
                    System.out.println(cliE.getError().get(0));
                } else {
                    for (String string : cliE.getError()) {
                        System.out.println(string);
                    }
                }
                System.out.println("========== End of " + command + " ==========\n");
                return false;
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
    
    /**
     * @TODO: insert the repository path to run the method (test the implementation) 
     * @param type
     * @throws OptionNotExist 
     */
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

    /**
     * @TODO: insert the repository path to run the method (test the implementation) 
     * @TODO: What is the output? 
     * @param modificado
     * @param head
     * @param cached 
     */
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
