package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if occurred any error in scope of git
 * merge-base command.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class MergeBaseException extends GitException {

    public MergeBaseException() {
    }

    public MergeBaseException(String message) {
        super(message);
    }

    public MergeBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public MergeBaseException(Throwable cause) {
        super(cause);
    }

    public MergeBaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
