package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author João Pedro Lima
 */
public class SyntaxStructure {

    private int startLine;
    private int stopLine;
    private int startCharIndex;
    private int stopCharIndex;
    private String structureType;
    private boolean warning;
    private String text;
    private int id;

    public SyntaxStructure(Token start, Token stop, String structureType, String text, boolean warning) {
        this.startLine = start.getLine();
        this.stopLine = stop.getLine();
        this.startCharIndex = start.getStartIndex();
        this.stopCharIndex = stop.getStopIndex();
        this.structureType = structureType;
        this.text = text;
        this.warning = warning;
    }

    public SyntaxStructure(Token token, boolean warning) {
        this.startLine = token.getLine();
        this.stopLine = (token.getLine() + token.getText().split("\n").length - 1);
        this.startCharIndex = token.getStartIndex();
        this.stopCharIndex = token.getStopIndex();
        if (token.getType() == 117) {
            this.structureType = "MultiLineComment";
        } else {
            this.structureType = "LineComment";
        }
        this.text = token.getText();
        this.warning = warning;
    }

    public int getStartLine() {
        return startLine;
    }

    public int getStopLine() {
        return stopLine;
    }

    public int getStartCharIndex() {
        return startCharIndex;
    }

    public String getText() {
        return text;
    }

    public int getStopCharIndex() {
        return stopCharIndex;
    }

    public String getStructureType() {
        return structureType;
    }

    public boolean isOneLine() {
        if (startLine == stopLine) {
            return true;
        }
        return false;
    }

    public boolean getWarning() {
        return this.warning;
    }

    public String getForm() {
        String result = "STRUCTURE TYPE: " + this.getStructureType()
                + "\nSTART LINE: " + this.startLine
                + "\nSTOP LINE: " + this.stopLine
                + "\nSTART CHAR INDEX: " + this.startCharIndex
                + "\nSTOP CHAR INDEX: " + this.stopCharIndex
                + "\nTEXT:\n" + this.text;
        return result;
    }

    //---------------------------------------------------------------------------
    public boolean isWarning() {
        return warning;
    }
    

    

    public void setStartLine(int startLine) {
        this.startLine = startLine;
    }

    public void setStopLine(int stopLine) {
        this.stopLine = stopLine;
    }

    public void setStartCharIndex(int startCharIndex) {
        this.startCharIndex = startCharIndex;
    }

    public void setStopCharIndex(int stopCharIndex) {
        this.stopCharIndex = stopCharIndex;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType;
    }

    public void setWarning(boolean warning) {
        this.warning = warning;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public SyntaxStructure(){}
    
    //---------------------------------------------------------------------------
    
    
}
