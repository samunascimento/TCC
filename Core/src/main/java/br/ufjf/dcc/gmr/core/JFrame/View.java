package br.ufjf.dcc.gmr.core.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Beatr
 */
public class View extends JFrame {

    JPanel tableChooserPanel;
    JPanel textPanel;
    JScrollPane tableChooserScrollPane;
    JTable table;
    JTextArea textArea;
    JFileChooser chooser;
    JProgressBar progressBar;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem submenu;

    View() {
        tableChooserPanel = new JPanel();
        textPanel = new JPanel();
        chooser = new JFileChooser();
        menuBar = new JMenuBar();
        menu = new JMenu();
        table = new JTable();
        textArea = new JTextArea();
        progressBar = new JProgressBar();
        tableChooserScrollPane = new JScrollPane();
        submenu = new JMenuItem();
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
        chooser.setCurrentDirectory(new java.io.File(""));
        chooser.setRequestFocusEnabled(false);
        chooser.addActionListener(this::chooserActionPerformed);
        chooser.setVisible(false);
        tableChooserPanel.add(chooser, BorderLayout.NORTH);
    }

    private void setTable() {
        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("Tahoma", 0, 18));
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addColumn("sha");
        model.addColumn("status");
        for (int i = 100, j = 0; i >= 0; i--, j++) {
            model.insertRow(0, new Object[]{i, j});
        }
        table.setModel(model);
    }

    private void setMenuBar() {
        submenu.addActionListener(this::openRepository);
        submenu.setText("Open Repository");
        menu.add(submenu);
        menu.setText("File");
        menuBar.setBorder(BorderFactory.createTitledBorder("MENU BAR"));
        menuBar.add(menu);
    }

    private void setTextArea() {
        textArea.setEditable(false);
    }

    private void setProgressBar() {
        progressBar.setPreferredSize(new Dimension(Short.MAX_VALUE, 50));
        progressBar.setBorder(BorderFactory.createTitledBorder("PROGRESS BAR"));
        progressBar.setVisible(false);
        progressBar.setForeground(Color.BLUE);
        progressBar.setValue(50);
        progressBar.setFont(new java.awt.Font("Verdana", 0, 12) {
        });
    }

    private void showPanel() {
        this.add(tableChooserPanel, BorderLayout.WEST);
        this.add(textPanel, BorderLayout.CENTER);
        this.add(menuBar, BorderLayout.NORTH);
        this.add(progressBar, BorderLayout.SOUTH);
        tableChooserPanel.add(tableChooserScrollPane, BorderLayout.CENTER);
        tableChooserScrollPane.setViewportView(table);
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
        //File file = chooser.getSelectedFile().getAbsoluteFile();
        progressBar.setVisible(true);
        Thread run = new Thread(new ProgressBarAction(progressBar));
        chooser.setVisible(false);
        run.start();
    }

    private void openRepository(java.awt.event.ActionEvent evt) {
        chooser.setVisible(true);
    }

    public static void main(String[] args) {
        View frame = new View();
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setMainPanel();
        frame.setVisible(true);
    }

}
