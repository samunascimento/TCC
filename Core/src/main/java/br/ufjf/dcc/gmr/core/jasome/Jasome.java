/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.vcs.types.Formats;
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
import java.util.ArrayList;
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
            .concat("jasome.bat");

    public static void main(String[] args) throws LocalRepositoryNotAGitRepository, CheckoutError, ParseException, InvalidDocument {

        try {
            int i =0;
            String repositoryPath = "C:\\Users\\Principal\\Desktop\\teste\\UFJF\\Core\\src";
            Git.checkout("master", repositoryPath); //checkout para voltar para a versão master
            List<Formats> log = Git.log(repositoryPath); 
            System.out.println(log.size());
            List<ReadXMLUsingSAX> versoes = new ArrayList<>(); //lista com as versões do projeto
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
                versoes.add(readXml);
                
                System.out.println(versoes.get(i).getProjectMetrics().getTloc().getValue());
                
                System.out.println(new Date());
                i++;
            }
        } catch (IOException ex) {
            System.out.println("Diretorio não existe");
        } catch (NullPointerException ex) {
            System.out.println("Commit não possui arquivo Java");
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
