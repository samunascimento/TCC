package br.ufjf.dcc.gmr.core.mergenature.model;

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
    private Merge merge;
    
    /**
     * Normal constructor
     * @param id                    Id for databases
     * @param parent1FilePath       The name of the file in parent 1 commit
     * @param parent2FilePath       The name of the file in parent 2 commit
     * @param ancestorFilePath      The name of the file in ancestor commit
     * @param conflictRegions       A list that contains all conflict regions
     *                              in a file, can be empty
     * @param conflictType          The type of conflict
     * @param merge                 The merge that the conflict belongs
     */
    public Conflict(int id, String parent1FilePath, String parent2FilePath, String ancestorFilePath, List<ConflictRegion> conflictRegions, ConflictType conflictType, Merge merge) {
        this.id = id;
        this.parent1FilePath = parent1FilePath;
        this.parent2FilePath = parent2FilePath;
        this.ancestorFilePath = ancestorFilePath;
        this.conflictRegions = conflictRegions;
        this.conflictType = conflictType;
        this.merge = merge;
    }
    
    public Conflict(String parent1FilePath, String parent2FilePath, String ancestorFilePath, List<ConflictRegion> conflictRegions, ConflictType conflictType, Merge merge) {
        this.parent1FilePath = parent1FilePath;
        this.parent2FilePath = parent2FilePath;
        this.ancestorFilePath = ancestorFilePath;
        this.conflictRegions = conflictRegions;
        this.conflictType = conflictType;
        this.merge = merge;
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
        return parent1FilePath;
    }

    public void setParent1FilePath(String parent1FilePath) {
        this.parent1FilePath = parent1FilePath;
    }

    public String getParent2FilePath() {
        return parent2FilePath;
    }

    public void setParent2FilePath(String parent2FilePath) {
        this.parent2FilePath = parent2FilePath;
    }

    public String getAncestorFilePath() {
        return ancestorFilePath;
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

    public ConflictType getConflictType() {
        return conflictType;
    }

    public void setConflictType(ConflictType conflictType) {
        this.conflictType = conflictType;
    }

    public Merge getMerge() {
        return merge;
    }

    public void setMerge(Merge merge) {
        this.merge = merge;
    }
    
    
    @Override
    public String toString() {
        return "ID: " + id
                + "\nPARENT 1 FILE PATH: " + parent1FilePath
                + "\nPARENT 2 FILE PATH: " + parent2FilePath
                + "\nANCESTOR FILE PATH: " + ancestorFilePath
                + "\nCONFLICT TYPE: " + conflictType.toString();
    }
}
