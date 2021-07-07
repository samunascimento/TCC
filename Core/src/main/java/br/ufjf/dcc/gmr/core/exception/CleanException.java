package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if occurred any error in scope of git clean
 * command.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class CleanException extends GitException {

    public CleanException() {
    
    }

    public CleanException(String message) {
        super(message);
    }

    public CleanException(String message, Throwable cause) {
        super(message, cause);
    }

    public CleanException(Throwable cause) {
        super(cause);
    }

    public CleanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
