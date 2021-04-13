package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
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
public class Merge_ConflictDAO {

    private final Connection connection;

    public static final String IDMERGE = "idmerge";
    public static final String IDCONFLICT = "idconflict";

    public Merge_ConflictDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(int idMerge, int idConflict) throws SQLException {

        String sql = "INSERT INTO merge_conflict ("
                + IDMERGE + ", "
                + IDCONFLICT + ") VALUES (?,?);";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, idMerge);
            stmt.setInt(2, idConflict);

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
    
    public List<Conflict> selectConflicts(int idmerge) throws SQLException {

        List<Conflict> conflicts = new ArrayList<>();
        ConflictDAO conflictDAO = new ConflictDAO(connection);

        String sql = "SELECT * FROM merge_conflict WHERE idmerge = " + idmerge;

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                conflicts.add(conflictDAO.select(resultSet.getInt("idconflict")));
            }

            return conflicts;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}
