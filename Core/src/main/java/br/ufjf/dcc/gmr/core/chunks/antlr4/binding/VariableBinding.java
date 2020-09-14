package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;

public class VariableBinding extends BaseBinding {

    private String modifier;
    private TypeBinding type;
    private JavaParser.FieldDeclarationContext ctx;
            
    public VariableBinding(String Modifier, TypeBinding type, String name, JavaParser.FieldDeclarationContext ctx) {
        super(name);
        this.modifier = Modifier;
        this.type = type;
        this.ctx = ctx;
    }   

    public VariableBinding() {
        
    }

    @Override
    public String toString() {
        String output = null;
        output = "MODIFIER:" + modifier + " TYPE:" + type.getName() + " NAME:" + super.getName();
        return output;
    }

    
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String Modifier) {
        this.modifier = Modifier;
    }

    public TypeBinding getType() {
        return type;
    }

    public void setType(TypeBinding type) {
        this.type = type;
    }

    public JavaParser.FieldDeclarationContext getCtx() {
        return ctx;
    }

    public void setCtx(JavaParser.FieldDeclarationContext ctx) {
        this.ctx = ctx;
    }
}
