/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.cli;

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
import br.ufjf.dcc.gmr.core.jasome.Jasome;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author Principal
 */
public class CLIParameters {

    public static final String URL_DB = "url_db";
    public static final String URL_DB_SHORT = "url";
    public static final String USERNAME_DB = "username_db";
    public static final String USERNAME_DB_SHORT = "u";
    public static final String PASSWORD_DB = "password_db";
    public static final String PASSWORD_DB_SHORT = "p";
    public static final String GITHUB_USERNAME = "github_username";
    public static final String GITHUB_USERNAME_SHORT = "gu";
    public static final String GITHUB_PASSWORD = "github_password";
    public static final String GITHUB_PASSWORD_SHORT = "gp";
    public static final String GITHUB_PROJECT = "github_project";
    public static final String GITHUB_PROJECT_SHORT = "g";
    public static final String GITHUB_PROJECT_PATH = "project_path_git";
    public static final String GITHUB_PROJECT_PATH_SHORT = "ppg";
    public static final String PROJECT_NAME = "repository_name";
    public static final String PROJECT_NAME_SHORT = "n";
    public static final String REPOSITORY_PATH = "repository_path";
    public static final String REPOSITORY_PATH_SHORT = "r";
    public static final String JASOME_PATH = "jasome_path";
    public static final String JASOME_PATH_SHORT = "j";
    public static final String HELP = "help";
    public static final String HELP_SHORT = "h";

    public static void main(String[] args) throws IsOutsideRepository, LocalRepositoryNotAGitRepository, RepositoryNotFound, java.text.ParseException, CheckoutError, InvalidDocument, OptionNotExist, NullPointerException, RefusingToClean, IOException, UnknownSwitch, UrlNotFound, SQLException {

        CommandLineParser parser = new DefaultParser();
        Options options = new Options();

        options.addOption(new Option(URL_DB_SHORT, URL_DB, true, "DataBase URL"));
        options.addOption(new Option(USERNAME_DB_SHORT, USERNAME_DB, true, "DataBase username"));
        options.addOption(new Option(PASSWORD_DB_SHORT, PASSWORD_DB, true, "DataBase password"));
        options.addOption(new Option(GITHUB_PROJECT_SHORT, GITHUB_PROJECT, true, "link to clone github project"));
        options.addOption(new Option(GITHUB_PROJECT_PATH_SHORT, GITHUB_PROJECT_PATH, true, "directory path to clone github project"));
        options.addOption(new Option(PROJECT_NAME_SHORT, PROJECT_NAME, true, "directory name to clone the github project (without accent and space)"));
        options.addOption(new Option(GITHUB_USERNAME_SHORT, GITHUB_USERNAME, true, "github username to access private repositories"));
        options.addOption(new Option(GITHUB_PASSWORD_SHORT, GITHUB_PASSWORD, true, "github password to access private repositories"));
        options.addOption(new Option(REPOSITORY_PATH_SHORT, REPOSITORY_PATH, true, "repository path with a java project in your computer"));
        options.addOption(new Option(JASOME_PATH_SHORT, JASOME_PATH, true, "jasome path in your computer"));
        options.addOption(HELP_SHORT, HELP, false, "Shows this help");

        CommandLine commandLine = null;

        try {

            commandLine = parser.parse(options, args);

            String url = commandLine.getOptionValue(URL_DB);
            String username = commandLine.getOptionValue(USERNAME_DB_SHORT);
            String password = commandLine.getOptionValue(PASSWORD_DB_SHORT);
            String gitHubProject = commandLine.getOptionValue(GITHUB_PROJECT_SHORT);
            String projectPath = commandLine.getOptionValue(GITHUB_PROJECT_PATH_SHORT);
            String projectName = commandLine.getOptionValue(PROJECT_NAME_SHORT);
            String repositoryPath = commandLine.getOptionValue(REPOSITORY_PATH_SHORT);
            String jasomePath = commandLine.getOptionValue(JASOME_PATH_SHORT);
            String gitHubUsername = commandLine.getOptionValue(GITHUB_USERNAME_SHORT);
            String gitHubPassword = commandLine.getOptionValue(GITHUB_PASSWORD_SHORT);

            if (commandLine.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();

                formatter.printHelp("CommandLineParameters", options);
            }
            else if (gitHubProject != null) {

                projectPath = Jasome.cloneRepository(gitHubProject, projectPath, projectName, gitHubUsername, gitHubPassword);
                Jasome.analyze(url, username, password, jasomePath, projectPath);

            } else {
                Jasome.analyze(url, username, password, jasomePath, repositoryPath);
            }

        } catch (ParseException e) {
            System.out.println("Argumentos inválidos!");
        } catch (RepositoryAlreadyExist ex){
            System.out.println(ex.getMessage());
        } catch (RepositoryAlreadyExistInDataBase ex) {
            System.out.println(ex.getMessage());
        }
    }

}
