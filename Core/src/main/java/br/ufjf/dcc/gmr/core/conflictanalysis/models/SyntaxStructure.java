/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.models;

import java.util.List;

/**
 *
 * @author joao
 */
public class SyntaxStructure {
    
    private int startLine;
    private int finalLine;
    private String text;
    private String structureType;

    public int getStartLine() {
        return startLine;
    }

    protected void setStartLine(int startLine) {
        this.startLine = startLine;
    }

    public int getFinalLine() {
        return finalLine;
    }

    protected void setFinalLine(int finalLine) {
        this.finalLine = finalLine;
    }

    public String getText() {
        return text;
    }

    protected void setText(String text) {
        this.text = text;
    }

    public String getStructureType() {
        return structureType;
    }

    protected void setStructureType(String structureType) {
        this.structureType = structureType;
    }
    
}
