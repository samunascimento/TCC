/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

/**
 *
 * @author ketleen
 */
public class VariableDeclarationBinding extends BaseBinding {
    private TypeBinding typeBinding;
    
    public VariableDeclarationBinding(String name, TypeBinding typeBinding) {
        super(name);
        this.typeBinding = typeBinding;
    }

    public VariableDeclarationBinding() {
    }    

    public TypeBinding getTypeBinding() {
        return typeBinding;
    }

    public void setTypeBinding(TypeBinding typeBinding) {
        this.typeBinding = typeBinding;
    }
    
    
   @Override
    public String toString(){
        return this.getTypeBinding().getName()+ " " + super.getName() ;
    }
}
