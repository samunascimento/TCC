/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author Ian Couto
 */
public class RequiresAValue extends Exception {
    public RequiresAValue(String message){
        super(message);
    }
}
