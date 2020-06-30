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
    private String name;
    private String metricName;
    private Date versionDate;

    public Point(int x, double y,String name,String metricName,Date versionDate) {
        this.x = x;
        this.y = y;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
