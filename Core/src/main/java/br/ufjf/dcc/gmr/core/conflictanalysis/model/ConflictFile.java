package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.util.List;

public class ConflictFile {

    private final String fileName;
    private final String filePath;
    private final String insideFilePath;
    private final String extraFileName;
    private final String extraFilePath;
    private final String extraInsideFilePath;
    private final List<ConflictRegion> conflictRegion;

    public ConflictFile(String fileName, String filePath, String insideFilePath, List<ConflictRegion> conflictRegion) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.insideFilePath = insideFilePath;
        this.conflictRegion = conflictRegion;
        this.extraFileName = null;
        this.extraFilePath = null;
        this.extraInsideFilePath = null;
    }

    public ConflictFile(String fileName, String filePath, String insideFilePath, String extraFileName, String extraFilePath, String extraInsideFilePath, List<ConflictRegion> conflictRegion) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.insideFilePath = insideFilePath;
        this.extraFileName = extraFileName;
        this.extraFilePath = extraFilePath;
        this.extraInsideFilePath = extraInsideFilePath;
        this.conflictRegion = conflictRegion;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFormedFileName() {
        if (this.extraIsEmpty()) {
            return fileName;
        } else {
            return fileName + " &\n" + extraFileName;
        }
    }

    public String getFilePath() {
        return filePath;
    }

    public List<ConflictRegion> getConflictRegion() {
        return conflictRegion;
    }

    public String getExtraFileName() {
        return extraFileName;
    }

    public String getExtraFilePath() {
        return extraFilePath;
    }

    public boolean extraIsEmpty() {
        if (this.extraFileName == "" || this.extraFilePath == "" || this.extraInsideFilePath == "" || this.extraFileName == null || this.extraFilePath == null || this.extraInsideFilePath == null) {
            return true;
        }
        return false;
    }

}
