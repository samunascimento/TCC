/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.gmr.jasomeweb.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class ChartInformation {
    private String title;
    private String axisXTitle;
    private String axisYTitle;
    
    private List<Point> listPoint;

    public ChartInformation() {
        this.listPoint = new ArrayList<>();
    }

    
    public ChartInformation(String title, String axisXTitle, String axisYTitle, List<Point> listPoint) {
        this.title = title;
        this.axisXTitle = axisXTitle;
        this.axisYTitle = axisYTitle;
        this.listPoint = listPoint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAxisXTitle() {
        return axisXTitle;
    }

    public void setAxisXTitle(String axisXTitle) {
        this.axisXTitle = axisXTitle;
    }

    public String getAxisYTitle() {
        return axisYTitle;
    }

    public void setAxisYTitle(String axisYTitle) {
        this.axisYTitle = axisYTitle;
    }

    public List<Point> getListPoint() {
        return listPoint;
    }

    public void setListPoint(List<Point> listPoint) {
        this.listPoint = listPoint;
    }
    
    
}
