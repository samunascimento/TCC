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
public class PackageClass {

    private String namePackage;
    private String nameClass;
    
    
    
    public PackageClass(String namePackage, String nameClass) {
        this.namePackage = namePackage;
        this.nameClass = nameClass;
    }

    public String getNamePackage() {
        return namePackage;
    }

    public void setNamePackage(String namePackage) {
        this.namePackage = namePackage;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
    
    
    
}
