/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.principal;
import java.util.ArrayList;
/**
 *
 * @author icout
 */
public class File {
    String path, status, type, previousPath;
    boolean renamed;
    ArrayList<Chunck> chuncks;
    
    public File() {
        path = new String();
        status = new String();
        type = new String();
        previousPath = new String();
        renamed = false;
        chuncks = new ArrayList<>();
    }
}
