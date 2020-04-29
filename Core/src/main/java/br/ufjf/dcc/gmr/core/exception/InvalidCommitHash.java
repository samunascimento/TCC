package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author Luan
 */
public class InvalidCommitHash extends Exception {

    /**
     * Exception that is throwed when the Hash provided by the user is invalid.
     */
    public InvalidCommitHash() {
        super("O commit informado não existe");
    }
}
