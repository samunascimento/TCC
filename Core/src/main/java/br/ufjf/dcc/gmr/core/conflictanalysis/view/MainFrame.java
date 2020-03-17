package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.RepositoryAnalysis;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MainInfo;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JMenuItem analyseProjectMenuItem = new JMenuItem("Analyse Project");

    //Panels
    private JTabbedPane mainTabbedPane = new JTabbedPane();
    private JPanel homePanel = new JPanel();

    //Home Panels Labels
    private JLabel ufjfLabel = new JLabel("Universidade Federal de Juiz de Fora - UFJF");
    private JLabel yearLabel = new JLabel("2020");

    //Analyse Frame
    private JFrame analyseFrame = new JFrame();
    private MainInfo analyseFrameMainInfo = null;
    private JPanel analyseFrameMainPanel = new JPanel();
    private JLabel analyseFrameRepositoryPathLabel = new JLabel("RepositoryPath");
    private JLabel analyseFrameNumberOfContextLinesLabel = new JLabel("Number of Context Lines");
    private JButton analyseFrameFindDirectoryButton = new JButton("Find Directory");
    private JButton analyseFrameAnalyseButton = new JButton("Analyse");
    private JTextField analyseFrameTextField = new JTextField();
    private JComboBox analyseFrameNumContextComboBox = new JComboBox(new String[]{
        "0 Lines",
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
        this.customizeAnalyseFrame();
        this.setVisible(true);
    }

    private void customizeMainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Analysis of Merge Conflicts in Git Repositories");
        this.setResizable(false);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    private void customizeMenu() {
        this.analyseProjectMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                analyseFrame.setVisible(true);
            }

        });;
        this.toolsMenu.add(this.analyseProjectMenuItem);
        this.menuBar.add(this.toolsMenu);
        this.setJMenuBar(this.menuBar);
    }

    private void customizeTabbedPane() {
        this.customizeHomePanel();
        this.mainTabbedPane.addTab("Home", this.homePanel);
        this.add(this.mainTabbedPane);
    }

    private void customizeHomePanel() {
        this.ufjfLabel.setForeground(Color.WHITE);
        this.ufjfLabel.setFont(Font.getFont(Font.SANS_SERIF));
        this.yearLabel.setForeground(Color.WHITE);
        this.yearLabel.setFont(Font.getFont(Font.SANS_SERIF));
        this.homePanel.setBackground(Color.BLACK);
        this.homePanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        this.homePanel.add(this.ufjfLabel, gbc);
        gbc.gridy = 1;
        this.homePanel.add(this.yearLabel, gbc);
    }
    
    
    
    
    
    private void customizeAnalyseFrame() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 5, 5);
        this.analyseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.analyseFrame.setTitle("Analyse Project");
        this.analyseFrame.setResizable(false);
        this.analyseFrame.setSize(600, 250);
        this.customizePanel();
        this.analyseFrame.add(this.analyseFrameMainPanel);
        this.customizeButtons();
        this.customizeTextField();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.analyseFrameMainPanel.add(this.analyseFrameRepositoryPathLabel, gbc);
        gbc.gridy = 1;
        this.analyseFrameMainPanel.add(this.analyseFrameNumberOfContextLinesLabel, gbc);
        gbc.gridy = 2;
        this.analyseFrameMainPanel.add(this.analyseFrameFindDirectoryButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        this.analyseFrameMainPanel.add(this.analyseFrameTextField, gbc);
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        this.analyseFrameMainPanel.add(this.analyseFrameNumContextComboBox, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 0;
        this.analyseFrameMainPanel.add(this.analyseFrameAnalyseButton, gbc);
        this.analyseFrame.pack();
    }

    private void customizePanel() {
        this.analyseFrameMainPanel.setLayout(new GridBagLayout());
    }

    private void customizeLabels() {
        this.analyseFrameRepositoryPathLabel.setFont(Font.getFont(Font.SANS_SERIF));
        this.analyseFrameNumberOfContextLinesLabel.setFont(Font.getFont(Font.SANS_SERIF));
    }

    private void customizeTextField() {
        this.analyseFrameTextField.setEditable(false);
    }

    private void customizeButtons() {
        this.analyseFrameFindDirectoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int check = jfc.showOpenDialog(null);
                if (check == JFileChooser.APPROVE_OPTION) {
                    analyseFrameTextField.setText(jfc.getSelectedFile().getPath());
                }
            }

        });
        this.analyseFrameAnalyseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (analyseFrameTextField.getText() == null) {
                    JOptionPane.showMessageDialog(null, "Repository Path text field is empty!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (JOptionPane.showConfirmDialog(null, "Analyse " + getProjectName(analyseFrameTextField.getText()) + "?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        try {
                            String auxStr = analyseFrameTextField.getText();
                            int auxInt = analyseFrameNumContextComboBox.getSelectedIndex();
                            resetAnalyseFrame();
                            mainTabbedPane.addTab(getProjectName(auxStr),new MergePanel(RepositoryAnalysis.searchAllMerges(auxStr, auxInt)));
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "The selected directory is not a git repository.\nPlease, choose a new directory!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }

        });;
    }

    private String getProjectName(String project) {
        if (project.contains("\\\\")) {
            return project.split("\\\\")[project.split("\\\\").length - 1];
        } else {
            return project.split("/")[project.split("/").length - 1];
        }

    }
    
    private void resetAnalyseFrame(){
        this.analyseFrame.setVisible(false);
        this.analyseFrameNumContextComboBox.setSelectedIndex(0);
        this.analyseFrameTextField.setText("");
    }
}
