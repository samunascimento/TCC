package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GSONClass;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
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

/**
 *
 * @author joao_lima
 */
public class MainFrame extends JFrame {

//  *** Menus ********************************************
    private JMenuBar menuBar;
    private JMenu toolsMenu;
    private JMenu filtersMenu;
    private JMenuItem readSavedAnalysisButton;
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
        this.setResizable(false);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
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
        this.filtersMenu = this.generateFiltersMenu();
        this.readSavedAnalysisButton = this.generateReadSavedAnalysisButton();
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

    private JMenuItem generateReadSavedAnalysisButton() {
        JMenuItem prototype = new JMenuItem("Read Saved Analysis");
        prototype.addActionListener((ActionEvent evt) -> {
            readSavedAnalysisMenuItemActionPerformed();
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
        this.toolsMenu.add(this.readSavedAnalysisButton);
        this.menuBar.add(this.toolsMenu);
        this.menuBar.add(this.filtersMenu);
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
                mainTabbedPane.addTab(auxArray[auxArray.length - 1], new MergePanel(GSONClass.read(jfc.getSelectedFile().getPath())));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "The file chosen isn't a saved analysis!", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        mainTabbedPane.remove(progressBarPanel);
        if (progressBarPanel.getMergeEventList() == null) {
            JOptionPane.showMessageDialog(null, "The the repository path is not a git repotory!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            mainTabbedPane.addTab(getProjectName(projectPath), new MergePanel(progressBarPanel.getMergeEventList()));
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

}
