/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.List;

/**
 *
 * @author gleiph
 */

public class FileDiff {
    
    private String filePathSource;
    private String filePathTarget;
    private List<String> added;
    private List<String> removed;

    public FileDiff() {
    }

    
    public String getFilePathSource() {
        return filePathSource;
    }

    public void setFilePathSource(String filePathSource) {
        this.filePathSource = filePathSource;
    }

    public String getFilePathTarget() {
        return filePathTarget;
    }

    public void setFilePathTarget(String filePathTarget) {
        this.filePathTarget = filePathTarget;
    }

    public List<String> getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added.add(added);
    }

    public List<String> getRemoved() {
        return removed;
    }

    public void setRemoved(String removed) {
        this.removed.add(removed);
    }
    
    

    
}