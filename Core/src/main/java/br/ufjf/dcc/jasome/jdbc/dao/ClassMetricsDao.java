package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.ClassMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anton
 */
public class ClassMetricsDao {

    private Connection connection;
    List<ClassMetrics> listClassMetrics;
    ClassMetrics classMetrics;
    ResultSet tableKeys;

    public ClassMetricsDao(Connection connection) {
        this.connection = connection;
        listClassMetrics = new ArrayList<>();
    }

    public int insert(ClassMetrics classMetrics) throws SQLException {
        String sql = "INSERT INTO tb_classMetrics "
                + "(aaID,adID,aiID,aitID,aoID,avID,clrciID,cltciID,ditID,hmdID,hmiID,mhfID,mifID,maID,mdID,"
                + "miID,mitID,moID,nfID,nmID,nmaID,nmiID,noaID,nochID,nodID,nolID,nopaID,normID,npfID,npmID,nsfID,"
                + "nsmID,pmrID,pmdID,pmiID,rtlocID,sixID,tlocID,wmcID,nmirID,cfID,pfID,aifID,ahID,ahfID,lcomID,nodeID,nodaID,className)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) "
                + "RETURNING id;";

        PreparedStatement stmt = null;
        ResultSet tableKeys = null;

        try {
            stmt = connection.prepareStatement(sql);
            if (classMetrics.getAa() == null) {
                stmt.setNull(1, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(1, classMetrics.getAa().getId());
            }
            if (classMetrics.getAd() == null) {
                stmt.setNull(2, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(2, classMetrics.getAd().getId());
            }
            if (classMetrics.getAi() == null) {
                stmt.setNull(3, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(3, classMetrics.getAi().getId());
            }
            if (classMetrics.getAit() == null) {
                stmt.setNull(4, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(4, classMetrics.getAit().getId());
            }
            if (classMetrics.getAo() == null) {
                stmt.setNull(5, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(5, classMetrics.getAo().getId());
            }
            if (classMetrics.getAv() == null) {
                stmt.setNull(6, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(6, classMetrics.getAv().getId());
            }
            if (classMetrics.getClrci() == null) {
                stmt.setNull(7, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(7, classMetrics.getClrci().getId());
            }
            if (classMetrics.getCltci() == null) {
                stmt.setNull(8, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(8, classMetrics.getCltci().getId());
            }
            if (classMetrics.getDit() == null) {
                stmt.setNull(9, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(9, classMetrics.getDit().getId());
            }
            if (classMetrics.getAa() == null) {
                stmt.setNull(10, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(10, classMetrics.getHmd().getId());
            }
            if (classMetrics.getHmi() == null) {
                stmt.setNull(11, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(11, classMetrics.getHmi().getId());
            }
            if (classMetrics.getMhf() == null) {
                stmt.setNull(12, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(12, classMetrics.getMhf().getId());
            }
            if (classMetrics.getMif() == null) {
                stmt.setNull(13, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(13, classMetrics.getMif().getId());
            }
            if (classMetrics.getMa() == null) {
                stmt.setNull(14, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(14, classMetrics.getMa().getId());
            }
            if (classMetrics.getMd() == null) {
                stmt.setNull(15, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(15, classMetrics.getMd().getId());
            }
            if (classMetrics.getMi() == null) {
                stmt.setNull(16, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(16, classMetrics.getMi().getId());
            }
            if (classMetrics.getMit() == null) {
                stmt.setNull(17, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(17, classMetrics.getMit().getId());
            }
            if (classMetrics.getMo() == null) {
                stmt.setNull(18, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(18, classMetrics.getMo().getId());
            }
            if (classMetrics.getNf() == null) {
                stmt.setNull(19, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(19, classMetrics.getNf().getId());
            }
            if (classMetrics.getNm() == null) {
                stmt.setNull(20, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(20, classMetrics.getNm().getId());
            }
            if (classMetrics.getNma() == null) {
                stmt.setNull(21, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(21, classMetrics.getNma().getId());
            }
            if (classMetrics.getNmi() == null) {
                stmt.setNull(22, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(22, classMetrics.getNmi().getId());
            }
            if (classMetrics.getNoa() == null) {
                stmt.setNull(23, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(23, classMetrics.getNoa().getId());
            }
            if (classMetrics.getNoch() == null) {
                stmt.setNull(24, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(24, classMetrics.getNoch().getId());
            }
            if (classMetrics.getNod() == null) {
                stmt.setNull(25, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(25, classMetrics.getNod().getId());
            }
            if (classMetrics.getNol() == null) {
                stmt.setNull(26, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(26, classMetrics.getNol().getId());
            }
            if (classMetrics.getNopa() == null) {
                stmt.setNull(27, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(27, classMetrics.getNopa().getId());
            }
            if (classMetrics.getNorm() == null) {
                stmt.setNull(28, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(28, classMetrics.getNorm().getId());
            }
            if (classMetrics.getNpf() == null) {
                stmt.setNull(29, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(29, classMetrics.getNpf().getId());
            }
            if (classMetrics.getNpm() == null) {
                stmt.setNull(30, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(30, classMetrics.getNpm().getId());
            }
            if (classMetrics.getNsf() == null) {
                stmt.setNull(31, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(31, classMetrics.getNsf().getId());
            }
            if (classMetrics.getNsm() == null) {
                stmt.setNull(32, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(32, classMetrics.getNsm().getId());
            }
            if (classMetrics.getPmr() == null) {
                stmt.setNull(33, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(33, classMetrics.getPmr().getId());
            }
            if (classMetrics.getPmd() == null) {
                stmt.setNull(34, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(34, classMetrics.getPmd().getId());
            }
            if (classMetrics.getPmi() == null) {
                stmt.setNull(35, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(35, classMetrics.getPmi().getId());
            }
            if (classMetrics.getRtloc() == null) {
                stmt.setNull(36, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(36, classMetrics.getRtloc().getId());
            }
            if (classMetrics.getSix() == null) {
                stmt.setNull(37, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(37, classMetrics.getSix().getId());
            }
            if (classMetrics.getTloc() == null) {
                stmt.setNull(38, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(38, classMetrics.getTloc().getId());
            }
            if (classMetrics.getWmc() == null) {
                stmt.setNull(39, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(39, classMetrics.getWmc().getId());
            }
            if (classMetrics.getNmir() == null) {
                stmt.setNull(40, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(40, classMetrics.getNmir().getId());
            }
            if (classMetrics.getCf() == null) {
                stmt.setNull(41, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(41, classMetrics.getCf().getId());
            }
            if (classMetrics.getPf() == null) {
                stmt.setNull(42, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(42, classMetrics.getPf().getId());
            }
            if (classMetrics.getAif() == null) {
                stmt.setNull(43, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(43, classMetrics.getAif().getId());
            }
            if (classMetrics.getAh() == null) {
                stmt.setNull(44, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(44, classMetrics.getAh().getId());
            }
            if (classMetrics.getAhf() == null) {
                stmt.setNull(45, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(45, classMetrics.getAhf().getId());
            }
            if (classMetrics.getLcom() == null) {
                stmt.setNull(46, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(46, classMetrics.getLcom().getId());
            }
            if (classMetrics.getNode() == null) {
                stmt.setNull(47, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(47, classMetrics.getNode().getId());
            }
            if (classMetrics.getNoda() == null) {
                stmt.setNull(48, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(48, classMetrics.getNoda().getId());
            }

            stmt.setString(49, classMetrics.getName());
            //stmt.setInt(40, classMetrics.getPackageId());

            tableKeys = stmt.executeQuery();

            tableKeys.next();

            int autoGeneratedID = tableKeys.getInt(1);
            stmt.close();
            return autoGeneratedID;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM tb_classMetrics WHERE ID = ?";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            //set values
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<ClassMetrics> select() throws SQLException {

        ClassMetrics classMetrics = null;
        List<ClassMetrics> listaClassMetrics = new ArrayList<>();
        MetricDao metricDao = new MetricDao(connection);

        String sql = "SELECT * FROM tb_classMetrics";

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        try {
            stmt = connection.prepareStatement(sql);

            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                classMetrics = new ClassMetrics();

                classMetrics.setAa(insert(resultSet, metricDao, "aaID"));
                classMetrics.setAd(insert(resultSet, metricDao, "adID"));
                classMetrics.setAi(insert(resultSet, metricDao, "aiID"));
                classMetrics.setAit(insert(resultSet, metricDao, "aitID"));
                classMetrics.setAo(insert(resultSet, metricDao, "aoID"));
                classMetrics.setAv(insert(resultSet, metricDao, "avID"));
                classMetrics.setClrci(insert(resultSet, metricDao, "clrciID"));
                classMetrics.setCltci(insert(resultSet, metricDao, "cltciID"));
                classMetrics.setDit(insert(resultSet, metricDao, "ditID"));
                classMetrics.setHmd(insert(resultSet, metricDao, "hmdID"));
                classMetrics.setHmi(insert(resultSet, metricDao, "hmiID"));
                classMetrics.setMhf(insert(resultSet, metricDao, "mhfID"));
                classMetrics.setMif(insert(resultSet, metricDao, "mifID"));
                classMetrics.setMa(insert(resultSet, metricDao, "maID"));
                classMetrics.setMd(insert(resultSet, metricDao, "mdID"));
                classMetrics.setMi(insert(resultSet, metricDao, "miID"));
                classMetrics.setMit(insert(resultSet, metricDao, "mitID"));
                classMetrics.setMo(insert(resultSet, metricDao, "moID"));
                classMetrics.setNf(insert(resultSet, metricDao, "nfID"));
                classMetrics.setNm(insert(resultSet, metricDao, "nmID"));
                classMetrics.setNma(insert(resultSet, metricDao, "nmaID"));
                classMetrics.setNmi(insert(resultSet, metricDao, "nmiID"));
                classMetrics.setNoa(insert(resultSet, metricDao, "noaID"));
                classMetrics.setNoch(insert(resultSet, metricDao, "nochID"));
                classMetrics.setNod(insert(resultSet, metricDao, "nodID"));
                classMetrics.setNol(insert(resultSet, metricDao, "nolID"));
                classMetrics.setNopa(insert(resultSet, metricDao, "nopaID"));
                classMetrics.setNorm(insert(resultSet, metricDao, "normID"));
                classMetrics.setNpf(insert(resultSet, metricDao, "npfID"));
                classMetrics.setNpm(insert(resultSet, metricDao, "npmID"));
                classMetrics.setNsf(insert(resultSet, metricDao, "nsfID"));
                classMetrics.setNsm(insert(resultSet, metricDao, "nsmID"));
                classMetrics.setPmr(insert(resultSet, metricDao, "pmrID"));
                classMetrics.setPmd(insert(resultSet, metricDao, "pmdID"));
                classMetrics.setPmi(insert(resultSet, metricDao, "pmiID"));
                classMetrics.setRtloc(insert(resultSet, metricDao, "rtlocID"));
                classMetrics.setSix(insert(resultSet, metricDao, "sixID"));
                classMetrics.setTloc(insert(resultSet, metricDao, "tlocID"));
                classMetrics.setWmc(insert(resultSet, metricDao, "wmcID"));
                classMetrics.setNmir(insert(resultSet, metricDao, "nmirID"));
                classMetrics.setCf(insert(resultSet, metricDao, "cfID"));
                classMetrics.setPf(insert(resultSet, metricDao, "pfID"));
                classMetrics.setAif(insert(resultSet, metricDao, "aifID"));
                classMetrics.setAh(insert(resultSet, metricDao, "ahID"));
                classMetrics.setAhf(insert(resultSet, metricDao, "ahfID"));
                classMetrics.setLcom(insert(resultSet, metricDao, "lcomID"));
                classMetrics.setNode(insert(resultSet, metricDao, "nodeID"));
                classMetrics.setNoda(insert(resultSet, metricDao, "nodaID"));

                classMetrics.setId(resultSet.getInt("id"));

                classMetrics.setName(resultSet.getString("className"));

            }
            listaClassMetrics.add(classMetrics);
            return listaClassMetrics;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<ClassMetrics> selectID(int id) throws SQLException {

        ClassMetrics classMetrics = null;

        MetricDao metricDao = new MetricDao(connection);

        String sql = "SELECT * FROM tb_classMetrics WHERE ID = " + id;

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        try {
            stmt = connection.prepareStatement(sql);

            resultSet = stmt.executeQuery();

            resultSet.next();
            classMetrics = new ClassMetrics();

            classMetrics.setAa(insert(resultSet, metricDao, "aaID"));
            classMetrics.setAd(insert(resultSet, metricDao, "adID"));
            classMetrics.setAi(insert(resultSet, metricDao, "aiID"));
            classMetrics.setAit(insert(resultSet, metricDao, "aitID"));
            classMetrics.setAo(insert(resultSet, metricDao, "aoID"));
            classMetrics.setAv(insert(resultSet, metricDao, "avID"));
            classMetrics.setClrci(insert(resultSet, metricDao, "clrciID"));
            classMetrics.setCltci(insert(resultSet, metricDao, "cltciID"));
            classMetrics.setDit(insert(resultSet, metricDao, "ditID"));
            classMetrics.setHmd(insert(resultSet, metricDao, "hmdID"));
            classMetrics.setHmi(insert(resultSet, metricDao, "hmiID"));
            classMetrics.setMhf(insert(resultSet, metricDao, "mhfID"));
            classMetrics.setMif(insert(resultSet, metricDao, "mifID"));
            classMetrics.setMa(insert(resultSet, metricDao, "maID"));
            classMetrics.setMd(insert(resultSet, metricDao, "mdID"));
            classMetrics.setMi(insert(resultSet, metricDao, "miID"));
            classMetrics.setMit(insert(resultSet, metricDao, "mitID"));
            classMetrics.setMo(insert(resultSet, metricDao, "moID"));
            classMetrics.setNf(insert(resultSet, metricDao, "nfID"));
            classMetrics.setNm(insert(resultSet, metricDao, "nmID"));
            classMetrics.setNma(insert(resultSet, metricDao, "nmaID"));
            classMetrics.setNmi(insert(resultSet, metricDao, "nmiID"));
            classMetrics.setNoa(insert(resultSet, metricDao, "noaID"));
            classMetrics.setNoch(insert(resultSet, metricDao, "nochID"));
            classMetrics.setNod(insert(resultSet, metricDao, "nodID"));
            classMetrics.setNol(insert(resultSet, metricDao, "nolID"));
            classMetrics.setNopa(insert(resultSet, metricDao, "nopaID"));
            classMetrics.setNorm(insert(resultSet, metricDao, "normID"));
            classMetrics.setNpf(insert(resultSet, metricDao, "npfID"));
            classMetrics.setNpm(insert(resultSet, metricDao, "npmID"));
            classMetrics.setNsf(insert(resultSet, metricDao, "nsfID"));
            classMetrics.setNsm(insert(resultSet, metricDao, "nsmID"));
            classMetrics.setPmr(insert(resultSet, metricDao, "pmrID"));
            classMetrics.setPmd(insert(resultSet, metricDao, "pmdID"));
            classMetrics.setPmi(insert(resultSet, metricDao, "pmiID"));
            classMetrics.setRtloc(insert(resultSet, metricDao, "rtlocID"));
            classMetrics.setSix(insert(resultSet, metricDao, "sixID"));
            classMetrics.setTloc(insert(resultSet, metricDao, "tlocID"));
            classMetrics.setWmc(insert(resultSet, metricDao, "wmcID"));
            classMetrics.setNmir(insert(resultSet, metricDao, "nmirID"));
            classMetrics.setCf(insert(resultSet, metricDao, "cfID"));
            classMetrics.setPf(insert(resultSet, metricDao, "pfID"));
            classMetrics.setAif(insert(resultSet, metricDao, "aifID"));
            classMetrics.setAh(insert(resultSet, metricDao, "ahID"));
            classMetrics.setAhf(insert(resultSet, metricDao, "ahfID"));
            classMetrics.setLcom(insert(resultSet, metricDao, "lcomID"));
            classMetrics.setNode(insert(resultSet, metricDao, "nodeID"));
            classMetrics.setNoda(insert(resultSet, metricDao, "nodaID"));

            classMetrics.setId(resultSet.getInt("id"));

            classMetrics.setName(resultSet.getString("className"));

            return listClassMetrics;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public Metric insert(ResultSet resultSet, MetricDao metricDao, String name) throws SQLException {

        if (resultSet.getInt(name) == 0) {
            return null;
        } else {
            int ID = resultSet.getInt(name);
            Metric metric = metricDao.selectID(ID);
            return metric;
        }
    }

    public void update(ClassMetrics classMetric, int id) throws SQLException { //arrumar
        String sql = null;// "UPDATE tb_Classmetrics SET name = '" + metric.getName() + "', description = '" + metric.getDescription() + "', value = '" + metric.getValue() +  "' WHERE ID = '" + id + "';";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void updatePackageId(ClassMetrics classMetric) throws SQLException {
        String sql = "UPDATE tb_classMetrics SET packageID = ? WHERE ID = ? ;";
        System.out.println(sql);

        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, classMetric.getPackageId());
            stmt.setInt(2, classMetric.getId());
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
