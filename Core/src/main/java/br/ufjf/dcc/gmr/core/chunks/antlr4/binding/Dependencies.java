package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.List;

public class Dependencies {

    public static void methodDeclarationCallList(List<MethodDeclarationBinding> mdbList, TypeBinding mdbType, List<MethodCallBinding> mcbList) {
        for (MethodCallBinding methodCallBinding : mcbList) {

            for (MethodDeclarationBinding methodDeclarationBinding : mdbList) {

                methodDeclarationCall(methodDeclarationBinding, methodCallBinding);
            }
        }
    }

    private static boolean methodDeclarationCall(MethodDeclarationBinding mdb, MethodCallBinding mcb) {
        if (mdb.equalsTo(mcb)) {
            System.out.println(mdb + " ==> " + mcb);
        }
        return mdb.equalsTo(mcb);
    }

    public static DependencyType methodDependsOn(List<BaseBinding> chunkSource, List<BaseBinding> chunkTarget) {
        for (BaseBinding sourceBinding : chunkSource) {
            if (sourceBinding instanceof MethodCallBinding) {
                for (BaseBinding targetBinding : chunkTarget) {
                    if (targetBinding instanceof MethodDeclarationBinding) {
                        if(methodDeclarationCall((MethodDeclarationBinding) targetBinding, (MethodCallBinding) sourceBinding)){
                            return DependencyType.METHOD_CALL_DECLARATION;
                        }
                    }
                }
            }
        }
        return DependencyType.NO_DEPENDENCY;
    }

    public static DependencyType variableDependsOn(List<BaseBinding> chunkSource, List<BaseBinding> chunkTarget) {
        for (BaseBinding sourceBinding : chunkSource) {
            if (sourceBinding instanceof LocalVariableUsageBinding) {
                for (BaseBinding targetBinding : chunkTarget) {
                    if (targetBinding instanceof LocalVariableDeclarationBinding) {
                        LocalVariableDeclarationBinding targetDeclaration = ((LocalVariableUsageBinding) sourceBinding).getLocalVariableDeclarationBinding();
                        if(targetBinding.equals(targetDeclaration)){
                            return DependencyType.VARIABLE_USAGE_DECLARATION;
                        }
                    }
                }
            }
        }
        return DependencyType.NO_DEPENDENCY;
    }

    public static DependencyType atributeDependsOn(List<BaseBinding> chunkSource, List<BaseBinding> chunkTarget) {
        for (BaseBinding sourceBinding : chunkSource) {
            if (sourceBinding instanceof LocalVariableUsageBinding) {
                for (BaseBinding targetBinding : chunkTarget) {
                    if (targetBinding instanceof AttributeDeclaratinBinding) {
                        LocalVariableDeclarationBinding targetDeclaration = ((LocalVariableUsageBinding) sourceBinding).getLocalVariableDeclarationBinding();
                        if(targetBinding.equals(targetDeclaration)){
                            return DependencyType.ATRIBUTE_USAGE_DECLARATION;
                        }
                    }
                }
            }
        }
        return DependencyType.NO_DEPENDENCY;
    }
}
