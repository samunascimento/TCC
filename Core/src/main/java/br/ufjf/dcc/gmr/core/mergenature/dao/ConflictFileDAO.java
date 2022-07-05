package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Chunk;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFileType;
import br.ufjf.dcc.gmr.core.mergenature.model.HasOutsideAlterations;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author João Pedro Lima
 */
public class ConflictFileDAO {

    public static final String ID = "id";
    public static final String PARENT1FILEPATH = "parent1FilePath";
    public static final String PARENT2FILEPATH = "parent2FilePath";
    public static final String ANCESTORFILEPATH = "ancestorFilePath";
    public static final String CONFLICTFILEPATH = "conflictFilePath";
    public static final String HASOUTSIDEALTERATIONS = "hasOutsideAlterations";
    public static final String OUT_OF_MEMORY = "outOfMemory";
    public static final String CONFLICTTYPE = "conflictFileType";

    public static int insert(Connection connection, ConflictFile conflictFile) throws SQLException, IOException {
        int conflictFileID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO conflictFile ("
                    + PARENT1FILEPATH + ", "
                    + PARENT2FILEPATH + ", "
                    + ANCESTORFILEPATH + ", "
                    + CONFLICTFILEPATH + ", "
                    + HASOUTSIDEALTERATIONS + ", "
                    + OUT_OF_MEMORY + ", "
                    + CONFLICTTYPE + ") VALUES (?,?,?,?,?,?,?) RETURNING " + ID + ";";

            PreparedStatement stmt = null;
            try {

                stmt = connection.prepareStatement(sql);
                stmt.setString(1, conflictFile.getParent1FilePath());
                stmt.setString(2, conflictFile.getParent2FilePath());
                stmt.setString(3, conflictFile.getAncestorFilePath());
                stmt.setInt(4, conflictFile.getIntConflictFilePath());
                stmt.setInt(5, HasOutsideAlterations.getIntFromEnum(conflictFile.getHasOutsideAlterations()));
                stmt.setBoolean(6, conflictFile.isOutOfMemory());
                stmt.setInt(7, ConflictFileType.getIntFromEnum(conflictFile.getConflictFileType()));
                ResultSet result = stmt.executeQuery();
                result.next();
                conflictFileID = result.getInt(1);
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return conflictFileID;
    }

    public static ConflictFile select(Connection connection, int id, int analysisID) throws SQLException, IOException {
        ConflictFile conflictFile = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM conflictFile WHERE id = " + id;
            PreparedStatement stmt = null;
            try {

                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {
                    conflictFile = new ConflictFile(resultSet.getInt(ID),
                            resultSet.getString(PARENT1FILEPATH),
                            resultSet.getString(PARENT2FILEPATH),
                            resultSet.getString(ANCESTORFILEPATH),
                            resultSet.getInt(CONFLICTFILEPATH),
                            (analysisID > 0 ? new ArrayList<>() : ConflictFile_Chunk_AnalysisDAO.selectChunks(connection, id, analysisID)),
                            ConflictFileType.getEnumFromInt(resultSet.getInt(CONFLICTTYPE)),
                            HasOutsideAlterations.getEnumFromInt(resultSet.getInt(HASOUTSIDEALTERATIONS)),
                            resultSet.getBoolean(OUT_OF_MEMORY),
                            null);
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return conflictFile;
    }
    
    public static ConflictFile selectAll(Connection connection, int conflictFileID, int analysisID) throws SQLException, IOException {
        ConflictFile conflictFile = null;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM conflictFile WHERE id = " + conflictFileID;
            PreparedStatement stmt = null;
            try {

                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {
                    conflictFile = new ConflictFile(resultSet.getInt(ID),
                            resultSet.getString(PARENT1FILEPATH),
                            resultSet.getString(PARENT2FILEPATH),
                            resultSet.getString(ANCESTORFILEPATH),
                            resultSet.getInt(CONFLICTFILEPATH),
                            (analysisID > 0 ? new ArrayList<>() : ConflictFile_Chunk_AnalysisDAO.selectChunks(connection, conflictFileID, analysisID)),
                            ConflictFileType.getEnumFromInt(resultSet.getInt(CONFLICTTYPE)),
                            HasOutsideAlterations.getEnumFromInt(resultSet.getInt(HASOUTSIDEALTERATIONS)),
                            resultSet.getBoolean(OUT_OF_MEMORY),
                            null);
                }
                conflictFile.setChunks(ConflictFile_Chunk_AnalysisDAO.selectChunks(connection, conflictFileID, analysisID));
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return conflictFile;
    }

    public static int contains(Connection connection, ConflictFile conflictFile) throws IOException, SQLException {
        int conflictFileID = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT " + ID + " FROM conflictFile WHERE " + PARENT1FILEPATH + "=\'" + conflictFile.getParent1FilePath()
                    + "\' AND " + PARENT2FILEPATH + "=\'" + conflictFile.getParent2FilePath()
                    + "\' AND " + ANCESTORFILEPATH + "=\'" + conflictFile.getAncestorFilePath()
                    + "\' AND " + CONFLICTFILEPATH + "=\'" + conflictFile.getIntConflictFilePath()
                    + "\' AND " + CONFLICTTYPE + "=\'" + ConflictFileType.getIntFromEnum(conflictFile.getConflictFileType())
                    + "\' AND " + HASOUTSIDEALTERATIONS + "=\'" + HasOutsideAlterations.getIntFromEnum(conflictFile.getHasOutsideAlterations())
                    + "\' AND " + OUT_OF_MEMORY + "=\'" + conflictFile.isOutOfMemory()+ "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    conflictFileID = resultSet.getInt(ID);
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return conflictFileID;
    }

}
