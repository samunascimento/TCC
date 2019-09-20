package br.ufjf.dcc.gmr.core.exception;

public class LocalRepositoryNotAGitRepository extends Exception{
	public LocalRepositoryNotAGitRepository() {
		super("not a git repository");
	}
}
