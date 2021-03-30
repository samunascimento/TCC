package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JButton;
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
 * @since 24-03-2021
 */
public class MNRepositoryPathFrame extends JFrame {

    private final MNProjectPanel projectPanel;
    private JTextField repositoryPathField;
    private boolean repositoryPathIsVerified;
    private Conflict currentConflict;

    public MNRepositoryPathFrame(MNProjectPanel projectPanel) {
        this.projectPanel = projectPanel;
        set();
    }
    
    public MNRepositoryPathFrame(MNProjectPanel projectPanel, String repositoryPath) {
        this.projectPanel = projectPanel;
        set();
        this.repositoryPathField.setText(repositoryPath);
        this.repositoryPathIsVerified = true;
    }

    public boolean repositoryPathIsVerified() {
        return repositoryPathIsVerified;
    }

    public void setRepositoryPathIsVerified(boolean repositoryPathIsVerified) {
        this.repositoryPathIsVerified = repositoryPathIsVerified;
    }
    
    
    public String getRepositoryPath() {
        return repositoryPathField.getText();
    }

    private void set() {
        this.setTitle("Repository Path");
        this.setResizable(false);
        this.setMinimumSize(new Dimension(600, 150));
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());

        JLabel repositoryPathLabel = new JLabel("Input the path of the repository of this project in the same or a latest version");

        repositoryPathField = new JTextField("");

        JButton findButton = new JButton("Find Directory");
        findButton.addActionListener((ActionEvent evt) -> {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int check = jfc.showOpenDialog(null);
            if (check == JFileChooser.APPROVE_OPTION) {
                repositoryPathField.setText(jfc.getSelectedFile().getPath() + File.separator);
            }
        });

        JButton findOutsideAlterations = new JButton("Find Outside Alterations");
        findOutsideAlterations.addActionListener((ActionEvent evt) -> {
            if (repositoryPathField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "The repository path field is empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!new File(repositoryPathField.getText()).isDirectory()) {
                JOptionPane.showMessageDialog(null, repositoryPathField.getText() + " isn't a directory!", "Warning", JOptionPane.WARNING_MESSAGE);
                repositoryPathField.setText("");
            } else {
                this.setVisible(false);
                projectPanel.showFileAlterations(currentConflict, repositoryPathField.getText());
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        this.add(mainPanel);
        mainPanel.add(repositoryPathLabel, gbc);
        gbc.gridy++;
        mainPanel.add(repositoryPathField, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        mainPanel.add(findButton, gbc);
        gbc.gridx++;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        mainPanel.add(findOutsideAlterations, gbc);
    }

    public void showRepositoryPathFrame(Conflict conflict) {
        this.currentConflict = conflict;
        this.setVisible(true);
    }

}
