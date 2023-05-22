package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author João Pedro Lima
 * @since 11-04-2021
 */
public class ProjectDAO {

    public static final String TABLE = "project";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String URL = "url";
    public static final String ORGANIZATION = "organization";

    public static int insert(Connection connection, Project project) throws SQLException, IOException {
        int projectID = -1;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO " + TABLE + " ("
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

    public static void update(Connection connection, int id, Project project) throws SQLException, IOException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "UPDATE " + TABLE + " SET "
                    + NAME + "= \'" + project.getName() + "\', "
                    + URL + "= \'" + project.getUrl() + "\', "
                    + ORGANIZATION + "= \'" + project.getOrganization() + "\' "
                    + "WHERE " + ID + "= \'" + id + "\';";
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

    public static Project select(Connection connection, int id) throws SQLException, IOException {
        Project project = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + ID + "= \'" + id + "\';";
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
        return project;
    }

    public static Project select(Connection connection, String url) throws SQLException, IOException {
        Project project = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + URL + "= \'" + url + "\';";
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
        return project;
    }
    
    public static Project selectEntireProject(Connection connection, int id, int analysisId) throws SQLException, IOException {
        Project project = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + ID + "= \'" + id + "\';";
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
                    break;
                }
                project.setMerges(MergeDAO.selectByAnalysisId(connection, analysisId));
                
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

}
