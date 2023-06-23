package br.ufjf.dcc.gmr.core.mergenature.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to record commits involved in a mergeCommit and classify the type of
 * conflict
 *
 * @author João Pedro Lima
 * @since 10-10-2020
 */
public class Merge {

    private int id;
    private transient Project project;
    private Commit mergeCommit;
    private List<Commit> parents;
    private Commit mergeBase;
    private List<ConflictFile> conflictFiles;
    private MergeType mergeType;
    private List<FileOA> fileOAs;
    private int numberOfAlterations;
    private String error;
    public static String NO_ERROR = "No error";

    /**
     * Normal constructor
     *
     * @param id Id for databases
     * @param project The project that the mergeCommit belongs
     * @param mergeCommit The data of the mergeCommit
     * @param parents The data of all parents
     * @param mergeBase The data of the mergeBase of the parents (mergeCommit
     * base)
     * @param conflicts List of all files involved in a mergeCommit conflict
     * @param mergeType The type of the mergeCommit
     */
    public Merge(int id, Project project, Commit mergeCommit, List<Commit> parents, Commit mergeBase, List<ConflictFile> conflicts, MergeType mergeType, List<FileOA> fileOAs, int numberOfAlterations) {
        this.id = id;
        this.project = project;
        this.mergeCommit = mergeCommit;
        this.parents = parents;
        this.mergeBase = mergeBase;
        this.conflictFiles = conflicts;
        this.mergeType = mergeType;
        this.fileOAs = fileOAs;
        this.numberOfAlterations = numberOfAlterations;
        this.error = null;
    }

    /**
     * No id constructor
     *
     * @param project The project that the mergeCommit belongs
     * @param mergeCommit The data of the mergeCommit
     * @param parents The data of all parents
     * @param mergeBase The data of the mergeBase of the parents (mergeCommit
     * base)
     * @param conflicts List of all files involved in a mergeCommit conflict
     * @param mergeType The type of the mergeCommit
     */
    public Merge(Project project, Commit mergeCommit, List<Commit> parents, Commit mergeBase, List<ConflictFile> conflicts, MergeType mergeType, List<FileOA> fileOAs, int numberOfAlterations) {
        this.project = project;
        this.mergeCommit = mergeCommit;
        this.parents = parents;
        this.mergeBase = mergeBase;
        this.conflictFiles = conflicts;
        this.mergeType = mergeType;
        this.fileOAs = fileOAs;
        this.numberOfAlterations = numberOfAlterations;
        this.error = null;
    }

    public Merge(Merge merge) {
        this.id = merge.getId();
        this.project = merge.getProject();
        this.mergeCommit = merge.getMergeCommit();
        this.parents = merge.getParents();
        this.mergeBase = merge.getMergeBase();
        this.conflictFiles = merge.getConflictFiles();
        this.mergeType = merge.getMergeType();
        this.fileOAs = merge.getFileOAs();
        this.numberOfAlterations = merge.getNumberOfAlterations();
        this.error = null;
    }

    public Merge() {
        this.parents = new ArrayList<>();
        this.conflictFiles = new ArrayList<>();
        this.fileOAs = new ArrayList<>();
        this.numberOfAlterations = 0;
        this.error = null;
    }

    public Merge(String error) {
        this.parents = new ArrayList<>();
        this.conflictFiles = new ArrayList<>();
        this.fileOAs = new ArrayList<>();
        this.numberOfAlterations = -1;
        this.error = error;
    }

    public int getNumberOfConflictRegions() {
        if (mergeType == MergeType.CONFLICTED_MERGE || mergeType == MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES) {
            int i = 0;
            for (ConflictFile conflict : this.getConflictFiles()) {
                if (conflict.getChunks() != null) {
                    i += conflict.getChunks().size();
                }
            }
            return i;
        } else {
            return 0;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Commit getMergeCommit() {
        return mergeCommit;
    }

    public void setMergeCommit(Commit mergeCommit) {
        this.mergeCommit = mergeCommit;
    }

    public List<Commit> getParents() {
        return parents;
    }

    public void setParents(List<Commit> parents) {
        this.parents = parents;
    }

    public void addParent(Commit parent) {
        this.parents.add(parent);
    }

    public Commit getMergeBase() {
        return mergeBase;
    }

    public void setMergeBase(Commit mergeBase) {
        this.mergeBase = mergeBase;
    }

    public List<ConflictFile> getConflictFiles() {
        return conflictFiles;
    }

    public void setConflictFiles(List<ConflictFile> conflictFiles) {
        this.conflictFiles = conflictFiles;
    }

    public void addConflictFile(ConflictFile conflictFile) {
        this.conflictFiles.add(conflictFile);
    }

    public MergeType getMergeType() {
        return mergeType;
    }

    public void setMergeType(MergeType mergeType) {
        this.mergeType = mergeType;
    }

    public List<FileOA> getFileOAs() {
        return fileOAs;
    }

    public void setFileOAs(List<FileOA> fileOAs) {
        this.fileOAs = fileOAs;
    }

    public void addFileOA(FileOA fileOA) {

        this.fileOAs.add(fileOA);
    }

    public int getNumberOfAlterations() {
        return numberOfAlterations;
    }

    public void setNumberOfAlterations(int numberOfAlterations) {
        this.numberOfAlterations = numberOfAlterations;
    }

    public String getError() {
        if (this.error == null) {
            return this.NO_ERROR;
        } else {
            return error;
        }
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean hasOutOfMemory() {
        for (ConflictFile conflictFile : conflictFiles) {
            if (conflictFile.isOutOfMemory()) {
                return true;
            }
        }
        return false;
    }

    public String getOAString() {
        String result = "";
        for (FileOA fileOA : this.fileOAs) {
            result += fileOA.getFilePath() + "\n";
            if (fileOA.getAlterations() == null) {
                result += "Impossible to get the outside alterations, some context was altered!\n\n";
            } else {
                for (Alteration alteration : fileOA.getAlterations()) {
                    result += (alteration.isAddition() ? "+  " : "-  ") + alteration.getContent() + "\n";
                }
                result += "\n\n";
            }
        }
        return result;
    }

}
