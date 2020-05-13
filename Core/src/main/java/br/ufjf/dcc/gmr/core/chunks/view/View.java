package br.ufjf.dcc.gmr.core.chunks.view;

import br.ufjf.dcc.gmr.core.chunks.controller.*;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import br.ufjf.dcc.gmr.core.vcs.types.Chunk;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import br.ufjf.dcc.gmr.core.vcs.types.MyFile;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

public final class View extends JFrame {

    private JFrame chooserFrame;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JScrollPane treePane;
    private JTable table;
    private JTextArea textArea;
    private JFileChooser chooser;
    private JProgressBar progressBar;
    JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuOptions;
    private JMenuItem submenu;
    private InitProject initProject;
    private Project project;
    private JTree tree;
    private int screenWidth;
    private int screenHight;

    View() {
        this.tree = new JTree();
        this.table = new JTable();
        this.leftPanel = new JPanel();
        this.rightPanel = new JPanel();
        this.treePane = new JScrollPane(getTree());
        this.chooser = new JFileChooser();
        this.menuBar = new JMenuBar();
        this.menuFile = new JMenu();
        this.menuOptions = new JMenu();
        this.textArea = new JTextArea();
        this.progressBar = new JProgressBar();
        this.submenu = new JMenuItem();
        this.initProject = new InitProject();
        this.project = new Project();
        this.chooserFrame = new JFrame();
        this.screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 20;
        this.screenHight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 20;
    }

    private void paintTreePane() {
        int leftPanelHight = (int) this.leftPanel.getPreferredSize().getHeight();
        this.treePane.setPreferredSize(new Dimension(180, leftPanelHight));
        this.treePane.setVisible(false);
    }

    private void paintLeftPanel() {
        int menuBarHight = (int) this.menuBar.getPreferredSize().getHeight();
        this.leftPanel.setLayout(new BorderLayout());
        this.leftPanel.setPreferredSize(new Dimension(300, getScreenHight() - menuBarHight));
        this.leftPanel.setVisible(false);
    }

    private void paintRightPanel() {
        this.rightPanel.setLayout(new BorderLayout());
        int leftPanelHight = (int) this.leftPanel.getPreferredSize().getHeight();
        int leftPanelWidth = (int) this.leftPanel.getPreferredSize().getWidth();
        this.rightPanel.setPreferredSize(new Dimension(getScreenWidth() - leftPanelWidth, leftPanelHight));
    }

    public void paintTree(Version version) {
        List<MyFile> files = version.getFile();
        if (files.size() > 0) {
            DefaultMutableTreeNode shaTree = new DefaultMutableTreeNode(version.getSHA());
            DefaultTreeModel model = new DefaultTreeModel(shaTree);
            this.tree.setModel(model);
            this.tree.addMouseListener(new JTreeMouseListener(this, version));
            this.tree.setShowsRootHandles(true);
            for (MyFile file : files) {
                shaTree.add(createNodes(file));
            }
            this.tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        } else {
            DefaultMutableTreeNode emptyNode = new DefaultMutableTreeNode("Empty tree");
            DefaultTreeModel model = new DefaultTreeModel(emptyNode);
            this.tree.setModel(model);
        }
        this.tree.setVisible(true);
        int leftPanelHight = (int) this.leftPanel.getPreferredSize().getHeight();
        this.leftPanel.setPreferredSize(new Dimension(500, leftPanelHight));
        this.treePane.setVisible(true);
        this.treePane.updateUI();
        this.leftPanel.updateUI();
    }

    private DefaultMutableTreeNode createNodes(MyFile file) {
        DefaultMutableTreeNode fileTree = new DefaultMutableTreeNode(file);//encontrar caminho relativo

        for (int i = 0; i < file.getChuncks().size(); i++) {
            Chunk chunk = file.getChuncks().get(i);
            DefaultMutableTreeNode chunkTree = new DefaultMutableTreeNode(chunk);
            fileTree.add(chunkTree);
        }
        return fileTree;
    }

    private void paintChooser() {
        this.chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        this.chooser.setCurrentDirectory(new java.io.File(""));
        this.chooser.setRequestFocusEnabled(false);
        this.chooser.addActionListener(new ChooserActionPerformed(this));
        this.chooser.setVisible(false);
    }

    private void paintTable() {
        this.table.addMouseListener(new TableMouseListener(this));
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();
        model.addColumn("sha");
        model.addColumn("status");
        this.table.setModel(model);
    }

    private void paintMenuBar() {
        this.menuBar.setPreferredSize(new Dimension(getScreenWidth(), 30));
        this.submenu.addActionListener(new MenuFileActionListener(this));
        this.submenu.setText("Open Repository");
        this.menuFile.add(this.submenu);
        this.menuFile.setText("File");
        this.menuBar.add(this.menuFile);
        this.menuOptions.addMouseListener(new MenuOptionsActionListener(this));
        this.menuOptions.setText("Options");
        this.menuBar.add(this.menuOptions);
    }

    private void paintTextArea() {
        this.textArea.setLayout(new BorderLayout());
        this.textArea.setEditable(false);
    }

    private void paintProgressBar() {
        this.progressBar.setPreferredSize(new Dimension(getScreenWidth(), 50));
        this.progressBar.setStringPainted(true);
        this.progressBar.setVisible(false);
    }

    private void paintPanel() {
        this.add(this.leftPanel, BorderLayout.WEST);
        this.add(this.rightPanel, BorderLayout.CENTER);
        this.add(menuBar, BorderLayout.NORTH);
        this.add(this.progressBar, BorderLayout.SOUTH);

        this.leftPanel.add(new JScrollPane(table), BorderLayout.CENTER);
        this.leftPanel.add(getTreePane(), BorderLayout.EAST);

        this.rightPanel.add(getTextArea(), BorderLayout.CENTER);

        this.chooserFrame.add(this.chooser, BorderLayout.CENTER);

        this.setVisible(true);
    }

    private void paintMainPanel() {
        paintMenuBar();
        paintLeftPanel();
        paintRightPanel();
        paintTreePane();
        paintTable();
        paintTextArea();
        paintChooser();
        paintProgressBar();
        paintPanel();
    }

    public static void main(String[] args) {
        View frame = new View();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
        
        frame.setPreferredSize(new Dimension(frame.getScreenWidth(), frame.getScreenHight()));
        frame.paintMainPanel();
        frame.setVisible(true);
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
     * @return the initProject
     */
    public InitProject getInitProject() {
        return initProject;
    }

    /**
     * @return the leftPanel
     */
    public JPanel getLeftPanel() {
        return leftPanel;
    }

    /**
     * @return the menuFile
     */
    public JMenu getMenuFile() {
        return menuFile;
    }

    /**
     * @return the progressBar
     */
    public JProgressBar getProgressBar() {
        return progressBar;
    }

    /**
     * @return the project
     */
    public Project getProject() {
        return project;
    }

    /**
     * @return the rightPanel
     */
    public JPanel getRightPanel() {
        return rightPanel;
    }

    /**
     * @return the screenHight
     */
    public int getScreenHight() {
        return screenHight;
    }

    /**
     * @return the screenWidth
     */
    public int getScreenWidth() {
        return screenWidth;
    }

    /**
     * @return the submenu
     */
    public JMenuItem getSubmenuFile() {
        return submenu;
    }

    /**
     * @return the table
     */
    public JTable getTable() {
        return table;
    }

    /**
     * @return the textArea
     */
    public JTextArea getTextArea() {
        return textArea;
    }

    /**
     * @return the tree
     */
    public JTree getTree() {
        return tree;
    }

    /**
     * @return the treePane
     */
    public JScrollPane getTreePane() {
        return treePane;
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
     * @param initProject the initProject to set
     */
    public void setInitProject(InitProject initProject) {
        this.initProject = initProject;
    }

    /**
     * @param leftPanel the leftPanel to set
     */
    public void setLeftPanel(JPanel leftPanel) {
        this.leftPanel = leftPanel;
    }

    /**
     * @param menu the menuFile to set
     */
    public void setMenuFile(JMenu menu) {
        this.menuFile = menu;
    }

    /**
     * @param progressBar the progressBar to set
     */
    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    /**
     * @param project the project to set
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * @param rightPanel the rightPanel to set
     */
    public void setRightPanel(JPanel rightPanel) {
        this.rightPanel = rightPanel;
    }

    /**
     * @param screenHight the screenHight to set
     */
    public void setScreenHight(int screenHight) {
        this.screenHight = screenHight;
    }

    /**
     * @param screenWidth the screenWidth to set
     */
    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    /**
     * @param submenu the submenu to set
     */
    public void setSubmenuFile(JMenuItem submenu) {
        this.submenu = submenu;
    }

    /**
     * @param table the table to set
     */
    public void setTable(JTable table) {
        this.table = table;
    }

    /**
     * @param textArea the textArea to set
     */
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    /**
     * @param tree the tree to set
     */
    public void setTree(JTree tree) {
        this.tree = tree;
    }

    /**
     * @param treeScrollPane the treePane to set
     */
    public void setTreePane(JScrollPane treeScrollPane) {
        this.treePane = treeScrollPane;
    }

    /**
     * @return the menuOptions
     */
    public JMenu getMenuOptions() {
        return menuOptions;
    }

    /**
     * @param menuOptions the menuOptions to set
     */
    public void setMenuOptions(JMenu menuOptions) {
        this.menuOptions = menuOptions;
    }
}
