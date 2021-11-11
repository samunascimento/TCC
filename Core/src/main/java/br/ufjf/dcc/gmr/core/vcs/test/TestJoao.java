package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {
        ANTLR4Tools.analyzePythonSyntaxTree("/home/joao_lima/Git/MergeNature/Core/syntaxErrors/tensorflow_backend-py/tensorflow_backend.py", true);
    }

}
