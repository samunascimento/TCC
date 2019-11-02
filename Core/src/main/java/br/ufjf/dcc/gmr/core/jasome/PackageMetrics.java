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
 * @author antonio henrique
 */
public class PackageMetrics {
    List<Metric> listMetrics = new ArrayList<>();
    List<ClassMetrics> listClassMetrics = new ArrayList<>();

    public List<Metric> getListMetrics() {
        return listMetrics;
    }

    public void setListMetrics(List<Metric> listMetrics) {
        this.listMetrics = listMetrics;
    }

    public List<ClassMetrics> getListClassMetrics() {
        return listClassMetrics;
    }

    public void setListClassMetrics(List<ClassMetrics> listClassMetrics) {
        this.listClassMetrics = listClassMetrics;
    }
}
