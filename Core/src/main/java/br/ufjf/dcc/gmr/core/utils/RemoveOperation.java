/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.utils;

/**
 *
 * @author felipepe
 */
public class RemoveOperation {

    private int line;

    public RemoveOperation(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
    
        @Override
    public String toString() {
        
        return "R(" + this.line + ")"; //To change body of generated methods, choose Tools | Templates.
    }
    

}
