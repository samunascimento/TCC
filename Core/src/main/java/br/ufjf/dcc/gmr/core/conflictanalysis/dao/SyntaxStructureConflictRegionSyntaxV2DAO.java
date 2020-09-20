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
public class SyntaxStructureConflictRegionSyntaxV2DAO {

    private Connection connection;

    public static final String SYNTAX_STRUCTURE_ID = "idsyntaxStructure";
    public static final String CONFLICT_REGION_ID = "idConflictRegion";

    public SyntaxStructureConflictRegionSyntaxV2DAO(Connection connection) {
        this.connection = connection;
    }

    public boolean insert(int syntaxStructureID, int conflcitRegionID) throws SQLException {

        String sql = "INSERT INTO ConflictFile_MergeEvent_SyntaxV2 "
                + "(" + SYNTAX_STRUCTURE_ID + ", " + CONFLICT_REGION_ID + ") "
                + "VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, syntaxStructureID);
            stmt.setInt(2, conflcitRegionID);

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
