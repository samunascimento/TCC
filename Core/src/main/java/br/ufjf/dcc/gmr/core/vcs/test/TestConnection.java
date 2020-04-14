/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionMetricsDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author gleiph
 */
public class TestConnection {

    public static void main(String[] args) throws SQLException {

        VersionMetricsDao versionDao = new VersionMetricsDao();

        VersionMetrics versionMetric = new VersionMetrics();
        
        ProjectMetricsDao projectDao =  new ProjectMetricsDao();
        
        ProjectMetrics project =  new ProjectMetrics();
        
        project.setSourceDir("teste");
        project.setUrl("testeUrl");
        project.setName("testname");
        project.setOrganization("organization");
        
        int projectId = projectDao.insert(project);
        
        project.setId(projectId);
        
        

        Metric metric = new Metric();
        metric.setName("name");
        metric.setDescription("description");
        metric.setValue(0);

        MetricDao metricDao = new MetricDao();

        int insert = metricDao.insert(metric);

        System.out.println("insert = " + insert);

        metric.setId(insert);
        
        versionMetric.setProjectID(projectId);

        versionMetric.setTloc(metric);

        int versionId = versionDao.insert(versionMetric);

        System.out.println(versionId);
        
        List<VersionMetrics> select = versionDao.select();
        
        for (VersionMetrics versionMetrics : select) {
            System.out.println(versionMetrics.toString());    
        }
        
        
    }

}
