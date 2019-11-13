package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;

public class MergesTest {
	
	public static void SearchAllConflicts(String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, InvalidCommitHash{
		List<String> allMerges = Git.giveAllMerges(repositoryPath);
		String[] family = null;
		String[] parents = null;
		MergeEvent mergeEvent = new MergeEvent();
		List<MergeEvent> list = new ArrayList<>();
		ConflictFile conflictFile = new ConflictFile();
		ConflictRegion conflictRegion = new ConflictRegion();
		List<String> conflict = new ArrayList<>();
		for (String merge : allMerges) {
			family = merge.split(",");
			mergeEvent.setHash(family[1]);
			parents = family[0].split(" ");
			for(String parent : parents) {
				mergeEvent.addParents(parent);
			}
			mergeEvent.setCommonAncestorOfParents(Git.mergeBaseCommand(repositoryPath, mergeEvent.getParents()));
			Git.checkout(mergeEvent.getParents().get(1), repositoryPath);
			if(Git.mergeIsConflicting(mergeEvent.getParents().get(0), repositoryPath,false,false)) {
				mergeEvent.setConflict(true);
				for(FileDiff fileDiff : Git.diff(repositoryPath,"","")) {
					conflictFile.setFileName(fileDiff.getFilePathSource());
					for(LineInformation line : fileDiff.getLines()) {
						conflict.add(line.toString());
					}
					for(int i = 0; i<conflict.size(); i++) {
						if(conflict.get(i).contains("+<<<<<<<")) {
							i++;
							while(!conflict.get(i).contains("+=======")) {
								conflictRegion.getV1().add(conflict.get(i));
								i++;
							}
							i++;
							while(!conflict.get(i).contains("+>>>>>>>")){
								conflictRegion.getV2().add(conflict.get(i));
								i++;
							}
							conflictFile.addConflictRegion(conflictRegion);
							conflictRegion = new ConflictRegion();
						}
					}
					mergeEvent.addConflictFiles(conflictFile);
					conflictFile = new ConflictFile();
				}
			}
			Git.mergeAbort(repositoryPath);
			Git.checkout("master", repositoryPath);
			mergeEvent.print();
			list.add(mergeEvent);
			mergeEvent = new MergeEvent();
			conflictFile = new ConflictFile();
			conflictRegion = new ConflictRegion();
			
		}
			
	}
	
}

