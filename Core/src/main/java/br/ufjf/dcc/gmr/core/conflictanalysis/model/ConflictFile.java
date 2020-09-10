package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.util.List;

public class ConflictFile {

    private  String fileName;
    private  String filePath;
    private  String insideFilePath;
    private  String extraFileName;
    private  String extraFilePath;
    private  String extraInsideFilePath;
    private  List<ConflictRegion> conflictRegion;
    
    private int id;

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
    
    public ConflictFile(){
        
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

    public String getInsideFilePath() {
        return insideFilePath;
    }

    public String getExtraInsideFilePath() {
        return extraInsideFilePath;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setInsideFilePath(String insideFilePath) {
        this.insideFilePath = insideFilePath;
    }

    public void setExtraFileName(String extraFileName) {
        this.extraFileName = extraFileName;
    }

    public void setExtraFilePath(String extraFilePath) {
        this.extraFilePath = extraFilePath;
    }

    public void setExtraInsideFilePath(String extraInsideFilePath) {
        this.extraInsideFilePath = extraInsideFilePath;
    }

    public void setConflictRegion(List<ConflictRegion> conflictRegion) {
        this.conflictRegion = conflictRegion;
    }
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public boolean extraIsEmpty() {
        if (this.extraFileName == "" || this.extraFilePath == "" || this.extraInsideFilePath == "" || this.extraFileName == null || this.extraFilePath == null || this.extraInsideFilePath == null) {
            return true;
        }
        return false;
    }

}
