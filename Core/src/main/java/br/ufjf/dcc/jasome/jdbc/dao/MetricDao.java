/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class MetricDao {

    private Connection connection;

    public MetricDao() {
        this.connection = ConnectionFactory.getConnection();

    }

    public int insert(Metric metric) throws SQLException {

        String sql = "INSERT INTO tb_metric "
                + "(name, description, value) "
                + "VALUES (?,?,?)"
                + "RETURNING id;";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setString(1, metric.getName());
            stmt.setString(2, metric.getDescription());
            stmt.setDouble(3, metric.getValue());

            System.out.println(stmt);

            ResultSet result = stmt.executeQuery();

            result.next();

            return result.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<Metric> select() throws SQLException {
        Metric metric;
        metric = new Metric();
        List<Metric> listMetrics = new ArrayList<>();

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM tb_metric";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.executeQuery();
            ResultSet resultSet = stmt.getGeneratedKeys();
            while (resultSet.next()) {
                metric.setId(resultSet.getInt(1));
                metric.setName(resultSet.getString("name"));
                metric.setDescription(resultSet.getString("description"));
                metric.setValue(resultSet.getDouble("value"));
                listMetrics.add(metric);
            }
            return listMetrics;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public Metric selectID(int id) throws SQLException {
        Metric metric;
        metric = new Metric();

        String sql = "SELECT * FROM tb_metric WHERE ID = " + id;

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            ResultSet result = stmt.executeQuery();
            result.next();
            metric.setId(result.getInt(1));
            metric.setName(result.getString("name"));
            metric.setDescription(result.getString("description"));
            metric.setValue(result.getDouble("value"));
            return metric;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

}
