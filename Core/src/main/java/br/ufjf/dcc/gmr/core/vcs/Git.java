package br.ufjf.dcc.gmr.core.vcs;

import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.vcs.types.Formats;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.BranchAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.HasNoUpstreamBranch;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
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
import br.ufjf.dcc.gmr.core.vcs.types.FileStatus;
import br.ufjf.dcc.gmr.core.vcs.types.FileUnmerged;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import br.ufjf.dcc.gmr.core.vcs.types.LineType;
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
            if (line.contains("not a git repository")) {
                throw new LocalRepositoryNotAGitRepository();
            }
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
    public static List<String> showCommiterName(String repositoryString, String hashCommit) throws IOException {
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
    private static List<Formats> log(String repositoryPath, boolean merge, boolean all) throws IOException, LocalRepositoryNotAGitRepository, ParseException {
        CLIExecution execution = null;
        String command = "git log ";
        if (merge) {
            command = command.concat(" --merges ");
        }

        if (all) {
            command = command.concat(" --all ");
        }

        //log method formatting
        command = command.concat("--pretty=format:\"%an,%H,%ai,%s\"");
        List<Formats> list = new ArrayList<>();
        Formats model = null;

        execution = CLIExecute.execute(command, repositoryPath);
        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                }
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
            //System.out.println("autorDate: " + authorDate);
            array = array[2].split(" ", 3);
            String dateForm = array[0];
            String time = array[1];
            String text = dateForm + " " + time;
            String localization = array[2];
            String formato = "yyyy-MM-dd HH:mm:ss";
            Date dateFormat = new SimpleDateFormat(formato).parse(text);
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
    public static List<Formats> log(String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository, ParseException {
        return Git.log(repositoryPath, false, false);
    }

    /**
     * @param repositoryPath
     * @return
     * @throws IOException
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     */
    public static List<Formats> logMerge(String repositoryPath) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException {
        return Git.log(repositoryPath, true, false);
    }

    /**
     * @param repositoryPath
     * @return
     * @throws IOException
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     */
    public static List<Formats> logAll(String repositoryPath) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException {
        return Git.log(repositoryPath, false, true);
    }

    /**
     * @param repositoryPath
     * @return
     * @throws IOException
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     */
    public static List<Formats> logMergeAll(String repositoryPath) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException {
        return Git.log(repositoryPath, true, true);
    }

    /**
     * @param repositoryPath
     * @return
     * @throws br.ufjf.dcc.gmr.core.exception.RepositoryNotFound
     * @throws java.io.IOException
     * @TODO:What is the meaning when this method returns true or false? Would
     * you improve the output?
     */
    public static FileStatus status(String repositoryPath) throws RepositoryNotFound, IOException {
        String command = "git status --short";
        CLIExecution execute;
        Status type = null;
        FileStatus status = new FileStatus();
            
        
        if (repositoryPath == null || repositoryPath.isEmpty()) {
            throw new RepositoryNotFound();
        }

        execute = CLIExecute.execute(command, repositoryPath);
        
        for (String line : execute.getOutput()) {
            String []array;
            if(line.startsWith(" M")){
                array = line.split("M");
                status.setType(type.MODIFIED);
                status.setPath(array[1]);
                status.files.allStatus.add(status.getType()+" "+status.getPath());
            }
            if(line.startsWith(" A")){
                array = line.split("A");
                status.setType(type.ADDED);
                status.setPath(array[1]);
                status.files.allStatus.add(status.getType()+" "+status.getPath());
            }
            if(line.startsWith(" D")){
                array = line.split("D");
                status.setType(type.DELETED);
                status.setPath(array[1]);
                status.files.allStatus.add(status.getType()+" "+status.getPath());
            }
            if(line.contains("?")){
                array = line.split(" ");
                status.setType(type.UNTRACKED);
                status.setPath(array[1]);
                status.files.allStatus.add(status.getType()+" "+status.getPath());
            }
            if(line.startsWith(" R")){
                array = line.split("R");
                status.setType(type.RENAMED);
                status.setPath(array[1]);
                status.files.allStatus.add(status.getType()+" "+status.getPath());
            }
            if(line.startsWith(" C")){
                array = line.split("C");
                status = new FileStatus(type.COPIED,array[1]);
                status.files.allStatus.add(status.getType()+" "+status.getPath());
            }
            if(line.startsWith(" U")){
                array = line.split("U");
                status.setType(type.UNMERGED);
                status.setPath(array[1]);
                status.files.allStatus.add(status.getType()+" "+status.getPath());
            }
            if(line.contains("!")){
                array = line.split(" ");
                status.setType(type.IGNORED);
                status.setPath(array[1]);
                status.files.allStatus.add(status.getType()+" "+status.getPath());
            }
        }
        return status;  
    }

    public static FileUnmerged statusUnmerged(String repositoryPath) throws RepositoryNotFound, IOException {
        String command = "git status --short";
        CLIExecution execute;
        FileStatus status = status(repositoryPath);
        FileUnmerged u = new FileUnmerged();

        if (repositoryPath == null || repositoryPath.isEmpty()) {
            throw new RepositoryNotFound();
        }

        execute = CLIExecute.execute(command, repositoryPath);
        List<String> allStatus = status.files.allStatus;
        if (!allStatus.isEmpty()) {
            for (int i = 0; i < allStatus.size(); i++) {
                if (allStatus.get(i).contains("U")) {
                    u.file.unmerged.add(allStatus.get(i));
                }
            }
        }
        return u;
    }

    /**
     * description
     *
     * @param url
     * @param directory
     * @param name
     * @return
     * @throws RepositoryNotFound
     * @throws br.ufjf.dcc.gmr.core.exception.UrlNotFound
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
                } else if (line.contains("Repository not found")) {
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

    /**
     * @param repositoryPath - String used to recive the repository path.
     * @param force - If the Git configuration variable clean.requireForce is
     * not set to false, Git will refuse to delete directories with .git sub
     * directory or file unless a second -f is given.
     * @param ignoredFiles - if == 0 allows removing all untracked files,
     * including build products. if == 1 Remove only files ignored by Git. if
     * you don`t wanna use it, just let it blanck.
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

        if (ignoredFiles == 0) {
            command = command.concat(" -x");
        } else if (ignoredFiles == 1) {
            command = command.concat(" -X");
        }

        CLIExecution execution = null;

        execution = CLIExecute.execute(command, repositoryPath);

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

    /**
     * Private method used by the other merge methods to execute a merge.
     *
     * @return boolean - True if no exception is thrown, else false.
     * @param repositoryPath - String used to recive the repository path.
     * @param version - String used to recive all the commands generated by the
     * other merge methods.
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

        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("No remote for the current branch.")) {
                    throw new NoRemoteForTheCurrentBranch(line);
                } else if (line.contains("There is no merge in progress")) {
                    throw new ThereIsNoMergeInProgress(line);
                } else if (line.contains("There is no merge to abort")) {
                    throw new ThereIsNoMergeToAbort(line);
                } else if (line.contains("Already up to date")) {
                    throw new AlreadyUpToDate(line);
                } else if (line.contains("not something we can merge")) {
                    throw new NotSomethingWeCanMerge(line);
                }
            }
            return false;
        }
        return true;
    }

    /**
     * This method merge changes from one branch into the current branch.
     *
     * @param branch1 - String used to recive the name of the branch 1.
     * @param commitMessage - String used to recive the commit message.
     * @return boolean - True if no exception is thrown else false.
     * @param repositoryPath - String used to recive the repository path.
     * @exception NoRemoteForTheCurrentBranch
     * @exception ThereIsNoMergeInProgress
     * @exception ThereIsNoMergeToAbort
     * @exception AlreadyUpToDate
     * @exception NotSomethingWeCanMerge
     * @throws java.io.IOException
     */
    public static boolean mergeBranch(String repositoryPath, String branch1, String commitMessage) throws NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, IOException, AlreadyUpToDate, NotSomethingWeCanMerge {
        String command = branch1.concat(" ").concat(" -m \"").concat(commitMessage).concat("\"");
        return mergeBase(repositoryPath, command);
    }

    /**
     * This method merge changes from one branch into another.
     *
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
     */
    public static boolean mergeBranch(String repositoryPath, String branch1, String branch2, String commitMessage) throws NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, IOException, AlreadyUpToDate, NotSomethingWeCanMerge {
        String command = branch1.concat(" ").concat(branch2).concat(" -m \"").concat(commitMessage).concat("\"");
        return mergeBase(repositoryPath, command);
    }

    /**
     * This method abort a merge that resulted in conflicts.
     *
     * @return boolean - True if no exception is thrown else false.
     * @param repositoryPath - String used to recive the repository path.
     * @exception NoRemoteForTheCurrentBranch
     * @exception ThereIsNoMergeInProgress
     * @exception ThereIsNoMergeToAbort
     * @exception AlreadyUpToDate
     * @exception NotSomethingWeCanMerge
     * @throws java.io.IOException
     */
    public static boolean mergeAbort(String repositoryPath) throws NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, IOException, AlreadyUpToDate, NotSomethingWeCanMerge {
        return mergeBase(repositoryPath, "--abort");
    }

    /**
     * This method continue a merge that resulted in conflicts.
     *
     * @return boolean - True if no exception is thrown else false.
     * @param repositoryPath - String used to recive the repository path.
     * @exception NoRemoteForTheCurrentBranch
     * @exception ThereIsNoMergeInProgress
     * @exception ThereIsNoMergeToAbort
     * @exception AlreadyUpToDate
     * @exception NotSomethingWeCanMerge
     * @throws java.io.IOException
     */
    public static boolean mergeContinue(String repositoryPath) throws NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, IOException, AlreadyUpToDate, NotSomethingWeCanMerge {
        return mergeBase(repositoryPath, "--continue");
    }

    /**
     * Create a new branch and switch to it if requested.
     *
     * @param branchName This parameter is a String that contains the name of
     * branch that goes be create
     * @param switchTo This parameter is a boolean that goes determinate if user
     * wants to switch to the new branch
     * @param repositoryPath This parameter is a String that contains the
     * directory where the command will be executed
     * @return Returns a boolean that goes show if command worked or not
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository if repositoryPath is not a Git
     * repository
     * @throws BranchAlreadyExist if branchName has the same name of other
     * branch that already exist
     */
    public static boolean createBranch(String branchName, boolean switchTo, String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository, BranchAlreadyExist {
        String command = "git branch " + branchName;
        boolean check = true;
        CLIExecution cliE = null;
        cliE = CLIExecute.execute(command, repositoryPath);
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
                cliE = CLIExecute.execute(command, repositoryPath);
                for (String string : cliE.getOutput()) {
                    System.out.println(string);
                }
            }
        }
        return check;
    }

    /**
     * Delete a branch.
     *
     * @param branchName This parameter is a String that contains the name of
     * branch that goes be create
     * @param repositoryPath This parameter is a String that contains the
     * directory where the command will be executed
     * @return Returns a boolean that goes show if command worked or not
     * @throws LocalRepositoryNotAGitRepository if repositoryPath is not a Git
     * repository
     * @throws BranchNotFound if branchName is not another branch that already
     * exist
     * @throws IOException
     */
    public static boolean deleteBranch(String branchName, String repositoryPath) throws LocalRepositoryNotAGitRepository, BranchNotFound, IOException {
        CLIExecution cliE = null;
        boolean check = true;
        cliE = CLIExecute.execute("git branch -d " + branchName, repositoryPath);
        if (!cliE.getError().isEmpty()) {
            for (String line : cliE.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                } else if (line.contains("not found")) {
                    throw new BranchNotFound(branchName);
                } else if (line.contains("Cannot delete branch")) {
                    cliE = CLIExecute.execute("git checkout master", repositoryPath);
                    cliE = CLIExecute.execute("git branch -d " + branchName, repositoryPath);
                    break;
                }
            }
        }
        return check;
    }

    /**
     * List all branches in repository and return a list of them.
     *
     * @param print parameter is a boolean that goes determinate if user wants
     * to print
     * @param repositoryPath This parameter is a String that contains the
     * directory where the command will be executed
     * @return Return a List<String> that contain all the branches of repository
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository if repositoryPath is not a Git
     * repository
     */
    public static List<String> listBranches(boolean print, String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository {
        CLIExecution cliE = null;
        cliE = CLIExecute.execute("git branch --all", repositoryPath);
        if (!cliE.getError().isEmpty()) {
            for (String line : cliE.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                }
            }
        }
        if (print) {
            for (String line : cliE.getOutput()) {
                System.out.println(line);
            }
        }
        return cliE.getOutput();
    }

    /**
     * Switch to another branch, commit or tag. WARNING: if entity is a file
     * that was added to staging area, checkout will be treated like reset.
     *
     * @param entity This parameter is a String that represents anything that
     * can be checkouted like branches and commits
     * @param repositoryPath This parameter is a String that contains the
     * directory where the command will be executed
     * @return Returns a boolean that goes show if command worked or not
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository if repositoryPath is not a Git
     * repository
     * @throws CheckoutError if entity does not exist in repository
     */
    public static boolean checkout(String entity, String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository, CheckoutError {
        CLIExecution cliE = null;
        boolean check = true;
        cliE = CLIExecute.execute("git checkout " + entity, repositoryPath);
        if (!cliE.getError().isEmpty()) {
            for (String string : cliE.getError()) {
                if (string.contains("not a git repository")) {
                    check = false;
                    throw new LocalRepositoryNotAGitRepository();
                } else if (string.contains("did not match any file(s) known to git")) {
                    check = false;
                    throw new CheckoutError(string);
                }
            }
        }
        return check;
    }

    /**
     * Give all commits that is merges and their parents
     *
     * @param repositoryPath This parameter is a String that contains the
     * directory where the command will be executed
     * @return Return a List String that goes contains all commits that is
     * merges
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository if repositoryPath is not a Git
     * repository
     */
    public static List<String> giveAllMerges(String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository {
        CLIExecution cliE = CLIExecute.execute("git log --all --min-parents=2 --pretty=format:%P,%H", repositoryPath);
        if (!cliE.getError().isEmpty()) {
            for (String string : cliE.getError()) {
                if (string.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                }
            }
        }
        return cliE.getOutput();
    }

    /**
     * Do a merge and verify if is a conflict
     *
     * @param entity This parameter is a String that represents anything that
     * can be merged like branches and commits
     * @param repositoryPath This parameter is a String that contains the
     * directory where the command will be executed
     * @param abort This parameter is a boolean that indicates if user wants to
     * abort the conflict if happend
     * @param returnToMaster This parameter is a boolean that indicates if user
     * wants to return to master after merge
     * @return Returns a boolean that indicates if the merge is confliting
     * @throws LocalRepositoryNotAGitRepository
     * @throws NoRemoteForTheCurrentBranch
     * @throws ThereIsNoMergeInProgress
     * @throws ThereIsNoMergeToAbort
     * @throws AlreadyUpToDate
     * @throws NotSomethingWeCanMerge
     * @throws IOException
     * @throws CheckoutError
     */
    public static boolean mergeIsConflicting(String entity, String repositoryPath, boolean abort, boolean returnToMaster) throws LocalRepositoryNotAGitRepository, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, IOException, CheckoutError {
        CLIExecution cliE = CLIExecute.execute("git merge --no-edit " + entity, repositoryPath);
        boolean check = false;
        if (!cliE.getError().isEmpty()) {
            for (String line : cliE.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                } else if (line.contains("No remote for the current branch.")) {
                    throw new NoRemoteForTheCurrentBranch(line);
                } else if (line.contains("There is no merge in progress")) {
                    throw new ThereIsNoMergeInProgress(line);
                } else if (line.contains("There is no merge to abort")) {
                    throw new ThereIsNoMergeToAbort(line);
                } else if (line.contains("Already up to date")) {
                    throw new AlreadyUpToDate(line);
                } else if (line.contains("not something we can merge")) {
                    throw new NotSomethingWeCanMerge(line);
                }
            }
        } else if (cliE.getOutput().toString().contains("Automatic merge failed")) {
            check = true;
            if (abort) {
                mergeAbort(repositoryPath);
            }
        }
        if ((returnToMaster && !check) || (returnToMaster && check && abort)) {
            Git.checkout("master", repositoryPath);
        }
        return check;
    }
    
    /**
     * Return form:
     * 
     * Commit Hash
     * Author Name
     * Author Date
     * Committer Name
     * Committer Date
     * Title
     * 
     * @param commitHash
     * @param repositoryPath
     * @return
     * @throws IOException 
     */
    public static List<String> getBaseCommitInfo(String commitHash, String repositoryPath) {
        CLIExecution cliE = null;
        try {
           cliE = CLIExecute.execute("git show "+commitHash+" --format=%H%n%an%n%at%n%cn%n%ct%n%s --no-patch", repositoryPath);
        } catch (IOException ex) {
            return null;
        }
        return cliE.getOutput();
    }

    /**
     * Find a common ancestor of the parents
     *
     * @param repositoryPath This parameter is a String that contains the
     * directory where the command will be executed
     * @param parents This parameter is a List<String> that contains the hash of
     * the parents
     * @return Return a List<String> that goes contains all commits that is
     * merges
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository if repositoryPath is not a Git
     * repository
     */
    public static String mergeBaseCommand(String repositoryPath, List<String> parents) throws IOException, LocalRepositoryNotAGitRepository {
        String command = "git merge-base ";
        for (String str : parents) {
            command = command + str + " ";
        }
        CLIExecution cliE = CLIExecute.execute(command, repositoryPath);
        if (!cliE.getError().isEmpty()) {
            for (String string : cliE.getError()) {
                if (string.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                }
            }
        }
        return cliE.getOutput().toString().replace("[", "").replace("]", "");
    }

    /**
     *
     * This method executes the git command 'reset'. This command can be called
     * without any modifier or with one of the three, 'hard','mixed' and 'soft'
     * The command undo the last commit or merge;
     *
     * @param repositoryPath This parameter tells the command the path to the
     * repository we are dealling with
     * @param hard If this parameter is true the command will do a hard reset
     * @param mixed If this parameter is true the command will do a mixed reset
     * @param soft If this parameter is true the command will do a soft reset
     * @param document this parameter is used in case of a mixed reset and is
     * the "doccument" that the command will remove
     * @return return true if the command was executed and false if not
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     * exception that occurs when the repositorypath is wrong
     * @throws IOException
     * @throws br.ufjf.dcc.gmr.core.exception.InvalidDocument exception to
     * Invalid document
     *
     */
    public static boolean reset(String repositoryPath, boolean hard, boolean mixed, boolean soft, String document) throws IOException, LocalRepositoryNotAGitRepository, InvalidDocument {

        String command = "git reset ";

        if (hard) {
            command = command.concat(" --hard");
        } else if (mixed) {
            command = command.concat(" -- ");
            command = command.concat(document);
        } else if (soft) {
            command = command.concat(" --soft");
        }

        CLIExecution execution = CLIExecute.execute(command, repositoryPath);

        if (!execution.getError().isEmpty()) {

            for (String line : execution.getError()) {
                if (line.contains("not a git repository")) {

                    throw new LocalRepositoryNotAGitRepository();
                }
                if (line.contains("fatal: ambiguous argument")) {
                    throw new InvalidDocument();
                }

            }
        } else {
            return true;
        }

        return false;

    }

    /**
     * This method recieves two commitHash and returns the difference between
     * them ussing an FileDiff list.
     *
     * @param directory This parameter tells the command the path to the
     * repository we are dealling with
     * @param commitSource This parameter is the commit we want to compare
     * @param commitTarget This parameter is the commit we want to compare to.
     * @param unified
     * @return return the FileDiff list
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     * exception that occurs when the repository is not a git repository
     *
     * @throws IOException exception that occurs when the repositorypath is
     * wrong
     * @throws br.ufjf.dcc.gmr.core.exception.InvalidCommitHash Exception to
     * wrong commit hash
     *
     */
    public static List<FileDiff> diff(String directory, String commitSource, String commitTarget, boolean unified)
            throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        List<FileDiff> result = new ArrayList<>();
        int i = 0;
        FileDiff aux = new FileDiff();
        String command = null;
        if(!unified){
         command = "git diff " + commitSource + " " + commitTarget;
        }
        else{
         command= "git diff " + commitSource + " " + commitTarget+ "-- unified";
        }
       
        CLIExecution execution = CLIExecute.execute(command, directory);

        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                }
                if (line.contains("fatal: ambiguous argument")) {
                    throw new InvalidCommitHash();
                }
            }
        } else {
        	aux.setAllMessage(execution.getOutput());
            for (String line : execution.getOutput()) {

                if (line.startsWith("diff --")) {

                    if (i != 0) {
                        result.add(aux);
                    }
                    i++;
                    aux = new FileDiff();
                }

                if (line.length() > 2 && line.charAt(0) == '+' && line.charAt(1) == '+' && line.charAt(2) == '+') {
                	String c=line.substring(5);
                	aux.setFilePathTarget(c);
                } else if (line.charAt(0) == '+' || line.charAt(1) == '+') {
                	String c=line.substring(1);
                    aux.getLines().add(new LineInformation(c, LineType.ADDED));
                } else if (line.length() > 2 && line.charAt(0) == '-' && line.charAt(1) == '-' && line.charAt(2) == '-') {
                	String c=line.substring(5);
                	aux.setFilePathSource(c);
                } else if (line.charAt(0) == '-' || line.charAt(1) == '-') {
                	String c=line.substring(1);
                    aux.getLines().add(new LineInformation(c, LineType.DELETED));
                }
                  else if(line.charAt(0)== '@'){
                    aux.setArroba(line);
                }

            }
            result.add(aux);
            aux = new FileDiff();

        }

        return result;
    }
    
    public static List<String> auxiliardiff(String directory, String commitSource, String commitTarget)
            throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        
         String command= "git diff " + commitSource + " " + commitTarget;
        
       
        CLIExecution execution = CLIExecute.execute(command, directory);

        if (!execution.getError().isEmpty()) {
            for (String line : execution.getError()) {
                if (line.contains("not a git repository")) {
                    throw new LocalRepositoryNotAGitRepository();
                    
                }
                if (line.contains("fatal: ambiguous argument")) {
                    throw new InvalidCommitHash();
                }
            }
        } 
        	
		return execution.getOutput();
        

        
    }
}
