package br.ufjf.dcc.gmr.core.vcs.types;

/**
 *
 * @author Beatr
 */
public enum Status {
    MODIFIED("M"), UNTRACKED("?"), ADDED("A"), RENAMED("R"), DELETED("D"), COPIED("C"), UNMERGED("U"), UNMODIFIED("");

    private String status;
    Status(String valor){
        status = valor;
    }
    
    public String getStatus(){
        return this.status;
    }
}
