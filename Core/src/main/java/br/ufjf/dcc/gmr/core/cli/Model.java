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
public class Model {
    //%an author name
    private final String authorName;
    //%H commit hash
    private final String commitHash;
    //%h abbreviated commit hash
    //private final String abbreviatedCommitHash;
    //%ai author date (format respects --date= option)
    //private final String authorDate;

    
    /**
     * @param authorName
     * @param commitHash
     * @param abbreviatedCommitHash
     * @param authorDate 
     */
    public Model(String authorName, String commitHash) {
        this.authorName = authorName;
        this.commitHash = commitHash;
        //this.abbreviatedCommitHash = abbreviatedCommitHash;
        //this.authorDate = authorDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getCommitHash() {
        return commitHash;
    }

    /*public String getAbbreviatedCommitHash() {
        return abbreviatedCommitHash;
    }

    public String getAuthorDate() {
        return authorDate;
    }
*/
    
   
}
