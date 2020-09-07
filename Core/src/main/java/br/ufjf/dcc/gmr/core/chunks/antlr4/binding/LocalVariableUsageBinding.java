package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;


public class LocalVariableUsageBinding extends BaseBinding {

    private LocalVariableDeclarationBinding localVariableDeclarationBinding;
    //TODO: Add context
    
    
    public LocalVariableDeclarationBinding getLocalVariableDeclarationBinding() {
        return localVariableDeclarationBinding;
    }

    public void setLocalVariableDeclarationBinding(LocalVariableDeclarationBinding localVariableDeclarationBinding) {
        this.localVariableDeclarationBinding = localVariableDeclarationBinding;
    }
    
    
    
}
