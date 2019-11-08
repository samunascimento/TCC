/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.MergesTest;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.BranchAlreadyExist;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
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

    public static void main(String[] args) throws IOException, BranchNotFound, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge {
    	MergesTest.SearchAllConflicts("/home/joao/Git/UFJF");
        /*
        String repositoryPath = "C:\\Users\\joaop\\Git\\UFJF";
        try{
            Git.listBranches(true, repositoryPath);
            Git.createBranch("Teste",false, repositoryPath);
            Git.listBranches(true, repositoryPath);
            Git.checkout("Teste", repositoryPath);
            Git.listBranches(true, repositoryPath);
            Git.deleteBranch("Teste", repositoryPath);
            Git.listBranches(true, repositoryPath);
            
        } catch (LocalRepositoryNotAGitRepository ex) {
            Logger.getLogger(TestJoao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BranchAlreadyExist ex) {
            Logger.getLogger(TestJoao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CheckoutError ex) {
            Logger.getLogger(TestJoao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        */
    }

}
