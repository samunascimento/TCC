package br.ufjf.dcc.gmr.core.conflictanalysis.GUI.view;

import java.util.ArrayList;
import java.util.List;

public class ConflictFile {

    private String fileName;
    private List<ConflictRegion> conflictRegion;

    protected ConflictFile() {
        this.conflictRegion = new ArrayList<>();
        this.fileName = "";
    }

    public String getFileName() {
        return fileName;
    }

    protected void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<ConflictRegion> getConflictRegion() {
        return conflictRegion;
    }

    protected void setConflictRegion(List<ConflictRegion> conflictRegion) {
        this.conflictRegion = conflictRegion;
    }

    protected void addConflictRegion(ConflictRegion conflictRegion) {
        this.conflictRegion.add(conflictRegion);
    }

}
