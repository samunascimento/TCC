/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipepe
 */
public class DiffAnalyze {

    private List<String> added;
    private List<String> removed;

    public DiffAnalyze() {
        added = new ArrayList<>();
        removed = new ArrayList<>();
    }

    public void setModifiedLines(List<String> fileDiff) {

        for (String string : fileDiff) {
            if (string.length() > 1) {
                if (string.substring(0, 2).equals("+ ")) {
                    added.add(string);
                } else if (string.substring(0, 2).equals("- ")) {
                    removed.add(string);
                }
            }else if(string.length() == 1){
                 if (string.substring(0, 1).equals("+")) {
                    added.add(string);
                } else if (string.substring(0, 1).equals("-")) {
                    removed.add(string);
                }
            }

        }
    }

    /**
     * @return the added
     */
    public List<String> getAdded() {
        return added;
    }

    /**
     * @param added the added to set
     */
    public void setAdded(List<String> added) {
        this.added = added;
    }

    /**
     * @return the removed
     */
    public List<String> getRemoved() {
        return removed;
    }

    /**
     * @param removed the removed to set
     */
    public void setRemoved(List<String> removed) {
        this.removed = removed;
    }
}
