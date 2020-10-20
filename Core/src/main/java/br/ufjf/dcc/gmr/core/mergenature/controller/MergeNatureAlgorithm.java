package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The main algorithm of merge nature, its function is catch all merges, all
 * conflict files and all conflict regions, besides catalog all regions with
 * ANTLR4
 *
 * @author João Pedro Lima
 * @since 14-10-2020
 */
public class MergeNatureAlgorithm {

    String repositoryLocation;
    int contextLines;
    boolean isDirectory;
    Project project;

    public MergeNatureAlgorithm(String repositoryLocation, int contextLines) {
        this.repositoryLocation = repositoryLocation;
        this.contextLines = contextLines;
        this.isDirectory = MergeNatureTools.isDirectory(repositoryLocation);
    }

    public void startAlgorithm() {

    }

    public void projectLayer() {

    }

    public void mergeLayer(String repositoryPath, Project project) throws IOException {

        Merge merge;
        String[] auxStringArray;

        for (String giveAllMergesLine : Git.giveAllMerges(repositoryPath)) {
            merge = new Merge();
            merge.setProject(project);
            auxStringArray = giveAllMergesLine.split("/");
            merge.setMerge(new Commit(auxStringArray[0], repositoryPath));
            auxStringArray = auxStringArray[1].split(" ");
            if (auxStringArray.length > 2) {
                merge.setMergeType(MergeType.OCTOPUS_MERGE);
            }
            for (String parent : auxStringArray) {
                merge.addParent(new Commit(parent, repositoryPath));
            }
            merge.setAncestor(new Commit(Git.mergeBaseCommand(repositoryPath, auxStringArray), repositoryPath));
            if (merge.getMergeType() != MergeType.OCTOPUS_MERGE) {

            } else if (!Git.mergeIsConflicting(auxStringArray[0], auxStringArray[1], repositoryPath)) {
                merge.setMergeType(MergeType.NOT_CONFLICTED_MERGE);
            } else {
                merge.setMergeType(MergeType.CONFLICTED_MERGE);
                conflictFileLayer(merge);
                Git.reset(repositoryPath, true, false, false, "");
            }
            project.addMerge(merge);
        }
    }
    
    public void conflictFileLayer(Merge merge){
        
    }

}
