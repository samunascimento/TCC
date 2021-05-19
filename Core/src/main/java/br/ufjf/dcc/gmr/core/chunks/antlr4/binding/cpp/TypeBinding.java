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

public class TypeBinding extends BaseBinding{
    
    private TypeBinding extendClassBinding;
    private List<ImportBinding> imports;
    private List<MethodDeclarationBinding> MethodsBinding;
    private List<AttributeDeclarationBinding> attributesBinding;

    public TypeBinding() {
        
        super();
        this.extendClassBinding = null;
        this.imports = new ArrayList<>();
        this.MethodsBinding = new ArrayList<>();
        this.attributesBinding = new ArrayList<>();
    }

    public TypeBinding getExtendClassBinding() {
        return extendClassBinding;
    }

    public void setExtendClassBinding(TypeBinding extendClassBinding) {
        this.extendClassBinding = extendClassBinding;
    }

    public List<ImportBinding> getImports() {
        return imports;
    }

    public void setImports(List<ImportBinding> imports) {
        this.imports = imports;
    }

    public List<MethodDeclarationBinding> getMethodsBinding() {
        return MethodsBinding;
    }

    public void setMethodsBinding(List<MethodDeclarationBinding> MethodsBinding) {
        this.MethodsBinding = MethodsBinding;
    }

    public List<AttributeDeclarationBinding> getAttributesBinding() {
        return attributesBinding;
    }

    public void setAttributesBinding(List<AttributeDeclarationBinding> attributesBinding) {
        this.attributesBinding = attributesBinding;
    }
    
    public TypeBinding(String name) {
        super(name);
    }
    
    public String toString() {
        return getName();
    }
}
