package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.util.List;

public class MergeEvent {
	
	private String hash;
	private List<String> parents;
	private List<ConflictRegion> conflictRegion;
	private List<String> files;
	
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
	public List<ConflictRegion> getConflictRegion() {
		return conflictRegion;
	}
	public void addConflictRegion(ConflictRegion conflictRegion) {
		this.conflictRegion.add(conflictRegion);
	}
	public List<String> getFiles() {
		return files;
	}
	public void addFiles(String files) {
		this.files.add(files);
	}
	void clearAllAttributes() {
		this.hash = null;
		this.files.clear();
		this.conflictRegion.clear();
		this.parents.clear();
	}
}
