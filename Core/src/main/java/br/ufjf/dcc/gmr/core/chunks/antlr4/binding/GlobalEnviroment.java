package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import br.ufjf.dcc.gmr.core.chunks.antlr4.model.Chunk;
import br.ufjf.dcc.gmr.core.chunks.jung.Edge;
import static br.ufjf.dcc.gmr.core.chunks.jung.Main.verifyChunksDependencies;
import br.ufjf.dcc.gmr.core.chunks.jung.Vertex;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;
import edu.uci.ics.jung.graph.util.EdgeType;
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

        for (int i = 0; i < keySet.size(); i++) {
            if (aux.contains((String) keySet.toArray()[i])) {
                replacedPath = (String) keySet.toArray()[i];
            }
        }

        TypeBinding typeBinding = enviroment.get(replacedPath);

        //Add imports, attributes and methodDeclaration in result object. MethodCalls, LocalVariables and LocalVariablesUsage are inside MethodDeclaration
        for (ImportBinding importBinding : typeBinding.getImports()) {
            if (importBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin() + 1
                    && importBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd() + 1) {
                {
                    result.add(importBinding);
                }
            }
        }

        for (AttributeDeclaratinBinding variableBinding : typeBinding.getAttributes()) {
            if (variableBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin() + 1
                    && variableBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd() + 1) {
                {
                    result.add(variableBinding);
                }
            }
        }

        for (MethodDeclarationBinding methodDeclarationBinding : typeBinding.getMethodsBinding()) {

            if (methodDeclarationBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin() + 1
                    && methodDeclarationBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd() + 1) {
                {
                    result.add(methodDeclarationBinding);

                    for (MethodCallBinding methodCallBinding : methodDeclarationBinding.getMethodCallBindings()) {

                        if (methodCallBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin() + 1
                                && methodCallBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd() + 1) {
                            {
                                result.add(methodCallBinding);
                            }
                        }

                    }

                    for (LocalVariableDeclarationBinding localVariableDeclarationBinding : methodDeclarationBinding.getLocalVariableDeclarationBindings()) {

                        if (localVariableDeclarationBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin() + 1
                                && localVariableDeclarationBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd() + 1) {
                            {
                                result.add(localVariableDeclarationBinding);
                            }
                        }

                    }

                    for (LocalVariableUsageBinding localVariableUsageBinding : methodDeclarationBinding.getLocalVariableUsageBindings()) {

                        if (localVariableUsageBinding.getCtx().getStart().getLine() > languageConstruct.getLineBegin() + 1
                                && localVariableUsageBinding.getCtx().getStop().getLine() < languageConstruct.getLineEnd() + 1) {
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

    public List<List<DependencyType>> findDependencies(List<ConflictChunk> conflictChunckList) {

        List<List<DependencyType>> dependencyMatrix = new ArrayList<>();
        List<DependencyType> caseOne, caseTwo, caseThree, caseFour;
        
        for (ConflictChunk chunkA : conflictChunckList) {
            for (ConflictChunk chunkB : conflictChunckList) {

                if (!chunkA.equals(chunkB)) {
                    List<DependencyType> concat = new ArrayList<>();
                    //VerticeA's ChunkVersionOne dependencies check with VerticeB Chunks
                    caseOne = verifyChunksDependencies(chunkA.getChunkVersion1(), chunkB.getChunkVersion1());
                    caseTwo = verifyChunksDependencies(chunkA.getChunkVersion1(), chunkB.getChunkVersion2());

                    //VerticeA's ChunkVersionTwo  dependencies check with VerticeB Chunks
                    caseThree = verifyChunksDependencies(chunkA.getChunkVersion2(), chunkB.getChunkVersion1());
                    caseFour = verifyChunksDependencies(chunkA.getChunkVersion2(), chunkB.getChunkVersion2());

                    if (!caseOne.get(0).equals(DependencyType.NO_DEPENDENCY)) {
                        concat.addAll(caseOne);
                    }
                    if (!caseTwo.get(0).equals(DependencyType.NO_DEPENDENCY) && concat.size() < 3) {
                        for (DependencyType dependencyType : caseTwo) {
                            if (!concat.contains(dependencyType)) {
                                concat.add(dependencyType);
                            }
                        }
                    }

                    if (!caseThree.get(0).equals(DependencyType.NO_DEPENDENCY) && concat.size() < 3) {
                        for (DependencyType dependencyType : caseThree) {
                            if (!concat.contains(dependencyType)) {
                                concat.add(dependencyType);
                            }
                        }
                    }

                    if (!caseFour.get(0).equals(DependencyType.NO_DEPENDENCY) && concat.size() < 3) {
                        for (DependencyType dependencyType : caseFour) {
                            if (!concat.contains(dependencyType)) {
                                concat.add(dependencyType);
                            }
                        }
                    }

                    //if last one versionChunk are dependencies with verticeB versionchunks, we create a edge between both
                    if (!caseOne.get(0).equals(DependencyType.NO_DEPENDENCY)
                            || !caseTwo.get(0).equals(DependencyType.NO_DEPENDENCY)
                            || !caseThree.get(0).equals(DependencyType.NO_DEPENDENCY)
                            || !caseFour.get(0).equals(DependencyType.NO_DEPENDENCY)) {

                    }
                dependencyMatrix.add(concat);
                }
                
            }

        }
        
        return dependencyMatrix;

    }

    public static List<DependencyType> verifyChunksDependencies(Chunk chunkA, Chunk chunkB) {

        List<BaseBinding> sourceBinding = new ArrayList<>();
        List<BaseBinding> targetBinding = new ArrayList<>();
        List<DependencyType> list = new ArrayList<>();
        sourceBinding = chunkA.getLanguageConstruct();
        targetBinding = chunkB.getLanguageConstruct();

        if (Dependencies.atributeDependsOn(sourceBinding, targetBinding).equals(DependencyType.ATRIBUTE_USAGE_DECLARATION)) {
            list.add(DependencyType.ATRIBUTE_USAGE_DECLARATION);
        }
        if (Dependencies.methodDependsOn(sourceBinding, targetBinding).equals(DependencyType.METHOD_CALL_DECLARATION)) {
            list.add(DependencyType.METHOD_CALL_DECLARATION);
        }
        if (Dependencies.variableDependsOn(sourceBinding, targetBinding).equals(DependencyType.VARIABLE_USAGE_DECLARATION)) {
            list.add(DependencyType.VARIABLE_USAGE_DECLARATION);
        }
        if (list.isEmpty()) {
            list.add(DependencyType.NO_DEPENDENCY);
        }
        return list;
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
