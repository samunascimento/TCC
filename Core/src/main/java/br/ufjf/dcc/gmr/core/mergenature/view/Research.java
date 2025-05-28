
package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
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
        //algorithm.run(repository, downloadPath, merge, cf);

//        String merge = "3d431b6a74fbcf20d8e74a2121ff8f8c4abe2626";
//        String cf = "coding/sensorML-v20/src/main/java/org/n52/sos/encode/SensorMLEncoderv20.java";
        //String repository = "https://github.com/UniversalMediaServer/UniversalMediaServer";

//        String merge = "2bb52249e7611e3bd5140c5042e1191c3e6d2a7d";
//        String cf = "extensions/gda/operation/src/main/java/org/n52/sos/gda/AbstractGetDataAvailabilityHandler.java";
//        String repository = "https://github.com/52North/SOS";

        //int timeout = Integer.parseInt(args[4]);

        //algorithm.run(repository,downloadPath,merge,cf);
        String arquivoCSV = args[0];
        String linha = "";
        String separador = ",";

        String repositoryPath = "C:\\Users\\Samuel\\OneDrive\\Área de Trabalho\\Códigos\\tcc\\repositorios\\SOS";

        //algorithm.run(repositoryPath, merge, cf);

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            // Lê o cabeçalho (primeira linha) para identificar as colunas
            String cabecalho = br.readLine();
            String[] colunas = cabecalho.split(separador);

            // Índices das 3 colunas que queremos extrair (ajuste conforme necessário)
            int indiceColuna1 = 0; // Primeira coluna
            int indiceColuna2 = 1; // Segunda coluna
            int indiceColuna3 = 2; // Terceira coluna

            System.out.println("Extraindo dados das colunas: " +
                    colunas[indiceColuna1] + ", " +
                    colunas[indiceColuna2] + " e " +
                    colunas[indiceColuna3]);

            List <String> mergeHashs = new ArrayList<>();
            List <String> cfs = new ArrayList<>();

            // Lê cada linha do CSV
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(separador);

                // Verifica se a linha tem colunas suficientes
                if (valores.length > Math.max(Math.max(indiceColuna1, indiceColuna2), indiceColuna3)) {
                    String fileName = valores[indiceColuna1].trim();
                    String repo = valores[indiceColuna2].trim();
                    String hash = valores[indiceColuna3].trim();

//                    System.out.println("Valores: " + fileName + " | " +
//                            repo + " | " + hash);

                    algorithm.run(repositoryPath, hash, fileName);  // usando ja clonado
                    //algorithm.run(repo, downloadPath, hash, fileName);  // clonando
                    // \/ * usando lista para os casos de um projeto com muitos casos de uma vez só  *
                    //mergeHashs.add(hash); //*
                    //cfs.add(fileName); // *
                }
            }

            //algorithm.run(repositoryPath, mergeHashs, cfs); // *

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
