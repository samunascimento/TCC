package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.io.IOException;
import java.util.List;

import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;

public class MergesTest {
	
	public static void SearchAllConflicts(String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository{
		List<String> allMerges = Git.giveAllMerges(repositoryPath);
		String[] family = null;
		String[] parents = null;
		MergeEvent mergeEvent = null;
		List<MergeEvent> list = null;
		for (String merge : allMerges) {
			family = merge.split(",",2);
			mergeEvent.setChildren(family[1]);
			parents = family[0].split(" ");
			for(String parent : parents) {
				mergeEvent.addParents(parent);
			}
			
			list.add(mergeEvent);
			
		}
		
			
	}
	
}
