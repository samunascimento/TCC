package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.Translator;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luan
 */
public class TestLuan {

    public static void main(String[] args) throws IOException {

        File projectPath = new File("resources/teste.py");

        ANTLR4Results teste = ConflictAnalysisTools.getANTLR4ResultsInInterval(projectPath.getAbsolutePath(),33, 34);

        List<String> toTranslate;
        toTranslate = new ArrayList<String>();

        for (SyntaxStructure outmostedAnalysi : teste.getOutmostedNormalAnalysis()) {
            toTranslate.add(outmostedAnalysi.getStructureType());

            System.out.println(outmostedAnalysi.getForm());
            System.out.println("--------------------- \n");
        }

        toTranslate = Translator.PythonTranslator(toTranslate);

        for (String string : toTranslate) {
            System.out.println(string);
        }

    }
}
