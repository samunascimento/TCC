/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.exception.GitException;
import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.controller.GSONClass;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import static br.ufjf.dcc.gmr.core.mergenature.view.MNFrame.CONNECTION_FILEPATH;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
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

    public static final String GUI = "gui";
    public static final String GUI_SHORT = "g";

    public static void main(String[] args) throws java.text.ParseException, NullPointerException, IOException, GitException, SQLException {

        CommandLineParser parser = new DefaultParser();
        Options options = new Options();

        Option repositoryOption = new Option(REPOSITORY_PATH_SHORT, REPOSITORY_PATH, true, "Repository");
        options.addOption(repositoryOption);

        Option saveOption = new Option(SAVE_PATH_SHORT, SAVE_PATH, true, "Save path");
        saveOption.setRequired(false);
        options.addOption(saveOption);

        Option DataBaseOption = new Option(SAVE_IN_THE_DATABASE_SHORT, SAVE_IN_THE_DATABASE, false, "Save in the Database");
        saveOption.setRequired(false);
        options.addOption(DataBaseOption);

        Option contextLineOption = new Option(CONTEXT_LINE_NUMBER_SHORT, CONTEXT_LINE_NUMBER, true, "Number of context lines");
        options.addOption(contextLineOption);

        Option guioption = new Option(GUI_SHORT, GUI, false, "Command to call the graphical interface");
        options.addOption(guioption);

        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("gui") || cmd.hasOption("g")) {

                throw new IOException();
            }

            if (!cmd.hasOption("r")) {
                throw new IOException();
            }

            if (!(cmd.hasOption("s") ^ cmd.hasOption("db"))) {

                if ((cmd.hasOption("s") && cmd.hasOption("db"))) {
                    System.out.println("Double save is not suported yet");
                    throw new IOException();

                } else {
                    System.out.println("The analysis is not being saved");
                    throw new IOException();
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

            Algorithm algorithm = new Algorithm();
            Project project = algorithm.run(directoryPath);
            name = project.getName();

            if (cmd.hasOption("s")) {
                if (!savePath.endsWith(".mntr")) {

                    File directory = new File(savePath);

                    if (!directory.isDirectory()) {
                        directory.mkdirs();
                    }
                    savePath = savePath + File.separator + name + ".mntr";
                }

                if (project.getMerges() != null) {
                    GSONClass.save(savePath, project);
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
                        throw new IOException();
                    }

                }
                /*String[] data = fileContent.split(";");
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
                }*/
            }
        } catch (ParseException | NumberFormatException e) {

            if (e instanceof NumberFormatException) {
                System.out.println("Context line number must be a number");
            }

            formatter.printHelp("help", options);
        } catch (IOException ex) {
            callGui();
        }

    }

    private static void callGui() {
        MNFrame frame = new MNFrame();
        frame.start();
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
