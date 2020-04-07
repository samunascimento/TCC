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

/**
 *
 * @author anton
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/metrics";
    private static final String USER = "postgres";
    private static final String PASS = "kraken";
    
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
    
    public int executeSql(String sql) throws SQLException{
        Connection con= null;
        try{
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            con.close();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
//    
//    public static void closeConnection(Connection con){
//        try {
//           if(con!=null){
//               con.close();
//           } 
//        }catch (SQLException ex) {
//               System.out.println("Erroo " + ex);
//        }
//   }
    
   
}
