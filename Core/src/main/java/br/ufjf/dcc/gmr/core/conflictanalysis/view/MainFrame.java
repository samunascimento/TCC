package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GSONClass;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.RepositoryAnalysis;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    //Menu
    private JMenuBar menuBar = new JMenuBar();
    private JMenu toolsMenu = new JMenu("Tools");
    private JMenuItem readSavedAnalysisButton = new JMenuItem("Read saved analysis");

    //Tabbed Pane
    private JTabbedPane mainTabbedPane = new JTabbedPane();

    //Home Panel
    private JPanel homePanel = new JPanel();
    private JLabel homePanelRepositoryPathLabel = new JLabel("RepositoryPath");
    private JLabel homePanelNumberOfContextLinesLabel = new JLabel("Number of Context Lines");
    private JButton homePanelFindDirectoryButton = new JButton("Find Directory");
    private JButton homePanelAnalyseButton = new JButton("Analyse");
    private JTextField homePanelTextField = new JTextField();
    private JComboBox homePanelNumContextComboBox = new JComboBox(new String[]{
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

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        this.customizeMainFrame();
        this.customizeMenu();
        this.customizeTabbedPane();
        this.setVisible(true);
    }

    private void customizeMainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Analysis of Merge Conflicts in Git Repositories");
        this.setResizable(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setMaximumSize(new Dimension(1600,900));
        this.setMinimumSize(new Dimension(1600,900));
    }

    private void customizeMenu() {
        this.readSavedAnalysisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt)  {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int check = jfc.showOpenDialog(null);
                if (check == JFileChooser.APPROVE_OPTION) {
                    String[] auxArray = jfc.getSelectedFile().getPath().split("/");
                    try {
                        mainTabbedPane.addTab(auxArray[auxArray.length - 1], new MergePanel(GSONClass.read(jfc.getSelectedFile().getPath())));
                    } catch (FileNotFoundException ex) {
                        System.out.println("Deu merda");
                    }
                }
            }
        });
        this.toolsMenu.add(this.readSavedAnalysisButton);
        this.menuBar.add(this.toolsMenu);
        this.setJMenuBar(this.menuBar);
    }

    private void customizeTabbedPane() {
        this.customizeHomePanel();
        this.mainTabbedPane.addTab("Home", this.homePanel);
        this.add(this.mainTabbedPane);
    }

    private void customizeHomePanel() {
        this.homePanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 5, 5);
        this.customizeButtons();
        this.customizeTextField();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.homePanel.add(this.homePanelRepositoryPathLabel, gbc);
        gbc.gridy = 1;
        this.homePanel.add(this.homePanelNumberOfContextLinesLabel, gbc);
        gbc.gridy = 2;
        this.homePanel.add(this.homePanelFindDirectoryButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        this.homePanel.add(this.homePanelTextField, gbc);
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        this.homePanel.add(this.homePanelNumContextComboBox, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 0;
        this.homePanel.add(this.homePanelAnalyseButton, gbc);
    }

    private void customizePanel() {
        this.homePanel.setLayout(new GridBagLayout());
    }

    private void customizeLabels() {
        this.homePanelRepositoryPathLabel.setFont(Font.getFont(Font.SANS_SERIF));
        this.homePanelNumberOfContextLinesLabel.setFont(Font.getFont(Font.SANS_SERIF));
    }

    private void customizeTextField() {
        this.homePanelTextField.setEditable(false);
    }

    private void customizeButtons() {
        this.homePanelFindDirectoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int check = jfc.showOpenDialog(null);
                if (check == JFileChooser.APPROVE_OPTION) {
                    homePanelTextField.setText(jfc.getSelectedFile().getPath());
                }
            }

        });
        this.homePanelAnalyseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (homePanelTextField.getText() == null) {
                    JOptionPane.showMessageDialog(null, "Repository Path text field is empty!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (JOptionPane.showConfirmDialog(null, "Analyse " + getProjectName(homePanelTextField.getText()) + "?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        try {
                            String auxStr = homePanelTextField.getText();
                            int auxInt = homePanelNumContextComboBox.getSelectedIndex() + 1;
                            resetHomePanel();
                            mainTabbedPane.addTab(getProjectName(auxStr), new MergePanel(RepositoryAnalysis.searchAllMerges(auxStr, auxInt)));
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "The selected directory is not a git repository.\nPlease, choose a new directory!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }

        });;
    }

    private String getProjectName(String project) {
        if (project.contains("\\")) {
            return project.split("\\\\")[project.split("\\\\").length - 1];
        } else {
            return project.split("/")[project.split("/").length - 1];
        }

    }

    private void resetHomePanel() {
        this.homePanelNumContextComboBox.setSelectedIndex(0);
        this.homePanelTextField.setText("");
    }
}
