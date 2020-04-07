/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.test;

import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionMetricsDao;
import java.sql.SQLException;

/**
 *
 * @author anton
 */
public class TestDelete {

    public static void main(String[] args) throws SQLException {

        VersionMetricsDao dao = new VersionMetricsDao();
        
        dao.delete(4);

    }
}
