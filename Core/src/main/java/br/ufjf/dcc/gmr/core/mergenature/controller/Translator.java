package br.ufjf.dcc.gmr.core.mergenature.controller;

import java.util.ArrayList;
import java.util.List;
import br.ufjf.dcc.gmr.core.vcs.types.LanguageConstructs;

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
                mainList.add(LanguageConstructs.ANNOTATION_TYPE_MEMBER_DECLARATION);
                list.remove("AnnotationTypeDeclaration");
                list.remove("AnnotationTypeElementDeclaration");
            }
            if (list.contains("Annotation")) {
                mainList.add(LanguageConstructs.ANNOTATION);
                list.remove("Annotation");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ARRAY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ArrayInitializer")
                    || list.contains("ElementValueArrayInitializer")
                    || list.contains("ArrayCreationExpression")) {
                mainList.add(LanguageConstructs.ARRAY_INITIALIZER);
                list.remove("ArrayInitializer");
                list.remove("ElementValueArrayInitializer");
                list.remove("ArrayCreationExpression");

            }
            if (list.contains("ArrayAccess")
                    || list.contains("ArrayAccess_lf_primary")
                    || list.contains("ArrayAccess_lfno_primary")) {
                mainList.add(LanguageConstructs.ARRAY_ACCESS);
                list.remove("ArrayAccess");
                list.remove("ArrayAccess_lf_primary");
                list.remove("ArrayAccess_lfno_primary");

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSERT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("AssertStatement")) {
                mainList.add(LanguageConstructs.ASSERT_STATEMENT);
                list.remove("AssertStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSIGNMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//            if (list.contains("Assignment")) {
//                mainList.add(LanguageConstructs.ASSIGNMENT);
//                list.remove("Assignment");
//            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BREAK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("BreakStatement")) {
                mainList.add(LanguageConstructs.BREAK_STATEMENT);
                list.remove("BreakStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CASE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("CaseLine")) {
                mainList.add(LanguageConstructs.CASE_STATEMENT);
                list.remove("CaseLine");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CAST++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("CastExpression")) {
                mainList.add(LanguageConstructs.CAST_EXPRESSION);
                list.remove("CastExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("CatchClause")
                    || list.contains("CatchExpression")) {
                mainList.add(LanguageConstructs.CATCH_CLAUSE);
                list.remove("CatchClause");
                list.remove("CatchExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("NormalClassDeclaration")) {
                mainList.add(LanguageConstructs.CLASS_DECLARATION);
                list.remove("NormalClassDeclaration");
            }
            if (list.contains("NormalClassSignature")) {
                mainList.add(LanguageConstructs.CLASS_SIGNATURE);
                list.remove("NormalClassSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("MultiLineComment")
                    || list.contains("LineComment")) {
                mainList.add(LanguageConstructs.COMMENT);
                list.remove("MultiLineComment");
                list.remove("LineComment");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CONTINUE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ContinueStatement")) {
                mainList.add(LanguageConstructs.CONTINUE_STATEMENT);
                list.remove("ContinueStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("DoStatement")) {
                mainList.add(LanguageConstructs.DO_STATEMENT);
                list.remove("DoStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ENUMS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("EnumDeclaration")) {
                mainList.add(LanguageConstructs.ENUM_DECLARATION);
                list.remove("EnumDeclaration");
            }
            if (list.contains("EnumSignature")) {
                mainList.add(LanguageConstructs.ENUM_SIGNATURE);
                list.remove("EnumSignature");
            }
            if (list.contains("EnumConstant")) {
                mainList.add(LanguageConstructs.ENUM_VALUE);
                list.remove("EnumConstant");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("FieldAccess")
                    || list.contains("FieldDeclaration")
                    || list.contains("FieldModifier")
            ) {
                mainList.add(LanguageConstructs.FIELD);
                list.remove("FieldAccess");
                list.remove("FieldDeclaration");
                list.remove("FieldModifier");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Finally+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Finally_")) {
                mainList.add(LanguageConstructs.FINALLY);
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
                mainList.add(LanguageConstructs.FOR_STATEMENT);
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
                mainList.add(LanguageConstructs.IF_STATEMENT);
                list.remove("IfThenElseStatement");
                list.remove("IfThenStatement");
                list.remove("IfThenElseStatementNoShortIf");
                list.remove("IfExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IMPORT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ImportDeclaration")) {
                mainList.add(LanguageConstructs.IMPORT_DECLARATION);
                list.remove("ImportDeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("NormalInterfaceDeclaration")) {
                mainList.add(LanguageConstructs.INTERFACE_DECLARATION);
                list.remove("NormalInterfaceDeclaration");
            } else if (list.contains("NormalInterfaceSignature")) {
                mainList.add(LanguageConstructs.INTERFACE_SIGNATURE);
                list.remove("NormalInterfaceSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("MethodDeclaration")
                    || list.contains("ConstructorDeclaration")) {
                mainList.add(LanguageConstructs.METHOD_DECLARATION);
                list.remove("MethodDeclaration");
                list.remove("ConstructorDeclaration");
            }
            if (list.contains("MethodSignature")
                    || list.contains("ConstructorDeclarator")) {
                mainList.add(LanguageConstructs.METHOD_SIGNATURE);
                list.remove("MethodSignature");
                list.remove("ConstructorDeclarator");
            }
            if (list.contains("InterfaceMethodDeclaration")) {
                mainList.add(LanguageConstructs.METHOD_INTERFACE);
                list.remove("InterfaceMethodDeclaration");
            }
            if (list.contains("MethodInvocation")
                    || list.contains("MethodInvocation_lf_primaryContext")
                    || list.contains("MethodInvocation_lfno_primary")
                    || list.contains("ExplicitConstructorInvocation")
                    || list.contains("ClassInstanceCreationExpression")
                    || list.contains("ClassInstanceCreationExpression_lf_primary")
                    || list.contains("ClassInstanceCreationExpression_lfno_primary")) {
                mainList.add(LanguageConstructs.METHOD_INVOCATION);
                list.remove("MethodInvocation");
                list.remove("MethodInvocation_lf_primaryContext");
                list.remove("MethodInvocation_lfno_primary");
                list.remove("ExplicitConstructorInvocation");
                list.remove("ClassInstanceCreationExpression");
                list.remove("ClassInstanceCreationExpression_lf_primary");
                list.remove("ClassInstanceCreationExpression_lfno_primary");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("PackageDeclaration")) {
                mainList.add(LanguageConstructs.PACKAGE_DECLARATION);
                list.remove("PackageDeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ReturnStatement")) {
                mainList.add(LanguageConstructs.RETURN_STATEMENT);
                list.remove("ReturnStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("StaticInitializer")) {
                mainList.add(LanguageConstructs.STATIC_INITIALIZER);
                list.remove("StaticInitializer");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STRUCT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SWITCH++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SwitchStatement")
                    || list.contains("SwitchExpression")) {
                mainList.add(LanguageConstructs.SWITCH_STATEMENT);
                list.remove("SwitchStatement");
                list.remove("SwitchExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SYNCHRONIZED_STATEMENT+++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SynchronizedStatement")) {
                mainList.add(LanguageConstructs.SYNCHRONIZED_STATEMENT);
                list.remove("SynchronizedStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //THROW+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ThrowStatement")) {
                mainList.add(LanguageConstructs.THROW_STATEMENT);
                list.remove("ThrowStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("TryStatement")
                    || list.contains("TryWithResourcesStatement")) {
                mainList.add(LanguageConstructs.TRY_STATEMENT);
                list.remove("TryStatement");
                list.remove("TryWithResourcesStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //VARIABLES+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (//list.contains("VariableDeclarator")
                    list.contains("VariableDeclaratorId")
                    //|| list.contains("VariableAccess")
                    //|| list.contains("LocalVariableDeclaration")
                    || list.contains("ExpressionName")
                    //|| list.contains("LocalVariableDeclarationStatement")
            ) {
                mainList.add(LanguageConstructs.VARIABLE);
                //list.remove("VariableAccess");
                //list.remove("VariableDeclarator");
                list.remove("VariableDeclaratorId");
                //list.remove("LocalVariableDeclaration");
                list.remove("ExpressionName");
                //list.remove("LocalVariableDeclarationStatement")
                ;
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WHILE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WhileStatement")
                    || list.contains("WhileStatementNoShortIf")
                    || list.contains("WhileExpression")) {
                mainList.add(LanguageConstructs.WHILE_STATEMENT);
                list.remove("WhileStatement");
                list.remove("WhileStatementNoShortIf");
                list.remove("WhileExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ERROR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Error")) {
                mainList.add(LanguageConstructs.SYNTAX_ERROR);
                list.remove("Error");
            }
            if (mainList.isEmpty()) {
                mainList.add(LanguageConstructs.FAKE_EMPTY);
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
            if (list.contains("ArrayDeclaration")) {
                mainList.add(LanguageConstructs.ARRAY_INITIALIZER);
                list.remove("ArrayDeclaration");
            }
            if (list.contains("ArrayAccess")) {
                mainList.add(LanguageConstructs.ARRAY_ACCESS);
                list.remove("ArrayAccess");
            }
            // Ainda revisando
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSERT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Assertion")) {
                mainList.add(LanguageConstructs.ASSERT_STATEMENT);
                list.remove("Assertion");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSIGNMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            // Removido por englobar muitas estruturas
            //BLANK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Blank")) {
                mainList.add(LanguageConstructs.BLANK);
                list.remove("Blank");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BREAK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("BreakStatement")) {
                mainList.add(LanguageConstructs.BREAK_STATEMENT);
                list.remove("Breakstatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CASE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("CaseStatement")
                    || list.contains("DefaultStatement")) {
                mainList.add(LanguageConstructs.CASE_STATEMENT);
                list.remove("CaseStatement");
                list.remove("DefaultStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CAST+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("PrimitiveDataTypeCastExpression")
                    || list.contains("ClassCastExpression")
                    || list.contains("CastStatement")) {
                mainList.add(LanguageConstructs.CAST_EXPRESSION);
                list.remove("PrimitiveDataTypeCastExpression");
                list.remove("ClassCastExpression");
                list.remove("CastStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Handler")
                    || list.contains("CatchStatement")) {
                mainList.add(LanguageConstructs.CATCH_CLAUSE);
                list.remove("Handler");
                list.remove("CatchStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ClassSpecifier")) {
                mainList.add(LanguageConstructs.CLASS_DECLARATION);
                list.remove("ClassSpecifier");
            }
            if (list.contains("ClassHead")) {
                mainList.add(LanguageConstructs.CLASS_SIGNATURE);
                list.remove("ClassHead");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("MultiLineComment")
                    || list.contains("LineComment")) {
                mainList.add(LanguageConstructs.COMMENT);
                list.remove("MultiLineComment");
                list.remove("LineComment");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CONTINUE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ContinueStatement")) {
                mainList.add(LanguageConstructs.CONTINUE_STATEMENT);
                list.remove("ContinueStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("DoStatement")
                    || list.contains("DoSignature")) {
                mainList.add(LanguageConstructs.DO_STATEMENT);
                list.remove("DoStatement");
                list.remove("DoSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DELETE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("DeleteExpression")) {
                mainList.add(LanguageConstructs.DO_STATEMENT);
                list.remove("DeleteExpression");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ENUM++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (list.contains("EnumHead")) {
                mainList.add(LanguageConstructs.ENUM_SIGNATURE);
                list.remove("EnumHead");
            }
            if (list.contains("EnumSpecifier")) {
                mainList.add(LanguageConstructs.ENUM_DECLARATION);
                list.remove("EnumSpecifier");
            }
            if (list.contains("EnumeratorDefinition")) {
                mainList.add(LanguageConstructs.ENUM_VALUE);
                list.remove("EnumeratorDefinition");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("FieldAccess")
                    || list.contains("FieldDeclaration")) {
                mainList.add(LanguageConstructs.FIELD);
                list.remove("FieldAccess");
                list.remove("FieldDeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FOR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ForStatement")
                    || list.contains("ForSignature")) {
                mainList.add(LanguageConstructs.FOR_STATEMENT);
                list.remove("ForStatement");
                list.remove("ForSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IF++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("IfBlock")
                    || list.contains("IfStatement")) {
                mainList.add(LanguageConstructs.IF_STATEMENT);
                list.remove("IfBlock");
                list.remove("IfStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IMPORT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("IncludeDeclaration")) {
                mainList.add(LanguageConstructs.IMPORT_DECLARATION);
                list.remove("IncludeDeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Não tem em c++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHOD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("FunctionDefinition")) {
                mainList.add(LanguageConstructs.METHOD_DECLARATION);
                list.remove("FunctionDefinition");
            }
            if (list.contains("FunctionCall")
                    || list.contains("ConstructorCall")) {
                mainList.add(LanguageConstructs.METHOD_INVOCATION);
                list.remove("FunctionCall");
                list.remove("ConstructorCall");
            }
            if (list.contains("FunctionSignature")) {
                mainList.add(LanguageConstructs.METHOD_SIGNATURE);
                list.remove("FunctionSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //NAMESPACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("NamespaceSignature")
                    || list.contains("NamespaceAliasDefinition")
                    || list.contains("UsingDirective")
                    || list.contains("UsingDeclaration")) {
                mainList.add(LanguageConstructs.NAMESPACE);
                list.remove("NamespaceDignature");
                list.remove("NamespaceAliasDefinition");
                list.remove("UsingDirective");
                list.remove("UsingDeclaration");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //PACKAGE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Não tem em c++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //POINTER+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("PointerDeclaration")
                    || list.contains("PointerAccess")) {
                mainList.add(LanguageConstructs.POINTER);
                list.remove("PointerDeclaration");
                list.remove("PointerAccess");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ReturnStatement")) {
                mainList.add(LanguageConstructs.RETURN_STATEMENT);
                list.remove("Returnstatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STATIC++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            // Não tem
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //STRUCT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            // It's like class
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SWITCH++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("SwitchStatement")) {
                mainList.add(LanguageConstructs.SWITCH_STATEMENT);
                list.remove("SwitchStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //SynchronizedStatement+++++++++++++++++++++++++++++++++++++++++++++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //THROW++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("ThrowExpression")
                    || list.contains("DynamicExceptionSpecification")) {
                mainList.add(LanguageConstructs.THROW_STATEMENT);
                list.remove("ThrowExpression");
                list.remove("DynamicExceptionSpecification");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("TryBlock")
                    || list.contains("TryStatement")
                    || list.contains("FunctionTryBlock")
                    || list.contains("FunctionTryStatement")) {
                mainList.add(LanguageConstructs.TRY_STATEMENT);
                list.remove("TryBlock");
                list.remove("TryStatement");
                list.remove("FunctionTryBlock");
                list.remove("FunctionTryStatement");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //VARIABLE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("VariableDeclaration")
                    || list.contains("VariableAccess")
                    || list.contains("Identifier")) {
                mainList.add(LanguageConstructs.VARIABLE);
                list.remove("VariableDeclaration");
                list.remove("VariableAccess");
                list.remove("Identifier");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WHILE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("WhileStatement")
                    || list.contains("WhileSignature")) {
                mainList.add(LanguageConstructs.WHILE_STATEMENT);
                list.remove("WhileStatement");
                list.remove("WhileSignature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ERROR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Error")) {
                mainList.add(LanguageConstructs.SYNTAX_ERROR);
                list.remove("Error");
            }
            if (mainList.isEmpty()) {
                mainList.add(LanguageConstructs.FAKE_EMPTY);
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
            if (list.contains("Array_initializer")) {
                mainList.add(LanguageConstructs.ARRAY_INITIALIZER);
                list.remove("Array_initializer");
            }
            if (list.contains("Array_acess")) {
                mainList.add(LanguageConstructs.ARRAY_ACCESS);
                list.remove("Array_acess");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSERT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Assert_stmt")) {
                mainList.add(LanguageConstructs.ASSERT_STATEMENT);
                list.remove("Assert_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ASSIGNMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Assign_part")) {
                mainList.add(LanguageConstructs.ASSIGNMENT);
                list.remove("Assign_part");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BLANK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Blank")) {
                mainList.add(LanguageConstructs.BLANK);
                list.remove("Blank");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //BREAK+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Break_stmt")) {
                mainList.add(LanguageConstructs.BREAK_STATEMENT);
                list.remove("Break_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CASE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //There is no switch on Python
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CAST++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            //CATCH+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Except_signature")
                    || list.contains("Except_clause")) {
                mainList.add(LanguageConstructs.CATCH_CLAUSE);
                list.remove("Except_signature");
                list.remove("Except_clause");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CLASS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Classdef")) {
                mainList.add(LanguageConstructs.CLASS_DECLARATION);
                list.remove("Classdef");
            }
            if (list.contains("Class_signature")) {
                mainList.add(LanguageConstructs.CLASS_SIGNATURE);
                list.remove("Class_signature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //COMMENT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (list.contains("MultiLineComment")
                    || list.contains("LineComment")) {

                mainList.add(LanguageConstructs.COMMENT);
                list.remove("MultiLineComment");
                list.remove("LineComment");

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //CONTINUE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Continue_stmt")) {
                mainList.add(LanguageConstructs.CONTINUE_STATEMENT);
                list.remove("Continue_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //There is no do on python
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //DELET+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Del_stmt")) {
                mainList.add(LanguageConstructs.DELETE_STATEMENT);
                list.remove("Del_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //ENUM++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //There is no enum do on python
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FIELD+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            ////There is no field on python grammar
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FINALLY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Finally_clause")
                    || list.contains("Finally_signature")) {
                mainList.add(LanguageConstructs.FINALLY);
                list.remove("Finally_clause");
                list.remove("Finally_signature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //FOR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("For_stmt")
                    || list.contains("For_signature")) {
                mainList.add(LanguageConstructs.FOR_STATEMENT);
                list.remove("For_stmt");
                list.remove("For_signature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IF++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("If_stmt")
                    || list.contains("If_signature")) {
                mainList.add(LanguageConstructs.IF_STATEMENT);
                list.remove("If_stmt");
                list.remove("If_signature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //IMPORT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("From_stmt")
                    || list.contains("Import_stmt")) {
                mainList.add(LanguageConstructs.IMPORT_DECLARATION);
                list.remove("From_stmt");
                list.remove("Import_stmt");

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //INTERFACE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Python doesn't have interface because of the included multiple inheritance
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Funcdef")) {
                mainList.add(LanguageConstructs.METHOD_DECLARATION);
                list.remove("Funcdef");
            }
            if (list.contains("Func_signature")) {
                mainList.add(LanguageConstructs.METHOD_SIGNATURE);
                list.remove("Func_signature");
            }
            if (list.contains("Function_call")) {
                mainList.add(LanguageConstructs.METHOD_INVOCATION);
                list.remove("Function_call");
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
                mainList.add(LanguageConstructs.THROW_STATEMENT);
                list.remove("Raise_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //TRY+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Try_stmt")) {
                mainList.add(LanguageConstructs.TRY_STATEMENT);
                list.remove("Try_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //RETURN++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Return_stmt")) {
                mainList.add(LanguageConstructs.RETURN_STATEMENT);
                list.remove("Return_stmt");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //VARIABLE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
            if (list.contains("Variable")) {
                mainList.add(LanguageConstructs.VARIABLE);
                list.remove("Variable");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //Error+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Error")) {
                mainList.add(LanguageConstructs.SYNTAX_ERROR);
                list.remove("Error");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //WHILE+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("While_stmt")
                    || list.contains("While_signature")) {
                mainList.add(LanguageConstructs.WHILE_STATEMENT);
                list.remove("While_stmt");
                list.remove("While_signature");
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            //YELD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Yield_stmt")) {
                mainList.add(LanguageConstructs.YIELD_STATEMENT);
                list.remove("Yield_stmt");
            }
            //ERROR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if (list.contains("Error")) {
                mainList.add(LanguageConstructs.SYNTAX_ERROR);
                list.remove("Error");
            }
            if (mainList.isEmpty()) {
                mainList.add(LanguageConstructs.FAKE_EMPTY);
            }
        }
        return mainList;
    }

}
