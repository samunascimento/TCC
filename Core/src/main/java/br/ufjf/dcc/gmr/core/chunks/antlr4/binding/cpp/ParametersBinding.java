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
public class ParametersBinding extends BaseBinding {
    private TypeBinding typeBinding;
    private boolean methodCall;
    
    
    public ParametersBinding(String name) {
        super(name);
        this.methodCall = false;
    }

    public ParametersBinding() {
    }
    
    
    public TypeBinding getTypeBinding() {
        return typeBinding;
    }

    public void setTypeBinding(TypeBinding typeBinding) {
        this.typeBinding = typeBinding;
    }
    
    
  @Override
    public String toString(){
        if(typeBinding == null)
            return super.getName();
        else 
            return this.typeBinding.getName() + " " + super.getName();
    }

    public boolean isMethodCall() {
        return methodCall;
    }

    public void setMethodCall(boolean methodCall) {
        this.methodCall = methodCall;
    }

    
}
