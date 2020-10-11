package br.ufjf.dcc.gmr.core.vcs.types;

import br.ufjf.dcc.gmr.core.chunks.antlr4.model.Chunk;
import java.util.ArrayList;
import java.util.List;

public class ConflictChunk {

    private Line begin;
    private Line separator;
    private Line end;
    private String path;
    private List<String> errorContent;


    private Chunk beforeContext;
    private Chunk chunkVersion1;
    private Chunk chunkVersion2;
    private Chunk afterContext;
    private String label;

    public ConflictChunk(Line begin, Line separator, Line end, String path,List<String> errorContent, Chunk beforeContext, Chunk chunkVersion1, Chunk chunkVersion2, Chunk afterContext, String label) {
        this.begin = begin;
        this.separator = separator;
        this.end = end;
        this.path = path;
        this.beforeContext = beforeContext;
        this.chunkVersion1 = chunkVersion1;
        this.chunkVersion2 = chunkVersion2;
        this.afterContext = afterContext;
        this.label = label;
        this.errorContent = errorContent;
    }

    public ConflictChunk() {
        this.errorContent = new ArrayList<>();
        this.begin = new Line();
        this.separator = new Line();
        this.end = new Line();
        this.path = "";
        this.beforeContext = new Chunk();
        this.chunkVersion1 = new Chunk();
        this.chunkVersion2 = new Chunk();
        this.afterContext = new Chunk();
        this.label = "";
    }

    /*
        tirar content 
        migrar as informações do conflictChunk 
        apagar a classe conflictChunk
        renomear essa classe para conflictChunk
        remover booleano conflict
        mover path do outro chunk para este chunk
     */
    
        public List<String> getErrorContent() {
        return errorContent;
    }

    public void setErrorContent(List<String> errorContent) {
        this.errorContent = errorContent;
    }
    public Line getBegin() {
        return begin;
    }

    public void setBegin(Line begin) {
        this.begin = begin;
    }

    public Line getSeparator() {
        return separator;
    }

    public void setSeparator(Line separator) {
        this.separator = separator;
    }

    public Line getEnd() {
        return end;
    }

    public void setEnd(Line end) {
        this.end = end;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Chunk getBeforeContext() {
        return beforeContext;
    }

    public void setBeforeContext(Chunk beforeContext) {
        this.beforeContext = beforeContext;
    }

    public Chunk getChunkVersion1() {
        return chunkVersion1;
    }

    public void setChunkVersion1(Chunk chunkVersion1) {
        this.chunkVersion1 = chunkVersion1;
    }

    public Chunk getChunkVersion2() {
        return chunkVersion2;
    }

    public void setChunkVersion2(Chunk chunkVersion2) {
        this.chunkVersion2 = chunkVersion2;
    }

    public Chunk getAfterContext() {
        return afterContext;
    }

    public void setAfterContext(Chunk afterContext) {
        this.afterContext = afterContext;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }

}
