package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
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
    
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {
//        String repositoryPath = "/Users/gleiph/Dropbox/UFJF/repositorios/UFJF";
          String repositoryPath = "C:\\Users\\luand.LAPTOP-78V9SGN0\\Documents\\GitHub\\UFJF";

        // Git.reset(repositoryPath,true, false, false,"");
        List<String> result = new ArrayList<>();
        try {
            
            result = Git.auxiliardiff(repositoryPath, "4790a3a", " 25fedab");

            for (String line: result) {
                System.out.println(line);
            }

        } catch (IOException ex) {
            System.out.println("Erro");
        };
        
    }

}
