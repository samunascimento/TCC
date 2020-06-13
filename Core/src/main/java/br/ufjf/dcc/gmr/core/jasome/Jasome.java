package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExistInDataBase;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import org.apache.commons.cli.ParseException;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.*;

/**
 *
 * @author Principal
 */
public class Jasome {

    public static void main(String[] args) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, UnknownSwitch, RefusingToClean, IsOutsideRepository, SQLException, NullPointerException, OptionNotExist, ParseException, java.text.ParseException {
//        try {

        Connection connection = ConnectionFactory.getConnection();
        
        try {
            //  JasomeMethods jasome = new JasomeMethods("C:\\Users\\anton\\Documents\\projetos-teste-jasome\\minecrowdcontrol", "C:\\Users\\anton\\Documents\\Bolsa de pesquisa\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome");
            analyze(null, null, null, "C:\\Users\\anton\\Documents\\Bolsa de pesquisa\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome", "C:\\Users\\anton\\Documents\\projetos-teste-jasome\\MineCraftMini");
        } catch (RepositoryAlreadyExistInDataBase ex) {
            System.out.println("salvelk");
            ex.getMessage();
        }
    }

    /**
     *
     * @param repositoryUrl
     * @param repositoryPath
     * @param projectName
     * @param user
     * @param password
     * @return
     * @throws RepositoryNotFound
     * @throws UrlNotFound
     * @throws br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExist
     */
    public static String cloneRepository(String repositoryUrl, String repositoryPath, String projectName, String user, String password) throws RepositoryNotFound, UrlNotFound, RepositoryAlreadyExist {
        System.out.println("Clonando Projeto...");
        if ((repositoryUrl != null && repositoryUrl.startsWith("https://github.com/")) && (user == null || password == null)) {
            Git.clone(repositoryUrl, repositoryPath, projectName);
        } else if ((repositoryUrl != null && repositoryUrl.startsWith("https://github.com/")) && (user != null && password != null)) {
            Git.clone(repositoryUrl, repositoryPath, projectName, user, password);
        }
        if (projectName == null) {
            String[] url = repositoryUrl.split("/");
            String name = url[url.length - 1];
            name = name.replaceFirst(".git", "");
            System.out.println(name);
            repositoryPath = repositoryPath.concat(File.separator).concat(name);
        } else {
            repositoryPath = repositoryPath.concat(File.separator).concat(projectName);
        }

        return repositoryPath;
    }

    public static void analyze(String urlDB, String userNameDB, String passwordDB, String jasomePath, String projectPath) throws IsOutsideRepository, LocalRepositoryNotAGitRepository, RepositoryNotFound, java.text.ParseException, CheckoutError, InvalidDocument, OptionNotExist, NullPointerException, RefusingToClean, IOException, UnknownSwitch, SQLException, RepositoryAlreadyExistInDataBase {

        
        Connection connection = null;
        if (urlDB == null && userNameDB == null && passwordDB == null) {
            connection = ConnectionFactory.getConnection();
        } else {
            connection = ConnectionFactory.getConnection(urlDB, userNameDB, passwordDB);
        }
        
        ProjectMetricsDao projectDao = new ProjectMetricsDao(connection);
        List<ProjectMetrics> select = projectDao.select();
        
        Boolean equalProjects = false;
        
        
        JasomeMethods jasome = new JasomeMethods(projectPath, jasomePath);

        //JasomeMethods jasome = new JasomeMethods("C:\\Users\\Principal\\Desktop\\calculadora-1", "C:\\Users\\Principal\\Desktop\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome");
        ProjectMetrics project = new ProjectMetrics();

        project.setSourceDir(jasome.GetRepositoryPath());
        //System.out.println(jasome.GetRepositoryPath());
        project.setUrl("testeUrl");
        project.setName(jasome.GetRepositoryName());
        project.setOrganization("organization");
            
        for (ProjectMetrics projectMetrics : select) {
                     
            if(projectMetrics.getName().equals(project.getName())){
                equalProjects = true;
                break;
            }
            
        }
        
        if(equalProjects == false){
            jasome.runProject(project, connection);
        } else {
            throw new RepositoryAlreadyExistInDataBase();
        }


        /*jasome.getArchiveType().add("java");
        List<Formats> log = Git.logAll(jasome.GetRepositoryPath());
        System.out.println(log.size());
        for (int i = 0; i < log.size(); i++) {
        jasome.getFileNames().clear();
        jasome.gitCommands(jasome, log, i);
        System.out.println("");
        System.out.println("");
        jasome.listJavaArchives(jasome.GetRepositoryPath(),directory,jasome.getArchiveType());
        jasome.javaArchivesCount();
        jasome.runJasome(jasome.GetRepositoryPath(), jasome.getFileNames(), jasome.getArchiveType(), i);
        }*/
//        } catch (LocalRepositoryNotAGitRepository ex) {
//            System.out.println("Não é um repositório válido");
//        } catch (IOException ex) {
//            System.out.println("Não é um repositório válido");
//        }
    }

}
