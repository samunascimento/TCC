/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;

/**
 *
 * @author ketleen
 */
public class ParametersBinding extends BaseBinding {

    public ParametersBinding(String name) {
        super(name);
    }

    public ParametersBinding() {
    }
    
       
   @Override
    public String toString(){
        return super.getName() ;
    }
}
