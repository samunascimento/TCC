package br.ufjf.dcc.gmr.core.conflictanalysis.models;

/**
 *
 * @author joao
 */
public class SyntaxStructure {
    
    private int startLine;
    private int finalLine;
    private String text;
    private String structureType;

    public SyntaxStructure(int startLine, int finalLine, String text, String structureType) {
        this.startLine = startLine;
        this.finalLine = finalLine;
        this.text = text;
        this.structureType = structureType;
    }
    
    public int getStartLine() {
        return startLine;
    }
    
    public int getFinalLine() {
        return finalLine;
    }

    public String getText() {
        return text;
    }

    public String getStructureType() {
        return structureType;
    }
    
    public boolean isOneLine(){
        if(startLine == finalLine)
            return true;
        return false;
    }
    
}
