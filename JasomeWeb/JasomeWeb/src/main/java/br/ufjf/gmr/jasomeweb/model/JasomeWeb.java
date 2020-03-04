/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.gmr.jasomeweb.model;

import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.jasome.Jasome;
import java.io.IOException;
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

    public List<String> getMetricVersion(String repositoryPath, String jasomePath) throws IOException {
        Jasome jasome = new Jasome(repositoryPath);
        CLIExecution extractMetrics = Jasome.extractMetrics(repositoryPath, jasomePath);
        
        
        return extractMetrics.getOutput();
    }
}
