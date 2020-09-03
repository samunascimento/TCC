/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;


/**
 *
 * @author gleiph
 */
public class LocalVariableUsageBinding extends BaseBinding {

    private LocalVariableDeclarationBinding localVariableDeclarationBinding;
    //TODO: Add context
    
    
    public LocalVariableDeclarationBinding getLocalVariableDeclarationBinding() {
        return localVariableDeclarationBinding;
    }

    public void setLocalVariableDeclarationBinding(LocalVariableDeclarationBinding localVariableDeclarationBinding) {
        this.localVariableDeclarationBinding = localVariableDeclarationBinding;
    }
    
    
    
}
