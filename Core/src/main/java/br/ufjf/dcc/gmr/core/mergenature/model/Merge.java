package br.ufjf.dcc.gmr.core.mergenature.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to record commits involved in a merge and classify the type of conflict
 *
 * @author João Pedro Lima
 * @since 10-10-2020
 */
public class Merge implements Cloneable {

    private int id;
    private transient Project project;
    private Commit merge;
    private List<Commit> parents;
    private Commit ancestor;
    private List<Conflict> conflicts;
    private MergeType mergeType;

    /**
     * Normal constructor
     *
     * @param id Id for databases
     * @param project The project that the merge belongs
     * @param merge The data of the merge
     * @param parents The data of all parents
     * @param ancestor The data of the ancestor of the parents (merge base)
     * @param conflicts List of all files involved in a merge conflict
     * @param mergeType The type of the merge
     */
    public Merge(int id, Project project, Commit merge, List<Commit> parents, Commit ancestor, List<Conflict> conflicts, MergeType mergeType) {
        this.id = id;
        this.project = project;
        this.merge = merge;
        this.parents = parents;
        this.ancestor = ancestor;
        this.conflicts = conflicts;
        this.mergeType = mergeType;
    }

    /**
     * No id constructor
     *
     * @param project The project that the merge belongs
     * @param merge The data of the merge
     * @param parents The data of all parents
     * @param ancestor The data of the ancestor of the parents (merge base)
     * @param conflicts List of all files involved in a merge conflict
     * @param mergeType The type of the merge
     */
    public Merge(Project project, Commit merge, List<Commit> parents, Commit ancestor, List<Conflict> conflicts, MergeType mergeType) {
        this.project = project;
        this.merge = merge;
        this.parents = parents;
        this.ancestor = ancestor;
        this.conflicts = conflicts;
        this.mergeType = mergeType;
    }

    public Merge(Merge merge) {
        this.id = merge.getId();
        this.project = merge.getProject();
        this.merge = merge.getMerge();
        this.parents = merge.getParents();
        this.ancestor = merge.getAncestor();
        this.conflicts = merge.getConflicts();
        this.mergeType = merge.getMergeType();
    }

    public Merge() {
        this.parents = new ArrayList<>();
        this.conflicts = new ArrayList<>();
    }

    public int getNumberOfConflictRegions() {
        if (mergeType == MergeType.CONFLICTED_MERGE || mergeType == MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES) {
            int i = 0;
            for (Conflict conflict : this.getConflicts()) {
                if (conflict.getConflictRegions() != null) {
                    i += conflict.getConflictRegions().size();
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

    public Commit getMerge() {
        return merge;
    }

    public void setMerge(Commit merge) {
        this.merge = merge;
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

    public Commit getAncestor() {
        return ancestor;
    }

    public void setAncestor(Commit ancestor) {
        this.ancestor = ancestor;
    }

    public List<Conflict> getConflicts() {
        return conflicts;
    }
 
    public void setConflicts(List<Conflict> conflicts) {
        this.conflicts = conflicts;
    }

    public void addConflict(Conflict conflict) {
        this.conflicts.add(conflict);
    }

    public MergeType getMergeType() {
        return mergeType;
    }

    public void setMergeType(MergeType mergeType) {
        this.mergeType = mergeType;
    }

}
