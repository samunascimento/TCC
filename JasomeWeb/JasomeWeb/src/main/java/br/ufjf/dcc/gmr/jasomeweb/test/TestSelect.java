/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.test;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionMetricsDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class TestSelect {
    public static void main(String[] args) throws SQLException {
        
        Connection connection = ConnectionFactory.getConnection();
        
//        List<Metric> listMetrics = new ArrayList();
//        Metric metric = new Metric();
        MetricDao dao = new MetricDao(connection);
        
//        metric = dao.selectID(3);
//        
//        System.out.println(metric.getName());
//        System.out.println(metric.getValue());
//        System.out.println(metric.getDescription());
//        
//        listMetrics = dao.select();
//        
//        System.out.println(listMetrics.size());
//        for (Metric listMetric : listMetrics) {
//            
//            System.out.println(listMetric.getName());
//            System.out.println(listMetric.getValue());
//            System.out.println(listMetric.getDescription());      
//            System.out.println(listMetric.getId());
//        }
        List<Metric> selectMetricPackage = dao.selectVersionMetrics("minecrowdcontrol");
       
    }
}
