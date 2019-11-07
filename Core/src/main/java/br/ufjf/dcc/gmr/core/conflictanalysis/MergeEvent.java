package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.util.List;

public class MergeEvent {
	
	private String hash;
	private List<String> parents;
	private List<ConflictFile> conflictFiles;
	
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
	
}
