/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Principal
 */
public class ParentsHashDao {

    private final Connection connection;

    public ParentsHashDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(VersionMetrics versionMetrics, String parentsHash) throws SQLException {
        String sql = "INSERT INTO tb_parents_hash "
                + "(version_id, commit_hash, parent_hash) "
                + "VALUES (?,?,?); ";
        

        PreparedStatement stmt = null;

        ResultSet tableKeys = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, versionMetrics.getId());

            stmt.setString(2, versionMetrics.getHash());

            stmt.setString(3, parentsHash);

            stmt.executeUpdate();
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}
