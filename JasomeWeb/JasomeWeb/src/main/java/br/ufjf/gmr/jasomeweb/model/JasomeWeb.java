/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.gmr.jasomeweb.model;

import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.jasome.Jasome;
import br.ufjf.dcc.gmr.core.jasome.JasomeMethods;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.vcs.types.Formats;
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

    public List<String> getMetricVersion(String repositoryPath, String jasomePath) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, RefusingToClean, UnknownSwitch, IsOutsideRepository {
        JasomeMethods jasomeMethods = new JasomeMethods(repositoryPath, jasomePath);
        //jasomeMethods.runProject(repositoryPath);
        Formats formats = new Formats(null, "39e7e8da2f0cdc8dfff519d07454e3ddea92e844", null, null);
        CLIExecution extractMetrics = jasomeMethods.extractMetrics(repositoryPath, jasomePath);
        ProjectMetrics projectMetrics = jasomeMethods.analyzeVersion(formats, repositoryPath, 0);
        return projectMetrics.getListClassMetrics();
        
    }
}
