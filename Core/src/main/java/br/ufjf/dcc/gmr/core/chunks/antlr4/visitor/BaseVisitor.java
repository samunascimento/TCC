/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.visitor;


import br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example.Person;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.GlobalEnviroment;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.TypeBinding;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author felip
 */
public class BaseVisitor {

    public boolean visitClassDeclaration(JavaParser.ClassDeclarationContext ctx, TypeBinding typeBinding, GlobalEnviroment globalEnviroment, String packageName) {
           
        Person person = new Person();
        TypeBinding extendedClass = new TypeBinding();         
                
        typeBinding.setName(ctx.getChild(1).getText());
        String name = "";
       
        JavaParser.ClassDeclarationContext classDeclaration = (JavaParser.ClassDeclarationContext) ctx;

        if (classDeclaration.getChild(2).getText().equals("extends")) {
            ParseTree typeExtends = classDeclaration.getChild(3);

            if (typeBinding.getImports().size() != 0) {
                for (String Import : typeBinding.getImports()) {
                    String[] aux = Import.split("\\.");
                    String name2 = aux[aux.length - 1];
                    if (name2.equals(typeExtends.getText())) {
                        name = Import.concat(".java");
                        extendedClass = globalEnviroment.getEnviroment().get(name);
                    }
                }
            } else {
                name = packageName.concat(".").concat(typeExtends.getText()).concat(".java");
                extendedClass = globalEnviroment.getEnviroment().get(name);
            }

            typeBinding.setExtendClass(extendedClass);         
            
             if (typeBinding.getExtendClass() == null) {
                return true;
             }
        }    
        
        return false;
    }

    public  void visitTypeDeclaration() {

    }

    public  void visitImportDeclaration() {

    }

    public  void visitPackageDeclaration() {

    }
}
