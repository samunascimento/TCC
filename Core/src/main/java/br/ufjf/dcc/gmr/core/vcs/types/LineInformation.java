package br.ufjf.dcc.gmr.core.vcs.types;

/**
 * Type used in diff to control the lines
 *
 * @author gleiph
 */
public class LineInformation {

    private String content;
    private LineType type;
    private int lineNumber;

    public LineInformation(String content, LineType type, int LineNumber) {
        this.content = content;
        this.type = type;
        this.lineNumber=LineNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LineType getType() {
        return type;
    }

    public void setType(LineType type) {
        this.type = type;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int LineNumber) {
        this.lineNumber = LineNumber;
    }
    

    @Override
    public String toString() {
        if (type == LineType.ADDED) {
            return "+".concat(this.content).concat(" ").concat(this.getLineNumber()+"");
        } else {
            return "-".concat(this.content).concat(" ").concat(this.getLineNumber()+"");
        } 
    }

}
