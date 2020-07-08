/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import java.util.ArrayList;
import java.util.List;
import br.ufjf.dcc.gmr.core.vcs.types.JavaLanguageConstructsTypes;
import br.ufjf.dcc.gmr.core.vcs.types.CPPLanguageConstructsTypes;

/**
 *
 * @author luan
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
                mainList.add(JavaLanguageConstructsTypes.ANNOTATION_TYPE_MEMBER_DECLARATION);
                list.remove("AnnotationTypeDeclaration");
                list.remove("AnnotationTypeMemberDeclaration");
                list.remove("AnnotationTypeElementDeclaration");
            }
            if (list.contains("Annotation")
                    || list.contains("NormalAnnotation")
                    || list.contains("MarkerAnnotation")
                    || list.contains("SingleElementAnnotation")
                    || list.contains("AnnotationTypeBody")) {
                mainList.add(JavaLanguageConstructsTypes.ANNOTATION);
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
                mainList.add(JavaLanguageConstructsTypes.ARRAY_INITIALIZER);
                list.remove("ArrayInitializer");
            }
            if (list.contains("ArrayAccess")
                    || list.contains("arrayAccess_lf_primary")
                    || list.contains("arrayAccess_lfno_primary")) {
                mainList.add(JavaLanguageConstructsTypes.ARRAY_ACCESS);
                list.remove("ArrayAccess");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSERT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("AssertStatement")) {
                mainList.add(JavaLanguageConstructsTypes.ASSERT_STATEMENT);
                list.remove("AssertStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSIGNMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Assignment")
                    || list.contains("AssignmentExpression")) {
                mainList.add(JavaLanguageConstructsTypes.ASSIGNMENT);
                list.remove("Assignment");
                list.remove("AssignmentExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BLANK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Nothing")) {
                mainList.add(JavaLanguageConstructsTypes.BLANK);
                list.remove("Nothing");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BREAK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("BreakStatement")) {
                mainList.add(JavaLanguageConstructsTypes.BREAK_STATEMENT);
                list.remove("BreakStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CASE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("CaseLine")) {
                mainList.add(JavaLanguageConstructsTypes.CASE_STATEMENT);
                list.remove("CaseLine");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CAST++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("CastExpression")) {
                mainList.add(JavaLanguageConstructsTypes.CAST_EXPRESSION);
                list.remove("CastExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Catches")
                    || list.contains("CatchClause")
                    || list.contains("CatchFormalParameter")
                    || list.contains("CatchType")
                    || list.contains("CatchExpression")) {
                mainList.add(JavaLanguageConstructsTypes.CATCH_CLAUSE);
                list.remove("Catches");
                list.remove("CatchClause");
                list.remove("CatchFormalParameter");
                list.remove("CatchType");
                list.remove("CatchExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("NormalClassDeclaration")) {
                mainList.add(JavaLanguageConstructsTypes.CLASS_DECLARATION);
                list.remove("NormalClassDeclaration");
            }
            if (list.contains("NormalClassSignature")) {
                mainList.add(JavaLanguageConstructsTypes.CLASS_SIGNATURE);
                list.remove("NormalClassSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("MultiLineComment")
                    || list.contains("LineComment")) {
                mainList.add(JavaLanguageConstructsTypes.COMMENT);
                list.remove("MultiLineComment");
                list.remove("LineComment");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CONTINUE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ContinueStatement")) {
                mainList.add(JavaLanguageConstructsTypes.CONTINUE_STATEMENT);
                list.remove("ContinueStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("DoStatement")) {
                mainList.add(JavaLanguageConstructsTypes.DO_STATEMENT);
                list.remove("DoStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ENUMS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("EnumDeclaration")) {
                mainList.add(JavaLanguageConstructsTypes.ENUM_DECLARATION);
                list.remove("EnumDeclaration");
            }
            if (list.contains("EnumSignature")) {
                mainList.add(JavaLanguageConstructsTypes.ENUM_SIGNATURE);
                list.remove("EnumSignature");
            }
            if (list.contains("EnumConstantList")) {
                mainList.add(JavaLanguageConstructsTypes.ENUM_VALUE);
                list.remove("EnumConstantList");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("FieldAccess")
                    || list.contains("FieldAccess_lf_primary")
                    || list.contains("FieldAccess_lfno_primary")
                    || list.contains("FieldDeclaration")
                    || list.contains("FieldModifier")) {
                mainList.add(JavaLanguageConstructsTypes.FIELD);
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
                mainList.add(JavaLanguageConstructsTypes.FOR_STATEMENT);
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
                mainList.add(JavaLanguageConstructsTypes.IF_STATEMENT);
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
                mainList.add(JavaLanguageConstructsTypes.IMPORT_DECLARATION);
                list.remove("ImportDeclaration");
                list.remove("SingleTypeImportDeclaration");
                list.remove("TypeImportOnDemandDeclaration");
                list.remove("SingleStaticImportDeclaration");
                list.remove("StaticImportOnDemandDeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("NormalInterfaceDeclaration")) {
                mainList.add(JavaLanguageConstructsTypes.INTERFACE_DECLARATION);
                list.remove("NormalInterfaceDeclaration");
            } else if (list.contains("NormalInterfaceSignature")) {
                mainList.add(JavaLanguageConstructsTypes.INTERFACE_SIGNATURE);
                list.remove("NormalInterfaceSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("MethodDeclaration")) {
                mainList.add(JavaLanguageConstructsTypes.METHOD_DECLARATION);
                list.remove("MethodDeclaration");
            }
            if (list.contains("MethodSignature")) {
                mainList.add(JavaLanguageConstructsTypes.METHOD_SIGNATURE);
                list.remove("MethodSignature");
            }
            if (list.contains("InterfaceMethodDeclaration")
                    || list.contains("InterfaceMethodModifier")) {
                mainList.add(JavaLanguageConstructsTypes.METHOD_INTERFACE);
                list.remove("InterfaceMethodDeclaration");
                list.remove("InterfaceMethodModifier");
            }
            if (list.contains("MethodInvocation")
                    || list.contains("MethodInvocation_lf_primaryContext")) {
                mainList.add(JavaLanguageConstructsTypes.METHOD_INVOCATION);
                list.remove("MethodInvocation");
                list.remove("MethodInvocation_lf_primaryContext");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("PackageDeclaration")
                    || list.contains("PackageName")
                    || list.contains("PackageOrTypeName")) {
                mainList.add(JavaLanguageConstructsTypes.PACKAGE_DECLARATION);
                list.remove("PackageDeclaration");
                list.remove("PackageName");
                list.remove("PackageOrTypeName");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ReturnStatement")) {
                mainList.add(JavaLanguageConstructsTypes.RETURN_STATEMENT);
                list.remove("ReturnStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("StaticInitializer")) {
                mainList.add(JavaLanguageConstructsTypes.STATIC_INITIALIZER);
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
                mainList.add(JavaLanguageConstructsTypes.SWITCH_STATEMENT);
                list.remove("SwitchStatement");
                list.remove("SwitchBlock");
                list.remove("SwitchBlockStatementGroup");
                list.remove("SwitchLabels");
                list.remove("SwitchLabel");
                list.remove("SwitchExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //synchronizedStatement+++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SynchronizedStatement")) {
                mainList.add(JavaLanguageConstructsTypes.SYNCHRONIZED_STATEMENT);
                list.remove("SynchronizedStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //THROW+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ThrowStatement")) {
                mainList.add(JavaLanguageConstructsTypes.THROW_STATEMENT);
                list.remove("ThrowStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("TryStatement")
                    || list.contains("TryWithResourcesStatement")) {
                mainList.add(JavaLanguageConstructsTypes.TRY_STATEMENT);
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
                mainList.add(JavaLanguageConstructsTypes.VARIABLE);
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
                mainList.add(JavaLanguageConstructsTypes.WHILE_STATEMENT);
                list.remove("WhileStatement");
                list.remove("WhileStatementNoShortIf");
                list.remove("WhileExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WARNING+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WARNING!")) {
                mainList.add(JavaLanguageConstructsTypes.ERROR);
                list.remove("WARNING!");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (!list.isEmpty()) {
                mainList.add(JavaLanguageConstructsTypes.OTHER);
            }
        }
        return mainList;
    }

    public static List<String> PythonTranslator(List<String> list) {

        List<String> mainList = new ArrayList<>();

        return mainList;
    }

    public static List<String> CPPTranslator(List<String> list) {

        List<String> mainList = new ArrayList<>();
        if (list.contains("Extension not parseble!")) {
            mainList.add("Extension not parseble!");
        } else {
            //ASSIGNMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if ( list.contains("Assignmentexpression")) {
                mainList.add(CPPLanguageConstructsTypes.ASSIGNMENT);
                list.remove("Assignmentexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BLANK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Nothing")) {
                mainList.add(CPPLanguageConstructsTypes.BLANK);
                list.remove("Nothing");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BREAK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CASE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
           
             //CAST+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Castexpression")) {
                mainList.add(CPPLanguageConstructsTypes.CAST_EXPRESSION);
                list.remove("Castexpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Classspecifier")) {
                mainList.add(JavaLanguageConstructsTypes.CLASS_DECLARATION);
                list.remove("Classspecifier");
            }
            if (list.contains("Classhead")) {
                mainList.add(JavaLanguageConstructsTypes.CLASS_SIGNATURE);
                list.remove("Classhead");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CONTINUE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ENUM++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
             
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FOR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Forinitstatement")
                    || list.contains("Forrangedeclaration")) {
                mainList.add(CPPLanguageConstructsTypes.FOR_STATEMENT);
                list.remove("Forinitstatement");
                list.remove("Forrangedeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IF++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
          
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IMPORT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHOD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SWITCH++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SynchronizedStatement+++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRHOW++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //VARIABLE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
           
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WHILE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("While")) {
                mainList.add(CPPLanguageConstructsTypes.WHILE_STATEMENT);
                list.remove("While");
            }
            //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WARNING+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WARNING!")) {
                mainList.add(JavaLanguageConstructsTypes.ERROR);
                list.remove("WARNING!");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (!list.isEmpty()) {
                mainList.add(JavaLanguageConstructsTypes.OTHER);
            }
        }
        return mainList;
    }
    

}
