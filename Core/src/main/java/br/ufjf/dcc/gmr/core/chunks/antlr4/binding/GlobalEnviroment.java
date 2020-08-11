package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.HashMap;
import java.util.Map;

public class GlobalEnviroment {

    private Map<String, TypeBinding> enviroment;
    
    public GlobalEnviroment() {
        this.enviroment = new HashMap<>();
    }

    /**
     * @return the globalEnviroment
     */
    public Map<String, TypeBinding> getEnviroment() {
        return enviroment;
    }
    
    /**
     * @param enviroment the globalEnviroment to set
     */
    public void setEnviroment(Map<String, TypeBinding> enviroment) {
        this.enviroment = enviroment;
    }

    //Chamada de metodo, declaração de metodo, atributos e variaveis
    public MethodDeclarationBinding findMethodDeclaration(MethodDeclarationBinding methodDeclaration, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMdbList()) {
            if (methodDeclarationBinding.equals(methodDeclaration)) {
                return methodDeclaration;
            }
        }
        return null;
    }

    public MethodDeclarationBinding findMethodCall(MethodCallBinding methodCall, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMdbList()) {
            if((methodDeclarationBinding.getEnviromentBinding().findMethodCall(methodCall)).equals(methodCall)){
                return methodDeclarationBinding;
            }
        }
        return null;
    }

    public VariableBinding findAttribute(VariableBinding attribute, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (VariableBinding attribute1 : typeBinding.getAttributes()) {
            if (attribute.equals(attribute1)) {
                return attribute;
            }
        }
        return null;
    }


    public VariableBinding findVariable(VariableBinding variable, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMdbList()) {
            return methodDeclarationBinding.getEnviromentBinding().findVariable(variable);
        }
        return null;
    }
}