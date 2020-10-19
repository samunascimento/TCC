/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.jasome.jdbc.dao;

import br.ufjf.dcc.gmr.core.jasome.model.ClassMetrics;
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
import java.text.SimpleDateFormat;
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

    public String selectMetricDescription(String metricName) throws SQLException {
        String description = null;
        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select description from tb_description where name = '" + metricName.toUpperCase() + "'";
        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();

            resultSet.next();
            description = resultSet.getString("description");

            return description;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public ArrayList<PackageMetrics> selectPackageName(String nameProject) throws SQLException {
        Set<String> metricNames = new HashSet<>();

        Set<String> packageNames = new HashSet<>();

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        ArrayList<PackageMetrics> listPackage = new ArrayList<>();
        PackageMetrics packageMetrics = null;

        String sql = "select pk.id , pk.packagename \n"
                + "from tb_projectmetrics p\n"
                + "inner join tb_project_version pv\n"
                + "on p.id = pv.project_id \n"
                + "inner join tb_version_package vp\n"
                + "on pv.version_id = vp.version_id \n"
                + "inner join tb_packagemetrics pk\n"
                + "on vp.package_id = pk.id "
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
                packageMetrics = new PackageMetrics(id, packageName);
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
    
    public ArrayList<ClassMetrics> selectClassName(String nameProject) throws SQLException {
        Set<String> metricNames = new HashSet<>();

        Set<String> classNames = new HashSet<>();

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        ArrayList<ClassMetrics> listClass = new ArrayList<>();
        ClassMetrics classMetrics = null;

        String sql = "select c.id ,c.classname \n" +
                "from tb_projectmetrics p\n" +
                "inner join tb_project_version pv\n" +
                "on p.id = pv.project_id \n" +
                "inner join tb_version_package vp\n" +
                "on pv.version_id = vp.version_id \n" +
                "inner join tb_packagemetrics pk\n" +
                "on vp.package_id = pk.id\n" +
                "inner join tb_package_class pc\n" +
                "on pk.id = pc.package_id \n" +
                "inner join tb_classmetrics c\n" +
                "on c.id = pc.class_id \n" +
                "where p.projectname = " + "\'" + nameProject + "\'";
       

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            int id = 1;
            while (resultSet.next()) {
                classNames.add(resultSet.getString("classname"));
            }

            for (String className : classNames) {
                resultSet = stmt.executeQuery();
                classMetrics = new ClassMetrics(id, className);
                id++;
                listClass.add(classMetrics);
            }

            return listClass;
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

    private class Merge {

        private int versionID;
        private int count;

        /**
         * @return the parentID
         */
        public int getVersionID() {
            return versionID;
        }

        /**
         * @param parentID the parentID to set
         */
        public void setVersionID(int versionID) {
            this.versionID = versionID;
        }

        /**
         * @return the count
         */
        public int getCount() {
            return count;
        }

        /**
         * @param count the count to set
         */
        public void setCount(int count) {
            this.count = count;
        }

    }

    public List<Merge> getMerges(String nameProject) throws SQLException {

        List<Merge> merges = new ArrayList<>();

        String sql = "select ph.version_id, count(ph.version_id)\n"
                + "from tb_projectmetrics tp\n"
                + "inner join tb_project_version pv on tp.id = pv.project_id\n"
                + "inner join tb_versionmetrics v on v.id = pv.version_id\n"
                + "inner join tb_parents_hash ph on v.id = ph.version_id\n"
                + "where tp.projectname = " + "\'" + nameProject + "\'"
                + "group by ph.version_id\n"
                + "having count(ph.version_id) > 1\n"
                + "order by ph.version_id";

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Merge merge = new Merge();
                merge.setVersionID(resultSet.getInt("version_id"));
                merge.setCount(resultSet.getInt("count"));
                merges.add(merge);
            }

            return merges;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }

    }

    private class Branch {

        private int parentID;
        private int count;

        /**
         * @return the versionID
         */
        public int getParentID() {
            return parentID;
        }

        /**
         * @param versionID the versionID to set
         */
        public void setParentID(int parentID) {
            this.parentID = parentID;
        }

        /**
         * @return the count
         */
        public int getCount() {
            return count;
        }

        /**
         * @param count the count to set
         */
        public void setCount(int count) {
            this.count = count;
        }
    }

    public List<Branch> getBranches(String nameProject) throws SQLException {

        List<Branch> branches = new ArrayList<>();

        String sql = "select ph.parent_id ,count(ph.parent_id ) from tb_projectmetrics tp \n"
                + "inner join tb_project_version pv\n"
                + "on tp.id = pv.project_id \n"
                + "inner join tb_versionmetrics v\n"
                + "on v.id = pv.version_id \n"
                + "inner join tb_parents_hash ph\n"
                + "on v.id = ph.version_id \n"
                + "where tp.projectname = " + "\'" + nameProject + "\'"
                + "group by ph.parent_id\n"
                + "having count(ph.parent_id ) > 1\n"
                + "order by ph.parent_id ";

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Branch branch = new Branch();
                branch.setParentID(resultSet.getInt("parent_id"));
                branch.setCount(resultSet.getInt("count"));
                branches.add(branch);
            }
            return branches;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }

    }

    public List<List<Point>> selectVersionMetrics(String nameProject) throws SQLException {
        List<List<Point>> chartLines = new ArrayList<>();

        Set<String> metricNames = new HashSet<>();

        List<Branch> branches = getBranches(nameProject);

        List<Merge> merges = getMerges(nameProject);

        List<Integer> finalPoints = new ArrayList<>();

        boolean checkMerge = false;
        boolean checkBranch = false;
        boolean checkFirstBranch = false;
        boolean checkListPoints = false;
        boolean checkNoBranchs = false;
        int count = 0;

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select tp.id, tp.projectname, pv.version_id, v.commitid, v.versiondate,v.id, v.sha, tm.name, tm.description, tm.value, ph.parent_id\n"
                + "from tb_projectmetrics tp \n"
                + "left join tb_project_version pv\n"
                + "on tp.id = pv.project_id \n"
                + "left join tb_parents_hash ph\n"
                + "on pv.version_id = ph.version_id \n"
                + "left join tb_versionmetrics v\n"
                + "on v.id = pv.version_id\n"
                + "left join tb_metric tm \n"
                + "on v.tlocid = tm.id\n"
                + "where tp.projectname = " + "\'" + nameProject + "\'"
                + "order by  v.commitid";

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();

            resultSet = stmt.executeQuery();
            List<Point> listPoints = new ArrayList<>();
            while (resultSet.next()) {

                checkBranch = false;

                for (int i = 0; i < branches.size(); i++) {
                    if (branches.get(i).getParentID() == resultSet.getInt("parent_id")) {
                        checkBranch = true;
                        checkFirstBranch = true;
                        if (checkListPoints == false) {
                            chartLines.add(listPoints);
                            checkNoBranchs = true;
                        }
                        for (int j = 0; j < chartLines.size(); j++) {
                            if (chartLines.get(j).get(chartLines.get(j).size() - 1).getVersionID() == resultSet.getInt("parent_id")) {
                                checkListPoints = false;
                                Point point = chartLines.get(j).get(chartLines.get(j).size() - 1);
                                finalPoints.add(chartLines.get(j).get(chartLines.get(j).size() - 1).getVersionID());
                                listPoints = new ArrayList();
                                listPoints.add(point);

                            }
                        }
                    }
                }

                if (checkFirstBranch == true && checkBranch == false) {
                    int merge = -1;
                    if (checkListPoints == false) {
                        chartLines.add(listPoints);
                        checkListPoints = true;
                        checkNoBranchs = true;
                    }
                    for (int j = 0; j < merges.size(); j++) {
                        if (merges.get(j).getVersionID() == resultSet.getInt("parent_id")) {
                            System.out.println(merges.get(j).getVersionID());
                            merge = merges.get(j).getVersionID();
                        }
                    }

                    for (int i = 0; i < chartLines.size(); i++) {

                        if ((chartLines.get(i).get(chartLines.get(i).size() - 1).getVersionID() == resultSet.getInt("parent_id")) && merge != -1) {
                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            String formatter = new SimpleDateFormat("yyyy,M,d").format(versionTimestamp);
                            //String dateString = "new Date(".concat(formatter).concat(")");
                            String dateString = formatter;
                            //Date versionDate = new Date(versionTimestamp.getTime());
                            chartLines.get(i).add(new Point(resultSet.getInt("commitID"), resultSet.getDouble("value"), resultSet.getString("projectname"), resultSet.getString("name"), dateString, resultSet.getString("sha"), resultSet.getInt("version_id"), resultSet.getInt("parent_id")));
                            break;

                        } else if (chartLines.get(i).get(chartLines.get(i).size() - 1).getVersionID() == resultSet.getInt("parent_id")) {
                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            String formatter = new SimpleDateFormat("yyyy,M,d").format(versionTimestamp);
                            //String dateString = "new Date(".concat(formatter).concat(")");
                            String dateString = formatter;
                            chartLines.get(i).add(new Point(resultSet.getInt("commitID"), resultSet.getDouble("value"), resultSet.getString("projectname"), resultSet.getString("name"), dateString, resultSet.getString("sha"), resultSet.getInt("version_id"), resultSet.getInt("parent_id")));
                        }
                    }
                } else {

                    Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                    String formatter = new SimpleDateFormat("yyyy,M,d").format(versionTimestamp);
                    //String dateString = "new Date(".concat(formatter).concat(")");
                    String dateString = formatter;
                    Date versionDate = new Date(versionTimestamp.getTime());
                    listPoints.add(new Point(resultSet.getInt("commitID"), resultSet.getDouble("value"), resultSet.getString("projectname"), resultSet.getString("name"), dateString, resultSet.getString("sha"), resultSet.getInt("version_id"), resultSet.getInt("parent_id")));

                }
            }
            if(checkNoBranchs == false){
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

    
    public List<List<Point>> selectPackageMetrics(String nameProject, String namePackage, String nameMetric) throws SQLException {

        List<List<Point>> chartLines = new ArrayList<>();

        Set<String> packageNames = new HashSet<>();
        
        List<Branch> branches = getBranches(nameProject);

        List<Merge> merges = getMerges(nameProject);

        List<Integer> finalPoints = new ArrayList<>();
        
        boolean checkBranch = false;
        boolean checkFirstBranch = false;
        boolean checkListPoints = false;
        boolean checkNoBranchs = false;

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select a.id, a.projectname, d.packagename, e.name, e.value, e.description, v.id, v.versiondate, v.sha,v.authorname, v.commitID, ph.version_id, ph.parent_id\n"
                + "\n"
                + "from tb_projectmetrics as a\n"
                + "\n"
                + "inner join tb_project_version as b\n"
                + "\n"
                + "on a.id = b.project_id\n"
                + "\n"
                + "inner join tb_version_package as c \n"
                + "\n"
                + "on b.version_id = c.version_id\n"
                + "\n"
                + "left join tb_parents_hash ph\n"
                + "\n"
                + "on b.version_id = ph.version_id \n"
                + "\n"
                + "left join tb_versionmetrics as v\n"
                + "\n"
                + "on v.id = b.version_id --alt\n"
                + "\n"
                + "left join tb_packagemetrics as d \n"
                + "\n"
                + "on c.package_id = d.id\n"
                + "\n"
                + "left join tb_metric as e \n"
                + "\n"
                + "on\n"
                + "d." + nameMetric + "id = e.id \n"
                + "where a.projectname = " + "\'" + nameProject + "\'" + "and d.packagename = '" + namePackage + "' or d.packagename is null \n"
                + "order by b.version_id";

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();

            resultSet = stmt.executeQuery();
            List<Point> listPoints = new ArrayList<>();
            while (resultSet.next()) {

                checkBranch = false;

                for (int i = 0; i < branches.size(); i++) {
                    if (branches.get(i).getParentID() == resultSet.getInt("parent_id")) {
                        checkBranch = true;
                        checkFirstBranch = true;
                        if (checkListPoints == false) {
                            chartLines.add(listPoints);
                            checkNoBranchs = true;
                        }
                        for (int j = 0; j < chartLines.size(); j++) {
                            if (chartLines.get(j).get(chartLines.get(j).size() - 1).getVersionID() == resultSet.getInt("parent_id")) {
                                checkListPoints = false;
                                Point point = chartLines.get(j).get(chartLines.get(j).size() - 1);
                                finalPoints.add(chartLines.get(j).get(chartLines.get(j).size() - 1).getVersionID());
                                listPoints = new ArrayList();
                                listPoints.add(point);

                            }
                        }
                    }
                }

                if (checkFirstBranch == true && checkBranch == false) {
                    int merge = -1;
                    if (checkListPoints == false) {
                        chartLines.add(listPoints);
                        checkNoBranchs = true;
                        checkListPoints = true;
                    }
                    for (int j = 0; j < merges.size(); j++) {
                        if (merges.get(j).getVersionID() == resultSet.getInt("parent_id")) {
                            merge = merges.get(j).getVersionID();
                        }
                    }

                    for (int i = 0; i < chartLines.size(); i++) {

                        if ((chartLines.get(i).get(chartLines.get(i).size() - 1).getVersionID() == resultSet.getInt("parent_id")) && merge != -1) {
                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            String formatter = new SimpleDateFormat("yyyy,M,d").format(versionTimestamp);
                            //String dateString = "new Date(".concat(formatter).concat(")");
                            String dateString = formatter;
                            //Date versionDate = new Date(versionTimestamp.getTime());
                            chartLines.get(i).add(new Point(resultSet.getInt("commitID"), resultSet.getDouble("value"), null, resultSet.getString("packagename"), resultSet.getString("name"), dateString, resultSet.getString("sha"), resultSet.getInt("version_id"), resultSet.getInt("parent_id")));
                            break;

                        } else if (chartLines.get(i).get(chartLines.get(i).size() - 1).getVersionID() == resultSet.getInt("parent_id")) {
                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            String formatter = new SimpleDateFormat("yyyy,M,d").format(versionTimestamp);
                            //String dateString = "new Date(".concat(formatter).concat(")");
                            String dateString = formatter;
                            chartLines.get(i).add(new Point(resultSet.getInt("commitID"), resultSet.getDouble("value"), null, resultSet.getString("packagename"), resultSet.getString("name"), dateString, resultSet.getString("sha"), resultSet.getInt("version_id"), resultSet.getInt("parent_id")));
                        }
                    }
                } else {

                    Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                    String formatter = new SimpleDateFormat("yyyy,M,d").format(versionTimestamp);
                    //String dateString = "new Date(".concat(formatter).concat(")");
                    String dateString = formatter;
                    Date versionDate = new Date(versionTimestamp.getTime());
                    listPoints.add(new Point(resultSet.getInt("commitID"), resultSet.getDouble("value"), null, resultSet.getString("packagename"), resultSet.getString("name"), dateString, resultSet.getString("sha"), resultSet.getInt("version_id"), resultSet.getInt("parent_id")));
                    System.out.println(listPoints.size());
                }
            }
            if(checkNoBranchs == false){
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
    
    
    
    
    public List<List<Point>> selectClassMetrics(String nameProject,String namePackage, String nameClass, String nameMetric) throws SQLException {

        List<List<Point>> chartLines = new ArrayList<>();
        
        List<Branch> branches = getBranches(nameProject);

        List<Merge> merges = getMerges(nameProject);

        List<Integer> finalPoints = new ArrayList<>();
        
        boolean checkBranch = false;
        boolean checkFirstBranch = false;
        boolean checkListPoints = false;
        boolean checkNoBranchs = false;

        PreparedStatement stmt = null;

        ResultSet resultSet = null;

        String sql = "select\n" +
                    "a.id,a.projectname,class.classname,d.packagename,e.name,e.value,\n" +
                    "e.description,v.id,v.versiondate,v.sha,v.authorname,v.commitID,ph.version_id,ph.parent_id\n" +
                    "from tb_projectmetrics as a\n" +
                    "inner join tb_project_version as b\n" +
                    "on a.id = b.project_id\n" +
                    "inner join tb_version_package as c \n" +
                    "on b.version_id = c.version_id\n" +
                    "left join tb_parents_hash ph\n" +
                    "on b.version_id = ph.version_id \n" +
                    "left join tb_versionmetrics as v\n" +
                    "on v.id = b.version_id --alt\n" +
                    "left join tb_packagemetrics as d \n" +
                    "on c.package_id = d.id\n" +
                    "left join tb_package_class pc\n" +
                    "on pc.package_id = d.id \n" +
                    "left join tb_classmetrics class\n" +
                    "on class.id = pc.class_id \n" +
                    "left join tb_metric as e \n" +
                    "on\n" +
                    "d." + nameMetric + "id = e.id \n" +
                    "where a.projectname = " + "\'" + nameProject + "\'" + "and (class.classname = '" + nameClass + "' or class.classname is null ) and (d.packagename = '" + namePackage + "' or d.packagename is null)\n" +
                    "order by b.version_id";

        try {
            stmt = connection.prepareStatement(sql);
            resultSet = stmt.executeQuery();

            resultSet = stmt.executeQuery();
            List<Point> listPoints = new ArrayList<>();
            while (resultSet.next()) {

                checkBranch = false;

                for (int i = 0; i < branches.size(); i++) {
                    if (branches.get(i).getParentID() == resultSet.getInt("parent_id")) {
                        checkBranch = true;
                        checkFirstBranch = true;
                        if (checkListPoints == false) {
                            chartLines.add(listPoints);
                            checkNoBranchs = true;
                        }
                        for (int j = 0; j < chartLines.size(); j++) {
                            if (chartLines.get(j).get(chartLines.get(j).size() - 1).getVersionID() == resultSet.getInt("parent_id")) {
                                checkListPoints = false;
                                Point point = chartLines.get(j).get(chartLines.get(j).size() - 1);
                                finalPoints.add(chartLines.get(j).get(chartLines.get(j).size() - 1).getVersionID());
                                listPoints = new ArrayList();
                                listPoints.add(point);

                            }
                        }
                    }
                }

                if (checkFirstBranch == true && checkBranch == false) {
                    int merge = -1;
                    if (checkListPoints == false) {
                        chartLines.add(listPoints);
                        checkNoBranchs = true;
                        checkListPoints = true;
                    }
                    for (int j = 0; j < merges.size(); j++) {
                        if (merges.get(j).getVersionID() == resultSet.getInt("parent_id")) {
                            merge = merges.get(j).getVersionID();
                        }
                    }

                    for (int i = 0; i < chartLines.size(); i++) {

                        if ((chartLines.get(i).get(chartLines.get(i).size() - 1).getVersionID() == resultSet.getInt("parent_id")) && merge != -1) {
                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            String formatter = new SimpleDateFormat("yyyy,M,d").format(versionTimestamp);
                            //String dateString = "new Date(".concat(formatter).concat(")");
                            String dateString = formatter;
                            //Date versionDate = new Date(versionTimestamp.getTime());
                            chartLines.get(i).add(new Point(resultSet.getInt("commitID"), resultSet.getDouble("value"), null, resultSet.getString("packagename"),resultSet.getString("classname"), resultSet.getString("name"), dateString, resultSet.getString("sha"), resultSet.getInt("version_id"), resultSet.getInt("parent_id")));
                            break;

                        } else if (chartLines.get(i).get(chartLines.get(i).size() - 1).getVersionID() == resultSet.getInt("parent_id")) {
                            Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                            String formatter = new SimpleDateFormat("yyyy,M,d").format(versionTimestamp);
                            //String dateString = "new Date(".concat(formatter).concat(")");
                            String dateString = formatter;
                            chartLines.get(i).add(new Point(resultSet.getInt("commitID"), resultSet.getDouble("value"), null, resultSet.getString("packagename"),resultSet.getString("classname"), resultSet.getString("name"), dateString, resultSet.getString("sha"), resultSet.getInt("version_id"), resultSet.getInt("parent_id")));
                        }
                    }
                } else {

                    Timestamp versionTimestamp = resultSet.getTimestamp("versiondate");
                    String formatter = new SimpleDateFormat("yyyy,M,d").format(versionTimestamp);
                    //String dateString = "new Date(".concat(formatter).concat(")");
                    String dateString = formatter;
                    Date versionDate = new Date(versionTimestamp.getTime());
                    listPoints.add(new Point(resultSet.getInt("commitID"), resultSet.getDouble("value"), null, resultSet.getString("packagename"),resultSet.getString("classname"), resultSet.getString("name"), dateString, resultSet.getString("sha"), resultSet.getInt("version_id"), resultSet.getInt("parent_id")));
                    System.out.println(listPoints.size());
                }
            }
            if(checkNoBranchs == false){
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
}
