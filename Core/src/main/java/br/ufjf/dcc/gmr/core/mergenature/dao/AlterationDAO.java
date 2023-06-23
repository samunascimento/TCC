package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Alteration;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to record external changes during the conflict resolution process.
 *
 * @author João Pedro Lima
 * @since 13-11-2020
 */
public class AlterationDAO {

    public static final String TABLE = "alteration";
    public static final String ID = "id";
    public static final String FILEOA_ID = "fileOAId";
    public static final String CONTENT = "content";
    public static final String IS_ADDITION = "isAddition";
    public static final String WAS_INSIDE_CHUNK = "wasInsideChunk";

    public static int insert(Connection connection, Alteration alteration, int fileOAId) throws SQLException, IOException {
        int alterationId = 0;
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "INSERT INTO " + TABLE + " ("
                    + FILEOA_ID + ", "
                    + CONTENT + ", "
                    + IS_ADDITION + ", "
                    + WAS_INSIDE_CHUNK + ") VALUES (?,?,?,?) RETURNING " + ID + ";";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setInt(1, fileOAId);
                stmt.setString(2, alteration.getContent());
                stmt.setBoolean(3, alteration.isAddition());
                stmt.setBoolean(4, alteration.wasInsideChunk());
                ResultSet result = stmt.executeQuery();
                result.next();
                alterationId = result.getInt(1);
            } catch (SQLException ex) {
                connection.rollback();
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return alterationId;
    }

    public static List<Alteration> selectByFileOAId(Connection connection, int fileOAId) throws SQLException, IOException {
        List<Alteration> alterations = new ArrayList<>();
        if (connection == null) {
            throw new IOException("[FATAL]: connection is null!");
        } else {
            String sql = "SELECT * FROM " + TABLE + " WHERE " + FILEOA_ID + "= \'" + fileOAId + "\';";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                ResultSet resultSet = stmt.executeQuery();
                while (resultSet.next()) {
                    alterations.add(new Alteration(resultSet.getInt(ID),
                            resultSet.getString(CONTENT),
                            resultSet.getBoolean(IS_ADDITION),
                            resultSet.getBoolean(WAS_INSIDE_CHUNK)));
                }
            } catch (SQLException ex) {
                connection.rollback();
                throw ex;
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return alterations;
    }
}
