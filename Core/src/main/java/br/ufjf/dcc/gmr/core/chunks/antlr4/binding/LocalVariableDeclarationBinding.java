package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;

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
