package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author João Pedro Lima
 */
public class MergeDAO {

    public static final String ID = "id";
    public static final String MERGE_TYPE = "mergeType";
    public static final String MERGE_COMMIT_FK = "mergeCommitFK";
    public static final String MERGE_BASE_FK = "mergeBaseFK";

    public static int insert(Connection connection, Merge merge) throws SQLException, IOException {
        int mergeID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            int mergeCommitID = CommitDAO.insert(connection, merge.getMergeCommit());
            int mergeBaseCommitID = (merge.getMergeBase() == null ? 0 : CommitDAO.insert(connection, merge.getMergeBase()));
            String sql = "INSERT INTO merge ("
                    + MERGE_TYPE + ", "
                    + MERGE_COMMIT_FK + ", "
                    + MERGE_BASE_FK + ") VALUES (?,?,?) RETURNING " + ID + ";";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, MergeType.getIntFromEnum(merge.getMergeType()));
                stmt.setInt(2, mergeCommitID);
                if (mergeBaseCommitID == 0) {
                    stmt.setNull(3, Types.NULL);
                } else {
                    stmt.setInt(3, mergeBaseCommitID);
                }
                ResultSet result = stmt.executeQuery();
                result.next();
                mergeID = result.getInt(1);
                for (Commit parent : merge.getParents()) {
                    Merge_Commit_parentsDAO.insert(connection, mergeID, CommitDAO.insert(connection, parent));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return mergeID;
    }

    public static Merge selectByID(Connection connection, int id) throws SQLException, IOException {
        Merge merge = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM merge WHERE " + ID + "=\'" + id + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    merge = new Merge(resultSet.getInt(ID),
                            null,
                            CommitDAO.selectByID(connection, resultSet.getInt(MERGE_COMMIT_FK)),
                            new ArrayList<>(),
                            resultSet.getInt(MERGE_BASE_FK) == 0 ? null : CommitDAO.selectByID(connection, resultSet.getInt(MERGE_BASE_FK)),
                            new ArrayList<>(),
                            MergeType.getEnumFromInt(resultSet.getInt(MERGE_TYPE)),
                            false);
                }
                merge.setParents(Merge_Commit_parentsDAO.selectByMergeID(connection, merge.getId()));
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return merge;
    }

}
