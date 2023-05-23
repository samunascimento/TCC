package br.ufjf.dcc.gmr.core.mergenature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author João Pedro Lima
 */
public class AnalysisDAO {

    public static final String TABLE = "analysis";
    public static final String ID = "id";
    public static final String PROJECT_ID = "projectId";
    public static final String START_TIME = "startTime";
    public static final String CODEVERSION = "codeVersion";
    public static final String COMPLETED = "completed";

    public static int insert(Connection connection, int projectId, String codeVersion, boolean completed) throws SQLException, IOException {
        int analysisId = -1;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO " + TABLE + " ("
                    + PROJECT_ID + ", "
                    + START_TIME + ", "
                    + CODEVERSION + ", "
                    + COMPLETED + ") VALUES (?,?,?,?) RETURNING " + ID + ";";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, projectId);
                stmt.setTimestamp(2, new Timestamp(new Date().getTime()));
                stmt.setString(3, codeVersion);
                stmt.setBoolean(4, completed);
                ResultSet result = stmt.executeQuery();
                result.next();
                analysisId = result.getInt(1);
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return analysisId;
    }

    public static void updateCompleted(Connection connection, int id, boolean completed) throws IOException, SQLException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "UPDATE " + TABLE + " SET " + COMPLETED + "= \'" + completed + "\'" + "WHERE " + ID + "= \'" + id + "\';";
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

    public static void delete(Connection connection, int id) throws SQLException, IOException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "DELETE FROM " + TABLE + " SET WHERE " + ID + "= \'" + id + "\';";
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

    public static boolean selectCompleted(Connection connection, int id) throws IOException, SQLException {
        boolean completed = false;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT " + COMPLETED + " FROM " + TABLE + " WHERE " + ID + "= \'" + id + "\';";
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

    public static List<Integer> selectByProjectId(Connection connection, int projectId) throws IOException, SQLException {
        List<Integer> analysisIds = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + PROJECT_ID + "= \'" + projectId + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    analysisIds.add(resultSet.getInt(ID));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return analysisIds;
    }

    public static String selectCodeVersion(Connection connection, int id) throws IOException, SQLException {
        String codeVersion = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + ID + "= \'" + id + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    codeVersion = resultSet.getString(CODEVERSION);
                    break;
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
    
    public static boolean hasCompletedAnalysis(Connection connection, int projectId) throws IOException, SQLException {
        boolean hasCompleted = false;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + PROJECT_ID + "=\'" + projectId + "\' AND " + COMPLETED + "=\'true\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                hasCompleted = resultSet.next();
                while (resultSet.next()) {
                    hasCompleted = true;
                    break;
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return hasCompleted;
    }
    
        public static List<Object[]> getAllAnalysisInfo(Connection connection) throws IOException, SQLException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            List<Object[]> result = new ArrayList<>();
            String sql = "SELECT * FROM project p INNER JOIN analysis a ON (p.id = a.projectId)";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    result.add(new Object[]{resultSet.getInt(1),
                        resultSet.getInt(5),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getTimestamp(7).toString(),
                        resultSet.getString(8),
                        resultSet.getBoolean(9)});
                }
                return result;
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
