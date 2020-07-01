package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.List;

public class TypeBinding extends BaseBinding{
    
    private TypeBinding extendClass;
    private List<TypeBinding> childrenClass;
    private TypeBinding parentClass;
    private List<MethodDeclarationBinding> mdbList;
    private List<VariableBinding> attributes;
    private String modifier;
    private PackageBinding packageBinding;

    public TypeBinding() {
        super();
        this.childrenClass = new ArrayList<>();
        this.packageBinding = new PackageBinding();
        this.attributes = new ArrayList<>();
        this.extendClass = null;
        this.mdbList = new ArrayList<>();
        this.modifier = null;
    }
    
    @Override
    public String toString() {

       String output;
       
       output = "name= "+super.getName()+"| modifier= "+this.modifier+"| parentClass ="+this.parentClass+"| extendClass= "+this.extendClass;

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

    /**
     * @return the childrenClass
     */
    public List<TypeBinding> getChildrenClass() {
        return childrenClass;
    }

    /**
     * @param childrenClass the childrenClass to set
     */
    public void setChildrenClass(List<TypeBinding> childrenClass) {
        this.childrenClass = childrenClass;
    }
    
   


}
