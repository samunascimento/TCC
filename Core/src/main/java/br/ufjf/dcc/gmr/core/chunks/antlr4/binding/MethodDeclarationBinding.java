package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;

public class MethodDeclarationBinding extends BaseBinding {

    private List<Modifiers> modifier;
    private List<TypeBinding> parameters;
    private TypeBinding typeBinding;
    private JavaParser.MethodDeclarationContext ctx;
    private EnviromentBinding enviromentBinding;

    public MethodDeclarationBinding() {
        super();
        this.modifier = new ArrayList<>();
        this.parameters = new ArrayList<>();
        this.typeBinding = new TypeBinding();
        this.enviromentBinding = new EnviromentBinding();
    }

    public boolean equalsTo(MethodCallBinding mcb) {
        if (!this.typeBinding.getName().equals(mcb.getTypeBinding().getName())) {
            if (mcb.getTypeBinding().getExtendClass() == null || (mcb.getTypeBinding().getExtendClass() != null && !this.typeBinding.getName().equals(mcb.getTypeBinding().getExtendClass().getName()))) {
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

        //problema para funcionar pois ao passar um numero para uma função ele pode ser lido como int apesar 
        //de o parâmetro da função ser um float
        //exemplo Main linha 43 employeeExtends.increaseSalary(50);
        for (int i = 0; i < this.getParameters().size(); i++) {
            if (!this.getParameters().get(i).getName().equals(mcb.getParameters().get(i).getName())) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {

        String output = "";

        output = output.concat(this.getName()).concat("(");

        for (int i = 0; i < parameters.size(); i++) {
            if (i < parameters.size() - 1) {
                output = output.concat(parameters.get(i).getName() + ",");
            } else {
                output = output.concat(parameters.get(i).getName());
            }
        }

        output = output.concat(")");

        output = output.concat("[").concat(ctx.getStart().getLine() + "").concat(",").
                concat(ctx.getStop().getLine() + "").concat("]");
        
        for (Modifiers modifiers : modifier) {
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
    public List<Modifiers> getModifier() {
        return modifier;
    }

    /**
     * @param modifier the modifier to set
     */
    public void setModifier(List<Modifiers> modifier) {
        this.modifier = modifier;
    }

    /**
     * @return the enviromentBinding
     */
    public EnviromentBinding getEnviromentBinding() {
        return enviromentBinding;
    }

    /**
     * @param enviromentBinding the enviromentBinding to set
     */
    public void setEnviromentBinding(EnviromentBinding enviromentBinding) {
        this.enviromentBinding = enviromentBinding;
    }
}
