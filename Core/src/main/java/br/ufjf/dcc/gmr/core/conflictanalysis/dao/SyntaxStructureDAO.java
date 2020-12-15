/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.dao;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
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
public class SyntaxStructureDAO {

    private final Connection connection;

    public static final String ID = "id";
    public static final String STARTLINE = "startLine";
    public static final String STOPLINE = "stopLine";
    public static final String STARTCHARINDEX = "startCharIndex";
    public static final String STOPCHARINDEX = "stopCharIndex";
    public static final String STRUCTURETYPE = "structureType";
    public static final String WARNING = "warning";
    public static final String TEXT = "text";

    public SyntaxStructureDAO(Connection connection) {
        this.connection = connection;
    }

    public int insert(SyntaxStructure syntaxStructure) throws SQLException {

        String sql = "INSERT INTO SyntaxStructure "
                + "(" + STARTLINE + ", " + STOPLINE + ", " + STARTCHARINDEX + ", "
                + STOPCHARINDEX + ", " + STRUCTURETYPE + ", " + WARNING + ", " + TEXT + ") "
                + "VALUES (?,?,?,?,?,?,?)"
                + "RETURNING id;";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, syntaxStructure.getStartLine());
            stmt.setInt(2, syntaxStructure.getStopLine());
            stmt.setInt(3, syntaxStructure.getStartCharIndex());
            stmt.setInt(4, syntaxStructure.getStopCharIndex());
            stmt.setString(5, syntaxStructure.getStructureType());
            stmt.setBoolean(6, syntaxStructure.getWarning());
            stmt.setString(7, syntaxStructure.getText());

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

    public List<SyntaxStructure> select() throws SQLException {
        SyntaxStructure commit;

        List<SyntaxStructure> commitsList = new ArrayList<>();

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM SyntaxStructure";

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new SyntaxStructure();
                commit.setStartLine(resultSet.getInt(STARTLINE));
                commit.setStopLine(resultSet.getInt(STOPLINE));
                commit.setStartCharIndex(resultSet.getInt(STARTCHARINDEX));
                commit.setStopCharIndex(resultSet.getInt(STOPCHARINDEX));
                commit.setStructureType(resultSet.getString(STRUCTURETYPE));
                commit.setWarning(resultSet.getBoolean(WARNING));
                commit.setText(resultSet.getString(TEXT));

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

    public SyntaxStructure select(int id) throws SQLException {
        SyntaxStructure commit = null;

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM SyntaxStructure cd where cd.id = " + id;

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new SyntaxStructure();
                commit.setStartLine(resultSet.getInt(STARTLINE));
                commit.setStopLine(resultSet.getInt(STOPLINE));
                commit.setStartCharIndex(resultSet.getInt(STARTCHARINDEX));
                commit.setStopCharIndex(resultSet.getInt(STOPCHARINDEX));
                commit.setStructureType(resultSet.getString(STRUCTURETYPE));
                commit.setWarning(resultSet.getBoolean(WARNING));
                commit.setText(resultSet.getString(TEXT));

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
        String sql = "DELETE FROM SyntaxStructure WHERE ID = ?";

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

    public void update(SyntaxStructure syntaxStructure, int id) throws SQLException {
        String sql = "UPDATE SyntaxStructure SET "
                + STARTLINE + " = ?, "
                + STOPLINE + " = ?, "
                + STARTCHARINDEX + " = ?, "
                + STOPCHARINDEX + " = ?, "
                + STRUCTURETYPE + " = ?, "
                + WARNING + " = ? "
                + TEXT + " = ? "
                + "WHERE ID = ?";

        System.out.println(sql);

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, syntaxStructure.getStartLine());
            stmt.setInt(2, syntaxStructure.getStopLine());
            stmt.setInt(3, syntaxStructure.getStartCharIndex());
            stmt.setInt(4, syntaxStructure.getStopCharIndex());
            stmt.setString(5, syntaxStructure.getStructureType());
            stmt.setBoolean(6, syntaxStructure.getWarning());
            stmt.setString(7, syntaxStructure.getText());
            stmt.setInt(8, id);

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
