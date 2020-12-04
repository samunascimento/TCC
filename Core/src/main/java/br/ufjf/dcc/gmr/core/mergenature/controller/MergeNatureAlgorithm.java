package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictType;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
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

        Merge merge = new Merge();
        String[] auxStringArray;
        List<String> mergeMessage;
        String auxString;

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
        auxString = Git.mergeBaseCommand(repositoryPath, auxStringArray);
        if ("No ancestor".equals(auxString)) {
            merge.setAncestor(Commit.NO_EXIST);
        } else {
            merge.setAncestor(new Commit(auxString, repositoryPath));
        }
        merge.setAncestor(new Commit(Git.mergeBaseCommand(repositoryPath, auxStringArray), repositoryPath));
        if (merge.getMergeType() != MergeType.OCTOPUS_MERGE) {
            Git.checkout(merge.getParents().get(0).getCommitHash(), repositoryPath);
            mergeMessage = Git.merge(merge.getParents().get(1).getCommitHash(), repositoryPath);
            if (mergeMessage.contains("Automatic merge failed; fix conflicts and then commit the result.")) {
                for (String conflictMessage : mergeMessage) {
                    if (conflictMessage.contains("CONFLICT")) {
                        merge.addConflicts(conflictLayer(merge, conflictMessage, repositoryPath));
                    }
                }
                Git.reset(repositoryPath, true, false, false, null);
            } else {
                merge.setMergeType(MergeType.NOT_CONFLICTED_MERGE);
            }
        }

        return merge;

    }

    private Conflict conflictLayer(Merge merge, String conflictMessage, String repositoryPath) throws IOException {

        Conflict conflict = MergeMessageReader.getConflictFromMessage(conflictMessage);

        conflict.setMerge(merge);

        if (conflict.getConflictType() == ConflictType.CONTENT
                || conflict.getConflictType() == ConflictType.COINCIDENCE_ADDING
                || conflict.getConflictType() == ConflictType.FILE_RENAME) {
            conflict.setConflictRegions(conflictRegionsLayer(conflict, MergeNatureTools.getFileContent(conflict.getParent1FilePath()), repositoryPath));
        }

        return conflict;
    }

    private List<ConflictRegion> conflictRegionsLayer(Conflict conflict, List<String> fileContent, String repositoryPath) {
        List<ConflictRegion> conflictRegions = new ArrayList<>();
        ConflictRegion conflictRegion;
        String auxString = "";
        for(int i = 0; i < fileContent.size(); i++){
            if(MergeNatureTools.checkIfIsBegin(fileContent.get(i))){
                conflictRegion = new ConflictRegion();
                for(int j = i - contextLines; j != i; j++){
                    if(j > -1){
                        auxString = auxString + "\n" + fileContent.get(j);
                    } else if (j == -1){
                        auxString = auxString + "\n<SOF>";
                    }
                }
                conflictRegion.setBeforeContext(auxString.replaceFirst("\n", ""));
                auxString = "";
                conflictRegion.setBeginLine(i+1);
                i++;
                while(!MergeNatureTools.checkIfIsSeparator(fileContent.get(i))){
                    auxString = auxString + "\n" + fileContent.get(i);
                    i++;
                }
                conflictRegion.setV1Text(auxString.replaceFirst("\n", ""));
                auxString = "";
                conflictRegion.setSeparatorLine(i+1);
                i++;
                while(!MergeNatureTools.checkIfIsEnd(fileContent.get(i))){
                    auxString = auxString + "\n" + fileContent.get(i);
                    i++;
                }
                conflictRegion.setV2Text(auxString.replaceFirst("\n", ""));
                auxString = "";
                conflictRegion.setEndLine(i+1);
                i++;
                for(int j = i; j < i + contextLines; j++){
                    if(j < fileContent.size()){
                        auxString = auxString + "\n" + fileContent.get(j);
                    } else {
                        auxString = auxString + "\n<EOF>";
                        i = j;
                        break;
                    }
                }
                conflictRegion.setAfterContext(auxString.replaceFirst("\n", ""));
                conflictRegion.setRawConflict(ListUtils.getTextListStringToString(ListUtils.getSubList(fileContent, conflictRegion.getBeginLine() - contextLines - 1, conflictRegion.getEndLine() + contextLines - 1)));
                
            }
        }
        return null;
    }

}
