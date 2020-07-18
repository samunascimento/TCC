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
    public boolean findMethodDeclaration(MethodDeclarationBinding methodDeclaration, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMdbList()) {
            if (methodDeclarationBinding.equals(methodDeclaration)) {
                return true;
            }
        }

        return false;
    }

    public boolean findMethodCall(MethodCallBinding methodCall, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMdbList()) {
            return methodDeclarationBinding.getEnviromentBinding().findMethodCall(methodCall);
        }
        return false;

    }

    public boolean findAttribute(VariableBinding attribute, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (VariableBinding attribute1 : typeBinding.getAttributes()) {
            if (attribute.equals(attribute1)) {
                return true;
            }
        }
        return false;
    }


    public boolean findVariable(VariableBinding variable, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMdbList()) {
            return methodDeclarationBinding.getEnviromentBinding().findVariable(variable);
        }
        return false;

    }
}