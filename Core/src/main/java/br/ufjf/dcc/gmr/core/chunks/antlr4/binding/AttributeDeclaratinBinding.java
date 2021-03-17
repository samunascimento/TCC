package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;

public class AttributeDeclaratinBinding extends VariableDeclarationBinding {

    private List<Modifier> modifier;
    private JavaParser.FieldDeclarationContext ctx;

    public AttributeDeclaratinBinding(List<Modifier> modifier, TypeBinding type, String name, JavaParser.FieldDeclarationContext ctx) {
        super(name, type);
        this.modifier = modifier;
        this.ctx = ctx;
    }

    public AttributeDeclaratinBinding() {
        this.modifier = new ArrayList<>();
    }

    @Override
    public String toString() {
        String output = null;
        output = "MODIFIER:" + getModifier() + " TYPE:" + super.getTypeBinding().getName() + " NAME:" + super.getName();
        return output;
    }

    public JavaParser.FieldDeclarationContext getCtx() {
        return ctx;
    }

    public void setCtx(JavaParser.FieldDeclarationContext ctx) {
        this.ctx = ctx;
    }

    /**
     * @return the modifier
     */
    public List<Modifier> getModifier() {
        return modifier;
    }

    /**
     * @param modifier the modifier to set
     */
    public void setModifier(List<Modifier> modifier) {
        this.modifier = modifier;
    }

    public void addModifier(Modifier modifier) {
        this.modifier.add(modifier);
    }

}
