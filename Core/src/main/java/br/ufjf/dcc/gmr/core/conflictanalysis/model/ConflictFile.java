package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.util.List;

public class ConflictFile {

    private final String fileName;
    private final List<ConflictRegion> conflictRegion;

    public ConflictFile(String fileName, List<ConflictRegion> conflictRegion) {
        this.fileName = fileName;
        this.conflictRegion = conflictRegion;
    }

    public String getFileName() {
        return fileName;
    }

    public List<ConflictRegion> getConflictRegion() {
        return conflictRegion;
    }

}
