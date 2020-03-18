package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.RepositoryAnalysis;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.returnNewLineNumber;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;

/**
 *
 * @author luand
 */
public class TestLuan {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     */
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {
//        String repositoryPath = "/Users/gleiph/Dropbox/UFJF/repositorios/UFJF";
        String repositoryPath = "/ice/UFJF";

        returnNewLineNumber a = new returnNewLineNumber();
        List<FileDiff> teste = new ArrayList<>();

        teste = a.FillFileDiff(repositoryPath, "988214d8721e66f30088cccef106887f10150f02", "e03c59a6e99d01fcc55fb9cccc75c75eb1fad3b0");

        for (FileDiff line : teste) {
            for (LineInformation number : line.getLines()) {

                System.out.println(number.toString());
            }

        }

    }
}
