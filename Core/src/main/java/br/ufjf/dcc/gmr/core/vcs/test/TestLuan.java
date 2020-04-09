package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import java.io.IOException;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.RepositoryAnalysis;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
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
     
        List<SyntaxStructure> analyzePythonSyntaxTree = RepositoryAnalysis.analyzePythonSyntaxTree("C:\\Users\\luand.LAPTOP-78V9SGN0\\Documents\\GitHub\\CalcNum-Listas\\Src\\lista1.py");
        for (SyntaxStructure syntaxStructure : analyzePythonSyntaxTree) {
            
            
            System.out.println(syntaxStructure.getText());
            System.out.println("================================");
        }
        
        
        
        
    }

}
