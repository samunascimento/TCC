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

    public static void updateCompleted(Connection connection, int id, boolean completed) throws IOException, SQLException {
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

    public static List<Object[]> getAllAnalysisInfo(Connection connection) throws IOException, SQLException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            List<Object[]> result = new ArrayList<>();
            String sql = "SELECT * FROM (SELECT * FROM project_analysis\n"
                    + "INNER JOIN project ON project_analysis.projectFK = project.id\n"
                    + "INNER JOIN analysis ON analysis.id = project_analysis.analysisFK) as VAL";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    result.add(new Object[]{resultSet.getInt("projectfk"),
                        resultSet.getInt("analysisfk"),
                        resultSet.getString("name"),
                        resultSet.getString("url"),
                        resultSet.getString("organization"),
                        resultSet.getTimestamp("savedate").toString(),
                        resultSet.getString("codeversion"),
                        resultSet.getBoolean("completed")});
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
