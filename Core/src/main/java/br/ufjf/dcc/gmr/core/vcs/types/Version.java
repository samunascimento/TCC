package br.ufjf.dcc.gmr.core.vcs.types;

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
