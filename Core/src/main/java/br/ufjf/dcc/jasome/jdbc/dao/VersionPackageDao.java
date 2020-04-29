/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.PackageMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Principal
 */
public class VersionPackageDao {
    
        private Connection connection;

    public static final String VERSION_ID = "version_id";
    public static final String PACKAGE_ID = "package_id";

    public VersionPackageDao(Connection connection){
        this.connection = connection;
    }

    public void insert(VersionMetrics versionMetrics, PackageMetrics packageMetrics) throws SQLException {

        String sql = "INSERT INTO tb_version_package "
                + "(" + VERSION_ID + ", " + PACKAGE_ID + ") "
                + "VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, versionMetrics.getId());
            stmt.setInt(2, packageMetrics.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
    
}
