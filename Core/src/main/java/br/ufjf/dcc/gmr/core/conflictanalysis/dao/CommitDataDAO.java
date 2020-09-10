/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.dao;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.CommitData;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luan
 */
public class CommitDataDAO {

    private Connection connection;

    public static final String ID = "id";
    public static final String COMMIT_HASH = "commitHash";
    public static final String AUTHOR = "author";
    public static final String AUTHOR_DATE = "authorDate";
    public static final String COMMITER = "committer";
    public static final String COMMITER_DATE = "committerDate";
    public static final String TITLE = "title";

    public CommitDataDAO(Connection connection) {
        this.connection = connection;
    }

    public int insert(CommitData commitData) throws SQLException {

        String sql = "INSERT INTO commitData "
                + "(" + COMMIT_HASH + ", " + AUTHOR + ", " + AUTHOR_DATE + ", "
                + COMMITER + ", " + COMMITER_DATE + ", " + TITLE + ") "
                + "VALUES (?,?,?,?,?,?)"
                + "RETURNING id;";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setString(1, commitData.getCommitHash());
            stmt.setString(2, commitData.getAuthor());
            stmt.setDate(3, new java.sql.Date(commitData.getAuthorDate().getTime()));
            stmt.setString(4, commitData.getCommitter());
            stmt.setDate(5, new java.sql.Date(commitData.getCommitterDate().getTime()));
            stmt.setString(6, commitData.getTitle());

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

    public List<CommitData> select() throws SQLException {
        CommitData commit;

        List<CommitData> commitsList = new ArrayList<>();

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM commitData";

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new CommitData();
                commit.setCommitHash(resultSet.getString(COMMIT_HASH));
                commit.setAuthorDate(resultSet.getDate(COMMITER_DATE));
                commit.setCommitter(resultSet.getString(COMMITER));
                commit.setAuthor(resultSet.getString(AUTHOR));
                commit.setCommitterDate(resultSet.getDate(COMMITER_DATE));
                commit.setTitle(resultSet.getString(TITLE));
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

    public CommitData select(int id) throws SQLException {
        CommitData commit = null;

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM commitData cd where cd.id = " + id;

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new CommitData();
                commit.setCommitHash(resultSet.getString(COMMIT_HASH));
                commit.setAuthorDate(resultSet.getDate(COMMITER_DATE));
                commit.setCommitter(resultSet.getString(COMMITER));
                commit.setAuthor(resultSet.getString(AUTHOR));
                commit.setCommitterDate(resultSet.getDate(COMMITER_DATE));
                commit.setTitle(resultSet.getString(TITLE));
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
        String sql = "DELETE FROM commitData WHERE ID = ?";

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

    public void update(CommitData commitData, int id) throws SQLException {
        String sql = "UPDATE commitData SET "
                + COMMIT_HASH + " = ?, "
                + COMMITER + " = ?, "
                + COMMITER_DATE + " = ?, "
                + AUTHOR + " = ?, "
                + AUTHOR_DATE + " = ?, "
                + TITLE + " = ? "
                + "WHERE ID = ?";

        System.out.println(sql);

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, commitData.getCommitHash());
            stmt.setString(2, commitData.getCommitter());
            stmt.setDate(3, new java.sql.Date(commitData.getCommitterDate().getTime()));
            stmt.setString(4, commitData.getAuthor());
            stmt.setDate(5, new java.sql.Date(commitData.getAuthorDate().getTime()));
            stmt.setString(6, commitData.getTitle());
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

    public static void main(String[] args) throws IOException, SQLException {

        CommitData commitData = new CommitData();

        Connection connection = ConnectionFactoryConflictAnalysis.getConnection();
        CommitDataDAO commitDataDAO = new CommitDataDAO(connection);

        commitData.setAuthor("Gleiph");
        commitData.setAuthorDate(new Date());
        commitData.setCommitHash("sha1");
        commitData.setCommitter("Gleiph Ghiotto");
        commitData.setCommitterDate(new Date());
        commitData.setTitle("Mehor commit");
//
//        int insert = commitDataDAO.insert(commitData);
//
//        System.out.println("insert = " + insert);
//        commitDataDAO.delete(11);

        commitData.setTitle("2 melhor commit");
        commitDataDAO.update(commitData, 7);

        List<CommitData> select = commitDataDAO.select();

        for (CommitData commitData1 : select) {
            System.out.println(commitData1);
        }
//        CommitData select = commitDataDAO.select(10);
//        System.out.println(select);

    }

}
