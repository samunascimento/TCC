package br.ufjf.dcc.gmr.core.vcs.types;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author icout
 */
public class Line {
    
    private List<String> content;    
    private int lineNumber;

    public Line() {
        content = new ArrayList<>();
        lineNumber = 0;
    }

    public Line(List<String> content, int lineNumber) {
        this.content = content;
        this.lineNumber = lineNumber;
    }

    /**
     * @return the content
     */
    public List<String> getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(List<String> content) {
        this.content = content;
    }

    /**
     * @return the lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * @param lineNumber the lineNumber to set
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    
}
