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


public class Notsaving extends Exception {

    public Notsaving() {
        super("\"The analysis will not be save anywhere, please use '-s' to save on the computer\" "
                + "+ \"or '-db' to save on yout database \"");
    }

}