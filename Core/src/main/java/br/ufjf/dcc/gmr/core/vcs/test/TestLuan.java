package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import java.io.IOException;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ReturnNewLineNumber;
import br.ufjf.dcc.gmr.core.exception.PathDontExist;

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
//        String repositoryPath = "/Users/gleiph/Dropbox/UFJF/repositorios/UFJFCopy";
       String repositoryPath = "C:\\Users\\luand.LAPTOP-78V9SGN0\\Documents\\GitHub\\UFJF";

        ReturnNewLineNumber a = new ReturnNewLineNumber();
        int teste = 0;

        try {
            teste= a.initReturnNewLineNumber(repositoryPath, "b3405dcdee74ee047ad2cb0119cb98cbc1b0da5a",
                    "79cde21", 15
                    ,"/Core/src/main/java/br/ufjf/dcc/gmr/core/cli/CLIExecute.java");
            
            if (teste == ReturnNewLineNumber.REMOVED_LINE) {
                System.out.println("The line was removed...");
            }else{
                System.out.println("The new line number is " + teste);
            }
            
        } catch (PathDontExist ex) {
            System.out.println(ex.getMessage());
        }

         
        
    }
    
}
