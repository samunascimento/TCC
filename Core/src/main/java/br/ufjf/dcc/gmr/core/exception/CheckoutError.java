package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author joaop
 */
public class CheckoutError extends Exception {
    public CheckoutError(String errorContent){
        super(errorContent);
    }
}
