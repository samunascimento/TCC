package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import java.io.IOException;
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
     * @throws br.ufjf.dcc.gmr.core.exception.InvalidCommitHash
     */
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

      List<SyntaxStructure> analyzeCPP14SyntaxTree = ConflictAnalysisTools.getStructureTypeInInterval("/Users/gleiph/Desktop/teste.cpp",1,84,false);
        for (SyntaxStructure ss : analyzeCPP14SyntaxTree) {
            System.out.println(ss.getForm());
        }  
        
        
    }

}
