package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author João Pedro Lima
 */
public class SyntaxStructure {

    private final int startLine;
    private final int stopLine;
    private final int startCharIndex;
    private final int stopCharIndex;
    private final String structureType;
    private final boolean warning;
    private final String text;

    public SyntaxStructure(Token start, Token stop, String structureType,String text, boolean warning) {
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

}
