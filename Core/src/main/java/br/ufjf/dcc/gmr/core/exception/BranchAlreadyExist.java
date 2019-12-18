package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author joaop
 */
public class BranchAlreadyExist extends Exception {
    public BranchAlreadyExist(String branchName){
        super("fatal: A branch named '" + branchName + "' already exists.");
    }
    
}
