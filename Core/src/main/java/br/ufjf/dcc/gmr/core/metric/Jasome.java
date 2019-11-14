/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.metric;

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
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gleiph
 */
public class Jasome {

    private static final String FILE_PATH = "./thirdparty/jasome/build/distributions/jasome/bin/jasome";

    public static void main(String[] args) throws LocalRepositoryNotAGitRepository, CheckoutError, ParseException, InvalidDocument {

        try {
                    String repositoryPath = "/Users/gleiph/Dropbox/UFJF/repositorios/UFJFCopy";
        String projectPath = "/Users/gleiph/Dropbox/UFJF/repositorios/UFJFCopy/Core/src";
//            String repositoryPath = "/Users/gleiph/repositories/voldemort";
//            String projectPath = "/Users/gleiph/repositories/voldemort/src";

            List<Formats> log = Git.log(repositoryPath);

            System.out.println("=================REVs=======================");
            for (Formats revision : log) {

                System.out.println("======================" + revision.getCommitHash() + "==================");
                Git.clean(repositoryPath, true, 3);
                Git.reset(repositoryPath, true, false, false, null);
                Git.checkout(revision.getCommitHash(), repositoryPath);

                System.out.println(new Date());
                Integer totalLineCode = totalLineCode(projectPath);
                System.out.println("totalLineCode = " + totalLineCode);
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

        return CLIExecute.execute(FILE_PATH.concat(" ").concat(path), ".");

    }

    public static Integer totalLineCode(String path) throws IOException {
        CLIExecution execution = extractMetrics(path);

        if (execution.getError() == null || execution.getError().isEmpty() || (execution.getError() != null && !execution.getOutput().isEmpty())) {
            String line = execution.getOutput().get(3);
            String[] split = line.split("\"");

            return Integer.parseInt(split[5]);
        }
        return null;
    }
    
    

}
