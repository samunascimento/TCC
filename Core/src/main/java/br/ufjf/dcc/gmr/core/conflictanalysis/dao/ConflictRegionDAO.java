/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.dao;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luan
 */
public class ConflictRegionDAO {

    private final Connection connection;

    public static final String ID = "id";
    public static final String RAWTEXT = "rawText";
    public static final String BEFORECONTEXT = "beforeContext";
    public static final String AFTERCONTEXT = "afterContext";
    public static final String V1 = "v1";
    public static final String V2 = "v2";
    public static final String SOLUTION = "solution";
    public static final String TYPESOFCONFLICTS = "typesOfConflicts";
    public static final String OUTMOSTEDTYPESOFCONFLICTS = "outmostedTypesOfConflicts";
    public static final String BEGINLINE = "beginLine";
    public static final String SEPARATORLINE = "separatorLine";
    public static final String ENDLINE = "endLine";
    public static final String ORIGINALV1STARTLINE = "originalV1StartLine";
    public static final String ORIGINALV1STOPLINE = "originalV1StopLine";
    public static final String ORIGINALV2STARTLINE = "originalV2StartLine";
    public static final String ORIGINALV2STOPLINE = "originalV2StopLine";
    public static final String V1SIZE = "v1Size";
    public static final String V2SIZE = "v2Size";
    public static final String DEVELOPERDECISION = "developerDecision";

    public ConflictRegionDAO(Connection connection) {
        this.connection = connection;
    }

    public int insert(ConflictRegion conflictRegion) throws SQLException {

        String sql = "INSERT INTO conflctiFile "
                + "(" + RAWTEXT + ", " + BEFORECONTEXT + ", " + AFTERCONTEXT + ", "
                + V1 + ", " + V2 + ", " + SOLUTION + ", " + TYPESOFCONFLICTS + ", " + OUTMOSTEDTYPESOFCONFLICTS + ", "
                + BEGINLINE + ", " + SEPARATORLINE + ", " + ENDLINE + ", " + ORIGINALV1STARTLINE + ", "
                + ORIGINALV1STOPLINE + ", " + ORIGINALV2STARTLINE + ", " + ORIGINALV2STOPLINE
                + V1SIZE + ", " + V2SIZE + ", " + DEVELOPERDECISION + ") "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
                + "RETURNING id;";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setString(1, conflictRegion.getRawText());
            stmt.setString(2, conflictRegion.getBeforeContext());
            stmt.setString(3, conflictRegion.getAfterContext());
            stmt.setString(4, conflictRegion.getV1());
            stmt.setString(5, conflictRegion.getV2());
            stmt.setString(6, conflictRegion.getSolution());
            stmt.setString(7, conflictRegion.getTypesOfConflict());
            stmt.setString(8, conflictRegion.getOutmostedTypeOfConflict());
            stmt.setInt(9, conflictRegion.getBeginLine());
            stmt.setInt(10, conflictRegion.getSeparatorLine());
            stmt.setInt(11, conflictRegion.getEndLine());
            stmt.setInt(12, conflictRegion.getOriginalV1StartLine());
            stmt.setInt(13, conflictRegion.getOriginalV1StopLine());
            stmt.setInt(14, conflictRegion.getOriginalV2StartLine());
            stmt.setInt(15, conflictRegion.getOriginalV2StopLine());
            stmt.setInt(16, conflictRegion.getV1Size());
            stmt.setInt(17, conflictRegion.getV2Size());
            stmt.setString(18,conflictRegion.getDeveloperDecision());

            ResultSet result = stmt.executeQuery();

            result.next();

            return result.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<ConflictRegion> select() throws SQLException {
        ConflictRegion commit;

        List<ConflictRegion> commitsList = new ArrayList<>();

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM ConflictRegion";

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new ConflictRegion();
                commit.setRawText(resultSet.getString(RAWTEXT));
                commit.setBeforeContext(resultSet.getString(BEFORECONTEXT));
                commit.setAfterContext(resultSet.getString(AFTERCONTEXT));
                commit.setV1(resultSet.getString(V1));
                commit.setV2(resultSet.getString(V2));
                commit.setSolution(resultSet.getString(SOLUTION));
                commit.setTypesOfConflicts(resultSet.getString(TYPESOFCONFLICTS));
                commit.setOutmostedTypesOfConflicts(resultSet.getString(OUTMOSTEDTYPESOFCONFLICTS));
                commit.setBeginLine(resultSet.getInt(BEGINLINE));
                commit.setSeparatorLine(resultSet.getInt(SEPARATORLINE));
                commit.setEndLine(resultSet.getInt(ENDLINE));
                commit.setOriginalV1StartLine(resultSet.getInt(ORIGINALV1STARTLINE));
                commit.setOriginalV1StopLine(resultSet.getInt(ORIGINALV1STOPLINE));
                commit.setOriginalV2StartLine(resultSet.getInt(ORIGINALV2STARTLINE));
                commit.setOriginalV2StopLine(resultSet.getInt(ORIGINALV2STOPLINE));
                commit.setV1Size(resultSet.getInt(V1SIZE));
                commit.setV2Size(resultSet.getInt(V2SIZE));
                commit.setDeveloperDecision(resultSet.getString(DEVELOPERDECISION));
                commit.setId(resultSet.getInt(ID));

                commitsList.add(commit);

            }
            return commitsList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public ConflictRegion select(int id) throws SQLException {
        ConflictRegion commit = null;

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM ConflictRegion cd where cd.id = " + id;

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                commit = new ConflictRegion();
                commit.setRawText(resultSet.getString(RAWTEXT));
                commit.setBeforeContext(resultSet.getString(BEFORECONTEXT));
                commit.setAfterContext(resultSet.getString(AFTERCONTEXT));
                commit.setV1(resultSet.getString(V1));
                commit.setV2(resultSet.getString(V2));
                commit.setSolution(resultSet.getString(SOLUTION));
                commit.setTypesOfConflicts(resultSet.getString(TYPESOFCONFLICTS));
                commit.setOutmostedTypesOfConflicts(resultSet.getString(OUTMOSTEDTYPESOFCONFLICTS));
                commit.setBeginLine(resultSet.getInt(BEGINLINE));
                commit.setSeparatorLine(resultSet.getInt(SEPARATORLINE));
                commit.setEndLine(resultSet.getInt(ENDLINE));
                commit.setOriginalV1StartLine(resultSet.getInt(ORIGINALV1STARTLINE));
                commit.setOriginalV1StopLine(resultSet.getInt(ORIGINALV1STOPLINE));
                commit.setOriginalV2StartLine(resultSet.getInt(ORIGINALV2STARTLINE));
                commit.setOriginalV2StopLine(resultSet.getInt(ORIGINALV2STOPLINE));
                commit.setV1Size(resultSet.getInt(V1SIZE));
                commit.setV2Size(resultSet.getInt(V2SIZE));
                commit.setDeveloperDecision(resultSet.getString(DEVELOPERDECISION));
                commit.setId(resultSet.getInt(ID));

            }

            return commit;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM ConflictRegion WHERE ID = ?";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void update(ConflictRegion conflictRegion, int id) throws SQLException {
        String sql = "UPDATE ConflictRegion SET "
                + RAWTEXT + " = ?, "
                + BEFORECONTEXT + " = ?, "
                + AFTERCONTEXT + " = ?, "
                + V1 + " = ?, "
                + V2 + " = ?, "
                + SOLUTION + " = ? "
                + TYPESOFCONFLICTS + " = ? "
                + OUTMOSTEDTYPESOFCONFLICTS + " = ? "
                + BEGINLINE + " = ? "
                + SEPARATORLINE + " = ? "
                + ENDLINE + " = ? "
                + ORIGINALV1STARTLINE + " = ? "
                + ORIGINALV1STOPLINE + " = ? "
                + ORIGINALV2STARTLINE + " = ? "
                + ORIGINALV2STOPLINE + " = ? "
                + V1SIZE + " = ? "
                + V2SIZE + " = ? "
                + DEVELOPERDECISION + " = ? "
                + "WHERE ID = ?";

        System.out.println(sql);

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, conflictRegion.getRawText());
            stmt.setString(2, conflictRegion.getBeforeContext());
            stmt.setString(3, conflictRegion.getAfterContext());
            stmt.setString(4, conflictRegion.getV1());
            stmt.setString(5, conflictRegion.getV2());
            stmt.setString(6, conflictRegion.getSolution());
            stmt.setString(7, conflictRegion.getTypesOfConflicts());
            stmt.setString(8, conflictRegion.getOutmostedTypeOfConflict());
            stmt.setInt(9, conflictRegion.getBeginLine());
            stmt.setInt(10, conflictRegion.getSeparatorLine());
            stmt.setInt(11, conflictRegion.getEndLine());
            stmt.setInt(12, conflictRegion.getOriginalV1StartLine());
            stmt.setInt(13, conflictRegion.getOriginalV1StopLine());
            stmt.setInt(14, conflictRegion.getOriginalV2StartLine());
            stmt.setInt(15, conflictRegion.getOriginalV2StopLine());
            stmt.setInt(16, conflictRegion.getV1Size());
            stmt.setInt(17, conflictRegion.getV2Size());
            stmt.setString(18,conflictRegion.getDeveloperDecision());
            stmt.setInt(19, id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

}
