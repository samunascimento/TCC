package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {
        System.out.println(ANTLR4Tools.analyzeCPPSyntaxTree("/home/joao_lima/Git/MergeNature/Core/syntaxErrors/3d-hpp/3d.hpp", true).getStringAll());
    }

}
