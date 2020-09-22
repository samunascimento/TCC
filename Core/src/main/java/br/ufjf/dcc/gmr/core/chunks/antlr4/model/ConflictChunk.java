/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.model;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.BaseBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.TypeBinding;
import java.util.List;

/**
 *
 * @author felip
 */
public class ConflictChunk {
    
    private LanguageConstruct languageConstructLiteral;
    private List<BaseBinding> languageConstructBindings;
    private String filePath;

    public ConflictChunk(LanguageConstruct languageConstructLiteral, List<BaseBinding> languageConstructBaseBindings, String typeBindingPath) {
        this.languageConstructLiteral = languageConstructLiteral;
        this.languageConstructBindings = languageConstructBaseBindings;
        this.filePath = typeBindingPath;
    }

    public ConflictChunk() {
    }

    public LanguageConstruct getLanguageConstructLiteral() {
        return languageConstructLiteral;
    }

    public void setLanguageConstructLiteral(LanguageConstruct languageConstructLiteral) {
        this.languageConstructLiteral = languageConstructLiteral;
    }

    public List<BaseBinding> getLanguageConstructBindings() {
        return languageConstructBindings;
    }

    public void setLanguageConstructBindings(List<BaseBinding> languageConstructBindings) {
        this.languageConstructBindings = languageConstructBindings;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    
    
    
    
}
