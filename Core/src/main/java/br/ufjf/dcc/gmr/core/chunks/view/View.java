package br.ufjf.dcc.gmr.core.chunks.view;

import br.ufjf.dcc.gmr.core.chunks.controller.*;
import br.ufjf.dcc.gmr.core.principal.InitProject;
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

    private JPanel leftPanel;
    private JPanel rightPanel;
    private JScrollPane treePane;
    private JTable table;
    private JTextArea textArea;
    private JFileChooser chooser;
    private JProgressBar progressBar;
    JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem submenu;
    private InitProject initProject;
    private Project project;
    private JFrame chooserFrame;
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
        this.menu = new JMenu();
        this.textArea = new JTextArea();
        this.progressBar = new JProgressBar();
        this.submenu = new JMenuItem();
        this.initProject = new InitProject();
        this.project = new Project();
        this.chooserFrame = new JFrame();
        this.screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 20;
        this.screenHight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 20;
    }

    private void paintTreePane() {
        int leftPanelHight = (int) getLeftPanel().getPreferredSize().getHeight();
        getTreeScrollPane().setPreferredSize(new Dimension(180, leftPanelHight));
        getTreeScrollPane().setVisible(false);
    }

    private void paintTablePanel() {
        int leftPanelHight = (int) getLeftPanel().getPreferredSize().getHeight();
        int leftPanelWidth = (int) getLeftPanel().getPreferredSize().getWidth();
    }

    private void paintLeftPanel() {
        int menuBarHight = (int) menuBar.getPreferredSize().getHeight();
        this.leftPanel.setLayout(new BorderLayout());
        getLeftPanel().setPreferredSize(new Dimension(300, getScreenHight() - menuBarHight));
        getLeftPanel().setVisible(false);
    }

    private void paintRightPanel() {
        int leftPanelHight = (int) getLeftPanel().getPreferredSize().getHeight();
        int leftPanelWidth = (int) getLeftPanel().getPreferredSize().getWidth();
        getRightPanel().setPreferredSize(new Dimension(getScreenWidth() - leftPanelWidth, leftPanelHight));
    }

    public void paintTree(Version version) {
        List<MyFile> files = version.getFile();
        if (files.size() > 0) {
            DefaultMutableTreeNode shaTree = new DefaultMutableTreeNode(version.getSHA());
            DefaultTreeModel model = new DefaultTreeModel(shaTree);
            getTree().setModel(model);
            getTree().addMouseListener(new JTreeMouseListener(getTree()));
            getTree().setShowsRootHandles(true);
            for (MyFile file : files) {
                shaTree.add(createNodes(file));
            }
            getTree().getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        } else {
            DefaultMutableTreeNode emptyNode = new DefaultMutableTreeNode("Empty tree");
            DefaultTreeModel model = new DefaultTreeModel(emptyNode);
            getTree().setModel(model);
        }
        getTree().setVisible(true);
        int leftPanelHight = (int) getLeftPanel().getPreferredSize().getHeight();
        getLeftPanel().setPreferredSize(new Dimension(500, leftPanelHight));
        getTreeScrollPane().setVisible(true);
        getTreeScrollPane().updateUI();
        getLeftPanel().updateUI();
    }

    private DefaultMutableTreeNode createNodes(MyFile file) {
        DefaultMutableTreeNode fileTree = new DefaultMutableTreeNode(file.getPath());//encontrar caminho relativo
        for (int i = 0; i < file.getChuncks().size(); i++) { 
            int lineNumber = file.getChuncks().get(i).getBegin().getLineNumber();
            DefaultMutableTreeNode chunkTree = new DefaultMutableTreeNode(lineNumber);
            fileTree.add(chunkTree);
        }
        return fileTree;
    }

    private void paintChooser() {
        getChooser().setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        getChooser().setCurrentDirectory(new java.io.File(""));
        getChooser().setRequestFocusEnabled(false);
        getChooser().addActionListener(new ChooserActionPerformed(this));
        getChooser().setVisible(false);
    }

    private void paintTable() {
        getTable().addMouseListener(new TableMouseListener(this));
        DefaultTableModel model = (DefaultTableModel) getTable().getModel();
        model.addColumn("sha");
        model.addColumn("status");
        getTable().setModel(model);
    }

    @SuppressWarnings("empty-statement")
    private void clearTable(JTable table) {
        for (DefaultTableModel model = (DefaultTableModel) table.getModel(); table.getRowCount() > 0; model.removeRow(table.getRowCount() - 1));
    }

    private void paintMenuBar() {
        menuBar.setPreferredSize(new Dimension(getScreenWidth(), 30));
        getSubmenu().addActionListener(this::openRepository);
        getSubmenu().setText("Open Repository");
        getMenu().add(getSubmenu());
        getMenu().setText("File");
        menuBar.add(getMenu());
    }

    private void paintTextArea() {
        getTextArea().setEditable(false);
    }

    private void paintProgressBar() {
        getProgressBar().setPreferredSize(new Dimension(getScreenWidth(), 50));
        getProgressBar().setStringPainted(true);
        getProgressBar().setVisible(false);
    }

    private void openRepository(java.awt.event.ActionEvent evt) {
        getChooserFrame().setExtendedState(MAXIMIZED_BOTH);
        getChooser().setVisible(true);
        getChooserFrame().setVisible(true);
    }

    private void paintPanel() {
        this.add(getLeftPanel(), BorderLayout.WEST);
        this.add(getRightPanel(), BorderLayout.CENTER);
        this.add(menuBar, BorderLayout.NORTH);
        this.add(getProgressBar(), BorderLayout.SOUTH);

        getLeftPanel().add(new JScrollPane(table), BorderLayout.CENTER);
        getLeftPanel().add(getTreeScrollPane(), BorderLayout.EAST);

        getRightPanel().add(getTextArea(), BorderLayout.CENTER);

        getChooserFrame().add(getChooser(), BorderLayout.CENTER);

        this.setVisible(true);
    }

    private void paintMainPanel() {
        paintMenuBar();
        paintLeftPanel();
        paintRightPanel();
        paintTreePane();
        paintTablePanel();
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
     * @return the menu
     */
    public JMenu getMenu() {
        return menu;
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
    public JMenuItem getSubmenu() {
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
    public JScrollPane getTreeScrollPane() {
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
     * @param menu the menu to set
     */
    public void setMenu(JMenu menu) {
        this.menu = menu;
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
    public void setSubmenu(JMenuItem submenu) {
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
    public void setTreeScrollPane(JScrollPane treeScrollPane) {
        this.treePane = treeScrollPane;
    }
}
