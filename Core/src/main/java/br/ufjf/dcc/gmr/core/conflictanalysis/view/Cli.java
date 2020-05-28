/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GitRepositoryAnalysis;
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
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author luan
 */
public class Cli {
  
    public static final String DIRECTORY_PATH = "directory_path";
    public static final String DIRECTORY_PATHSHORT = "d";
    public static final String OUTMOST = "outmost";
    public static final String OUTMOST_SHORT = "o";
    public static final String CONTEXT_LINE_NUMBER = "context_line_number";
    public static final String CONTEXT_LINE_NUMBER_SHORT = "c";
    
    public static void main(String[] args) throws IsOutsideRepository, LocalRepositoryNotAGitRepository, RepositoryNotFound, java.text.ParseException, CheckoutError, InvalidDocument, OptionNotExist, NullPointerException, RefusingToClean, IOException, UnknownSwitch {
   
        CommandLineParser parser = new DefaultParser();
        Options options = new Options();
        
        options.addOption(new Option(DIRECTORY_PATHSHORT, DIRECTORY_PATH, true, "Directory"));
        options.addOption(new Option(OUTMOST_SHORT, OUTMOST_SHORT, false, "Outmost"));
        //options.addOption(new Option(CONTEXT_LINE_NUMBER_SHORT, CONTEXT_LINE_NUMBER, true, "Context Line Number"));
        //padrão 3, se existir pegar numero
        Option CONTEXT_LINE_NUMBER_SHORT = OptionBuilder.withArgName( "cln" )
                                .hasArg()
                                .withDescription("Number of context lines" )
                                .create( "cln" );
        options.addOption(CONTEXT_LINE_NUMBER_SHORT);
        
        CommandLine commandLine = null;
        
        try {

            CommandLine cmd = parser.parse(options, args);

           

            String directoryPath = cmd.getOptionValue(DIRECTORY_PATH);
            int cln=3;
            boolean OutmostBool=false;
            
            if (cmd.hasOption (OUTMOST)) {
               OutmostBool  = true;
            }
        
            if (cmd.hasOption("cln")) {
                  cln= Integer.parseInt(cmd.getOptionValue("cln"));
            }
      
            String contextLineNumber = cmd.getOptionValue(CONTEXT_LINE_NUMBER);
          
            
            
            
           GitRepositoryAnalysis analysis=new GitRepositoryAnalysis(directoryPath,cln,OutmostBool);
           analysis.startAnalysis();
        } catch (ParseException e) {
            System.out.println("Argumentos inválidos!");
        }
    
    }

   
    
    
}
