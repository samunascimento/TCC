package br.ufjf.dcc.gmr.core.conflictanalysis.models;

import java.util.ArrayList;
import java.util.List;

public class ConflictRegion {

    private List<String> afterContext;
    private List<String> beforeContext;
    private List<String> v1;
    private List<String> v2;
    private String file;
    private int beginLine;
    private int separatorLine;
    private int endLine;

    protected ConflictRegion() {
        this.afterContext = new ArrayList<>();
        this.beforeContext = new ArrayList<>();
        this.v1 = new ArrayList<>();
        this.v2 = new ArrayList<>();
    }

    public List<String> getV1() {
        return v1;
    }

    protected void setV1(List<String> v1) {
        this.v1 = v1;
    }

    public List<String> getV2() {
        return v2;
    }

    protected void setV2(List<String> v2) {
        this.v2 = v2;
    }

    public String getFile() {
        return file;
    }

    protected void setFile(String file) {
        this.file = file;
    }

    public int getBeginLine() {
        return beginLine;
    }

    protected void setBeginLine(int beginLine) {
        this.beginLine = beginLine;
    }

    public int getSeparatorLine() {
        return separatorLine;
    }

    protected void setSeparatorLine(int separatorLine) {
        this.separatorLine = separatorLine;
    }

    public int getEndLine() {
        return endLine;
    }

    protected void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    public List<String> getAfterContext() {
        return afterContext;
    }

    protected void setAfterContext(List<String> afterContext) {
        this.afterContext = afterContext;
    }

    public List<String> getBeforeContext() {
        return beforeContext;
    }

    protected void setBeforeContext(List<String> beforeContext) {
        this.beforeContext = beforeContext;
    }

}
