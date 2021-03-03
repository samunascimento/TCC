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

    private List<TypeBinding> parameters;
    private TypeBinding typeBinding;

    public MethodCallBinding(String name) {
        super();
        this.parameters = new ArrayList<>();
        this.typeBinding = new TypeBinding();

    }

    public List<TypeBinding> getParameters() {
        return parameters;
    }

    public void setParameters(List<TypeBinding> parameters) {
        this.parameters = parameters;
    }

    public TypeBinding getTypeBinding() {
        return typeBinding;
    }

    public void setTypeBinding(TypeBinding typeBinding) {
        this.typeBinding = typeBinding;
    }

}
