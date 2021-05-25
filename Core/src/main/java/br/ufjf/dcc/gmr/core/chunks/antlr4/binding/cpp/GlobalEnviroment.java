/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

import java.util.*;

/**
 *
 * @author ketleen
 */
public class GlobalEnviroment {
    
    private Map<String, TypeBinding> enviroment;
    
    
      //Chamada de metodo, declaração de metodo, atributos e variaveis
    public MethodDeclarationBinding findMethodDeclaration(MethodDeclarationBinding methodDeclaration, String key) {

        TypeBinding typeBinding = enviroment.get(key);
        Boolean verify = true;
        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMethodsBinding()) {
            verify = true;
            if (methodDeclarationBinding.getName().equals(methodDeclaration.getName())) {
                if (methodDeclarationBinding.getReturnBinding().getName().equals(methodDeclaration.getReturnBinding().getName())) {
                    if (methodDeclarationBinding.getParametersBindings().size() == methodDeclaration.getParametersBindings().size()) {
                        for (int i = 0; i < methodDeclarationBinding.getParametersBindings().size(); i++) {
                            if (!methodDeclarationBinding.getParametersBindings().get(i).getTypeBinding().getName().equals(methodDeclaration.getParametersBindings().get(i).getTypeBinding().getName())) {
                                verify = false;
                            }
                        }
                        if (verify) {
                            return methodDeclarationBinding;
                        }
                    }
                }
            }
        }
        return null;
    }
    
   public AttributeDeclarationBinding findAttribute(AttributeDeclarationBinding attribute, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (AttributeDeclarationBinding attribute1 : typeBinding.getAttributesBinding()) {
            if (attribute.equals(attribute1)) {
                return attribute;
            }
        }
        return null;
    }
   
        
    public GlobalEnviroment() {
        this.enviroment = new HashMap<>();
    }
    public Map<String, TypeBinding> getEnviroment() {
        return enviroment;
    }
    public void setEnviroment(Map<String, TypeBinding> enviroment) {
        this.enviroment = enviroment;
    }
}
