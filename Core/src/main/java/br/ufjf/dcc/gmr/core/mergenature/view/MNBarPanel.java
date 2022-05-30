package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.exception.GitException;
import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 * The bar panel
 *
 * @author João Pedro Lima
 * @since 05-01-2021
 */
public class MNBarPanel extends JPanel implements Runnable {

    private JProgressBar progressBar;
    private final String repositoryLocation;
    private final int contextLines;
    private Project project;

    public MNBarPanel(String repositoryPath, int contextLines) {
        this.repositoryLocation = repositoryPath.replace("\\", "/");
        this.contextLines = contextLines;
        set();
    }

    public Project getProject() {
        return project;
    }

    private void set() {

        this.setBackground(MNFrame.PRIMARY_COLOR);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP * 4, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP * 4);

        progressBar = new JProgressBar();
        progressBar.setPreferredSize(new Dimension(6 * (MNFrame.MAX_BOUNDS.width / 8), 50));
        progressBar.setMinimumSize(new Dimension(6 * (MNFrame.MAX_BOUNDS.width / 8), 50));
        progressBar.setBackground(MNFrame.PRIMARY_COLOR);
        progressBar.setForeground(MNFrame.TERTIARY_COLOR);
        progressBar.setIndeterminate(true);
        progressBar.setStringPainted(true);
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.BASELINE;
        this.add(progressBar, gbc);

    }

    @Override
    public void run() {
        Algorithm algorithm = new Algorithm();
        algorithm.setCtxLines(contextLines);
        algorithm.setProgressBar(progressBar);
        try {
            this.project = algorithm.run(repositoryLocation);
        } catch (IOException ex) {
            Logger.getLogger(MNBarPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GitException ex) {
            Logger.getLogger(MNBarPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MNBarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
