/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.ClassMetrics;
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
public class PackageClassDao {

    private Connection connection;

    public static final String PACKAGE_ID = "package_id";
    public static final String CLASS_ID = "class_id";

    public PackageClassDao() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void insert(PackageMetrics packageMetrics, ClassMetrics classMetrics) throws SQLException {

        String sql = "INSERT INTO tb_package_class "
                + "(" + PACKAGE_ID + ", " + CLASS_ID + ") "
                + "VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, packageMetrics.getId());
            stmt.setInt(2, classMetrics.getId());
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
