/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author icout
 */
public class MenuActionListener implements ActionListener {

    View view;

    public MenuActionListener(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        view.getChooserFrame().setExtendedState(MAXIMIZED_BOTH);
        view.getChooser().setVisible(true);
        view.getChooserFrame().setVisible(true);
    }

}
