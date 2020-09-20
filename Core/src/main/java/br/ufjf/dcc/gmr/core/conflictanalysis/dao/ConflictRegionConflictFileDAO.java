/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author luan
 */
public class ConflictRegionConflictFileDAO {

    private Connection connection;

    public static final String CONFLICT_REGION_ID = "idConflictRegion";
    public static final String CONFLICT_FILE_ID = "idConflictFile";

    public ConflictRegionConflictFileDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean insert(int conflictFileID, int conflcitRegionID) throws SQLException {

        String sql = "INSERT INTO ConflictFile_MergeEvent "
                + "(" + CONFLICT_REGION_ID + ", " + CONFLICT_FILE_ID + ") "
                + "VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(2, conflictFileID);
            stmt.setInt(1, conflcitRegionID);

            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}
