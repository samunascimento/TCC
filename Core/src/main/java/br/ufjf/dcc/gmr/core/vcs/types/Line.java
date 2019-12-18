package br.ufjf.dcc.gmr.core.vcs.types;
import java.util.ArrayList;
/**
 *
 * @author icout
 */
public class Line {
    ArrayList<String> content;
    boolean added;

    public Line() {
        content = new ArrayList<>();
        added = false;
    }
    
}
