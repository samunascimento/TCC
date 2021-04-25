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
                    || list.contains("AnnotationTypeElementDeclaration")) {
                mainList.add(LanguageConstructsTypes.ANNOTATION_TYPE_MEMBER_DECLARATION);
                list.remove("AnnotationTypeDeclaration");
                list.remove("AnnotationTypeElementDeclaration");
            }
            if (list.contains("Annotation")) {
                mainList.add(LanguageConstructsTypes.ANNOTATION);
                list.remove("Annotation");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ARRAY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ArrayInitializer")
                    || list.contains("ElementValueArrayInitializer")
                    || list.contains("ArrayCreationExpression")) {
                mainList.add(LanguageConstructsTypes.ARRAY_INITIALIZER);
                list.remove("ArrayInitializer");
                list.remove("ElementValueArrayInitializer");
                list.remove("ArrayCreationExpression");

            }
            if (list.contains("ArrayAccess")
                    || list.contains("ArrayAccess_lf_primary")
                    || list.contains("ArrayAccess_lfno_primary")) {
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
            if (list.contains("CatchClause")
                    || list.contains("CatchExpression")) {
                mainList.add(LanguageConstructsTypes.CATCH_CLAUSE);
                list.remove("CatchClause");
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
            //COMMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
            if (list.contains("EnumConstant")) {
                mainList.add(LanguageConstructsTypes.ENUM_VALUE);
                list.remove("EnumConstant");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("FieldAccess")
                    || list.contains("FieldDeclaration")) {
                mainList.add(LanguageConstructsTypes.FIELD);
                list.remove("FieldAccess");
                list.remove("FieldDeclaration");
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
            if (list.contains("ImportDeclaration")) {
                mainList.add(LanguageConstructsTypes.IMPORT_DECLARATION);
                list.remove("ImportDeclaration");
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
            if (list.contains("MethodDeclaration")
                    || list.contains("ConstructorDeclaration")) {
                mainList.add(LanguageConstructsTypes.METHOD_DECLARATION);
                list.remove("MethodDeclaration");
                list.remove("ConstructorDeclaration");
            }
            if (list.contains("MethodSignature")
                    || list.contains("ConstructorDeclarator")) {
                mainList.add(LanguageConstructsTypes.METHOD_SIGNATURE);
                list.remove("MethodSignature");
                list.remove("ConstructorDeclarator");
            }
            if (list.contains("InterfaceMethodDeclaration")) {
                mainList.add(LanguageConstructsTypes.METHOD_INTERFACE);
                list.remove("InterfaceMethodDeclaration");
            }
            if (list.contains("MethodInvocation")
                    || list.contains("MethodInvocation_lf_primaryContext")
                    || list.contains("MethodInvocation_lfno_primary")) {
                mainList.add(LanguageConstructsTypes.METHOD_INVOCATION);
                list.remove("MethodInvocation");
                list.remove("MethodInvocation_lf_primaryContext");
                list.remove("MethodInvocation_lfno_primary");
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
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("StaticInitializer")) {
                mainList.add(LanguageConstructsTypes.STATIC_INITIALIZER);
                list.remove("StaticInitializer");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STRUCT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SWITCH++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SwitchStatement")
                    || list.contains("SwitchExpression")) {
                mainList.add(LanguageConstructsTypes.SWITCH_STATEMENT);
                list.remove("SwitchStatement");
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
            if (list.contains("VariableDeclarator")
                    || list.contains("VariableAccess")
                    || list.contains("LocalVariableDeclaration")) {
                mainList.add(LanguageConstructsTypes.VARIABLE);
                list.remove("VariableAccess");
                list.remove("VariableDeclarator");
                list.remove("LocalVariableDeclaration");
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
            if (list.contains("Static_assertdeclaration")) {
                mainList.add(LanguageConstructsTypes.ARRAY_INITIALIZER);
                list.remove("Static_assertdeclaration");
            }
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
            //COMMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
            if (list.contains("Memberspecificator")) {
                mainList.add(LanguageConstructsTypes.FIELD);
                list.remove("Memberspecification");
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
                    || list.contains("Usingdirective")
                    || list.contains("Usingdeclaration")) {
                mainList.add(LanguageConstructsTypes.NAMESPACE);
                list.remove("Namespacesignature");
                list.remove("Namespacealiasdefinition");
                list.remove("Usingdirective");
                list.remove("Usingdeclaration");
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
            //STRUCT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Struct")) {
                mainList.add(LanguageConstructsTypes.STRUCT);
                list.remove("Struct");
            }
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
            if (list.contains("Throwexpression")
                    || list.contains("Dynamicexceptionspecification")) {
                mainList.add(LanguageConstructsTypes.THROW_STATEMENT);
                list.remove("Throwexpression");
                list.remove("Dynamicexceptionspecification");
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
            if (list.contains("Assert_")
                    || list.contains("Assert_stmt")) {
                mainList.add(LanguageConstructsTypes.ASSIGNMENT);
                list.remove("Assert_");
                list.remove("Assert_stmt");
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
            if (list.contains("ClassSignature")) {
                mainList.add(LanguageConstructsTypes.CLASS_SIGNATURE);
                list.remove("ClassSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("LineComment")) {
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
                mainList.add(LanguageConstructsTypes.ENUM_DECLARATION);
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
            if (list.contains("FuncSignature")) {
                mainList.add(LanguageConstructsTypes.METHOD_SIGNATURE);
                list.remove("FuncSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //There is no package on pythons
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //objects initialized insides classes are considered statics!
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STRUCT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
            if (list.contains("Variable")) {
                mainList.add(LanguageConstructsTypes.VARIABLE);
                list.remove("Variable");
            }
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
                mainList.add(LanguageConstructsTypes.YIELD_STATEMENT);
                list.remove("Yield_stmt");
            }
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
            // There is no equivalent of Java annotation on the c# grammar, all the structures that had close structures have a much bigger scope
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ARRAY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Array_initializer")
                    || list.contains("Array")) {
                mainList.add(LanguageConstructsTypes.ARRAY_INITIALIZER);
                list.remove("Array_initializer");
                list.remove("Array");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSERT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Assert on c# does not work as an language structure
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
            if (list.contains("BreakStatement")) {
                mainList.add(LanguageConstructsTypes.BREAK_STATEMENT);
                list.remove("BreakStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CASE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Switch_label")
                    || list.contains("Switch_section")) {
                mainList.add(LanguageConstructsTypes.CASE_STATEMENT);
                list.remove("Switch_section");
                list.remove("Switch_label");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CAST++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Cast")) {
                mainList.add(LanguageConstructsTypes.CAST_EXPRESSION);
                list.remove("Cast");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Catch_clauses")
                    || list.contains("Specific_catch_clause")
                    || list.contains("General_catch_clause")
                    || list.contains("Specific_catch_clause_no_block")) {
                mainList.add(LanguageConstructsTypes.CATCH_CLAUSE);
                list.remove("Catch_clauses");
                list.remove("Specific_catch_clause");
                list.remove("General_catch_clause");
                list.remove("Specific_catch_clause_no_block");

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Class_definition")) {
                mainList.add(LanguageConstructsTypes.CLASS_DECLARATION);
                list.remove("Class_definition");
            }
            if (list.contains("Class_signature")) {
                mainList.add(LanguageConstructsTypes.CLASS_SIGNATURE);
                list.remove("Class_signature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SINGLE_LINE_DOC_COMMENT")
                    || list.contains("EMPTY_DELIMITED_DOC_COMMENT")
                    || list.contains("DELIMITED_DOC_COMMENT")
                    || list.contains("LineComment")
                    || list.contains("DELIMITED_COMMENT")) {
                mainList.add(LanguageConstructsTypes.COMMENT);
                list.remove("SINGLE_LINE_DOC_COMMENT");
                list.remove("EMPTY_DELIMITED_DOC_COMMENT");
                list.remove("DELIMITED_DOC_COMMENT");
                list.remove("LineComment");
                list.remove("DELIMITED_COMMENT");
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
            if (list.contains("Enum_definition")) {
                mainList.add(LanguageConstructsTypes.ENUM_DECLARATION);
                list.remove("Enum_definition");
            }
            if (list.contains("Enum_signature")) {
                mainList.add(LanguageConstructsTypes.ENUM_SIGNATURE);
                list.remove("Enum_signature");
            }
            if (list.contains("Enum_member_declaration")) {
                mainList.add(LanguageConstructsTypes.ENUM_VALUE);
                list.remove("Enum_member_declaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Field_declaration")) {
                mainList.add(LanguageConstructsTypes.FIELD);
                list.remove("Field_declaration");
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
                    || list.contains("Foreach_expression")
                    || list.contains("For_expression")) {
                mainList.add(LanguageConstructsTypes.FOR_STATEMENT);
                list.remove("ForStatement");
                list.remove("ForeachStatement");
                list.remove("Foreach_expression");
                list.remove("For_expression");

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IF++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("If_expression")
                    || list.contains("If_Statement")) {
                mainList.add(LanguageConstructsTypes.IF_STATEMENT);
                list.remove("If_expression");
                list.remove("If_Statement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IMPORT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            //on c# we're going to use the "using" structure because it is the closest to the other languagens imports
            if (list.contains("UsingAliasDirective")
                    || list.contains("Using_directive")
                    || list.contains("UsingStaticDirective")) {
                mainList.add(LanguageConstructsTypes.IMPORT_DECLARATION);
                list.remove("UsingAliasDirective");
                list.remove("Using_directive");
                list.remove("UsingStaticDirective");

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Interface_definition")) {
                mainList.add(LanguageConstructsTypes.INTERFACE_DECLARATION);
                list.remove("Interface_definition");
            }
            if (list.contains("Interface_signature")) {
                mainList.add(LanguageConstructsTypes.INTERFACE_SIGNATURE);
                list.remove("Interface_signature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Method_declaration")
                    || list.contains("Local_function_declaration")) {
                mainList.add(LanguageConstructsTypes.METHOD_DECLARATION);
                list.remove("Method_declaration");
                list.remove("Local_function_declaration");
            }
            if (list.contains("Method_signature")
                    || list.contains("Local_function_header")) {
                mainList.add(LanguageConstructsTypes.METHOD_SIGNATURE);
                list.remove("Method_signature");
                list.remove("Local_function_header");
            }
            if (list.contains("MethodInterface")) {
                mainList.add(LanguageConstructsTypes.METHOD_INTERFACE);
                list.remove("MethodInterface");
            }
            if (list.contains("Method_invocation")
                    || list.contains("Member_access")) {
                mainList.add(LanguageConstructsTypes.METHOD_INVOCATION);
                list.remove("Method_invocation");
                list.remove("Member_access");

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //NAMESPACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            // There is no package estructure on c#
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //POINTER+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Pointer")) {
                mainList.add(LanguageConstructsTypes.POINTER);
                list.remove("Pointer");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ReturnStatement")) {
                mainList.add(LanguageConstructsTypes.RETURN_STATEMENT);
                list.remove("ReturnStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //None
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STRUCT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Struct_definition")) {
                mainList.add(LanguageConstructsTypes.STRUCT);
                list.remove("Struct_definition");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SWITCH++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SwitchStatement")
                    || list.contains("Switch_expression")
                    || list.contains("Switch_expression_arm")
                    || list.contains("Switch_expressions")) {
                mainList.add(LanguageConstructsTypes.SWITCH_STATEMENT);
                list.remove("SwitchStatement");
                list.remove("Switch_expression");
                list.remove("Switch_expression_arm");
                list.remove("Switch_expressions");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SYNCHRONIZED_STATEMENT++++++++++++++++++++++++++++++++++++++++++++            
// There is a close equivalent to this structure in Java, but their scope is different enough so we couldn't call it the same 
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //THROW+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ThrowStatement")
                    || list.contains("Throw_expression")) {
                mainList.add(LanguageConstructsTypes.THROW_STATEMENT);
                list.remove("ThrowStatement");
                list.remove("Throw_expression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("TryStatement")
                    || list.contains("Try_expression")) {
                mainList.add(LanguageConstructsTypes.TRY_STATEMENT);
                list.remove("TryStatement");
                list.remove("Try_expression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //VARIABLES+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Local_variable_declaration")
                    || list.contains("Local_variable_declarator")
                    || list.contains("Local_variable_initializer")
                    || list.contains("Variable_initializer")
                    || list.contains("Variable_declarator")
                    || list.contains("Variable_declarators")) {
                mainList.add(LanguageConstructsTypes.VARIABLE);
                list.remove("Local_variable_declaration");
                list.remove("Local_variable_declarator");
                list.remove("Local_variable_initializer");
                list.remove("Variable_initializer");
                list.remove("Variable_declarator");
                list.remove("Variable_declarators");

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WHILE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WhileStatement")
                    || list.contains("While_expression")) {
                mainList.add(LanguageConstructsTypes.WHILE_STATEMENT);
                list.remove("WhileStatement");
                list.remove("While_expression");
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
                mainList.add(LanguageConstructsTypes.YIELD_STATEMENT);
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
