/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.dao;

import static br.ufjf.dcc.gmr.core.conflictanalysis.dao.CommitDataDAO.AUTHOR;
import static br.ufjf.dcc.gmr.core.conflictanalysis.dao.CommitDataDAO.AUTHOR_DATE;
import static br.ufjf.dcc.gmr.core.conflictanalysis.dao.CommitDataDAO.COMMITER;
import static br.ufjf.dcc.gmr.core.conflictanalysis.dao.CommitDataDAO.COMMITER_DATE;
import static br.ufjf.dcc.gmr.core.conflictanalysis.dao.CommitDataDAO.COMMIT_HASH;
import static br.ufjf.dcc.gmr.core.conflictanalysis.dao.CommitDataDAO.TITLE;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.CommitData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luan
 */
public class CommitDataMergeEventParentsDAO {

    private Connection connection;

    public static final String COMMIT_DATA_ID = "idCommitData";
    public static final String MERGE_EVENT_ID = "idMergeEvent";

    public CommitDataMergeEventParentsDAO(Connection connection) {
        this.connection = connection;
    }

    
    
    public boolean insert(int commitDataID, int mergeEventID) throws SQLException {

        String sql = "INSERT INTO CommitData_MergeEvent_parents "
                + "(" + COMMIT_DATA_ID + ", " + MERGE_EVENT_ID + ") "
                + "VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, commitDataID);
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
