/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio
 */
public class ProjectMetrics {
    private List<VersionMetrics> listVersionMetrics = new ArrayList<>();
    private String sourceDir;
    
    public String getSourceDir() {
        return sourceDir;
    }

    /**
     * @param sourceDir the sourceDir to set
     */
    public void setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
    }

    public List<VersionMetrics> getListVersionMetrics() {
        return listVersionMetrics;
    }

    public void setListVersionMetrics(List<VersionMetrics> listVersionMetrics) {
        this.listVersionMetrics = listVersionMetrics;
    }
}
