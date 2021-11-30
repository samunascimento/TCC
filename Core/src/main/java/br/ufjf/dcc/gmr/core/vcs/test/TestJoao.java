package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {
        System.out.println(ANTLR4Tools.analyzePythonSyntaxTree("/home/joao_lima/Git/MergeNature/Core/syntaxErrors/training-py/training.py", true).getStringAll());
    }

}
