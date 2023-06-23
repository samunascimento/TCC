package br.ufjf.dcc.gmr.core.vcs;

import br.ufjf.dcc.gmr.core.cli.*;
import br.ufjf.dcc.gmr.core.exception.*;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import br.ufjf.dcc.gmr.core.vcs.types.LineType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class created to implement Git commands
 *
 * @author gleiph
 * @since Ever
 */
public class Git {

    /**
     * Execute "git clone" in a path in the system.
     *
     * @param downloadPath The path where the project will be downloaded.
     * @param projectURL The URL where the project is.
     * @param folderName The name that the clone will receive
     * @throws java.io.IOException if downloadPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.CloneException if occur any error
     * in scope of git clone command.
     */
    public static void clone(String downloadPath, String projectURL, String folderName) throws IOException, CloneException {
        if (folderName == null) {
            folderName = "";
        }
        String command = "git clone " + projectURL + " " + folderName;
        System.out.println("Clonando " + projectURL + " em " + downloadPath + (downloadPath.endsWith(File.separator) ? "" : File.separator)
                + folderName + (folderName.endsWith(File.separator) ? "" : File.separator)
                + "...\nIsso pode demorar dependendo do projeto, por favor espere.");
        CLIExecution execution = CLIExecute.execute(command, downloadPath);
        if (!execution.getError().isEmpty() && execution.getOutput().isEmpty() && !execution.getError().contains("Cloning into '" + folderName + "'...")) {
            System.out.println(execution);
            throw new CloneException(ListUtils.getTextListStringToString(execution.getError()));
        }
    }

    /**
     * Check if a path in the system if a git repository.
     *
     * @param repositoryPath The path of the git repository.
     * @return true if repositoryPath is git repository, false if not.
     * @throws java.io.IOException if repositoryPath not exist in your system.
     */
    public static boolean isGitRepository(String repositoryPath) throws IOException {
        return CLIExecute.execute("git rev-parse --is-inside-work-tree", repositoryPath).getError().isEmpty();
    }

    /**
     * Execute "git clean" in a path in the system.
     *
     * @param repositoryPath The path of the git repository.
     * @param force If the Git configuration variable clean.requireForce is not
     * set to false, Git will refuse to delete directories with .git sub
     * directory or file unless a second -f is given.
     * @param ignoredFiles If == 0 allows removing all untracked files,
     * including build products. if == 1 Remove only files ignored by Git. if
     * you don`t wanna use it, just let it blank.
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.CleanException if occur any error
     * in scope of git clean command.
     */
    public static void clean(String repositoryPath, boolean force, int ignoredFiles) throws IOException, NotGitRepositoryException, CleanException {
        if (isGitRepository(repositoryPath)) {
            String command = "git clean" + (force ? " -fd" : "") + (ignoredFiles == 0 ? " -x" : ignoredFiles == 1 ? " -X" : "");
            CLIExecution execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty() && execution.getOutput().isEmpty()) {
                throw new CleanException(ListUtils.getTextListStringToString(execution.getError()));
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Execute "git merge" in a path in the system.
     *
     * @param otherCommit For the hash to merge
     * @param repositoryPath The path of the git repository.
     * @return the message of the command.
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.MergeException if occur any error
     * in scope of git merge command.
     */
    public static List<String> merge(String otherCommit, String repositoryPath) throws IOException, NotGitRepositoryException, MergeException {
        if (isGitRepository(repositoryPath)) {
            String command = "git merge --allow-unrelated-histories --no-edit -s recursive " + otherCommit;
            CLIExecution execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty() && execution.getOutput().isEmpty()) {
                throw new MergeException(ListUtils.getTextListStringToString(execution.getError()));
            } else {
                return execution.getOutput();
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Restore all uncommited files
     *
     * @param repositoryPath The path of the git repository.
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.RMException if occur any error in
     * scope of git rm command.
     */
    public static void removeAllInWorkspace(String repositoryPath) throws IOException, NotGitRepositoryException, RMException {
        if (isGitRepository(repositoryPath)) {
            CLIExecution execution = CLIExecute.execute("git rm --cached -r .", repositoryPath);
            if (!execution.getError().isEmpty()) {
                throw new RMException(ListUtils.getTextListStringToString(execution.getError()));
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Execute "git checkout" in a path in the system.
     *
     * @param entity Represents anything that can be checkouted like branches.
     * and commits
     * @param repositoryPath The path of the git repository.
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.CheckoutException if occur any
     * error in scope of git checkout command.
     */
    public static void checkout(String entity, String repositoryPath) throws IOException, NotGitRepositoryException, CheckoutException {
        if (isGitRepository(repositoryPath)) {
            CLIExecution execution = CLIExecute.execute("git checkout " + entity, repositoryPath);
            if (!execution.getError().isEmpty()) {
                String error = ListUtils.getTextListStringToString(execution.getError());
                if (!error.contains("HEAD is now at ")) {
                    execution = CLIExecute.execute("git status", repositoryPath);
                    if (execution.getErrorString().contains("HEAD detached") || execution.getOutputString().contains("HEAD detached")) {
                        try {
                            execution = CLIExecute.execute("git add .", repositoryPath);
                        } catch (Exception ex) {
                        }
                        try {
                            execution = CLIExecute.execute("git commit -m a", repositoryPath);
                        } catch (Exception ex) {
                        }
                        try {
                            execution = CLIExecute.execute("git checkout " + entity, repositoryPath);
                        } catch (Exception ex) {
                        }
                    } else {
                        throw new CheckoutException(error);
                    }
                }
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Give all commits that is merges and their parents in the form:
     * HASH[bar]PARENT1[space]PARENT2
     *
     * @param repositoryPath The path of the git repository.
     * @return a list of the merges.
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.LogException if occur any error in
     * scope of git log command.
     */
    public static List<String> getAllMerges(String repositoryPath) throws IOException, NotGitRepositoryException, LogException {
        if (isGitRepository(repositoryPath)) {
            CLIExecution execution = CLIExecute.execute("git log --all --min-parents=2 --pretty=format:%H/%P", repositoryPath);
            if (!execution.getError().isEmpty()) {
                throw new LogException(ListUtils.getTextListStringToString(execution.getError()));
            } else {
                return execution.getOutput();
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Get the the content of a file in some commit.
     *
     * @param commit The commit where the file is.
     * @param relativeFilePath The file to get the content.
     * @param repositoryPath The path of the git repository.
     * @return a list of the file's lines or null if "relativeFilePath" not
     * exist in "commit".
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.ShowException if occur any error
     * in scope of git show command.
     */
    public static List<String> getFileContentFromCommit(String commit, String relativeFilePath, String repositoryPath) throws IOException, NotGitRepositoryException, ShowException {
        if (isGitRepository(repositoryPath)) {
            CLIExecution execution = CLIExecute.execute("git show " + commit + ":" + relativeFilePath, repositoryPath);
            if (!execution.getError().isEmpty()) {
                if (execution.getErrorString().contains("exists on disk, but not in")
                        || execution.getErrorString().contains("does not exist in")) {
                    return null;
                } else {
                    throw new ShowException(ListUtils.getTextListStringToString(execution.getError()));
                }
            }
            return execution.getOutput();
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Check if a file exist in a commit.
     *
     * @param commit The commit where the file is.
     * @param relativeFilePath The file to check existence.
     * @param repositoryPath The path of the git repository.
     * @return false if "relativeFilePath" not exist in "commit", otherwise
     * return true.
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.ShowException if occur any error
     * in scope of git show command.
     */
    public static boolean fileExistInCommit(String commit, String relativeFilePath, String repositoryPath) throws IOException, NotGitRepositoryException, ShowException {
        if (isGitRepository(repositoryPath)) {
            return getFileContentFromCommit(commit, relativeFilePath, repositoryPath) != null;
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Get the URL where was cloned the project.
     *
     * @param repositoryPath The path of the git repository.
     * @return the URL where was cloned the project, can be "Unknown".
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     */
    public static String getRemoteURL(String repositoryPath) throws IOException, NotGitRepositoryException {
        if (isGitRepository(repositoryPath)) {
            String result = CLIExecute.execute("git config --get remote.origin.url", repositoryPath).getOutputString();
            if (result.equals("")) {
                return "Unknown";
            } else {
                return result.replaceAll("\n", "").replaceAll("\\.git", "");
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Return the basic info of the commit
     *
     * @param commitHash The commit to get the basic info.
     * @param repositoryPath The path of the git repository.
     * @return the basic info. Return form:<pre>
     * CommitHash
     * AuthorName
     * AuthorDate
     * CommitterName
     * CommitterDate
     * Title<pre>
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.ShowException if occur any error
     * in scope of git show command.
     */
    public static List<String> getBasicCommitInfo(String commitHash, String repositoryPath) throws IOException, NotGitRepositoryException, ShowException {
        if (isGitRepository(repositoryPath)) {
            String command = "git show " + commitHash + " --format=%H%n%an%n%at%n%cn%n%ct%n%s --no-patch";
            CLIExecution execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty()) {
                String errorMessage = ListUtils.getTextListStringToString(execution.getError());
                if (errorMessage.contains("error") || errorMessage.contains("fatal")) {
                    throw new ShowException(ListUtils.getTextListStringToString(execution.getError()));
                } else {
                    return execution.getOutput();
                }
            } else {
                return execution.getOutput();
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Find a common ancestor of the parents
     *
     * @param repositoryPath The path of the git repository.
     * @param parents the hashes of the parents
     * @return the common ancestor of the parents
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.MergeBaseException if occur any
     * error in scope of git merge-base command.
     */
    public static String mergeBase(String repositoryPath, String[] parents) throws IOException, NotGitRepositoryException, MergeBaseException {
        if (isGitRepository(repositoryPath)) {
            String command = "git merge-base ";
            for (String str : parents) {
                command = command + str + " ";
            }
            CLIExecution execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty()) {
                throw new MergeBaseException(ListUtils.getTextListStringToString(execution.getError()));
            } else {
                if (execution.getOutput().isEmpty()) {
                    return null;
                }
                return execution.getOutputString();
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * Do a merge and verify if is a conflict
     *
     * @param entity This parameter is a String that represents anything that
     * can be merged like branches and commits
     * @param repositoryPath This parameter is a String that contains the
     * directory where the command will be executed
     * @return Returns a boolean that indicates if the merge is confliting
     */
    public static boolean mergeIsConflicting(String parent1, String parent2, String repositoryPath) throws IOException, NotGitRepositoryException, CheckoutException, MergeException {
        Git.checkout(parent1, repositoryPath);
        return Git.merge(parent2, repositoryPath).toString().contains("Automatic merge failed");
    }

    /**
     *
     * This method executes the git command 'reset'. This command can be called
     * without any modifier or with one of the three, 'hard','mixed' and 'soft'
     * The command undo the last commit or merge;
     *
     * @param repositoryPath This parameter tells the command the path to the
     * repository we are dealing with
     * @param hard If this parameter is true the command will do a hard reset
     * @param mixed If this parameter is true the command will do a mixed reset
     * @param soft If this parameter is true the command will do a soft reset
     * @param document this parameter is used in case of a mixed reset and is
     * the "document" that the command will remove
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.ResetException if occur any error
     * in scope of git reset command.
     */
    public static void reset(String repositoryPath, boolean hard, boolean mixed, boolean soft, String document) throws IOException, NotGitRepositoryException, ResetException {
        if (isGitRepository(repositoryPath)) {
            String command = "git reset " + (hard ? " --hard" : "") + (mixed ? (" -- " + document) : "") + (soft ? " --soft" : "");
            CLIExecution execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty()) {
                throw new ResetException(ListUtils.getTextListStringToString(execution.getError()));
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * This method receive two commitHash and returns the difference between
     * them using an FileDiff list.
     *
     * @param repositoryPath This parameter tells the command the path to the
     * repository we are dealing with
     * @param commitSource This parameter is the commit we want to compare
     * @param commitTarget This parameter is the commit we want to compare to.
     * @param unified
     * @param unifiedSize This parameter defines how much context lines appears
     * @return return the FileDiff list
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.DiffException if occur any error
     * in scope of git diff command.
     */
    public static List<FileDiff> diff(String repositoryPath, String commitSource, String commitTarget, boolean unified, int unifiedSize) throws IOException, NotGitRepositoryException, DiffException {
        if (isGitRepository(repositoryPath)) {
            List<FileDiff> fileDiffs = new ArrayList<>();
            List<FileDiff> result = new ArrayList<>();
            FileDiff aux = new FileDiff();
            String command;
            if (!unified) {
                command = "git diff --ignore-space-at-eol " + commitSource + " " + commitTarget;
            } else {
                command = "git diff --ignore-space-at-eol --unified=" + unifiedSize + " " + commitSource + " " + commitTarget;
            }
            CLIExecution execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty()) {
                String auxWar1 = null;
                String auxWar2 = null;
                boolean bool1AuxWarning = false;
                boolean bool2AuxWarning = false;

                for (String line : execution.getError()) {
                    if (line.contains("LF will be replaced by CRLF in") || line.contains("CRLF will be replaced by LF")) {
                        auxWar1 = line;
                        bool1AuxWarning = true;
                    }
                    if (line.contains("The file will have its original line endings in your working directory")) {
                        bool2AuxWarning = true;
                        auxWar2 = line;
                    }
                }
                if (bool1AuxWarning) {
                    execution.getError().remove(auxWar1);
                }
                if (bool2AuxWarning) {
                    execution.getError().remove(auxWar2);
                }

            }
            if (!execution.getError().isEmpty()) {
                throw new DiffException(ListUtils.getTextListStringToString(execution.getError()));
            } else {
                aux.setAllMessage(execution.getOutput());
                int currentLine = 0;
                for (String line : execution.getOutput()) {
                    if (line.startsWith("difffileDiff --") && currentLine != 0) {
                        fileDiffs.add(aux);
                        aux = new FileDiff();
                    }
                    if ((line.length() == 1 && !(line.charAt(0) == '+' || line.charAt(0) == '-'))) {
                        continue;
                    }
                    if (line.length() > 2 && line.charAt(0) == '+' && line.charAt(1) == '+' && line.charAt(2) == '+' && line.charAt(3) == ' ') {
                        String c = line.substring(5);
                        if (c.endsWith("\t") || c.endsWith("\n")) {
                            c = c.substring(0, c.length() - 1);
                        }
                        aux.setFilePathTarget(c);
                    } else if (line.charAt(0) != '-' && (line.charAt(0) == '+' || line.charAt(1) == '+')) {
                        String c = line.substring(1);
                        aux.getLines().add(new LineInformation(c, LineType.ADDED, currentLine));
                    } else if (line.length() > 2 && line.charAt(0) == '-' && line.charAt(1) == '-' && line.charAt(2) == '-' && line.charAt(3) == ' ') {
                        String c = line.substring(5);
                        if (c.endsWith("\t") || c.endsWith("\n")) {
                            c = c.substring(0, c.length() - 1);
                        }
                        aux.setFilePathSource(c);
                    } else if (line.charAt(0) == '-' || line.charAt(1) == '-') {
                        String c = line.substring(1);
                        aux.getLines().add(new LineInformation(c, LineType.DELETED, currentLine));
                    } else if (line.charAt(0) == '@' && line.charAt(1) == '@') {
                        currentLine = startingLine(line);
                    }

                }
                fileDiffs.add(aux);
            }
            for (FileDiff fileDiff : fileDiffs) {
                if (!(fileDiff.getFilePathSource().equals("") && fileDiff.getFilePathTarget().equals("") && fileDiff.getLines().isEmpty())) {
                    result.add(fileDiff);
                }
            }
            return result;
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * This method receive two files and returns the difference between them,
     * using the unified command as 0, and returns the output.
     *
     * @param repositoryPath This parameter tells the command the path to the
     * repository we are dealing with
     * @param fileSource This parameter is the file we want to compare.
     * @param fileTarget This parameter is the file we want to compare to.
     * @return the result of the git command
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.DiffException if occur any error
     * in scope of git diff command.
     */
    public static List<String> auxiliarDiffFile(String repositoryPath, String fileSource, String fileTarget) throws IOException, NotGitRepositoryException, DiffException {
        if (isGitRepository(repositoryPath)) {
            String command = "git diff " + "--unified=0 --ignore-space-at-eol " + fileSource + " " + fileTarget;
            CLIExecution execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty()) {
                throw new DiffException(ListUtils.getTextListStringToString(execution.getError()));
            }
            return execution.getOutput();
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }
    }

    /**
     * This method receive two files and returns the difference between them,
     * using the "name-status" command, and returns the output.
     *
     * @param repositoryPath This parameter tells the command the path to the
     * repository we are dealing with
     * @param fileSource This parameter is the file we want to compare
     * @param fileTarget This parameter is the file we want to compare to.
     * @return List of Strings
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.DiffException if occur any error
     * in scope of git diff command.
     */
    public static List<String> auxiliarDiffStat(String repositoryPath, String fileSource, String fileTarget) throws IOException, NotGitRepositoryException, DiffException {
        if (isGitRepository(repositoryPath)) {
            String command = "git diff --unified=0 " + fileSource + " " + fileTarget + " --name-status";
            CLIExecution execution = CLIExecute.execute(command, repositoryPath);
            if (!execution.getError().isEmpty()) {
                throw new DiffException(ListUtils.getTextListStringToString(execution.getError()));
            } else {
                return execution.getOutput();
            }
        } else {
            throw new NotGitRepositoryException(repositoryPath);
        }

    }

    /**
     * Method used by "fillFileDiff" to read the diff output and get the
     * starting line of the chunk.
     *
     * @param a Line of the diff with the required starting line information.
     * @return The starting line of the diff chunk
     */
    private static int startingLine(String a) {
        if (a.contains("-")) {
            String c[];
            c = a.split("-");
            a = c[1];
            String g[];
            if (a.contains(",")) {
                g = a.split(",");
                if (g[0].contains("+")) {
                    g = g[0].split("\\+");
                    g[0] = g[0].replace(" ", "");
                }
            } else {
                g = a.split("\\+");
                g[0] = g[0].replace(" ", "");
            }
            int startingLine;
            startingLine = Integer.parseInt(g[0]);
            return startingLine;
        } else {
            String c[];
            c = a.split("\\+");
            a = c[1];
            String g[];
            if (a.contains(",")) {
                g = a.split(",");
            } else {
                g = a.split("/+");
            }
            int startingLine;
            startingLine = Integer.parseInt(g[0]);

            return startingLine;
        }
    }

    /**
     * Function that verify if the selected file source was deleted in the given
     * merge
     *
     * @param repositoryPath This parameter tells the command the path to the
     * repository we are dealing with
     * @param fileSource This parameter is the file we want to verify the status
     * @param parent This parameter is the hash of one parent of the merge
     * @param merge This parameter is the merge commit hash
     * @return true if file was deleted
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.DiffException if occur any error
     * in scope of git diff command.
     */
    public static boolean deletedFile(String repositoryPath, String fileSource, String parent, String merge) throws IOException, NotGitRepositoryException, DiffException {
        List<String> output;
        String line;
        output = Git.auxiliarDiffStat(repositoryPath, parent, merge);
        for (int i = 0; i < output.size(); i++) {
            line = output.get(i);
            if (line.startsWith("D")) {
                String c;
                c = line.substring(2);
                if (fileSource.contains(c)) {
                    return true;
                }
            }

        }
        return false;
    }

    /**
     * Function that verify if the selected file source was renamed in the given
     * merge
     *
     * @param repositoryPath This parameter tells the command the path to the
     * repository we are dealing with
     * @param fileSource This parameter is the file we want to verify the status
     * @param parent This parameter is the hash of one parent of the merge
     * @param merge This parameter is the merge commit hash
     * @return true if file was deleted
     * @throws java.io.IOException if repositoryPath not exist in your system.
     * @throws br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException if
     * repositoryPath isn't a git repository.
     * @throws br.ufjf.dcc.gmr.core.exception.DiffException if occur any error
     * in scope of git diff command.
     */
    public static boolean renamedFile(String directory, String fileSource, String parent, String merge) throws IOException, NotGitRepositoryException, DiffException {
        List<String> output;
        String line;
        output = Git.auxiliarDiffStat(directory, parent, merge);
        for (int i = 0; i < output.size(); i++) {
            line = output.get(i);
            if (line.startsWith("R")) {
                String[] c = line.split("\t");
                if (fileSource.contains(c[1])) {
                    return true;
                }
            }
        }
        return false;
    }
}
