package br.ufjf.dcc.gmr.core.exception;

/**
 * Exception that is throwed when the Hash provided by the user is invalid.
 *
 * @author Luan
 */
public class InvalidCommitHash extends Exception {

    public InvalidCommitHash() {
        super("The informed commit don't belong to the informed repository");
    }
    
    public InvalidCommitHash(String repositoryPath, String commit) {
        super("The commit" + commit + "don't belong to the repository " + repositoryPath);
    }

}
