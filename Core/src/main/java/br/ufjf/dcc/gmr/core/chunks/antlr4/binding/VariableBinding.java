package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

public class VariableBinding extends BaseBinding {

    private String modifier;
    private TypeBinding type;
    //Add context
            
    public VariableBinding(String Modifier, TypeBinding type, String name) {
        super(name);
        this.modifier = Modifier;
        this.type = type;
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
}
