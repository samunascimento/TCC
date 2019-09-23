/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author icout
 */
public class ThereIsNoMergeToAbort extends Exception{
    public ThereIsNoMergeToAbort(String message){
        super(message);
    }
}
