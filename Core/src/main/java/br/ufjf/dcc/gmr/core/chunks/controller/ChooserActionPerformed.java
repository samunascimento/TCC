/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.exception.*;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        getView().getProgressBar().setVisible(true);
        getView().getChooser().setVisible(false);
        getView().getChooserFrame().setVisible(false);
        //ProgressBarAction aux = new ProgressBarAction(progressBar, filePath, filePath);
        //Thread run = new Thread(aux);
        //run.start();
        //project = aux.getProject();
        try {
            getView().setProject(InitProject.createProject(filePath, filePath));
        } catch (IOException | LocalRepositoryNotAGitRepository | ParseException | OptionNotExist | RepositoryNotFound | InvalidDocument | UnknownSwitch | RefusingToClean | IsOutsideRepository | CheckoutError | ThereIsNoMergeToAbort | NotSomethingWeCanMerge | NoRemoteForTheCurrentBranch | AlreadyUpToDate | ThereIsNoMergeInProgress ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) getView().getTable().getModel();
        for (int i = 0; i < getView().getProject().getVersions().size(); i++) {
            Version version =getView().getProject().getVersions().get(i);
            model.addRow(new String[]{version.getSHA(), version.getStatus().toString()});
        }
        getView().getTable().setModel(model);
        if (getView().getProject().getVersions().size() > 0) {
            getView().getLeftPanel().setVisible(true);
            getView().getRightPanel().setVisible(true);
        } else {
            getView().getRightPanel().setVisible(true);
            getView().getTextArea().setText("Empty Project");
            getView().getTextArea().setFont(new Font(null, 1, 15));
        }
        getView().getProgressBar().setVisible(false);
        getView().getLeftPanel().setVisible(true);
    }

    @SuppressWarnings("empty-statement")
    private void clearTable(JTable table) {
        for (DefaultTableModel model = (DefaultTableModel) table.getModel();
                table.getRowCount() > 0;
                model.removeRow(table.getRowCount() - 1));
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
