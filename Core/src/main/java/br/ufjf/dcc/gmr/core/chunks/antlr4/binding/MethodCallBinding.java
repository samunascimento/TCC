package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;

public class MethodCallBinding {

    private String name;
    private List<TypeBinding> parameters;
    private PackageBinding packageBinding;
    private TypeBinding typeBinding;
    private VariableBinding variableOrigin;
    private JavaParser.MethodCallContext ctx;

    public MethodCallBinding() {
        this.name = "";
        this.parameters = new ArrayList<>();
        this.packageBinding = new PackageBinding();
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
        for (TypeBinding parameter : this.parameters) {
            output = output.concat(parameter.getIdentifier() + ",");
        }
        output = output.concat(")");

        output = output.concat("[").concat(ctx.getStart().getLine() + "").concat(",").
                concat(ctx.getStop().getLine() + "").concat("]");

        if (variableOrigin != null && variableOrigin.getType() != null) {
            output = output.concat(" IDENTIFIER:" + variableOrigin.getType().getIdentifier());
        } else {
            output = output.concat(" IDENTIFIER: ERROR");
        }

        return output;
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the parameters
     */
    public List<TypeBinding> getParameters() {
        return parameters;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param parameters the parameters to set
     */
    public void setParameters(List<TypeBinding> parameters) {
        this.parameters = parameters;
    }

    /**
     * @return the packageBinding
     */
    public PackageBinding getPackageBinding() {
        return packageBinding;
    }

    /**
     * @return the typeBinding
     */
    public TypeBinding getTypeBinding() {
        return typeBinding;
    }

    /**
     * @param packageBinding the packageBinding to set
     */
    public void setPackageBinding(PackageBinding packageBinding) {
        this.packageBinding = packageBinding;
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
