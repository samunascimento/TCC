package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author luand
 */
public class TestLuan {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     * @throws br.ufjf.dcc.gmr.core.exception.InvalidCommitHash
     */
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        int[] teste;
        teste =new int[]{1,3,5,100,2,98};
        Arrays.sort(teste);
        
        System.out.println(teste[1]);
        
      
    }

}
