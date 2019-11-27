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
public class Version {
    String SHA, author, commiter, data;
    boolean merge;
    //conflict?
    ArrayList<File> file;

    public Version() {
        SHA = new String();
        merge = false;
        author = new String();
        commiter = new String();
        data = new String();
        file = new ArrayList<>();
    }
    
}
