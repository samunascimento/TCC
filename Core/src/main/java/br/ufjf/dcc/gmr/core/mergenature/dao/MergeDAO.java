package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author João Pedro Lima
 * @since 11-04-2021
 */
public class MergeDAO {

    private final Connection connection;

    public static final String ID = "id";
    public static final String MERGETYPE = "mergetype";
    public static final String FK_MERGE = "fk_merge";
    public static final String FK_ANCESTOR = "fk_ancestor";

    public MergeDAO(Connection connection) {
        this.connection = connection;
    }

    public int insert(Merge merge) throws SQLException {

        Merge_ConflictDAO merge_ConflictDAO = new Merge_ConflictDAO(connection);
        Merge_Commit_parentsDAO merge_Commit_parentsDAO = new Merge_Commit_parentsDAO(connection);
        ConflictDAO conflictDAO = new ConflictDAO(connection);
        CommitDAO commitDAO = new CommitDAO(connection);

        int mergeID;
        int conflictID;
        int parentCommitID;
        int mergeCommitID = commitDAO.insert(merge.getMerge());
        int ancestorCommitID = merge.getAncestor() == null ? -1 : commitDAO.insert(merge.getAncestor());

        String sql = "INSERT INTO merge ("
                + MERGETYPE + ", "
                + FK_MERGE + ", "
                + FK_ANCESTOR + ") VALUES (?,?,?) RETURNING " + ID + ";";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, MergeType.getIntFromEnum(merge.getMergeType()));
            stmt.setInt(2, mergeCommitID);
            if (ancestorCommitID == -1) {
                stmt.setNull(3, Types.NULL);
            } else {
                stmt.setInt(3, ancestorCommitID);
            }

            ResultSet result = stmt.executeQuery();

            result.next();

            mergeID = result.getInt(1);

            for (Commit parent : merge.getParents()) {
                parentCommitID = commitDAO.insert(parent);
                merge_Commit_parentsDAO.insert(mergeID, parentCommitID);
            }

            for (Conflict conflict : merge.getConflicts()) {
                conflictID = conflictDAO.insert(conflict);
                merge_ConflictDAO.insert(mergeID, conflictID);
            }

            return mergeID;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public Merge select(int id) throws SQLException {

        Merge merge = null;
        CommitDAO commitDAO = new CommitDAO(connection);
        Merge_ConflictDAO merge_ConflictDAO = new Merge_ConflictDAO(connection);
        Merge_Commit_parentsDAO merge_Commit_parentsDAO = new Merge_Commit_parentsDAO(connection);

        String sql = "SELECT * FROM merge WHERE id = " + id;

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                merge = new Merge(resultSet.getInt(ID),
                        null,
                        commitDAO.select(resultSet.getInt(FK_MERGE)),
                        null,
                        resultSet.getInt(FK_ANCESTOR) == 0 ? null : commitDAO.select(resultSet.getInt(FK_ANCESTOR)),
                        null,
                        MergeType.getEnumFromInt(resultSet.getInt(MERGETYPE)));
            }

            merge.setConflicts(merge_ConflictDAO.selectConflicts(merge.getId()));

            for (Conflict conflict : merge.getConflicts()) {
                conflict.setMerge(merge);
            }

            merge.setParents(merge_Commit_parentsDAO.selectParentsCommits(merge.getId()));

            return merge;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}
