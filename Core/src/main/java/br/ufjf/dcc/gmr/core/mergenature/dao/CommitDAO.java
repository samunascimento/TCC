package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
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
 * @author João Pedro Lima
 */
public class CommitDAO {

    public static final String TABLE = "commit";
    public static final String ID = "id";
    public static final String MERGE_ID = "mergeId";
    public static final String MESSAGE = "message";
    public static final String COMMITHASH = "commithash";
    public static final String AUTHOR = "author";
    public static final String AUTHORDATE = "authordate";
    public static final String COMMITTER = "committer";
    public static final String COMMITTERDATE = "committerdate";
    public static final String TYPE = "type";

    public static final int MERGE_COMMIT = 0;
    public static final int PARENT = 1;
    public static final int MERGE_BASE = 2;

    public static int insert(Connection connection, Commit commit, int mergeId, int type) throws SQLException, IOException {
        int commitID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO " + TABLE + " ("
                    + MERGE_ID + ", "
                    + MESSAGE + ", "
                    + COMMITHASH + ", "
                    + AUTHOR + ", "
                    + AUTHORDATE + ", "
                    + COMMITTER + ", "
                    + COMMITTERDATE + ", "
                    + TYPE + ") VALUES (?,?,?,?,?,?,?,?) RETURNING " + ID + ";";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, mergeId);
                stmt.setString(2, commit.getMessage());
                stmt.setString(3, commit.getHash());
                stmt.setString(4, commit.getAuthor());
                stmt.setLong(5, commit.getAuthorDate().getTime());
                stmt.setString(6, commit.getCommitter());
                stmt.setLong(7, commit.getCommitterDate().getTime());
                stmt.setInt(8, type);
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

    public static List<Commit> select(Connection connection, int mergeId, int type) throws SQLException, IOException {
        List<Commit> commits = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + MERGE_ID + " = " + mergeId + " AND " + TYPE + " = " + type;
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    commits.add(new Commit(resultSet.getInt(ID),
                            resultSet.getString(MESSAGE),
                            resultSet.getString(COMMITHASH),
                            resultSet.getString(AUTHOR),
                            new Date(resultSet.getLong(AUTHORDATE)),
                            resultSet.getString(COMMITTER),
                            new Date(resultSet.getLong(COMMITTERDATE))));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return commits;
    }
}
