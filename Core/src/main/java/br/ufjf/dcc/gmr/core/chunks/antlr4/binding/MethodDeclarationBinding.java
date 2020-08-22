package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;

public class MethodDeclarationBinding extends BaseBinding {

    private List<Modifier> modifier;
    private List<VariableBinding> parametersBindings;
    private TypeBinding returnBinding;
    private JavaParser.MethodDeclarationContext ctx;
    private EnviromentBinding methodEnviromentBinding;

    public MethodDeclarationBinding() {
        super();
        this.modifier = new ArrayList<>();
        this.parametersBindings = new ArrayList<>();
        this.returnBinding = new TypeBinding();
        this.methodEnviromentBinding = new EnviromentBinding();
    }

    public boolean equalsTo(MethodCallBinding mcb) {
        
        if (!this.returnBinding.getName().equals(mcb.getTypeBinding().getName())) {
            if (mcb.getTypeBinding().getExtendClass() == null || (mcb.getTypeBinding().getExtendClass() != null && !this.returnBinding.getName().equals(mcb.getTypeBinding().getExtendClass().getName()))) {
                return false;
            }
        }

        if (!this.getName().equals(mcb.getName())) {
            return false;
        }

        if (this.getParameters() == null && mcb.getParameters() == null) {
            return false;
        }

        if (this.getParameters().size() != mcb.getParameters().size()) {
            return false;
        }

        for (int i = 0; i < this.getParameters().size(); i++) {
            if (!PrimitiveTypes.isCompatibleType(mcb.getParameters().get(i).getName(), this.getParameters().get(i).getName())) {
                return false;
            }
        }

        return true;
    }
    
    @Override
    public String toString() {

        String output = "";

        output = output.concat(this.getName()).concat("(");

        for (int i = 0; i < parametersBindings.size(); i++) {
            if (i < parametersBindings.size() - 1) {
                output = output.concat(parametersBindings.get(i).getName() + ",");
            } else {
                output = output.concat(parametersBindings.get(i).getName());
            }
        }

        output = output.concat(")");

        output = output.concat("[").concat(ctx.getStart().getLine() + "").concat(",").
                concat(ctx.getStop().getLine() + "").concat("]");
        
        for (Modifier modifiers : modifier) {
            output = output.concat("| Modifier = "+modifiers+" | ");
        }
        

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
     * @return the typeBinding
     */
    public TypeBinding getReturnBinding() {
        return returnBinding;
    }

    /**
     * @param returnBinding the typeBinding to set
     */
    public void setReturnBinding(TypeBinding returnBinding) {
        this.returnBinding = returnBinding;
    }

    /**
     * @return the parameters
     */
    public List<VariableBinding> getParameters() {
        return parametersBindings;
    }

    /**
     * @param parameters the parameters to set
     */
    public void setParameters(List<VariableBinding> parameters) {
        this.parametersBindings = parameters;
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

    /**
     * @return the enviromentBinding
     */
    public EnviromentBinding getMethodEnviromentBinding() {
        return methodEnviromentBinding;
    }

    /**
     * @param methodEnviromentBinding the enviromentBinding to set
     */
    public void setEnviromentBinding(EnviromentBinding methodEnviromentBinding) {
        this.methodEnviromentBinding = methodEnviromentBinding;
    }
}
