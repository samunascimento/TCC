package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.List;

public class EnviromentBinding {

    private List<List<BaseBinding>> enviroment;

    public EnviromentBinding() {
        this.enviroment = new ArrayList<>();
    }
    
    public MethodDeclarationBinding findMethodDeclation(){
        
        for (List<BaseBinding> list : enviroment) {
            for (BaseBinding baseBinding : list) {
                
            }
        }
        return null;
    }
    
    public MethodCallBinding findMethodCall(MethodCallBinding find){
        
        for (List<BaseBinding> list : enviroment) {
            for (BaseBinding baseBinding : list) {
                if(find.equals(baseBinding)){
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
