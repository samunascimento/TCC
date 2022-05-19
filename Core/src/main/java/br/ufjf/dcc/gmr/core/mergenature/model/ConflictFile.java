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
public class ConflictFile {

    public static int PARENT1_FILE = 0;
    public static int PARENT2_FILE = 1;
    public static int BOTH_FILES = 2;
    public static int UNKNOWM = 3;

    private int id;
    private String parent1FilePath;
    private String parent2FilePath;
    private String ancestorFilePath;
    private int conflictFilePath;
    private List<Chunk> chunks;
    private ConflictFileType conflictFileType;
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
     * @param conflictFilePath Indicts which file (<code>parent1FilePath</code>
     * or <code>parent2FilePath</code>) appears during the conflict
     * @param chunks A list that contains all conflict regions in a
     * file, can be empty
     * @param conflictType The type of conflict
     * @param hasOutsideAlterations Indicates if the developer who made the
     * merge did alterations outside of any conflict
     * @param hasOutsideAlterationsIgnoringFormatting Indicates if the developer
     * who made the merge did alterations that is not formatting outside of any
     * conflict
     * @param merge The merge that the conflict belongs
     */
    public ConflictFile(int id, String parent1FilePath, String parent2FilePath, String ancestorFilePath, int conflictFilePath, 
            List<Chunk> chunks, ConflictFileType conflictType, boolean hasOutsideAlterations, boolean hasOutsideAlterationsIgnoringFormatting, Merge merge) {
        this.id = id;
        this.parent1FilePath = parent1FilePath;
        this.parent2FilePath = parent2FilePath;
        this.ancestorFilePath = ancestorFilePath;
        this.conflictFilePath = conflictFilePath;
        this.chunks = chunks;
        this.conflictFileType = conflictType;
        this.hasOutsideAlterations = hasOutsideAlterations;
        this.hasOutsideAlterationsIgnoringFormatting = hasOutsideAlterationsIgnoringFormatting;
        this.merge = merge;
    }

    /**
     * No id constructor
     *
     * @param parent1FilePath The name of the file in parent 1 commit
     * @param parent2FilePath The name of the file in parent 2 commit
     * @param ancestorFilePath The name of the file in ancestor commit
     * @param conflictFilePath Indicts which file (<code>parent1FilePath</code>
     * or <code>parent2FilePath</code>) appears during the conflict
     * @param chunks A list that contains all conflict regions in a
     * file, can be empty
     * @param conflictType The type of conflict
     * @param hasOutsideAlterations Indicates if the developer who made the
     * merge did alterations outside of any conflict
     * @param hasOutsideAlterationsIgnoringFormatting Indicates if the developer
     * who made the merge did alterations that is not formatting outside of any
     * conflict
     * @param merge The merge that the conflict belongs
     */
    public ConflictFile(String parent1FilePath, String parent2FilePath, String ancestorFilePath, int conflictFilePath, List<Chunk> chunks, ConflictFileType conflictType, boolean hasOutsideAlterations, boolean hasOutsideAlterationsIgnoringFormatting, Merge merge) {
        this.parent1FilePath = parent1FilePath;
        this.parent2FilePath = parent2FilePath;
        this.ancestorFilePath = ancestorFilePath;
        this.conflictFilePath = conflictFilePath;
        this.chunks = chunks;
        this.conflictFileType = conflictType;
        this.hasOutsideAlterations = hasOutsideAlterations;
        this.hasOutsideAlterationsIgnoringFormatting = hasOutsideAlterationsIgnoringFormatting;
        this.merge = merge;
    }

    public ConflictFile(ConflictFile conflictFile) {
        this.parent1FilePath = conflictFile.getParent1FilePath();
        this.parent2FilePath = conflictFile.getParent2FilePath();
        this.ancestorFilePath = conflictFile.getAncestorFilePath();
        this.conflictFilePath = conflictFile.getIntConflictFilePath();
        this.chunks = conflictFile.getChunks();
        this.conflictFileType = conflictFile.getConflictFileType();
        this.hasOutsideAlterations = conflictFile.hasOutsideAlterations();
        this.hasOutsideAlterationsIgnoringFormatting = conflictFile.hasOutsideAlterationsIgnoringFormatting;
        this.merge = conflictFile.getMerge();
    }

    public ConflictFile() {
        this.chunks = new ArrayList<>();
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

    public int getIntConflictFilePath(){
        return conflictFilePath;
    }
    
    public String getConflictFilePath() {
        return (conflictFilePath == PARENT1_FILE || conflictFilePath == BOTH_FILES) ? getParent1FilePath() : getParent2FilePath();
    }
    
    public String getConflictFileName() {
        return (conflictFilePath == PARENT1_FILE || conflictFilePath == BOTH_FILES || conflictFilePath == UNKNOWM) ? getParent1FileName() : getParent2FileName();
    }

    public void setConflictFilePath(int conflictFilePath) {
        this.conflictFilePath = conflictFilePath;
    }
    
    public List<Chunk> getChunks() {
        return chunks;
    }

    public void setChunks(List<Chunk> chunks) {
        this.chunks = chunks;
    }

    public void addChunk(Chunk chunk) {
        this.chunks.add(chunk);
    }

    public ConflictFileType getConflictFileType() {
        return conflictFileType;
    }

    public void setConflictFileType(ConflictFileType conflictFileType) {
        this.conflictFileType = conflictFileType;
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
                + "\nConflict File Type: " + conflictFileType.toString()
                + "\nConflict Regions: " + chunks.size();
        if (hasOutsideAlterations) {
            result = result + "\nHas Outside Alterations: YES";
        } else {
            result = result + "\nHas Outside Alterations: NO";
        }
        if (hasOutsideAlterationsIgnoringFormatting) {
            result = result + "\nHas Outside Alterations Ignoring Formatting: YES";
        } else {
            result = result + "\nHas Outside Alterations Ignoring Formatting: NO";
        }
        return result;
    }

}
