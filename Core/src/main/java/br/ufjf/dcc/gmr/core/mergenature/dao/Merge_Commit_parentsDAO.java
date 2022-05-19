package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaolima
 */
public class Merge_Commit_parentsDAO {

    public static final String MERGE_FK = "mergeFK";
    public static final String COMMIT_FK = "commitFK";

    public static void insert(Connection connection, int idMerge, int idCommit) throws SQLException, IOException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO merge_commit_parents ("
                    + MERGE_FK + ", "
                    + COMMIT_FK + ") VALUES (?,?);";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, idMerge);
                stmt.setInt(2, idCommit);
                stmt.executeUpdate();
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
    }

    public static List<Commit> selectByMergeID(Connection connection, int mergeID) throws SQLException, IOException {
        List<Commit> parents = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM merge_commit_parents WHERE " + MERGE_FK + "=\'" + mergeID+ "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    parents.add(CommitDAO.selectByID(connection, resultSet.getInt(COMMIT_FK)));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return parents;
    }
}
