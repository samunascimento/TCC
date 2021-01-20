/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.jung;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.TypeBinding;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;

public class Vertex {
    
    private ConflictChunk conflictChunk;

    public Vertex(ConflictChunk conflictChunk) {
        this.conflictChunk = conflictChunk;
    }
    
    public Vertex() {
      
        this.conflictChunk = new ConflictChunk();
    }
    
    @Override
    public String toString(){
        String txt = "Arquivo: "+conflictChunk.getPath()+" || Intervalo de Linhas : ";
        txt+= conflictChunk.getBegin().getLineNumber() +" até "+conflictChunk.getEnd().getLineNumber();
        
        return txt;
    }
    
    public ConflictChunk getConflictChunk() {
        return conflictChunk;
    }

    public void setConflictChunk(ConflictChunk conflictChunk) {
        this.conflictChunk = conflictChunk;
    }
}
