package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author Luan
 */
public class PathDontExist extends Exception {

    /**
     * Exception that is throwed when the Path provided by the user is invalid.
     */
    public PathDontExist() {
        super("The given path does not exist on this diff");
    }

}
