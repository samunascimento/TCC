package br.ufjf.dcc.gmr.core.exception;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author icout
 */
public class NoRemoteForTheCurrentBranch extends Exception {
    public NoRemoteForTheCurrentBranch(String message){
        super(message);
    }
}
