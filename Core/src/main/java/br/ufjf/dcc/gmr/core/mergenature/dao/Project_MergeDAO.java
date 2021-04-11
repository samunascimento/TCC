package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
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
public class Project_MergeDAO {

    private final Connection connection;

    public static final String IDPROJECT = "idproject";
    public static final String IDMERGE = "idmerge";

    public Project_MergeDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(int idProject, int idMerge) throws SQLException {

        String sql = "INSERT INTO project_merge ("
                + IDPROJECT + ", "
                + IDMERGE + ") VALUES (?,?);";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, idProject);
            stmt.setInt(2, idMerge);

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<Merge> selectMerges(int idproject) throws SQLException {

        List<Merge> merges = new ArrayList<>();
        MergeDAO mergeDAO = new MergeDAO(connection);

        String sql = "SELECT * FROM project_merge WHERE idproject = " + idproject;

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                merges.add(mergeDAO.select(resultSet.getInt("idmerge")));
            }

            return merges;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
    
}
