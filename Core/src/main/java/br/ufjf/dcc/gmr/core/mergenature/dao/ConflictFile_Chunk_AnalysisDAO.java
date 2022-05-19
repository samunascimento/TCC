package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Chunk;
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
public class ConflictFile_Chunk_AnalysisDAO {

    public static final String CONFLICT_FILE_FK = "conflictFileFK";
    public static final String CHUNK_FK = "chunkFK";
    public static final String ANALYSIS_FK = "analysisFK";

    public static void insert(Connection connection, int conflictFileID, int chunkID, int analysisID) throws SQLException, IOException {
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO conflictFile_chunk_analysis ("
                    + CONFLICT_FILE_FK + ", "
                    + CHUNK_FK + ", "
                    + ANALYSIS_FK + ") VALUES (?,?,?);";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, conflictFileID);
                stmt.setInt(2, chunkID);
                stmt.setInt(3, analysisID);
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
    
    public static List<Chunk> selectChunks(Connection connection, int conflictFileID, int analysisID) throws SQLException, IOException {
        List<Chunk> chunks = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            chunks = new ArrayList<>();
            String sql = "SELECT " + CHUNK_FK + " FROM conflictFile_chunk_analysis WHERE " + CONFLICT_FILE_FK + "=\'" + conflictFileID
                    + "\' AND " + ANALYSIS_FK + "=\'" + analysisID + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    chunks.add(ChunkDAO.select(connection, resultSet.getInt(CHUNK_FK)));
                }
            } catch (SQLException ex) {
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
