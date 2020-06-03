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
public @interface RectangleElement {
    public double width() default 10;
    public double height() default 5;
}
