package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaParser;

public class AttributeDeclaratinBinding extends VariableDeclarationBinding {

    private String modifier;
    private JavaParser.FieldDeclarationContext ctx;
            
    public AttributeDeclaratinBinding(String Modifier, TypeBinding type, String name, JavaParser.FieldDeclarationContext ctx) {
        super(name, type);
        this.modifier = Modifier;
        this.ctx = ctx;
    }   

    public AttributeDeclaratinBinding() {
        
    }

    @Override
    public String toString() {
        String output = null;
        output = "MODIFIER:" + modifier + " TYPE:" + super.getTypeBinding().getName() + " NAME:" + super.getName();
        return output;
    }

    
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String Modifier) {
        this.modifier = Modifier;
    }

    public JavaParser.FieldDeclarationContext getCtx() {
        return ctx;
    }

    public void setCtx(JavaParser.FieldDeclarationContext ctx) {
        this.ctx = ctx;
    }
}
