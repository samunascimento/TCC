package br.ufjf.dcc.gmr.core.jasome.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio henrique
 */
public class VersionMetrics {
    private Metric tloc;
    
    private int id;
    
    private List<PackageMetrics> listPackageMetric = new ArrayList<>();
    
    private boolean error = false;

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
    
    public void setError(boolean error){
        this.error=error;
    }
    public boolean getError(){
        return this.error;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VersionMetrics{" + "tloc=" + tloc + ", id=" + id + ", listPackageMetric=" + listPackageMetric +'}';
    }
    
    
}
