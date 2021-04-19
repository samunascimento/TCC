/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

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
}
