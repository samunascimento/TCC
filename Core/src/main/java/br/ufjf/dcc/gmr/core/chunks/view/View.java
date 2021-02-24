package br.ufjf.dcc.gmr.core.chunks.view;

import br.ufjf.dcc.gmr.core.chunks.controller.JMenuJungActionListener;
import br.ufjf.dcc.gmr.core.chunks.controller.*;
import br.ufjf.dcc.gmr.core.chunks.jungtwo.JungFrame;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;

import java.awt.*;
import javax.swing.*;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import br.ufjf.dcc.gmr.core.vcs.types.MyFile;
import br.ufjf.dcc.gmr.core.vcs.types.Version;

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
    private JSplitPane splitPane;
    private JSplitPane splitPaneInside;
    private JTable table;
    private JTable table1;
    private JTextArea textArea;
    private JFileChooser chooser;
    private JProgressBar progressBar;
    JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuOptions;

    private JMenu menuFilter;
    private JCheckBoxMenuItem menuFilterCheckBox;

    private JMenuItem submenu;
    private JMenuItem submenuJung;
    private InitProject initProject;
    private Project project;
    private JTree tree;
    private int screenWidth;
    private int screenHight;
    private JungFrame jungFrame;
    private int contextLines;

    View() {
        this.tree = new JTree();
        this.table = new JTable();
        this.table1 = new JTable();
        this.leftPanel = new JPanel();
        this.rightPanel = new JPanel();
        this.treePane = new JScrollPane(getTree());
        this.splitPane = new JSplitPane();
        this.splitPaneInside = new JSplitPane();
        this.chooser = new JFileChooser();
        this.menuBar = new JMenuBar();
        this.menuFile = new JMenu();
        this.menuOptions = new JMenu();
        this.menuFilter = new JMenu();
        this.menuFilterCheckBox = new JCheckBoxMenuItem("Show only conflic commits");

        this.textArea = new JTextArea();
        this.progressBar = new JProgressBar();
        this.submenu = new JMenuItem();
        this.submenuJung = new JMenuItem();
        this.initProject = new InitProject();
        this.project = new Project();
        this.chooserFrame = new JFrame();
        this.screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 20;
        this.screenHight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 20;
        this.jungFrame = new JungFrame();
    }

    private void paintTreePane() {
        int leftPanelHight = (int) this.getLeftPanel().getPreferredSize().getHeight();
        this.getTreePane().setPreferredSize(new Dimension(180, leftPanelHight));
        this.getTreePane().setVisible(false);
    }

    private void paintLeftPanel() {
        int menuBarHight = (int) this.menuBar.getPreferredSize().getHeight();
        this.getLeftPanel().setLayout(new BorderLayout());
        this.getLeftPanel().setPreferredSize(new Dimension(300, getScreenHight() - menuBarHight));
        this.getLeftPanel().setVisible(false);
    }

    private void paintRightPanel() {
        this.getRightPanel().setLayout(new BorderLayout());
        int leftPanelHight = (int) this.getLeftPanel().getPreferredSize().getHeight();
        int leftPanelWidth = (int) this.getLeftPanel().getPreferredSize().getWidth();
        this.getRightPanel().setPreferredSize(new Dimension(getScreenWidth() - leftPanelWidth, leftPanelHight));
    }

    public void paintTree(Version version) {
        List<MyFile> files = version.getFile();
        if (files.size() > 0) {
            DefaultMutableTreeNode shaTree = new DefaultMutableTreeNode(version.getSHA());
            DefaultTreeModel model = new DefaultTreeModel(shaTree);
            this.getTree().setModel(model);
            this.getTree().addMouseListener(new JTreeMouseListener(this, version));
            this.getTree().setShowsRootHandles(true);
            for (MyFile file : files) {
                shaTree.add(createNodes(file));
            }
            this.getTree().getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        } else {
            DefaultMutableTreeNode emptyNode = new DefaultMutableTreeNode("Empty tree");
            DefaultTreeModel model = new DefaultTreeModel(emptyNode);
            this.getTree().setModel(model);
        }
        this.getTree().setVisible(true);
        int leftPanelHight = (int) this.getLeftPanel().getPreferredSize().getHeight();
        this.getLeftPanel().setPreferredSize(new Dimension(500, leftPanelHight));
        this.getTreePane().setVisible(true);
        this.getTreePane().updateUI();
        this.getLeftPanel().updateUI();
    }

    private DefaultMutableTreeNode createNodes(MyFile file) {
        DefaultMutableTreeNode fileTree = new DefaultMutableTreeNode(file);//encontrar caminho relativo

        for (int i = 0; i < file.getChunks().size(); i++) {
            ConflictChunk chunk = file.getChunks().get(i);
            DefaultMutableTreeNode chunkTree = new DefaultMutableTreeNode(chunk);
            fileTree.add(chunkTree);
        }
        return fileTree;
    }

    private void paintChooser() {
        this.getChooser().setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        this.getChooser().setCurrentDirectory(new java.io.File(""));
        this.getChooser().setRequestFocusEnabled(false);
        this.getChooser().addActionListener(new ChooserActionPerformed(this));
        this.getChooser().setVisible(false);
    }

    private void paintTable() {
        this.getTable().addMouseListener(new TableMouseListener(this));
        DefaultTableModel model = (DefaultTableModel) this.getTable().getModel();
        model.addColumn("sha");
        model.addColumn("status");
        this.getTable().setModel(model);
    }

    private void paintTable1() {
        this.getTable1().setVisible(false);
        this.getTable1().addMouseListener(new TableMouseListener(this));
        this.getTable1().setShowGrid(false);
        this.getTable1().setShowHorizontalLines(false);
        this.getTable1().setShowVerticalLines(false);
        DefaultTableModel model = (DefaultTableModel) this.getTable1().getModel();
        model.addColumn("before conflict");
        this.getTable1().setModel(model);
    }

    private void paintMenuBar() {
        this.menuBar.setPreferredSize(new Dimension(getScreenWidth(), 30));

        this.submenu.addActionListener(new MenuFileActionListener(this));
        this.submenu.setText("Open Repository");

        this.submenuJung.addActionListener(new JMenuJungActionListener(this.getJungFrame()));
        this.submenuJung.setText("Open Jung");

        this.menuFile.add(this.getSubmenu());
        this.menuFile.add(this.getSubmenuJung());
        this.menuFile.setText("File");

        this.menuOptions.addMouseListener(new MenuOptionsActionListener(this));
        this.menuOptions.setText("Options");

        this.menuFilter.setText("Filter");
        this.menuFilter.add(this.getMenuFilterCheckBox());

        this.menuFilterCheckBox.addActionListener(new MenuFilterActionListener(this));

        this.menuBar.add(this.getMenuFile());
        this.menuBar.add(this.getMenuOptions());
        this.menuBar.add(this.getMenuFilter());
    }

    private void paintProgressBar() {
        this.getProgressBar().setPreferredSize(new Dimension(getScreenWidth(), 50));
        this.getProgressBar().setStringPainted(true);
        this.getProgressBar().setVisible(false);
    }

    private void paintPanel() {
        this.add(menuBar, BorderLayout.NORTH);
        this.add(this.getProgressBar(), BorderLayout.SOUTH);

        this.getRightPanel().add(new JScrollPane(this.getTable1()), BorderLayout.CENTER);

        this.getChooserFrame().add(this.getChooser(), BorderLayout.CENTER);

        this.setVisible(true);
    }

    private void paintMainPanel() {
        paintMenuBar();
        paintLeftPanel();
        paintRightPanel();
        paintTreePane();
        paintTable();
        paintTable1();
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

    public int getContextLines() {
        return contextLines;
    }

    public void setContextLines(int contextLines) {
        this.contextLines = contextLines;
    }

    /**
     * @return the splitPane
     */
    public JSplitPane getSplitPane() {
        return splitPane;
    }

    /**
     * @param splitPane the splitPane to set
     */
    public void setSplitPane(JSplitPane splitPane) {
        this.splitPane = splitPane;
    }

    /**
     * @return the splitPaneInside
     */
    public JSplitPane getSplitPaneInside() {
        return splitPaneInside;
    }

    /**
     * @param splitPaneInside the splitPaneInside to set
     */
    public void setSplitPaneInside(JSplitPane splitPaneInside) {
        this.splitPaneInside = splitPaneInside;
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
        return getSubmenu();
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
     * @return the SubmenuJung
     */
    public JMenuItem getSubmenuJung() {
        return submenuJung;
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
        this.setSubmenu(submenu);
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

    /**
     * @param submenuJung the submenuJung to set
     */
    public void SetSubmenuJung(JMenuItem submenuJung) {
        this.setSubmenuJung(submenuJung);
    }

    public JTable getTable1() {
        return table1;
    }

    public void setTable1(JTable table1) {
        this.table1 = table1;
    }

    public JMenu getMenuFilter() {
        return menuFilter;
    }

    public void setMenuFilter(JMenu menuFilter) {
        this.menuFilter = menuFilter;
    }

    public JCheckBoxMenuItem getMenuFilterCheckBox() {
        return menuFilterCheckBox;
    }

    public void setMenuFilterCheckBox(JCheckBoxMenuItem menuFilterCheckBox) {
        this.menuFilterCheckBox = menuFilterCheckBox;
    }

    public JMenuItem getSubmenu() {
        return submenu;
    }

    public void setSubmenu(JMenuItem submenu) {
        this.submenu = submenu;
    }

    public void setSubmenuJung(JMenuItem submenuJung) {
        this.submenuJung = submenuJung;
    }

    public JungFrame getJungFrame() {
        return jungFrame;
    }

    public void setJungFrame(JungFrame jungFrame) {
        this.jungFrame = jungFrame;
    }
}
