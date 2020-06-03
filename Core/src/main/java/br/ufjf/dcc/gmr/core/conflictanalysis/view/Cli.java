/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GSONClass;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GitRepositoryAnalysis;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import java.io.File;
import java.io.IOException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author luan
 */
public class Cli {

    public static final String DIRECTORY_PATH = "directory_path";
    public static final String DIRECTORY_PATH_SHORT = "d";
    public static final String OUTMOST = "outmost";
    public static final String OUTMOST_SHORT = "o";
    public static final String CONTEXT_LINE_NUMBER = "context_line_number";
    public static final String CONTEXT_LINE_NUMBER_SHORT = "c";
    public static final String SAVE_PATH = "save_path";
    public static final String SAVE_PATH_SHORT = "s";

    public static void main(String[] args) throws IsOutsideRepository, LocalRepositoryNotAGitRepository, RepositoryNotFound, java.text.ParseException, CheckoutError, InvalidDocument, OptionNotExist, NullPointerException, RefusingToClean, IOException, UnknownSwitch {

        CommandLineParser parser = new DefaultParser();
        Options options = new Options();

        options.addOption(new Option(DIRECTORY_PATH_SHORT, DIRECTORY_PATH, true, "Directory"));
        options.addOption(new Option(SAVE_PATH_SHORT, SAVE_PATH, true, "Save path"));
        options.addOption(new Option(OUTMOST_SHORT, OUTMOST_SHORT, false, "Outmost"));

        Option context_Line_Number_Short = OptionBuilder.withArgName("c")
                .hasArg()
                .withDescription("Number of context lines")
                .create("c");
        options.addOption(context_Line_Number_Short);

        
        CommandLine commandLine = null;

        try {

            CommandLine cmd = parser.parse(options, args);

            String directoryPath = cmd.getOptionValue(DIRECTORY_PATH);
            int cln = 3;
            boolean OutmostBool = false;

            String savePath = cmd.getOptionValue(SAVE_PATH);

            String name;

            if (cmd.hasOption("o") || cmd.hasOption("outmost")) {
                OutmostBool = true;
            }

            if (cmd.hasOption("c")) {
                cln = Integer.parseInt(cmd.getOptionValue("c"));
            }

            GitRepositoryAnalysis analysis = new GitRepositoryAnalysis(directoryPath, cln, OutmostBool);
            analysis.startAnalysis();
            name = analysis.getProjectName();

            if (!savePath.endsWith(".gson")) {

                File directory = new File(savePath);

                if (!directory.isDirectory()) {
                    directory.mkdirs();
                }
                savePath = savePath + File.separator + name + ".gson";
            }

            if (analysis.getMergeEventList() != null) {
                GSONClass.save(savePath, analysis.getMergeEventList());
            } else {
                System.out.println("Ops, it was not suposed to happen!");
            }
        } catch (ParseException e) {
            System.out.println("Invalid arguments!");
        } catch (NumberFormatException e) {
            System.out.println("Context line number must be a number");
        }

    }

}
