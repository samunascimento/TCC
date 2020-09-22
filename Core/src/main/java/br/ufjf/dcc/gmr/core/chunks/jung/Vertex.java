/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.jung;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.TypeBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.model.ConflictChunk;

public class Vertex {
    
    private String id;
    private TypeBinding typeBinding;
    private ConflictChunk conflictChunk;

    public Vertex(String id, TypeBinding typeBinding, ConflictChunk conflictChunk) {
        this.id = id;
        this.typeBinding = typeBinding;
        this.conflictChunk = conflictChunk;
    }
    
    public Vertex() {
        this.typeBinding = new TypeBinding();
        this.conflictChunk = new ConflictChunk();
    }
    
    @Override
    public String toString(){
        String txt = "Arquivo: "+typeBinding.getName()+" || Intervalo de Linhas : ";
        txt+= conflictChunk.getLanguageConstructLiteral().getLineBegin()+" até "+conflictChunk.getLanguageConstructLiteral().getLineEnd();
        
        return txt;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TypeBinding getTypeBinding() {
        return typeBinding;
    }

    public void setTypeBinding(TypeBinding typeBinding) {
        this.typeBinding = typeBinding;
    }

    public ConflictChunk getConflictChunk() {
        return conflictChunk;
    }

    public void setConflictChunk(ConflictChunk conflictChunk) {
        this.conflictChunk = conflictChunk;
    }
}
