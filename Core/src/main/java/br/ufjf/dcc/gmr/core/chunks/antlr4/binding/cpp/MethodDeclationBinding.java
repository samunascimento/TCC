/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketleen
 */
public class MethodDeclationBinding extends BaseBinding{
    
    private List<String> modifier;
    private TypeBinding type;
    private List<AttributeDeclarationBinding> parametersBindings;
    private TypeBinding returnBinding;
    private CPP14Parser.DeclaratorContext ctx;

    public MethodDeclationBinding() {
        super();
        this.modifier = new ArrayList<>();
        this.type = null;
        this.parametersBindings = new ArrayList<>();
        this.returnBinding = null;
        this.ctx = null;
    }

    

    public List<String> getModifier() {
        return modifier;
    }

    public void setModifier(List<String> modifier) {
        this.modifier = modifier;
    }

    public TypeBinding getType() {
        return type;
    }

    public void setType(TypeBinding type) {
        this.type = type;
    }

    public List<AttributeDeclarationBinding> getParametersBindings() {
        return parametersBindings;
    }

    public void setParametersBindings(List<AttributeDeclarationBinding> parametersBindings) {
        this.parametersBindings = parametersBindings;
    }

    public TypeBinding getReturnBinding() {
        return returnBinding;
    }

    public void setReturnBinding(TypeBinding returnBinding) {
        this.returnBinding = returnBinding;
    }

    public CPP14Parser.DeclaratorContext getCtx() {
        return ctx;
    }

    public void setCtx(CPP14Parser.DeclaratorContext ctx) {
        this.ctx = ctx;
    }
    
    
}
