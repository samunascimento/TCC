package br.ufjf.dcc.gmr.core.vcs.types;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author icout
 */
public class File {
    
    private String path;
    private Status status;
    private String type;
    private boolean renamed;
    private List<Chunk> chuncks;
    
    public File() {
        path = new String();
        status = Status.UNTRACKED;
        type = new String();
        renamed = false;
        chuncks = new ArrayList<>();
    }
    public File(String path, Status status){
        this.path = path;
        this.status = status;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * @return the renamed
     */
    public boolean isRenamed() {
        return renamed;
    }

    /**
     * @param renamed the renamed to set
     */
    public void setRenamed(boolean renamed) {
        this.renamed = renamed;
    }

    /**
     * @return the chuncks
     */
    public List<Chunk> getChuncks() {
        return chuncks;
    }

    /**
     * @param chuncks the chuncks to set
     */
    public void setChuncks(List<Chunk> chuncks) {
        this.chuncks = chuncks;
    }


}
