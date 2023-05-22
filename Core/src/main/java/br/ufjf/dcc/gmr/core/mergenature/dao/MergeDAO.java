package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import br.ufjf.dcc.gmr.core.mergenature.model.FileOA;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Pedro Lima
 */
public class MergeDAO {

    public static final String TABLE = "merge";
    public static final String ID = "id";
    public static final String ANALYSIS_ID = "analysisId";
    public static final String MERGE_HASH = "mergeHash";
    public static final String MERGE_TYPE = "mergeType";
    public static final String NUMBER_OF_ALTERATIONS = "numberOfAlterations";
    public static final String COMPLETED = "completed";

    public static int insert(Connection connection, Merge merge, int analysisId, boolean completed) throws SQLException, IOException {
        int mergeID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO " + TABLE + " ("
                    + ANALYSIS_ID + ", "
                    + MERGE_HASH + ", "
                    + MERGE_TYPE + ", "
                    + NUMBER_OF_ALTERATIONS + ", "
                    + COMPLETED + ") VALUES (?,?,?,?,?) RETURNING " + ID + ";";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, analysisId);
                stmt.setString(2, merge.getMergeCommit().getHash());
                stmt.setInt(3, MergeType.getIntFromEnum(merge.getMergeType()));
                stmt.setInt(4, merge.getNumberOfAlterations());
                stmt.setBoolean(5, completed);
                ResultSet result = stmt.executeQuery();
                result.next();
                mergeID = result.getInt(1);
                CommitDAO.insert(connection, merge.getMergeCommit(), mergeID, CommitDAO.MERGE_COMMIT);
                for (Commit parent : merge.getParents()) {
                    CommitDAO.insert(connection, parent, mergeID, CommitDAO.PARENT);
                }
                if (merge.getMergeBase() != null) {
                    CommitDAO.insert(connection, merge.getMergeBase(), mergeID, CommitDAO.MERGE_COMMIT);
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

    public static Merge selectByMergeId(Connection connection, int mergeId) throws SQLException, IOException {
        Merge merge = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + ID + "=\'" + mergeId + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                List<Commit> mergeBases;
                while (resultSet.next()) {
                    mergeBases = CommitDAO.select(connection, mergeId, CommitDAO.MERGE_BASE);
                    merge = new Merge(mergeId,
                            null,
                            CommitDAO.select(connection, mergeId, CommitDAO.MERGE_COMMIT).get(0),
                            CommitDAO.select(connection, mergeId, CommitDAO.PARENT),
                            (mergeBases.isEmpty() ? null : mergeBases.get(0)),
                            new ArrayList<>(),
                            MergeType.getEnumFromInt(resultSet.getInt(MERGE_TYPE)),
                            new ArrayList<>(),
                            resultSet.getInt(NUMBER_OF_ALTERATIONS));
                }
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

    public static Merge selectByAnalysisIdAndMergeHash(Connection connection, int analysisId, String mergeHash) throws SQLException, IOException {
        Merge merge = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + ANALYSIS_ID + "=\'" + analysisId + "\' AND " + MERGE_HASH + "=\'" + mergeHash + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                List<Commit> mergeBases;
                int mergeId;
                while (resultSet.next()) {
                    mergeId = resultSet.getInt(ID);
                    mergeBases = CommitDAO.select(connection, mergeId, CommitDAO.MERGE_BASE);
                    merge = new Merge(mergeId,
                            null,
                            CommitDAO.select(connection, mergeId, CommitDAO.MERGE_COMMIT).get(0),
                            CommitDAO.select(connection, mergeId, CommitDAO.PARENT),
                            (mergeBases.isEmpty() ? null : mergeBases.get(0)),
                            new ArrayList<>(),
                            MergeType.getEnumFromInt(resultSet.getInt(MERGE_TYPE)),
                            new ArrayList<>(),
                            resultSet.getInt(NUMBER_OF_ALTERATIONS));
                }
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

    public static List<Merge> selectByAnalysisId(Connection connection, int analysisId) throws SQLException, IOException {
        List<Merge> merges = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + ANALYSIS_ID + "=\'" + analysisId + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                List<Commit> mergeBases;
                int mergeId;
                while (resultSet.next()) {
                    mergeId = resultSet.getInt(ID);
                    mergeBases = CommitDAO.select(connection, mergeId, CommitDAO.MERGE_BASE);
                    merges.add(new Merge(mergeId,
                            null,
                            CommitDAO.select(connection, mergeId, CommitDAO.MERGE_COMMIT).get(0),
                            CommitDAO.select(connection, mergeId, CommitDAO.PARENT),
                            (mergeBases.isEmpty() ? null : mergeBases.get(0)),
                            ConflictFileDAO.selectByMergeId(connection, mergeId),
                            MergeType.getEnumFromInt(resultSet.getInt(MERGE_TYPE)),
                            FileOADAO.selectByMergeId(connection, mergeId),
                            resultSet.getInt(NUMBER_OF_ALTERATIONS)));
                }
                for (Merge merge : merges) {
                    for (ConflictFile conflictFile : merge.getConflictFiles()) {
                        conflictFile.setMerge(merge);
                        for (FileOA fileOA : merge.getFileOAs()) {
                            if (fileOA.getConflictFile() != null && fileOA.getConflictFile().getId() == conflictFile.getId()) {
                                fileOA.setConflictFile(conflictFile);
                                break;
                            }
                        }
                    }
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return merges;
    }

    public static boolean selectCompleted(Connection connection, int mergeId) throws SQLException, IOException {
        boolean completed = false;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT " + COMPLETED + " FROM " + TABLE + " WHERE " + ID + "=\'" + mergeId + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    completed = resultSet.getBoolean(COMPLETED);
                    break;
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return completed;
    }

    public static void updateCompleted(Connection connection, int id, boolean completed) throws IOException, SQLException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "UPDATE " + TABLE + " SET " + COMPLETED + "= \'" + completed + "\'" + "WHERE " + ID + "= \'" + id + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
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

}
