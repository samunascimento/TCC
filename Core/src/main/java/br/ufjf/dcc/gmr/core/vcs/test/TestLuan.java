package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.RepositoryAnalysis;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.returnNewLineNumber;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;

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

        returnNewLineNumber a=new returnNewLineNumber();
        List<FileDiff> teste = new ArrayList<>();
        
        teste=a.FillFileDiff(repositoryPath,"80cd72c46ecc02f872069f1bfafeb305fb435c77" ,"59a4aad2179246d7a25a1795c3b4962c6356b58f");
       
        for (FileDiff line : teste) {
            for (LineInformation number : line.getLines()) {
                
                System.out.println(number.toString());
            }

        }
        
}
}
