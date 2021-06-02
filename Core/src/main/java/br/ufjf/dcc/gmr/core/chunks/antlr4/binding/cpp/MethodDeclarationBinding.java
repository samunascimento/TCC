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
    
    private EnviromentBinding methodEnviromentBinding;
    private List<VariableDeclarationBinding> VariableDeclarationBindings;
    private List<VariableUsageBinding> VariableUsageBindings;
    private List<MethodCallBinding> methodCallBindings;
   

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
    
    public int getQtParameters(){
        return parameters.size();
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
    
        public EnviromentBinding getMethodEnviromentBinding() {
        return methodEnviromentBinding;
    }

    public void setMethodEnviromentBinding(EnviromentBinding methodEnviromentBinding) {
        this.methodEnviromentBinding = methodEnviromentBinding;
    }

    public List<VariableDeclarationBinding> getVariableDeclarationBindings() {
        return VariableDeclarationBindings;
    }

    public void setVariableDeclarationBindings(List<VariableDeclarationBinding> localVariableDeclarationBindings) {
        this.VariableDeclarationBindings = localVariableDeclarationBindings;
    }

    public List<VariableUsageBinding> getVariableUsageBindings() {
        return VariableUsageBindings;
    }

    public void setVariableUsageBindings(List<VariableUsageBinding> localVariableUsageBindings) {
        this.VariableUsageBindings = localVariableUsageBindings;
    }

    public List<MethodCallBinding> getMethodCallBindings() {
        return methodCallBindings;
    }

    public void setMethodCallBindings(List<MethodCallBinding> methodCallBindings) {
        this.methodCallBindings = methodCallBindings;
    }

   @Override
    public String toString(){
        String name;
        
        if(this.type == null)
            name = "metodo: " + this.modifier + " " + this.returnBinding.getName() + " " + super.getName() + this.parameters.toString();
        
        else 
            name = "metodo: " + this.type + "::" + this.modifier + " " + this.returnBinding.getName() + " " + super.getName() 
                 + this.parameters.toString();
        
        name = name.replace("[","(" );
        name =name.replace("]", ")");
        return name;
    }
    
    public boolean equalsTo(MethodCallBinding mcb) {
        if(this.getName() == null ? mcb.getName() != null : !this.getName().equals(mcb.getName()))
            return false;
        
        if(this.getQtParameters() != mcb.getQtParameters())
            return false;
        
        for(int i = 0; i < this.getQtParameters(); i++) {
            if(this.getParametersBindings().get(i).getTypeBinding() != null && mcb.getParameters().get(i).getTypeBinding() != null)
                if(this.getParametersBindings().get(i).getTypeBinding().getName() == null ? mcb.getParameters().get(i).getTypeBinding().getName() != null : !this.getParametersBindings().get(i).getTypeBinding().getName().equals(mcb.getParameters().get(i).getTypeBinding().getName()))
                    if(!PrimitiveTypes.isCompatibleType(mcb.getParameters().get(i).getTypeBinding().getName(), this.getParametersBindings().get(i).getTypeBinding().getName()))
                        return false;
        }
        
        return true;
    }
}
