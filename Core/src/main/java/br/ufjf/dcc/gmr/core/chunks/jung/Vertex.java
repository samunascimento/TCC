/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.jung;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.TypeBinding;

public class Vertex {
    
    private String id;
    private TypeBinding typeBinding;

    public Vertex(String id, TypeBinding typeBinding) {
        this.id = id;
        this.typeBinding = typeBinding;
    }
    
    public Vertex() {
        this.typeBinding = new TypeBinding();
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
}
