package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import org.apache.commons.cli.ParseException;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Principal
 */
public class Jasome {

    public static void main(String[] args) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, UnknownSwitch, RefusingToClean, IsOutsideRepository, SQLException, NullPointerException, OptionNotExist, ParseException, java.text.ParseException {
//        try {

        Connection connection = ConnectionFactory.getConnection();
        
        /*try {
            //JasomeMethods jasome = new JasomeMethods("C:\\Users\\anton\\Documents\\projetos-teste-jasome\\minecrowdcontrol", "C:\\Users\\anton\\Documents\\Bolsa de pesquisa\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome");
            //analyze(null, null, null, "C:\\Users\\Principal\\Desktop\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome", "C:\\Users\\Principal\\Desktop\\teste\\UFJF");
            analyze(null, null, null, "C:\\Users\\anton\\Documents\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome", "C:\\Users\\anton\\Documents\\ProjetosExemplos\\CalculadoraJava");
            //analyze(null, null, null, "C:\\Users\\anton\\Documents\\Bolsa de pesquisa\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome", "C:\\Users\\anton\\Documents\\projetos-teste-jasome\\minecrowdcontrol");
        } catch (RepositoryAlreadyExistInDataBase ex) {
            ex.getMessage();
        }*/
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

    public static void analyze(String urlDB, String userNameDB, String passwordDB, String jasomePath, String projectPath, String status, int userId) throws IsOutsideRepository, LocalRepositoryNotAGitRepository, RepositoryNotFound, java.text.ParseException, CheckoutError, InvalidDocument, OptionNotExist, NullPointerException, RefusingToClean, IOException, UnknownSwitch, SQLException {

        Connection connection = null;
        if (urlDB == null && userNameDB == null && passwordDB == null) {
            connection = ConnectionFactory.getConnection();
        } else {
            connection = ConnectionFactory.getConnection(urlDB, userNameDB, passwordDB);
        }
        connection.setAutoCommit(false);
                
        JasomeMethods jasome = new JasomeMethods(projectPath, jasomePath, status, userId);

        ProjectMetrics project = new ProjectMetrics();

        project.setSourceDir(jasome.GetRepositoryPath()); 
        project.setUrl("testeUrl");
        project.setName(jasome.GetRepositoryName());
        project.setStatus(jasome.getStatus());
        project.setLoginId(jasome.getUserId());
        project.setOrganization("organization");

        jasome.runProject(project, connection);
    }

}
