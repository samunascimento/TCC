package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.mergenature.model.Project;

/**
 * The main algorithm of merge nature, its function is catch
 * all merges, all conflict files and all conflict regions,
 * besides catalog all regions with ANTLR4
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

    public void startAlgorithm(){
        
    }
    
}
