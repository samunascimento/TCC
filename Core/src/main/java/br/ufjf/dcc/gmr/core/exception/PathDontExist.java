package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author Luan
 */
public class PathDontExist extends Exception {
   
    public PathDontExist(){
        super("The given path does not exist on this diff");
    }
    

}