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
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
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
            .concat("jasome");

    public static void main(String[] args) throws LocalRepositoryNotAGitRepository, CheckoutError, ParseException, InvalidDocument, RepositoryNotFound {

        try {
            int i = 0;
            String repositoryPath = "C:\\Users\\anton\\Documents\\Bolsa de pesquisa\\arquivoTeste\\Core\\src";
            Git.checkout("master", repositoryPath); //checkout para voltar para a versão master
            List<Formats> log = Git.log(repositoryPath);
            System.out.println(log.size());
            List<ReadXMLUsingSAX> versoes = new ArrayList<>(); //lista com as versões do projeto
            System.out.println("=================REVs=======================");
            for (Formats revision : log) {

                if (revision.getCommitHash().startsWith("fc36d40f")) {
                    System.out.println("Aqui");
                }

                System.out.println("======================" + revision.getCommitHash() + "==================");
                Git.clean(repositoryPath, true, 3);
                Git.reset(repositoryPath, true, false, false, null);
                Git.checkout(revision.getCommitHash(), repositoryPath);

                System.out.println(new Date());

                CLIExecution extractMetrics = extractMetrics(repositoryPath);

                if (extractMetrics.getError() != null && !extractMetrics.getError().isEmpty()) {
                    System.out.println("Tem erro!!!!S");
                }

                System.out.println("==============================================");
                ReadXMLUsingSAX readXml = new ReadXMLUsingSAX();
                readXml.fazerParsing(extractMetrics.getOutputString());
                versoes.add(readXml);

                try {
                    System.out.println(versoes.get(i).getProjectMetrics().getTloc().getValue());

                } catch (Exception e) {
                    System.out.println("Pulando versão " + revision.getCommitHash());
                } finally {
                    i++;
                }

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

    public static CLIExecution extractMetrics(String path) throws IOException {
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            return CLIExecute.execute(FILE_PATH.concat(".bat").concat(" ").concat("\"").concat(path).concat("\""), ".");
        }
        else
            return CLIExecute.execute(FILE_PATH.concat(" ").concat(path), ".");
    }

}
