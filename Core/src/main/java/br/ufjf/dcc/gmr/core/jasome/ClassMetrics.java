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
public class ClassMetrics {
    List<Metric> listMetrics = new ArrayList<>();
    List<MethodMetrics> listMethodsMetrics = new ArrayList<>();

    public List<Metric> getMetrics() {
        return listMetrics;
    }

    public void setMetrics(List<Metric> metrics) {
        this.listMetrics = metrics;
    }

    public List<MethodMetrics> getListMethodsMetrics() {
        return listMethodsMetrics;
    }

    public void setListMethodsMetrics(List<MethodMetrics> listMethodsMetrics) {
        this.listMethodsMetrics = listMethodsMetrics;
    }
    
    
    
}
