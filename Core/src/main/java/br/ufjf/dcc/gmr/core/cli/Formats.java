/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.cli;

/**
 *
 * @author antonio henrique
 */
public class Formats {
    //%an author name
    private final String authorName;
    //%H commit hash
    private final String commitHash;
    //%ai author date (format respects --date= option)
    private final String authorDate;
    //%s ref name given on the command line by which the commit was reached (like git log --source), only works with git log
    private final String commitDescription;
    
    private final String mergeParents;
    
    /**
     * @param authorName
     * @param commitHash
     * @param abbreviatedCommitHash
     * @param authorDate 
     */
    
    public Formats(String authorName, String commitHash, String authorDate,String commitDescription, String mergeParents) {
        this.mergeParents = mergeParents;
        this.authorName = authorName;
        this.commitHash = commitHash;
        this.authorDate = authorDate;
        this.commitDescription = commitDescription;
    }
        
    public Formats(String authorName, String commitHash, String authorDate,String commitDescription) {
        this.mergeParents = null;
        this.authorName = authorName;
        this.commitHash = commitHash;
        this.authorDate = authorDate;
        this.commitDescription = commitDescription;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public String getAuthorDate() {
        return authorDate;
    }

    public String getCommitDescription() {
        return commitDescription;
    }

    public String getMergeParents() {
        return mergeParents;
    }
   
}
