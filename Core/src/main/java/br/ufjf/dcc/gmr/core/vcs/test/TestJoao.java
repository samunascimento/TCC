package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureAlgorithm;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.sql.Connection;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {

        MergeNatureAlgorithm algorithm = new MergeNatureAlgorithm("https://github.com/TheAlgorithms/Python.git",
                "/home/joaolima/FieldTest",
                3,
                ConnectionFactory.getConnection("jdbc:postgresql://localhost:5432/mergenature", "postgres", "postgres"));
        algorithm.startAlgorithm();
    }

}
