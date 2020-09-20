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
public class ConflictFileMergeEventDAO {

    private Connection connection;

    public static final String CONFLICT_FILE_ID = "idConflictFile";
    public static final String MERGE_EVENT_ID = "idMergeEvent";

    public ConflictFileMergeEventDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean insert(int conflictFileID, int mergeEventID) throws SQLException {

        String sql = "INSERT INTO ConflictFile_MergeEvent "
                + "(" + CONFLICT_FILE_ID + ", " + MERGE_EVENT_ID + ") "
                + "VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, conflictFileID);
            stmt.setInt(2, mergeEventID);

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
