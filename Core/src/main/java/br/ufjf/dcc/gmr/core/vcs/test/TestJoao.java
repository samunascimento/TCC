/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.BranchAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) {

        String repositoryPath = "/Users/gleiph/repositories/voldemort";

        //        List<Formats> log = Git.log(repositoryPath);
//        for (Formats version : log) {
//
//            List<String> parents = Git.parent(repositoryPath, version.getCommitHash());
//
//            if (parents.size() > 1) {
//                System.out.println(version.getCommitHash() + " is a merge");
//            } else {
//                System.out.println(version.getCommitHash() + " is not a merge");
//
//            }
//        }
        Scanner teclado = new Scanner(System.in);
        String branch = "ramo1";

        System.out.println("branch = " + branch);

        try {

//            Git.branchAll(true, repositoryPath);
            System.out.println("Creanting branch");
            Git.createBranch(branch, false, repositoryPath);
//            Git.branchAll(true, repositoryPath);
        } catch (IOException ex) {
            System.out.println("Diretorio nao exite, digite um diretorio que contém um repositorio:");
            
            try {
                Git.createBranch(branch, false, teclado.nextLine());
            } catch (IOException ex1) {
                Logger.getLogger(TestJoao.class.getName()).log(Level.SEVERE, null, ex1);
            } catch (LocalRepositoryNotAGitRepository ex1) {
                Logger.getLogger(TestJoao.class.getName()).log(Level.SEVERE, null, ex1);
            } catch (BranchAlreadyExist ex1) {
                Logger.getLogger(TestJoao.class.getName()).log(Level.SEVERE, null, ex1);
            }

        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("Remositorio nao existe");
        } catch (BranchAlreadyExist ex) {
            System.out.println("Ramo existe");

        } catch (Exception ex) {
            System.out.println("Exception");

        }

    }

}
