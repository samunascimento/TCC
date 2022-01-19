package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;

import br.ufjf.dcc.gmr.core.vcs.Git;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {

        String downloadPath = "/home/joao_lima/";
        String projectURL = "https://github.com/TheAlgorithms/Python.git";
        String folderName = null;
        Git.clone(downloadPath, projectURL, folderName);

    }

}
