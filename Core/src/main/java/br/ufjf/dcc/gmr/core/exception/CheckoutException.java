package br.ufjf.dcc.gmr.core.exception;

/**
 * This exception must be released if occurred any error in scope of git
 * checkout command.
 *
 * @author João Pedro Lima
 * @since 30-05-2021
 */
public class CheckoutException extends GitException {

    public CheckoutException() {
    
    }

    public CheckoutException(String message) {
        super(message);
    }

    public CheckoutException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckoutException(Throwable cause) {
        super(cause);
    }

    public CheckoutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
