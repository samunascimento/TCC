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

    public void getNameClassMetrics(){
        System.out.println("LIST OF CLASS");
        for(int i=0;i<listClassMetrics.size();i++){
            String nameClass = listClassMetrics.get(i);
            System.out.println("["+i+"]"+nameClass);
        }
    }
    
    public List<ClassMetrics> getMetricClass(String nameClass){
        List<ClassMetrics> listClassMetrics = new ArrayList<>();
        for(int i=0;i<listVersionMetrics.size();i++){
            for(int j=0;j<listVersionMetrics.get(i).getListPackageMetric().size();j++){
                for(int w=0;w<listVersionMetrics.get(i).getListPackageMetric().get(j).getListClassMetrics().size();w++){
                    if(listVersionMetrics.get(i).getListPackageMetric().get(j).getListClassMetrics().get(w).getName().equals(nameClass)){
                        listClassMetrics.add(listVersionMetrics.get(i).getListPackageMetric().get(j).getListClassMetrics().get(w));
                    }
                }
            }
        }
        return listClassMetrics;
    }
    
    public List<MethodMetrics> getMetricMethod(String nameMethod){
        List<MethodMetrics> listMethodMetrics = new ArrayList<>();
        for(int i=0;i<listVersionMetrics.size();i++){
            for(int j=0;j<listVersionMetrics.get(i).getListPackageMetric().size();j++){
                for(int w=0;w<listVersionMetrics.get(i).getListPackageMetric().get(j).getListClassMetrics().size();w++){
                    for(int y=0;y<listVersionMetrics.get(i).getListPackageMetric().get(j).listClassMetrics.get(w).getListMethodsMetrics().size();y++){
                        if(listVersionMetrics.get(i).getListPackageMetric().get(j).getListClassMetrics().get(w).getListMethodsMetrics().get(y).getName().equals(nameMethod)){
                            listMethodMetrics.add(listVersionMetrics.get(i).getListPackageMetric().get(j).getListClassMetrics().get(w).getListMethodsMetrics().get(y));
                        }
                    }
                }
            }
        }
        
        return listMethodMetrics;
    }
    
    public void getNameMethodMetrics(){
        System.out.println("LIST OF METHOD");
        for(int i=0;i<listPackageMetrics.size();i++){
            String nameMethod = listMethodMetrics.get(i);
            System.out.println("["+i+"]"+nameMethod);
        }
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
    
}
