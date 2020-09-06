package br.ufjf.dcc.gmr.core.jasome.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author antonio henrique
 */
public class VersionMetrics {

    private Metric tloc;

    private int id;
    
    private int commitId;

    private String hash;

    private Date commitDate;

    private String authorName;

    private List<String> parentsHash;

    private List<PackageMetrics> listPackageMetric = new ArrayList<>();

    private boolean error = false;

    private int projectID;

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

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean getError() {
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
        return "VersionMetrics{" + "tloc=" + tloc + ", id=" + id + ", listPackageMetric=" + listPackageMetric + '}';
    }

    /**
     * @return the projectID
     */
    public int getProjectID() {
        return projectID;
    }

    /**
     * @param projectID the projectID to set
     */
    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }
    
     /**
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * @param hash the hash to set
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * @return the commitDate
     */
    public Date getCommitDate() {
        return commitDate;
    }

    /**
     * @param commitDate the commitDate to set
     */
    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    /**
     * @return the authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @param authorName the authorName to set
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * @return the parentsHash
     */
    public List<String> getParentsHash() {
        return parentsHash;
    }

    /**
     * @param parentsHash the parentsHash to set
     */
    public void setParentsHash(List<String> parentsHash) {
        this.parentsHash = parentsHash;
    }

    /**
     * @return the commitId
     */
    public int getCommitId() {
        return commitId;
    }

    /**
     * @param commitId the commitId to set
     */
    public void setCommitId(int commitId) {
        this.commitId = commitId;
    }

}
