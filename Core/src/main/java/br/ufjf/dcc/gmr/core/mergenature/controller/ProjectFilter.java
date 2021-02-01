package br.ufjf.dcc.gmr.core.mergenature.controller;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 01-02-2021
 */
public class ProjectFilter {
    
    public final int DEFAULT_ORDER = 0;
    public final int CONFLICT_REGIONS_ORDER = 1;
    public final int CONFLICTS_ORDER = 2;
    public final int CHRONOLOGICAL_ORDER = 3;
    
    public final int ASCENDING_ORDER = 0;
    public final int DESCENDING_ORDER = 1;

    public boolean conflictedMerge;
    public boolean notConflictedMerge;
    public boolean octopusMerge;
    public boolean conflictedMergeOfUnrelatedHistories;
    public boolean notConflictedMergeOfUnrelatedHistories;
    public boolean octopusMergeOfUnrelatedHistories;

    public boolean content;
    public boolean coincidenceAdding;
    public boolean fileRename;
    public boolean directoryRename;
    public boolean modifyDelete;
    public boolean renameDelete;
    public boolean p1RenamedP2Add;
    public boolean p2RenamedP1Add;
    public boolean fileLocation;
    public boolean submodule;
    public boolean contentWithUnilateralRenaming;

    public boolean version1;
    public boolean version2;
    public boolean concatenation;
    public boolean combination;
    public boolean newCode;
    public boolean none;
    public boolean imprecise;
    public boolean fileDeleted;
    public boolean postponed;
    public boolean diffProblem;

    public ProjectFilter() {

    }

}
