package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author joao
 */
public class SyntaxStructure {

    private int startLine;
    private int stopLine;
    private int startLineStartColumn;
    private int startLineStopColumn;
    private int stopLineStartColumn;
    private int stopLineStopColumn;
    private String text;
    private String structureType;

    public SyntaxStructure(Token start, Token stop, String text, String structureType) {
        this.startLine = start.getLine();
        this.stopLine = stop.getLine();
        this.startLineStartColumn = start.getStartIndex();
        this.startLineStopColumn = start.getStopIndex();
        this.stopLineStartColumn = stop.getStartIndex();
        this.stopLineStopColumn = stop.getStopIndex();
        this.text = text;
        this.structureType = structureType;
    }

    public int getStartLine() {
        return startLine;
    }

    public int getStopLine() {
        return stopLine;
    }

    public int getStartLineStartColumn() {
        return startLineStartColumn;
    }

    public int getStartLineStopColumn() {
        return startLineStopColumn;
    }

    public int getStopLineStartColumn() {
        return stopLineStartColumn;
    }

    public int getStopLineStopColumn() {
        return stopLineStopColumn;
    }

    public String getText() {
        return text;
    }

    public String getStructureType() {
        return structureType;
    }
    
    public boolean isOneLine(){
        if(startLine == stopLine)
            return true;
        return false;
    }

}
