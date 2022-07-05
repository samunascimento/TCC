package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.controller.GSONClass;
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
        /*Algorithm algorithm = new Algorithm();
        algorithm.setSqlConnection(connection);
        String[] urls = {
            "https://github.com/ReactiveX/RxJava",
            "https://github.com/redisson/redisson",
            "https://github.com/SeleniumHQ/selenium",
            "https://github.com/apache/kafka",
            "https://github.com/zaproxy/zaproxy.git",
            "https://github.com/dbeaver/dbeaver",
            "https://github.com/antlr/antlr4",
            "https://github.com/voldemort/voldemort",
            "https://github.com/rzwitserloot/lombok",
            "https://github.com/keras-team/keras",
            "https://github.com/electron/electron",
            "https://github.com/microsoft/terminal",
            "https://github.com/opencv/opencv"
        };
        for (String url : urls) {
            algorithm.run(url, "/home/joaolima/Git/UFJF");
        }*/
        GSONClass.save("/home/joaolima/aaa.mntr", ProjectDAO.getEntireProject(connection, 2, 2));
        
    }

}
