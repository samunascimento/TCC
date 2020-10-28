/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome.model;

/**
 *
 * @author anton
 */
public class PackageClassMethod {
    
    private String packagename;
    private String classname;
    private String methodname;

    public PackageClassMethod() {
    }

    public PackageClassMethod(String packagename, String classname, String methodname) {
        this.packagename = packagename;
        this.classname = classname;
        this.methodname = methodname;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname;
    }
    
}
