package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import org.apache.commons.cli.ParseException;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.cli.*;

/**
 *
 * @author Principal
 */
public class Jasome {

    public static CommandLine commandLineArguments(String[] args) {

        CommandLineParser parser = new DefaultParser();
        Options options = new Options();

        options.addOption(new Option("r", "repo", true, "repository path"));
        options.addOption(new Option("b", "bcd", true, "Second Parameter"));
        options.addOption(new Option("h", "help", false, "Shows this help"));
        
        CommandLine commandLine = null;

        try {

            commandLine = parser.parse(options, args);
            
            if (commandLine.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();

                formatter.printHelp("CommandLineParameters", options);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return commandLine;
    }

    public static void main(String[] args) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, UnknownSwitch, RefusingToClean, IsOutsideRepository, SQLException, NullPointerException, OptionNotExist, ParseException, java.text.ParseException {
//        try {

        Connection connection = ConnectionFactory.getConnection();
        
        CommandLine commandLine = commandLineArguments(args);
        
        System.out.println(commandLine.getOptionValue("r"));

        JasomeMethods jasome = new JasomeMethods(commandLine.getOptionValue("r"), "C:\\Users\\Principal\\Desktop\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome");
        
        
        //JasomeMethods jasome = new JasomeMethods("C:\\Users\\Principal\\Desktop\\calculadora-1", "C:\\Users\\Principal\\Desktop\\UFJF\\Core\\thirdparty\\jasome\\build\\distributions\\jasome\\bin\\jasome");
        ProjectMetrics project = new ProjectMetrics();

        project.setSourceDir(jasome.GetRepositoryPath());
        project.setUrl("testeUrl");
        project.setName(jasome.GetRepositoryName());
        project.setOrganization("organization");

        jasome.runProject(project, connection);

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
