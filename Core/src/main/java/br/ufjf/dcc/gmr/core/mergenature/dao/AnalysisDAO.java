package br.ufjf.dcc.gmr.core.mergenature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author João Pedro Lima
 */
public class AnalysisDAO {
    
    public static final String ID = "id";
    public static final String SAVE_DATE = "saveDate";
    public static final String CODEVERSION = "codeVersion";
    public static final String COMPLETED = "completed";
    
    public static int insert(Connection connection, String codeVersion, boolean completed) throws SQLException, IOException {
        int analysisID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO analysis ("
                    + SAVE_DATE + ", "
                    + CODEVERSION + ", "
                    + COMPLETED + ") VALUES (?,?,?) RETURNING " + ID + ";";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setTimestamp(1, new Timestamp(new Date().getTime()));
                stmt.setString(2, codeVersion);
                stmt.setBoolean(3, completed);
                ResultSet result = stmt.executeQuery();
                result.next();
                analysisID = result.getInt(1);
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return analysisID;
    }
    
    public static boolean selectCompleted(Connection connection, int id) throws IOException, SQLException {
        boolean completed = false;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM analysis WHERE " + ID + "= \'" + id + "\';";
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
    
    public static String selectCodeVersion(Connection connection, int id) throws IOException, SQLException {
        String codeVersion = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM analysis WHERE " + ID + "= \'" + id + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    codeVersion = resultSet.getString(CODEVERSION);
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return codeVersion;
    }
    
    public static void updateCompleted(Connection connection, int id, boolean completed) throws IOException, SQLException{
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "UPDATE analysis SET " + COMPLETED + "= \'" + completed + "\'" + "WHERE " + ID + "= \'" + id + "\';";
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
