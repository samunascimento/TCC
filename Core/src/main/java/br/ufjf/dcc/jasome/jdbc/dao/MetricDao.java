/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;
import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
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
/**
 *
 * @author anton
 */
public class MetricDao {

    private Connection connection;

    public MetricDao(Connection connection){
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
        String sql = "UPDATE tb_metric SET name = '" + metric.getName() + "', description = '" + metric.getDescription() + "', value = '" + metric.getValue() +  "' WHERE ID = '" + id + "';";
        
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
    
    public List<Metric> selectAllTlocVersionMetrics() throws SQLException{
        List<Metric> listMetrics = new ArrayList<>();
        
        Metric metric = null;
        
        PreparedStatement stmt = null;
        
        ResultSet resultSet = null;
        
        String sql =   "select a.tlocid, b.id,b.description,b.name,b.value "
                      +"from tb_versionmetrics as a "
                      +"inner join tb_metric as b "
                      +"on a.tlocid = b.id";
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
    
    public List<Metric> selectMetricPackage() throws SQLException{
        //de inicio irei returnar somente três métricas
        //a,ca, ccrc
        //sql não está considerando que exista mais
        //de um projeto no banco de dados
        List<Metric> listMetrics = new ArrayList<>();
        
        Metric metric = null;
        
        PreparedStatement stmt = null;
        
        ResultSet resultSet = null;
        
        String sql =   "select b.id,b.description,b.name,b.value "
                        +"from tb_packagemetrics as a "
                        +"inner join tb_metric as b "
                        +"on a.aid = b.id "
                        +"or a.caid = b.id "
                        +"or a.ccrcid = b.id ";
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
    
    public List<List<Point>> selectVersionMetrics (String nameProject) throws SQLException{
        List<List<Point>> chartLines = new ArrayList<>();
        
        Set<String> metricNames = new HashSet<>();
        
        PreparedStatement stmt = null;
        
        ResultSet resultSet = null;
        
        String sql = "select a.id,a.projectname ,b.version_id,c.id,d.id,d.name,d.description,d.value " +
                    "from tb_projectmetrics as a " +
                    "inner join tb_project_version as b " +
                    "on a.id = b.project_id " +
                    "inner join tb_versionmetrics as c " +
                    "on b.version_id = c.id " +
                    "inner join tb_metric  as d " +
                    "on c.tlocid = d.id " +
                    "where a.projectname = " + "\'" + nameProject + "\'";
        
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
                        if(resultSet.getString("name").equals(metricName)){
                            listPoints.add(new Point(cont++,resultSet.getDouble("value")));
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
    
    public List<List<Point>> selectPackageMetrics(String nameProject) throws SQLException{
        
        List<List<Point>> chartLines = new ArrayList<>();
        
        Set<String> packageNames = new HashSet<>();
        Set<String> metricNames = new HashSet<>();
        
        PreparedStatement stmt = null;
        
        ResultSet resultSet = null;
        
        String sql =  "select v.versiondate,d.packagename,e.name,e.value " +
"                        from tb_projectmetrics as a" +
"                        inner join tb_project_version as b " +
"                        on a.id = b.project_id " +
"                        inner join tb_version_package as c " +
"                        on b.version_id = c.version_id " +
"                        inner join tb_versionmetrics as v " +
"                        on v.id = c.version_id " +
"                        inner join tb_packagemetrics as d " +
"                        on c.package_id = d.id " +
"                        inner join tb_metric as e " +
"                        on d.tlocid = e.id or d.aid = e.id or d.ccrcid = e.id " +
"                        where a.projectname = " + "\'" + nameProject + "\'";
        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                packageNames.add(resultSet.getString("packagename"));
                metricNames.add(resultSet.getString("name"));
            }

            for (String packageName : packageNames) {
                
                for (String metricName : metricNames) {
                    resultSet = stmt.executeQuery();
                    int cont = 0;
                    List<Point> listPoints = new ArrayList<>();
                    while (resultSet.next()) {
                        if(resultSet.getString("packageName").equals(packageName) && resultSet.getString("name").equals(metricName)){
                            listPoints.add(new Point(cont++,resultSet.getDouble("value")));
                        }
                    }
                    chartLines.add(listPoints);
                }
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
    
    public List<ProjectMetrics> selectNameProject() throws SQLException{
        List<ProjectMetrics> listProject = new ArrayList<>();
        Metric metric = null;
        ProjectMetrics projectMetrics;
        
        PreparedStatement stmt = null;
        
        ResultSet resultSet = null;
        
        String sql =  "select * from tb_projectmetrics";
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
    

}
