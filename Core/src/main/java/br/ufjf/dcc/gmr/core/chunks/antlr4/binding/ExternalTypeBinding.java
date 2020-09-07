package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

public class ExternalTypeBinding {

    public static final String EXTERNAL_PACKAGE = "#EXTERNAL#";

    public static TypeBinding init(String type) {

        TypeBinding typeBinding = new TypeBinding();
        PackageBinding externalPackageBinding = new PackageBinding();
        externalPackageBinding.setName(EXTERNAL_PACKAGE);

        typeBinding.setExtendClass(null);
        typeBinding.setAttributes(null);
        typeBinding.setImports(null);
        typeBinding.setMethodsBinding(null);
        typeBinding.setPackageBinding(externalPackageBinding);
        typeBinding.setName(type);

        return typeBinding;
    }

}
