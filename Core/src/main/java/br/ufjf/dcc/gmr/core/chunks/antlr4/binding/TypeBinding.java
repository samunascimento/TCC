package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

public class TypeBinding {
    
    private String identifier;
    private PackageBinding packageBinding;

    public TypeBinding() {
        this.packageBinding = new PackageBinding();
    }
    
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * @return the packageBinding
     */
    public PackageBinding getPackageBinding() {
        return packageBinding;
    }

    /**
     * @param packageBinding the packageBinding to set
     */
    public void setPackageBinding(PackageBinding packageBinding) {
        this.packageBinding = packageBinding;
    }
    
    
    
}
