/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author anton
 */
public class ProjectMetricsDao {
        private final Connection connection;

    public ProjectMetricsDao() {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public void addProjectMetric(ProjectMetrics projectMetrics){
        String sql = "INSERT INTO tb_projectmetrics " +
        "(id,sourcedir)" +
        "VALUES (?,?);";

        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            //set values
            stmt.setInt(1, projectMetrics.getId());
            stmt.setString(2, projectMetrics.getSourceDir());
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
}
