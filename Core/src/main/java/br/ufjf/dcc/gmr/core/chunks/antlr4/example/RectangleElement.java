/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.example;


public @interface RectangleElement {
    
    int[] array = {1,2,3};
    
    public boolean isRun() default true;
    
    public int[] array() default {1,2,3};
    
    public double width() default 10;
    
}
