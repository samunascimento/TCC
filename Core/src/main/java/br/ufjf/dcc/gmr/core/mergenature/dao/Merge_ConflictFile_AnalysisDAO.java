package br.ufjf.dcc.gmr.core.mergenature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Pedro Lima
 */
public class Merge_ConflictFile_AnalysisDAO {

    public static final String MERGE_FK = "mergeFK";
    public static final String CONFLICT_FILE_FK = "conflictFileFK";
    public static final String ANALYSIS_FK = "analysisFK";
    public static final String COMPLETED = "completed";

    public static void insert(Connection connection, int mergeID, int conflictFileID, int analysisID, boolean completed) throws SQLException, IOException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO merge_conflictfile_analysis ("
                    + MERGE_FK + ", "
                    + CONFLICT_FILE_FK + ", "
                    + ANALYSIS_FK + ", "
                    + COMPLETED + ") VALUES (?,?,?,?);";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, mergeID);
                stmt.setInt(2, conflictFileID);
                stmt.setInt(3, analysisID);
                stmt.setBoolean(4, completed);
                stmt.executeUpdate();
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
    }

    public static List<Integer> select(Connection connection, int mergeID, int analysisID, boolean completed) throws SQLException, IOException {
        List<Integer> conflictFileIDs = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            conflictFileIDs = new ArrayList<>();
            String sql = "SELECT " + CONFLICT_FILE_FK + " FROM merge_conflictfile_analysis WHERE " + MERGE_FK + "=\'" + mergeID
                    + "\' AND " + ANALYSIS_FK + "=\'" + analysisID + "\' AND " + COMPLETED + "=\'" + completed + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    conflictFileIDs.add(resultSet.getInt(CONFLICT_FILE_FK));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return conflictFileIDs;
    }

    public static List<Integer> selectConflictFiles(Connection connection, int mergeID, int analysisID) throws SQLException, IOException {
        List<Integer> conflictFileIDs = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            conflictFileIDs = new ArrayList<>();
            String sql = "SELECT " + CONFLICT_FILE_FK + " FROM merge_conflictfile_analysis WHERE " + MERGE_FK + "=\'" + mergeID
                    + "\' AND " + ANALYSIS_FK + "=\'" + analysisID + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    conflictFileIDs.add(resultSet.getInt(CONFLICT_FILE_FK));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return conflictFileIDs;
    }

    public static boolean select(Connection connection, int mergeID, int conflictFileID, int analysisID) throws SQLException, IOException {
        boolean completed = false;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT " + COMPLETED + " FROM merge_conflictfile_analysis WHERE " + MERGE_FK + "=\'" + mergeID
                    + "\' AND " + CONFLICT_FILE_FK + "=\'" + conflictFileID + "\' AND " + ANALYSIS_FK + "=\'" + analysisID + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    completed = resultSet.getBoolean(COMPLETED);
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return completed;
    }

    public static void updateComplete(Connection connection, int mergeID, int conflictFileID, int analysisID, boolean completed) throws IOException, SQLException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "UPDATE merge_conflictfile_analysis SET " + COMPLETED + "=\'" + completed + "\' "
                    + "WHERE " + MERGE_FK + "=\'" + mergeID
                    + "\' AND " + CONFLICT_FILE_FK + "=\'" + conflictFileID
                    + "\' AND " + ANALYSIS_FK + "=\'" + analysisID + "\';";;
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.executeUpdate();
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
    }
}
