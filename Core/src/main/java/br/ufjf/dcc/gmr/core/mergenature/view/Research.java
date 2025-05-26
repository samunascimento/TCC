
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
        //String db_user = args[1];
        //String db_pw = args[2];

        String downloadPath = "C:\\Users\\Samuel\\OneDrive\\Área de Trabalho\\Códigos\\tcc\\repositorios";
        //String mergeHash = "bc6c9679555aa7682b3f99f6fe5f847c5f828f82";
        //String repository = "https://github.com/RedditAndroidDev/Tamagotchi.git";

        String merge = "8c792c4812481c1f256b67a17f6e2505a9beece9";

        String cf = "UniversalMediaServer/UniversalMediaServer/src/main/java/net/pms/newgui/DbgPacker.java";

        String repository = "https://github.com/UniversalMediaServer/UniversalMediaServer";

//        String merge = "393aea994d7ffe9554e4a1296b9b10aebac3c944";
//
//        String cf = "opencga-storage/opencga-storage-hadoop/src/main/java/org/opencb/opencga/storage/hadoop/variant/index/VariantTableMapper.java";
//
//        String repository = "https://github.com/opencb/opencga";

        String db_url = "jdbc:postgresql://localhost:5432/mergeNatureTcc";
        String db_user = "postgres";
        String db_pw = "4570";

        //int timeout = Integer.parseInt(args[4]);

        Connection connection = ConnectionFactory.getConnection(db_url, db_user, db_pw);
        Algorithm algorithm = new Algorithm();
        algorithm.setDevMode(true);
        algorithm.setSqlConnection(connection);
        algorithm.run(repository, downloadPath, merge, cf);

//        int argLength = args.length;
//        if (argLength == 4 ) {
//            File[] repositories = new File(args[3]).listFiles();
//            //int timeout = Integer.parseInt(args[4]);
//            Connection connection = ConnectionFactory.getConnection(db_url, db_user, db_pw);
//            Algorithm algorithm = new Algorithm();
//            //algorithm.setTimeout(timeout);
//            algorithm.setSqlConnection(connection);
//            for (File repository : repositories) {
//                algorithm.run(repository.getAbsolutePath());
//            }
//        }




    }

}
