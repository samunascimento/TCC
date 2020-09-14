package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.List;

public class TypeBinding extends BaseBinding {

    private TypeBinding extendClassBinding;
    private List<ImportBinding> imports;
    private List<MethodDeclarationBinding> MethodsBinding;
    private List<VariableBinding> attributesBinding;
    private List<Modifier> modifiers;
    private PackageBinding packageBinding;

    public TypeBinding() {
        super();
        this.extendClassBinding = null;
        this.imports = new ArrayList<>();
        this.MethodsBinding = new ArrayList<>();
        this.attributesBinding = new ArrayList<>();
        this.modifiers = new ArrayList<>();
        this.packageBinding = new PackageBinding();
    }

    @Override
    public String toString() {

        String output;

        output = "name= " + super.getName() + "| modifier= " + this.modifiers + "| extendClass= " + this.extendClassBinding;

        return output;
    }
    
    public List<MethodCallBinding> getAllMethodsCallBinding(){
        List<MethodCallBinding> methodsCallBinding = new ArrayList<>();
        for (MethodDeclarationBinding methodDeclarationBinding : this.getMethodsBinding()) {
            methodsCallBinding.addAll(methodDeclarationBinding.getMethodCallBindings());
        }
        return methodsCallBinding;
    }
    
    public List<MethodDeclarationBinding> getAllMethodsDeclaration(){
        return this.getMethodsBinding();
    }
    
    /**
     * @return the MethodsBinding
     */
    public List<MethodDeclarationBinding> getMethodsBinding() {
        return MethodsBinding;
    }

    /**
     * @return the modifiers
     */
    public List<Modifier> getModifier() {
        return modifiers;
    }

    /**
     * @param mdbList the MethodsBinding to set
     */
    public void setMethodsBinding(List<MethodDeclarationBinding> mdbList) {
        this.MethodsBinding = mdbList;
    }

    /**
     * @param modifier the modifiers to set
     */
    public void setModifier(List<Modifier> modifiers) {
        this.modifiers = modifiers;
    }
    
    public void addModifier(Modifier modifier){
        this.modifiers.add(modifier);
    }

    /**
     * @return the extendClassBinding
     */
    public TypeBinding getExtendClass() {
        return extendClassBinding;
    }

    /**
     * @param extendClass the extendClassBinding to set
     */
    public void setExtendClass(TypeBinding extendClass) {
        this.extendClassBinding = extendClass;
    }

    /**
     * @return the attributesBinding
     */
    public List<VariableBinding> getAttributes() {
        return attributesBinding;
    }

    /**
     * @param attributes the attributesBinding to set
     */
    public void setAttributes(List<VariableBinding> attributes) {
        this.attributesBinding = attributes;
    }

    public void addAttributes(VariableBinding attribute) {
        this.attributesBinding.add(attribute);
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
    public List<ImportBinding> getImports() {
        return imports;
    }

    /**
     * @param imports the imports to set
     */
    public void setImports(List<ImportBinding> imports) {
        this.imports = imports;
    }

    @Override
    public String getName() {      
    
        if(this.getPackageBinding().getName().isEmpty() && super.getName().isEmpty() ){
            
            return super.getName();
        }
        return this.getPackageBinding().getName().concat(".").concat(super.getName());
 
    }
    
}
