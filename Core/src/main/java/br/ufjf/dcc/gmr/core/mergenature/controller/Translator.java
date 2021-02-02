package br.ufjf.dcc.gmr.core.mergenature.controller;

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
            //Finally+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Finally_")) {
                mainList.add(LanguageConstructsTypes.FINALLY);
                list.remove("Finally_");
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
            if (list.contains("PackageDeclaration")) {
                mainList.add(LanguageConstructsTypes.PACKAGE_DECLARATION);
                list.remove("PackageDeclaration");

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
            //DELET+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Deleteexpression")) {
                mainList.add(LanguageConstructsTypes.DO_STATEMENT);
                list.remove("Deleteexpression");
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
            //NAMESPACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Namespacesignature")
                    || list.contains("Namespacealiasdefinition")
                    || list.contains("Usingdirective")) {
                mainList.add(LanguageConstructsTypes.NAMESPACE);
                list.remove("Namespacesignature");
                list.remove("Namespacealiasdefinition");
                list.remove("Usingdirective");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Não tem em c++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //POINTER+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Pointerdeclaration")) {
                mainList.add(LanguageConstructsTypes.POINTER);
                list.remove("Pointerdeclaration");
            }
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

    public static List<String> PythonTranslator(List<String> list) {

        List<String> mainList = new ArrayList<>();

        if (list.contains("Extension not parseble!")) {
            mainList.add("Extension not parseble!");
        } else {
            //ANNOTATION++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //There is no ANNOTATION on python
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ARRAY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Array")) {
                mainList.add(LanguageConstructsTypes.ARRAY_INITIALIZER);
                list.remove("Array");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSERT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("assert_")
                    || list.contains("assert_stmt")) {
                mainList.add(LanguageConstructsTypes.ASSIGNMENT);
                list.remove("assert_");
                list.remove("assert_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSIGNMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Assignment")) {
                mainList.add(LanguageConstructsTypes.ASSIGNMENT);
                list.remove("Assignment");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BLANK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Nothing")) {
                mainList.add(LanguageConstructsTypes.BLANK);
                list.remove("Nothing");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BREAK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Break_stmt")) {
                mainList.add(LanguageConstructsTypes.BREAK_STATEMENT);
                list.remove("Break_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CASE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //There is no switch on Python
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CAST++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                 if (list.contains("Cast")) {
                mainList.add(LanguageConstructsTypes.CAST_EXPRESSION);
                list.remove("Cast");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Except_clause")) {
                mainList.add(LanguageConstructsTypes.CATCH_CLAUSE);
                list.remove("Except_clause");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Classdef")) {
                mainList.add(LanguageConstructsTypes.CLASS_DECLARATION);
                list.remove("Classdef");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
              if ( list.contains("LineComment")) {
                mainList.add(LanguageConstructsTypes.COMMENT);
                list.remove("LineComment");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CONTINUE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Continue_stmt")) {
                mainList.add(LanguageConstructsTypes.CONTINUE_STATEMENT);
                list.remove("Continue_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //There is no do on python
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DELET+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Del_stmt")) {
                mainList.add(LanguageConstructsTypes.DELETE_STATEMENT);
                list.remove("Del_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ENUM++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Enum")) {
                mainList.add(LanguageConstructsTypes.DELETE_STATEMENT);
                list.remove("Enum");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            ////There is no field on python grammar
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FINALLY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Finally_clause")) {
                mainList.add(LanguageConstructsTypes.FINALLY);
                list.remove("Finally_clause");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FOR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("For_stmt")
                    || list.contains("For_")) {
                mainList.add(LanguageConstructsTypes.FOR_STATEMENT);
                list.remove("For_stmt");
                list.remove("For_");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IF++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("If_stmt")
                    || list.contains("If_")) {
                mainList.add(LanguageConstructsTypes.IF_STATEMENT);
                list.remove("If_stmt");
                list.remove("If_");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IMPORT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Import_stmt")
                    || list.contains("Import_name")
                    || list.contains("Import_from")
                    || list.contains("Import_as_name")
                    || list.contains("Import_as_names")
                    || list.contains("Dotted_as_name")
                    || list.contains("Dotted_name")) {
                mainList.add(LanguageConstructsTypes.IMPORT_DECLARATION);
                list.remove("Import_stmt");
                list.remove("Import_name");
                list.remove("Import_from");
                list.remove("Import_as_name");
                list.remove("Import_as_names");
                list.remove("Dotted_as_name");
                list.remove("Dotted_name");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Python doesn't have interface because of the included multiple inheritance
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Funcdef")) {
                mainList.add(LanguageConstructsTypes.METHOD_DECLARATION);
                list.remove("Funcdef");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //There is no package on pythons
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //objects initialized insides classes are considered statics!
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SWITCH++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //There is no switch on Python
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Synchronized Statement++++++++++++++++++++++++++++++++++++++++++++
            //There is no Synchronized Statement on Python
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //THROW+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Raise_stmt")) {
                mainList.add(LanguageConstructsTypes.THROW_STATEMENT);
                list.remove("Raise_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Try_stmt")) {
                mainList.add(LanguageConstructsTypes.TRY_STATEMENT);
                list.remove("Try_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Return_stmt")) {
                mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
                list.remove("Return_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //VARIABLE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WARNING+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WARNING!")) {
                mainList.add(LanguageConstructsTypes.ERROR);
                list.remove("WARNING!");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WHILE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("While_stmt")
                    || list.contains("While_")) {
                mainList.add(LanguageConstructsTypes.WHILE_STATEMENT);
                list.remove("While_stmt");
                list.remove("While_");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //YELD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Yield_stmt")) {
                mainList.add(LanguageConstructsTypes.YELD_STATEMENT);
                list.remove("Yield_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (!list.isEmpty()) {
                mainList.add(LanguageConstructsTypes.OTHER);
            }
        }

        return mainList;
    }
    
     public static List<String> CSharpTranslator(List<String> list) {
        List<String> mainList = new ArrayList<>();
        if (list.contains("Extension not parseble!")) {
            mainList.add("Extension not parseble!");
        } else {
            //ANNOTATION++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.ANNOTATION_TYPE_MEMBER_DECLARATION);
                list.remove("");
                list.remove("");
                list.remove("");
            }
            if (list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.ANNOTATION);
                list.remove("");
                list.remove("");
                list.remove("");
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ARRAY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Array_initializer")
                    ) {
                mainList.add(LanguageConstructsTypes.ARRAY_INITIALIZER);
                list.remove("Array_initializer");
            }
            if (list.contains("")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.ARRAY_ACCESS);
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSERT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.ASSERT_STATEMENT);
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSIGNMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.ASSIGNMENT);
                list.remove("");
                list.remove("");
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
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.CASE_STATEMENT);
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CAST++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.CAST_EXPRESSION);
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.CATCH_CLAUSE);
                list.remove("");
                list.remove("");
                list.remove("");
                list.remove("");
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.CLASS_DECLARATION);
                list.remove("");
            }
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.CLASS_SIGNATURE);
                list.remove("");
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
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.ENUM_DECLARATION);
                list.remove("");
            }
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.ENUM_SIGNATURE);
                list.remove("");
            }
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.ENUM_VALUE);
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.FIELD);
                list.remove("");
                list.remove("");
                list.remove("");
                list.remove("");
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Finally+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Finally_clause")) {
                mainList.add(LanguageConstructsTypes.FINALLY);
                list.remove("Finally_clause");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FOR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ForStatement")
                    || list.contains("ForeachStatement")
                  ) {
                mainList.add(LanguageConstructsTypes.FOR_STATEMENT);
                list.remove("ForStatement");
                list.remove("ForeachStatement");
      
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IF++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("IfStatement")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.IF_STATEMENT);
                list.remove("IfStatement");
                list.remove("");
                list.remove("");
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IMPORT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.IMPORT_DECLARATION);
                list.remove("");
                list.remove("");
                list.remove("");
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.INTERFACE_DECLARATION);
                list.remove("");
            } else if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.INTERFACE_SIGNATURE);
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.METHOD_DECLARATION);
                list.remove("");
            }
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.METHOD_SIGNATURE);
                list.remove("");
            }
            if (list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.METHOD_INTERFACE);
                list.remove("");
                list.remove("");
            }
            if (list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.METHOD_INVOCATION);
                list.remove("");
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.PACKAGE_DECLARATION);
                list.remove("");

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ReturnStatement")) {
                mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
                list.remove("ReturnStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.STATIC_INITIALIZER);
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SWITCH++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SwitchStatement")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.SWITCH_STATEMENT);
                list.remove("SwitchStatement");
                list.remove("");
                list.remove("");
                list.remove("");
                list.remove("");
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SYNCHRONIZED_STATEMENT+++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")) {
                mainList.add(LanguageConstructsTypes.SYNCHRONIZED_STATEMENT);
                list.remove("");
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
                    ) {
                mainList.add(LanguageConstructsTypes.TRY_STATEMENT);
                list.remove("TryStatement");
             
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //VARIABLES+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.VARIABLE);
                list.remove("");
               
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WHILE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WhileStatement")
                    || list.contains("")
                    || list.contains("")) {
                mainList.add(LanguageConstructsTypes.WHILE_STATEMENT);
                list.remove("WhileStatement");
                list.remove("");
                list.remove("");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WARNING+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WARNING!")) {
                mainList.add(LanguageConstructsTypes.ERROR);
                list.remove("WARNING!");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //YELD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("YieldStatement")) {
                mainList.add(LanguageConstructsTypes.YELD_STATEMENT);
                list.remove("YieldStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (!list.isEmpty()) {
                mainList.add(LanguageConstructsTypes.OTHER);
            }
        }
        return mainList;
    }

}
