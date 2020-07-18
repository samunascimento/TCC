package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.List;

public class EnviromentBinding {

    private List<List<BaseBinding>> enviroment;

    public EnviromentBinding() {
        this.enviroment = new ArrayList<>();
    }
    
    public boolean findVariable(VariableBinding variable){
        
        for (List<BaseBinding> list : enviroment) {
            for (BaseBinding baseBinding : list) {
                if(baseBinding.getName().equals(variable.getName())){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean findMethodCall(MethodCallBinding find){
        
        for (List<BaseBinding> list : enviroment) {
            for (BaseBinding baseBinding : list) {
                if(baseBinding.getName().equals(find.getName())){
                    return true;
                }
            }
        }
        return false;
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
