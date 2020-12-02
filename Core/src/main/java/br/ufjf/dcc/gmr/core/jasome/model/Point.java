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
    private int versionID;
    private int parentID;
    private int x;
    private Double y;
    private String nameProject;
    private String namePackage;
    private String nameClass;
    private String nameMethod;
    private String metricName;
    private Date versionDate;
    private String dateString;
    private String sha;
    
    //project

    public Point(int x, Double y,String nameProject, String metricName,String dateString, String sha, int versionID, int parentID) {

        this.x = x;
        this.y = y;
        this.nameProject = nameProject;
        this.metricName = metricName;
        this.dateString = dateString;

        this.versionID = versionID;
        this.parentID = parentID;
        this.sha = sha;

    }
    

    //package

    public Point(int x, Double y,String nameProject, String namePackage,String metricName,String dateString, String sha, int versionID, int parentID) {

        this.x = x;
        this.y = y;
        this.nameProject = nameProject;
        this.namePackage = namePackage;
        this.metricName = metricName;
        this.dateString = dateString;
        this.versionID = versionID;
        this.parentID = parentID;
        this.sha = sha;
    }
    
    //class;
    public Point(int x,Double y,String nameProject, String namePackage,String nameClass,String metricName,String dateString,String sha,int versionID, int parentID){
        this.x = x;
        this.y = y;
        this.nameProject = nameProject;
        this.namePackage = namePackage;
        this.nameClass = nameClass;
        this.metricName = metricName;
        this.dateString = dateString;
        this.versionID = versionID;
        this.parentID = parentID;
        this.sha = sha;
    }
    
    //method

    public Point(int x,Double y,String nameProject, String namePackage,String nameClass,String nameMethod,String metricName,String dateString,String sha,int versionID, int parentID) {
        this.x = x;
        this.y = y;
        this.versionID = versionID;
        this.parentID = parentID;
        this.nameProject = nameProject;
        this.namePackage = namePackage;
        this.nameClass = nameClass;
        this.nameMethod = nameMethod;
        this.metricName = metricName;
        this.dateString = dateString;
        this.sha = sha;
    }
    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Double getY() {
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

    /**
     * @return the versionID
     */
    public int getVersionID() {
        return versionID;
    }

    /**
     * @param versionID the versionID to set
     */
    public void setVersionID(int versionID) {
        this.versionID = versionID;
    }

    /**
     * @return the parentID
     */
    public int getParentID() {
        return parentID;
    }

    /**
     * @param parentID the parentID to set
     */
    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    
    
}
