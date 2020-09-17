package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.util.List;

public class MergeEvent {

    private CommitData hash;
    private List<CommitData> parents;
    private List<ConflictFile> conflictFiles;
    private CommitData commonAncestorOfParents;
    private boolean isConflict;

    public MergeEvent(CommitData hash, List<CommitData> parents, List<ConflictFile> conflictFiles, CommitData commonAncestorOfParents) {
        this.hash = hash;
        this.parents = parents;
        this.conflictFiles = conflictFiles;
        this.commonAncestorOfParents = commonAncestorOfParents;
        this.isConflict = !conflictFiles.isEmpty();
    }

    //---------------------------------------------------------------------------
    public MergeEvent() {

    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsConflict(boolean isConflict) {
        this.isConflict = isConflict;
    }

    //--------------------------------------------------------------------------
    public CommitData getHash() {
        return hash;
    }

    public List<CommitData> getParents() {
        return parents;
    }

    public List<ConflictFile> getConflictFiles() {
        return conflictFiles;
    }

    public CommitData getCommonAncestorOfParents() {
        return commonAncestorOfParents;
    }

    public boolean isConflict() {
        return isConflict;
    }

    public void print() {
        int c;
        System.out.println("***************************************Merge***************************************");
        System.out.println("Hash: " + hash.getCommitHash());
        for (int i = 0; i < parents.size(); i++) {
            System.out.println("Parent " + (i + 1) + ": " + parents.get(i).getCommitHash());
        }

        System.out.println("Common Ancestor of Parents: " + commonAncestorOfParents.getCommitHash());
        if (isConflict) {
            System.out.println("Is Conflict\nConflicts:\n");
            for (ConflictFile file : this.conflictFiles) {
                System.out.println("\tFile Name: " + file.getFileName() + "\n");
                if (file.getConflictRegion().isEmpty()) {
                    System.out.println("\t\t" + file.getFileName() + " has not been"
                            + " merged as it has been renamed or deleted.");
                } else {
                    c = 0;
                    for (ConflictRegion region : file.getConflictRegion()) {
                        c++;
                        System.out.println("\t#################Conflict " + c + "#################");
                        System.out.println(region.getConflictForm());
                        System.out.println("\t###################################################\n\n");
                    }
                }
            }
        } else {
            System.out.println("Not is Conflict");
        }
        System.out.println("***********************************************************************************");

    }

    public int getNumberOfConflictRegions() {
        if (this.isConflict) {
            int i = 0;
            for (ConflictFile file : this.conflictFiles) {
                if (file.getConflictRegion() != null) {
                    i += file.getConflictRegion().size();
                }
            }
            return i;
        } else {
            return 0;
        }
    }

}
