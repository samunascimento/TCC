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
public class OverrideExample {

    private String exampleString;
    boolean exampleBool;

    public OverrideExample(String exampleString, boolean exampleBool) {
        this.exampleBool = exampleBool;
        this.exampleString = exampleString;

    }

    /**
     * @return the exampleString
     */
    public String getExampleString() {
        return exampleString;
    }

    /**
     * @param exampleString the exampleString to set
     */
    public void setExampleString(String exampleString) {
        this.exampleString = exampleString;
    }

    /**
     * @return the exampleBool
     */
    public boolean isExampleBool() {
        return exampleBool;
    }

    /**
     * @param exampleBool the exampleBool to set
     */
    public void setExampleBool(boolean exampleBool) {
        this.exampleBool = exampleBool;
    }

}
