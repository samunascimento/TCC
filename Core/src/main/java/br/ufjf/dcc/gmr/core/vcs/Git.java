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
import br.ufjf.dcc.gmr.core.exception.BranchAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.CanNotMerge;
import br.ufjf.dcc.gmr.core.exception.CouldNotReadFile;
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
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.exception.UnknownOption;
import br.ufjf.dcc.gmr.core.vcs.example.GitExample;
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

    /**
     * @param repositoryString
     * @param hashCommit
     * @return
     */
    public static List<String> show(String repositoryString, String hashCommit) {
        CLIExecution execution = null;
        String command = "git show" + " " + hashCommit + " --pretty=oneline";
        List<String> list = new ArrayList<>();
        try {
            execution = CLIExecute.execute(command, repositoryString);
            for (String line : execution.getOutput()) {
                list.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    /**
     *
     * @param repositoryPath
     * @return list of Formats
     */
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
                //System.out.println("");
                array = line.split(",", 4);
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

    public static List<Formats> logMerge(String repositoryPath) {
        CLIExecution execution = null;
        String command = "git log --merges --pretty=format:\"%an,%h,%ai,%s,%p\"";
        List<Formats> list = new ArrayList<>();
        Formats model = null;

        try {
            execution = CLIExecute.execute(command, repositoryPath);

            String array[] = new String[5];
            int i = 0;
            for (String line : execution.getOutput()) {
                //System.out.println("");
                array = line.split(",");
                model = new Formats(array[0], array[1], array[2], array[3], array[4]);
                list.add(model);
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

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
    /**
     * Description 
     * TODO: Test implementation 
     * @param repositoryPath
     * @param branch
     * @param quiet
     * @return
     * @throws RemoteRefBranchNotFound
     * @throws LocalRepositoryNotAGitRepository
     * @throws OptionNotExist
     * @throws IOException 
     */
    public static boolean pull(String repositoryPath, String branch, Boolean quiet) throws RemoteRefBranchNotFound, LocalRepositoryNotAGitRepository, OptionNotExist, IOException {

        CLIExecution execution = null;
        String command = "git pull ";

        if (quiet) {
            command = command.concat(" --quiet ");
        } else {
            command = command.concat(" --verbose ");
        }

        if (branch != null) {
            command = command.concat(" " + branch);
        }

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
     *
     * @param repositoryPath
     * @param remoteName
     * @param branch
     * @param remotePush
     * @param setUpstream
     * @param pushTags
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
        } else if (!remotePush && setUpstream && !pushTags) {
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
     *
     * @param repositoryPath repository
     * @return return a String List with tags
     * @throws LocalRepositoryNotAGitRepository
     * @throws java.io.IOException
     */
    public static List<String> listTag(String repositoryPath) throws LocalRepositoryNotAGitRepository, IOException {
        String command = "git tag";
        CLIExecution execution = null;
        List<String> lista = new ArrayList<>();
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.contains("not a git repository")) {
                        throw new LocalRepositoryNotAGitRepository();
                    }
                }
            }
            lista = execution.getOutput();
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }

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
     */
    public static boolean createTag(String repositoryPath, String tag, String message, String commit) throws LocalRepositoryNotAGitRepository, IOException, OptionNotExist {
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
        boolean sucess = false;
        try {
            execution = CLIExecute.execute(command, repositoryPath);
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
        return sucess;
    }

    /**
     * @param repositoryPath
     * @param tag tag name to remove
     * @return return true if execution was successful and false if unsuccessful
     * @throws LocalRepositoryNotAGitRepository
     * @throws java.io.IOException
     */
    public static boolean removeTag(String repositoryPath, String tag) throws IOException, LocalRepositoryNotAGitRepository {
        String command = "git tag --delete ";
        CLIExecution execution = null;
        command = command + tag;
        boolean sucess = false;
        try {
            execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty()) {
                for (String line : execution.getError()) {
                    if (line.contains("not a git repository")) {
                        throw new LocalRepositoryNotAGitRepository();
                    }
                }
            } else {
                sucess = true;
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
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
     */
    public static List<String> parent(String repositoryPath, String commit) throws LocalRepositoryNotAGitRepository, OptionNotExist, IOException {
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
                }
            }
        }
        lista = execution.getOutput();
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
     * @param repositoryPath
     * @exception UnknownSwitch
     * @exception RefusingToClean
     * @exception IsOutsideRepository
     * @exception RequiresAValue
     */
    public static boolean clean(String repositoryPath) throws Exception {
        String command = "git clean ";

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
                }
            }
        }
        return true;
    }

    ///merge
    /**
     * @param repositoryPath
     * @exception CanNotMerge
     * @exception NoRemoteForTheCurrentBranch
     * @exception UnknownOption
     * @exception ThereIsNoMergeInProgress
     * @exception ThereIsNoMergeToAbort
     * @exception RequiresAValue
     * @exception CouldNotReadFile
     * @exception ExpectsnoArguments
     */
    public static boolean merge(String repositoryPath) throws Exception {
        String command = "git merge";
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
                    throw new RequiresAValue(line);
                } else if (line.contains("could not read file")) {
                    throw new CouldNotReadFile(line);
                } else if (line.contains("expects no arguments")) {
                    throw new ExpectsnoArguments(line);
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
    public static boolean branchCreate(String branchName, boolean switchTo, String directory) throws Exception {
        // Create a branch and switch to it if user wants
        String command = "git branch " + branchName;
        boolean check = true;
        CLIExecution cliE = null;
        try {
            System.out.println("\nCreating " + branchName + "...");
            cliE = CLIExecute.execute(command, directory);
            if (cliE.getError().contains("fatal: not a git repository (or any of the parent directories): .git")) {
                //Local directory not a git repository
                throw new LocalRepositoryNotAGitRepository();
            } else if (!cliE.getError().isEmpty()) {
                if (cliE.getError().contains("already exists")) {
                    //Branch already exists
                    throw new BranchAlreadyExist(branchName);
                }
            } else {
                for (String string : cliE.getOutput()) {
                    System.out.println(string);
                }
                if (switchTo) {
                    // User wants switch to branchName
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
        } catch (BranchAlreadyExist ex) {
            check = false;
        } catch (LocalRepositoryNotAGitRepository ex) {
            check = false;
        }
        return check;
    }

    /**
     * @TODO: return something to show that the branch was created...
     * @param branchName
     * @param directory
     * @throws Exception
     */
    public static boolean branchDelete(String branchName, String directory) throws Exception {
        CLIExecution cliE = null;
        boolean check = true;
        try {
            cliE = CLIExecute.execute("git branch --all", directory);
            if (cliE.getError().contains("fatal: not a git repository (or any of the parent directories): .git")) {
                //Local directory not a git repository
                throw new LocalRepositoryNotAGitRepository();
            } else if (cliE.getOutput().contains(branchName)) {
                if (cliE.getOutput().contains("* " + branchName)) {
                    //Need to switch to master
                    System.out.println("Switching to master...");
                    cliE = CLIExecute.execute("git checkout master", directory);
                    System.out.println(cliE.getOutput().get(0));
                }
                //Just delete
                System.out.println("Deleting " + branchName + "...");
                cliE = CLIExecute.execute("git branch -d " + branchName, directory);
                System.out.println(cliE.getOutput().get(0));
            } else {
                //Branch not exist
                throw new BranchNotFound(branchName);
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BranchNotFound ex) {
            check = false;
        } catch (LocalRepositoryNotAGitRepository ex) {
            check = false;
        }
        return check;
    }

    /**
     * @TODO: return something to list the branches (List<Strings>)
     * @param print
     * @param directory
     * @return
     * @throws Exception
     */
    public static List<String> branchAll(boolean print, String directory) throws Exception {
        CLIExecution cliE = null;
        try {
            cliE = CLIExecute.execute("git branch --all", directory);
            if (cliE.getError().contains("fatal: not a git repository (or any of the parent directories): .git")) {
                throw new LocalRepositoryNotAGitRepository();
            } else if (print) {
                for (String s : cliE.getOutput()) {
                    System.out.println(s);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LocalRepositoryNotAGitRepository ex) {
            return cliE.getError();
        }
        return cliE.getOutput();
    }

    public static boolean checkoutSwitchBranches(String branch, String directory) throws Exception {
        // Update files in working tree and switch between branches
        CLIExecution cliE = null;
        boolean check = true;
        try {
            System.out.println("Switching to " + branch + "...");
            cliE = CLIExecute.execute("git checkout " + branch, directory);
            if (cliE.getError().contains("fatal: not a git repository (or any of the parent directories): .git")) {
                throw new LocalRepositoryNotAGitRepository();
            } else if (!cliE.getError().isEmpty()) {
                System.out.println(cliE.getOutput().get(0));
            } else if (cliE.getError().contains("did not match any file(s) known to git")) {
                System.out.println(cliE.getError().get(0));
                check = false;
            } else if (cliE.getError().contains("Already on ")) {
                System.out.println(cliE.getError().get(0));
                check = false;
            }
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LocalRepositoryNotAGitRepository ex) {
            check = false;
        }
        return check;
    }

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
     * Description
     *
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
    public static boolean reset(String directory, boolean hard, boolean mixed, boolean soft) throws IOException {

        String command = "git reset ";

        if (hard) {
            command = command.concat(" --hard");
        } else if (mixed) {
            command = command.concat(" --mixed");
        } else if (soft) {
            command = command.concat(" --soft");
        }

        CLIExecution execution = CLIExecute.execute(command, directory);

        if (!execution.getError().isEmpty()) {
            //Errors
            System.out.println(execution);
        } else {
            return true;
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
     */
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
    }

    public static List<FileDiff> diff(String directory, String commitSource, String commitTarget) {

        List<FileDiff> result = new ArrayList<>();

        //implementation
        return result;
    }

    /*--------------------------------------------------------------------------
     * Fim comandos do Luan 
    --------------------------------------------------------------------------*/
}
