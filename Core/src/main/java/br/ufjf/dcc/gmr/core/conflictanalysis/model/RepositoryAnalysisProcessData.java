package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao_lima
 */
public class RepositoryAnalysisProcessData {

    //Main list
    public List<MergeEvent> mergeEventList;

    //MergeEvent's field
    public CommitData hash;
    public List<CommitData> parents;
    public List<ConflictFile> conflictFiles;
    public CommitData commonAncestorOfParents;

    //ConflictFile's field
    public String fileName;
    public String filePath;
    public String insideFilePath;
    public String extraFileName;
    public String extraFilePath;
    public String extraInsideFilePath;
    public List<ConflictRegion> conflictRegion;

    //ConflictRegion's field
    public List<String> afterContext;
    public List<String> beforeContext;
    public List<String> v1;
    public List<String> v2;
    public List<String> solution;
    public int beginLine;
    public int separatorLine;
    public int endLine;
    public int solutionFirstLine;
    public int solutionFinalLine;
    public int originalV1FirstLine;
    public int originalV2FirstLine;

    //Assistants
    public String[] auxArray;
    public List<String> allFile;
    public double progress;
    public double analysed = 0.0;
    public double analysedPercentage = 0.0;
    public File sandbox;
    public boolean auxBool;
    public boolean extraFileInV1 = false;

    public RepositoryAnalysisProcessData() {
        this.mergeEventList = new ArrayList<>();
        this.parents = parents = new ArrayList<>();
        this.conflictFiles = new ArrayList<>();
        this.conflictRegion = new ArrayList<>();
        this.afterContext = new ArrayList<>();
        this.beforeContext = new ArrayList<>();
        this.v1 = new ArrayList<>();
        this.v2 = new ArrayList<>();
        this.solution = new ArrayList<>();
    }

}
