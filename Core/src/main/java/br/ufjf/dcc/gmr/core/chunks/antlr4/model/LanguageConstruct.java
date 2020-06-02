package br.ufjf.dcc.gmr.core.chunks.antlr4.model;

public class LanguageConstruct {

    private int lineBegin;
    private int lineEnd;
    private int columnBegin;
    private int columnEnd;
    private String text;
    private String type;

    public LanguageConstruct(int lineBegin, int lineEnd, int columnBegin, int columnEnd, String text, String type) {
        this.lineBegin = lineBegin;
        this.lineEnd = lineEnd;
        this.columnBegin = columnBegin;
        this.columnEnd = columnEnd;
        this.text = text;
        this.type = type;
    }

    
    
    /**
     * @return the lineBegin
     */
    public int getLineBegin() {
        return lineBegin;
    }

    /**
     * @param lineBegin the lineBegin to set
     */
    public void setLineBegin(int lineBegin) {
        this.lineBegin = lineBegin;
    }

    /**
     * @return the lineEnd
     */
    public int getLineEnd() {
        return lineEnd;
    }

    /**
     * @param lineEnd the lineEnd to set
     */
    public void setLineEnd(int lineEnd) {
        this.lineEnd = lineEnd;
    }

    /**
     * @return the columnBegin
     */
    public int getColumnBegin() {
        return columnBegin;
    }

    /**
     * @param columnBegin the columnBegin to set
     */
    public void setColumnBegin(int columnBegin) {
        this.columnBegin = columnBegin;
    }

    /**
     * @return the columnEnd
     */
    public int getColumnEnd() {
        return columnEnd;
    }

    /**
     * @param columnEnd the columnEnd to set
     */
    public void setColumnEnd(int columnEnd) {
        this.columnEnd = columnEnd;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
}
