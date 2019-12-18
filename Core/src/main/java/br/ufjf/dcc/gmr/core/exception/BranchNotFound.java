package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author joaop
 */
public class BranchNotFound extends Exception {
    public BranchNotFound(String branchName){
        super("error: branch '" + branchName +"' not found");
    }    
}
