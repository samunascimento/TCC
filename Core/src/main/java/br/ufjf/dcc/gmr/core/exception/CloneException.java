
package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if occurred any error in scope of git
 * clone command.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class CloneException extends GitException {

    public CloneException() {
    
    }

    public CloneException(String message) {
        super(message);
    }

    public CloneException(String message, Throwable cause) {
        super(message, cause);
    }

    public CloneException(Throwable cause) {
        super(cause);
    }

    public CloneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}