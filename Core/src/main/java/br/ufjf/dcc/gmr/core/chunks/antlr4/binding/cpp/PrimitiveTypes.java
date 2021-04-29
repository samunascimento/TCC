/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;

/**
 *
 * @author ketleen
 */
public class PrimitiveTypes {

    public static final String INT = "int";
    public static final String FLOAT = "float";
    public static final String NULL = "null";
    public static final String STRING = "String";
    public static final String DOUBLE = "double";
    public static final String CHAR = "char";
    public static final String BOOLEAN = "boolean";
    public static final String SHORT = "short";
    public static final String LONG = "long";
    public static final String VOID = "void";
    public static final String POINTER = "pointer";
    public static final String USER_DEFINED = "userDefined";
    public static final String NOT_DEFINED = "notDefined";

    public static boolean isCompatibleType(String subType, String type) {
        if (subType.contains(SHORT)) {
            subType = SHORT;
        }
        if (subType.contains(LONG)) {
            subType = LONG;
        }
        if ((subType != null && type == null) || (subType == null && type != null)) {
            return false;
        } else if (subType == null && type == null) {
            return true;
        } else if (subType.equals(SHORT)
                && (type.equals(CHAR)
                || type.equals(SHORT)
                || type.equals(INT)
                || type.equals(LONG)
                || type.equals(FLOAT)
                || type.equals(DOUBLE))) {
            return true;
        } else if (subType.equals(INT)
                && (type.equals(INT)
                || type.equals(LONG)
                || type.equals(FLOAT)
                || type.equals(DOUBLE))) {
            return true;
        } else if (subType.equals(LONG)
                && (type.equals(LONG)
                || type.equals(FLOAT)
                || type.equals(DOUBLE))) {
            return true;
        } else if (subType.equals(FLOAT)
                && (type.equals(FLOAT)
                || type.equals(DOUBLE))) {
            return true;
        } else if (subType.equals(DOUBLE)
                && type.equals(DOUBLE)) {
            return true;
        } else if (subType.equals(BOOLEAN)
                && type.equals(BOOLEAN)) {
            return true;
        } else if (subType.equals(CHAR)
                && (type.equals(CHAR)
                || type.equals(SHORT)
                || type.equals(INT)
                || type.equals(LONG)
                || type.equals(FLOAT)
                || type.equals(DOUBLE))) {
            return true;
        } else if (subType.equals(STRING)
                && type.equals(STRING)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrimitiveType(String type) {
        if (type.equals(CHAR)
                || type.equals(SHORT)
                || type.equals(INT)
                || type.equals(LONG)
                || type.equals(FLOAT)
                || type.equals(DOUBLE)
                || type.equals(STRING)) {
            return true;
        } else {
            return false;
        }
    }

    public static TypeBinding getType(CPP14Parser.LiteralContext literal) {

        if (literal.Characterliteral() != null) {
            return new TypeBinding(CHAR);
        } else if (literal.Floatingliteral() != null) {
            return new TypeBinding(FLOAT);
        } else if (literal.Integerliteral() != null) {
            return new TypeBinding(INT);
        } else if (literal.Stringliteral() != null) {
            return new TypeBinding(STRING);
        } else if (literal.booleanliteral() != null) {
            return new TypeBinding(BOOLEAN);
        } else if (literal.pointerliteral() != null) {
            return new TypeBinding(POINTER);
        } else if (literal.userdefinedliteral() != null) {
            return new TypeBinding(USER_DEFINED);
        } else {
            return new TypeBinding(NOT_DEFINED);
        }
    }

}
