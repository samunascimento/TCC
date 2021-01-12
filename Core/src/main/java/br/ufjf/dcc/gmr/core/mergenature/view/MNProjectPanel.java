package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
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
    private JPanel conflictPanel;

    public MNProjectPanel(Project project) {
        this.project = project;
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

        mergesList = new MNMergesTable(this,project.getMerges());
        mergesList.setPreferredSize(new Dimension(MIN_X, 1));
        mergesList.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, MNFrame.BORDER_GAP, true));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        this.add(mergesList, gbc);

        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;

        conflictPanel = new JPanel();
        conflictPanel.setPreferredSize(new Dimension(1, 1));
        conflictPanel.setLayout(new GridBagLayout());
        conflictPanel.setOpaque(false);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0,0,0,0);
        this.add(conflictPanel, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridheight = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        conflictPanel.add(new MNMergePanel(),gbc);

    }

    public void upadateMergePanel(Merge merge) {
        this.conflictPanel.removeAll();
        this.conflictPanel.revalidate();
        this.conflictPanel.repaint();
        conflictPanel.add(new MNMergePanel(merge),INSIDE_CONSTRAINTS);
        
    }
    
}
