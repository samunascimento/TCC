package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Project;
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
 * @since 11-04-2021
 */
public class ProjectDAO {

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String URL = "url";
    public static final String ORGANIZATION = "organization";
    
    public static Project getEntireProject(Connection connection, int projectID, int analysisID) throws SQLException, IOException {
        Project project = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM project WHERE " + ID + "= \'" + projectID + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    project = new Project(resultSet.getInt(ID),
                            resultSet.getString(NAME),
                            resultSet.getString(URL),
                            resultSet.getString(ORGANIZATION),
                            new ArrayList<>());
                }
                for (int mergeID : Merge_AnalysisDAO.selectAllMergeIDs(connection, analysisID)) {
                    project.addMerge(MergeDAO.selectAllByID(connection, mergeID, analysisID));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return project;
    }

    public static int insert(Connection connection, Project project) throws SQLException, IOException {
        int projectID = -1;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO project ("
                    + NAME + ", "
                    + URL + ", "
                    + ORGANIZATION + ") VALUES (?,?,?) RETURNING " + ID + ";";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, project.getName());
                stmt.setString(2, project.getUrl());
                stmt.setString(3, project.getOrganization());
                ResultSet result = stmt.executeQuery();
                result.next();
                projectID = result.getInt(1);
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return projectID;
    }

    public static List<Project> selectByURL(Connection connection, String url) throws IOException, SQLException {
        List<Project> projects = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM project WHERE " + URL + "= \'" + url + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    projects.add(new Project(resultSet.getInt(ID),
                            resultSet.getString(NAME),
                            resultSet.getString(URL),
                            resultSet.getString(ORGANIZATION),
                            new ArrayList<>()));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return projects;
    }

}
