package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;

public class MethodDeclarationBinding {
 
    private String name;
    private List<TypeBinding> parameters;
    private PackageBinding packageBinding;
    private TypeBinding typeBinding;
    private JavaParser.MethodDeclarationContext ctx;

    public MethodDeclarationBinding() {
        this.name = "";
        this.parameters = new ArrayList<>();
        this.packageBinding = new PackageBinding();
        this.typeBinding = new TypeBinding();
    }

    public boolean equalsTo(MethodCallBinding mcb) {
        if (!this.getName().equals(mcb.getName())) {
            return false;
        } else if (this.getParameters() != null && mcb.getParameters() != null) {
            if (this.getParameters().size() != mcb.getParameters().size()) {
                return false;
            } else {
                for (int i = 0; i < this.parameters.size(); i++) {
                    if (!this.parameters.get(i).getIdentifier().equals(mcb.getParameters().get(i).getIdentifier())) {
                        return false;
                    }
                }
            }
        } else if ( !this.name.equals(mcb.getTypeBinding().getIdentifier())){
            return false;
        }
        return true;
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

        return output;
    }

    /**
     * @return the ctx
     */
    public JavaParser.MethodDeclarationContext getCtx() {
        return ctx;
    }

    /**
     * @param ctx the ctx to set
     */
    public void setCtx(JavaParser.MethodDeclarationContext ctx) {
        this.ctx = ctx;
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

}
