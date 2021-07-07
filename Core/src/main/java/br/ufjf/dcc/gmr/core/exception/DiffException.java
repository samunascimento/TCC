package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if occurred any error in scope of git diff
 * command.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class DiffException extends GitException {

    public DiffException() {
        
    }

    public DiffException(String message) {
        super(message);
    }

    public DiffException(String message, Throwable cause) {
        super(message, cause);
    }

    public DiffException(Throwable cause) {
        super(cause);
    }

    public DiffException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
