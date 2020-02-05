/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.controller;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author anton
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "";
    private static final String URL = "";
    private static final String USER = "";
    private static final String PASS = "";
    
    public static Connection getConnection(){        
        try {
            Class.forName(DRIVER);
            return java.sql.DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        try {
           if(con!=null){
               con.close();
           } 
        }catch (SQLException ex) {
               System.out.println("Erroo " + ex);
        }
   }
}
