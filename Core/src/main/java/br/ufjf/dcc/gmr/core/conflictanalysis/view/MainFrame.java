package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GSONClass;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author joao_lima
 */
public class MainFrame extends JFrame {

//  *** Menus ********************************************
    private JMenuBar menuBar;
    private JMenu toolsMenu;
    private JMenuItem readSavedAnalysisMenuItem;
    private JMenuItem saveAnalysisMenuItem;
//  ******************************************************
    private JTabbedPane mainTabbedPane;

//  *** Home Panel ***************************************
    private JPanel homePanel;
    private JLabel _repositoryPathLabel;
    private JLabel _numberOfContextLinesLabel;
    private JButton _findDirectoryButton;
    private JButton _analyseButton;
    private JComboBox _numContextComboBox;
    private JTextField _textField;
//  *******************************************************

    public MainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Analysis of Merge Conflicts in Git Repositories");
        this.setResizable(true);
        this.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()) - 35, (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 35));
        this.setMinimumSize(new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()) - 100, (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 100)));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setLocationRelativeTo(null);
        this.startGenerators();
        this.startCouplers();
        this.setVisible(true);
    }

//  ******************************************************************
//  *                                                                *
//  *                           Generators                           *
//  *                                                                *
//  ******************************************************************
    private void startGenerators() {
        this.menuBar = this.generateMenuBar();
        this.toolsMenu = this.generateToolsMenu();
        this.readSavedAnalysisMenuItem = this.generateReadSavedAnalysisMenuItem();
        this.saveAnalysisMenuItem = this.generateSaveAnalysisMenuItem();
        this.mainTabbedPane = this.generateMainTabbedPane();
        this.homePanel = this.generateHomePanel();
        this._repositoryPathLabel = this.generate_repositoryPathLabel();
        this._numberOfContextLinesLabel = this.generate_numberOfContextLinesLabel();
        this._findDirectoryButton = this.generate_findDirectoryButton();
        this._analyseButton = this.generate_analyseButton();
        this._numContextComboBox = this.generate_numContextComboBox();
        this._textField = this.generate_textField();
    }

    private JMenuBar generateMenuBar() {
        JMenuBar prototype = new JMenuBar();
        return prototype;
    }

    private JMenu generateToolsMenu() {
        JMenu prototype = new JMenu("Tools");
        return prototype;
    }

    private JMenu generateFiltersMenu() {
        JMenu prototype = new JMenu("Filters");
        return prototype;
    }

    private JMenuItem generateReadSavedAnalysisMenuItem() {
        JMenuItem prototype = new JMenuItem("Read Saved Analysis");
        prototype.addActionListener((ActionEvent evt) -> {
            readSavedAnalysisMenuItemActionPerformed();
        });
        return prototype;
    }

    private JMenuItem generateSaveAnalysisMenuItem() {
        JMenuItem prototype = new JMenuItem("Save Analysis");
        prototype.addActionListener((ActionEvent evt) -> {
            saveAnalysisMenuItemActionPerformed();
        });
        return prototype;
    }

    private JTabbedPane generateMainTabbedPane() {
        JTabbedPane prototype = new JTabbedPane();
        return prototype;
    }

    private JPanel generateHomePanel() {
        JPanel prototype = new JPanel();
        prototype.setLayout(new GridBagLayout());
        return prototype;
    }

    private JLabel generate_repositoryPathLabel() {
        JLabel prototype = new JLabel("Repository Path");
        return prototype;
    }

    private JLabel generate_numberOfContextLinesLabel() {
        JLabel prototype = new JLabel("Number Of Context Lines");
        return prototype;
    }

    private JButton generate_findDirectoryButton() {
        JButton prototype = new JButton("Find Directory");
        prototype.addActionListener((ActionEvent evt) -> {
            _findDirectoryButtonActionPerformed();
        });
        return prototype;
    }

    private JButton generate_analyseButton() {
        JButton prototype = new JButton("Analyse");
        prototype.addActionListener((ActionEvent evt) -> {
            _analyseButtonActionPerformed();
        });
        return prototype;
    }

    private JComboBox generate_numContextComboBox() {
        JComboBox prototype = new JComboBox(new String[]{
            "1 Line",
            "2 Lines",
            "3 Lines",
            "4 Lines",
            "5 Lines",
            "6 Lines",
            "7 Lines",
            "8 Lines",
            "9 Lines",
            "10 Lines"
        });
        return prototype;
    }

    private JTextField generate_textField() {
        JTextField prototype = new JTextField("");
        prototype.setEditable(false);
        return prototype;
    }

    private JCheckBox generate_outmostCheckBox() {
        JCheckBox prototype = new JCheckBox("Change to outmost");
        return prototype;
    }

//  ****************************************************************
//  *                                                              *
//  *                           Couplers                           *
//  *                                                              *
//  ****************************************************************
    private void startCouplers() {
        this.homePanelCoupler();
        this.menuCoupler();
        this.mainTabbedPaneCoupler();
        this.mainFrameCoupler();
    }

    private void homePanelCoupler() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.homePanel.add(this._repositoryPathLabel, gbc);
        gbc.gridy = 1;
        this.homePanel.add(this._numberOfContextLinesLabel, gbc);
        gbc.gridy = 2;
        this.homePanel.add(this._findDirectoryButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        this.homePanel.add(this._textField, gbc);
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        this.homePanel.add(this._numContextComboBox, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 0;
        this.homePanel.add(this._analyseButton, gbc);
    }

    private void menuCoupler() {
        this.toolsMenu.add(this.readSavedAnalysisMenuItem);
        this.toolsMenu.add(this.saveAnalysisMenuItem);
        this.menuBar.add(this.toolsMenu);
    }

    private void mainTabbedPaneCoupler() {
        this.mainTabbedPane.addTab("Home", this.homePanel);
    }

    private void mainFrameCoupler() {
        this.setJMenuBar(menuBar);
        this.add(this.mainTabbedPane);
    }

//  ***********************************************************************
//  *                                                                     *
//  *                           ActionPerformed                           *
//  *                                                                     *
//  ***********************************************************************
    private void readSavedAnalysisMenuItemActionPerformed() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int check = jfc.showOpenDialog(null);
        if (check == JFileChooser.APPROVE_OPTION) {
            String[] auxArray = jfc.getSelectedFile().getPath().split("/");
            try {
                this.addPanelWithX(new MergePanel(auxArray[auxArray.length - 1], GSONClass.readMergeEvent(jfc.getSelectedFile().getPath())), auxArray[auxArray.length - 1]);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "The file chosen isn't a saved analysis!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveAnalysisMenuItemActionPerformed() {
        if (this.mainTabbedPane.getTabCount() == 1) {
            JOptionPane.showMessageDialog(null, "None analysis has done!", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            List<MergePanel> mergePanels = new ArrayList<>();
            String projectNames = "";
            for (int i = 1; i < this.mainTabbedPane.getTabCount(); i++) {
                if (this.mainTabbedPane.getComponentAt(i).getClass() == MergePanel.class) {
                    mergePanels.add((MergePanel) this.mainTabbedPane.getComponentAt(i));
                    projectNames = projectNames + this.mainTabbedPane.getTitleAt(i) + ",";
                }
            }
            if (mergePanels.isEmpty()) {
                JOptionPane.showMessageDialog(null, "None analysis has done!", "WARNING", JOptionPane.WARNING_MESSAGE);
            } else {
                SaveAnalysisFrame saveFrame = new SaveAnalysisFrame(projectNames.split(","), mergePanels);
            }
        }
    }

    private void _findDirectoryButtonActionPerformed() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int check = jfc.showOpenDialog(null);
        if (check == JFileChooser.APPROVE_OPTION) {
            _textField.setText(jfc.getSelectedFile().getPath());
        }
    }

    private void _analyseButtonActionPerformed() {
        if (_textField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Repository Path text field is empty!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(null, "Analyse " + this.getProjectName(_textField.getText()) + "?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                new Thread() {
                    public void run() {
                        analyseThread();
                    }
                }.start();
            }
        }
    }
//  ***********************************************************************    
//  *                                                                     *
//  *                           Process Methods                           *
//  *                                                                     *
//  ***********************************************************************

    private void analyseThread() {
        String projectPath = this._textField.getText();
        String projectName = getProjectName(projectPath);
        int numContextLines = this._numContextComboBox.getSelectedIndex() + 1;
        resetHomePanel();
        ConflictAnalysisProgressBarPanel progressBarPanel = new ConflictAnalysisProgressBarPanel(projectPath, numContextLines);
        this.mainTabbedPane.addTab(getProjectName(projectPath + "(processing...)"), progressBarPanel);
        Thread progressBarPanelThread = new Thread(progressBarPanel);
        progressBarPanelThread.start();
        try {
            progressBarPanelThread.join();
        } catch (InterruptedException ex) {
            System.out.println("Deu ruim");
        }
        if (mainTabbedPane.getSelectedComponent().equals(progressBarPanel)) {
            mainTabbedPane.setSelectedIndex(0);
        }
        mainTabbedPane.remove(progressBarPanel);
        if (progressBarPanel.getMergeEventList() == null) {
            JOptionPane.showMessageDialog(null, "The repository path isn't a git repository!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            this.addPanelWithX(new MergePanel(projectName, progressBarPanel.getMergeEventList()), projectName);
        }
    }

    private String getProjectName(String project) {
        if (project.contains("\\")) {
            return project.split("\\\\")[project.split("\\\\").length - 1];
        } else {
            return project.split("/")[project.split("/").length - 1];
        }
    }

    private void resetHomePanel() {
        this._numContextComboBox.setSelectedIndex(0);
        this._textField.setText("");
    }

    private void addPanelWithX(MergePanel panel, String projectName) {
        mainTabbedPane.addTab(projectName, panel);
        mainTabbedPane.setTabComponentAt(mainTabbedPane.indexOfComponent(panel), this.getTitlePanel(mainTabbedPane, panel, projectName));
    }

    private JPanel getTitlePanel(JTabbedPane tabbedPane, JPanel panel, String title) {
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        titlePanel.setOpaque(false);

        JLabel titleLbl = new JLabel(title);
        titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        titlePanel.add(titleLbl);

        JButton closeButton = new JButton("x");
        closeButton.setPreferredSize(new Dimension(12, 12));
        closeButton.setToolTipText("Close");
        closeButton.setContentAreaFilled(false);
        closeButton.setBorder(new EtchedBorder());
        closeButton.setBorderPainted(false);
        closeButton.setFocusable(false);
        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tabbedPane.remove(panel);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                closeButton.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                closeButton.setForeground(Color.BLACK);
            }
        }
        );
        titlePanel.add(closeButton);
        return titlePanel;
    }

}
