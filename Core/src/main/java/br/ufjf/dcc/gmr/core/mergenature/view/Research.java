
package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import java.io.File;
import java.sql.Array;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Research {

    public static void main(String[] args) throws Exception {
        System.out.println("Running...");

        //String db_url = args[0];
//        String db_user = args[1];
//        String db_pw = args[2];

//        String downloadPath = args[0];
//        String mergeHash = args[2];
//        File repository = new File(args[1]);

        String downloadPath = "C:\\Users\\Samuel\\OneDrive\\Área de Trabalho\\Códigos\\tcc\\repositorios";
        String mergeHash = "bc6c9679555aa7682b3f99f6fe5f847c5f828f82";
        String repository = "https://github.com/RedditAndroidDev/Tamagotchi.git";

        String db_url = "jdbc:postgresql://localhost:5432/mergeNatureTcc";
        String db_user = "postgres";
        String db_pw = "4570";

        //int timeout = Integer.parseInt(args[4]);
        //int timeout = 0;
        Connection connection = ConnectionFactory.getConnection(db_url, db_user, db_pw);
        Algorithm algorithm = new Algorithm();
        //algorithm.setDevMode(true);
        //algorithm.setTimeout(timeout);
        algorithm.setSqlConnection(connection);

    }

}
