package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;

public class LocalVariableDeclarationBinding extends VariableDeclarationBinding {
    private JavaParser.LocalVariableDeclarationContext ctx;

    public LocalVariableDeclarationBinding(String name, TypeBinding type, JavaParser.LocalVariableDeclarationContext ctx) {
        super(name, type);
        this.ctx = ctx;
    }

    public LocalVariableDeclarationBinding() {
    }

    public JavaParser.LocalVariableDeclarationContext getCtx() {
        return ctx;
    }

    public void setCtx(JavaParser.LocalVariableDeclarationContext ctx) {
        this.ctx = ctx;
    }

}
