package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author João Pedro Lima
 */
public class CommitDAO {

    public static final String ID = "id";
    public static final String MESSAGE = "message";
    public static final String COMMITHASH = "commithash";
    public static final String AUTHOR = "author";
    public static final String AUTHORDATE = "authordate";
    public static final String COMMITTER = "committer";
    public static final String COMMITTERDATE = "committerdate";

    public static int insert(Connection connection, Commit commit) throws SQLException, IOException {
        int commitID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO commit ("
                    + MESSAGE + ", "
                    + COMMITHASH + ", "
                    + AUTHOR + ", "
                    + AUTHORDATE + ", "
                    + COMMITTER + ", "
                    + COMMITTERDATE + ") VALUES (?,?,?,?,?,?) RETURNING " + ID + ";";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, commit.getMessage());
                stmt.setString(2, commit.getHash());
                stmt.setString(3, commit.getAuthor());
                stmt.setLong(4, commit.getAuthorDate().getTime());
                stmt.setString(5, commit.getCommitter());
                stmt.setLong(6, commit.getCommitterDate().getTime());
                ResultSet result = stmt.executeQuery();
                result.next();
                commitID = result.getInt(1);
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return commitID;
    }

    public static Commit selectByID(Connection connection, int id) throws SQLException, IOException {
        Commit commit = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM commit WHERE id = " + id;
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    commit = new Commit(resultSet.getInt(ID),
                            resultSet.getString(MESSAGE),
                            resultSet.getString(COMMITHASH),
                            resultSet.getString(AUTHOR),
                            new Date(resultSet.getLong(AUTHORDATE)),
                            resultSet.getString(COMMITTER),
                            new Date(resultSet.getLong(COMMITTERDATE)));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return commit;
    }
}
