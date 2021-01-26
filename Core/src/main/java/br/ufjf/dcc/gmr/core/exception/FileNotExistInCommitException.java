package br.ufjf.dcc.gmr.core.exception;

/**
 * The exception to operations that use a file that doesn't exist in the current
 * commit, if the user wants to catch it, and the file doesn't exist in the
 * specified commit, use this exception.
 *
 * @author João Pedro Lima
 * @since 19-01-2021
 */
public class FileNotExistInCommitException extends Exception {

    public FileNotExistInCommitException(String commit, String filePathProjectAsRoot, String repositoryPath) {
        super("The file " + filePathProjectAsRoot + " doesn't exist in " + commit + " of project located in " + repositoryPath + "\n");
    }

    public FileNotExistInCommitException(String commit, String filePathProjectAsRoot) {
        super("The file " + filePathProjectAsRoot + " doesn't exist in " + commit + "\n");
    }

    public FileNotExistInCommitException(String message) {
        super(message + "\n");
    }

    public FileNotExistInCommitException() {
        super("A file doesn't exist in some commit\n");
    }

}
