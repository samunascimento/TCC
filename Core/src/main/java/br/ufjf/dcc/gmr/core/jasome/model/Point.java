/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome.model;

import java.util.Date;

/**
 *
 * @author anton
 */
public class Point {
    private int x;
    private double y;
    private String namePackage;
    private String nameClass;
    private String nameMethod;
    private String metricName;
    private Date versionDate;

    public Point(int x, double y,String namePackage,String metricName,Date versionDate) {
        this.x = x;
        this.y = y;
        this.namePackage = namePackage;
        this.metricName = metricName;
        this.versionDate = versionDate;
    }
    
    public Point(int x,double y, String namePackage,String nameClass,String metricName,Date versionDate){
        this.x = x;
        this.y = y;
        this.namePackage = namePackage;
        this.nameClass = nameClass;
        this.metricName = metricName;
        this.versionDate = versionDate;
    }
    
    public Point(int x,double y, String namePackage,String nameClass,String nameMethod,String metricName,Date versionDate){
        this.x = x;
        this.y = y;
        this.namePackage = namePackage;
        this.nameClass = nameClass;
        this.nameMethod = nameMethod;
        this.metricName = metricName;
        this.versionDate = versionDate;
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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

    public String getNameMethod() {
        return nameMethod;
    }

    public void setNameMethod(String nameMethod) {
        this.nameMethod = nameMethod;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public Date getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(Date versionDate) {
        this.versionDate = versionDate;
    }

    
    
}
