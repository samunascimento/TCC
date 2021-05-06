package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JProgressBar;

/**
 *
 * @author João Pedro Lima
 * @since 11-04-2021
 */
public class ProjectDAO {

    private final Connection connection;
    private JProgressBar progressBar;

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String URL = "url";
    public static final String ORGANIZATION = "organization";
    public static final String SAVEDATE = "savedate";

    public ProjectDAO(Connection connection) {
        this.connection = connection;
        this.progressBar = null;
    }

    public ProjectDAO(Connection connection, JProgressBar progressBar) {
        this.connection = connection;
        this.progressBar = progressBar;
    }

    public int insert(Project project) throws SQLException {

        MergeDAO mergeDAO = new MergeDAO(connection);
        Project_MergeDAO project_MergeDAO = new Project_MergeDAO(connection);
        int mergeID;
        int projectID;
        int status = 0;
        if (this.progressBar != null) {
            this.progressBar.setStringPainted(true);
            this.progressBar.setMinimum(1);
            this.progressBar.setIndeterminate(false);
            this.progressBar.setMaximum(project.getMerges().size());
        }

        String sql = "INSERT INTO project ("
                + NAME + ", "
                + URL + ", "
                + ORGANIZATION + ", "
                + SAVEDATE + ") VALUES (?,?,?,?) RETURNING " + ID + ";";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);

            stmt.setString(1, project.getName());
            stmt.setString(2, project.getUrl());
            stmt.setString(3, project.getOrganization());
            stmt.setTimestamp(4, new Timestamp(new Date().getTime()));

            ResultSet result = stmt.executeQuery();

            result.next();

            projectID = result.getInt(1);

            for (int i = 0; i < project.getMerges().size(); i++) {

            }

            for (Merge merge : project.getMerges()) {
                mergeID = mergeDAO.insert(merge);
                project_MergeDAO.insert(projectID, mergeID);
                if (this.progressBar != null) {
                    progressBar.setValue(++status);
                }
            }

            return projectID;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public Project select(int id) throws SQLException {

        Project project = null;
        Project_MergeDAO project_MergeDAO = new Project_MergeDAO(connection);

        String sql = "SELECT * FROM project WHERE id = " + id;

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                project = new Project(resultSet.getInt(ID),
                        resultSet.getString(NAME),
                        resultSet.getString(URL),
                        resultSet.getString(ORGANIZATION),
                        null);
            }

            project.setMerges(project_MergeDAO.selectMerges(project.getId()));

            for (Merge merge : project.getMerges()) {
                merge.setProject(project);
            }

            return project;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<Project> selectAllProjectsWithoutMerges() throws SQLException {

        List<Project> projects = new ArrayList<>();

        String sql = "SELECT * FROM project;";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                projects.add(new Project(resultSet.getInt(ID),
                        resultSet.getString(NAME),
                        resultSet.getString(URL),
                        resultSet.getString(ORGANIZATION),
                        null));
            }

            return projects;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<Date> selectAllDateSaveOfProjects() throws SQLException {

        List<Date> dates = new ArrayList<>();

        String sql = "SELECT * FROM project;";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                dates.add(resultSet.getDate(SAVEDATE));
            }

            return dates;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

}
