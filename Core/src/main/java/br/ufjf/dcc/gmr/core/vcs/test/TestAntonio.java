/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author gleiph
 */
public class TestAntonio {
    
    public static void main(String[] args) throws IOException {
        String repositoryPath = "/Users/gleiph/repositories/voldemort";
        
        List<String> show = Git.show(repositoryPath, "a41645d0d10a43547e732d5422c8cb93cb9b9c6a");
        
        for (String line : show) {
            System.out.println(line);
        }
    }
    
}
