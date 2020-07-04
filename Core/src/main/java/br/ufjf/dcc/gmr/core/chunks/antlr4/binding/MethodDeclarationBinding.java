package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;

public class MethodDeclarationBinding extends BaseBinding {

    private String modifier;
    private List<TypeBinding> parameters;
    private PackageBinding packageBinding;
    private TypeBinding typeBinding;
    private JavaParser.MethodDeclarationContext ctx;

    public MethodDeclarationBinding() {
        super();
        this.modifier = null;
        this.parameters = new ArrayList<>();
        this.packageBinding = new PackageBinding();
        this.typeBinding = new TypeBinding();
    }

    public boolean equalsTo(MethodCallBinding mcb) {
        if (!this.getName().equals(mcb.getName())) {
            return false;
        } else if (this.getParameters() != null && mcb.getParameters() != null) {
            if (!mcb.getVariableOrigin().getName().equals("Not Declared")) {
                if (!this.typeBinding.getName().equals(mcb.getVariableOrigin().getType().getName())) {
                    return false;
                }
            }else{
                return false;
            }              

            if (this.getParameters().size() != mcb.getParameters().size()) {
                return false;
            } else {
                for (int i = 0; i < this.parameters.size(); i++) {
                    if (!this.parameters.get(i).getName().equals(mcb.getParameters().get(i).getName())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {

        String output = "";

        output = output.concat(this.getName()).concat("(");
        for (TypeBinding parameter : this.parameters) {
            output = output.concat(parameter.getName() + ",");
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
     * @return the modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier the modifier to set
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}
