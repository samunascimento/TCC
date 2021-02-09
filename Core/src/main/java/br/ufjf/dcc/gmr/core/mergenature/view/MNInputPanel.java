package br.ufjf.dcc.gmr.core.mergenature.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import java.nio.file.Paths;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The place in GUI for input
 *
 * @author João Pedro Lima
 * @since 05-01-2021
 */
public class MNInputPanel extends JPanel {

    private MNHome home;

    private JLabel pathLabel;
    private JTextField pathField;
    private JButton findButton;
    private JLabel contextLabel;
    private JComboBox contextBox;
    private JButton analyseButton;

    public MNInputPanel(MNHome home) {
        this.home = home;
        set();
    }

    private void set() {

        this.setOpaque(false);
        this.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, 3, true));
        this.setPreferredSize(new Dimension(780, 120));
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        pathLabel = new JLabel("Repository Location");
        pathLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        pathLabel.setPreferredSize(new Dimension(150, 20));

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(pathLabel, gbc);

        pathField = new JTextField("");
        pathField.setOpaque(false);
        pathField.setForeground(MNFrame.SECUNDARY_COLOR);
        pathField.setCaretColor(MNFrame.SECUNDARY_COLOR);
        pathField.setEditable(true);
        pathField.setPreferredSize(new Dimension(150, 35));
        pathField.setMargin(new Insets(0, 10, 0, 10));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(pathField, gbc);

        gbc.gridwidth = 1;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE; //RESET GBC

        findButton = new JButton("Find Directory");
        findButton.setPreferredSize(new Dimension(150, 25));
        findButton.addActionListener((ActionEvent evt) -> {
            findDirectory();
        });
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(findButton, gbc);

        contextLabel = new JLabel("Number of Context Lines");
        contextLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        contextLabel.setPreferredSize(new Dimension(200, 20));
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(contextLabel, gbc);

        contextBox = new JComboBox(new String[]{"1 Line", "2 Lines", "3 Lines", "4 Lines", "5 Lines"});
        contextBox.setPreferredSize(new Dimension(200, 35));
        gbc.gridx = 2;
        gbc.gridy = 1;
        this.add(contextBox, gbc);

        analyseButton = new JButton("Analyse Project");
        analyseButton.setPreferredSize(new Dimension(200, 25));
        analyseButton.addActionListener((ActionEvent evt) -> {
            analyse();
        });
        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(analyseButton, gbc);

    }

    private void findDirectory() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int check = jfc.showOpenDialog(null);
        if (check == JFileChooser.APPROVE_OPTION) {
            pathField.setText(jfc.getSelectedFile().getPath() + File.separator);
        }
    }

    private void analyse() {
        if (pathField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Repository Location text field is empty!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(null, "Analyse " + getProjectName(pathField.getText()) + "?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                new Thread() {
                    public void run() {
                        home.getFrame().analyseThread(pathField.getText(), getProjectName(pathField.getText()), contextBox.getSelectedIndex() + 1);
                    }
                }.start();
            }
        }
    }

    private String getProjectName(String project) {
        if (project.endsWith(".git")) {
            return project.split("/")[project.split("/").length - 1].replaceAll("\\.git", "");
        } else {
            return Paths.get(project).getFileName().toString();
        }
    }

    public void reset() {
        pathField.setText("");
        contextBox.setSelectedIndex(0);
    }

}
