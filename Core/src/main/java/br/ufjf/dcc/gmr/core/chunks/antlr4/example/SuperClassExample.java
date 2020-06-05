/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.example;

/**
 *
 * @author felip
 */
public class SuperClassExample {

    private String string;
    private int inteiro;

    public SuperClassExample(String string, int inteiro) {
        this.string = string;
        this.inteiro = inteiro;
    }
     public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
    /**
     * @return the string
     */
    public String getString() {
        return string;
    }

    /**
     * @param string the string to set
     */
    public void setString(String string) {
        this.string = string;
    }

    /**
     * @return the inteiro
     */
    public int getInteiro() {
        return inteiro;
    }

    /**
     * @param inteiro the inteiro to set
     */
    public void setInteiro(int inteiro) {
        this.inteiro = inteiro;
    }

}
