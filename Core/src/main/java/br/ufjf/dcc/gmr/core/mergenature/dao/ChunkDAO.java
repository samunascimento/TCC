package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Chunk;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
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
public class ChunkDAO {

    public static final String TABLE = "chunk";
    public static final String ID = "id";
    public static final String CONFLICT_FILE_ID = "conflictFileId";
    public static final String CHUNK_TEXT = "chunkText";
    public static final String FIRST_PREFIX_LINE = "firstPrefixLine";
    public static final String BEGIN_LINE = "beginLine";
    public static final String SEPARATOR_LINE = "separatorLine";
    public static final String END_LINE = "endLine";
    public static final String LAST_SUFFIX_LINE = "lastSuffixLine";
    public static final String SOLUTION_TEXT = "solutionText";
    public static final String LANGUAGE_CONSTRUCTS = "languageConstructs";
    public static final String ORIGINAL_V1_FIRST_LINE = "originalV1FirstLine";
    public static final String ORIGINAL_V2_FIRST_LINE = "originalV2FirstLine";
    public static final String DEVELOPER_DECISION = "developerDecision";

    public static int insert(Connection connection, Chunk chunk, int conflictFileId) throws SQLException, IOException {
        int chunkID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO " + TABLE + " ("
                    + CONFLICT_FILE_ID + ", "
                    + CHUNK_TEXT + ", "
                    + FIRST_PREFIX_LINE + ", "
                    + BEGIN_LINE + ", "
                    + SEPARATOR_LINE + ", "
                    + END_LINE + ", "
                    + LAST_SUFFIX_LINE + ", "
                    + SOLUTION_TEXT + ", "
                    + LANGUAGE_CONSTRUCTS + ", "
                    + ORIGINAL_V1_FIRST_LINE + ", "
                    + ORIGINAL_V2_FIRST_LINE + ", "
                    + DEVELOPER_DECISION + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?) RETURNING " + ID + ";";

            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, conflictFileId);
                stmt.setString(2, chunk.getChunkText());
                stmt.setInt(3, chunk.getFirstPrefixLine());
                stmt.setInt(4, chunk.getBeginLine());
                stmt.setInt(5, chunk.getSeparatorLine());
                stmt.setInt(6, chunk.getEndLine());
                stmt.setInt(7, chunk.getLastSuffixLine());
                stmt.setString(8, chunk.getSolutionText());
                stmt.setString(9, chunk.getLanguageConstructs());
                stmt.setInt(10, chunk.getOriginalV1FinalLine());
                stmt.setInt(11, chunk.getOriginalV2FinalLine());
                stmt.setInt(12, DeveloperDecision.getIntFromEnum(chunk.getDeveloperDecision()));
                ResultSet result = stmt.executeQuery();
                result.next();
                chunkID = result.getInt(1);
            } catch (SQLException ex) {
                try {
                    connection.rollback();
                } catch (Exception e) {
                }
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return chunkID;
    }

    public static Chunk selectById(Connection connection, int id) throws SQLException, IOException {
        Chunk chunk = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + ID + " = " + id;
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    chunk = new Chunk(resultSet.getInt(ID),
                            null,
                            resultSet.getString(CHUNK_TEXT),
                            resultSet.getInt(FIRST_PREFIX_LINE),
                            resultSet.getInt(BEGIN_LINE),
                            resultSet.getInt(SEPARATOR_LINE),
                            resultSet.getInt(END_LINE),
                            resultSet.getInt(LAST_SUFFIX_LINE),
                            resultSet.getString(SOLUTION_TEXT),
                            DeveloperDecision.getEnumFromInt(resultSet.getInt(DEVELOPER_DECISION)),
                            resultSet.getString(LANGUAGE_CONSTRUCTS),
                            resultSet.getInt(ORIGINAL_V1_FIRST_LINE),
                            resultSet.getInt(ORIGINAL_V2_FIRST_LINE));
                }
            } catch (SQLException ex) {
                try {
                    connection.rollback();
                } catch (Exception e) {
                }

                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return chunk;
    }

    public static List<Chunk> selectByConflictFile(Connection connection, int conflictFileId) throws SQLException, IOException {
        List<Chunk> chunks = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + CONFLICT_FILE_ID + " = " + conflictFileId;
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    chunks.add(new Chunk(resultSet.getInt(ID),
                            null,
                            resultSet.getString(CHUNK_TEXT),
                            resultSet.getInt(FIRST_PREFIX_LINE),
                            resultSet.getInt(BEGIN_LINE),
                            resultSet.getInt(SEPARATOR_LINE),
                            resultSet.getInt(END_LINE),
                            resultSet.getInt(LAST_SUFFIX_LINE),
                            resultSet.getString(SOLUTION_TEXT),
                            DeveloperDecision.getEnumFromInt(resultSet.getInt(DEVELOPER_DECISION)),
                            resultSet.getString(LANGUAGE_CONSTRUCTS),
                            resultSet.getInt(ORIGINAL_V1_FIRST_LINE),
                            resultSet.getInt(ORIGINAL_V2_FIRST_LINE)));
                }
            } catch (SQLException ex) {
                try {
                    connection.rollback();
                } catch (Exception e) {
                }

                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return chunks;
    }

}
