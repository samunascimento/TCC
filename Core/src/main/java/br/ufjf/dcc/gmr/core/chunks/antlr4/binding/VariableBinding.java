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
public class VariableBinding extends BaseBinding {

    /**
     * used to store de modifier
     */
    private String modifier;
    private TypeBinding type;
    
            
    public VariableBinding(String Modifier, TypeBinding type, String name) {
        super(name);
        this.modifier = Modifier;
        this.type = type;
       
    }

    public VariableBinding() {
        super("");
    }

    @Override
    public String toString() {
        String output = null;
        output = "MODIFIER:" + modifier + " TYPE:" + type.getName() + " NAME:" + super.getName();
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
}
