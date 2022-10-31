package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.controller.GSONClass;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import br.ufjf.dcc.gmr.core.mergenature.dao.ProjectDAO;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.sql.Connection;
import java.util.Locale;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionFactory.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "kraken");
        Algorithm algorithm = new Algorithm();
        algorithm.setSqlConnection(connection);
        algorithm.run("https://github.com/1dharode/Hacktoberfest2022", "/home/joaolima");

    }
}
