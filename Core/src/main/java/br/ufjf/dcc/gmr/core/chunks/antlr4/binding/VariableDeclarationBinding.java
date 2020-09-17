package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

public class VariableDeclarationBinding extends BaseBinding{
    
    private TypeBinding typeBinding;
    
    public VariableDeclarationBinding(String name, TypeBinding typeBinding) {
        super(name);
        this.typeBinding = typeBinding;
    }

    public VariableDeclarationBinding() {
    }    

    public TypeBinding getTypeBinding() {
        return typeBinding;
    }

    public void setTypeBinding(TypeBinding typeBinding) {
        this.typeBinding = typeBinding;
    }
}
