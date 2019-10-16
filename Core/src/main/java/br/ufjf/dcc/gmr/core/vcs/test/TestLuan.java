/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;


/**
 *
 * @author luand
 */
public class TestLuan {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     */
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository {
        String repositoryPath = "/Users/gleiph/repositories/voldemort";
        //String repositoryPath="C:\\Users\\luand.LAPTOP-78V9SGN0\\Documents\\GitHub\\BolsaUFJF";
       
            Git.reset(repositoryPath,true, false, false,"");
            /*
            List<FileDiff> result = new ArrayList<>();
            result=Git.diff(repositoryPath, "067615dc00feb6126f9e46115538c957a3523e2e", " 84e35cebfb5d58bd243ccab6bc7a09f5af02ed2a");
            System.out.println("Chegou aaqui");
            //System.out.println(result.getFilePathTarget);
        */
    }
    
}
