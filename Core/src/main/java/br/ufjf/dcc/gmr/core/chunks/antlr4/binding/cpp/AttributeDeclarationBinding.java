/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;

/**
 *
 * @author ketleen
 */
    public class AttributeDeclarationBinding extends  VariableDeclarationBinding {

    private String modifier;
    private CPP14Parser.DeclaratorContext ctx;
            
    public AttributeDeclarationBinding(String Modifier, TypeBinding type, String name) {
        super(name, type);
        this.modifier = Modifier;
    }   

    public AttributeDeclarationBinding() {
        
    }

    @Override
    public String toString() {
        String output = null;
        output = "MODIFIER:" + modifier + " TYPE:" + super.getTypeBinding().getName() + " NAME:" + super.getName();
        return output;
    }

 }