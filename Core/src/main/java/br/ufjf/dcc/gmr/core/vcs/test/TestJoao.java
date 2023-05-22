package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.GitException;
import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class TestJoao {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException, GitException {
        Connection connection = ConnectionFactory.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "kraken");
        Algorithm algorithm = new Algorithm();
        algorithm.setSqlConnection(connection);
        algorithm.run("/home/joaolima/Git/TestRepositories/UFJF");
    }

}
