package br.ufjf.dcc.gmr.core.conflictanalysis.models;

import br.ufjf.dcc.gmr.core.conflictanalysis.models.ConflictRegion;
import java.util.ArrayList;
import java.util.List;

public class ConflictFile {

    private String fileName;
    private List<ConflictRegion> conflictRegion;

    public ConflictFile() {
        this.conflictRegion = new ArrayList<>();
        this.fileName = "";
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<ConflictRegion> getConflictRegion() {
        return conflictRegion;
    }

    public void setConflictRegion(List<ConflictRegion> conflictRegion) {
        this.conflictRegion = conflictRegion;
    }

    public void addConflictRegion(ConflictRegion conflictRegion) {
        this.conflictRegion.add(conflictRegion);
    }

}
