/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.model;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.BaseBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.TypeBinding;
import java.util.List;

/**
 *
 * @author felip
 */
public class ConflictChunk {
    
    private Chunk beforeContext;
     private Chunk chunkVersion1;
    private Chunk chunkVersion2;
    private Chunk afterContext;
    
    public ConflictChunk(Chunk beforeContext, Chunk chunkVersion1, Chunk chunkVersion2, Chunk afterContext) {
        this.beforeContext = beforeContext;
        this.chunkVersion1 = chunkVersion1;
        this.chunkVersion2 = chunkVersion2;
        this.afterContext = afterContext;
    }
   
    



    public ConflictChunk() {
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

   
    
    
    
    
    
}
