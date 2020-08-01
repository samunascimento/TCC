package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.List;

public class EnviromentBinding {

    private List<List<BaseBinding>> enviroment;

    public EnviromentBinding() {
        this.enviroment = new ArrayList<>();
    }
    
    
    public VariableBinding findVariable(VariableBinding variable){
        
        for (int i = this.enviroment.size() - 1; i >= 0 ; i--) {
            for (BaseBinding baseBinding : enviroment.get(i)) {
                if (baseBinding instanceof VariableBinding) {
                    VariableBinding variableBinding = (VariableBinding) baseBinding;
                    if (variableBinding.getName().equals(variable.getName())) {
                        return variableBinding;
                    }
                }
            }
        }
        
        return null;

    }
    
    public MethodCallBinding findMethodCall(MethodCallBinding find){
        
        for (List<BaseBinding> list : enviroment) {
            for (BaseBinding baseBinding : list) {
                if(baseBinding.getName().equals(find.getName())){
                    return find;
                }
            }
        }
        return null;
    }
    
    
    /**
     * @return the enviroment
     */
    public List<List<BaseBinding>> getEnviroment() {
        return enviroment;
    }

    /**
     * @param enviroment the enviroment to set
     */
    public void setEnviroment(List<List<BaseBinding>> enviroment) {
        this.enviroment = enviroment;
    }

}
