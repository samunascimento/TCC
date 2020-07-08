package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;

public class MethodCallBinding extends BaseBinding{

    private List<TypeBinding> parameters;
    private TypeBinding typeBinding;
    private VariableBinding variableOrigin;//remove
    private JavaParser.MethodCallContext ctx;

    public MethodCallBinding() {
        
        super();
        this.parameters = new ArrayList<>();
        this.typeBinding = new TypeBinding();
        this.ctx = null;
        this.variableOrigin = new VariableBinding();
        
    }

    public boolean equalsTo(MethodDeclarationBinding mdb) {
        return this.getName().equals(mdb.getName());
    }

    @Override
    public String toString() {

        String output = "";

        output = output.concat(this.getName()).concat("(");
        
        for (int i = 0; i < parameters.size(); i++) {
            if(i < parameters.size()-1){
                output = output.concat(parameters.get(i).getName() + ",");
            }else{
                output = output.concat(parameters.get(i).getName());
            }
        }
        output = output.concat(")");

        output = output.concat("[").concat(ctx.getStart().getLine() + "").concat(",").
                concat(ctx.getStop().getLine() + "").concat("]");

        if (variableOrigin != null && variableOrigin.getType() != null) {
            output = output.concat(" IDENTIFIER:" + variableOrigin.getType().getName());
        } else {
            output = output.concat(" IDENTIFIER: ERROR");
        }

        return output;
    }
    
    /**
     * @param ctx the ctx to set
     */
    public void setCtx(JavaParser.MethodCallContext ctx) {
        this.ctx = ctx;
    }

    /**
     * @return the parameters
     */
    public List<TypeBinding> getParameters() {
        return parameters;
    }

    /**
     * @param parameters the parameters to set
     */
    public void setParameters(List<TypeBinding> parameters) {
        this.parameters = parameters;
    }

    /**
     * @return the typeBinding
     */
    public TypeBinding getTypeBinding() {
        return typeBinding;
    }

    /**
     * @param typeBinding the typeBinding to set
     */
    public void setTypeBinding(TypeBinding typeBinding) {
        this.typeBinding = typeBinding;
    }

    /**
     * @return the variableOrigin
     */
    public VariableBinding getVariableOrigin() {
        return variableOrigin;
    }

    /**
     * @param variableOrigin the variableOrigin to set
     */
    public void setVariableOrigin(VariableBinding variableOrigin) {
        this.variableOrigin = variableOrigin;
    }
}
