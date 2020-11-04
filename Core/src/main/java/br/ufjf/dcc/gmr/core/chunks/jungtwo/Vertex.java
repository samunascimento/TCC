/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.jungtwo;

/**
 *
 * @author onofre
 */
public class Vertex {
    
    //Exemples
    
    private int coordX;
    private int coordY;
    
    public Vertex(int coordX, int coordY){
        this.coordX = coordX;
        this.coordY = coordY;
    }
    
    @Override
    public String toString() {
        return "(" + this.coordX + ", " + this.coordY + ")";
    }
    
    //
    
    public Vertex() {

    }
}
