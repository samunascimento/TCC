package br.ufjf.dcc.gmr.core.exception;

/**
 * 
 * @author felip
 *
 */

public class RemoteRefBranchNotFound extends Exception {
	
	public RemoteRefBranchNotFound() {
		super("Couldn't find remote ref branch!");
	}
}
