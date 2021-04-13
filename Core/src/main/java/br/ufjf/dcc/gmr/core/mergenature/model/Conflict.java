package br.ufjf.dcc.gmr.core.mergenature.model;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to record basic info about conflicts in merge
 *
 * @author João Pedro Lima
 * @since 09-11-2020
 */
public class Conflict {

    private int id;
    private String parent1FilePath;
    private String parent2FilePath;
    private String ancestorFilePath;
    private List<ConflictRegion> conflictRegions;
    private ConflictType conflictType;
    private boolean hasOutsideAlterations;
    private boolean hasOutsideAlterationsIgnoringFormatting;
    private transient Merge merge;

    /**
     * Normal constructor
     *
     * @param id Id for databases
     * @param parent1FilePath The name of the file in parent 1 commit
     * @param parent2FilePath The name of the file in parent 2 commit
     * @param ancestorFilePath The name of the file in ancestor commit
     * @param conflictRegions A list that contains all conflict regions in a
     * file, can be empty
     * @param conflictType The type of conflict
     * @param hasOutsideAlterations Indicates if the developer who made the
     * merge did alterations outside of any conflict
     * @param hasOutsideAlterationsIgnoringFormatting Indicates if the developer
     * who made the merge did alterations that is not formatting outside of any
     * conflict
     * @param merge The merge that the conflict belongs
     */
    public Conflict(int id, String parent1FilePath, String parent2FilePath, String ancestorFilePath, List<ConflictRegion> conflictRegions, ConflictType conflictType, boolean hasOutsideAlterations, boolean hasOutsideAlterationsIgnoringFormatting, Merge merge) {
        this.id = id;
        this.parent1FilePath = parent1FilePath;
        this.parent2FilePath = parent2FilePath;
        this.ancestorFilePath = ancestorFilePath;
        this.conflictRegions = conflictRegions;
        this.conflictType = conflictType;
        this.hasOutsideAlterations = hasOutsideAlterations;
        this.hasOutsideAlterationsIgnoringFormatting = hasOutsideAlterationsIgnoringFormatting;
        this.merge = merge;
    }

    public Conflict(String parent1FilePath, String parent2FilePath, String ancestorFilePath, List<ConflictRegion> conflictRegions, ConflictType conflictType, boolean hasOutsideAlterations, boolean hasOutsideAlterationsIgnoringFormatting, Merge merge) {
        this.parent1FilePath = parent1FilePath;
        this.parent2FilePath = parent2FilePath;
        this.ancestorFilePath = ancestorFilePath;
        this.conflictRegions = conflictRegions;
        this.conflictType = conflictType;
        this.hasOutsideAlterations = hasOutsideAlterations;
        this.hasOutsideAlterationsIgnoringFormatting = hasOutsideAlterationsIgnoringFormatting;
        this.merge = merge;
    }

    public Conflict(Conflict conflict) {
        this.parent1FilePath = conflict.getParent1FilePath();
        this.parent2FilePath = conflict.getParent2FilePath();
        this.ancestorFilePath = conflict.getAncestorFilePath();
        this.conflictRegions = conflict.getConflictRegions();
        this.conflictType = conflict.getConflictType();
        this.hasOutsideAlterations = conflict.hasOutsideAlterations();
        this.hasOutsideAlterationsIgnoringFormatting = conflict.hasOutsideAlterationsIgnoringFormatting;
        this.merge = conflict.getMerge();
    }

    public Conflict() {
        this.conflictRegions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParent1FilePath() {
        if (parent1FilePath == null) {
            return "Absent";
        } else {
            return parent1FilePath;
        }
    }

    public String getParent1FileName() {
        if (parent1FilePath == null) {
            return "Absent";
        } else {
            if (parent1FilePath.endsWith("/")) {
                return Paths.get(parent1FilePath).getFileName().toString() + "/";
            } else {
                return Paths.get(parent1FilePath).getFileName().toString();
            }
        }
    }

    public void setParent1FilePath(String parent1FilePath) {
        this.parent1FilePath = parent1FilePath;
    }

    public String getParent2FilePath() {
        if (parent2FilePath == null) {
            return "Absent";
        } else {
            return parent2FilePath;
        }
    }

    public String getParent2FileName() {
        if (parent2FilePath == null) {
            return "Absent";
        } else {
            if (parent2FilePath.endsWith("/")) {
                return Paths.get(parent2FilePath).getFileName().toString() + "/";
            } else {
                return Paths.get(parent2FilePath).getFileName().toString();
            }
        }
    }

    public void setParent2FilePath(String parent2FilePath) {
        this.parent2FilePath = parent2FilePath;
    }

    public String getAncestorFilePath() {
        if (ancestorFilePath == null) {
            return "Absent";
        } else {
            return ancestorFilePath;
        }
    }

    public String getAncestorFileName() {
        if (ancestorFilePath == null) {
            return "Absent";
        } else {
            if (ancestorFilePath.endsWith("/")) {
                return Paths.get(ancestorFilePath).getFileName().toString() + "/";
            } else {
                return Paths.get(ancestorFilePath).getFileName().toString();
            }
        }
    }

    public void setAncestorFilePath(String ancestorFilePath) {
        this.ancestorFilePath = ancestorFilePath;
    }

    public List<ConflictRegion> getConflictRegions() {
        return conflictRegions;
    }

    public void setConflictRegions(List<ConflictRegion> conflictRegions) {
        this.conflictRegions = conflictRegions;
    }

    public void addConflictRegion(ConflictRegion conflictRegion) {
        this.conflictRegions.add(conflictRegion);
    }

    public ConflictType getConflictType() {
        return conflictType;
    }

    public void setConflictType(ConflictType conflictType) {
        this.conflictType = conflictType;
    }

    public boolean hasOutsideAlterations() {
        return hasOutsideAlterations;
    }

    public void setHasOutsideAlterations(boolean hasOutsideAlterations) {
        this.hasOutsideAlterations = hasOutsideAlterations;
    }

    public boolean hasOutsideAlterationsIgnoringFormatting() {
        return hasOutsideAlterationsIgnoringFormatting;
    }

    public void setHasOutsideAlterationsIgnoringFormatting(boolean hasOutsideAlterationsIgnoringFormatting) {
        this.hasOutsideAlterationsIgnoringFormatting = hasOutsideAlterationsIgnoringFormatting;
    }

    public Merge getMerge() {
        return merge;
    }

    public void setMerge(Merge merge) {
        this.merge = merge;
    }

    @Override
    public String toString() {
        String result = "Parent 1's file: " + getParent1FilePath()
                + "\nParent 2's file: " + getParent2FilePath()
                + "\nAncestor's file: " + getAncestorFilePath()
                + "\nConflict Type: " + conflictType.toString()
                + "\nConflict Regions: " + conflictRegions.size();
        if(hasOutsideAlterations){
            result = result + "\nHas Outside Alterations: YES";
        } else {
            result = result + "\nHas Outside Alterations: NO";
        }
        if(hasOutsideAlterationsIgnoringFormatting){
            result = result + "\nHas Outside Alterations Ignoring Formatting: YES";
        } else {
            result = result + "\nHas Outside Alterations Ignoring Formatting: NO";
        }
        return result;
    }

}
