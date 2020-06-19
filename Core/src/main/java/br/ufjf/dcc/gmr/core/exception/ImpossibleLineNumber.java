/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.exception;

/**
 * Exception that is throwed when there is a negative number on the original line number parameter on ReturnNewLineNumber.
 *
 * @author Luan
 */
public class ImpossibleLineNumber extends Exception {
    public  ImpossibleLineNumber (){
    super("Esse não é um numero valido pra comparação");
}
}
