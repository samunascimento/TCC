package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureAlgorithm;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
    private boolean ignoreFormatting;

    public MNBarPanel(String repositoryPath, int contextLines, boolean ignoreFormatting) {
        this.repositoryLocation = repositoryPath.replace("\\", "/");
        this.contextLines = contextLines;
        this.ignoreFormatting = ignoreFormatting;
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
        MergeNatureAlgorithm algorithm = new MergeNatureAlgorithm(repositoryLocation, contextLines, ignoreFormatting);
        algorithm.startAlgorithm();
        this.project = algorithm.getProject();
    }

}
