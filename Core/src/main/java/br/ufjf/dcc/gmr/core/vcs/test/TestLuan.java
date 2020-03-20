package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import java.io.IOException;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ReturnNewLineNumber;

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

        ReturnNewLineNumber a = new ReturnNewLineNumber();
        int teste;

        teste= a.initreturnNewLineNumber(repositoryPath, "9852438", "3d52ccc",1,"/Core/src/main/java/br/ufjf/dcc/gmr/core/jasome/model/PackageMetrics.java");

        
        System.out.println(teste);
    }
    
}
