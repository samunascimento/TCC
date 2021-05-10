/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.DoubleSave;
import br.ufjf.dcc.gmr.core.exception.ImpossibleLineNumber;
import br.ufjf.dcc.gmr.core.exception.ImpossibleToCreateFile;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.Notsaving;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.mergenature.controller.GSONClass;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureAlgorithm;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import br.ufjf.dcc.gmr.core.mergenature.dao.ProjectDAO;
import static br.ufjf.dcc.gmr.core.mergenature.view.MNFrame.CONNECTION_FILEPATH;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
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
 * @author luan
 */
public class Cli {

    public static final String REPOSITORY_PATH = "repository_path";
    public static final String REPOSITORY_PATH_SHORT = "r";

    public static final String CONTEXT_LINE_NUMBER = "context_line_number";
    public static final String CONTEXT_LINE_NUMBER_SHORT = "c";

    public static final String SAVE_PATH = "save_path";
    public static final String SAVE_PATH_SHORT = "s";

    public static final String SAVE_IN_THE_DATABASE = "save_in_the_database";
    public static final String SAVE_IN_THE_DATABASE_SHORT = "db";

    public static void main(String[] args) throws IsOutsideRepository, LocalRepositoryNotAGitRepository, RepositoryNotFound, java.text.ParseException, CheckoutError, InvalidDocument, OptionNotExist, NullPointerException, RefusingToClean, IOException, UnknownSwitch, RepositoryAlreadyExist, ImpossibleLineNumber, Notsaving, DoubleSave {

        CommandLineParser parser = new DefaultParser();
        Options options = new Options();

        Option repositoryOption = new Option(REPOSITORY_PATH_SHORT, REPOSITORY_PATH, true, "Repository");
        repositoryOption.setRequired(true);
        options.addOption(repositoryOption);

        Option saveOption = new Option(SAVE_PATH_SHORT, SAVE_PATH, true, "Save path");
        saveOption.setRequired(false);
        options.addOption(saveOption);

        Option DataBaseOption = new Option(SAVE_IN_THE_DATABASE_SHORT, SAVE_IN_THE_DATABASE, false, "Save in the Database");
        saveOption.setRequired(false);
        options.addOption(DataBaseOption);

        Option contextLineOption = new Option(CONTEXT_LINE_NUMBER_SHORT, CONTEXT_LINE_NUMBER, true, "Number of context lines");
        options.addOption(contextLineOption);

        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine cmd = parser.parse(options, args);

            if (!(cmd.hasOption("s") ^ cmd.hasOption("db"))) {

                if ((cmd.hasOption("s") && cmd.hasOption("db"))) {
                    System.out.println("Double save is not supoorted yet");
                    throw new DoubleSave();

                } else {
                    System.out.println("The analysis is not being saved");
                    throw new Notsaving();
                }

            }

            //Default options
            String directoryPath = cmd.getOptionValue(REPOSITORY_PATH);
            int cln = 3;
            String savePath = cmd.getOptionValue(SAVE_PATH);

            String name;

            if (cmd.hasOption("c")) {
                cln = Integer.parseInt(cmd.getOptionValue("c"));
                if (cln <= 0) {
                    System.out.println("Context line number must be a positive number");
                    return;
                }
            }

            MergeNatureAlgorithm analysis = new MergeNatureAlgorithm(directoryPath, cln);
            analysis.startAlgorithm();
            name = analysis.getProject().getName();

            if (cmd.hasOption("s")) {
                if (!savePath.endsWith(".mntr")) {

                    File directory = new File(savePath);

                    if (!directory.isDirectory()) {
                        directory.mkdirs();
                    }
                    savePath = savePath + File.separator + name + ".mntr";
                }

                if (analysis.getProject().getMerges() != null) {
                    GSONClass.save(savePath, analysis.getProject());
                } else {
                    System.out.println("Ops, it was not suposed to happen!");
                }
            } else {
                String fileContent = null;
                if (testConnection()) {
                    fileContent = MergeNatureTools.getFileContentInString(CONNECTION_FILEPATH);
                } else {
                    createFile();
                    if (testConnection()) {
                        fileContent = MergeNatureTools.getFileContentInString(CONNECTION_FILEPATH);
                    } else {
                        System.out.println("The archieve us not being created, please contact the developers");
                        throw new ImpossibleToCreateFile();
                    }

                }
                String[] data = fileContent.split(";");
                Connection connection = null;
                try {
                    connection = ConnectionFactory.getConnection(data[0], data[1], data[2]);
                } catch (Exception ex) {
                    System.out.println("It was not possible to connect to the database, please restart the process");
                }
                System.out.println("Conectado ao Banco de dados");
                ProjectDAO project = new ProjectDAO(connection);
                try {
                    if (analysis.getProject().getMerges() != null) {
                        System.out.println("Salvando projeto");
                        project.insert(analysis.getProject());
                    } else {
                        System.out.println("Ops, it was not suposed to happen!");
                    }
                } catch (SQLException exception) {
                    System.out.println("SQL ERROR!");
                }
            }
        } catch (ParseException | NumberFormatException | Notsaving | DoubleSave | ImpossibleToCreateFile e) {

            if (e instanceof NumberFormatException) {
                System.out.println("Context line number must be a number");
            }

            formatter.printHelp("help", options);
        }

    }

    private static void createFile() {

        Scanner sc = new Scanner(System.in);
        String url, user, password;
        System.out.println("Type the database URL followd by it's name: ");
        url = sc.nextLine();
        System.out.println("Type the database User: ");
        user = sc.nextLine();
        System.out.println("Type the database password: ");
        password = sc.nextLine();
        try {
            MergeNatureTools.createAndWriteInFile(MNFrame.CONNECTION_FILEPATH, url + ";" + user + ";" + password);
        } catch (IOException ex) {
            System.out.println("É impossivel criar o arquivo!");
        }
    }

    private static boolean testConnection() {
        String fileContent = null;
        try {
            fileContent = MergeNatureTools.getFileContentInString(CONNECTION_FILEPATH);
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

}
