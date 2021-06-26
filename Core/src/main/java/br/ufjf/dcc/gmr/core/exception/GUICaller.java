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
public class GUICaller extends Exception {
     public GUICaller() {
        super("The graphical interfave was called, loading ... ");
    }
}
