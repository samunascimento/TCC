package br.ufjf.dcc.gmr.core.exception;

public class HasNoUpstreamBranch extends Exception{
	public HasNoUpstreamBranch() {
		super("The current branch master has no upstream branch.\n"
			+ " To push current branch and set the remote  as upstream, use \n"
			+ " git push --set-upstream origin master");
	}

}
