package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import br.ufjf.dcc.gmr.core.mergenature.controller.Translator;
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
       
        /*
     File projectPath = new File("resources/test.py");

        ANTLR4Results teste = ANTLR4Tools.getANTLR4ResultsInInterval(projectPath.getAbsolutePath(),18,22);

        List<String> toTranslate;
        toTranslate = new ArrayList<String>();

        for (SyntaxStructure outmostedAnalysis : teste.getAll()) {
            toTranslate.add(outmostedAnalysis.getStructureType());

            System.out.println(outmostedAnalysis.getForm());
            System.out.println("--------------------- \n");
        }

        toTranslate = Translator.PythonTranslator(toTranslate);

        for (String string : toTranslate) {
            System.out.println(string);
        }
    */

    ANTLR4Results teste = ANTLR4Tools.getANTLR4ResultsInInterval("/home/luan/Github/C#_repositories/teste.cs",5,6);

         List<String> toTranslate;
        toTranslate = new ArrayList<String>();

        for (SyntaxStructure outmostedAnalysis : teste.getAll()) {
            toTranslate.add(outmostedAnalysis.getStructureType());

            System.out.println(outmostedAnalysis.getForm());
            System.out.println("--------------------- \n");
        }

        toTranslate = Translator.CSharpTranslator(toTranslate);

        for (String string : toTranslate) {
            System.out.println(string);
        }
    }
}
