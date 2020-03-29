/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.test;

import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;

/**
 *
 * @author anton
 */
public class TestInsert {
    public static void main(String[] args) {
        ProjectMetrics projectMetrics = new ProjectMetrics();
        projectMetrics.setId(0);
        projectMetrics.setSourceDir("sourceDir56784");
        ProjectMetricsDao dao = new ProjectMetricsDao();
        dao.insert(projectMetrics);
    }
}
