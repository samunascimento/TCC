package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.exception.FileNotExistInCommitException;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.IOException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 06-01-2021
 */
public class MNProjectPanel extends JPanel {

    private GridBagConstraints INSIDE_CONSTRAINTS;
    public static int MIN_X = 300;
    public static int MIN_Y = 85;
    private Project project;
    private MNProjectInfo projectInfo;
    private MNMergesTable mergesList;
    private JPanel mergePanel;
    private MNRepositoryPathFrame repositoryPathFrame;

    public MNProjectPanel(Project project) {
        this.project = project;
        this.repositoryPathFrame = new MNRepositoryPathFrame(this);
        set();
    }

    public Project getProject() {
        return project;
    }

    private void set() {

        this.setBackground(MNFrame.PRIMARY_COLOR);
        this.setBorder(BorderFactory.createEmptyBorder(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP));
        this.setLayout(new GridBagLayout());

        INSIDE_CONSTRAINTS = new GridBagConstraints();
        INSIDE_CONSTRAINTS.weightx = 1;
        INSIDE_CONSTRAINTS.weighty = 1;
        INSIDE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
        INSIDE_CONSTRAINTS.insets = new Insets(0, 0, 0, 0);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        projectInfo = new MNProjectInfo(project.getName(), project.getUrl(), project.getOrganization());
        projectInfo.setPreferredSize(new Dimension(MIN_X, MIN_Y));
        projectInfo.setOpaque(false);
        projectInfo.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, MNFrame.BORDER_GAP, true));
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(projectInfo, gbc);

        mergesList = new MNMergesTable(this, project.getMerges());
        mergesList.setPreferredSize(new Dimension(MIN_X, 1));
        mergesList.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, MNFrame.BORDER_GAP, true));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        this.add(mergesList, gbc);

        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;

        mergePanel = new JPanel();
        mergePanel.setPreferredSize(new Dimension(1, 1));
        mergePanel.setLayout(new GridBagLayout());
        mergePanel.setOpaque(false);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 0, 0, 0);
        this.add(mergePanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridheight = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        mergePanel.add(new MNMergePanel(), gbc);

    }

    public void upadateMergePanel(Merge merge) {
        this.mergePanel.removeAll();
        this.mergePanel.revalidate();
        this.mergePanel.repaint();
        mergePanel.add(new MNMergePanel(this, merge), INSIDE_CONSTRAINTS);

    }

    public void showFileAlterationsProcess(Conflict conflict) {
        if (repositoryPathFrame.repositoryPathIsVerified()) {
            showFileAlterations(conflict, repositoryPathFrame.getRepositoryPath());
        } else {
            repositoryPathFrame.showRepositoryPathFrame(conflict);
        }
    }

    public void showFileAlterations(Conflict conflict, String repositoryPath) {
        try {
            if (Git.getAllMerges(repositoryPath).size() < conflict.getMerge().getProject().getMerges().size()) {
                JOptionPane.showMessageDialog(null, repositoryPath + " is a oldest version of this project!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                MergeNatureTools.prepareAnalysis(repositoryPath);
                Git.mergeIsConflicting(conflict.getMerge().getParents().get(0).getCommitHash(), conflict.getMerge().getParents().get(1).getCommitHash(), repositoryPath);
                repositoryPathFrame.setRepositoryPathIsVerified(true);
                List<LineInformation> allLines = null;
                try {
                    allLines = Git.diff(repositoryPath,
                            conflict.getMerge().getMerge().getCommitHash() + ":" + conflict.getParent1FilePath(),
                            conflict.getParent1FilePath(), true, 0).get(0).getLines();
                } catch (FileNotExistInCommitException ex) {
                    try {
                        allLines = Git.diff(repositoryPath,
                                conflict.getMerge().getMerge().getCommitHash() + ":" + conflict.getParent2FilePath(),
                                conflict.getParent1FilePath(), true, 0).get(0).getLines();
                    } catch (FileNotExistInCommitException ex1) {
                        JOptionPane.showMessageDialog(null, "The solution file was renamed or deleted, impossible to get altered the lines", "Solution file not found", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                if(allLines != null){
                    MNAlterationsFrame.openAlterations(allLines, conflict);
                    MergeNatureTools.prepareAnalysis(repositoryPath);
                }
            }
        } catch (IOException | LocalRepositoryNotAGitRepository ex) {
            JOptionPane.showMessageDialog(null, repositoryPath + " isn't a git repository!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (RepositoryNotFound ex) {
            JOptionPane.showMessageDialog(null, repositoryPath + " don't exist in the system!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (InvalidCommitHash ex) {
            JOptionPane.showMessageDialog(null, repositoryPath + " isn't the same project of the persistence!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
