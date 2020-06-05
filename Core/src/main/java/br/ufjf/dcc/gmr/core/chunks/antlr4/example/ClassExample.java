/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.example;

/**
 *
 * @author fesuperlip
 */
public class ClassExample extends SuperClassExample{

    public ClassExample(String string, int inteiro) {
        super(string, inteiro);
    }
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    
}
