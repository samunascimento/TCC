package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if was tried to execute git command in a path
 * that is not a git repository.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class NotGitRepositoryException extends GitException {

    public NotGitRepositoryException() {

    }

    public NotGitRepositoryException(String repositoryPath) {
        super("Was tried to execute git command in " + repositoryPath + " that is not a git repository.");
    }

    public NotGitRepositoryException(String repositoryPath, Throwable cause) {
        super("Was tried to execute git command in " + repositoryPath + " that is not a git repository.", cause);
    }

    public NotGitRepositoryException(Throwable cause) {
        super(cause);
    }

    public NotGitRepositoryException(String repositoryPath, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super("Was tried to execute git command in " + repositoryPath + " that is not a git repository.", cause, enableSuppression, writableStackTrace);
    }

}
