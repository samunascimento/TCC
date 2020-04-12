package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Principal
 */
public class Jasome {

    public static void main(String[] args) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, UnknownSwitch, RefusingToClean, IsOutsideRepository, SQLException {
        try {
            //ProjectMetricsDao projectDao = projectDao = new ProjectMetricsDao();
            //ProjectMetrics project = project = new ProjectMetrics();
            JasomeMethods jasome = new JasomeMethods("C:\\Users\\Principal\\Desktop\\calculadora-1", "C:\\Users\\Principal\\Desktop\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome");
            
           // project.setSourceDir(jasome.GetRepositoryPath());
           // projectDao.insert(project);
            
            jasome.runProject(jasome.GetRepositoryPath());
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
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("Não é um repositório válido");
        } catch (IOException ex) {
            System.out.println("Não é um repositório válido");
        }
    }

}
