/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.test;

import br.ufjf.dcc.gmr.core.jasome.model.MethodMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.MethodMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;

/**
 *
 * @author anton
 */
public class TestInsert {
    public static void main(String[] args) {
        //testing methodMetrics insert
        MethodMetrics methodMetrics = new MethodMetrics();
        Metric a = new Metric();
        a.setName("metric geral");
        a.setDescription("teste descricao");
        a.setValue("10.00");
        methodMetrics.setCi(a);
        methodMetrics.setCi(a);
        methodMetrics.setDi(a);
        methodMetrics.setFin(a);
        methodMetrics.setFout(a);
        methodMetrics.setIovars(a);
        methodMetrics.setMclc(a);
        methodMetrics.setNbd(a);
        methodMetrics.setNcomp(a);
        methodMetrics.setNop(a);
        methodMetrics.setNvar(a);
        methodMetrics.setSi(a);
        methodMetrics.setTloc(a);
        methodMetrics.setVg(a);
        
        
        MethodMetricsDao dao = new MethodMetricsDao();
        dao.insert(methodMetrics);
        
        System.out.println("teste");
        
//        ProjectMetrics projectMetrics = new ProjectMetrics();
//        projectMetrics.setId(0);
//        projectMetrics.setSourceDir("sourceDir56784");
//        ProjectMetricsDao dao = new ProjectMetricsDao();
//        dao.insert(projectMetrics);
    }
}
