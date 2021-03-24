package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 07-01-2021
 */
public class MNMergePanel extends JPanel {

    private GridBagConstraints INSIDE_CONSTRAINTS;
    private Merge merge;
    private JPanel SPanel;

    public MNMergePanel(Merge merge) {
        this.merge = merge;
        set();
    }

    public MNMergePanel() {
        setEmpty();
    }

    private void set() {

        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        INSIDE_CONSTRAINTS = new GridBagConstraints();
        INSIDE_CONSTRAINTS.weightx = 1;
        INSIDE_CONSTRAINTS.weighty = 1;
        INSIDE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
        INSIDE_CONSTRAINTS.insets = new Insets(0, 0, 0, 0);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        JPanel NWPanel = new JPanel();
        NWPanel.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, MNFrame.BORDER_GAP, true));
        NWPanel.setPreferredSize(new Dimension(1, 140));
        NWPanel.setOpaque(false);
        NWPanel.setLayout(new GridBagLayout());
        NWPanel.add(new MNConflictPanel(this, merge.getConflicts()), INSIDE_CONSTRAINTS);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(NWPanel, gbc);

        JPanel NEPanel = new JPanel();
        NEPanel.setPreferredSize(new Dimension(1, 140));
        NEPanel.setOpaque(false);
        NEPanel.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, MNFrame.BORDER_GAP, true));
        NEPanel.setLayout(new GridBagLayout());
        NEPanel.add(new MNCommitInfoPanel(merge), INSIDE_CONSTRAINTS);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        this.add(NEPanel, gbc);

        SPanel = new JPanel();
        SPanel.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, MNFrame.BORDER_GAP, true));
        SPanel.setPreferredSize(new Dimension(1, 1));
        SPanel.setOpaque(false);
        SPanel.setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(SPanel, gbc);
        if(!merge.getConflicts().isEmpty()){
            if(!merge.getConflicts().get(0).getConflictRegions().isEmpty()){
                updateConflictRegion(merge.getConflicts().get(0).getConflictRegions().get(0));
            }
        }

    }

    private void setEmpty() {

        this.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, MNFrame.BORDER_GAP, true));
        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JLabel label = new JLabel();
        label.setFont(label.getFont().deriveFont((float) 50.0));
        label.setText("Double click a row in the table");
        label.setForeground(MNFrame.SECUNDARY_COLOR);
        this.add(label, gbc);

    }

    public void updateConflictRegion(ConflictRegion region) {
        if (SPanel != null) {
            SPanel.removeAll();
            SPanel.revalidate();
            SPanel.repaint();
            if (region != null) {
                MNConflictRegionPanel regionPanel = new MNConflictRegionPanel(region);
                JScrollPane scroll = new JScrollPane(regionPanel);
                scroll.setOpaque(false);
                SPanel.add(scroll, INSIDE_CONSTRAINTS);
            } else {
                JPanel emptyPanel = new JPanel();
                emptyPanel.setOpaque(false);
                SPanel.add(emptyPanel, INSIDE_CONSTRAINTS);
            }
        }
    }
    
    

}
