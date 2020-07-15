package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.HashMap;
import java.util.Map;

public class GlobalEnviroment {
    
    private Map<String, TypeBinding> globalEnviroment;
    
    public GlobalEnviroment() {
        this.globalEnviroment = new HashMap<>();
    }

    /**
     * @return the globalEnviroment
     */
    public Map<String, TypeBinding> getGlobalEnviroment() {
        return globalEnviroment;
    }

    /**
     * @param globalEnviroment the globalEnviroment to set
     */
    public void setGlobalEnviroment(Map<String, TypeBinding> globalEnviroment) {
        this.globalEnviroment = globalEnviroment;
    }


    
}
