/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.gmr.jasomeweb.model;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.jasome.Jasome;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class JasomeWeb {

    public List<String> getList(String type) {
        List<String> listMetrics = new ArrayList<>();
        listMetrics.add("Antonio");
        listMetrics.add("Henrique");
        listMetrics.add("Passamai");
        listMetrics.add("Penizollo");
        listMetrics.add(type);
        return listMetrics;
    }

    public List<String> getMetricVersion(String repositoryPach) throws IOException{
        Jasome jasome = new Jasome(repositoryPach);
        List<String> listMetric = new ArrayList<>();
        listMetric = jasome.runOneVersion(repositoryPach);
        List<String> listMetrics = new ArrayList<>();
        for(int i=0;i<listMetric.size();i++){
            listMetrics.add(listMetric.get(i));
        }
        return listMetrics;
    }
}
