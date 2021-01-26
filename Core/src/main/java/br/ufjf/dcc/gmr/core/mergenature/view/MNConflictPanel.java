package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 07-01-2021
 */
public class MNConflictPanel extends JPanel {

    private List<Conflict> conflicts;

    private MNMergePanel mergePanel;
    private JComboBox conflictComboBox;
    private JComboBox regionComboBox;
    private JTextArea textArea;

    public MNConflictPanel(MNMergePanel mergePanel, List<Conflict> conflicts) {
        this.mergePanel = mergePanel;
        this.conflicts = conflicts;
        set();
    }

    private void set() {

        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        textArea = new JTextArea("Parent 1's file:\nParent 2's file:\nAncestor's file:\nConflict Type:\nConflict Regions:");
        if (!conflicts.isEmpty()) {
            textArea.setText(conflicts.get(0).toString());
        }
        textArea.setEditable(false);
        textArea.setBackground(MNFrame.PRIMARY_COLOR);
        textArea.setForeground(MNFrame.SECUNDARY_COLOR);
        JScrollPane scroll = new JScrollPane(textArea);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(scroll, gbc);

        conflictComboBox = new JComboBox();
        for (Conflict conflict : conflicts) {
            if (!conflict.getParent1FileName().equals("Absent")) {
                conflictComboBox.addItem(conflict.getParent1FileName() + " (" + conflict.getConflictRegions().size() + " regions)");
            } else {
                conflictComboBox.addItem(conflict.getParent2FileName() + " (" + conflict.getConflictRegions().size() + " regions)");
            }

        }
        conflictComboBox.addActionListener((ActionEvent evt) -> {
            switchConflict();
        });
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(conflictComboBox, gbc);

        regionComboBox = new JComboBox();
        if (!conflicts.isEmpty()) {
            for (ConflictRegion region : conflicts.get(0).getConflictRegions()) {
                regionComboBox.addItem(region.getBeginLine() + " - " + region.getEndLine());
            }
            if (conflicts.get(0).getConflictRegions().isEmpty()) {
                mergePanel.updateConflictRegion(null);
            } else {
                mergePanel.updateConflictRegion(conflicts.get(0).getConflictRegions().get(0));
            }
        } else {
            mergePanel.updateConflictRegion(null);
        }
        regionComboBox.addActionListener((ActionEvent evt) -> {
            switchRegion();
        });
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(regionComboBox, gbc);

    }

    private void switchConflict() {
        regionComboBox.removeAllItems();
        textArea.setText("Parent 1's file:\nParent 2's file:\nAncestor's file:\nConflict Type:\nConflict Regions:");
        if (conflictComboBox.getSelectedIndex() >= 0 && conflictComboBox.getSelectedIndex() < conflicts.size()) {
            for (ConflictRegion region : conflicts.get(conflictComboBox.getSelectedIndex()).getConflictRegions()) {
                regionComboBox.addItem(region.getBeginLine() + " - " + region.getEndLine());
            }
            textArea.setText(conflicts.get(conflictComboBox.getSelectedIndex()).toString());
        }
        switchRegion();

    }

    private void switchRegion() {
        if (conflictComboBox.getSelectedIndex() >= 0 && conflictComboBox.getSelectedIndex() < conflicts.size()) {
            if (regionComboBox.getSelectedIndex() >= 0 && regionComboBox.getSelectedIndex() < conflicts.get(conflictComboBox.getSelectedIndex()).getConflictRegions().size()) {
                if(conflicts.get(conflictComboBox.getSelectedIndex()).getConflictRegions().isEmpty()){
                    mergePanel.updateConflictRegion(null);
                } else {
                    mergePanel.updateConflictRegion(conflicts.get(conflictComboBox.getSelectedIndex()).getConflictRegions().get(regionComboBox.getSelectedIndex()));
                }
            }
        }

    }

}
