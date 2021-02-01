
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.controller;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.PackageClass;
import br.ufjf.dcc.gmr.core.jasome.model.PackageClassMethod;
import br.ufjf.dcc.gmr.core.jasome.model.PackageMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.gmr.core.jasome.model.Point;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author anton
 */
@Path("jasome")
public class JasomeResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of JasomeResource
     */
    public JasomeResource() {
    }

    /**
     * Retrieves representation of an instance of
     * br.ufjf.dcc.gmr.jasomeweb.controller.JasomeResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("nameProject")
    public String getNameProject() throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        List<ProjectMetrics> listProject = new ArrayList<>();
        Gson g = new Gson();
        listProject = dao.selectNameProject();
        connection.close();
        String listJ = g.toJson(listProject);
        return listJ;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/namePackage/{nameProject}")
    public String getNamePackage(@PathParam("nameProject") String nameProject) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        ArrayList<PackageMetrics> listPackage = new ArrayList<>();
        Gson g = new Gson();
        listPackage = dao.selectPackageName(nameProject);
        connection.close();
        String listJ = g.toJson(listPackage);
        return listJ;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/nameClass/{nameProject}")
    public String getNameClass(@PathParam("nameProject") String nameProject) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        ArrayList<PackageClass> listPackageClass = new ArrayList<>();
        Gson g = new Gson();
        listPackageClass = dao.selectClassName(nameProject);
        connection.close();
        String listJ = g.toJson(listPackageClass);
        return listJ;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/nameMethod/{nameProject}")
    public String getNameMethod(@PathParam("nameProject") String nameProject) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        ArrayList<PackageClassMethod> listPackageClassMethod = new ArrayList<>();
        Gson g = new Gson();
        listPackageClassMethod = dao.selectMethodName(nameProject);
        connection.close();
        String listJ = g.toJson(listPackageClassMethod);
        return listJ;
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/metric/version/{nameProject}")
    public String getMetricVersion(@PathParam("nameProject") String nameProject) throws SQLException {
        
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new Gson();
        List<Point> listPoints = new ArrayList<>();
        List<Metric> list = new ArrayList<>();
        List<List<Point>> selectVersionMetrics = dao.selectVersionMetrics(nameProject);
        connection.close();
        String listJ = g.toJson(selectVersionMetrics);
        return listJ;
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/metric/package/{nameProject}/{namePackage}/{nameMetric}")
    public String getMetricPackage(@PathParam("nameProject") String nameProject,@PathParam("namePackage") String namePackage ,@PathParam("nameMetric") String nameMetric) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new GsonBuilder().serializeNulls().create(); //para adicionar valores NULL
        List<List<Point>> selectPackageMetrics = dao.selectPackageMetrics(nameProject,namePackage,nameMetric);
        connection.close();
        String listJ = g.toJson(selectPackageMetrics);
        return listJ;
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/metric/class/{nameProject}/{namePackage}/{nameClass}/{nameMetric}")
    public String getMetricClass(@PathParam("nameProject") String nameProject,@PathParam("namePackage") String namePackage ,@PathParam("nameClass") String nameClass,@PathParam("nameMetric") String nameMetric) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new GsonBuilder().serializeNulls().create(); //para adicionar valores NULL
        List<List<Point>> selectPackageMetrics = dao.selectClassMetrics(nameProject,namePackage,nameClass,nameMetric);
        connection.close();
        String listJ = g.toJson(selectPackageMetrics);
        return listJ;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/metric/method/{nameProject}/{namePackage}/{nameClass}/{nameMethod}/{nameMetric}")
    public String getMetricMethod(@PathParam("nameProject") String nameProject,@PathParam("namePackage") String namePackage ,@PathParam("nameClass") String nameClass,@PathParam("nameMethod") String nameMethod,@PathParam("nameMetric") String nameMetric) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        System.out.println(nameProject +" "+ namePackage+" "+ nameClass+" "+nameMethod +" "+ nameMetric);
        Gson g = new GsonBuilder().serializeNulls().create(); //para adicionar valores NULL
        List<List<Point>> selectMethodMetrics = dao.selectMethodMetrics(nameProject, namePackage, nameClass, nameMethod, nameMetric);
        connection.close();
        String listJ = g.toJson(selectMethodMetrics);
        return listJ;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/metric/description/{nameMetric}")
    public String getMetricPackage(@PathParam("nameProject") String nameProject,@PathParam("nameMetric") String nameMetric) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new Gson();
        String description = dao.selectMetricDescription(nameMetric);
        connection.close();
        String listJ = g.toJson(description);
        return listJ;
    }
       
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/{nameProject}/{sourceDir}")
    public void insertProject(final @PathParam("nameProject") String nome, final @PathParam("sourceDir") String caminho) {
        System.out.println("Nome: "+nome+"Caminho: " + caminho);
    }
    
    
    /**
     * PUT method for updating or creating an instance of JasomeResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}

