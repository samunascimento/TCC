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

    private OutmostTypes type;

    public OutmostInformation(OutmostTypes type) {

        this.type = type;
    }

    public OutmostTypes getType() {
        return type;
    }

    public void setType(OutmostTypes type) {
        this.type = type;
    }

}
