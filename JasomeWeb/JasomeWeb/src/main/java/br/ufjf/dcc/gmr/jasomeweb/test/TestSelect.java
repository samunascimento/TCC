/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.test;

import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionMetricsDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class TestSelect {
    public static void main(String[] args) throws SQLException {
        
        List<Metric> listMetrics = new ArrayList();
        Metric metric = new Metric();
        MetricDao dao = new MetricDao();
        
        metric = dao.selectID(4);
        
        System.out.println(metric.getName());
        System.out.println(metric.getValue());
        System.out.println(metric.getDescription());      
        
        listMetrics = dao.select();
        
        System.out.println(listMetrics.size());
        
        
    }
}
