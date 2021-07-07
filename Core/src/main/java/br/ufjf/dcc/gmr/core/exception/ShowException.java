package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if occurred any error in scope of git show
 * command.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class ShowException extends GitException {

    public ShowException() {
    
    }

    public ShowException(String message) {
        super(message);
    }

    public ShowException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShowException(Throwable cause) {
        super(cause);
    }

    public ShowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
