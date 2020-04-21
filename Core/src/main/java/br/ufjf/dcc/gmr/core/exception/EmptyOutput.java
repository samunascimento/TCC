/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author luand
 */
public class EmptyOutput extends Exception {
   
    public EmptyOutput(){
        super("The Diff was blank but the selected class was not empty");
    }
    

}