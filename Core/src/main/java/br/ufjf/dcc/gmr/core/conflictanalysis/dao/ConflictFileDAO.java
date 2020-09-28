/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.dao;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictFile;
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
public class ConflictFileDAO {

    private final Connection connection;

    public static final String ID = "id";
    public static final String FILENAME = "fileName";
    public static final String FILEPATH = "filePath";
    public static final String INSIDEFILEPATH = "insideFilePath";
    public static final String EXTRAFILENAME = "extraFileName";
    public static final String EXTRAFILEPATH = "extraFilePath";
    public static final String EXTRAINSIDEFILEPATH = "extraInsideFilePath";

    public ConflictFileDAO(Connection connection) {
        this.connection = connection;
    }

    public int insert(ConflictFile conflictFile) throws SQLException {

        String sql = "INSERT INTO conflctiFile "
                + "(" + FILENAME + ", " + FILEPATH + ", " + INSIDEFILEPATH + ", "
                + EXTRAFILENAME + ", " + EXTRAFILEPATH + ", " + EXTRAINSIDEFILEPATH + ") "
                + "VALUES (?,?,?,?,?,?)"
                + "RETURNING id;";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setString(1, conflictFile.getFileName());
            stmt.setString(2, conflictFile.getFilePath());
            stmt.setString(3, conflictFile.getInsideFilePath());
            stmt.setString(4, conflictFile.getExtraFileName());
            stmt.setString(5, conflictFile.getInsideFilePath());
            stmt.setString(6, conflictFile.getExtraInsideFilePath());

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

    public List<ConflictFile> select() throws SQLException {
        ConflictFile commit;

        List<ConflictFile> commitsList = new ArrayList<>();

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM conflctiFile";

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new ConflictFile();
                commit.setFileName(resultSet.getString(FILENAME));
                commit.setFilePath(resultSet.getString(FILEPATH));
                commit.setInsideFilePath(resultSet.getString(INSIDEFILEPATH));
                commit.setExtraFileName(resultSet.getString(EXTRAFILENAME));
                commit.setExtraFilePath(resultSet.getString(EXTRAFILEPATH));
                commit.setInsideFilePath(resultSet.getString(EXTRAINSIDEFILEPATH));
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

    public ConflictFile select(int id) throws SQLException {
        ConflictFile commit = null;

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM ConflictFile cd where cd.id = " + id;

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new ConflictFile();
                commit.setFileName(resultSet.getString(FILENAME));
                commit.setFilePath(resultSet.getString(FILEPATH));
                commit.setInsideFilePath(resultSet.getString(INSIDEFILEPATH));
                commit.setExtraFileName(resultSet.getString(EXTRAFILENAME));
                commit.setExtraFilePath(resultSet.getString(EXTRAFILEPATH));
                commit.setInsideFilePath(resultSet.getString(EXTRAINSIDEFILEPATH));
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
        String sql = "DELETE FROM ConflictFile WHERE ID = ?";

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

    public void update(ConflictFile conflictFile, int id) throws SQLException {
        String sql = "UPDATE conflictFile SET "
                + FILENAME + " = ?, "
                + FILEPATH + " = ?, "
                + INSIDEFILEPATH + " = ?, "
                + EXTRAFILENAME + " = ?, "
                + EXTRAFILEPATH + " = ?, "
                + EXTRAINSIDEFILEPATH + " = ? "
                + "WHERE ID = ?";

        System.out.println(sql);

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, conflictFile.getFileName());
            stmt.setString(2, conflictFile.getFilePath());
            stmt.setString(3, conflictFile.getInsideFilePath());
            stmt.setString(4, conflictFile.getExtraFileName());
            stmt.setString(5, conflictFile.getInsideFilePath());
            stmt.setString(6, conflictFile.getExtraInsideFilePath());
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
