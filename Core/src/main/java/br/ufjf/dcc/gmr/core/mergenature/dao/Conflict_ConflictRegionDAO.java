package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Pedro Lima
 * @since 11-04-2021
 */
public class Conflict_ConflictRegionDAO {

    private final Connection connection;

    public static final String IDCONFLICT = "idconflict";
    public static final String IDCONFLICTREGION = "idconflictregion";

    public Conflict_ConflictRegionDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(int idConflict, int idConflictRegion) throws SQLException {

        String sql = "INSERT INTO conflict_conflictregion ("
                + IDCONFLICT + ", "
                + IDCONFLICTREGION + ") VALUES (?,?);";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, idConflict);
            stmt.setInt(2, idConflictRegion);

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<ConflictRegion> selectConflictRegions(int idconflict) throws SQLException {

        List<ConflictRegion> conflictRegions = new ArrayList<>();
        ConflictRegionDAO conflictRegionDAO = new ConflictRegionDAO(connection);

        String sql = "SELECT * FROM conflict_conflictregion WHERE idconflict = " + idconflict;

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                conflictRegions.add(conflictRegionDAO.select(resultSet.getInt("idconflictregion")));
            }

            return conflictRegions;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}
