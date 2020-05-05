/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

/**
 *
 * @author luan
 */
public class OutmostInformation {
    private String content;
    private OutmostTypes type;
    

    public OutmostInformation(String content, OutmostTypes type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public OutmostTypes getType() {
        return type;
    }

    public void setType(OutmostTypes type) {
        this.type = type;
    }
    
}
