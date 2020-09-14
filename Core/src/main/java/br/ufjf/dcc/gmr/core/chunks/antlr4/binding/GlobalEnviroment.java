package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalEnviroment {

    private Map<String, TypeBinding> enviroment;

    /**
     * TODO...
     *
     * @param type
     * @param begin
     * @param end
     * @return
     */
    public List<BaseBinding> findLanguageConstructs(String type, int begin, int end) {

        List<BaseBinding> result = new ArrayList<>();

        TypeBinding typeBinding = enviroment.get(type);

        typeBinding.getAttributes();
        typeBinding.getImports();
        typeBinding.getMethodsBinding();

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMethodsBinding()) {
            if (methodDeclarationBinding.getCtx().getStart().getLine() >= begin
                    && methodDeclarationBinding.getCtx().getStop().getLine() <= end) {
                {
                    result.add(methodDeclarationBinding);
                }
            }
        }
        
        for (VariableBinding variableBinding : typeBinding.getAttributes()) {
            if (variableBinding.getCtx().getStart().getLine() >= begin
                    && variableBinding.getCtx().getStop().getLine() <= end) {
                {
                    result.add(variableBinding);
                }
            }
        }
        
        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMethodsBinding()) {
            if (methodDeclarationBinding.getCtx().getStart().getLine() >= begin
                    && methodDeclarationBinding.getCtx().getStop().getLine() <= end) {
                {
                    result.add(methodDeclarationBinding);
                }
            }
        }
        
        return result;
    }
    
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
        Boolean verify = true;
        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMethodsBinding()) {
            verify = true;
            if (methodDeclarationBinding.getName().equals(methodDeclaration.getName())) {
                if (methodDeclarationBinding.getReturnBinding().getName().equals(methodDeclaration.getReturnBinding().getName())) {
                    if (methodDeclarationBinding.getParameters().size() == methodDeclaration.getParameters().size()) {
                        for (int i = 0; i < methodDeclarationBinding.getParameters().size(); i++) {
                            if (!methodDeclarationBinding.getParameters().get(i).getType().getName().equals(methodDeclaration.getParameters().get(i).getType().getName())) {
                                verify = false;
                            }
                        }
                        if (verify) {
                            return methodDeclarationBinding;
                        }
                    }
                }
            }
        }
        return null;
    }

    public MethodDeclarationBinding findMethodCall(MethodCallBinding methodCall, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMethodsBinding()) {
            if ((methodDeclarationBinding.getMethodEnviromentBinding().findMethodCall(methodCall)).equals(methodCall)) {
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

    public LocalVariableDeclarationBinding findVariableDeclaration(MethodDeclarationBinding methodDeclaration, String key, String variable) {

        TypeBinding typeBinding = enviroment.get(key);
        Boolean verify = true;

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMethodsBinding()) {
            verify = true;
            if (methodDeclarationBinding.getName().equals(methodDeclaration.getName())) {
                if (methodDeclarationBinding.getReturnBinding().getName().equals(methodDeclaration.getReturnBinding().getName())) {
                    if (methodDeclarationBinding.getParameters().size() == methodDeclaration.getParameters().size()) {
                        for (int i = 0; i < methodDeclarationBinding.getParameters().size(); i++) {
                            if (!methodDeclarationBinding.getParameters().get(i).getType().getName().equals(methodDeclaration.getParameters().get(i).getType().getName())) {
                                verify = false;
                            }
                        }
                        if (verify) {
                            List<LocalVariableDeclarationBinding> variableList = new ArrayList<>();
                            for (List<BaseBinding> enviroment : methodDeclarationBinding.getMethodEnviromentBinding().getEnviroment()) {
                                for (BaseBinding baseBinding : enviroment) {
                                    if (baseBinding instanceof LocalVariableDeclarationBinding) {
                                        if (((LocalVariableDeclarationBinding) baseBinding).getName().equals(variable)) {
                                            variableList.add((LocalVariableDeclarationBinding) baseBinding);
                                        }
                                    }
                                }

                            }
                            if (!variableList.isEmpty()) {
                                return variableList.get(variableList.size() - 1);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public LocalVariableUsageBinding findVariableUsage(MethodDeclarationBinding methodDeclaration, String key, String variable) {

        TypeBinding typeBinding = enviroment.get(key);
        Boolean verify = true;

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMethodsBinding()) {
            verify = true;
            if (methodDeclarationBinding.getName().equals(methodDeclaration.getName())) {
                if (methodDeclarationBinding.getReturnBinding().getName().equals(methodDeclaration.getReturnBinding().getName())) {
                    if (methodDeclarationBinding.getParameters().size() == methodDeclaration.getParameters().size()) {
                        for (int i = 0; i < methodDeclarationBinding.getParameters().size(); i++) {
                            if (!methodDeclarationBinding.getParameters().get(i).getType().getName().equals(methodDeclaration.getParameters().get(i).getType().getName())) {
                                verify = false;
                            }
                        }
                        if (verify) {
                            List<LocalVariableDeclarationBinding> variableList = new ArrayList<>();
                            for (List<BaseBinding> enviroment : methodDeclarationBinding.getMethodEnviromentBinding().getEnviroment()) {
                                for (BaseBinding baseBinding : enviroment) {
                                    if (baseBinding instanceof LocalVariableDeclarationBinding) {
                                        if (((LocalVariableDeclarationBinding) baseBinding).getName().equals(variable)) {
                                            variableList.add((LocalVariableDeclarationBinding) baseBinding);
                                        }
                                    }
                                }

                            }
                            if (!variableList.isEmpty()) {
                                for (List<BaseBinding> enviroment : methodDeclarationBinding.getMethodEnviromentBinding().getEnviroment()) {
                                    for (BaseBinding baseBinding : enviroment) {
                                        if (baseBinding instanceof LocalVariableUsageBinding) {
                                            if (((LocalVariableUsageBinding) baseBinding).getLocalVariableDeclarationBinding().equals(variableList.size() - 1)) {
                                                return (LocalVariableUsageBinding) baseBinding;
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
