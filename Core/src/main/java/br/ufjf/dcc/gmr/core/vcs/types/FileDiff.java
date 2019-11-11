/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gleiph
 */

public class FileDiff {
    
    private String filePathSource;
    private String filePathTarget;
    private List<LineInformation> lines;

    public FileDiff() {
        this.lines = new ArrayList<>();
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

    public List<LineInformation> getLines() {
        return lines;
    }

    public void setLines(List<LineInformation> lines) {
        this.lines = lines;
    }

}