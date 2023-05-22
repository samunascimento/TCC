package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import br.ufjf.dcc.gmr.core.mergenature.model.FileOA;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Pedro Lima
 */
public class FileOADAO {

    public static final String TABLE = "fileoa";
    public static final String ID = "id";
    public static final String MERGE_ID = "mergeId";
    public static final String CONFLICT_FILE_ID = "conflictFileId";
    public static final String FILE_PATH = "filePath";

    public static int insert(Connection connection, FileOA fileOA, int mergeId, int conflictFileId) throws SQLException, IOException {
        int fileOAId = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO " + TABLE + " ("
                    + MERGE_ID + ", "
                    + CONFLICT_FILE_ID + ", "
                    + FILE_PATH + ") VALUES (?,?,?) RETURNING " + ID + ";";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, mergeId);
                if (conflictFileId == 0) {
                    stmt.setNull(2, Types.NULL);
                } else {
                    stmt.setInt(2, conflictFileId);
                }
                stmt.setString(3, fileOA.getFilePath());
                ResultSet result = stmt.executeQuery();
                result.next();
                fileOAId = result.getInt(1);
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return fileOAId;
    }

    public static List<FileOA> selectByMergeId(Connection connection, int mergeId) throws SQLException, IOException {
        List<FileOA> fileOAs = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + MERGE_ID + "= \'" + mergeId + "\';";
            PreparedStatement stmt = null;
            ConflictFile conflictFile;
            int conflictFileId;
            int id;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    conflictFileId = resultSet.getInt(CONFLICT_FILE_ID);
                    if (conflictFileId == 0) {
                        conflictFile = null;
                    } else {
                        conflictFile = new ConflictFile();
                        conflictFile.setId(conflictFileId);
                    }
                    id = resultSet.getInt(ID);
                    fileOAs.add(new FileOA(resultSet.getInt(ID),
                            resultSet.getString(FILE_PATH),
                            AlterationDAO.selectByFileOAId(connection, id),
                            conflictFile));
                }
            } catch (SQLException ex) {
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return fileOAs;
    }
}
