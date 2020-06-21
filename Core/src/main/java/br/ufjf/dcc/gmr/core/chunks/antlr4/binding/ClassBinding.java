
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.List;

public class ClassBinding {
    
    private List<MethodDeclarationBinding> mdbList;
    private TypeBinding modifier;
    
    public ClassBinding(){
        this.mdbList = new ArrayList<>();
        this.modifier = new TypeBinding();
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

    /**
     * @param modifier the modifier to set
     */
    public void setModifier(TypeBinding modifier) {
        this.modifier = modifier;
    }
}
