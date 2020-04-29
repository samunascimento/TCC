package br.ufjf.dcc.gmr.core.exception;

/**
 * Exception that is throwed when the Path provided by the user is invalid.
 *
 * @author Luan
 */
public class PathDontExist extends Exception {

    public PathDontExist() {
        super("The given path does not exist on this diff");
    }

}
