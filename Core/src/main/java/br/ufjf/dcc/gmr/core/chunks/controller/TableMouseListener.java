/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JTree;

public class TableMouseListener extends MouseAdapter {

    private JTable table;
    private Project project;
    private View view;

    public TableMouseListener(JTable table, Project project, JTree tree, View view) {
        this.table = table;
        this.project = project;
        this.view = view;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int row = getTable().getSelectedRow();
        if (row < 0) {
            row = 0;
        }
        if (getProject().getVersions().size() >= row) {
            Version version = getProject().getVersions().get(row);
            getView().setTree(version);
        }
    }

    /**
     * @return the project
     */
    public Project getProject() {
        return project;
    }

    /**
     * @return the table
     */
    public JTable getTable() {
        return table;
    }

    /**
     * @return the view
     */
    public View getView() {
        return view;
    }

    /**
     * @param project the project to set
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * @param table the table to set
     */
    public void setTable(JTable table) {
        this.table = table;
    }

    /**
     * @param view the view to set
     */
    public void setView(View view) {
        this.view = view;
    }
}
