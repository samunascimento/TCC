/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome.model;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class JsonGeneration {

    public JsonGeneration() {}
    
    public String generation(List<Metric> listMetric){
        Gson gson = new Gson();
        String metricJson = gson.toJson(listMetric);
        return metricJson;
    }
}
