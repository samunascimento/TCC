/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

/**
 *
 * @author Beatr
 */
public class FileStatus {
    private Status type;
    private String path;
    public Files files;
    
    public FileStatus(Status tipo, String line){
        type = tipo;
        path = line;
    }

    public FileStatus(){
        type = null;
        path = " ";
        files = new Files();
    }
    /**
     * @return the type
     */
    public Status getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Status type) {
        this.type = type;
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
    
    
}
