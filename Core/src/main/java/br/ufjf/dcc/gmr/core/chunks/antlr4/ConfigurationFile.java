/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felip
 */
public class ConfigurationFile {

    private String sandboxPath;
    private String projectPath;
    private String SHA;
    private List<String> filesToCheckParent1;
    private List<String> filesToCheckParent2;

    public ConfigurationFile(String sandboxPath, String projectPath, String SHA) {
        this.sandboxPath = sandboxPath;
        this.projectPath = projectPath;
        this.SHA = SHA;
    }

    public ConfigurationFile() {

    }

    public String getSandboxPath() {
        return sandboxPath;
    }

    public void setSandboxPath(String sandboxPath) {
        this.sandboxPath = sandboxPath;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getSHA() {
        return SHA;
    }

    public void setSHA(String SHA) {
        this.SHA = SHA;
    }

    /**
     * @return the filesToCheckParent1
     */
    public List<String> getFilesToCheckParent1() {
        return filesToCheckParent1;
    }

    /**
     * @param filesToCheckParent1 the filesToCheckParent1 to set
     */
    public void setFilesToCheckParent1(List<String> filesToCheckParent1) {
        this.filesToCheckParent1 = filesToCheckParent1;
    }

    /**
     * @return the filesToCheckParent2
     */
    public List<String> getFilesToCheckParent2() {
        return filesToCheckParent2;
    }

    /**
     * @param filesToCheckParent2 the filesToCheckParent2 to set
     */
    public void setFilesToCheckParent2(List<String> filesToCheckParent2) {
        this.filesToCheckParent2 = filesToCheckParent2;
    }
}
