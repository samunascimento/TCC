package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;


public class LocalVariableUsageBinding extends BaseBinding{

    private LocalVariableDeclarationBinding localVariableDeclarationBinding;
    private JavaParser.MethodCallContext ctx;
    private List<String> usageStringList;
    
    public LocalVariableUsageBinding() {
        this.usageStringList = new ArrayList<>();
    }

    public LocalVariableUsageBinding(LocalVariableDeclarationBinding localVariableDeclarationBinding, JavaParser.MethodCallContext ctx) {
        super(localVariableDeclarationBinding.getName());
        this.usageStringList = new ArrayList<>();
        this.localVariableDeclarationBinding = localVariableDeclarationBinding;
        this.ctx = ctx;
    }
    
  
    
    public LocalVariableDeclarationBinding getLocalVariableDeclarationBinding() {
        return localVariableDeclarationBinding;
    }

    public void setLocalVariableDeclarationBinding(LocalVariableDeclarationBinding localVariableDeclarationBinding) {
        this.localVariableDeclarationBinding = localVariableDeclarationBinding;
    }


    public List<String> getUsageStringList() {
        return usageStringList;
    }
    
    public void setUsageStringList(List<String> usageStringList) {
        this.usageStringList = usageStringList;
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
