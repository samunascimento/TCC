package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import java.sql.Connection;

public class TestJoao {

    public static void main(String[] args) throws Exception {
        Algorithm algorithm = new Algorithm();
        Connection connection = ConnectionFactory.getConnection("jdbc:postgresql://localhost:5432/teste1", "joaolima", "kraken");
        algorithm.setSqlConnection(connection);
        algorithm.run("/home/joaolima/Git/TestRepositories/emscripten-fastcomp-clang");
    }

}
