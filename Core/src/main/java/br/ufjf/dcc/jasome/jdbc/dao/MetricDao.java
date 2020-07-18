/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.PackageMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import br.ufjf.dcc.gmr.core.jasome.model.Point;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author anton
 */
public class MetricDao {

    private Connection connection;

    public MetricDao(Connection connection) {
        this.connection = connection;

    }

    public int insert(Metric metric) throws SQLException {

        String sql = "INSERT INTO tb_metric "
                + "(name, description, value) "
                + "VALUES (?,?,?)"
                + "RETURNING id;";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setString(1, metric.getName());
            stmt.setString(2, metric.getDescription());
            stmt.setDouble(3, metric.getValue());

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

    public List<Metric> select() throws SQLException {
        Metric metric;

        List<Metric> listMetrics = new ArrayList<>();

        PreparedStatement stmt = null;

        String sql = "SELECT * FROM tb_metric";

        try {
            stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                metric = new Metric();
                metric.setId(resultSet.getInt("id"));
                metric.setName(resultSet.getString("name"));
                metric.setDescription(resultSet.getString("description"));
                metric.setValue(resultSet.getDouble("value"));
                listMetrics.add(metric);
            }
            return listMetrics;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public Metric selectID(int id) throws SQLException {
        Metric metric;
        metric = new Metric();

        String sql = "SELECT * FROM tb_metric WHERE ID = " + id;

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);

            ResultSet result = stmt.executeQuery();
            result.next();
            metric.setId(result.getInt("id"));
            metric.setName(result.getString("name"));
            metric.setDescription(result.getString("description"));
            metric.setValue(result.getDouble("value"));
            return metric;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM tb_metric WHERE ID = ?";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);
            //set values
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

    public void update(Metric metric, int id) throws SQLException {
        String sql = "UPDATE tb_metric SET name = '" + metric.getName() + "', description = '" + metric.getDescription() + "', value = '" + metric.getValue() + "' WHERE ID = '" + id + "';";

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

    public List<Metric> selectAllTlocVersionMetrics() throws SQLException {
        List<Metric> listMetrics = new ArrayList<>();

        Metric metric = null;

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select a.tlocid, b.id,b.description,b.name,b.value "
                + "from tb_versionmetrics as a "
                + "inner join tb_metric as b "
                + "on a.tlocid = b.id";
        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                metric = new Metric();
                metric.setId(resultSet.getInt("id"));
                metric.setName(resultSet.getString("name"));
                metric.setDescription(resultSet.getString("description"));
                metric.setValue(resultSet.getDouble("value"));
                listMetrics.add(metric);
            }
            return listMetrics;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<Metric> selectMetricPackage() throws SQLException {
        //de inicio irei returnar somente três métricas
        //a,ca, ccrc
        //sql não está considerando que exista mais
        //de um projeto no banco de dados
        List<Metric> listMetrics = new ArrayList<>();

        Metric metric = null;

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select b.id,b.description,b.name,b.value "
                + "from tb_packagemetrics as a "
                + "inner join tb_metric as b "
                + "on a.aid = b.id "
                + "or a.caid = b.id "
                + "or a.ccrcid = b.id ";
        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                metric = new Metric();
                metric.setId(resultSet.getInt("id"));
                metric.setName(resultSet.getString("name"));
                metric.setDescription(resultSet.getString("description"));
                metric.setValue(resultSet.getDouble("value"));
                listMetrics.add(metric);
            }
            return listMetrics;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public List<ProjectMetrics> selectNameProject() throws SQLException {
        List<ProjectMetrics> listProject = new ArrayList<>();
        Metric metric = null;
        ProjectMetrics projectMetrics;

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select * from tb_projectmetrics";
        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                projectMetrics = new ProjectMetrics();
                projectMetrics.setId(resultSet.getInt("id"));
                projectMetrics.setName(resultSet.getString("projectname"));
                projectMetrics.setSourceDir(resultSet.getString("sourcedir"));
                listProject.add(projectMetrics);
            }
            return listProject;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public ArrayList<PackageMetrics> selectPackageName(String nameProject) throws SQLException{
        Set<String> metricNames = new HashSet<>();

        Set<String> packageNames = new HashSet<>();
        
        PreparedStatement stmt = null;

        ResultSet resultSet = null;
        
        ArrayList<PackageMetrics> listPackage = new ArrayList<>();
        PackageMetrics packageMetrics = null;

        String sql = "select pk.id , pk.packagename \n" +
                    "from tb_projectmetrics p\n" +
                    "inner join tb_project_version pv\n" +
                    "on p.id = pv.project_id \n" +
                    "inner join tb_version_package vp\n" +
                    "on pv.version_id = vp.version_id \n" +
                    "inner join tb_packagemetrics pk\n" +
                    "on vp.package_id = pk.id "
                    + "where p.projectname = " + "\'" + nameProject + "\'";

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            int id = 1;
            while (resultSet.next()) {
                packageNames.add(resultSet.getString("packagename"));
            }
            
            for (String packageName : packageNames) {
                resultSet = stmt.executeQuery();
                   //packageMetrics = new PackageMetrics(id,packageName);
                   id++;
                listPackage.add(packageMetrics);
            }

            return listPackage;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return null;
    }
    
    public List<List<Point>> selectVersionMetrics(String nameProject) throws SQLException {
        List<List<Point>> chartLines = new ArrayList<>();

        Set<String> metricNames = new HashSet<>();

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select a.id, a.projectname, b.version_id, c.versiondate,c.id,d.id,d.name,d.description,d.value "
                + "from tb_projectmetrics as a "
                + "inner join tb_project_version as b "
                + "on a.id = b.project_id "
                + "inner join tb_versionmetrics as c "
                + "on b.version_id = c.id "
                + "inner join tb_metric  as d "
                + "on c.tlocid = d.id "
                + "where a.projectname = " + "\'" + nameProject + "\'";

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                metricNames.add(resultSet.getString("name"));
            }

            for (String metricName : metricNames) {
                resultSet = stmt.executeQuery();
                int cont = 0;
                List<Point> listPoints = new ArrayList<>();
                while (resultSet.next()) {
                    if (resultSet.getString("name").equals(metricName)) {
                        Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                        Date versionDate = new Date(versionTimestamp.getTime());
                        listPoints.add(new Point(cont++, resultSet.getDouble("value"), null, resultSet.getString("name"), versionDate));
                    }
                }
                chartLines.add(listPoints);
            }

            return chartLines;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    ;

    public List<List<Point>> selectAllPackageMetrics(String nameProject) throws SQLException {

        List<List<Point>> chartLines = new ArrayList<>();

        Set<String> packageNames = new HashSet<>();
        Set<String> metricNames = new HashSet<>();
        List<Integer> versionIDs = new ArrayList<>();

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select v.versiondate, v.id, d.packagename, e.name, e.value \n"
                + "from tb_projectmetrics as a\n"
                + "inner join tb_project_version as b \n"
                + "on a.id = b.project_id \n"
                + "inner join tb_version_package as c \n"
                + "on b.version_id = c.version_id \n"
                + "inner join tb_versionmetrics as v \n"
                + "on v.id = c.version_id \n"
                + "inner join tb_packagemetrics as d \n"
                + "on c.package_id = d.id \n"
                + "inner join tb_metric as e \n"
                + "on\n"
                + "d.tlocid = e.id or\n"
                + "d.aid = e.id or\n"
                + "d.ccrcid = e.id or\n"
                + "d.caid = e.id or\n"
                + "d.ceid  = e.id or \n"
                + "d.dmsid = e.id or\n"
                + "d.iid = e.id or\n"
                + "d.nocid = e.id or\n"
                + "d.noiid = e.id or\n"
                + "d.pkgrciid = e.id or \n"
                + "d.pkgtciid = e.id\n"
                + "where a.projectname = " + "\'" + nameProject + "\'"
                + "order by v.id";

        int idIndex;

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            int id;
            while (resultSet.next()) {
                packageNames.add(resultSet.getString("packagename"));
                metricNames.add(resultSet.getString("name"));
                id = resultSet.getInt("id");
                if (!versionIDs.contains(id)) {
                    versionIDs.add(id);
                }
            }
            for (String packageName : packageNames) {

                for (String metricName : metricNames) {

                    resultSet = stmt.executeQuery();
                    int cont = 0;
                    List<Point> listPoints = new ArrayList<>();
                    int idAux;
                    idIndex = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("packageName").equals(packageName) && resultSet.getString("name").equals(metricName)) {
                            idAux = resultSet.getInt("id");
                            while ((idIndex < versionIDs.size()) && (versionIDs.get(idIndex) < idAux)) {
                                listPoints.add(null);
                                cont++;
                                idIndex++;
                            }

                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            Date versionDate = new Date(versionTimestamp.getTime());

                            listPoints.add(new Point(cont++, resultSet.getDouble("value"), resultSet.getString("packagename"), resultSet.getString("name"), versionDate));
                            idIndex++;
                        }
                    }
                    chartLines.add(listPoints);
                }
            }

            return chartLines;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return null;
    }
    
    
    
    public List<List<Point>> selectPackageMetrics(String nameProject, String namePackage,String nameMetric) throws SQLException {

        List<List<Point>> chartLines = new ArrayList<>();

        Set<String> packageNames = new HashSet<>();
        List<Integer> versionIDs = new ArrayList<>();

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select v.versiondate, v.id, d.packagename, e.name, e.value \n"
                + "from tb_projectmetrics as a\n"
                + "inner join tb_project_version as b \n"
                + "on a.id = b.project_id \n"
                + "inner join tb_version_package as c \n"
                + "on b.version_id = c.version_id \n"
                + "inner join tb_versionmetrics as v \n"
                + "on v.id = c.version_id \n"
                + "inner join tb_packagemetrics as d \n"
                + "on c.package_id = d.id \n"
                + "inner join tb_metric as e \n"
                + "on\n"
                + "d."+ nameMetric +"id = e.id \n"
                + "where a.projectname = " + "\'" + nameProject + "\'" + "and d.packagename = '" + namePackage + "'"
                + "order by v.id";

        int idIndex;

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            int id;
            while (resultSet.next()) {
                packageNames.add(resultSet.getString("packagename"));
                id = resultSet.getInt("id");
                if (!versionIDs.contains(id)) {
                    versionIDs.add(id);
                }
            }
            for (String packageName : packageNames) {
                    
                    resultSet = stmt.executeQuery();
                    int cont = 0;
                    List<Point> listPoints = new ArrayList<>();
                    int idAux;
                    idIndex = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("packageName").equals(packageName)) {
                            idAux = resultSet.getInt("id");
                            while ((idIndex < versionIDs.size()) && (versionIDs.get(idIndex) < idAux)) {
                                listPoints.add(null);
                                cont++;
                                idIndex++;
                            }

                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            Date versionDate = new Date(versionTimestamp.getTime());

                            listPoints.add(new Point(cont++, resultSet.getDouble("value"), resultSet.getString("packagename"), resultSet.getString("name"), versionDate));
                            idIndex++;
                        }
                    }
                    chartLines.add(listPoints);

            }

            return chartLines;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return null;
    }
    

    public List<List<Point>> selectClassMetrics(String nameProject) throws SQLException {

        List<List<Point>> chartLines = new ArrayList<>();

        Set<String> classNames = new HashSet<>();
        Set<String> metricNames = new HashSet<>();
        List<Integer> versionIDs = new ArrayList<>();

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select\n"
                + " pv.version_id ,\n"
                + " v.id ,\n"
                + " v.versiondate ,\n"
                + " p.packagename ,\n"
                + " c.classname ,\n"
                + " m.\"name\" ,\n"
                + " m.description ,\n"
                + " m.value\n"
                + "from\n"
                + " tb_projectmetrics tp\n"
                + "inner join tb_project_version pv on\n"
                + " tp.id = pv.project_id\n"
                + "inner join tb_version_package vp on\n"
                + " vp.version_id = pv.version_id\n"
                + "inner join tb_versionmetrics v\n"
                + " on vp.version_id = v.id \n"
                + "inner join tb_package_class pc on\n"
                + " vp.package_id = pc.package_id\n"
                + "inner join tb_packagemetrics p on\n"
                + " vp.package_id = p.id\n"
                + "inner join tb_classmetrics c on\n"
                + " pc.class_id = c.id\n"
                + "inner join tb_metric m on\n"
                + " c.ahfID = m.id\n" +
    "   or c.aifID = m.id\n" +
    "   or c.aaID = m.id\n" +
    "   or c.adID = m.id\n" +
    "   or c.aiID = m.id\n" +
    "   or c.aitID = m.id\n" +
    "   or c.aoID = m.id\n" +
    "   or c.avID = m.id\n" +
    "   or c.cfID = m.id\n" +
    "   or c.clrciID = m.id\n" +
    "   or c.cltciID = m.id\n" +
    "   or c.ditID = m.id\n" +
    "   or c.hmdID = m.id\n" +
    "   or c.hmiID = m.id\n" +
    "   or c.lcomID = m.id\n" +
    "   or c.mhfID = m.id\n" +
    "   or c.mifID = m.id\n" +
    "   or c.maID = m.id\n" +
    "   or c.mdID = m.id\n" +
    "   or c.miID = m.id\n" +
    "   or c.mitID = m.id\n" +
    "   or c.moID = m.id\n" +
    "   or c.nfID = m.id\n" +
    "   or c.nmID = m.id\n" +
    "   or c.nmaID = m.id\n" +
    "   or c.nmiID = m.id\n" +
    "   or c.nmirID = m.id\n" +
    "   or c.noaID = m.id\n" +
    "   or c.nochID = m.id\n" +
    "   or c.nodID = m.id\n" +
    "   or c.nodaID = m.id\n" +
    "   or c.nodeID = m.id\n" +
    "   or c.nolID = m.id\n" +
    "   or c.nopaID = m.id\n" +
    "   or c.normID = m.id\n" +
    "   or c.npfID = m.id\n" +
    "   or c.npmID = m.id\n" +
    "   or c.nsfID = m.id\n" +
    "   or c.nsmID = m.id\n" +
    "   or c.pfID = m.id\n" +
    "   or c.pmrID = m.id\n" +
    "   or c.pmdID = m.id\n" +
    "   or c.pmiID = m.id\n" +
    "   or c.rtlocID = m.id\n" +
    "   or c.sixID = m.id\n" +
    "   or c.tlocID = m.id\n" +
    "   or c.wmcID = m.id\n" +
    "   or c.ahID = m.id"+
    "       where tp.projectname = " + "\'" + nameProject + "\'"
    + "order by v.id";
        int idIndex;

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            int id;
            while (resultSet.next()) {
                classNames.add(resultSet.getString("className"));
                metricNames.add(resultSet.getString("name"));
                id = resultSet.getInt("id");
                if (!versionIDs.contains(id)) {
                    versionIDs.add(id);
                }
            }
             for (String className : classNames) {

                for (String metricName : metricNames) {

                    resultSet = stmt.executeQuery();
                    int cont = 0;
                    List<Point> listPoints = new ArrayList<>();
                    int idAux;
                    idIndex = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("className").equals(className) && resultSet.getString("name").equals(metricName)) {
                            idAux = resultSet.getInt("id");
                            while ((idIndex < versionIDs.size()) && (versionIDs.get(idIndex) < idAux)) {
                                listPoints.add(null);
                                cont++;
                                idIndex++;
                            }

                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            Date versionDate = new Date(versionTimestamp.getTime());

                            listPoints.add(new Point(cont++, resultSet.getDouble("value"), resultSet.getString("packagename"), resultSet.getString("className"), resultSet.getString("name"), versionDate));
                            idIndex++;
                        }
                    }
                    chartLines.add(listPoints);
                }
            }

            return chartLines;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return null;
    }

    public List<List<Point>> selectMethodMetrics(String nameProject) throws SQLException {

        List<List<Point>> chartLines = new ArrayList<>();

        Set<String> methodNames = new HashSet<>();
        Set<String> metricNames = new HashSet<>();
        List<Integer> versionIDs = new ArrayList<>();

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select\n" +
                    "   pv.version_id ,\n" +
                    "   v.versiondate ,\n" +
                    "   v.id ,\n" +
                    "   p.packagename ,\n" +
                    "   c.classname ,\n" +
                    "   mt.methodname ,\n" +
                    "   m.\"name\" ,\n" +
                    "   m.description ,\n" +
                    "   m.value\n" +
                    "from\n" +
                    "   tb_projectmetrics tp\n" +
                    "inner join tb_project_version pv on\n" +
                    "   tp.id = pv.project_id\n" +
                    "inner join tb_version_package vp on\n" +
                    "   vp.version_id = pv.version_id\n" +
                    "inner join tb_versionmetrics v on\n" +
                    "   vp.version_id = v.id\n" +
                    "inner join tb_package_class pc on\n" +
                    "   vp.package_id = pc.package_id\n" +
                    "inner join tb_class_method cm on\n" +
                    "   pc.class_id = cm.class_id\n" +
                    "inner join tb_packagemetrics p on\n" +
                    "   vp.package_id = p.id\n" +
                    "inner join tb_classmetrics c on\n" +
                    "   pc.class_id = c.id\n" +
                    "inner join tb_methodmetrics mt on\n" +
                    "   mt.id = cm.method_id\n" +
                    "inner join tb_metric m on\n" +
                    "   mt.ciID = m.id\n" +
                    "   or mt.diID = m.id\n" +
                    "   or mt.finID = m.id\n" +
                    "   or mt.foutID = m.id\n" +
                    "   or mt.iovarsID = m.id\n" +
                    "   or mt.mclcID = m.id\n" +
                    "   or mt.nbdID = m.id\n" +
                    "   or mt.ncompID = m.id\n" +
                    "   or mt.nopID = m.id\n" +
                    "   or mt.nvarID = m.id\n" +
                    "   or mt.siID = m.id\n" +
                    "   or mt.tlocID = m.id\n" + // ALTERAR PARA 'OR' QUANDO FOR RODAR TODAS AS METRICAS
                    "   or mt.vgID = m.id\n"+
                    "where tp.projectname = " + "\'" + nameProject + "\'"
                    + "order by v.id";

        int idIndex;

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            int id;
            while (resultSet.next()) {
                methodNames.add(resultSet.getString("methodname"));
                metricNames.add(resultSet.getString("name"));
                id = resultSet.getInt("id");
                if (!versionIDs.contains(id)) {
                    versionIDs.add(id);
                }
            }
            for (String methodName : methodNames) {

                for (String metricName : metricNames) {

                    resultSet = stmt.executeQuery();
                    int cont = 0;
                    List<Point> listPoints = new ArrayList<>();
                    int idAux;
                    idIndex = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("methodname").equals(methodName) && resultSet.getString("name").equals(metricName)) {
                            idAux = resultSet.getInt("id");
                            while ((idIndex < versionIDs.size()) && (versionIDs.get(idIndex) < idAux)) {
                                listPoints.add(null);
                                cont++;
                                idIndex++;
                            }

                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            Date versionDate = new Date(versionTimestamp.getTime());

                            listPoints.add(new Point(cont++, resultSet.getDouble("value"), resultSet.getString("packagename"),resultSet.getString("classname"),resultSet.getString("methodname"), resultSet.getString("name"), versionDate));
                            idIndex++;
                        }
                    }
                    chartLines.add(listPoints);
                }
            }

            return chartLines;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return null;
    }
}
