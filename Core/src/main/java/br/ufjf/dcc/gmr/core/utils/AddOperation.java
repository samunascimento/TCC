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
public class AddOperation {
    private int line;
    private int size;

    public AddOperation(int line, int size) {
        this.line = line;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public String toString() {
        
        return "A(" + this.line + "," + this.size + ")"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
