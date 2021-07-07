package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if occurred any error in scope of git reset
 * command.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class ResetException extends GitException {

    public ResetException() {
    }

    public ResetException(String message) {
        super(message);
    }

    public ResetException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResetException(Throwable cause) {
        super(cause);
    }

    public ResetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
