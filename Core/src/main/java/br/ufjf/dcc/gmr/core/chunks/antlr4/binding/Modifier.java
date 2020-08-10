package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

public enum Modifier {
    PUBLIC, PRIVATE, PROTECTED, STATIC, ABSTRACT, FINAL, STRICTFP, NATIVE, SYNCHRONIZED, TRANSIENT, VOLATILE, ANNOTATION;

    public static Modifier equalsTo(String str){
        if(str.equals("abstract")){
            return ABSTRACT;
        }else if(str.equals("annotation")){
            return ANNOTATION;
        }else if(str.equals("final")){
            return FINAL;
        }else if(str.equals("native")){
            return NATIVE;
        }else if(str.equals("private")){
            return PRIVATE;
        }else if(str.equals("protected")){
            return PROTECTED;
        }else if(str.equals("public")){
            return PUBLIC;
        }else if(str.equals("static")){
            return STATIC;
        }else if(str.equals("strictfp")){
            return STRICTFP;
        }else if(str.equals("syncronized")){
            return SYNCHRONIZED;
        }else if(str.equals("transient")){
            return TRANSIENT;
        }else if(str.equals("volatile")){
            return VOLATILE;
        } 
        return null;
    } 
}
