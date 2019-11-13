package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.util.ArrayList;
import java.util.List;

import br.ufjf.dcc.gmr.core.vcs.Git;

public class MergeEvent {
	
	private String hash;
	private List<String> parents;
	private List<ConflictFile> conflictFiles;
	private String commonAncestorOfParents;
	private boolean isConflict = false;
	
	MergeEvent(){
		this.parents = new ArrayList<>();
		conflictFiles = new ArrayList<>();
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
			System.out.println("Parent " + (i+1) + ": " + parents.get(i));
		}
		
		System.out.println("Common Ancestor of Parents: " + commonAncestorOfParents);
		if(isConflict) {
			System.out.println("Is Conflict\nConflicts:\n");
			for(ConflictFile file : this.conflictFiles) {
				System.out.println("File Name: " + file.getFileName());
				for(int i = 0; i < file.getConflictRegion().size(); i++) {
					System.out.println("Conflitct " + (i+1) + "\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
					for(String v : file.getConflictRegion().get(i).getV1()) {
						System.out.println(v);
					}
					System.out.println("==================================================");
					for(String v : file.getConflictRegion().get(i).getV2()) {
						System.out.println(v);
					}
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
				}
			}
		} else {
			System.out.println("Not is Conflict");
		}
		
	}
	public String getCommonAncestorOfParents() {
		return commonAncestorOfParents;
	}
	public void setCommonAncestorOfParents(String commonAncestorOfParents) {
		this.commonAncestorOfParents = commonAncestorOfParents;
	}
	public boolean isConflict() {
		return isConflict;
	}
	public void setConflict(boolean isConflict) {
		this.isConflict = isConflict;
	}
	
	
}
