package br.ufjf.dcc.gmr.core.mergenature.model;

/**
 * Class to record an alteration obtained in diff command
 *
 * @author João Pedro Lima
 * @since 13-11-2020
 */
public class Alteration {

    private String content;
    private boolean isAddition;
    private boolean wasInsideChunk;

    public Alteration() {

    }

    public Alteration(String content, boolean isAddition, boolean wasInsideChunk) {
        this.content = content;
        this.isAddition = isAddition;
        this.wasInsideChunk = wasInsideChunk;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isAddition() {
        return isAddition;
    }

    public void setIsAddition(boolean isAddition) {
        this.isAddition = isAddition;
    }

    public boolean wasInsideChunk() {
        return wasInsideChunk;
    }

    public void setWasInsideChunk(boolean wasInsideChunk) {
        this.wasInsideChunk = wasInsideChunk;
    }

    
}
