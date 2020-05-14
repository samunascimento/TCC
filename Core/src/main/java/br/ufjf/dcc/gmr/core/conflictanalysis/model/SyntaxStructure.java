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
    private String structureType;
    private boolean warning;

    public SyntaxStructure(Token start, Token stop, String structureType, boolean warning) {
        this.startLine = start.getLine();
        this.stopLine = stop.getLine();
        this.startLineStartColumn = start.getStartIndex();
        this.startLineStopColumn = start.getStopIndex();
        this.stopLineStartColumn = stop.getStartIndex();
        this.stopLineStopColumn = stop.getStopIndex();
//        this.startLineStartColumn = start.getCharPositionInLine()+1;
//        this.startLineStopColumn = start.getCharPositionInLine()+start.getText().length();
//        this.stopLineStartColumn = stop.getCharPositionInLine()+1;
//        this.stopLineStopColumn = stop.getCharPositionInLine()+stop.getText().length();
        this.structureType = structureType;
        this.warning = warning;
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


    public String getStructureType() {
        return structureType;
    }
    
    public boolean isOneLine(){
        if(startLine == stopLine)
            return true;
        return false;
    }
    
    public boolean getWarning(){
        return this.warning;
    }
    
}
