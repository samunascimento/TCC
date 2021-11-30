package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import java.io.IOException;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws IOException {
        System.out.println(ANTLR4Tools.analyzePythonSyntaxTree("/home/joao_lima/file.py", true).getStringAll());
    }

}
