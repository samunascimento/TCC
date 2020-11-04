/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.jungtwo.JungFrame;
import br.ufjf.dcc.gmr.core.chunks.view.View;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ketleen
 */
public class JMenuJungActionListener implements ActionListener {

    JungFrame jungFrame;

    public JMenuJungActionListener(JungFrame jungFrame) {
        this.jungFrame = jungFrame;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        this.jungFrame.paintJung();
    }

}

