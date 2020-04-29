/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class MenuOptionsActionListener extends MouseAdapter {

    private View view;

    public MenuOptionsActionListener(View view) {
        this.view = view;

    }

    @Override
    public void mouseClicked(MouseEvent me) {
        String aux = JOptionPane.showInputDialog("Context lines:");
        int contextLines;
        if(aux.matches("[^0-9]"))
            System.out.println("erro");
        else
            contextLines = Integer.parseInt(aux);
    }

    /**
     * @return the view
     */
    public View getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(View view) {
        this.view = view;
    }

}
