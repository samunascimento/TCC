package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GSONClass;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
 *
 * @author joao_lima
 */
public class SaveAnalysisFrame extends JFrame {

    private JComboBox comboBox;
    private JPanel chooseSaveNamePanel;
    private JLabel barCharErrorLabel;
    private JLabel maxCharErroLabel;
    private JLabel emptyErrorLabel;
    private JTextField saveNameTextField;
    private JFileChooser fileChooser;
    private JButton saveButton;

    private List<MergePanel> mergePanels;

    public SaveAnalysisFrame(String[] projectNames, List<MergePanel> mergePanels) {
        this.mergePanels = mergePanels;
        this.setTitle("Save Analysis");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        this.setResizable(false);
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.startGenerator(projectNames);
        this.startCoupler();
        this.pack();
        this.setVisible(true);

    }

//  ******************************************************************
//  *                                                                *
//  *                           Generators                           *
//  *                                                                *
//  ******************************************************************
    private void startGenerator(String[] values) {
        this.comboBox = this.generateComboBox(values);
        this.chooseSaveNamePanel = this.generateChooseSaveNamePanel();
        this.barCharErrorLabel = this.generateBarCharErrorLabel();
        this.maxCharErroLabel = this.generateMaxCharErrorLabel();
        this.emptyErrorLabel = this.generateEmptyErrorLabel();
        this.saveNameTextField = this.generateSaveNameTextField();
        this.fileChooser = this.generateFileChooser();
        this.saveButton = this.generateSaveButton();
    }

    private JComboBox generateComboBox(String[] values) {
        JComboBox prototype = new JComboBox(values);
        prototype.setBorder(BorderFactory.createTitledBorder("Choose the analysis"));
        return prototype;
    }

    private JPanel generateChooseSaveNamePanel() {
        JPanel prototype = new JPanel();
        prototype.setLayout(new GridBagLayout());
        prototype.setBorder(BorderFactory.createTitledBorder("Choose the name of persistence file"));
        return prototype;
    }

    private JLabel generateBarCharErrorLabel() {
        JLabel prototype = new JLabel(".Prohibited character: '/'");
        return prototype;
    }

    private JLabel generateMaxCharErrorLabel() {
        JLabel prototype = new JLabel(".Max number of character: 20                                                                                      ");
        return prototype;
    }

    private JLabel generateEmptyErrorLabel() {
        JLabel prototype = new JLabel(".Cannot be empty");
        prototype.setForeground(Color.red);
        return prototype;
    }

    private JTextField generateSaveNameTextField() {
        JTextField prototype = new JTextField();
        prototype.addKeyListener(new KeyAdapter() {
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
        return prototype;
    }

    private JFileChooser generateFileChooser() {
        JFileChooser prototype = new JFileChooser();
        prototype.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        prototype.setControlButtonsAreShown(false);
        prototype.setBorder(BorderFactory.createTitledBorder("Choose the directory to save the persistence file"));
        return prototype;
    }

    private JButton generateSaveButton() {
        JButton prototype = new JButton("Save");
        prototype.addActionListener((ActionEvent evt) -> {
            saveButtonActionPerformed();
        });
        return prototype;
    }

//  ****************************************************************
//  *                                                              *
//  *                           Couplers                           *
//  *                                                              *
//  ****************************************************************
    private void startCoupler() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth++;
        gbc.gridy++;
        this.add(this.comboBox, gbc);
        gbc.gridy++;
        this.chooseSaveNamePanelCoupler();
        this.add(this.chooseSaveNamePanel, gbc);
        gbc.gridy++;
        this.add(this.fileChooser, gbc);
        gbc.gridy++;
        gbc.gridwidth--;
        this.add(this.saveButton, gbc);
    }

    private void chooseSaveNamePanelCoupler() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 1, 1);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy++;
        this.chooseSaveNamePanel.add(this.barCharErrorLabel, gbc);
        gbc.gridy++;
        this.chooseSaveNamePanel.add(this.maxCharErroLabel, gbc);
        gbc.gridy++;
        this.chooseSaveNamePanel.add(this.emptyErrorLabel, gbc);
        gbc.gridy++;
        this.chooseSaveNamePanel.add(this.saveNameTextField, gbc);
    }
//  ***********************************************************************
//  *                                                                     *
//  *                           ActionPerformed                           *
//  *                                                                     *
//  ***********************************************************************

    private void saveNameTextFieldKeyEvent() {
        if (this.saveNameTextField.getText().length() > 20) {
            this.maxCharErroLabel.setForeground(Color.red);
        } else {
            this.maxCharErroLabel.setForeground(Color.black);
        }
        if (this.saveNameTextField.getText().contains("/")) {
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
            messageErrors = messageErrors + ".Prohibited character \"/\" used\n";
        }
        if (!messageErrors.equals("")) {
            JOptionPane.showMessageDialog(null, messageErrors + "Choose another filename", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean notError = true;
            try {
                GSONClass.save(this.fileChooser.getSelectedFile().getPath() + "/" + fileName + ".gson", mergePanels.get(this.comboBox.getSelectedIndex()).getMergeEventList());
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
