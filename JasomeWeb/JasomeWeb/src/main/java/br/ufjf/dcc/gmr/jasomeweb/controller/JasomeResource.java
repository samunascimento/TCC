/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.controller;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.gmr.jasomeweb.model.Point;
import com.google.gson.Gson;
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
    @Path("metric/version/{nameProject}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getTlocVersion(@PathParam("nameProject") String nameProject) throws SQLException {
        
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        List<Point> listPoints = new ArrayList<>();
        int count = 0;
        Gson g = new Gson();
        List<Metric> list = new ArrayList<>();
        list = dao.selectVersionMetrics(nameProject);
        for (Metric metric : list) {
            listPoints.add(new  Point(count++, metric.getValue()));
        }
        String listJ = g.toJson(listPoints);
        
        System.out.println("entrou aqui");
        return listJ;
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("metric/package/{nameProject}")
    public String getMetricPackage(@PathParam("nameProject") String nameProject) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new Gson();
        List<Metric> list = new ArrayList<>();
        List<Point> listPoints1 = new ArrayList<>();
        List<Point> listPoints2 = new ArrayList<>();
        List<Point> listPoints3 = new ArrayList<>();
        ArrayList<List<Point>> arrayList = new ArrayList<>();
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        list = dao.selectPackageMetrics(nameProject);
        
        for (Metric metric : list) {
            if(metric.getName().equals("A")){
                System.out.println("entrou em A");
                listPoints1.add(new Point(cont1++, metric.getValue()));
            }if(metric.getName().equals("TLOC")){
                System.out.println("entrou em TLOC");
                listPoints2.add(new Point(cont2++, metric.getValue()));
            }if(metric.getName().equals("CCRC")){
                System.out.println("entrou em CCRC");
                listPoints3.add(new Point(cont3++, metric.getValue()));
            }
        }
        arrayList.add(listPoints1);
        arrayList.add(listPoints2);
        arrayList.add(listPoints3);
        
        
        String listJ = g.toJson(arrayList);
        return listJ;
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
        String listJ = g.toJson(listProject);
        return listJ;
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
