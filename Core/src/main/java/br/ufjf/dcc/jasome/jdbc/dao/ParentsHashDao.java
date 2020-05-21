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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class ParentsHashDao {

    private final Connection connection;

    public ParentsHashDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(VersionMetrics versionMetrics, String parentsHash, VersionMetrics parentsId) throws SQLException {
        String sql = "INSERT INTO tb_parents_hash "
                + "(version_id, parent_id, parent_hash) "
                + "VALUES (?,?,?); ";

        PreparedStatement stmt = null;

        ResultSet tableKeys = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, versionMetrics.getId());

            if (parentsId != null) {
                stmt.setInt(2, parentsId.getId());
            } else {
                stmt.setNull(2, java.sql.Types.INTEGER);
            }

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
