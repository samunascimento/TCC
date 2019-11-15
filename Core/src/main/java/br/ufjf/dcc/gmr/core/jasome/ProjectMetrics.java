/*
 * To change this license header, choose License Headers in ProjectMetrics Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio henrique
 */
public class ProjectMetrics {
    private String sourceDir;
    
    private Metric tloc;
    
    private List<PackageMetrics> listPackageMetric = new ArrayList<>();

    public Metric getTloc() {
        return tloc;
    }

    public void setTloc(Metric tloc) {
        this.tloc = tloc;
    }

    public List<PackageMetrics> getListPackageMetric() {
        return listPackageMetric;
    }

    public void setListPackageMetric(List<PackageMetrics> listPackageMetric) {
        this.listPackageMetric = listPackageMetric;
    }
    public String getSourceDir() {
        return sourceDir;
    }

    /**
     * @param sourceDir the sourceDir to set
     */
    public void setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
    }
    
    
}
