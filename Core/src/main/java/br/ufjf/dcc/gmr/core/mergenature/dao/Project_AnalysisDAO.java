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
public class Project_AnalysisDAO {
    
    public static final String PROJECT_FK = "projectFK";
    public static final String ANALYSIS_FK = "analysisFK";
    
    public static void insert(Connection connection, int projectID, int analysisID) throws SQLException, IOException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO project_analysis ("
                    + PROJECT_FK + ", "
                    + ANALYSIS_FK + ") VALUES (?,?);";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, projectID);
                stmt.setInt(2, analysisID);
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
    
    public static List<Integer> selectByProjectID(Connection connection, int projectID) throws SQLException, IOException{
        List<Integer> analysisIDs = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM project_analysis WHERE " + PROJECT_FK + "=\'" + projectID + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    analysisIDs.add(resultSet.getInt(ANALYSIS_FK));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return analysisIDs;
    }
    
    
    
}
