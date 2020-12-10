package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SSCShelf;
import java.io.IOException;

/**
 *
 * @author Luan
 */
public class TestLuan {

    public static void main(String[] args) throws IOException {

         SSCShelf teste = ConflictAnalysisTools.getStructureTypeInInterval("/home/luan/Github/teste.py", 1, 3);
        
    }

}
