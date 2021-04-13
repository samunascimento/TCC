package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author João Pedro Lima
 * @since 11-04-2021
 */
public class ProjectDAO {
    
    private final Connection connection;
    
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String URL = "url";
    public static final String ORGANIZATION = "organization";
    
    public ProjectDAO(Connection connection) {
        this.connection = connection;
    }
    
    public int insert(Project project) throws SQLException {
        
        MergeDAO mergeDAO = new MergeDAO(connection);
        Project_MergeDAO project_MergeDAO = new Project_MergeDAO(connection);
        
        int mergeID;
        int projectID;
        
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
            
            for (Merge merge : project.getMerges()) {
                mergeID = mergeDAO.insert(merge);
                project_MergeDAO.insert(projectID, mergeID);
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
    
}
