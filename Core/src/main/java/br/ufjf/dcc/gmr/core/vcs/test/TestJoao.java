package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {
        String file = 
"/home/joao_lima/Git/MergeNature/Core/syntaxErrors/backend-py/backend.py";
        ANTLR4Tools.analyzePythonSyntaxTree(file, true);
    }

}
