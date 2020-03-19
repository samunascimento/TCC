package br.ufjf.dcc.gmr.core.JFrame;

import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import java.awt.Color;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTree;

/**
 *
 * @author Beatr
 */
public class View extends JFrame {

    JPanel tablePanel;
    JPanel textPanel;
    JScrollPane tableScrollPane;
    JTable table;
    private JTextArea textArea;
    JFileChooser chooser;
    JProgressBar progressBar;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem submenu;
    InitProject initProject;
    Project project;
    JFrame chooserFrame;
    JTree tree;
    
    View() {
        tablePanel = new JPanel();
        textPanel = new JPanel();
        chooser = new JFileChooser();
        menuBar = new JMenuBar();
        menu = new JMenu();
        table = new JTable();
        textArea = new JTextArea();
        progressBar = new JProgressBar();
        tableScrollPane = new JScrollPane();
        submenu = new JMenuItem();
        initProject = new InitProject();
        project = new Project();
        chooserFrame = new JFrame();
        tree = new JTree();
    }

    private void setTableChooserPanel() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tablePanel.setLayout(new BorderLayout());
        tablePanel.setPreferredSize(new Dimension(500, Short.MAX_VALUE));
        tablePanel.setVisible(false);

    }

    private void setTextPanel() {
        textPanel.setLayout(new BorderLayout());
        textPanel.setVisible(false);
    }
    
    private void setTree(){
        tree.setVisible(false);
        tree.setLayout(new BorderLayout());
    }
    
    private void setChooser() {
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new java.io.File(""));
        chooser.setRequestFocusEnabled(false);
        chooser.addActionListener(this::chooserActionPerformed);
        chooser.setVisible(false);
    }

    private void setTable() {
        table.setAutoCreateRowSorter(true);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addColumn("sha");
        model.addColumn("status");
        table.setModel(model);
    }

    @SuppressWarnings("empty-statement")
    private void clearTable(JTable table) {
        for (DefaultTableModel model = (DefaultTableModel) table.getModel();
                table.getRowCount() > 0;
                model.removeRow(table.getRowCount() - 1));
    }

    private void setMenuBar() {
        submenu.addActionListener(this::openRepository);
        submenu.setText("Open Repository");
        menu.add(submenu);
        menu.setText("File");
        menuBar.add(menu);
    }

    private void setTextArea() {
        textArea.setEditable(false);
    }

    private void setProgressBar() {
        progressBar.setPreferredSize(new Dimension(Short.MAX_VALUE, 50));
        progressBar.setStringPainted(true);
        progressBar.setVisible(false);
    }

    private void chooserActionPerformed(java.awt.event.ActionEvent evt) {
        clearTable(table);
        String filePath = chooser.getSelectedFile().getAbsoluteFile().toString();
        progressBar.setVisible(true);
        Thread run = new Thread(new ProgressBarAction(progressBar));
        chooser.setVisible(false);
        chooserFrame.setVisible(false);
        run.start();
        System.out.println(project.getVersions().size());
        try {
            project = initProject.project(filePath, filePath);
        } catch (IOException | LocalRepositoryNotAGitRepository | ParseException | OptionNotExist | RepositoryNotFound | CheckoutError | NoRemoteForTheCurrentBranch | ThereIsNoMergeInProgress | NotSomethingWeCanMerge | ThereIsNoMergeToAbort | AlreadyUpToDate ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < project.getVersions().size(); i++) {
            model.insertRow(0, new Object[]{project.getVersions().get(i), project.getVersions().get(i).getFile().get(i).getStatus()});
        }
        table.setModel(model);
        tablePanel.setVisible(true);
        textPanel.setVisible(true);
        tree.setVisible(true);
    }

    private void openRepository(java.awt.event.ActionEvent evt) {
        chooserFrame.setExtendedState(MAXIMIZED_BOTH);
        chooser.setVisible(true);
        chooserFrame.setVisible(true);
    }

    private void showPanel() {
        this.add(tablePanel, BorderLayout.WEST);
        this.add(textPanel, BorderLayout.CENTER);
        this.add(menuBar, BorderLayout.NORTH);
        this.add(progressBar, BorderLayout.SOUTH);
        tablePanel.add(tableScrollPane, BorderLayout.CENTER);
        tablePanel.add(tree,BorderLayout.EAST);
        tableScrollPane.setViewportView(table);
        textPanel.add(getTextArea(), BorderLayout.CENTER);
        this.setVisible(true);
        chooserFrame.add(chooser, BorderLayout.CENTER);
    }

    private void setMainPanel() {
        setTextPanel();
        setTableChooserPanel();
        setMenuBar();
        setChooser();
        setTable();
        setTextArea();
        setProgressBar();
        setTree();
        showPanel();
    }

    public static void main(String[] args) {
        View frame = new View();
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setMainPanel();
        frame.setVisible(true);
    }

    /**
     * @return the textArea
     */
    public JTextArea getTextArea() {
        return textArea;
    }

    /**
     * @param textArea the textArea to set
     */
    private void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

}
