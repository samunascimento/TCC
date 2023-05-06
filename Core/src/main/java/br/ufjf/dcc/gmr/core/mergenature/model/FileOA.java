package br.ufjf.dcc.gmr.core.mergenature.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to record external changes during the conflict resolution process.
 *
 * @author João Pedro Lima
 * @since 13-11-2020
 */
public class FileOA {

    private String filePath;
    private List<Alteration> alterations;
    private transient ConflictFile conflictFile;

    public FileOA() {
        this.alterations = new ArrayList<>();
    }

    public FileOA(String filePath, List<Alteration> alterations, ConflictFile conflictFile) {
        this.filePath = filePath;
        this.alterations = alterations;
        this.conflictFile = conflictFile;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<Alteration> getAlterations() {
        return alterations;
    }

    public void setAlterations(List<Alteration> alterations) {
        this.alterations = alterations;
    }

    public void addAlteration(Alteration alteration) {
        alterations.add(alteration);
    }

    public ConflictFile getConflictFile() {
        return conflictFile;
    }

    public void setConflictFile(ConflictFile conflictFile) {
        this.conflictFile = conflictFile;
    }
    
    

}
