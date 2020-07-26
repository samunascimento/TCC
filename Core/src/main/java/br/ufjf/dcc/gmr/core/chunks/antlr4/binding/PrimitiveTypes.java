package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

public class PrimitiveTypes {

    public static final String INT = "int";
    public static final String FLOAT = "float";
    public static final String NULL = "null";
    public static final String STRING = "String";
    public static final String DOUBLE = "double";
    public static final String CHAR = "char";
    public static final String BOOLEAN = "boolean";

    public static boolean isCompatibleType(String subType, String type) {

        try {
            if ((subType != null && type == null) || (subType == null && type != null)) {
                return false;
            } else if (subType == null && type == null) {
                return true;
            } else if (subType.equals(INT) && (type.equals(INT) || type.equals(FLOAT) || type.equals(DOUBLE))) {
                return true;
            } else if (subType.equals(FLOAT) && (type.equals(FLOAT) || type.equals(DOUBLE))) {
                return true;
            } else if (subType.equals(DOUBLE) && type.equals(DOUBLE)) {
                return true;
            } else if (subType.equals(BOOLEAN) && type.equals(BOOLEAN)) {
                return true;
            } else if (subType.equals(CHAR) && type.equals(CHAR)) {
                return true;
            } else if (subType.equals(STRING) && type.equals(STRING)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("@@@@@@@@@@@@@@@@@@@errorLine33@@@@@@@@@@@@@@@@@@@");
            e.printStackTrace();

        }
        return false;
    }
}
