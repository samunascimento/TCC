/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gleiph
 */
public class Jasome {

    private static final String FILE_PATH = ".".concat(File.separator).concat("thirdparty").concat(File.separator)
            .concat("jasome").concat(File.separator).concat("build").concat(File.separator).concat("distributions")
            .concat(File.separator).concat("jasome").concat(File.separator).concat("bin").concat(File.separator)
            .concat("jasome");

    public static void main(String[] args) throws LocalRepositoryNotAGitRepository, CheckoutError, ParseException, InvalidDocument {

        try {
              String repositoryPath = "/Users/gleiph/Dropbox/UFJF/repositorios/UFJFCopy";

            List<Formats> log = Git.log(repositoryPath);

            System.out.println("=================REVs=======================");
            for (Formats revision : log) {

                System.out.println("======================" + revision.getCommitHash() + "==================");
                Git.clean(repositoryPath, true, 3);
                Git.reset(repositoryPath, true, false, false, null);
                Git.checkout(revision.getCommitHash(), repositoryPath);

                System.out.println(new Date());
                
                        String extractMetrics = extractMetrics(repositoryPath);
                        
                        System.out.println("==============================================");
                        ReadXMLUsingSAX readXml = new ReadXMLUsingSAX();
                        readXml.fazerParsing(extractMetrics);
                        System.out.println(readXml.getProjectMetrics().getTloc().getValue());
                        
                System.out.println(new Date());

            }
        } catch (IOException ex) {
            System.out.println("Diretorio não existe");
        } catch (UnknownSwitch ex) {
            System.out.println("UnknownSwitch");
        } catch (RefusingToClean ex) {
            System.out.println(ex.getMessage());
        } catch (IsOutsideRepository ex) {
            System.out.println(ex.getMessage());
        } 

    }

    public static String extractMetrics(String path) throws IOException {

        CLIExecution execute = CLIExecute.execute(FILE_PATH.concat(" ").concat(path), ".");
        List<String> output = execute.getOutput();

        StringBuilder sb = new StringBuilder();
        for (String line : output) {
            sb.append(line).append("\n");
        }
        
        return sb.toString();
    }
        

}
