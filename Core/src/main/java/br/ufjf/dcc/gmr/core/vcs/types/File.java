package br.ufjf.dcc.gmr.core.vcs.types;
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
    public File(String path, String status){
        this.path = path;
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPreviousPath() {
        return previousPath;
    }

    public void setPreviousPath(String previousPath) {
        this.previousPath = previousPath;
    }

    public boolean isRenamed() {
        return renamed;
    }

    public void setRenamed(boolean renamed) {
        this.renamed = renamed;
    }

    public ArrayList<Chunck> getChuncks() {
        return chuncks;
    }

    public void setChuncks(ArrayList<Chunck> chuncks) {
        this.chuncks = chuncks;
    }
    
}
