package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.ArrayList;
import java.util.List;

/**
 * Type used in the command diff
 *
 * @author Luan and Gleiph
 */
public class FileDiff {

    private String filePathSource;
    private String filePathTarget;
    private List<LineInformation> lines;
    private List<String> arroba;
    private List<String> allMessage;

    /**
     * Constructor
     */
    public FileDiff() {
        this.allMessage = new ArrayList<>();
        this.lines = new ArrayList<>();
        this.arroba = new ArrayList<>();
        this.filePathSource = "";
        this.filePathTarget = "";
    }

    /**
     * Getter
     *
     * @return
     */
    public String getFilePathSource() {
        return filePathSource;
    }

    /**
     * Setter
     *
     * @param filePathSource
     */
    public void setFilePathSource(String filePathSource) {
        this.filePathSource = filePathSource;
    }

    /**
     * Getter
     *
     * @return
     */
    public String getFilePathTarget() {
        return filePathTarget;
    }

    /**
     * Setter
     *
     * @param filePathTarget
     */
    public void setFilePathTarget(String filePathTarget) {
        this.filePathTarget = filePathTarget;
    }

    /**
     * Getter
     *
     * @return
     */
    public List<LineInformation> getLines() {
        return lines;
    }

    /**
     * Setter
     *
     * @param lines
     */
    public void setLines(List<LineInformation> lines) {
        this.lines = lines;
    }

    /**
     * Getter
     *
     * @return
     */
    public List<String> getArroba() {
        return arroba;
    }

    /**
     * Setter
     *
     * @param arroba
     */
    public void setArroba(String arroba) {
        this.arroba.add(arroba);
    }

    /**
     * Getter
     *
     * @return
     */
    public List<String> getAllMessage() {
        return allMessage;
    }

    /**
     * Setter
     *
     * @param allMessage
     */
    public void setAllMessage(List<String> allMessage) {
        this.allMessage = allMessage;
    }

}
