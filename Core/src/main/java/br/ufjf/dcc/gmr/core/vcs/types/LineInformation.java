/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

/**
 *Type used in diff to control the lines
 *
 * @author gleiph
 */
public class LineInformation {
    
    String content;
    LineType type;

    public LineInformation(String content, LineType type) {
        this.content = content;
        this.type = type;
    }

    @Override
    public String toString() {
        if(type == LineType.ADDED)
            return "+".concat(this.content);
        else
            return "-".concat(this.content);
    }
    
    
    
}
