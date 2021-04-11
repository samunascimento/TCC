package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author João Pedro Lima
 * @since 11-04-2021
 */
public class ConflictDAO {

    private final Connection connection;

    public static final String ID = "id";
    public static final String PARENT1FILEPATH = "parent1filepath";
    public static final String PARENT2FILEPATH = "parent2filepath";
    public static final String ANCESTORFILEPATH = "ancestorfilepath";
    public static final String HASOUTSIDEALTERATIONS = "hasoutsidealterations";
    public static final String HASOUTSIDEALTERATIONSIGNORINGFORMATTING = "hasoutsidealterationsignoringformatting";
    public static final String CONFLICTTYPE = "conflicttype";

    public ConflictDAO(Connection connection) {
        this.connection = connection;
    }

    public int insert(Conflict conflict) throws SQLException {

        ConflictRegionDAO conflictRegionDAO = new ConflictRegionDAO(connection);
        Conflict_ConflictRegionDAO conflict_ConflictRegionDAO = new Conflict_ConflictRegionDAO(connection);

        String sql = "INSERT INTO conflict ("
                + PARENT1FILEPATH + ", "
                + PARENT2FILEPATH + ", "
                + ANCESTORFILEPATH + ", "
                + HASOUTSIDEALTERATIONS + ", "
                + HASOUTSIDEALTERATIONSIGNORINGFORMATTING + ", "
                + CONFLICTTYPE + ") VALUES (?,?,?,?,?,?) RETURNING " + ID + ";";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);

            stmt.setString(1, conflict.getParent1FilePath());
            stmt.setString(2, conflict.getParent2FilePath());
            stmt.setString(3, conflict.getAncestorFilePath());
            stmt.setBoolean(4, conflict.hasOutsideAlterations());
            stmt.setBoolean(5, conflict.hasOutsideAlterationsIgnoringFormatting());
            stmt.setInt(6, ConflictType.getIntFromEnum(conflict.getConflictType()));

            ResultSet result = stmt.executeQuery();

            result.next();

            int conflictID = result.getInt(1);
            int conflictRegionID;

            for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                conflictRegionID = conflictRegionDAO.insert(conflictRegion);
                conflict_ConflictRegionDAO.insert(conflictID, conflictRegionID);
            }

            return conflictID;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
    
    public Conflict select(int id) throws SQLException {

        Conflict conflict = null;
        Conflict_ConflictRegionDAO conflict_ConflictRegionDAO = new Conflict_ConflictRegionDAO(connection);

        String sql = "SELECT * FROM conflict WHERE id = " + id;

        PreparedStatement stmt = null;
        
        try {
            
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                conflict = new Conflict(resultSet.getInt(ID),
                        resultSet.getString(PARENT1FILEPATH),
                        resultSet.getString(PARENT2FILEPATH),
                        resultSet.getString(ANCESTORFILEPATH),
                        null,
                        ConflictType.getEnumFromInt(resultSet.getInt(CONFLICTTYPE)),
                        resultSet.getBoolean(HASOUTSIDEALTERATIONS),
                        resultSet.getBoolean(HASOUTSIDEALTERATIONSIGNORINGFORMATTING),
                        null);
            }
            
            conflict.setConflictRegions(conflict_ConflictRegionDAO.selectConflictRegions(conflict.getId()));
            
            for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                conflictRegion.setConflict(conflict);
            }

            return conflict;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }

    }

}