/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.JFrame;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author icout
 */
public class ProgressBarAction implements Runnable{
    private JProgressBar progressBar;
    
    public ProgressBarAction(JProgressBar progressBar){
        this.progressBar =  progressBar;
    }
    
    @Override
    public void run() {
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        for(int i = 0; i <= 100; i++){
            try {
                Thread.sleep(100l);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBarAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            progressBar.setValue(i);
        }
        progressBar.setVisible(false);
    }
    
}
