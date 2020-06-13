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

    
    private String Modifier;
    private String type;
    private String name;
    private PackageBinding packageBinding;

    public VariableBinding(String Modifier, String type, String name) {
        this.Modifier = Modifier;
        this.type = type;
        this.name = name;
    }

    public VariableBinding() {
      
    }

    public String getModifier() {
        return Modifier;
    }

    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the packageBinding
     */
    public PackageBinding getPackageBinding() {
        return packageBinding;
    }

    /**
     * @param packageBinding the packageBinding to set
     */
    public void setPackageBinding(PackageBinding packageBinding) {
        this.packageBinding = packageBinding;
    }
    
}
