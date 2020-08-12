/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.cli.*;


/**
 *
 * @author anton
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/Metrics2";
    private static final String USER = "postgres";
    private static final String PASS = "mortrius";
    
    
    public static Connection getConnection(String urlDB, String userNameDB,String passwordDB){
        Connection con= null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(urlDB, userNameDB, passwordDB);
            System.out.println("Conexao com sucesso");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro - conexão" + ex);
        }
        
        return con;
    }   
    
    public static Connection getConnection(){
        Connection con= null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexao com sucesso");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro - conexão" + ex);
        }
        
        return con;
    }   
}
