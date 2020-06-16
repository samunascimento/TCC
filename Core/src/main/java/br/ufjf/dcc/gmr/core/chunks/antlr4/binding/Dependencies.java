package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.List;

public class Dependencies {

    public static void methodDeclarationCallList(List<MethodDeclarationBinding> mdbList, List<MethodCallBinding> mcbList){
        for (MethodCallBinding methodCallBinding : mcbList) {
            for (MethodDeclarationBinding methodDeclarationBinding : mdbList) {
                methodDeclarationCall(methodDeclarationBinding, methodCallBinding);
            }
        }
    }
    
    private static boolean methodDeclarationCall(MethodDeclarationBinding mdb, MethodCallBinding mcb) {
        if(mdb.equalsTo(mcb)){
            System.out.println(mdb + " ==> " + mcb);
        }
        return mdb.equalsTo(mcb);
    }
    
    private static void variablePrintOut(VariableBinding variable){
        System.out.println("Package = "+variable.getPackageBinding().getName());
        System.out.println(variable.getModifier()+" "+variable.getType()+" "+variable.getName());
    }
    
}
