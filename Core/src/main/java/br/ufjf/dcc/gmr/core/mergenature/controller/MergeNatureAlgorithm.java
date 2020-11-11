package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    Project project;

    public MergeNatureAlgorithm(String repositoryLocation, int contextLines) {
        this.repositoryLocation = repositoryLocation;
        this.contextLines = contextLines;
    }

    public void startAlgorithm() {
        try {
            this.project = projectLayer();
            System.out.println("");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private Project projectLayer() throws IOException {

        Project project = new Project();
        String[] auxStringArray;
        String repositoryPath = "";

        if (MergeNatureTools.isDirectory(repositoryLocation)) {
            repositoryPath = this.repositoryLocation;
            auxStringArray = this.repositoryLocation.split(File.separator);
            project.setName(auxStringArray[auxStringArray.length - 1]);
            project.setUrl(MergeNatureTools.getULROfProjectFromConfig(repositoryLocation));
            if (project.getUrl().equals("Unknow")) {
                project.setOrganization("Unknow");
            } else {
                auxStringArray = project.getUrl().split("/");
                project.setOrganization(auxStringArray[auxStringArray.length - 2]);
            }
        } else {
            System.out.println("Downloading analysis is not avaliable!");
        }

        for (String logLine : Git.giveAllMerges(repositoryPath)) {
            project.addMerge(mergeLayer(project, logLine, repositoryPath));
        }

        return project;

    }

    private Merge mergeLayer(Project project, String logLine, String repositoryPath) throws IOException {

        Merge merge = new Merge();;
        String[] auxStringArray;
        List<String> mergeMessage;

        merge.setProject(project);
        auxStringArray = logLine.split("/");
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
            Git.checkout(merge.getParents().get(0).getCommitHash(), repositoryPath);
            mergeMessage = Git.merge(merge.getParents().get(1).getCommitHash(), repositoryPath);
            if (mergeMessage.contains("Automatic merge failed; fix conflicts and then commit the result.")) {
                for (String line : mergeMessage) {
                    if (line.contains("CONFLICT") && !line.contains("CONFLICT (content)") && !line.contains("CONFLICT (add/add)")) {
                        System.out.println(line);
                    }
                }
                Git.reset(repositoryPath, true, false, false, null);
            } else {
                merge.setMergeType(MergeType.NOT_CONFLICTED_MERGE);
            }
        }
        
        return merge;

    }

}
