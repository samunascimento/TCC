/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaParser;

/**
 *
 * @author felip
 */
public class ImportBinding extends BaseBinding {

    private JavaParser.ImportDeclarationContext ctx;

    public ImportBinding(String name, JavaParser.ImportDeclarationContext ctx) {
        super(name);       
        this.ctx = ctx;
    }

    public ImportBinding() {
    }
    
    /**
     * @return the ctx
     */
    public JavaParser.ImportDeclarationContext getCtx() {
        return ctx;
    }

    /**
     * @param ctx the ctx to set
     */
    public void setCtx(JavaParser.ImportDeclarationContext ctx) {
        this.ctx = ctx;
    }    
    
}
