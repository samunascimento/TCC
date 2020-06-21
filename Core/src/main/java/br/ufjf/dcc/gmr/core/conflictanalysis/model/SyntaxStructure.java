package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author João Pedro Lima
 */
public class SyntaxStructure {

    private final int startLine;
    private final int stopLine;
    private final int startLineStartColumn;
    private final int startLineStopColumn;
    private final int stopLineStartColumn;
    private final int stopLineStopColumn;
    private final String structureType;
    private final boolean warning;
    private final String text;

    public SyntaxStructure(Token start, Token stop, String structureType, String text, boolean warning) {
        this.startLine = start.getLine();
        this.stopLine = stop.getLine();
        this.startLineStartColumn = start.getStartIndex();
        this.startLineStopColumn = start.getStopIndex();
        this.stopLineStartColumn = stop.getStartIndex();
        this.stopLineStopColumn = stop.getStopIndex();
        this.structureType = structureType;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public int getStopLineStopColumn() {
        return stopLineStopColumn;
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

    @Override
    public String toString() {
        return "SyntaxStructure{" + "startLine=" + startLine + ", stopLine=" + stopLine + ", startLineStartColumn=" + startLineStartColumn + ", startLineStopColumn=" + startLineStopColumn + ", stopLineStartColumn=" + stopLineStartColumn + ", stopLineStopColumn=" + stopLineStopColumn + ", structureType=" + structureType + ", warning=" + warning + '}';
    }

}
