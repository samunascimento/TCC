package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.util.ArrayList;
import java.util.List;

public class EnviromentBinding {

    private List<List<BaseBinding>> enviroment;

    public EnviromentBinding() {
        this.enviroment = new ArrayList<>();
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
