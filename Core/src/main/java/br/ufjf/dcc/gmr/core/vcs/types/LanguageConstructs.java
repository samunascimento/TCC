/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

/**
 *
 * @author Luan
 */
public class LanguageConstructs {

    public static int NUMBER_OF_TYPES = 50;
    
    public static final String ANNOTATION = "Annotation";
    public static final String ANNOTATION_TYPE_MEMBER_DECLARATION = "AnnotationDeclaration";
    public static final String ARRAY_ACCESS = "ArrayAccess";
    public static final String ARRAY_INITIALIZER = "ArrayInitializer";
    public static final String ASSERT_STATEMENT = "AssertStatement";
    public static final String ASSIGNMENT = "Assignment";
    public static final String BLANK = "Blank";
    public static final String BREAK_STATEMENT = "BreakStatement";
    public static final String CASE_STATEMENT = "CaseStatement";
    public static final String CAST_EXPRESSION = "CastExpression";
    public static final String CATCH_CLAUSE = "CatchClause";
    public static final String CLASS_DECLARATION = "ClassDeclaration";
    public static final String CLASS_SIGNATURE = "ClassSignature";
    public static final String COMMENT = "Comment";
    public static final String CONTINUE_STATEMENT = "ContinueStatement";
    public static final String DO_STATEMENT = "DoStatement";
    public static final String DELETE_STATEMENT = "Delete";
    public static final String ENUM_DECLARATION = "EnumDeclaration";
    public static final String ENUM_SIGNATURE = "EnumSignature";
    public static final String ENUM_VALUE = "EnumValue";
    public static final String FIELD = "Field";
    public static final String FOR_STATEMENT = "ForStatement";
    public static final String FINALLY = "Finally";
    public static final String IF_STATEMENT = "IfStatement";
    public static final String IMPORT_DECLARATION = "Import";
    public static final String INTERFACE_DECLARATION = "InterfaceDeclaration";
    public static final String INTERFACE_SIGNATURE = "InterfaceSignature";
    public static final String METHOD_DECLARATION = "MethodDeclaration";
    public static final String METHOD_INTERFACE = "MethodInterface";
    public static final String METHOD_INVOCATION = "MethodInvocation";
    public static final String METHOD_SIGNATURE = "MethodSignature";
    public static final String NAMESPACE = "Namespace";
    public static final String PACKAGE_DECLARATION = "PackageDeclaration";
    public static final String POINTER = "Pointer";
    public static final String RETURN_STATEMENT = "ReturnStatement";
    public static final String STATIC_INITIALIZER = "StaticInitializer";
    public static final String STRUCT = "Struct";
    public static final String SWITCH_STATEMENT = "SwitchStatement";
    public static final String SYNCHRONIZED_STATEMENT = "SynchronizedStatement";
    public static final String THROW_STATEMENT = "ThrowStatement";
    public static final String TRY_STATEMENT = "TryStatement";
    public static final String VARIABLE = "Variable";
    public static final String WHILE_STATEMENT = "WhileStatement";
    public static final String YIELD_STATEMENT = "YieldStatement";
    public static final String OTHER = "Other";
    public static final String SYNTAX_ERROR = "Syntax Error";
    public static final String NOT_PARSEABLE = "Not Parseable";
    public static final String FAKE_EMPTY = "Fake Empty";
    public static final String OUT_OF_MEMORY = "Out of Memory";
    public static final String ERROR = "Error";

    public static String getStringFromInt(int value) {
        switch (value) {
            case 1:
                return ANNOTATION;
            case 2:
                return ANNOTATION_TYPE_MEMBER_DECLARATION;
            case 3:
                return ARRAY_ACCESS;
            case 4:
                return ARRAY_INITIALIZER;
            case 5:
                return ASSERT_STATEMENT;
            case 6:
                return ASSIGNMENT;
            case 7:
                return BLANK;
            case 8:
                return BREAK_STATEMENT;
            case 9:
                return CASE_STATEMENT;
            case 10:
                return CAST_EXPRESSION;
            case 11:
                return CATCH_CLAUSE;
            case 12:
                return CLASS_DECLARATION;
            case 13:
                return CLASS_SIGNATURE;
            case 14:
                return COMMENT;
            case 15:
                return CONTINUE_STATEMENT;
            case 16:
                return DO_STATEMENT;
            case 17:
                return DELETE_STATEMENT;
            case 18:
                return ENUM_DECLARATION;
            case 19:
                return ENUM_SIGNATURE;
            case 20:
                return ENUM_VALUE;
            case 21:
                return FIELD;
            case 22:
                return FOR_STATEMENT;
            case 23:
                return FINALLY;
            case 24:
                return IF_STATEMENT;
            case 25:
                return IMPORT_DECLARATION;
            case 26:
                return INTERFACE_DECLARATION;
            case 27:
                return INTERFACE_SIGNATURE;
            case 28:
                return METHOD_DECLARATION;
            case 29:
                return METHOD_INTERFACE;
            case 30:
                return METHOD_INVOCATION;
            case 31:
                return METHOD_SIGNATURE;
            case 32:
                return NAMESPACE;
            case 33:
                return PACKAGE_DECLARATION;
            case 34:
                return POINTER;
            case 35:
                return RETURN_STATEMENT;
            case 36:
                return STATIC_INITIALIZER;
            case 37:
                return STRUCT;
            case 38:
                return SWITCH_STATEMENT;
            case 39:
                return SYNCHRONIZED_STATEMENT;
            case 40:
                return THROW_STATEMENT;
            case 41:
                return TRY_STATEMENT;
            case 42:
                return VARIABLE;
            case 43:
                return WHILE_STATEMENT;
            case 44:
                return YIELD_STATEMENT;
            case 45:
                return OTHER;
            case 46:
                return SYNTAX_ERROR;
            case 47:
                return NOT_PARSEABLE;
            case 48:
                return FAKE_EMPTY;
            case 49:
                return OUT_OF_MEMORY;
            case 50:
                return ERROR;
            default:
                return null;
        }
    }
}
