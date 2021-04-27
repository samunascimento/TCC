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
public class DoubleSave extends Exception {
      public DoubleSave() {
        super("It is not possible to save at the computer and the database at the same time, please chose one");
    }
}
