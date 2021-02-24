/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr4.ParserJava;
import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import br.ufjf.dcc.gmr.core.vcs.types.MergeStatus;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuFilterActionListener implements ActionListener {

    private View view;

    public MenuFilterActionListener(View view) {
        this.view = view;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!this.view.getProject().getName().equals("")) {            
            clearTable(getView().getTable());
            paintTable();
        }
    }

    @SuppressWarnings("empty-statement")
    private void clearTable(JTable table) {
        for (DefaultTableModel model = (DefaultTableModel) table.getModel(); table.getRowCount() > 0; model.removeRow(table.getRowCount() - 1));
    }

    private void paintTable() {
        List<Version> versions = this.view.getProject().getVersions();
        DefaultTableModel model = (DefaultTableModel) this.view.getTable().getModel();

        if (this.view.getMenuFilterCheckBox().isSelected()) {
            for (int i = 0; i < versions.size(); i++) {
                Version version = versions.get(i);
                if (version.getStatus().equals(MergeStatus.CONFLICT)) {
                    model.addRow(new String[]{version.getSHA(), version.getStatus().toString()});
                }
            }
        } else {
            for (int i = 0; i < versions.size(); i++) {
                Version version = versions.get(i);
                model.addRow(new String[]{version.getSHA(), version.getStatus().toString()});
            }
        }
        this.view.getTable().setModel(model);
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
