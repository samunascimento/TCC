package br.ufjf.dcc.gmr.core.utils;

public class BaseBinding {
    
    private String name;
    
    public BaseBinding(String name){
        this.name = name;
    }

    public BaseBinding() {
        this.name = "";
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
    
}
