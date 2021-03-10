package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.chunks.antlr4.model.Chunk;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    public List<BaseBinding> findLanguageConstructs(String path, Chunk languageConstruct) {

        List<BaseBinding> result = new ArrayList<>();
        
        
        String aux = path.replaceAll("/", ".");
        aux = path.replaceAll("\\\\", ".");
        String replacedPath = "";
        Set<String> keySet = enviroment.keySet();
        
        for(int i=0; i < keySet.size(); i++){
            if(aux.contains((String) keySet.toArray()[i])){
                replacedPath = (String) keySet.toArray()[i];
            }
        }
        
        
        TypeBinding typeBinding = enviroment.get(replacedPath);

        //Add imports, attributes and methodDeclaration in result object. MethodCalls, LocalVariables and LocalVariablesUsage are inside MethodDeclaration
        for (ImportBinding importBinding : typeBinding.getImports()) {
            if (importBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin()+1
                    && importBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd()+1) {
                {
                    result.add(importBinding);
                }
            }
        }

        for (AttributeDeclaratinBinding variableBinding : typeBinding.getAttributes()) {
            if (variableBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin()+1
                    && variableBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd()+1) {
                {
                    result.add(variableBinding);
                }
            }
        }

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMethodsBinding()) {
            if (methodDeclarationBinding.getCtx().getStart().getLine() < languageConstruct.getLineBegin()+1
                    && methodDeclarationBinding.getCtx().getStop().getLine() > languageConstruct.getLineEnd()+1) {
                {
                    result.add(methodDeclarationBinding);

                    for (MethodCallBinding methodCallBinding : methodDeclarationBinding.getMethodCallBindings()) {

                        if (methodCallBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin()+1
                                && methodCallBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd()+1) {
                            {
                                result.add(methodCallBinding);
                            }
                        }

                    }

                    for (LocalVariableDeclarationBinding localVariableDeclarationBinding : methodDeclarationBinding.getLocalVariableDeclarationBindings()) {

                        if (localVariableDeclarationBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin()+1
                                && localVariableDeclarationBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd()+1) {
                            {
                                result.add(localVariableDeclarationBinding);
                            }
                        }

                    }

                    for (LocalVariableUsageBinding localVariableUsageBinding : methodDeclarationBinding.getLocalVariableUsageBindings()) {

                        if (localVariableUsageBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin()+1
                                && localVariableUsageBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd()+1) {
                            {
                                result.add(localVariableUsageBinding);
                            }
                        }

                    }

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
                            if (!methodDeclarationBinding.getParameters().get(i).getTypeBinding().getName().equals(methodDeclaration.getParameters().get(i).getTypeBinding().getName())) {
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

    public AttributeDeclaratinBinding findAttribute(AttributeDeclaratinBinding attribute, String key) {

        TypeBinding typeBinding = enviroment.get(key);

        for (AttributeDeclaratinBinding attribute1 : typeBinding.getAttributes()) {
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
                            if (!methodDeclarationBinding.getParameters().get(i).getTypeBinding().getName().equals(methodDeclaration.getParameters().get(i).getTypeBinding().getName())) {
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
                            if (!methodDeclarationBinding.getParameters().get(i).getTypeBinding().getName().equals(methodDeclaration.getParameters().get(i).getTypeBinding().getName())) {
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
