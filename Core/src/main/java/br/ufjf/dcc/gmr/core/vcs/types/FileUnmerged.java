package br.ufjf.dcc.gmr.core.vcs.types;

/**
 *
 * @author Beatr
 */
public class FileUnmerged {
    private String path;
    public Unmerged file;
    
    public FileUnmerged(){
        path = " ";
        file = new Unmerged();
    }
}
