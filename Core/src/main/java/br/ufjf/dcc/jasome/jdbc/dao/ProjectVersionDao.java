
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gleiph
 */
public class ProjectVersionDao {

    private Connection connection;

    public static final String PROJECT_ID = "project_id";
    public static final String VERSION_ID = "version_id";

    public ProjectVersionDao() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void insert(ProjectMetrics projectMetrics, VersionMetrics versionMetrics) throws SQLException {

        String sql = "INSERT INTO tb_metric "
                + "(" + PROJECT_ID + ", " + VERSION_ID + ") "
                + "VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, projectMetrics.getId());
            stmt.setInt(2, versionMetrics.getId());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

}
