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
    private String status;
    private int loginId;
    
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int login) {
        this.loginId = login;
    }

    
}
