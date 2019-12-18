package br.ufjf.dcc.gmr.core.vcs.types;

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
