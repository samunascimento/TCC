package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GitRepositoryAnalysis;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author joao_lima
 */
public class ConflictAnalysisProgressBarPanel extends JPanel implements Runnable{
    
    private JProgressBar progressBar;
    private JLabel processLabel;
    private String repositoryPath;
    private int lineContext;
    private List<MergeEvent> mergeEventList;
    
    public ConflictAnalysisProgressBarPanel(String repositoryPath, int lineContext){
        this.repositoryPath = repositoryPath;
        this.lineContext = lineContext;
        this.mergeEventList = null;
        this.progressBar = new JProgressBar();
        this.processLabel = new JLabel("Starting");
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        progressBar.setIndeterminate(true);
        this.add(this.processLabel,gbc);
        gbc.gridy = 1;
        this.add(this.progressBar,gbc);      
    }

    @Override
    public void run() {
        GitRepositoryAnalysis repositoryAnalysis = new GitRepositoryAnalysis(repositoryPath,lineContext,this);
        try {
            repositoryAnalysis.startAnalysis();
        }catch(IOException ex) {}
        this.mergeEventList = repositoryAnalysis.getMergeEventList();
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
    
    
}
