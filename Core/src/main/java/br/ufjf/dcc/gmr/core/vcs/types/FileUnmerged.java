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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Unmerged getFile() {
        return file;
    }

    public void setFile(Unmerged file) {
        this.file = file;
    }
}
