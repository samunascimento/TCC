/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ChooserActionPerformed implements ActionListener {
    
    private View view;
    
    public ChooserActionPerformed(View view){
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        clearTable(getView().getTable());
        String filePath = getView().getChooser().getSelectedFile().getAbsoluteFile().toString();
        this.view.getChooser().setVisible(false);
        this.view.getChooserFrame().setVisible(false);
        
        
        InitProject initProject = new InitProject(this.view, filePath, filePath);
        this.view.setInitProject(initProject);
        Thread run = new Thread(initProject);
        run.start();
        
    }

    @SuppressWarnings("empty-statement")
    private void clearTable(JTable table) {
        for (DefaultTableModel model = (DefaultTableModel) table.getModel();table.getRowCount() > 0; model.removeRow(table.getRowCount() - 1));
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
