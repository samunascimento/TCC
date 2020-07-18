package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.List;

public class TypeBinding extends BaseBinding {

    private TypeBinding extendClass;
    private List<String> imports;
    private List<MethodDeclarationBinding> mdbList;
    private List<VariableBinding> attributes;
    private String modifier;
    private PackageBinding packageBinding;

    public TypeBinding() {
        super();
        this.extendClass = null;
        this.imports = new ArrayList<>();
        this.mdbList = new ArrayList<>();
        this.attributes = new ArrayList<>();
        this.modifier = null;
        this.packageBinding = new PackageBinding();
    }

    @Override
    public String toString() {

        String output;

        output = "name= " + super.getName() + "| modifier= " + this.modifier + "| extendClass= " + this.extendClass;

        return output;
    }


    /**
     * @return the mdbList
     */
    public List<MethodDeclarationBinding> getMdbList() {
        return mdbList;
    }

    /**
     * @return the modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param mdbList the mdbList to set
     */
    public void setMdbList(List<MethodDeclarationBinding> mdbList) {
        this.mdbList = mdbList;
    }

    /**
     * @param modifier the modifier to set
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * @return the extendClass
     */
    public TypeBinding getExtendClass() {
        return extendClass;
    }

    /**
     * @param extendClass the extendClass to set
     */
    public void setExtendClass(TypeBinding extendClass) {
        this.extendClass = extendClass;
    }

    /**
     * @return the attributes
     */
    public List<VariableBinding> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(List<VariableBinding> attributes) {
        this.attributes = attributes;
    }

    public void addAttributes(VariableBinding attribute) {
        this.attributes.add(attribute);
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

    /**
     * @return the imports
     */
    public List<String> getImports() {
        return imports;
    }

    /**
     * @param imports the imports to set
     */
    public void setImports(List<String> imports) {
        this.imports = imports;
    }
}
