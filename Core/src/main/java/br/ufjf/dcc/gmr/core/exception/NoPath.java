/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.exception;

/**
 *
 * @author luan
 */
public class NoPath extends Exception {
     public NoPath() {
        super("The path to the repository is necessary, use help for instructions! ");
    }
}
