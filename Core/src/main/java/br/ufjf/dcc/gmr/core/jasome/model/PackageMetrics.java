package br.ufjf.dcc.gmr.core.jasome.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio henrique
 */
public class PackageMetrics {

    
    Metric a;
    Metric ccrc;
    Metric ca;
    Metric ce;
    Metric dms;
    Metric i;
    Metric noc;
    Metric noi;
    Metric pkgRCi;
    Metric pkgTCi;
    Metric tloc;
     
    private int id;
    
    private int versionId;
    
    List<ClassMetrics> listClassMetrics;
    
    private String name;
    
    public PackageMetrics() {
        this.listClassMetrics = new ArrayList<>();
    }
    
    public PackageMetrics(int id,String namePackage){
        this.id = id;
        this.name = namePackage;
    }
    
    public List<ClassMetrics> getListClassMetrics() {
        return listClassMetrics;
    }

    public void setListClassMetrics(List<ClassMetrics> listClassMetrics) {
        this.listClassMetrics = listClassMetrics;
    }

    public Metric getA() {
        return a;
    }

    public void setA(Metric a) {
        this.a = a;
    }

    public Metric getCcrc() {
        return ccrc;
    }

    public void setCcrc(Metric ccrc) {
        this.ccrc = ccrc;
    }

    public Metric getCa() {
        return ca;
    }

    public void setCa(Metric ca) {
        this.ca = ca;
    }

    public Metric getCe() {
        return ce;
    }

    public void setCe(Metric ce) {
        this.ce = ce;
    }

    public Metric getDms() {
        return dms;
    }

    public void setDms(Metric dms) {
        this.dms = dms;
    }

    public Metric getI() {
        return i;
    }

    public void setI(Metric i) {
        this.i = i;
    }

    public Metric getNoc() {
        return noc;
    }

    public void setNoc(Metric noc) {
        this.noc = noc;
    }

    public Metric getNoi() {
        return noi;
    }

    public void setNoi(Metric noi) {
        this.noi = noi;
    }

    public Metric getPkgRCi() {
        return pkgRCi;
    }

    public void setPkgRCi(Metric pkgRCi) {
        this.pkgRCi = pkgRCi;
    }

    public Metric getPkgTCi() {
        return pkgTCi;
    }

    public void setPkgTCi(Metric pkgTCi) {
        this.pkgTCi = pkgTCi;
    }

    public Metric getTloc() {
        return tloc;
    }

    public void setTloc(Metric tloc) {
        this.tloc = tloc;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the versionId
     */
    public int getVersionId() {
        return versionId;
    }

    /**
     * @param versionId the versionId to set
     */
    public void setVersionId(int versionId) {
        this.versionId = versionId;
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
    
    
}
