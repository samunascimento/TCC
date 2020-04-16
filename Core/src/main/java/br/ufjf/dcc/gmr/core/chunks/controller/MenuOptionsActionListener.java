/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.controller;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import static br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp.CPP14Parser.New;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuOptionsActionListener extends MouseAdapter {

    private View view;
    private JPanel leftPanel;
    private JComboBox<Integer> comboBox;
    private JTextArea textArea;

    public MenuOptionsActionListener(View view) {
        this.view = view;
        this.comboBox = new JComboBox<>();
        this.leftPanel = new JPanel();
        this.textArea = new JTextArea();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        this.view.getOptionFrame().setLayout(new BorderLayout());
        this.view.getOptionFrame().setSize(new Dimension(500, 500));
        this.view.getOptionFrame().setResizable(false);

        DefaultComboBoxModel<Integer> model = new DefaultComboBoxModel<>(new Integer[]{0, 5, 10, 15});
        this.comboBox.setModel(model);
        this.comboBox.setPreferredSize(new Dimension(50, 20));

        this.leftPanel.setLayout(new BorderLayout());
        this.leftPanel.setPreferredSize(new Dimension(100, 50));

        this.textArea.setPreferredSize(new Dimension(100, 50));
        this.textArea.setText("Context lines:");
        this.textArea.setEditable(false);
        this.textArea.setBackground(leftPanel.getBackground());

        this.leftPanel.add(this.comboBox, BorderLayout.CENTER);
        this.leftPanel.add(this.textArea, BorderLayout.WEST);
        this.view.getOptionFrame().add(this.leftPanel, BorderLayout.PAGE_END);

        this.comboBox.setVisible(true);
        this.leftPanel.setVisible(true);
        this.view.getOptionFrame().setVisible(true);

    }

    /**
     * @return the comboBox
     */
    public JComboBox<Integer> getComboBox() {
        return comboBox;
    }

    /**
     * @return the leftPanel
     */
    public JPanel getLeftPanel() {
        return leftPanel;
    }

    /**
     * @return the view
     */
    public View getView() {
        return view;
    }

    /**
     * @param comboBox the comboBox to set
     */
    public void setComboBox(JComboBox<Integer> comboBox) {
        this.comboBox = comboBox;
    }

    /**
     * @param leftPanel the leftPanel to set
     */
    public void setLeftPanel(JPanel leftPanel) {
        this.leftPanel = leftPanel;
    }

    /**
     * @param view the view to set
     */
    public void setView(View view) {
        this.view = view;
    }

}
