/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.gmr.jasomeweb;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.jasome.Jasome;
import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author anton
 */
public class JasomeWeb {
    
    private static String repository;
    private Jasome jasome = new Jasome(repository);
    
    public JasomeWeb(){
        
    }
    
    public String getRepository(){
       return repository;
    }
    public static String getMetric() throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError{
        return Jasome.runOneVersion();
    }
}
