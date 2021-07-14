package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if occurred any error in scope of git rm
 * command.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class RMException extends GitException {

    public RMException() {
    }

    public RMException(String message) {
        super(message);
    }

    public RMException(String message, Throwable cause) {
        super(message, cause);
    }

    public RMException(Throwable cause) {
        super(cause);
    }

    public RMException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
