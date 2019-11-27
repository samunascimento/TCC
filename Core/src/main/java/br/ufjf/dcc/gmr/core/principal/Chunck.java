/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.principal;

/**
 *
 * @author icout
 */
public class Chunck {
    boolean conflict;
    Line begin, end;

    public Chunck() {
        conflict = false;
        begin = new Line();
        end = new Line();
    }
    
}
