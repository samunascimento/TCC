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
    
    private String packageName;
    private String className;
    private String methodName;
    private int id;

    public PackageClassMethod() {
    }

    public PackageClassMethod(String packageName, String className, String methodName, int id) {
        this.packageName = packageName;
        this.className = className;
        this.methodName = methodName;
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packagename) {
        this.packageName = packagename;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String classname) {
        this.className = classname;
    }

    public String getMethodname() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
    
}
