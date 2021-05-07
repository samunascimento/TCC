package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.mergenature.controller.GSONClass;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 05-01-2021
 */
public class MNFrame extends JFrame {

    public static final Rectangle MAX_BOUNDS = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
    public static final int BORDER_GAP = 3;
    public static final Color PRIMARY_COLOR = Color.decode("#021a24");
    public static final Color SECUNDARY_COLOR = Color.WHITE;
    public static final Color TERTIARY_COLOR = Color.GREEN;
    public static final String CONNECTION_FILEPATH = System.getProperty("user.dir") + File.separator + ".mndbconnection";

    private Connection connection;

    private MNTabbedPane tabbedPane;
    private MNHome home;
    private JMenuBar menu;
    private JMenu gsonMenu;
    private JMenuItem readGSONMenuItem;
    private JMenuItem saveGSONMenuItem;
    private JMenu databaseMenu;
    private JMenuItem readFromDBMenuItem;
    private JMenuItem saveInDBMenuItem;

    public MNFrame() {
        this.connection = getConnectionFromFile();
        set();
    }

    public void start() {
        this.setVisible(true);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private void set() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("The Nature of the Merge of Software");
        this.setResizable(true);
        this.setBounds(100, 100, MAX_BOUNDS.width - 200, MAX_BOUNDS.height - 200);
        this.setMinimumSize(new Dimension(800, 450));
        this.setExtendedState(MAXIMIZED_BOTH);

        menu = new JMenuBar();
        this.setJMenuBar(menu);

        gsonMenu = new JMenu("MNTR");
        menu.add(gsonMenu);

        readGSONMenuItem = new JMenuItem("Read mntr");
        readGSONMenuItem.addActionListener((ActionEvent evt) -> {
            readSavedAnalysis();
        });
        gsonMenu.add(readGSONMenuItem);

        saveGSONMenuItem = new JMenuItem("Save mntr");
        saveGSONMenuItem.addActionListener((ActionEvent evt) -> {
            saveAnalysis(false);
        });
        gsonMenu.add(saveGSONMenuItem);

        databaseMenu = new JMenu("Database");
        menu.add(databaseMenu);

        readFromDBMenuItem = new JMenuItem("Read from database");
        readFromDBMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (connection == null) {
                    if (JOptionPane.showConfirmDialog(null, "No database connected. Try to connect?", "WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        showInputConnection();
                    }
                } else {
                    MNDatabaseInteractions.initGetProjectFrame(connection, tabbedPane);
                }
            }
        });
        databaseMenu.add(readFromDBMenuItem);

        saveInDBMenuItem = new JMenuItem("Save in database");
        saveInDBMenuItem.addActionListener((ActionEvent evt) -> {
            if (connection == null) {
                if (JOptionPane.showConfirmDialog(null, "No database connected. Try to connect?", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    showInputConnection();
                }
            } else {
                saveAnalysis(true);
            }
        });
        databaseMenu.add(saveInDBMenuItem);

        tabbedPane = new MNTabbedPane();
        this.add(tabbedPane);

        home = new MNHome(this);
        tabbedPane.addTab("Home", null, home, null);

    }

    public void analyseThread(String projectLocation, String projectName, int numContext) {
        home.getInputPanel().reset();
        MNBarPanel progressBarPanel = new MNBarPanel(projectLocation, numContext);
        tabbedPane.addTab(projectName + "(processing...)", progressBarPanel);
        Thread progressBarPanelThread = new Thread(progressBarPanel);
        progressBarPanelThread.start();
        try {
            progressBarPanelThread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (tabbedPane.getSelectedComponent().equals(progressBarPanel)) {
            tabbedPane.setSelectedIndex(0);
        }
        tabbedPane.remove(progressBarPanel);
        if (progressBarPanel.getProject() == null) {
            JOptionPane.showMessageDialog(null, "The repository path isn't a git repository!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            tabbedPane.remove(progressBarPanel);
            tabbedPane.addRemovableTab(projectName, null, new MNProjectPanel(progressBarPanel.getProject(), projectLocation), null);
        }
    }

    public void showInputConnection() {
        MNInputConnection.getMNInputConnection(this);
    }

    private void readSavedAnalysis() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int check = jfc.showOpenDialog(null);
        if (check == JFileChooser.APPROVE_OPTION) {
            String[] auxArray = jfc.getSelectedFile().getPath().replace("\\", "/").split("/");
            try {
                tabbedPane.addRemovableTab(auxArray[auxArray.length - 1], null, new MNProjectPanel(GSONClass.readProject(jfc.getSelectedFile().getPath())), null);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "The file chosen isn't a saved analysis!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveAnalysis(boolean saveInDB) {
        if (tabbedPane.getTabCount() == 1) {
            JOptionPane.showMessageDialog(null, "None analysis has done!", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            List<MNProjectPanel> projectPanels = new ArrayList<>();
            for (int i = 1; i < tabbedPane.getTabCount(); i++) {
                if (tabbedPane.getComponentAt(i).getClass() == MNProjectPanel.class) {
                    projectPanels.add((MNProjectPanel) tabbedPane.getComponentAt(i));
                }
            }
            if (projectPanels.isEmpty()) {
                JOptionPane.showMessageDialog(null, "None analysis has done!", "WARNING", JOptionPane.WARNING_MESSAGE);
            } else {
                if(saveInDB){
                    MNDatabaseInteractions.initSaveFrame(connection, projectPanels);
                } else {
                    new MNSaveAnalysis(projectPanels); 
                }
            }
        }
    }

    private Connection getConnectionFromFile() {
        String fileContent;
        try {
            fileContent = MergeNatureTools.getFileContentInString(CONNECTION_FILEPATH);
        } catch (IOException ex) {
            return null;
        }
        String[] data = fileContent.split(";");
        Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection(data[0], data[1], data[2]);
        } catch (Exception ex) {
            return null;
        }
        return connection;
    }

    public static void main(String[] args) throws IOException {
        MNFrame frame = new MNFrame();
        frame.start();
    }

}
