package br.ufjf.dcc.gmr.core.vcs.types;

/**
 * Type used in diff to control the lines
 *
 * @author gleiph
 */
public class LineInformation {

    private String content;
    private LineType type;

    public LineInformation(String content, LineType type) {
        this.content = content;
        this.type = type;
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

    @Override
    public String toString() {
        if (type == LineType.ADDED) {
            return "+".concat(this.content);
        } else {
            return "-".concat(this.content);
        }
    }

}
