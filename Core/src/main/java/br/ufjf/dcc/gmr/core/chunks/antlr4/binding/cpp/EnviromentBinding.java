/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

import java.util.*;

/**
 *
 * @author ketle
 */
public class EnviromentBinding {

    //Variable declaration and usage, and method call
    private List<List<BaseBinding>> enviroment;

    public EnviromentBinding() {
        this.enviroment = new ArrayList<>();
    }
    
    
    public AttributeDeclarationBinding findVariable(AttributeDeclarationBinding variable){
        
        for (int i = this.enviroment.size() - 1; i >= 0 ; i--) {
            for (BaseBinding baseBinding : enviroment.get(i)) {
                if (baseBinding instanceof AttributeDeclarationBinding) {
                    AttributeDeclarationBinding variableBinding = (AttributeDeclarationBinding) baseBinding;
                    if (variableBinding.getName().equals(variable.getName())) {
                        return variableBinding;
                    }
                }
            }
        }
        
        return null;

    }
    
    public MethodCallBinding findMethodCall(MethodCallBinding find){
        
        for (List<BaseBinding> list : enviroment) {
            for (BaseBinding baseBinding : list) {
                if(baseBinding.getName().equals(find.getName())){
                    return find;
                }
            }
        }
        return null;
    }
    
    
    /**
     * @return the enviroment
     */
    public List<List<BaseBinding>> getEnviroment() {
        return enviroment;
    }

    /**
     * @param enviroment the enviroment to set
     */
    public void setEnviroment(List<List<BaseBinding>> enviroment) {
        this.enviroment = enviroment;
    }

}
