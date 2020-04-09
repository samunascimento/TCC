/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import static br.ufjf.dcc.gmr.core.chunks.view.View.progressBar;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ChooserActionPerformed implements ActionListener {

    private JTable table;
    private JFileChooser chooser;
    private JFrame chooserFrame;
    private Project project;
    private JPanel tableTreePanel;
    private JPanel textPanel;
    private JTextArea textArea;

    public ChooserActionPerformed(JTable table, JFileChooser chooser, JFrame chooserFrame, Project project,
            JPanel tableTreePanel, JPanel textPanel, JTextArea textArea) {
        this.table = table;
        this.chooser = chooser;
        this.chooserFrame = chooserFrame;
        this.project = project;
        this.tableTreePanel = tableTreePanel;
        this.textPanel = textPanel;
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        clearTable(getTable());
        String filePath = getChooser().getSelectedFile().getAbsoluteFile().toString();
        progressBar.setVisible(true);
        getChooser().setVisible(false);
        getChooserFrame().setVisible(false);
        //ProgressBarAction aux = new ProgressBarAction(progressBar, filePath, filePath);
        //Thread run = new Thread(aux);
        //run.start();
        //project = aux.getProject();
        try {
            setProject(InitProject.createProject(filePath, filePath));
        } catch (IOException | LocalRepositoryNotAGitRepository | ParseException | OptionNotExist | RepositoryNotFound | InvalidDocument | UnknownSwitch | RefusingToClean | IsOutsideRepository | CheckoutError | ThereIsNoMergeToAbort | NotSomethingWeCanMerge | NoRemoteForTheCurrentBranch | AlreadyUpToDate | ThereIsNoMergeInProgress ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) getTable().getModel();
        for (int i = 0; i < getProject().getVersions().size(); i++) {
            Version version = getProject().getVersions().get(i);
            model.addRow(new String[]{version.getSHA(), version.getStatus().toString()});
        }
        getTable().setModel(model);
        if (getProject().getVersions().size() > 0) {
            getTableTreePanel().setVisible(true);
            getTextPanel().setVisible(true);
        } else {
            getTextPanel().setVisible(true);
            getTextArea().setText("Empty Project");
            getTextArea().setFont(new Font(null, 1, 15));
        }
        progressBar.setVisible(false);
        getTableTreePanel().setVisible(true);
    }

    @SuppressWarnings("empty-statement")
    private void clearTable(JTable table) {
        for (DefaultTableModel model = (DefaultTableModel) table.getModel();
                table.getRowCount() > 0;
                model.removeRow(table.getRowCount() - 1));
    }

    /**
     * @return the chooser
     */
    public JFileChooser getChooser() {
        return chooser;
    }

    /**
     * @return the chooserFrame
     */
    public JFrame getChooserFrame() {
        return chooserFrame;
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
     * @return the tableTreePanel
     */
    public JPanel getTableTreePanel() {
        return tableTreePanel;
    }

    /**
     * @return the textArea
     */
    public JTextArea getTextArea() {
        return textArea;
    }

    /**
     * @return the textPanel
     */
    public JPanel getTextPanel() {
        return textPanel;
    }

    /**
     * @param chooser the chooser to set
     */
    public void setChooser(JFileChooser chooser) {
        this.chooser = chooser;
    }

    /**
     * @param chooserFrame the chooserFrame to set
     */
    public void setChooserFrame(JFrame chooserFrame) {
        this.chooserFrame = chooserFrame;
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
     * @param tableTreePanel the tableTreePanel to set
     */
    public void setTableTreePanel(JPanel tableTreePanel) {
        this.tableTreePanel = tableTreePanel;
    }

    /**
     * @param textArea the textArea to set
     */
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    /**
     * @param textPanel the textPanel to set
     */
    public void setTextPanel(JPanel textPanel) {
        this.textPanel = textPanel;
    }

}
