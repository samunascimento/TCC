/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.Translators;

import java.util.ArrayList;
import java.util.List;
import br.ufjf.dcc.gmr.core.vcs.types.LanguageConstructsTypes;

/**
 *
 * @author luan
 */
public class Translator {

    public Translator() {

    }

    public static List<String> JavaTranslator(List<String> list) {
        List<String> mainList = new ArrayList<>();
        if (list.contains("Nothing")) {
            mainList.add(LanguageConstructsTypes.BLANK);
            list.remove("Nothing");
        }
        if (list.contains("IfThenElseStatement")
                || list.contains("IfThenStatement")
                || list.contains("IfThenElseStatementNoShortIf")
                || list.contains("IfStatement")) {
            mainList.add(LanguageConstructsTypes.IF_STATEMENT);
            list.remove("IfThenElseStatement");
            list.remove("IfThenStatement");
            list.remove("IfThenElseStatementNoShortIf");

        }
        if (list.contains("ForStatement")
                || list.contains("ForStatementNoShortIf")
                || list.contains("BasicForStatement")
                || list.contains("BasicForStatementNoShortIf")
                || list.contains("EnhancedForStatement")
                || list.contains("EnhancedForStatementNoShortIf")) {
            mainList.add(LanguageConstructsTypes.FOR_STATEMENT);
            list.remove("ForStatement");
            list.remove("ForStatementNoShortIf");
            list.remove("BasicForStatement");
            list.remove("BasicForStatementNoShortIf");
            list.remove("EnhancedForStatement");
            list.remove("EnhancedForStatementNoShortIf");
        }
        if (list.contains("WhileStatement")
                || list.contains("WhileStatementNoShortIf")) {
            mainList.add(LanguageConstructsTypes.WHILE_STATEMENT);
            list.remove("WhileStatement");
            list.remove("WhileStatementNoShortIf");

        }
        if (list.contains("DoStatement")) {
            mainList.add(LanguageConstructsTypes.DO_STATEMENT);
            list.remove("DoStatement");
        }
        if (list.contains("case")) {
            mainList.add(LanguageConstructsTypes.DO_STATEMENT);
            list.remove("case");
        }
        if (list.contains("TryStatement")
                || list.contains("TryWithResourcesStatement")) {
            mainList.add(LanguageConstructsTypes.TRY_STATEMENT);
            list.remove("TryStatement");
            list.remove("TryWithResourcesStatement");
        }
        if (list.contains("Catches")
                || list.contains("CatchClause")
                || list.contains("CatchFormalParameter")
                || list.contains("CatchType")) {
            mainList.add(LanguageConstructsTypes.CATCH_CLAUSE);
            list.remove("Catches");
            list.remove("CatchClause");
            list.remove("CatchFormalParameter");
            list.remove("CatchType");
        }
        if (list.contains("ArrayInitializer")
                || list.contains("elementValueArrayInitializer")
                || list.contains("arrayCreationExpression")
                || list.contains("arrayType")) {
            mainList.add(LanguageConstructsTypes.ARRAY_INITIALIZER);
            list.remove("ArrayInitializer");
        }
        if (list.contains("ArrayAccess")
                || list.contains("arrayAccess_lf_primary")
                || list.contains("arrayAccess_lfno_primary")) {
            mainList.add(LanguageConstructsTypes.ARRAY_ACCESS);
            list.remove("ArrayAccess");
        }
        if (list.contains("BreakStatement")) {
            mainList.add(LanguageConstructsTypes.BREAK_STATEMENT);
            list.remove("BreakStatement");
        }
        if (list.contains("CastExpression")) {
            mainList.add(LanguageConstructsTypes.CAST_EXPRESSION);
            list.remove("CastExpression");
        }
        if (list.contains("ClassDeclaration")
                || list.contains("NormalClassDeclaration")
                || list.contains("ClassBodyDeclaration")
                || list.contains("ClassMemberDeclaration")) {
            mainList.add(LanguageConstructsTypes.CLASS_DECLARATION);
            list.remove("ClassDeclaration");
            list.remove("NormalClassDeclaration");
            list.remove("ClassBodyDeclaration");
            list.remove("ClassMemberDeclaration");
            //mainList.add(LanguageConstructsTypes.CLASS_SIGNATURE);
        }
        if (list.contains("ContinueStatement")) {
            mainList.add(LanguageConstructsTypes.CONTINUE_STATEMENT);
            list.remove("ContinueStatement");
        }
        if (list.contains("ImportDeclaration")
                || list.contains("SingleTypeImportDeclaration")
                || list.contains("TypeImportOnDemandDeclaration")
                || list.contains("SingleStaticImportDeclaration")
                || list.contains("StaticImportOnDemandDeclaration")) {
            mainList.add(LanguageConstructsTypes.IMPORT_DECLARATION);
            list.remove("ImportDeclaration");
            list.remove("SingleTypeImportDeclaration");
            list.remove("TypeImportOnDemandDeclaration");
            list.remove("SingleStaticImportDeclaration");
            list.remove("StaticImportOnDemandDeclaration");
        }
        if (list.contains("PackageDeclaration")
                || list.contains("PackageName")
                || list.contains("PackageOrTypeName")) {
            mainList.add(LanguageConstructsTypes.PACKAGE_DECLARATION);
            list.remove("PackageDeclaration");
            list.remove("PackageName");
            list.remove("PackageOrTypeName");
        }
        if (list.contains("ReturnStatement")) {
            mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
            list.remove("ReturnStatement");
        }
        if (list.contains("ThrowStatement") /*list.contains("throwsStatement")*/) {
            mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
            list.remove("ThrowStatement");
        }
        if (list.contains("ReturnStatement")) {
            mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
            list.remove("ReturnStatement");
        }
        if (list.contains("StaticInitializer")) {
            mainList.add(LanguageConstructsTypes.STATIC_INITIALIZER);
            list.remove("StaticInitializer");
        }
        if (list.contains("SwitchStatement")
                || list.contains("SwitchBlock")
                || list.contains("SwitchBlockStatementGroup")
                || list.contains("SwitchLabels")
                || list.contains("SwitchLabel")) {
            mainList.add(LanguageConstructsTypes.PACKAGE_DECLARATION);
            list.remove("SwitchStatement");
            list.remove("SwitchBlock");
            list.remove("SwitchBlockStatementGroup");
            list.remove("SwitchLabels");
            list.remove("SwitchLabel");
        }
        if (list.contains("InterfaceDeclaration")
                || list.contains("NormalInterfaceDeclaration")) {
            mainList.add(LanguageConstructsTypes.INTERFACE_DECLARATION);
            list.remove("InterfaceDeclaration");
            list.remove("NormalInterfaceDeclaration");
        }
        if (list.contains("SynchronizedStatement")) {
            mainList.add(LanguageConstructsTypes.INTERFACE_DECLARATION);
            list.remove("SynchronizedStatement");
        }
        if (list.contains("AnnotationTypeDeclaration")
                || list.contains("AnnotationTypeMemberDeclaration")
                || list.contains("AnnotationTypeElementDeclaration")) {
            mainList.add(LanguageConstructsTypes.ANNOTATION_TYPE_MEMBER_DECLARATION);
            list.remove("AnnotationTypeDeclaration");
            list.remove("AnnotationTypeMemberDeclaration");
            list.remove("AnnotationTypeElementDeclaration");
        }
        if (list.contains("Annotation")
                || list.contains("NormalAnnotation")
                || list.contains("MarkerAnnotation")
                || list.contains("SingleElementAnnotation")
                || list.contains("AnnotationTypeBody")) {
            mainList.add(LanguageConstructsTypes.ANNOTATION);
            list.remove("Annotation");
            list.remove("NormalAnnotation");
            list.remove("MarkerAnnotation");
            list.remove("SingleElementAnnotation");
            list.remove("AnnotationTypeBody");
        }
        if (list.contains("AssertStatement")) {
            mainList.add(LanguageConstructsTypes.ASSERT_STATEMENT);
            list.remove("AssertStatement");
        }
      if (list.contains("TypeVariable")
                || list.contains("VariableDeclaratorList")
                || list.contains("VariableDeclarator")
                || list.contains("VariableDeclaratorId")
                || list.contains("VariableInitializer")
                || list.contains("UnannTypeVariable")
                || list.contains("VariableModifier")
                || list.contains("VariableInitializerList")
                || list.contains("LocalVariableDeclarationStatement")
                || list.contains("LocalVariableDeclaration")
                || list.contains("VariableDeclaratorId")
                || list.contains("VariableDeclarator")
                || list.contains("VariableAccess")) {
            mainList.add(LanguageConstructsTypes.VARIABLE);
            list.remove("TypeVariable");
            list.remove("VariableDeclaratorList");
            list.remove("VariableDeclarator");
            list.remove("VariableDeclaratorId");
            list.remove("VariableInitializer");
            list.remove("UnannTypeVariable");
            list.remove("VariableModifier");
            list.remove("VariableInitializerList");
            list.remove("LocalVariableDeclarationStatement");
            list.remove("LocalVariableDeclaration");
            list.remove("VariableAccess");
            list.remove("VariableDeclaratorId");
            list.remove("VariableDeclarator");
        }
        if (list.contains("FieldAccess")
                || list.contains("FieldAccess_lf_primary")
                || list.contains("FieldAccess_lfno_primary")
                || list.contains("FieldDeclaration")
                || list.contains("FieldModifier")) {
            mainList.add(LanguageConstructsTypes.FIELD);
            list.remove("FieldAccess");
            list.remove("FieldAccess_lf_primary");
            list.remove("FieldAccess_lfno_primary");
            list.remove("FieldDeclaration");
            list.remove("FieldModifier");
        }
        if (list.contains("EnumDeclaration")
                || list.contains("EnumBody")
                || list.contains("EnumConstantList")
                || list.contains("EnumConstant")
                || list.contains("EnumConstantModifier")
                || list.contains("EnumBodyDeclarations")) {
            mainList.add(LanguageConstructsTypes.ENUM_DECLARATION);
            list.remove("EnumDeclaration");
            list.remove("EnumBody");
            list.remove("EnumConstantList");
            list.remove("EnumConstant");
            list.remove("EnumConstantModifier");
            list.remove("EnumBodyDeclarations");
        }
        if (list.contains("InterfaceMethodDeclaration")
                || list.contains("InterfaceMethodModifier")) {
            mainList.add(LanguageConstructsTypes.METHOD_INTERFACE);
            list.remove("InterfaceMethodDeclaration");
            list.remove("InterfaceMethodModifier");
        }
        if (list.contains("MethodName")
                || list.contains("MethodDeclaration")
                || list.contains("MethodModifier")
                || list.contains("MethodHeader")
                || list.contains("MethodDeclarator")
                || list.contains("MethodBody")
                || list.contains("MethodInvocation")
                || list.contains("MethodReference")
                || list.contains("MethodInvocation_lf_primary")
) {
            mainList.add(LanguageConstructsTypes.METHOD_DECLARATION);
            list.remove("MethodName");
            list.remove("MethodDeclaration");
            list.remove("MethodModifier");
            list.remove("MethodHeader");
            list.remove("MethodBody");
            list.remove("MethodInvocation");
            list.remove("MethodInvocation_lf_primary");
            list.remove("MethodDeclarator");
            list.remove("MethodReference");
        }
        
        if (list.contains("WARNING!")) {
            mainList.add(LanguageConstructsTypes.ERROR);
            list.remove("WARNING!");
        }
        if (!list.isEmpty()) {
            mainList.add(LanguageConstructsTypes.OTHER);
        }

        return mainList;
    }

}


/*

annotationTypeElementModifier
 */
