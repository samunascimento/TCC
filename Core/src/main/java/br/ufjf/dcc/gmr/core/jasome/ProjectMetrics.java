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

    private List<String> listPackageMetrics = new ArrayList<>();
    private List<String> listClassMetrics  = new ArrayList<>();
    private List<String> listMethodMetrics  = new ArrayList<>();
    
    public void getNamePackageMetrics(){
        System.out.println("LIST OF PACKAGES");
        for(int i=0;i<listPackageMetrics.size();i++){
            String namePackage = listPackageMetrics.get(i);
            System.out.println("["+i+"]"+namePackage);
        }
    }
    
    public List<PackageMetrics> getMetricPackage(String namePackage){
        List<PackageMetrics> listPackageMetrics = new ArrayList<>();
        for(int i=0;i<listVersionMetrics.size();i++){
            for(int j=0;j<listVersionMetrics.get(i).getListPackageMetric().size();j++){
                if(listVersionMetrics.get(i).getListPackageMetric().get(j).getName().equals(namePackage)){
                    listPackageMetrics.add(listVersionMetrics.get(i).getListPackageMetric().get(j));
                }
            }
        }
        return listPackageMetrics;
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
    
    

}
