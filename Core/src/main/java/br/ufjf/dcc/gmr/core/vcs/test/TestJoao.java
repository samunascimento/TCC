/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.MergesTest;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;

import java.io.IOException;


/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws IOException, BranchNotFound, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, InvalidCommitHash {
        String repositoryPath = "/home/joao/Git/Twitter4J";
        MergesTest.searchAllConflicts(repositoryPath);
    }

}
