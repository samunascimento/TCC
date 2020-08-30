/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.visitor;

import br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example.Person;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.GlobalEnviroment;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.MethodDeclarationBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.Modifier;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.PackageBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.PrimitiveTypes;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.TypeBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.VariableBinding;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author felip
 */
public class BaseVisitor {

    MethodDeclarationBinding mdbGeneral;

    public BaseVisitor(MethodDeclarationBinding mdbGeneral) {
        this.mdbGeneral = mdbGeneral;
    }

    public BaseVisitor() {
    }

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

    public void visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx, GlobalEnviroment globalEnviroment, String packageName, String className) {

        List<VariableBinding> parameters = new ArrayList<>();
        TypeBinding methodType = new TypeBinding();

        this.mdbGeneral = new MethodDeclarationBinding();

        this.mdbGeneral.setName(ctx.IDENTIFIER().getText());
        this.mdbGeneral.setCtx(ctx);

        List<Modifier> modifiers = extractModifier(ctx);
        this.mdbGeneral.setModifier(modifiers);

        JavaParser.TypeTypeContext typeType = (JavaParser.TypeTypeContext) ctx.typeTypeOrVoid().typeType();
        if (typeType == null) {

            methodType = PrimitiveTypes.init(PrimitiveTypes.VOID);
        } else if (typeType.primitiveType() != null) {

            methodType = PrimitiveTypes.init(typeType.primitiveType().getText());
        } else if (typeType.classOrInterfaceType() != null) {

            String name = packageName;
            name = name.concat(".").concat(typeType.classOrInterfaceType().getText()).concat(".java");
            TypeBinding compare = globalEnviroment.getEnviroment().get(name);
            if (compare != null) {
                methodType = compare;
            } else {
                //TODO external class                
                if (typeType.classOrInterfaceType().getText().equals(PrimitiveTypes.STRING)) {
                    methodType = PrimitiveTypes.init(PrimitiveTypes.STRING);
                } else {
                    methodType.setName(typeType.classOrInterfaceType().getText());
                }

            }
        }

        //Getting parameters
        JavaParser.FormalParameterListContext formalParameters = (JavaParser.FormalParameterListContext) ctx.formalParameters().formalParameterList();

        if (ctx.formalParameters().formalParameterList() != null) {
            for (ParseTree parseTree : formalParameters.children) {
                if (parseTree instanceof JavaParser.FormalParameterContext) {

                    JavaParser.FormalParameterContext aux = (JavaParser.FormalParameterContext) parseTree;
                    TypeBinding parameterType = new TypeBinding();
                    VariableBinding parameter = new VariableBinding();

                    parameter.setName(aux.variableDeclaratorId().getText());

                    if (aux.typeType().classOrInterfaceType() != null) {

                        for (TypeBinding type : globalEnviroment.getEnviroment().values()) {
                            if (aux.typeType().classOrInterfaceType().getText().equals(type.getName())) {
                                parameterType = type;
                            }
                        }
                        if (parameterType.getName().isEmpty()) {

                            parameterType.setName(aux.typeType().classOrInterfaceType().getText());

                        }

                    } else if (aux.typeType().primitiveType() != null) {
                        parameterType = PrimitiveTypes.init(aux.typeType().primitiveType().getText());

                    }

                    parameter.setType(parameterType);

                    parameters.add(parameter);
                }
            }
        }

        this.mdbGeneral.setReturnBinding(methodType);
        this.mdbGeneral.setParameters(parameters);
        globalEnviroment.getEnviroment().get(className).getMdbList().add(this.mdbGeneral);
    }

    private List<Modifier> extractModifier(JavaParser.MethodDeclarationContext ctx) {
        List<Modifier> result = new ArrayList<>();

        ParserRuleContext memberDeclaration = ctx.getParent();
        ParserRuleContext classBodyDeclaration = memberDeclaration.getParent();

        for (ParseTree parseTree : classBodyDeclaration.children) {
            if (parseTree instanceof JavaParser.ModifierContext) {
                result.add(Modifier.equalsTo(parseTree.getText()));
            }
        }

        return result;
    }

    public void visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx, PackageBinding packageBinding) {
        for (ParseTree parseTree : ctx.children) {
            if (parseTree instanceof JavaParser.QualifiedNameContext) {
                packageBinding.setName(parseTree.getText());
            }
        }
    }
}
