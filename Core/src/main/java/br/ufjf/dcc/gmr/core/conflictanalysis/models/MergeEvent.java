package br.ufjf.dcc.gmr.core.conflictanalysis.models;

import java.util.ArrayList;
import java.util.List;


public class MergeEvent {

    private String hash;
    private List<String> parents;
    private List<ConflictFile> conflictFiles;
    private String commonAncestorOfParents;
    private boolean isConflict = false;

    protected MergeEvent() {
        this.hash = "";
        this.commonAncestorOfParents = "";
        this.parents = new ArrayList<>();
        conflictFiles = new ArrayList<>();
    }

    public String getHash() {
        return hash;
    }

    protected void setHash(String hash) {
        this.hash = hash;
    }

    public List<String> getParents() {
        return parents;
    }

    protected void addParents(String parent) {
        parents.add(parent);
    }

    public List<ConflictFile> getConflictFiles() {
        return conflictFiles;
    }

    protected void setConflictFiles(List<ConflictFile> conflictFiles) {
        this.conflictFiles = conflictFiles;
    }

    protected void addConflictFiles(ConflictFile conflictFiles) {
        this.conflictFiles.add(conflictFiles);
    }

    public void print() {
        int c ;
        System.out.println("***************************************Merge***************************************");
        System.out.println("Hash: " + hash);
        for (int i = 0; i < parents.size(); i++) {
            System.out.println("Parent " + (i + 1) + ": " + parents.get(i));
        }

        System.out.println("Common Ancestor of Parents: " + commonAncestorOfParents);
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
                        for (String line : region.getAfterContext()) {
                            System.out.println("\t\t" + line);
                        }
                        System.out.println("\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< (" + region.getBeginLine() + ")");
                        for (String line : region.getV1()) {
                            System.out.println("\t\t\t" + line);
                        }
                        System.out.println("\t\t============================== (" + region.getSeparatorLine() + ")");
                        for (String line : region.getV2()) {
                            System.out.println("\t\t\t" + line);
                        }
                        System.out.println("\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> (" + region.getEndLine() + ")");
                        for (String line : region.getBeforeContext()) {
                            System.out.println("\t\t" + line);
                        }
                        System.out.println("\t###################################################\n\n");
                    }
                }
            }
            /*for (SpecialConflictFile spc : this.specialConflictFiles) {
                System.out.println("\tFile Name: " + spc.getFileName() + "\n\t\tHas not been"
                        + " merged as it has been renamed or deleted.");
            }*/
        } else {
            System.out.println("Not is Conflict");
        }
        System.out.println("***********************************************************************************");

    }

    public String getCommonAncestorOfParents() {
        return commonAncestorOfParents;
    }

    protected void setCommonAncestorOfParents(String commonAncestorOfParents) {
        this.commonAncestorOfParents = commonAncestorOfParents;
    }

    public boolean isConflict() {
        return isConflict;
    }

    protected void setConflict(boolean isConflict) {
        this.isConflict = isConflict;
    }

}
