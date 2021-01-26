package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.controller.GSONClass;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 10-01-2021
 */
public class MNSaveAnalysis extends JFrame {

    private List<MNProjectPanel> projectPanels;
    private JComboBox comboBox;
    private JPanel chooseSaveNamePanel;
    private JLabel barCharErrorLabel;
    private JLabel maxCharErroLabel;
    private JLabel emptyErrorLabel;
    private JTextField saveNameTextField;
    private JFileChooser fileChooser;
    private JButton saveButton;

    public MNSaveAnalysis(List<MNProjectPanel> projectPanels) {
        this.projectPanels = projectPanels;
        set();
    }

    private void set() {

        this.setTitle("Save Analysis");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        this.setResizable(false);
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        comboBox = new JComboBox();
        comboBox.setBorder(BorderFactory.createTitledBorder("Choose the analysis"));
        for (MNProjectPanel projectPanel : projectPanels) {
            comboBox.addItem(projectPanel.getProject().getName());
        }
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(comboBox, gbc);

        generateChooseNamePanel();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(chooseSaveNamePanel, gbc);

        fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setControlButtonsAreShown(false);
        fileChooser.setBorder(BorderFactory.createTitledBorder("Choose the directory to save the persistence file"));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(fileChooser, gbc);

        saveButton = new JButton("Save");
        saveButton.addActionListener((ActionEvent evt) -> {
            saveButtonActionPerformed();
        });
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        this.add(saveButton, gbc);

        this.pack();
        this.setVisible(true);

    }

    private void generateChooseNamePanel() {

        chooseSaveNamePanel = new JPanel();
        chooseSaveNamePanel.setLayout(new GridBagLayout());
        chooseSaveNamePanel.setBorder(BorderFactory.createTitledBorder("Choose the name of persistence file"));
        chooseSaveNamePanel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        barCharErrorLabel = new JLabel(".Prohibited character: '" + File.separator + "'");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        chooseSaveNamePanel.add(barCharErrorLabel, gbc);

        maxCharErroLabel = new JLabel(".Max number of character: 20");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        chooseSaveNamePanel.add(maxCharErroLabel, gbc);

        emptyErrorLabel = new JLabel(".Cannot be empty");
        emptyErrorLabel.setForeground(Color.red);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        chooseSaveNamePanel.add(emptyErrorLabel, gbc);

        saveNameTextField = new JTextField();
        saveNameTextField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                saveNameTextFieldKeyEvent();
            }

            public void keyTyped(KeyEvent e) {
                saveNameTextFieldKeyEvent();
            }

            public void keyPressed(KeyEvent e) {
                saveNameTextFieldKeyEvent();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        chooseSaveNamePanel.add(saveNameTextField, gbc);

    }

    private void saveNameTextFieldKeyEvent() {
        if (this.saveNameTextField.getText().length() > 20) {
            this.maxCharErroLabel.setForeground(Color.red);
        } else {
            this.maxCharErroLabel.setForeground(Color.black);
        }
        if (this.saveNameTextField.getText().contains(File.separator)) {
            this.barCharErrorLabel.setForeground(Color.red);
        } else {
            this.barCharErrorLabel.setForeground(Color.black);
        }
        if (this.saveNameTextField.getText().isEmpty()) {
            this.emptyErrorLabel.setForeground(Color.red);
        } else {
            this.emptyErrorLabel.setForeground(Color.black);
        }
    }

    private void saveButtonActionPerformed() {
        String fileName = this.saveNameTextField.getText();
        String messageErrors = "";
        if (fileName.length() > 20) {
            messageErrors = messageErrors + ".Character limit overdated (" + fileName.length() + " characters)\n";
        } else if (fileName.equals("")) {
            messageErrors = messageErrors + ".Persistence filename cannot be empty\n";
        }
        if (fileName.contains("/")) {
            messageErrors = messageErrors + ".Prohibited character \"" + File.separator + "\" used\n";
        }
        if (!messageErrors.equals("")) {
            JOptionPane.showMessageDialog(null, messageErrors + "Choose another filename", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean notError = true;
            try {
                GSONClass.save(this.fileChooser.getSelectedFile().getPath() + File.separator + fileName + ".mntr", projectPanels.get(this.comboBox.getSelectedIndex()).getProject());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Don't have permission to save in this directory", "ERROR", JOptionPane.ERROR_MESSAGE);
                notError = false;
            }
            if (notError) {
                JOptionPane.showMessageDialog(null, fileName + ".gson was saved in " + this.fileChooser.getSelectedFile().getPath() + "!", "Saved", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }
    }

}
