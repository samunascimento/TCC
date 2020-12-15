package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;

public class MethodCallBinding extends BaseBinding {


    private List<TypeBinding> parameters;
    private TypeBinding typeBinding;
    private JavaParser.MethodCallContext ctx;

    public MethodCallBinding() {

        super();
        this.parameters = new ArrayList<>();
        this.typeBinding = new TypeBinding();
        this.ctx = null;

    }

    public boolean equalsTo(MethodDeclarationBinding mdb, TypeBinding mdbType) {
        return mdb.equalsTo(this);
    }

    @Override
    public String toString() {

        String output = "";

        output = output.concat(this.getName()).concat("(");

        /**
         * TODO: parameter.getName() is null for System.out.println
         */
        for (int i = 0; i < parameters.size(); i++) {
            if (parameters.get(i).getName() != null) {
                if (i < parameters.size() - 1) {
                    output = output.concat(parameters.get(i).getName() + ",");
                } else {
                    output = output.concat(parameters.get(i).getName());
                }
            }else{
                System.out.println("");
            }
        }
        output = output.concat(")");

        output = output.concat("[").concat(getCtx().getStart().getLine() + "").concat(",").
                concat(getCtx().getStop().getLine() + "").concat("]");

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
     * @return the ctx
     */
    public JavaParser.MethodCallContext getCtx() {
        return ctx;
    }
}
