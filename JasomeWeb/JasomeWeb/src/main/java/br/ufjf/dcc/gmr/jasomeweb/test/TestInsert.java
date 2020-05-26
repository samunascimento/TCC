/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.test;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.ClassMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.MethodMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.ClassMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.MethodMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionMetricsDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class TestInsert {

    public static void main(String[] args) throws SQLException {
        
        Connection connection = ConnectionFactory.getConnection(null);

        Metric a = new Metric();
        a.setName("metric geral 999");
        a.setDescription("teste descricao 999");
        a.setValue(909090);
        a.setId(100);
//
//        VersionMetricsDao versionMetricsDao = new VersionMetricsDao();
//        VersionMetrics versionMetrics = new VersionMetrics();
//
//        MetricDao dao = new MetricDao();
//        int insert = dao.insert(a);
//        a.setId(insert);
//
//        versionMetrics.setTloc(a);
//
//        int insertVersion = versionMetricsDao.insert(versionMetrics);
//
//        System.out.println("insert = " + insert);
//        System.out.println("insertVersion = " + insertVersion);
        //teste de classMetricsDao
//        ClassMetricsDao classMetricsDao = new ClassMetricsDao();
//        ClassMetrics classMetrics = new ClassMetrics();
//
//        Metric a1 = new Metric();
//        a1.setName("name metric class");
//        a1.setDescription("metrica da classe");
//        a1.setValue(404);
//        a1.setId(10);
//        
//        
//        for(int i=1;i<=39;i++){
//            MetricDao metricDao = new MetricDao();
//            int insertMetric = metricDao.insert(a1);
//            System.out.println(insertMetric);
//            
//            a1.setId(insertMetric);
//            classMetrics.setAa(a1);
//            classMetrics.setAd(a1);
//            classMetrics.setAi(a1);
//            classMetrics.setAit(a1);
//            classMetrics.setAo(a1);
//            classMetrics.setAv(a1);
//            classMetrics.setClrci(a1);
//            classMetrics.setCltci(a1);
//            classMetrics.setDit(a1);
//            classMetrics.setHmd(a1);
//            classMetrics.setHmi(a1);
//            classMetrics.setMhf(a1);
//            classMetrics.setMif(a1);
//            classMetrics.setMa(a1);
//            classMetrics.setMd(a1);
//            classMetrics.setMi(a1);
//            classMetrics.setMit(a1);
//            classMetrics.setMo(a1);
//            classMetrics.setNf(a1);
//            classMetrics.setNm(a1);
//            classMetrics.setNma(a1);
//            classMetrics.setNmi(a1);
//            classMetrics.setNoa(a1);
//            classMetrics.setNoch(a1);
//            classMetrics.setNod(a1);
//            classMetrics.setNol(a1);
//            classMetrics.setNopa(a1);
//            classMetrics.setNorm(a1);
//            classMetrics.setNpf(a1);
//            classMetrics.setNpm(a1);
//            classMetrics.setNsf(a1);
//            classMetrics.setNsm(a1);
//            classMetrics.setPmr(a1);
//            classMetrics.setPmd(a1);
//            classMetrics.setPmi(a1);
//            classMetrics.setRtloc(a1);
//            classMetrics.setSix(a1);
//            classMetrics.setTloc(a1);
//            classMetrics.setWmc(a1);
//        }
//        
//        classMetricsDao.insert(classMetrics);
//        
//        List<ClassMetrics> listClassMetrics = new ArrayList<>();
//            
//        listClassMetrics = classMetricsDao.select();


        //insert method
        
        MethodMetricsDao methodMetricsDao = new MethodMetricsDao(connection);
        MethodMetrics methodMetrics = new MethodMetrics();
        
        Metric a1 = new Metric();
        a1.setName("name metric method");
        a1.setDescription("metrica da method");
        a1.setValue(606);
        a1.setId(10);
        
        for(int i=1;i<=13;i++){
            MetricDao metricDao = new MetricDao(connection);
            int insertMetric = metricDao.insert(a1);
            
            methodMetrics.setCi(a1);
            methodMetrics.setDi(a1);
            methodMetrics.setFin(a1);
            methodMetrics.setFout(a1);
            methodMetrics.setIovars(a1);
            methodMetrics.setMclc(a1);
            methodMetrics.setNbd(a1);
            methodMetrics.setNcomp(a1);
            methodMetrics.setNop(a1);
            methodMetrics.setNvar(a1);
            methodMetrics.setSi(a1);
            methodMetrics.setTloc(a1);
            methodMetrics.setVg(a1);
            
        }
        
        methodMetricsDao.insert(methodMetrics);
        
        List<MethodMetrics> listMethodMetrics = methodMetricsDao.select();
        
    }
}
