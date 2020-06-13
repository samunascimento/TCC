package br.ufjf.dcc.gmr.core.jasome.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio
 */
public class ProjectMetrics {


    private List<VersionMetrics> listVersionMetrics = new ArrayList<>();

    private String sourceDir;
    private int id;
    private String url;
    private String organization;
    private String name;
    
    private List<String> listPackageMetrics = new ArrayList<>();
    private List<String> listClassMetrics  = new ArrayList<>();
    private List<String> listMethodMetrics  = new ArrayList<>();
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<VersionMetrics> getListVersionMetrics() {
        return listVersionMetrics;
    }

    public void setListVersionMetrics(List<VersionMetrics> listVersionMetrics) {
        this.listVersionMetrics = listVersionMetrics;
    }

    public List<String> getListPackageMetrics() {
        return listPackageMetrics;
    }

    public void setListPackageMetrics(List<String> listPackageMetrics) {
        this.listPackageMetrics = listPackageMetrics;
    }

    public List<String> getListClassMetrics() {
        return listClassMetrics;
    }

    public void setListClassMetrics(List<String> listClassMetrics) {
        this.listClassMetrics = listClassMetrics;
    }

    public List<String> getListMethodMetrics() {
        return listMethodMetrics;
    }

    public void setListMethodMetrics(List<String> listMethodMetrics) {
        this.listMethodMetrics = listMethodMetrics;
    }
    
      /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the organization
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
