/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {
        //String repositoryPath = "/Users/gleiph/repositories/voldemort";
        String repositoryPath="C:\\Users\\luand.LAPTOP-78V9SGN0\\Documents\\GitHub\\UFJF";
       
           // Git.reset(repositoryPath,true, false, false,"");
            
            List<FileDiff> result = new ArrayList<>();
            try{
            result=Git.diff(repositoryPath, "34e0d431369312a8a517f32c5f3f40019073d170", " 1281c161b6c49051f764c9ac7ad42c4d81699aa8");
            }catch(IOException ex){
            System.out.println("Erro");
            };
           
           
        
    }
    
}
