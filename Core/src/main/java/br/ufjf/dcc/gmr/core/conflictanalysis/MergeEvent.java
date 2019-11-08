package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.util.ArrayList;
import java.util.List;

import br.ufjf.dcc.gmr.core.vcs.Git;

public class MergeEvent {
	
	private String hash;
	private List<String> parents;
	private List<ConflictFile> conflictFiles;
	private String commonAncestorOfParents;
	
	MergeEvent(){
		this.parents = new ArrayList<>();
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public List<String> getParents() {
		return parents;
	}
	public void addParents(String parent) {
		parents.add(parent);
	}
	public List<ConflictFile> getConflictFiles() {
		return conflictFiles;
	}
	public void setConflictFiles(List<ConflictFile> conflictFiles) {
		this.conflictFiles = conflictFiles;
	}
	public void addConflictFiles(ConflictFile conflictFiles) {
		this.conflictFiles.add(conflictFiles);
	}
	public void print() {
		System.out.println("*************Merge*************");
		System.out.println("Hash: " + hash );
		for(int i = 0; i < parents.size(); i++) {
			System.out.println("Parent " + i + ": " + parents.get(i));
		}
		
		System.out.println("Common Ancestor of Parents: " + commonAncestorOfParents + "\n*******************************\n");
	}
	public String getCommonAncestorOfParents() {
		return commonAncestorOfParents;
	}
	public void setCommonAncestorOfParents(String commonAncestorOfParents) {
		this.commonAncestorOfParents = commonAncestorOfParents;
	}
	
}
