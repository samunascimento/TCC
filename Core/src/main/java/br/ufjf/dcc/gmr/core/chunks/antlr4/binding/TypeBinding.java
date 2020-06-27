package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.List;

public class TypeBinding {
    
    private TypeBinding extendClass;
    private TypeBinding parentClass;
    private List<MethodDeclarationBinding> mdbList;
    private List<VariableBinding> attributes;
    private TypeBinding modifier;
    private String name;
    private PackageBinding packageBinding;

    public TypeBinding() {
        this.packageBinding = new PackageBinding();
        this.attributes = new ArrayList<>();
        this.extendClass = null;
        this.mdbList = new ArrayList<>();
        this.name = "";
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
    public TypeBinding getModifier() {
        return modifier;
    }

    /**
     * @param mdbList the mdbList to set
     */
    public void setMdbList(List<MethodDeclarationBinding> mdbList) {
        this.mdbList = mdbList;
    }

    public void addMdbList(MethodDeclarationBinding mdb) {
        this.mdbList.add(mdb);
    }

    /**
     * @param modifier the modifier to set
     */
    public void setModifier(TypeBinding modifier) {
        this.modifier = modifier;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the parentClass
     */
    public TypeBinding getParentClass() {
        return parentClass;
    }

    /**
     * @param parentClass the parentClass to set
     */
    public void setParentClass(TypeBinding parentClass) {
        this.parentClass = parentClass;
    }

}
