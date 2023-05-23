
package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import java.io.File;
import java.sql.Connection;

public class Research {
    
    public static void main(String[] args) throws Exception {
        String db_url = args[0];
        String db_user = args[1];
        String db_pw = args[2];
        File[] repositories = new File(args[3]).listFiles();
        Connection connection = ConnectionFactory.getConnection(db_url, db_user, db_pw);
        Algorithm algorithm = new Algorithm();
        algorithm.setSqlConnection(connection);
        for (File repository : repositories) {
            algorithm.run(repository.getAbsolutePath());
        }
    }
    
}
