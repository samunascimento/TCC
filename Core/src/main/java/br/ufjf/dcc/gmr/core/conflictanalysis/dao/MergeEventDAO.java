/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.dao;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.CommitData;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luan
 */
public class MergeEventDAO {

    private Connection connection;

    public static final String ID = "id";
    public static final String ISCONFLICT = "isConflict";

    public MergeEventDAO(Connection connection) {
        this.connection = connection;
    }

    public int insert(MergeEvent mergeEvent) throws SQLException {

        String sql = "INSERT INTO MergeEvent "
                + "(" + ISCONFLICT + ") "
                + "VALUES (?)"
                + "RETURNING id;";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setBoolean(1, mergeEvent.isConflict());

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

    public List<MergeEvent> select() throws SQLException {
        MergeEvent commit;

        List<MergeEvent> commitsList = new ArrayList<>();

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM MergeEvent";

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new MergeEvent();
                commit.setIsConflict(resultSet.getBoolean(ISCONFLICT));
                commit.setId(resultSet.getInt(ID));

                commitsList.add(commit);

            }
            return commitsList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public MergeEvent select(int id) throws SQLException {
        MergeEvent commit = null;

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM MergeEvent cd where cd.id = " + id;

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new MergeEvent();
                commit.setIsConflict(resultSet.getBoolean(ISCONFLICT));
                commit.setId(resultSet.getInt(ID));

            }

            return commit;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM MergeEvent WHERE ID = ?";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void update(MergeEvent mergeEvent, int id) throws SQLException {
        String sql = "UPDATE MergeEvent SET "
                + ISCONFLICT + " = ?, "
                + "WHERE ID = ?";

        System.out.println(sql);

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setBoolean(1, mergeEvent.isConflict());
            stmt.setInt(7, id);

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
