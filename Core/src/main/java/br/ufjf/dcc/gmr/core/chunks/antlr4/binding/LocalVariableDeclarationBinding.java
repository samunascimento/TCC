/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;

/**
 *
 * @author gleiph
 */
public class LocalVariableDeclarationBinding extends BaseBinding {

    private TypeBinding type;
    private JavaParser.LocalVariableDeclarationContext ctx;

    public LocalVariableDeclarationBinding(String name, TypeBinding type, JavaParser.LocalVariableDeclarationContext ctx) {
        super(name);
        this.type = type;
        this.ctx = ctx;
    }

    public LocalVariableDeclarationBinding() {
    }

    public TypeBinding getType() {
        return type;
    }

    public void setType(TypeBinding type) {
        this.type = type;
    }

    public JavaParser.LocalVariableDeclarationContext getCtx() {
        return ctx;
    }

    public void setCtx(JavaParser.LocalVariableDeclarationContext ctx) {
        this.ctx = ctx;
    }

}
