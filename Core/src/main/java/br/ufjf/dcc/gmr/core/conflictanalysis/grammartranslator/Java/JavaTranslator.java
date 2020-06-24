/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.grammartranslator.Java;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import java.util.ArrayList;
import java.util.List;
import br.ufjf.dcc.gmr.core.vcs.types.LanguageConstructsTypes;

/**
 *
 * @author luan
 */
public class JavaTranslator {

    public JavaTranslator() {

    }

    public static List<String> translator(List<SyntaxStructure> list) {
        List<String> mainList = new ArrayList<>();
        if (list.contains("ifThenElseStatement")
                || list.contains("ifThenStatement")
                || list.contains("ifThenElseStatementNoShortIf")) {
            mainList.add(LanguageConstructsTypes.IF_STATEMENT);
        } else if (list.contains("forStatement")
                || list.contains("forStatementNoShortIf")
                || list.contains("basicForStatement")
                || list.contains("basicForStatementNoShortIf")
                || list.contains("enhancedForStatement")
                || list.contains("enhancedForStatementNoShortIf")) {
            mainList.add(LanguageConstructsTypes.FOR_STATEMENT);
        } else if (list.contains("whileStatement")
                || list.contains("whileStatementNoShortIf")) {
            mainList.add(LanguageConstructsTypes.WHILE_STATEMENT);
        } else if (list.contains("doStatement")) {
            mainList.add(LanguageConstructsTypes.DO_STATEMENT);
        } else if (list.contains("tryStatement")
                || list.contains("tryWithResourcesStatement")) {
            mainList.add(LanguageConstructsTypes.TRY_STATEMENT);
        } else if (list.contains("catches")
                || list.contains("catchClause")
                || list.contains("catchFormalParameter")
                || list.contains("catchType")) {
            mainList.add(LanguageConstructsTypes.CATCH_CLAUSE);
        } else if (list.contains("arrayInitializer")) {
            mainList.add(LanguageConstructsTypes.ARRAY_INITIALIZER);
        } else if (list.contains("arrayAccess")) {
            mainList.add(LanguageConstructsTypes.ARRAY_ACCESS);
        } else if (list.contains("breakStatement")) {
            mainList.add(LanguageConstructsTypes.BREAK_STATEMENT);
        } else if (list.contains("castExpression")) {
            mainList.add(LanguageConstructsTypes.CAST_EXPRESSION);
        } else if (list.contains("classDeclaration")
                || list.contains("normalClassDeclaration")
                || list.contains("classBodyDeclaration")
                || list.contains("classMemberDeclaration")) {
            mainList.add(LanguageConstructsTypes.CLASS_DECLARATION);
            //mainList.add(LanguageConstructsTypes.CLASS_SIGNATURE);
        } else if (list.contains("continueStatement")) {
            mainList.add(LanguageConstructsTypes.CONTINUE_STATEMENT);
        } else if (list.contains("importDeclaration")
                || list.contains("singleTypeImportDeclaration")
                || list.contains("typeImportOnDemandDeclaration")
                || list.contains("singleStaticImportDeclaration")
                || list.contains("staticImportOnDemandDeclaration")) {
            mainList.add(LanguageConstructsTypes.IMPORT_DECLARATION);
        } else if (list.contains("packageDeclaration")
                || list.contains("packageName")
                || list.contains("packageOrTypeName")) {
            mainList.add(LanguageConstructsTypes.PACKAGE_DECLARATION);
        } else if (list.contains("returnStatement")) {
            mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
        } else if (list.contains("throwStatement") /*list.contains("throwsStatement")*/) {
            mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
        } else if (list.contains("returnStatement")) {
            mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
        } else if (list.contains("staticInitializer")) {
            mainList.add(LanguageConstructsTypes.STATIC_INITIALIZER);
        } else if (list.contains("switchStatement")
                || list.contains("switchBlock")
                || list.contains("switchBlockStatementGroup")
                || list.contains("switchLabels")
                || list.contains("switchLabel")) {
            mainList.add(LanguageConstructsTypes.PACKAGE_DECLARATION);
        } else if (list.contains("interfaceDeclaration")
                || list.contains("normalInterfaceDeclaration")) {
            mainList.add(LanguageConstructsTypes.INTERFACE_DECLARATION);
        } else if (list.contains("synchronizedStatement")) {
            mainList.add(LanguageConstructsTypes.INTERFACE_DECLARATION);
        } else if (list.contains("annotationTypeDeclaration")
                || list.contains("annotationTypeMemberDeclaration")
                || list.contains("annotationTypeElementDeclaration")) {
            mainList.add(LanguageConstructsTypes.ANNOTATION_TYPE_MEMBER_DECLARATION);
        } else if (list.contains("annotation")
                || list.contains("normalAnnotation")
                || list.contains("markerAnnotation")
                || list.contains("singleElementAnnotation")
                || list.contains("annotationTypeBody")) {
            mainList.add(LanguageConstructsTypes.ANNOTATION);
        } else if (list.contains("assertStatement")) {
            mainList.add(LanguageConstructsTypes.ASSERT_STATEMENT);
        } else if (list.contains("typeVariable")
                || list.contains("variableDeclaratorList")
                || list.contains("variableDeclarator")
                || list.contains("variableDeclaratorId")
                || list.contains("variableInitializer")
                || list.contains("unannTypeVariable")
                || list.contains("variableModifier")
                || list.contains("variableInitializerList")
                || list.contains("localVariableDeclarationStatement")
                || list.contains("localVariableDeclaration")
                || list.contains("variableAccess")) {
            mainList.add(LanguageConstructsTypes.VARIABLE);
        } else if (list.get(0).getWarning()) {
            mainList.add(LanguageConstructsTypes.ERROR);
        } else {
            mainList.add(LanguageConstructsTypes.OTHER);
        }

        return mainList;
    }

}


/*
arrayType
unannArrayType
elementValueArrayInitializer
arrayInitializer
primaryNoNewArray
primaryNoNewArray_lf_arrayAccess
João P. C. Lima19:41
primaryNoNewArray_lfno_arrayAccess
primaryNoNewArray_lf_primary
primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
primaryNoNewArray_lfno_primary
primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
arrayAccess
arrayAccess_lf_primary
arrayAccess_lfno_primary
arrayCreationExpression
annotationTypeElementModifier
 */
