package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author luand
 */
public class InvalidCommitHash extends Exception {


    public InvalidCommitHash() {
        super("O commit informado não existe");
    }
}
