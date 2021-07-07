package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception is the superclass of all git exceptions or errors. Must be
 * released if happen any git error.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class GitException extends Exception {

    public GitException() {

    }

    public GitException(String message) {
        super(message);
    }

    public GitException(String message, Throwable cause) {
        super(message, cause);
    }

    public GitException(Throwable cause) {
        super(cause);
    }

    public GitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
