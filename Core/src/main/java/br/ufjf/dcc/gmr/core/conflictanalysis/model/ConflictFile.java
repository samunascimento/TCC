package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.util.List;

public class ConflictFile {

    private final String fileName;
    private final String filePath;
    private final String insideFilePath;
    private final List<ConflictRegion> conflictRegion;
    
    public ConflictFile(String fileName, String filePath,String insideFilePath ,List<ConflictRegion> conflictRegion) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.insideFilePath = insideFilePath;
        this.conflictRegion = conflictRegion;
    }

    public String getFileName() {
        return fileName;
    }
    public String getFilePath() {
        return filePath;
    }
    public List<ConflictRegion> getConflictRegion() {
        return conflictRegion;
    }

}
