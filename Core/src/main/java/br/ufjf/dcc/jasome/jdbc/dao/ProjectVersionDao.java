
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gleiph
 */
public class ProjectVersionDao {

    private Connection connection;

    public static final String PROJECT_ID = "project_id";
    public static final String VERSION_ID = "version_id";

    public ProjectVersionDao(Connection connection){
        this.connection = connection;
    }

    public void insert(ProjectMetrics projectMetrics, VersionMetrics versionMetrics) throws SQLException {

        String sql = "INSERT INTO tb_project_version "
                + "(" + PROJECT_ID + ", " + VERSION_ID + ") "
                + "VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, projectMetrics.getId());
            stmt.setInt(2, versionMetrics.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
    
    public List<Integer> selectProjectId(int projectId) throws SQLException {

        VersionMetrics versionMetrics = null;

        List<Integer> listVersionId = new ArrayList<>();

        MetricDao metricDao = new MetricDao(connection);

        String sql = "SELECT * FROM tb_project_version where project_id = ? ";

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        try {
            stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, projectId);

            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                
                listVersionId.add(resultSet.getInt("version_id"));
                
            }
            
            return listVersionId;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

}
