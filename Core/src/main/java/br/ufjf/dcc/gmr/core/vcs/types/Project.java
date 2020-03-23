/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felip
 */
public class Project {
     String name, path;
     List<Version> versions;
     
    public Project(){
        this.name = new String();
        this.path = new String();
        this.versions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Version> getVersions() {
        return versions;
    }
    
    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }
    
    public Version getVersionBySHA(Object SHA){
        for(int i = 0; i < versions.size(); i++){
            if(versions.get(i).getSHA().equals(SHA))
                return versions.get(i);
        }
        return null;
    }
    public Project(String name, String path, List<Version> versions) {
        this.name = name;
        this.path = path;
        this.versions = versions;
    }
}
