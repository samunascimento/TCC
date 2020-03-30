/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.jasome.model.MethodMetrics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author anton
 */
public class MethodMetricsDao {
    private Connection connection;
    
    public int insert(MethodMetrics methodMetrics){
        return 0;
        
    }
    
    public List<MethodMetrics> select(){
        return null;
    }
    
    public void delete(int id){
        String sql = "DELETE FROM tb_methodMetrics WHERE id = ? ";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            //set values
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
