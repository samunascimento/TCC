package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.io.IOException;
import java.util.List;

import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.vcs.Git;

public class MergesTest {
	
	public static void SearchAllConflicts(String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge{
		List<String> allMerges = Git.giveAllMerges(repositoryPath);
		String[] family = null;
		String[] parents = null;
		MergeEvent mergeEvent = null;
		List<MergeEvent> list = null;
		ConflictRegion conflictRegion = null;
		for (String merge : allMerges) {
			family = merge.split(",",2);
			mergeEvent.setChildren(family[1]);
			parents = family[0].split(" ");
			for(String parent : parents) {
				mergeEvent.addParents(parent);
			}
			Git.checkout(mergeEvent.getParents().get(0), repositoryPath);
			if(Git.mergeIsConflicting(mergeEvent.getParents().get(1), repositoryPath,false,false)) {
				
			}
			Git.mergeAbort(repositoryPath);
			
			list.add(mergeEvent);
			
		}
		
			
	}
	
}
