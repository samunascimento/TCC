package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import java.io.IOException;

/**
 *
 * @author Luan
 */
public class TestLuan {

    public static void main(String[] args) throws IOException {

         ANTLR4Results teste = ConflictAnalysisTools.getANTLR4ResultsInInterval("/home/luan/Github/teste.py", 1, 3);
         
    }

}
