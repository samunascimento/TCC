/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

import java.util.*;

/**
 *
 * @author ketleen
 */
public class GlobalEnviroment {
    
    private Map<String, TypeBinding> enviroment;
        
    public GlobalEnviroment() {
        this.enviroment = new HashMap<>();
    }
    public Map<String, TypeBinding> getEnviroment() {
        return enviroment;
    }
    public void setEnviroment(Map<String, TypeBinding> enviroment) {
        this.enviroment = enviroment;
    }
}
