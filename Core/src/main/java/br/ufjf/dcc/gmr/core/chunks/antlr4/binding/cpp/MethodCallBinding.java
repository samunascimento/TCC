/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;
import java.util.*;

/**
 *
 * @author ketleen
 */
public class MethodCallBinding extends BaseBinding {

    private List<ParametersBinding> parameters;
    private TypeBinding typeBinding;
    private CPP14Parser.FunctioninvocationContext ctx;

    public MethodCallBinding(String name,CPP14Parser.FunctioninvocationContext ctx ) {
        super(name);
        this.parameters = new ArrayList<>();
        this.typeBinding = null;
        this.ctx = ctx;
    }

    public List<ParametersBinding> getParameters() {
        return parameters;
    }
    
    public int getQtParameters(){
        return parameters.size();
    }
    
    public void setParameters(List<ParametersBinding> parameters) {
        this.parameters = parameters;
    }

    public TypeBinding getTypeBinding() {
        return typeBinding;
    }

    public void setTypeBinding(TypeBinding typeBinding) {
        this.typeBinding = typeBinding;
    }
    
    @Override
    public String toString(){
        String name;
        
        if(this.typeBinding == null)
            name = "metodo: " + super.getName()  + this.parameters.toString();
        
        else
            name = "metodo: " + this.typeBinding + " " + super.getName() + this.parameters.toString();
        
        name = name.replace("[","(" );
        name =name.replace("]", ")");
        return name;
    }

    public CPP14Parser.FunctioninvocationContext getCtx() {
        return ctx;
    }

    public void setCtx(CPP14Parser.FunctioninvocationContext ctx) {
        this.ctx = ctx;
    }
}
