package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.List;

public class Dependencies {

    public static void methodDeclarationCallList(List<MethodDeclarationBinding> mdbList, TypeBinding mdbType, List<MethodCallBinding> mcbList){
        for (MethodCallBinding methodCallBinding : mcbList) {
            
            for (MethodDeclarationBinding methodDeclarationBinding : mdbList) {
                
                methodDeclarationCall(methodDeclarationBinding,mdbType, methodCallBinding);
            }
        }
    }
    
    private static boolean methodDeclarationCall(MethodDeclarationBinding mdb, TypeBinding mdbType, MethodCallBinding mcb) {
        if(mdb.equalsTo(mcb, mdbType)){
            System.out.println(mdb + " ==> " + mcb);
        }
        return mdb.equalsTo(mcb, mdbType);
    }
}
