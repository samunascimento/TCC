package br.ufjf.dcc.gmr.core.mergenature.dao;

import static br.ufjf.dcc.gmr.core.mergenature.dao.AnalysisDAO.COMPLETED;
import static br.ufjf.dcc.gmr.core.mergenature.dao.AnalysisDAO.ID;
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
public class Merge_AnalysisDAO {

    public static final String MERGE_FK = "mergeFK";
    public static final String ANALYSIS_FK = "analysisFK";
    public static final String HAS_OUT_OF_MEMORY = "hasOutOfMemory";
    public static final String COMPLETED = "completed";


    public static void insert(Connection connection, int mergeID, int analysisID, boolean hasOutOfMemory, boolean completed) throws SQLException, IOException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO merge_analysis ("
                    + MERGE_FK + ", "
                    + ANALYSIS_FK + ", "
                    + HAS_OUT_OF_MEMORY + ", "
                    + COMPLETED + ") VALUES (?,?,?,?);";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, mergeID);
                stmt.setInt(2, analysisID);
                stmt.setBoolean(3, hasOutOfMemory);
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

    public static boolean contains(Connection connection, int mergeID, int analysisID) throws SQLException, IOException {
        boolean completed = false;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT " + COMPLETED + " FROM merge_analysis WHERE " + MERGE_FK + "=\'" + mergeID + "\' "
                    + "AND " + ANALYSIS_FK + "=\'" + analysisID + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    completed = true;
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

    public static boolean selectCompleted(Connection connection, int mergeID, int analysisID) throws SQLException, IOException {
        boolean completed = false;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT " + COMPLETED + " FROM merge_analysis WHERE " + MERGE_FK + "=\'" + mergeID + "\' "
                    + "AND " + ANALYSIS_FK + "=\'" + analysisID + "\';";
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
    
    public static List<Integer> selectAllMergeIDs(Connection connection, int analysisID) throws SQLException, IOException {
        List<Integer> mergeIDs = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT " + MERGE_FK + " FROM merge_analysis WHERE " + ANALYSIS_FK + "=\'" + analysisID +  "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    mergeIDs.add(resultSet.getInt(MERGE_FK));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return mergeIDs;
    }

    public static void update(Connection connection, int mergeID, int analysisID, boolean hasOutOfMemory, boolean completed) throws IOException, SQLException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "UPDATE merge_analysis SET " + HAS_OUT_OF_MEMORY + "=\'" + hasOutOfMemory + "\', "
                    + COMPLETED + "=\'" + completed + "\'" + "WHERE " + MERGE_FK + "=\'" + mergeID + "\' "
                    + "AND " + ANALYSIS_FK + "=\'" + analysisID + "\';";
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
