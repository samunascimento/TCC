package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;

public class LocalVariableUsageBinding extends VariableDeclarationBinding{

    private LocalVariableDeclarationBinding localVariableDeclarationBinding;
    private JavaParser.MethodCallContext ctx;
    private String usageString;
    
    public LocalVariableUsageBinding() {

    }

    public LocalVariableUsageBinding(LocalVariableDeclarationBinding localVariableDeclarationBinding, JavaParser.MethodCallContext ctx, TypeBinding typeBinding) {
        super(localVariableDeclarationBinding.getName(), typeBinding);
        this.usageString = "";
        this.localVariableDeclarationBinding = localVariableDeclarationBinding;
        this.ctx = ctx;
    }
    
  
    
    public LocalVariableDeclarationBinding getLocalVariableDeclarationBinding() {
        return localVariableDeclarationBinding;
    }

    public void setLocalVariableDeclarationBinding(LocalVariableDeclarationBinding localVariableDeclarationBinding) {
        this.localVariableDeclarationBinding = localVariableDeclarationBinding;
    }


    public String getUsageString() {
        return usageString;
    }
    
    public void setUsageString(String usageString) {
        this.usageString = usageString;
    }

    /**
     * @return the ctx
     */
    public JavaParser.MethodCallContext getCtx() {
        return ctx;
    }

    /**
     * @param ctx the ctx to set
     */
    public void setCtx(JavaParser.MethodCallContext ctx) {
        this.ctx = ctx;
    }
    
    
    
}
