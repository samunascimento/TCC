package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.ArrayList;
import java.util.List;

public class Chunk {

    private boolean conflict;
    private Line begin;
    private Line separator;
    private Line end;
    private List<String> content;
    /*
        tirar content 
        migrar as informações do conflictChunk 
        apagar a classe conflictChunk
        renomear essa classe para conflictChunk
        remover booleano conflict
        mover path do outro chunk para este chunk
     */
    private String label;

    public Chunk() {
        conflict = false;
        begin = new Line();
        end = new Line();
        separator = new Line();
        content = new ArrayList<>();
    }

    /**
     * @return the conflict
     */
    public boolean isConflict() {
        return conflict;
    }

    /**
     * @param conflict the conflict to set
     */
    public void setConflict(boolean conflict) {
        this.conflict = conflict;
    }

    /**
     * @return the begin
     */
    public Line getBegin() {
        return begin;
    }

    /**
     * @param begin the begin to set
     */
    public void setBegin(Line begin) {
        this.begin = begin;
    }

    /**
     * @return the end
     */
    public Line getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(Line end) {
        this.end = end;
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
     * @return the separator
     */
    public Line getSeparator() {
        return separator;
    }

    /**
     * @param separator the separator to set
     */
    public void setSeparator(Line separator) {
        this.separator = separator;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }

}
