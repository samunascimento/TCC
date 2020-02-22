package br.ufjf.dcc.gmr.core.conflictanalysis.GUI.view;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author joao
 */
public class SyntaxStructure {

    private Token start;
    private Token stop;
    private String text;
    private String structureType;

    public SyntaxStructure(Token start, Token stop, String text, String structureType) {
        this.start = start;
        this.stop = stop;
        this.text = text;
        this.structureType = structureType;
    }

    public Token getStart() {
        return start;
    }

    public Token getStop() {
        return stop;
    }

    public String getText() {
        return text;
    }

    public String getStructureType() {
        return structureType;
    }
    
    public boolean isOneLine(){
        if(start.getLine() == stop.getLine())
            return true;
        return false;
    }

}
