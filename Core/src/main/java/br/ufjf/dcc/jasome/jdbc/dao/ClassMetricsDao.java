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

    public ClassMetricsDao(Connection connection){
        this.connection = connection;
        listClassMetrics = new ArrayList<>();
    }
    
    
    public int insert(ClassMetrics classMetrics) {
        String sql = "INSERT INTO tb_classMetrics "
                + "(aaID,adID,aiID,aitID,aoID,avID,clrciID,cltciID,ditID,hmdID,hmiID,mhfID,mifID,maID,mdID,"
                + "miID,mitID,moID,nfID,nmID,nmaID,nmiID,noaID,nochID,nodID,nolID,nopaID,normID,npfID,npmID,nsfID,"
                + "nsmID,pmrID,pmdID,pmiID,rtlocID,sixID,tlocID,wmcID)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) "
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
                stmt.setInt(9, classMetrics.getHmd().getId());
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
                stmt.setInt(32, classMetrics.getNsf().getId());
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
            //stmt.setInt(40, classMetrics.getPackageId());
            
            tableKeys = stmt.executeQuery();
            
            tableKeys.next();
            
            int autoGeneratedID = tableKeys.getInt(1);
            stmt.close();
            return autoGeneratedID;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void delete(int id) {
        String sql = "DELETE FROM tb_classMetrics WHERE ID = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            //set values
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<ClassMetrics> select() throws SQLException{
        
        ClassMetrics classMetrics = null;
        List<ClassMetrics> listClassMetrics = new ArrayList<>();
        MetricDao metricDao = new MetricDao(connection);
        
        String sql = "SELECT * FROM tb_classMetrics";
        
        PreparedStatement stmt = null;

        ResultSet resultSet = null;
        
        try{
            stmt = connection.prepareStatement(sql);
            
            resultSet = stmt.executeQuery();

            while(resultSet.next()){
                classMetrics = new ClassMetrics();
                
                int aaID = resultSet.getInt("aaID");
                int adID = resultSet.getInt("adID");
                int aiID = resultSet.getInt("aiID");
                int aitID = resultSet.getInt("aitID");
                int aoID = resultSet.getInt("aoID");
                int avID = resultSet.getInt("avID");
                int clrciID = resultSet.getInt("clrciID");
                int cltciID = resultSet.getInt("cltciID");
                int ditID = resultSet.getInt("ditID");
                int hmdID = resultSet.getInt("hmdID");
                int hmiID = resultSet.getInt("hmiID");
                int mhfID = resultSet.getInt("mhfID");
                int mifID = resultSet.getInt("mifID");
                int maID = resultSet.getInt("maID");
                int mdID = resultSet.getInt("mdID");
                int miID = resultSet.getInt("miID");
                int mitID = resultSet.getInt("mitID");
                int moID = resultSet.getInt("moID");
                int nfID = resultSet.getInt("nfID");
                int nmID = resultSet.getInt("nmID");
                int nmaID = resultSet.getInt("nmaID");
                int nmiID = resultSet.getInt("nmiID");
                int noaID = resultSet.getInt("noaID");
                int nochID = resultSet.getInt("nochID");
                int nodID = resultSet.getInt("nodID");
                int nolID = resultSet.getInt("nolID");
                int nopaID = resultSet.getInt("nopaID");
                int normID = resultSet.getInt("normID");
                int npfID = resultSet.getInt("npfID");
                int npmID = resultSet.getInt("npmID");
                int nsfID = resultSet.getInt("nsfID");
                int nsmID = resultSet.getInt("nsmID");
                int pmrID = resultSet.getInt("pmrID");
                int pmdID = resultSet.getInt("pmdID");
                int pmiID = resultSet.getInt("pmiID");
                int rtlocID = resultSet.getInt("rtlocID");
                int sixID = resultSet.getInt("sixID");
                int tlocID = resultSet.getInt("tlocID");
                int wmcID = resultSet.getInt("wmcID");

                Metric aaIDMetric = metricDao.selectID(aaID);
                Metric adIDMetric = metricDao.selectID(adID);
                Metric aiIDMetric = metricDao.selectID(aiID);
                Metric aitIDMetric = metricDao.selectID(aitID);
                Metric aoIDMetric = metricDao.selectID(aoID);
                Metric avIDMetric = metricDao.selectID(avID);
                Metric clrciIDMetric = metricDao.selectID(clrciID);
                Metric cltciIDMetric = metricDao.selectID(cltciID);
                Metric ditIDMetric = metricDao.selectID(ditID);
                Metric hmdIDMetric = metricDao.selectID(hmdID);
                Metric hmiIDMetric = metricDao.selectID(hmiID);
                Metric mhfIDMetric = metricDao.selectID(mhfID);
                Metric mifIDMetric = metricDao.selectID(mifID);
                Metric maIDMetric = metricDao.selectID(maID);
                Metric mdIDMetric = metricDao.selectID(mdID);
                Metric miIDMetric = metricDao.selectID(miID);
                Metric mitIDMetric = metricDao.selectID(mitID);
                Metric moIDMetric = metricDao.selectID(moID);
                Metric nfIDMetric = metricDao.selectID(nfID);
                Metric nmIDMetric = metricDao.selectID(nmID);
                Metric nmaIDMetric = metricDao.selectID(nmaID);
                Metric nmiIDMetric = metricDao.selectID(nmiID);
                Metric noaIDMetric = metricDao.selectID(noaID);
                Metric nochIDMetric = metricDao.selectID(nochID);
                Metric nodIDMetric = metricDao.selectID(nodID);
                Metric nolIDMetric = metricDao.selectID(nolID);
                Metric nopaIDMetric = metricDao.selectID(nopaID);
                Metric normIDMetric = metricDao.selectID(normID);
                Metric npfIDMetric = metricDao.selectID(npfID);
                Metric npmIDMetric = metricDao.selectID(npmID);
                Metric nsfIDMetric = metricDao.selectID(nsfID);
                Metric nsmIDMetric = metricDao.selectID(nsmID);
                Metric pmrIDMetric = metricDao.selectID(pmrID);
                Metric pmdIDMetric = metricDao.selectID(pmdID);
                Metric pmiIDMetric = metricDao.selectID(pmiID);
                Metric rtlocIDMetric = metricDao.selectID(rtlocID);
                Metric sixIDMetric = metricDao.selectID(sixID);
                Metric tlocIDMetric = metricDao.selectID(tlocID);
                Metric wmcIDMetric = metricDao.selectID(wmcID);             
                
                classMetrics.setAa(aaIDMetric);
                classMetrics.setAd(adIDMetric);
                classMetrics.setAi(aiIDMetric);
                classMetrics.setAit(aitIDMetric);
                classMetrics.setAo(aoIDMetric);
                classMetrics.setAv(avIDMetric);
                classMetrics.setClrci(clrciIDMetric);
                classMetrics.setCltci(cltciIDMetric);
                classMetrics.setDit(ditIDMetric);
                classMetrics.setHmd(hmdIDMetric);
                classMetrics.setHmi(hmiIDMetric);
                classMetrics.setMhf(mhfIDMetric);
                classMetrics.setMif(mifIDMetric);
                classMetrics.setMa(maIDMetric);
                classMetrics.setMd(mdIDMetric);
                classMetrics.setMi(miIDMetric);
                classMetrics.setMit(mitIDMetric);
                classMetrics.setMo(moIDMetric);
                classMetrics.setNf(nfIDMetric);
                classMetrics.setNm(nmIDMetric);
                classMetrics.setNma(nmaIDMetric);
                classMetrics.setNmi(nmiIDMetric);
                classMetrics.setNoa(noaIDMetric);
                classMetrics.setNoch(nochIDMetric);
                classMetrics.setNod(nodIDMetric);
                classMetrics.setNol(nolIDMetric);
                classMetrics.setNopa(nopaIDMetric);
                classMetrics.setNorm(normIDMetric);
                classMetrics.setNpf(npfIDMetric);
                classMetrics.setNpm(npmIDMetric);
                classMetrics.setNsf(nsfIDMetric);
                classMetrics.setNsm(nsmIDMetric);
                classMetrics.setPmr(pmrIDMetric);
                classMetrics.setPmd(pmdIDMetric);
                classMetrics.setPmi(pmiIDMetric);
                classMetrics.setRtloc(rtlocIDMetric);
                classMetrics.setSix(sixIDMetric);
                classMetrics.setTloc(tlocIDMetric);
                classMetrics.setWmc(wmcIDMetric);

                classMetrics.setId(resultSet.getInt("id"));

            }
            listClassMetrics.add(classMetrics);
            stmt.close();
            return listClassMetrics;
        }catch (SQLException e) {
            throw new RuntimeException(e);
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
            stmt.setInt(1,classMetric.getPackageId());
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
