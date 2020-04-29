package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.ArrayList;
import java.util.List;

/**
 * Object created to analyze the diff command output
 *
 * @author Luan and Gleiph
 */
public class FileDiff {

    private String filePathSource;
    private String filePathTarget;
    private List<LineInformation> lines;
    private List<String> arroba;
    private List<String> allMessage;

    public FileDiff() {
        this.allMessage = new ArrayList<>();
        this.lines = new ArrayList<>();
        this.arroba = new ArrayList<>();
        this.filePathSource = "";
        this.filePathTarget = "";
    }

    public String getFilePathSource() {
        return filePathSource;
    }

    public void setFilePathSource(String filePathSource) {
        this.filePathSource = filePathSource;
    }

    public String getFilePathTarget() {
        return filePathTarget;
    }

    public void setFilePathTarget(String filePathTarget) {
        this.filePathTarget = filePathTarget;
    }

    public List<LineInformation> getLines() {
        return lines;
    }

    public void setLines(List<LineInformation> lines) {
        this.lines = lines;
    }

    public List<String> getArroba() {
        return arroba;
    }

    public void setArroba(String arroba) {
        this.arroba.add(arroba);
    }

    public List<String> getAllMessage() {
        return allMessage;
    }

    public void setAllMessage(List<String> allMessage) {
        this.allMessage = allMessage;
    }

    /**
     * Function to verify if the file was renamed
     *
     * @return true if the file was renamed and false otherwise.
     */
    public boolean isRenamed() {
        return !this.filePathSource.equals(this.filePathTarget);
    }

}
