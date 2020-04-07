/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.test;

import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionMetricsDao;
import java.sql.SQLException;

/**
 *
 * @author anton
 */
public class TestInsert {

    public static void main(String[] args) throws SQLException {

        Metric a = new Metric();
        a.setName("metric geral");
        a.setDescription("teste descricao");
        a.setValue(10.00);
        a.setId(2);

        VersionMetricsDao versionMetricsDao = new VersionMetricsDao();
        VersionMetrics versionMetrics = new VersionMetrics();
        

        MetricDao dao = new MetricDao();
        int insert = dao.insert(a);
        a.setId(insert);

        versionMetrics.setTloc(a);

        int insertVersion = versionMetricsDao.insert(versionMetrics);

        System.out.println("insert = " + insert);
        System.out.println("insertVersion = " + insertVersion);

    }
}
