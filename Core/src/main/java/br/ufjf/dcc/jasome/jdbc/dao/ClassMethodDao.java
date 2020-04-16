/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.ClassMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.MethodMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Principal
 */
public class ClassMethodDao {

    private Connection connection;

    public static final String CLASS_ID = "class_id";
    public static final String METHOD_ID = "method_id";

    public ClassMethodDao() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void insert(ClassMetrics classMetrics, MethodMetrics methodMetrics) throws SQLException {

        String sql = "INSERT INTO tb_class_method "
                + "(" + CLASS_ID + ", " + METHOD_ID + ") "
                + "VALUES (?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, classMetrics.getId());
            stmt.setInt(2, methodMetrics.getId());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

}
