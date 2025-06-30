
package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import br.ufjf.dcc.gmr.core.vcs.Git;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.sql.Array;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Research {

    public static void main(String[] args) throws Exception {
        System.out.println("Running...");
        //String db_url = args[0];
        //String db_user = args[1];
        //String db_pw = args[2];

        String downloadPath = "C:\\Users\\Samuel\\OneDrive\\Área de Trabalho\\Códigos\\tcc\\repositorios";
        String db_url = "jdbc:postgresql://localhost:5432/mergeNatureTcc";
        String db_user = "postgres";
        String db_pw = "4570";

        Connection connection = ConnectionFactory.getConnection(db_url, db_user, db_pw);
        Algorithm algorithm = new Algorithm();
        algorithm.setDevMode(false);
        algorithm.setSqlConnection(connection);

        //int timeout = Integer.parseInt(args[4]);

        String arquivoCSV = args[0];
        String linha = "";
        String separador = ",";

//        String repositoryPath = "C:\\Users\\Samuel\\OneDrive\\Área de Trabalho\\Códigos\\tcc\\repositorios\\gerrit";
//        String repositoryPath2 = "C:\\Users\\Samuel\\OneDrive\\Área de Trabalho\\Códigos\\tcc\\repositorios\\metasfresh";
//        String repositoryPath3 = "C:\\Users\\Samuel\\OneDrive\\Área de Trabalho\\Códigos\\tcc\\repositorios\\zanata-platform";
//        String repositoryPath4 = "C:\\Users\\Samuel\\OneDrive\\Área de Trabalho\\Códigos\\tcc\\repositorios\\runelite";
//        //String repositoryPath5 = "C:\\Users\\Samuel\\OneDrive\\Área de Trabalho\\Códigos\\tcc\\repositorios\\ihmc-open-robotics-software";
//
//        String reposi = "https://github.com/gerrit-review/gerrit";
//        String reposi2 = "https://github.com/metasfresh/metasfresh";
//        String reposi3 = "https://github.com/zanata/zanata-platform";
//        String reposi4 = "https://github.com/open-osrs/runelite";
//        //String reposi5 = "https://github.com/ihmcrobotics/ihmc-open-robotics-software";

        String currentProject = "https://github.com/AlphaWallet/alpha-wallet-android";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            String cabecalho = br.readLine();
            String[] colunas = cabecalho.split(separador);
            int indiceColuna1 = 0; // Primeira coluna
            int indiceColuna2 = 1; // Segunda coluna


            List <String> mergeHashsAux = new ArrayList<>();

            // Lê cada linha do CSV
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(separador);

                // Verifica se a linha tem colunas suficientes
                if (valores.length > Math.max(indiceColuna1, indiceColuna2)) {
                    String repo = valores[indiceColuna1].trim();
                    String hash = valores[indiceColuna2].trim();

                    if (!repo.equals(currentProject)){
                        System.out.println(currentProject);
                        System.out.println(mergeHashsAux);
                        System.out.println(mergeHashsAux.size());
                        if (!mergeHashsAux.isEmpty()){
                            algorithm = new Algorithm();
                            algorithm.setDevMode(false);
                            algorithm.setSqlConnection(connection);
                            algorithm.run(currentProject, downloadPath, mergeHashsAux);
                            algorithm = null;
                            System.gc();
                        }
                        mergeHashsAux.clear();
                        mergeHashsAux.add(hash);
                        currentProject = repo;
                    } else {
                        mergeHashsAux.add(hash);
                    }
                }
            }


            System.out.println(currentProject);
            System.out.println(mergeHashsAux);
            System.out.println(mergeHashsAux.size());
            algorithm = new Algorithm();
            algorithm.setDevMode(false);
            algorithm.setSqlConnection(connection);
            algorithm.run(currentProject, downloadPath, mergeHashsAux);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
