package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import java.sql.Connection;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {

        Connection connection = ConnectionFactory.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "kraken");
        Algorithm algorithm = new Algorithm();
        algorithm.setSqlConnection(connection);
        String url = "https://github.com/TheAlgorithms/Python.git";
        algorithm.run(url, "/home/joaolima/Git/UFJF");
    }

}
