/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.test;

import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionMetricsDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class TestDelete {

    public static void main(String[] args) throws SQLException {

       MetricDao dao = new MetricDao();
        List<Metric> listMetrics = new ArrayList();
        
        dao.delete(6);
        
        listMetrics = dao.select();
        
        for (Metric listMetric : listMetrics) {
            
            System.out.println(listMetric.getName());
            System.out.println(listMetric.getValue());
            System.out.println(listMetric.getDescription());      
            System.out.println(listMetric.getId());
        }
        
        Metric metric = new Metric();
        metric.setName("guilherme");
        metric.setValue(20);
        metric.setDescription("testando");
        
        dao.update(metric, 3);
        
        listMetrics = dao.select();
        
        for (Metric listMetric : listMetrics) {
            
            System.out.println(listMetric.getName());
            System.out.println(listMetric.getValue());
            System.out.println(listMetric.getDescription());      
            System.out.println(listMetric.getId());
        }
        

    }
}
