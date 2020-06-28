/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

/**
 *
 * @author felip
 */
public class VariableBinding {

    /**
     * used to store de modifier
     */
    private String modifier;
    private TypeBinding type;
    private String name;
    
    public VariableBinding(String Modifier, TypeBinding type, String name) {
        this.modifier = Modifier;
        this.type = type;
        this.name = name;
    }

    public VariableBinding() {
      
    }

    @Override
    public String toString() {
        String output = null;
        output = "MODIFIER:" + modifier + " TYPE:" + type.getName() + " NAME:" + name;
        return output;
    }

    
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String Modifier) {
        this.modifier = Modifier;
    }

    public TypeBinding getType() {
        return type;
    }

    public void setType(TypeBinding type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
