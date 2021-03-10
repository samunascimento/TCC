/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp;


import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author ketleen
 */
public class VariableUsageBinding extends BaseBinding {

    
    
    private VariableDeclarationBinding variableDeclarationBinding;
    private ParserRuleContext ctx;
    private String usageString;
    
    public VariableUsageBinding(){
        
    }
    
    public VariableUsageBinding(VariableDeclarationBinding variableDeclarationBinding, ParserRuleContext ctx, String usageString) {
        this.variableDeclarationBinding = variableDeclarationBinding;
        this.ctx = ctx;
        this.usageString = usageString;
    }

    public VariableDeclarationBinding getVariableDeclarationBinding() {
        return variableDeclarationBinding;
    }

    public void setVariableDeclarationBinding(VariableDeclarationBinding variableDeclarationBinding) {
        this.variableDeclarationBinding = variableDeclarationBinding;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }

    public void setCtx(ParserRuleContext ctx) {
        this.ctx = ctx;
    }

    public String getUsageString() {
        return usageString;
    }

    public void setUsageString(String usageString) {
        this.usageString = usageString;
    }
      @Override
    public String toString(){
        return getCtx().getText();
    }
}
