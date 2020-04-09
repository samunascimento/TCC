package br.ufjf.dcc.gmr.core.chunks.view;

import br.ufjf.dcc.gmr.core.chunks.controller.ChooserActionPerformed;
import br.ufjf.dcc.gmr.core.chunks.controller.JTreeMouseListener;
import br.ufjf.dcc.gmr.core.chunks.controller.TableMouseListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
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
import br.ufjf.dcc.gmr.core.vcs.types.MyFile;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.util.List;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Beatr
 */
public class View extends JFrame {

    JPanel tableTreePanel;
    JPanel textPanel;
    JScrollPane tableScrollPane;
    JScrollPane treeScrollPane;
    JTable table;
    JTextArea textArea;
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
        tableTreePanel = new JPanel();
        textPanel = new JPanel();
        treeScrollPane = new JScrollPane();
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
        tree.setVisible(false);
    }

    private void setTreeScrollPane() {
        treeScrollPane.setPreferredSize(new Dimension(195, (int) tableTreePanel.getPreferredSize().getHeight()));
        treeScrollPane.setVisible(false);
    }

    private void setTableScrollPane() {
        tableScrollPane.setPreferredSize(new Dimension(295, (int) tableTreePanel.getPreferredSize().getHeight()));
    }

    private void setTableTreePanel() {
        tableTreePanel.setPreferredSize(new Dimension(305, this.getHeight() - (int) menuBar.getPreferredSize().getHeight() - 45));
        tableTreePanel.setVisible(false);
    }

    private void setTextPanel() {
        textPanel.setLayout(new BorderLayout());
    }

    public void setTree(Version version) {
        List<MyFile> files = version.getFile();
        if (files.size() > 0) {
            DefaultMutableTreeNode shaTree = new DefaultMutableTreeNode(version.getSHA());
            tree = new JTree(shaTree);
            tree.addMouseListener(new JTreeMouseListener(tree));
            tree.setShowsRootHandles(true);
            for (MyFile file : files) {
                shaTree.add(createNodes(file));
            }
            tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
            tree.setLayout(new BorderLayout());
            tree.setVisible(true);
        } else {
            DefaultMutableTreeNode emptyNode = new DefaultMutableTreeNode("Empty tree");
            tree = new JTree(emptyNode);
            tree.setVisible(true);
        }
        treeScrollPane.setVisible(true);
        tableTreePanel.setPreferredSize(new Dimension(500, (int) tableTreePanel.getPreferredSize().getHeight()));
        treeScrollPane.setViewportView(tree);
        treeScrollPane.updateUI();
        tableTreePanel.updateUI();
    }

    private DefaultMutableTreeNode createNodes(MyFile file) {
        DefaultMutableTreeNode fileTree = new DefaultMutableTreeNode(file.getPath());//encontrar caminho relativo
        for (int i = 0; i < file.getChuncks().size(); i++) { //verificar porque a lista de chuncks está vazia
            int lineNumber = file.getChuncks().get(i).getBegin().getLineNumber();
            DefaultMutableTreeNode chunkTree = new DefaultMutableTreeNode(lineNumber);
            fileTree.add(chunkTree);
        }
        return fileTree;
    }

    private void setChooser() {
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new java.io.File(""));
        chooser.setRequestFocusEnabled(false);
        chooser.addActionListener(new ChooserActionPerformed(table,chooser,chooserFrame,project,tableTreePanel,textPanel,textArea));
        chooser.setVisible(false);
    }

    private void setTable() {
        table.addMouseListener(new TableMouseListener(table, project, tree, this));
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
        menuBar.setPreferredSize(new Dimension(Short.MAX_VALUE, 30));
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

    private void openRepository(java.awt.event.ActionEvent evt) {
        chooserFrame.setExtendedState(MAXIMIZED_BOTH);
        chooser.setVisible(true);
        chooserFrame.setVisible(true);
    }

    private void showPanel() {
        this.add(tableTreePanel, BorderLayout.WEST);
        this.add(textPanel, BorderLayout.CENTER);
        this.add(menuBar, BorderLayout.NORTH);
        this.add(progressBar, BorderLayout.SOUTH);

        tableTreePanel.add(tableScrollPane, BorderLayout.CENTER);
        tableTreePanel.add(treeScrollPane, BorderLayout.EAST);

        tableScrollPane.setViewportView(table);

        textPanel.add(textArea, BorderLayout.CENTER);

        chooserFrame.add(chooser, BorderLayout.CENTER);

        this.setVisible(true);
    }

    private void setMainPanel() {
        setMenuBar();
        setTableTreePanel();
        setTextPanel();
        setTreeScrollPane();
        setTableScrollPane();
        setTable();
        setTextArea();
        setChooser();
        setProgressBar();
        showPanel();
    }

    public static void main(String[] args) {
        View frame = new View();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setMainPanel();
        frame.setVisible(true);
    }
}
