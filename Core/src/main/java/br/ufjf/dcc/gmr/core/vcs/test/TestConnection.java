/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import java.sql.SQLException;

/**
 *
 * @author gleiph
 */
public class TestConnection {
    
    
    public static void main(String[] args) throws SQLException {
        
        MetricDao metricDao = new MetricDao();
                
        
        Metric metric = new Metric();
        metric.setName("name");
        metric.setDescription("description");
        metric.setValue(0);
        
        int insert = metricDao.insert(metric);
        
        System.out.println("insert = " + insert);
        
        
        Metric selectID = metricDao.selectID(insert);
        
        System.out.println(selectID.getValue() );
        
    }
    
}
