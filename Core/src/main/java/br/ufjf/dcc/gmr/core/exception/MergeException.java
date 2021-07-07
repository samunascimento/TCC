package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if occurred any error in scope of git merge
 * command.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class MergeException extends GitException {

    public MergeException() {
        
    }

    public MergeException(String message) {
        super(message);
    }

    public MergeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MergeException(Throwable cause) {
        super(cause);
    }

    public MergeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
