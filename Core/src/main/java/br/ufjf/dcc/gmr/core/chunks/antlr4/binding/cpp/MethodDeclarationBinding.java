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
public class MethodDeclarationBinding extends BaseBinding {

    private String modifier;
    private TypeBinding type;
    private List<VariableDeclarationBinding> parameters;
    private TypeBinding returnBinding;
    private CPP14Parser.DeclaratorContext ctx;
   

    public MethodDeclarationBinding(String name,String modifier, TypeBinding type, List<VariableDeclarationBinding> parameters, TypeBinding returnBinding, CPP14Parser.DeclaratorContext ctx) {
        super(name);
        this.modifier = modifier;
        this.type = type;
        this.parameters = parameters;
        this.returnBinding = returnBinding;
        this.ctx = ctx;
        
    }

    public MethodDeclarationBinding() {
        super();
        this.modifier = "";
        this.type = null;
        this.parameters = new ArrayList<>();
        this.returnBinding = null;
        this.ctx = null;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public TypeBinding getType() {
        return type;
    }

    public void setType(TypeBinding type) {
        this.type = type;
    }

    public List<VariableDeclarationBinding> getParametersBindings() {
        return parameters;
    }

    public void setParametersBindings(List<VariableDeclarationBinding> parametersBindings) {
        this.parameters = parametersBindings;
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

   @Override
    public String toString(){
        return "metodo: " + this.modifier + " " + this.type.getName() + " " + super.getName() + " " 
                +"\n\tparametros: " + this.parameters.toString();
    }
}
