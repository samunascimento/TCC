package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr4.ParserJava;
import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeMouseListener extends MouseAdapter {

    private View view;
    private Version version;
    private JTextArea textArea;

    public JTreeMouseListener(View view, Version version) {
        this.view = view;
        this.version = version;
        this.textArea = view.getTextArea();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        getTextArea().setText("");
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) getView().getTree().getLastSelectedPathComponent();
        if (selectedNode != null) {
            ConflictChunk chunk = null;
            try {
                chunk = (ConflictChunk) selectedNode.getUserObject();
                List<String> afterContext = chunk.getAfterContext().getText();
                List<String> beforeContext = chunk.getBeforeContext().getText();

                int i = chunk.getBeforeContext().getLineBegin();
                for (String content : beforeContext) {
                    clearTable(this.view.getTable1());
                    DefaultTableModel model = (DefaultTableModel) this.view.getTable1().getModel();
                    model.addRow(new String[]{i + " - " + content + "\n"});
                    this.view.getTable1().setModel(model);
                    i++;
                }

                i = chunk.getBegin().getLineNumber();
                for (String content : chunk.getErrorContent()) {
                    clearTable(this.view.getTable2());
                    DefaultTableModel model = (DefaultTableModel) this.view.getTable2().getModel();
                    model.addRow(new String[]{i + " - " + content + "\n"});
                    this.view.getTable2().setModel(model);
                    i++;
                }
                
                i = chunk.getAfterContext().getLineBegin();
                for (String content : afterContext) {
                    clearTable(this.view.getTable3());
                    DefaultTableModel model = (DefaultTableModel) this.view.getTable3().getModel();
                    model.addRow(new String[]{i + " - " + content + "\n"});
                    this.view.getTable3().setModel(model);
                    i++;
                }
               
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private void clearTable(JTable table) {
        for (DefaultTableModel model = (DefaultTableModel) table.getModel(); table.getRowCount() > 0; model.removeRow(table.getRowCount() - 1));
    }

    /**
     * @return the textArea
     */
    public JTextArea getTextArea() {
        return textArea;
    }

    /**
     * @return the version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * @return the view
     */
    public View getView() {
        return view;
    }

    /**
     * @param textArea the textArea to set
     */
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Version version) {
        this.version = version;
    }

    /**
     * @param view the view to set
     */
    public void setView(View view) {
        this.view = view;
    }
}
