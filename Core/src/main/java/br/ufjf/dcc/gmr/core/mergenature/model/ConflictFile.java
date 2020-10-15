package br.ufjf.dcc.gmr.core.mergenature.model;

import java.util.List;

/**
 * Class to record basic info of file or files involved in a merge
 *
 * @author João Pedro Lima
 * @since 11-10-2020
 */
public class ConflictFile {

    private int id;
    private Merge merge;
    private String filePath;
    private String renamedFilePath;
    private List<ConflictRegion> conflictRegions;
    
    /**
     * 
     * @param id                    Id for databases
     * @param merge                 The merge that the file belongs
     * @param filePath              The file, that belongs to parent 1, involved 
     *                              in a conflict
     * @param renamedFilePath       The file, that belongs to parent 2, involved
     *                              in a conflict, can be null if equals filePath
     * @param conflictRegions       List of all regions in a file involved in a
     *                              conflict file
     */
    public ConflictFile(int id, Merge merge, String filePath, String renamedFilePath, List<ConflictRegion> conflictRegions) {
        this.id = id;
        this.merge = merge;
        this.filePath = filePath;
        this.renamedFilePath = renamedFilePath;
        this.conflictRegions = conflictRegions;
    }

    public ConflictFile(Merge merge, String filePath, String renamedFilePath, List<ConflictRegion> conflictRegions) {
        this.merge = merge;
        this.filePath = filePath;
        this.renamedFilePath = renamedFilePath;
        this.conflictRegions = conflictRegions;
    }

    public ConflictFile() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Merge getMerge() {
        return merge;
    }

    public void setMerge(Merge merge) {
        this.merge = merge;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getRenamedFilePath() {
        return renamedFilePath;
    }

    public void setRenamedFilePath(String renamedFilePath) {
        this.renamedFilePath = renamedFilePath;
    }

    public List<ConflictRegion> getConflictRegions() {
        return conflictRegions;
    }

    public void setConflictRegions(List<ConflictRegion> conflictRegions) {
        this.conflictRegions = conflictRegions;
    }

}
