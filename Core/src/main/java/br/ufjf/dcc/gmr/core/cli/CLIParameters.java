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
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.jasome.Jasome;
import java.io.IOException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
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
    public static final String REPOSITORY_PATH = "repository_path";
    public static final String REPOSITORY_PATH_SHORT = "r";
    public static final String JASOME_PATH = "jasome_path";
    public static final String JASOME_PATH_SHORT = "j";
    

    public static void main(String[] args) throws IsOutsideRepository, LocalRepositoryNotAGitRepository, RepositoryNotFound, java.text.ParseException, CheckoutError, InvalidDocument, OptionNotExist, NullPointerException, RefusingToClean, IOException, UnknownSwitch {

        CommandLineParser parser = new DefaultParser();
        Options options = new Options();

        options.addOption(new Option(URL_DB_SHORT, URL_DB, true, "DB URL"));
        options.addOption(new Option(USERNAME_DB_SHORT, USERNAME_DB, true, "DB username"));
        options.addOption(new Option(PASSWORD_DB_SHORT, PASSWORD_DB, true, "DB password"));
        options.addOption(new Option(REPOSITORY_PATH_SHORT, REPOSITORY_PATH, true, "repository path"));
        options.addOption(new Option(JASOME_PATH_SHORT, JASOME_PATH, true, "jasome path"));

        CommandLine commandLine = null;

        try {

            commandLine = parser.parse(options, args);

           

            String url = commandLine.getOptionValue(URL_DB);
            String username = commandLine.getOptionValue(USERNAME_DB_SHORT);
            String password = commandLine.getOptionValue(PASSWORD_DB_SHORT);
            String repositoryPath = commandLine.getOptionValue(REPOSITORY_PATH_SHORT);
            String jasomePath = commandLine.getOptionValue(JASOME_PATH_SHORT);
            
            System.out.println(url);
            System.out.println(username);
            System.out.println(password);
            System.out.println(repositoryPath);
            System.out.println(jasomePath);
            
            Jasome.analyze(url, username, password, jasomePath, repositoryPath);
        } catch (ParseException e) {
            System.out.println("Argumentos inválidos!");
            e.printStackTrace();
        }

    }

}
