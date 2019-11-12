/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
          String repositoryPath="/home/luan/UFJF";

        // Git.reset(repositoryPath,true, false, false,"");
        List<FileDiff> result = new ArrayList<>();
        try {
            result = Git.diff(repositoryPath, "4790a3a", " 25fedab");

            for (FileDiff file : result) {
                System.out.println("=======================================");
                System.out.println(file.getFilePathSource());
                System.out.println(file.getFilePathTarget());
                System.out.println("Lines");
                for (LineInformation line : file.getLines()) {
                    System.out.println(line);
                }
            }

        } catch (IOException ex) {
            System.out.println("Erro");
        };

    }

}
