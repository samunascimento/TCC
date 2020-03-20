package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import java.io.IOException;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.returnNewLineNumber;

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

        returnNewLineNumber a = new returnNewLineNumber();
        int teste;

        teste= a.InitreturnNewLineNumber(repositoryPath, "b3405dc", "79cde21",30,"/Core/src/main/java/br/ufjf/dcc/gmr/core/cli/CLIExecute.java");

        
        System.out.println(teste);
    }
}
