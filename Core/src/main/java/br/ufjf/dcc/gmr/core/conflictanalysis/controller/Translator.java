/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import java.util.ArrayList;
import java.util.List;
import br.ufjf.dcc.gmr.core.vcs.types.LanguageConstructsTypes;

/**
 *
 * @author Luan
 */
public class Translator {

    public Translator() {

    }

    public static List<String> JavaTranslator(List<String> list) {
        List<String> mainList = new ArrayList<>();
        if (list.contains("Extension not parseble!")) {
            mainList.add("Extension not parseble!");
        } else {
            //ANNOTATION++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ARRAY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSERT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("AssertStatement")) {
                mainList.add(LanguageConstructsTypes.ASSERT_STATEMENT);
                list.remove("AssertStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSIGNMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Assignment")
                    || list.contains("AssignmentExpression")) {
                mainList.add(LanguageConstructsTypes.ASSIGNMENT);
                list.remove("Assignment");
                list.remove("AssignmentExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BLANK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Nothing")) {
                mainList.add(LanguageConstructsTypes.BLANK);
                list.remove("Nothing");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BREAK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("BreakStatement")) {
                mainList.add(LanguageConstructsTypes.BREAK_STATEMENT);
                list.remove("BreakStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CASE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("CaseLine")) {
                mainList.add(LanguageConstructsTypes.CASE_STATEMENT);
                list.remove("CaseLine");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CAST++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("CastExpression")) {
                mainList.add(LanguageConstructsTypes.CAST_EXPRESSION);
                list.remove("CastExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Catches")
                    || list.contains("CatchClause")
                    || list.contains("CatchFormalParameter")
                    || list.contains("CatchType")
                    || list.contains("CatchExpression")) {
                mainList.add(LanguageConstructsTypes.CATCH_CLAUSE);
                list.remove("Catches");
                list.remove("CatchClause");
                list.remove("CatchFormalParameter");
                list.remove("CatchType");
                list.remove("CatchExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("NormalClassDeclaration")) {
                mainList.add(LanguageConstructsTypes.CLASS_DECLARATION);
                list.remove("NormalClassDeclaration");
            }
            if (list.contains("NormalClassSignature")) {
                mainList.add(LanguageConstructsTypes.CLASS_SIGNATURE);
                list.remove("NormalClassSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("MultiLineComment")
                    || list.contains("LineComment")) {
                mainList.add(LanguageConstructsTypes.COMMENT);
                list.remove("MultiLineComment");
                list.remove("LineComment");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CONTINUE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ContinueStatement")) {
                mainList.add(LanguageConstructsTypes.CONTINUE_STATEMENT);
                list.remove("ContinueStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("DoStatement")) {
                mainList.add(LanguageConstructsTypes.DO_STATEMENT);
                list.remove("DoStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ENUMS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("EnumDeclaration")) {
                mainList.add(LanguageConstructsTypes.ENUM_DECLARATION);
                list.remove("EnumDeclaration");
            }
            if (list.contains("EnumSignature")) {
                mainList.add(LanguageConstructsTypes.ENUM_SIGNATURE);
                list.remove("EnumSignature");
            }
            if (list.contains("EnumConstantList")) {
                mainList.add(LanguageConstructsTypes.ENUM_VALUE);
                list.remove("EnumConstantList");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FOR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ForStatement")
                    || list.contains("ForStatementNoShortIf")
                    || list.contains("BasicForStatement")
                    || list.contains("BasicForStatementNoShortIf")
                    || list.contains("EnhancedForStatement")
                    || list.contains("EnhancedForStatementNoShortIf")
                    || list.contains("BasicForExpression")
                    || list.contains("EnhancedForExpression")) {
                mainList.add(LanguageConstructsTypes.FOR_STATEMENT);
                list.remove("ForStatement");
                list.remove("ForStatementNoShortIf");
                list.remove("BasicForStatement");
                list.remove("BasicForStatementNoShortIf");
                list.remove("EnhancedForStatement");
                list.remove("EnhancedForStatementNoShortIf");
                list.remove("BasicForExpression");
                list.remove("EnhancedForExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IF++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("IfThenElseStatement")
                    || list.contains("IfThenStatement")
                    || list.contains("IfThenElseStatementNoShortIf")
                    || list.contains("IfExpression")) {
                mainList.add(LanguageConstructsTypes.IF_STATEMENT);
                list.remove("IfThenElseStatement");
                list.remove("IfThenStatement");
                list.remove("IfThenElseStatementNoShortIf");
                list.remove("IfExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IMPORT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("NormalInterfaceDeclaration")) {
                mainList.add(LanguageConstructsTypes.INTERFACE_DECLARATION);
                list.remove("NormalInterfaceDeclaration");
            } else if (list.contains("NormalInterfaceSignature")) {
                mainList.add(LanguageConstructsTypes.INTERFACE_SIGNATURE);
                list.remove("NormalInterfaceSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("MethodDeclaration")) {
                mainList.add(LanguageConstructsTypes.METHOD_DECLARATION);
                list.remove("MethodDeclaration");
            }
            if (list.contains("MethodSignature")) {
                mainList.add(LanguageConstructsTypes.METHOD_SIGNATURE);
                list.remove("MethodSignature");
            }
            if (list.contains("InterfaceMethodDeclaration")
                    || list.contains("InterfaceMethodModifier")) {
                mainList.add(LanguageConstructsTypes.METHOD_INTERFACE);
                list.remove("InterfaceMethodDeclaration");
                list.remove("InterfaceMethodModifier");
            }
            if (list.contains("MethodInvocation")
                    || list.contains("MethodInvocation_lf_primaryContext")) {
                mainList.add(LanguageConstructsTypes.METHOD_INVOCATION);
                list.remove("MethodInvocation");
                list.remove("MethodInvocation_lf_primaryContext");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("PackageDeclaration")
                    || list.contains("PackageName")
                    || list.contains("PackageOrTypeName")) {
                mainList.add(LanguageConstructsTypes.PACKAGE_DECLARATION);
                list.remove("PackageDeclaration");
                list.remove("PackageName");
                list.remove("PackageOrTypeName");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ReturnStatement")) {
                mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
                list.remove("ReturnStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("StaticInitializer")) {
                mainList.add(LanguageConstructsTypes.STATIC_INITIALIZER);
                list.remove("StaticInitializer");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SWITCH++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SwitchStatement")
                    || list.contains("SwitchBlock")
                    || list.contains("SwitchBlockStatementGroup")
                    || list.contains("SwitchLabels")
                    || list.contains("SwitchLabel")
                    || list.contains("SwitchExpression")) {
                mainList.add(LanguageConstructsTypes.SWITCH_STATEMENT);
                list.remove("SwitchStatement");
                list.remove("SwitchBlock");
                list.remove("SwitchBlockStatementGroup");
                list.remove("SwitchLabels");
                list.remove("SwitchLabel");
                list.remove("SwitchExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SYNCHRONIZED_STATEMENT+++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SynchronizedStatement")) {
                mainList.add(LanguageConstructsTypes.SYNCHRONIZED_STATEMENT);
                list.remove("SynchronizedStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //THROW+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ThrowStatement")) {
                mainList.add(LanguageConstructsTypes.THROW_STATEMENT);
                list.remove("ThrowStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("TryStatement")
                    || list.contains("TryWithResourcesStatement")) {
                mainList.add(LanguageConstructsTypes.TRY_STATEMENT);
                list.remove("TryStatement");
                list.remove("TryWithResourcesStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //VARIABLES+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WHILE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WhileStatement")
                    || list.contains("WhileStatementNoShortIf")
                    || list.contains("WhileExpression")) {
                mainList.add(LanguageConstructsTypes.WHILE_STATEMENT);
                list.remove("WhileStatement");
                list.remove("WhileStatementNoShortIf");
                list.remove("WhileExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WARNING+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WARNING!")) {
                mainList.add(LanguageConstructsTypes.ERROR);
                list.remove("WARNING!");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (!list.isEmpty()) {
                mainList.add(LanguageConstructsTypes.OTHER);
            }
        }
        return mainList;
    }

    public static List<String> CPPTranslator(List<String> list) {

        List<String> mainList = new ArrayList<>();
        if (list.contains("Extension not parseble!")) {
            mainList.add("Extension not parseble!");
        } else {
            //ANNOTATION++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            // Não existe em c++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ARRAY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Arraydeclaration")) {
                mainList.add(LanguageConstructsTypes.ARRAY_INITIALIZER);
                list.remove("Arraydeclaration");
            }
            if (list.contains("Arrayaccess")) {
                mainList.add(LanguageConstructsTypes.ARRAY_ACCESS);
                list.remove("Arrayaccess");
            }
            // Ainda revisando
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSERT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            // Ainda revisando
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSIGNMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Realassignmentexpression")) {
                mainList.add(LanguageConstructsTypes.ASSIGNMENT);
                list.remove("Realassignmentexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BLANK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Nothing")) {
                mainList.add(LanguageConstructsTypes.BLANK);
                list.remove("Nothing");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BREAK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Breakstatement")) {
                mainList.add(LanguageConstructsTypes.BREAK_STATEMENT);
                list.remove("Breakstatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CASE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Caseexpression")) {
                mainList.add(LanguageConstructsTypes.CASE_STATEMENT);
                list.remove("Caseexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CAST+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Realcastexpression")) {
                mainList.add(LanguageConstructsTypes.CAST_EXPRESSION);
                list.remove("Realcastexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Catchexpression")) {
                mainList.add(LanguageConstructsTypes.CATCH_CLAUSE);
                list.remove("Catchexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Classspecifier")) {
                mainList.add(LanguageConstructsTypes.CLASS_DECLARATION);
                list.remove("Classspecifier");
            }
            if (list.contains("Classhead")) {
                mainList.add(LanguageConstructsTypes.CLASS_SIGNATURE);
                list.remove("Classhead");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("BlockComment")
                    || list.contains("LineComment")) {
                mainList.add(LanguageConstructsTypes.COMMENT);
                list.remove("BlockComment");
                list.remove("LineComment");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CONTINUE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Continuestatement")) {
                mainList.add(LanguageConstructsTypes.CONTINUE_STATEMENT);
                list.remove("Continuestatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Dostatement")) {
                mainList.add(LanguageConstructsTypes.DO_STATEMENT);
                list.remove("Dostatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ENUM++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (list.contains("Enumhead")) {
                mainList.add(LanguageConstructsTypes.ENUM_SIGNATURE);
                list.remove("Enumhead");
            }
            if (list.contains("Enumspecifier")) {
                mainList.add(LanguageConstructsTypes.ENUM_DECLARATION);
                list.remove("Enumspecifier");
            }
            if (list.contains("Enumeratordefinition")) {
                mainList.add(LanguageConstructsTypes.ENUM_VALUE);
                list.remove("Enumeratordefinition");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Memberspecification")
                    || list.contains("Memberdeclaration")) {
                mainList.add(LanguageConstructsTypes.FIELD);
                list.remove("Memberspecification");
                list.remove("Memberdeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FOR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Basicforexpression")
                    || list.contains("Enhancedforexpression")) {
                mainList.add(LanguageConstructsTypes.FOR_STATEMENT);
                list.remove("Basicforexpression");
                list.remove("Enhancedforexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IF++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Ifexpression")) {
                mainList.add(LanguageConstructsTypes.IF_STATEMENT);
                list.remove("Ifexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IMPORT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Includedeclaration")) {
                mainList.add(LanguageConstructsTypes.IMPORT_DECLARATION);
                list.remove("Includedeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Não tem em c++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHOD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Functiondefinition")
                    || list.contains("Pseudodestructdeclaration")) {
                mainList.add(LanguageConstructsTypes.METHOD_DECLARATION);
                list.remove("Functiondefinition");
                list.remove("Pseudodestructdeclaration");
            }
            if (list.contains("Functioninvocation")
                    || list.contains("Pseudodestructcaller")) {
                mainList.add(LanguageConstructsTypes.METHOD_INVOCATION);
                list.remove("Functioninvocation");
                list.remove("Pseudodestructcaller");
            }
            if (list.contains("Functionhead")) {
                mainList.add(LanguageConstructsTypes.METHOD_SIGNATURE);
                list.remove("Functionhead");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Não tem em c++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //POINTER+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //A fazer
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Returnstatement")) {
                mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
                list.remove("Returnstatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            // Não tem
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SWITCH++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Switchexpression")) {
                mainList.add(LanguageConstructsTypes.SWITCH_STATEMENT);
                list.remove("Switchexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SynchronizedStatement+++++++++++++++++++++++++++++++++++++++++++++
            //Ainda revisando
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //THROW++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Throwexpression")) {
                mainList.add(LanguageConstructsTypes.THROW_STATEMENT);
                list.remove("Throwexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Tryblockexpression")
                    || list.contains("Functiontryblockexpression")) {
                mainList.add(LanguageConstructsTypes.TRY_STATEMENT);
                list.remove("Tryblockexpression");
                list.remove("Functiontryblockexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //VARIABLE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Variabledeclaration")) {
                mainList.add(LanguageConstructsTypes.VARIABLE);
                list.remove("Variabledeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WHILE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Whileexpression")) {
                mainList.add(LanguageConstructsTypes.WHILE_STATEMENT);
                list.remove("Whileexpression");
            }
            //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WARNING+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WARNING!")) {
                mainList.add(LanguageConstructsTypes.ERROR);
                list.remove("WARNING!");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (!list.isEmpty()) {
                mainList.add(LanguageConstructsTypes.OTHER);
            }
        }
        return mainList;
    }

    public static List<String> PythonTranslator(List<String> list) {

        List<String> mainList = new ArrayList<>();

        return mainList;
    }

}
