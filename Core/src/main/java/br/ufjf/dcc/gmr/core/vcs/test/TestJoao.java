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
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws IOException, BranchNotFound, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, InvalidCommitHash {
        String repositoryPath = "/home/joao/Git/Teste";
        /*List<FileDiff> fileDiff = Git.diff(repositoryPath,"","");
    	for(FileDiff diff : fileDiff) {	
    		System.out.println(diff.getFilePathSource() + " -------- " + diff.getFilePathTarget());
    		for(LineInformation line : diff.getLines()){
    			System.out.println(line);
    		}
    		//System.out.println("*******************\n");
    	}*/
        MergesTest.SearchAllConflicts(repositoryPath);
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
