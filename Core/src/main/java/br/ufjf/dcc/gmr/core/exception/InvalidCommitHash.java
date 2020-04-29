package br.ufjf.dcc.gmr.core.exception;

/**
 * Exception that is throwed when the Hash provided by the user is invalid.
 *
 * @author Luan
 */
public class InvalidCommitHash extends Exception {

    public InvalidCommitHash() {
        super("O commit informado não existe");
    }
}
