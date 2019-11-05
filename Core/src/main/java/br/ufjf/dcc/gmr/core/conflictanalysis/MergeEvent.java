package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.util.List;

public class MergeEvent {
	private String children;
	private List<String> parents;
	public String getChildren() {
		return children;
	}
	public void setChildren(String children) {
		this.children = children;
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
	public void setConflictRegion(List<ConflictRegion> conflictRegion) {
		this.conflictRegion = conflictRegion;
	}
	private List<ConflictRegion> conflictRegion;
}
