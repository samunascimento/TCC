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
}
