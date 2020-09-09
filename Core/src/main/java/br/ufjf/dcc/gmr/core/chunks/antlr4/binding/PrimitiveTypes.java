package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

public class PrimitiveTypes {

    public static final String INT = "int";
    public static final String FLOAT = "float";
    public static final String NULL = "null";
    public static final String STRING = "String";
    public static final String DOUBLE = "double";
    public static final String CHAR = "char";
    public static final String BOOLEAN = "boolean";
    public static final String BYTE = "byte";
    public static final String SHORT = "short";
    public static final String LONG = "long";
    public static final String VOID = "void";
    public static final String PRIMITIVE_PACKAGE = "#PRIMITIVE#";

    public static boolean isCompatibleType(String subType, String type) {

            if ((subType != null && type == null) || (subType == null && type != null)) {
                return false;
            } else if (subType == null && type == null) {
                return true;
            } else if (subType.equals(PRIMITIVE_PACKAGE + "." +  BYTE) && (type.equals(PRIMITIVE_PACKAGE + "." +  BYTE) || type.equals(PRIMITIVE_PACKAGE + "." +  CHAR) || type.equals(PRIMITIVE_PACKAGE + "." +  SHORT) || type.equals(PRIMITIVE_PACKAGE + "." +  INT) || type.equals(PRIMITIVE_PACKAGE + "." +  LONG) || type.equals(PRIMITIVE_PACKAGE + "." +  FLOAT) || type.equals(PRIMITIVE_PACKAGE + "." +  DOUBLE))) {
                return true;
            } else if (subType.equals(PRIMITIVE_PACKAGE + "." +  SHORT) && (type.equals(PRIMITIVE_PACKAGE + "." +  CHAR) || type.equals(PRIMITIVE_PACKAGE + "." +  SHORT) || type.equals(PRIMITIVE_PACKAGE + "." +  INT) || type.equals(PRIMITIVE_PACKAGE + "." +  LONG) || type.equals(PRIMITIVE_PACKAGE + "." +  FLOAT) || type.equals(PRIMITIVE_PACKAGE + "." +  DOUBLE))) {
                return true;
            } else if (subType.equals(PRIMITIVE_PACKAGE + "." +  INT) && (type.equals(PRIMITIVE_PACKAGE + "." +  INT) || type.equals(PRIMITIVE_PACKAGE + "." +  LONG) || type.equals(PRIMITIVE_PACKAGE + "." +  FLOAT) || type.equals(PRIMITIVE_PACKAGE + "." +  DOUBLE))) {
                return true;
            } else if (subType.equals(PRIMITIVE_PACKAGE + "." +  LONG) && (type.equals(PRIMITIVE_PACKAGE + "." +  LONG) || type.equals(PRIMITIVE_PACKAGE + "." +  FLOAT) || type.equals(PRIMITIVE_PACKAGE + "." +  DOUBLE))) {
                return true;
            } else if (subType.equals(PRIMITIVE_PACKAGE + "." +  FLOAT) && (type.equals(PRIMITIVE_PACKAGE + "." +  FLOAT) || type.equals(PRIMITIVE_PACKAGE + "." +  DOUBLE))) {
                return true;
            } else if (subType.equals(PRIMITIVE_PACKAGE + "." +  DOUBLE) && type.equals(PRIMITIVE_PACKAGE + "." +  DOUBLE)) {
                return true;
            } else if (subType.equals(PRIMITIVE_PACKAGE + "." +  BOOLEAN) && type.equals(PRIMITIVE_PACKAGE + "." +  BOOLEAN)) {
                return true;
            } else if (subType.equals(PRIMITIVE_PACKAGE + "." +  CHAR) && (type.equals(PRIMITIVE_PACKAGE + "." +  CHAR) || type.equals(PRIMITIVE_PACKAGE + "." +  SHORT) || type.equals(PRIMITIVE_PACKAGE + "." +  INT) || type.equals(PRIMITIVE_PACKAGE + "." +  LONG) || type.equals(PRIMITIVE_PACKAGE + "." +  FLOAT) || type.equals(PRIMITIVE_PACKAGE + "." +  DOUBLE))) {
                return true;
            } else if (subType.equals(PRIMITIVE_PACKAGE + "." +  STRING) && type.equals(PRIMITIVE_PACKAGE + "." +  STRING)) {
                return true;
            } else {
                return false;
            }
        
    }

    public static TypeBinding init(String type) {
        
        PackageBinding primitivePackageBinding = new PackageBinding();
        primitivePackageBinding.setName(PRIMITIVE_PACKAGE);
        
        TypeBinding typeBinding = new TypeBinding();
        typeBinding.setExtendClass(null);
        typeBinding.setAttributes(null);
        typeBinding.setImports(null);
        typeBinding.setMethodsBinding(null);
        typeBinding.setPackageBinding(primitivePackageBinding);
        typeBinding.setName(type);
        return typeBinding;

    }
}
