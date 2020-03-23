package br.ufjf.dcc.gmr.core.JFrame;

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
import br.ufjf.dcc.gmr.core.vcs.types.Chunk;
import br.ufjf.dcc.gmr.core.vcs.types.File;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTree;
import javax.swing.text.html.parser.DTDConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

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
    public static JProgressBar progressBar;
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

    private void setTree(Version version) {
        if (project.getVersions().size() > 0) {
            DefaultMutableTreeNode shaTree = new DefaultMutableTreeNode(version.getSHA());
            for (int i = 0; i < version.getFile().size(); i++) {
                createNodes(shaTree, version.getFile().get(i));
            }
            tree = new JTree(shaTree);
            tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
            tree.setLayout(new BorderLayout());
            tablePanel.add(tree, BorderLayout.EAST);
            tree.setVisible(true);
            
        }else{
            DefaultMutableTreeNode emptyNode = new DefaultMutableTreeNode("Empty tree");
            tree = new JTree(emptyNode);
            tablePanel.add(tree, BorderLayout.EAST);
            tree.setVisible(true);
        }
    }

    private void createNodes(DefaultMutableTreeNode SHAroot, File file) {
        DefaultMutableTreeNode fileTree = new DefaultMutableTreeNode(file.getPath());
        SHAroot.add(fileTree);
        for (int i = 0; i < file.getChuncks().size(); i++) {
            DefaultMutableTreeNode chunkTree = new DefaultMutableTreeNode(file.getChuncks().get(i).getBegin().getLineNumber());
            fileTree.add(chunkTree);
        }
    }

    private void setChooser() {
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new java.io.File(""));
        chooser.setRequestFocusEnabled(false);
        chooser.addActionListener(this::chooserActionPerformed);
        chooser.setVisible(false);
    }

    private void setTable() {
        table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableFocusGained(evt);
            }
        });
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
        chooser.setVisible(false);
        chooserFrame.setVisible(false);
        //ProgressBarAction aux = new ProgressBarAction(progressBar, filePath, filePath);
        //Thread run = new Thread(aux);
        //run.start();
        //project = aux.getProject();
        try {
            project = InitProject.createProject(filePath, filePath);
        } catch (IOException | LocalRepositoryNotAGitRepository | ParseException | OptionNotExist | RepositoryNotFound | InvalidDocument | UnknownSwitch | RefusingToClean | IsOutsideRepository | CheckoutError | ThereIsNoMergeToAbort | NotSomethingWeCanMerge | NoRemoteForTheCurrentBranch | AlreadyUpToDate | ThereIsNoMergeInProgress ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < project.getVersions().size(); i++) {
            Version version = project.getVersions().get(i);
            model.insertRow(0, new String[]{version.getSHA(), version.getStatus().toString()});
        }
        table.setModel(model);
        if (project.getVersions().size() > 0) {
            tablePanel.setVisible(true);
            textPanel.setVisible(true);
        } else {
            textPanel.setVisible(true);
            textArea.setText("Empty Project");
            textArea.setFont(new Font(null, 1, 15));
        }
        progressBar.setVisible(false);

    }

    private void tableFocusGained(java.awt.event.FocusEvent evt) {
        //setTree(project.getVersionBySHA(table.getValueAt(table.getSelectedRow(),0)));
        setTree(project.getVersions().get(0));
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
