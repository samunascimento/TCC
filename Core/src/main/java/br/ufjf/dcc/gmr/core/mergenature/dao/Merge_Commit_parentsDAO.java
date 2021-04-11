package br.ufjf.dcc.gmr.core.mergenature.dao;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
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
public class Merge_Commit_parentsDAO {

    private final Connection connection;

    public static final String IDMERGE = "idmerge";
    public static final String IDCOMMIT = "idcommit";

    public Merge_Commit_parentsDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(int idMerge, int idCommit) throws SQLException {

        String sql = "INSERT INTO merge_commit_parents ("
                + IDMERGE + ", "
                + IDCOMMIT + ") VALUES (?,?);";

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, idMerge);
            stmt.setInt(2, idCommit);

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<Commit> selectParentsCommits(int idmerge) throws SQLException {

        List<Commit> parents = new ArrayList<>();
        CommitDAO commitDAO = new CommitDAO(connection);

        String sql = "SELECT * FROM merge_commit_parents WHERE idmerge = " + idmerge;

        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                parents.add(commitDAO.select(resultSet.getInt("idcommit")));
            }

            return parents;

        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }

    }

}
