
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.jasomeweb.controller;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExistInDataBase;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.jasome.model.Login;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.PackageClass;
import br.ufjf.dcc.gmr.core.jasome.model.PackageClassMethod;
import br.ufjf.dcc.gmr.core.jasome.model.PackageMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.gmr.core.jasome.model.Point;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import br.ufjf.dcc.jasome.jdbc.dao.LoginDao;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
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
    public String getNameProject() throws SQLException {
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
    public String getNamePackage(@PathParam("nameProject") String nameProject) throws SQLException {
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
    public String getNameClass(@PathParam("nameProject") String nameProject) throws SQLException {
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
    public String getNameMethod(@PathParam("nameProject") String nameProject) throws SQLException {
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
    public String getMetricPackage(@PathParam("nameProject") String nameProject, @PathParam("namePackage") String namePackage, @PathParam("nameMetric") String nameMetric) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new GsonBuilder().serializeNulls().create(); //para adicionar valores NULL
        List<List<Point>> selectPackageMetrics = dao.selectPackageMetrics(nameProject, namePackage, nameMetric);
        connection.close();
        String listJ = g.toJson(selectPackageMetrics);
        return listJ;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/metric/class/{nameProject}/{namePackage}/{nameClass}/{nameMetric}")
    public String getMetricClass(@PathParam("nameProject") String nameProject, @PathParam("namePackage") String namePackage, @PathParam("nameClass") String nameClass, @PathParam("nameMetric") String nameMetric) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new GsonBuilder().serializeNulls().create(); //para adicionar valores NULL
        List<List<Point>> selectPackageMetrics = dao.selectClassMetrics(nameProject, namePackage, nameClass, nameMetric);
        connection.close();
        String listJ = g.toJson(selectPackageMetrics);
        return listJ;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/metric/method/{nameProject}/{namePackage}/{nameClass}/{nameMethod}/{nameMetric}")
    public String getMetricMethod(@PathParam("nameProject") String nameProject, @PathParam("namePackage") String namePackage, @PathParam("nameClass") String nameClass, @PathParam("nameMethod") String nameMethod, @PathParam("nameMetric") String nameMetric) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        System.out.println(nameProject + " " + namePackage + " " + nameClass + " " + nameMethod + " " + nameMetric);
        Gson g = new GsonBuilder().serializeNulls().create(); //para adicionar valores NULL
        List<List<Point>> selectMethodMetrics = dao.selectMethodMetrics(nameProject, namePackage, nameClass, nameMethod, nameMetric);
        connection.close();
        String listJ = g.toJson(selectMethodMetrics);
        return listJ;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("projects/metric/description/{nameMetric}")
    public String getMetricPackage(@PathParam("nameProject") String nameProject, @PathParam("nameMetric") String nameMetric) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        Gson g = new Gson();
        String description = dao.selectMetricDescription(nameMetric);
        connection.close();
        String listJ = g.toJson(description);
        return listJ;
    }

    //AJUSTAR ESSE ENDPOINT
    @POST
    @Path("/projects/create")
    public void create(@HeaderParam("nome") String nome,
            @HeaderParam("url") String url,
            @HeaderParam("dirJasome") String dirJasome){
        Connection connection = ConnectionFactory.getConnection();
        MetricDao dao = new MetricDao(connection);
        
        String caminhoJasome = dirJasome;
        try {
            dao.executeProject(caminhoJasome, url);
            System.out.println("Cadastrou.");
        } catch (IsOutsideRepository ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LocalRepositoryNotAGitRepository ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RepositoryNotFound ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CheckoutError ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidDocument ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (OptionNotExist ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RefusingToClean ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownSwitch ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RepositoryAlreadyExistInDataBase ex) {
            Logger.getLogger(JasomeResource.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @POST
    @Path("login/")
    public void insertLogin(@HeaderParam("user") String user, @HeaderParam("pass") String pass, @HeaderParam("type") String type) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        LoginDao dao = new LoginDao(connection);
        Login login = new Login();
        login.setUser(user);
        login.setPass(pass);
        login.setType(type);
        dao.insert(login);
        System.out.println("Inseriu.");
        connection.close();
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
    
    @GET
    @Path("projects/get/{projectName}")
    public boolean isProjectRegistered(@PathParam("projectName") String projectName) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        System.out.println(projectName);
        ProjectMetricsDao dao = new ProjectMetricsDao(connection);
        List<String> names = dao.isProjectRegistered(projectName);
        boolean isProjectIn = false;
        for (String name : names) {
            if(name.equalsIgnoreCase(projectName))
                isProjectIn = true;
        }
        connection.close();
        return isProjectIn;
    }
}
