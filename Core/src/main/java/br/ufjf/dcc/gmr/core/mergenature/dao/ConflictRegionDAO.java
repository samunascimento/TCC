package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author João Pedro Lima
 * @since 11-04-2021
 */
public class ConflictRegionDAO {

    private final Connection connection;

    public static final String ID = "id";
    public static final String RAWCONFLICT = "rawconflict";
    public static final String BEFORECONTEXT = "beforecontext";
    public static final String BEGINLINE = "beginline";
    public static final String V1TEXT = "v1text";
    public static final String SEPARATORLINE = "separatorline";
    public static final String V2TEXT = "v2text";
    public static final String ENDLINE = "endline";
    public static final String AFTERCONTEXT = "aftercontext";
    public static final String SOLUTIONTEXT = "solutiontext";
    public static final String STRUCTURES = "structures";
    public static final String OUTMOSTEDSTRUCTURES = "outmostedstructures";
    public static final String ORIGINALV1FIRSTLINE = "originalv1firstline";
    public static final String ORIGINALV2FIRSTLINE = "originalv2firstline";
    public static final String DEVELOPERDECISION = "developerdecision";

    public ConflictRegionDAO(Connection connection) {
        this.connection = connection;
    }

    public int insert(ConflictRegion conflictRegion) throws SQLException {

        String sql = "INSERT INTO conflictregion ("
                + RAWCONFLICT + ", "
                + BEFORECONTEXT + ", "
                + BEGINLINE + ", "
                + V1TEXT + ", "
                + SEPARATORLINE + ", "
                + V2TEXT + ", "
                + ENDLINE + ", "
                + AFTERCONTEXT + ", "
                + SOLUTIONTEXT + ", "
                + STRUCTURES + ", "
                + OUTMOSTEDSTRUCTURES + ", "
                + ORIGINALV1FIRSTLINE + ", "
                + ORIGINALV2FIRSTLINE + ", "
                + DEVELOPERDECISION + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?) RETURNING " + ID + ";";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);

            stmt.setString(1, conflictRegion.getRawConflict());
            stmt.setString(2, conflictRegion.getBeforeContext());
            stmt.setInt(3, conflictRegion.getBeginLine());
            stmt.setString(4, conflictRegion.getV1Text());
            stmt.setInt(5, conflictRegion.getSeparatorLine());
            stmt.setString(6, conflictRegion.getV2Text());
            stmt.setInt(7, conflictRegion.getEndLine());
            stmt.setString(8, conflictRegion.getAfterContext());
            stmt.setString(9, conflictRegion.getSolutionText());
            stmt.setString(10, conflictRegion.getStructures());
            stmt.setString(11, conflictRegion.getOutmostedStructures());
            stmt.setInt(12, conflictRegion.getOriginalV1FirstLine());
            stmt.setInt(13, conflictRegion.getOriginalV2FirstLine());
            stmt.setInt(14, DeveloperDecision.getIntFromEnum(conflictRegion.getDeveloperDecision()));

            ResultSet result = stmt.executeQuery();

            result.next();

            return result.getInt(1);

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public ConflictRegion select(int id) throws SQLException {

        ConflictRegion conflictRegion = null;

        String sql = "SELECT * FROM conflictregion WHERE id = " + id;

        PreparedStatement stmt = null;
        
        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                conflictRegion = new ConflictRegion(resultSet.getInt(ID),
                        null,
                        resultSet.getString(RAWCONFLICT),
                        resultSet.getString(BEFORECONTEXT),
                        resultSet.getInt(BEGINLINE),
                        resultSet.getString(V1TEXT),
                        resultSet.getInt(SEPARATORLINE),
                        resultSet.getString(V2TEXT),
                        resultSet.getInt(ENDLINE),
                        resultSet.getString(AFTERCONTEXT),
                        resultSet.getString(SOLUTIONTEXT),
                        DeveloperDecision.getEnumFromInt(resultSet.getInt(DEVELOPERDECISION)),
                        resultSet.getString(STRUCTURES),
                        resultSet.getString(OUTMOSTEDSTRUCTURES),
                        resultSet.getInt(ORIGINALV1FIRSTLINE),
                        resultSet.getInt(ORIGINALV2FIRSTLINE));
            }
            
            return conflictRegion;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}
