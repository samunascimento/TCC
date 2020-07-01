
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
import br.ufjf.dcc.gmr.core.jasome.model.Point;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
import org.apache.commons.cli.*;

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
        String listJ = g.toJson(listProject);
        return listJ;
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("metric/version/{nameProject}")
    public String getMetricVersion(@PathParam("nameProject") String nameProject) throws SQLException {
        
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new Gson();
        List<Point> listPoints = new ArrayList<>();
        List<Metric> list = new ArrayList<>();
        List<List<Point>> selectVersionMetrics = dao.selectVersionMetrics(nameProject);
        String listJ = g.toJson(selectVersionMetrics);
        return listJ;
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("metric/package/{nameProject}")
    public String getMetricPackage(@PathParam("nameProject") String nameProject) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new Gson();
        List<List<Point>> selectPackageMetrics = dao.selectPackageMetrics(nameProject);
        String listJ = g.toJson(selectPackageMetrics);
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

