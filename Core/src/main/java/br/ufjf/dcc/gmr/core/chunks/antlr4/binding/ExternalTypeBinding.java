/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

/**
 *
 * @author felip
 */
public class ExternalTypeBinding {

    public static final String EXTERNAL_PACKAGE = "#EXTERNAL#";

    public static TypeBinding init(String type) {

        TypeBinding typeBinding = new TypeBinding();
        PackageBinding externalPackageBinding = new PackageBinding();
        externalPackageBinding.setName(EXTERNAL_PACKAGE);

        typeBinding.setExtendClass(null);
        typeBinding.setAttributes(null);
        typeBinding.setImports(null);
        typeBinding.setMdbList(null);
        typeBinding.setPackageBinding(externalPackageBinding);
        typeBinding.setName(type);

        return typeBinding;
    }

}
