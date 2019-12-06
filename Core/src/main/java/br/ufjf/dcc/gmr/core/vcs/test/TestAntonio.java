/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.vcs.types.Formats;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author gleiph
 */
public class TestAntonio {
    
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, ParseException {
        String repositoryPath = "C:\\Users\\antonio henrique\\Documents\\Bolsa TP\\UFJF";
        
        List<Formats> log = Git.log(repositoryPath);
        for (int i = 0; i < log.size(); i++) {
            System.out.println("AuthorName : " + log.get(i).getAuthorName() + " authorDate : " + log.get(i).getAuthorDate());
        }
    }
    
}
