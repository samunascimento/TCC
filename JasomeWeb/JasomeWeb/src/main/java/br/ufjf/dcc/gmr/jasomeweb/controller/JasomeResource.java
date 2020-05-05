/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.controller;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
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
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
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
     * Retrieves representation of an instance of br.ufjf.dcc.gmr.jasomeweb.controller.JasomeResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    @GET
    @Path("usuario/get")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsuario() throws SQLException{
//        
        List<Metric> list = new ArrayList<>();
        
        
        Metric metric = new Metric();
        metric.setId(10);
        metric.setDescription("descricao");
        metric.setName("metric");
        metric.setValue(10.0);
        
        list.add(metric);
        Metric metric1 = new Metric();
        
        metric1.setId(10);
        metric1.setDescription("descricao");
        metric1.setName("metric");
        metric1.setValue(10.0);
        list.add(metric1);
        Gson g = new Gson();
        
        return g.toJson(list);
    }
    
    /**
     * PUT method for updating or creating an instance of JasomeResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
