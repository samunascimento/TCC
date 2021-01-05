package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import java.io.IOException;

/**
 *
 * @author Luan
 */
public class TestLuan {

    public static void main(String[] args) throws IOException {

         ANTLR4Results teste = ConflictAnalysisTools.getANTLR4ResultsInInterval("/home/luan/Github/UFJF/arquivoTesteTemp/teste.py", 1, 34);
         
         /*for (SyntaxStructure outmostedAnalysi : teste.getNormalAnalysis()) {
             System.out.println(outmostedAnalysi.getForm());
             System.out.println("------------------------------------ \n");
            
        }*/
          for (SyntaxStructure outmostedAnalysi : teste.getOutmostedNormalAnalysis()) {
             System.out.println(outmostedAnalysi.getForm());
             System.out.println("------------------------------------ \n");
            
        }
    }

}
