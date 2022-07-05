package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Chunk;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author João Pedro Lima
 */
public class ChunkDAO {

    public static final String ID = "id";
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

    public static int insert(Connection connection, Chunk chunk) throws SQLException, IOException {
        int chunkID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO chunk ("
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
                    + DEVELOPER_DECISION + ") VALUES (?,?,?,?,?,?,?,?,?,?,?) RETURNING " + ID + ";";

            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, chunk.getChunkText());
                stmt.setInt(2, chunk.getFirstPrefixLine());
                stmt.setInt(3, chunk.getBeginLine());
                stmt.setInt(4, chunk.getSeparatorLine());
                stmt.setInt(5, chunk.getEndLine());
                stmt.setInt(6, chunk.getLastSuffixLine());
                stmt.setString(7, chunk.getSolutionText());
                stmt.setString(8, chunk.getLanguageConstructs());
                stmt.setInt(9, chunk.getOriginalV1FinalLine());
                stmt.setInt(10, chunk.getOriginalV2FinalLine());
                stmt.setInt(11, DeveloperDecision.getIntFromEnum(chunk.getDeveloperDecision()));
                ResultSet result = stmt.executeQuery();
                result.next();
                chunkID = result.getInt(1);
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return chunkID;
    }

    public static Chunk select(Connection connection, int id) throws SQLException, IOException {
        Chunk chunk = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM chunk WHERE id = " + id;
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
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return chunk;
    }

    public static int containsWithoutStructures(Connection connection, Chunk chunk) throws IOException, SQLException {
        int chunkID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT " + ID + " FROM chunk WHERE " + CHUNK_TEXT + "=\'" + chunk.getChunkText().replaceAll("'", "''")
                    + "\' AND " + FIRST_PREFIX_LINE + "=\'" + chunk.getFirstPrefixLine()
                    + "\' AND " + BEGIN_LINE + "=\'" + chunk.getBeginLine()
                    + "\' AND " + SEPARATOR_LINE + "=\'" + chunk.getSeparatorLine()
                    + "\' AND " + END_LINE + "=\'" + chunk.getEndLine()
                    + "\' AND " + LAST_SUFFIX_LINE + "=\'" + chunk.getLastSuffixLine()
                    + "\' AND " + SOLUTION_TEXT + "=\'" + chunk.getSolutionText().replaceAll("'", "''")
                    + "\' AND " + DEVELOPER_DECISION + "=\'" + DeveloperDecision.getIntFromEnum(chunk.getDeveloperDecision())
                    + "\' AND " + ORIGINAL_V1_FIRST_LINE + "=\'" + chunk.getOriginalV1FirstLine()
                    + "\' AND " + ORIGINAL_V2_FIRST_LINE + "=\'" + chunk.getOriginalV2FirstLine() + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    chunkID = resultSet.getInt(ID);
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return chunkID;
    }

    public static int contains(Connection connection, Chunk chunk) throws IOException, SQLException {
        int chunkID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            if (chunk.getLanguageConstructs() == null) {
                System.out.println("");
            }
            String sql = "SELECT " + ID + " FROM chunk WHERE " + CHUNK_TEXT + "=\'" + chunk.getChunkText().replaceAll("'", "''")
                    + "\' AND " + FIRST_PREFIX_LINE + "=\'" + chunk.getFirstPrefixLine()
                    + "\' AND " + BEGIN_LINE + "=\'" + chunk.getBeginLine()
                    + "\' AND " + SEPARATOR_LINE + "=\'" + chunk.getSeparatorLine()
                    + "\' AND " + END_LINE + "=\'" + chunk.getEndLine()
                    + "\' AND " + LAST_SUFFIX_LINE + "=\'" + chunk.getLastSuffixLine()
                    + "\' AND " + SOLUTION_TEXT + "=\'" + chunk.getSolutionText().replaceAll("'", "''")
                    + "\' AND " + DEVELOPER_DECISION + "=\'" + DeveloperDecision.getIntFromEnum(chunk.getDeveloperDecision())
                    + "\' AND " + LANGUAGE_CONSTRUCTS + "=\'" + chunk.getLanguageConstructs().replaceAll("'", "''")
                    + "\' AND " + ORIGINAL_V1_FIRST_LINE + "=\'" + chunk.getOriginalV1FirstLine()
                    + "\' AND " + ORIGINAL_V2_FIRST_LINE + "=\'" + chunk.getOriginalV2FirstLine() + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    chunkID = resultSet.getInt(ID);
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return chunkID;
    }

    public static void updateStructures(Connection connection, int id, String languageConstructs) throws IOException, SQLException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "UPDATE chunk SET " + LANGUAGE_CONSTRUCTS + "=\'" + languageConstructs.replaceAll("'", "''") + "\' " + "WHERE " + ID + "=\'" + id + "\';";
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
