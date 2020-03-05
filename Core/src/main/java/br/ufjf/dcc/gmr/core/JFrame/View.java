package br.ufjf.dcc.gmr.core.JFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Beatr
 */
public class View extends JFrame {

    JPanel tableChooserPanel;
    JPanel textPanel;
    JTable table;
    JTextArea textArea;
    JFileChooser chooser;
    JProgressBar progressBar;
    JMenuBar menuBar;

    View() {
        tableChooserPanel = new JPanel();
        textPanel = new JPanel();
        chooser = new JFileChooser();
        menuBar = new JMenuBar();
        table = new JTable();
        textArea = new JTextArea();
        progressBar = new JProgressBar();
    }

    private void setTableChooserPanel() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tableChooserPanel.setLayout(new BorderLayout());
        tableChooserPanel.setBorder(BorderFactory.createTitledBorder("CHOOSER & TABLE"));
        tableChooserPanel.setPreferredSize(new Dimension(350, Short.MAX_VALUE));

    }

    private void setTextPanel() {
        textPanel.setLayout(new BorderLayout());
        textPanel.setBorder(BorderFactory.createTitledBorder("TEXT"));
    }

    private void setChooser() {
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new java.io.File("C:\\Users\\Beatr\\Desktop"));
        chooser.setRequestFocusEnabled(false);
        chooser.addActionListener(this::chooserActionPerformed);
        tableChooserPanel.add(chooser, BorderLayout.NORTH);

    }

    private void setTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        table.setShowGrid(true);
        for (int i = 0, j = 10; i < 10; i++, j--) {
            Object[] row = {i, j};
            model.addRow(row);
        }

    }

    private void setMenuBar() {
        menuBar.setPreferredSize(new Dimension(Short.MAX_VALUE, 50));
        menuBar.setBorder(BorderFactory.createTitledBorder("MENU BAR"));
    }

    private void setTextArea() {
        textArea.setEditable(false);
    }

    private void setProgressBar() {
        progressBar.setPreferredSize(new Dimension(Short.MAX_VALUE, 50));
        progressBar.setBorder(BorderFactory.createTitledBorder("PROGRESS BAR"));
        progressBar.setVisible(false);
    }

    private void showPanel() {
        this.add(tableChooserPanel, BorderLayout.WEST);
        this.add(textPanel, BorderLayout.CENTER);
        this.add(menuBar, BorderLayout.NORTH);
        this.add(progressBar, BorderLayout.SOUTH);
        tableChooserPanel.add(table, BorderLayout.CENTER);
        textPanel.add(textArea, BorderLayout.CENTER);
        this.setVisible(true);
    }

    private void setMainPanel() {
        setTextPanel();
        setTableChooserPanel();
        setMenuBar();
        setChooser();
        setTable();
        setTextArea();
        setProgressBar();
        showPanel();
    }

    private void chooserActionPerformed(java.awt.event.ActionEvent evt) {
        progressBar.setVisible(true);
        File file = chooser.getSelectedFile().getAbsoluteFile();
    }

    public static void main(String[] args) {
        View frame = new View();frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setMainPanel();
        frame.setVisible(true);
    }

}
