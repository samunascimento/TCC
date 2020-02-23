package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.util.List;

public class ConflictRegion {

    private final List<String> beforeContext;
    private final List<String> afterContext;
    private final List<String> v1;
    private final List<String> v2;
    private final int beginLine;
    private final int separatorLine;
    private final int endLine;
    
    public ConflictRegion(List<String> beforeContext, List<String> afterContext, List<String> v1, List<String> v2, int beginLine, int separatorLine, int endLine) {
        this.beforeContext = beforeContext;
        this.afterContext = afterContext;
        this.v1 = v1;
        this.v2 = v2;
        this.beginLine = beginLine;
        this.separatorLine = separatorLine;
        this.endLine = endLine;
    }

    public List<String> getAfterContext() {
        return afterContext;
    }

    public List<String> getBeforeContext() {
        return beforeContext;
    }

    public List<String> getV1() {
        return v1;
    }

    public List<String> getV2() {
        return v2;
    }

    public int getBeginLine() {
        return beginLine;
    }

    public int getSeparatorLine() {
        return separatorLine;
    }

    public int getEndLine() {
        return endLine;
    }

}
