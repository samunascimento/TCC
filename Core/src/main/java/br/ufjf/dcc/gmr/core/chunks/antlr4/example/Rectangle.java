/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.example;

/**
 *
 * @author ian
 */
public interface Rectangle<T> {
    @RectangleElement
    double WIDTH = 10;
    @RectangleElement
    double HEIGHT = 5;
    
    public int area();
    
    @RectangleElement
    public static double diagonal( ){
        double aux = 1;
        return aux;
    }
    
    public T compareTo(T one);
    
}
