package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GitRepositoryAnalysis;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import br.ufjf.dcc.gmr.core.exception.RepositoryAlreadyExist;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author João Pedro Lima
 */
public class ConflictAnalysisProgressBarPanel extends JPanel implements Runnable {

    private final JProgressBar progressBar;
    private final JLabel processLabel;
    private final String repositoryPath;
    private final int lineContext;
    private List<MergeEvent> mergeEventList;

    public ConflictAnalysisProgressBarPanel(String repositoryPath, int lineContext) {
        this.repositoryPath = repositoryPath;
        this.lineContext = lineContext;
        this.mergeEventList = null;
        this.progressBar = new JProgressBar();
        this.processLabel = new JLabel("Starting");
        configure();

    }

    public List<MergeEvent> getMergeEventList() {
        return mergeEventList;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public JLabel getProcessLabel() {
        return processLabel;
    }

    private void configure() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        this.progressBar.setStringPainted(true);
        progressBar.setIndeterminate(true);
        progressBar.setPreferredSize(new Dimension(800, 25));

        this.add(this.processLabel, gbc);
        gbc.gridy = 1;
        this.add(this.progressBar, gbc);
    }

    /**
     *
     * @throws RepositoryAlreadyExist
     */
    @Override
    public void run() {
        GitRepositoryAnalysis repositoryAnalysis = new GitRepositoryAnalysis(repositoryPath, lineContext, this);
        try {
            repositoryAnalysis.startAnalysis();
        } catch (IOException ex) {
        }
        this.mergeEventList = repositoryAnalysis.getMergeEventList();
    }

}
