package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

        textArea = new JTextArea("Parent 1's file:\nParent 2's file:\nAncestor's file:\nConflict Type:\nConflict Regions:\nHas Outside Alterations:\nHas Outside Alterations Ignoring Formatting:");
        if (!conflicts.isEmpty()) {
            textArea.setText(conflicts.get(0).toString());
        }
        textArea.setEditable(false);
        textArea.setBackground(MNFrame.PRIMARY_COLOR);
        textArea.setForeground(MNFrame.SECUNDARY_COLOR);
        textArea.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        JLabel showFileAlteration = new JLabel("Show file alterations");
        showFileAlteration.setFont(textArea.getFont());
        showFileAlteration.setForeground(Color.CYAN);
        showFileAlteration.setOpaque(false);
        showFileAlteration.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(conflicts.isEmpty()){
                    JOptionPane.showMessageDialog(null, "The merge don't has conflicts", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    mergePanel.getProjectPanel().showFileAlterationsProcess(conflicts.get(conflictComboBox.getSelectedIndex()));
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                showFileAlteration.setForeground(Color.WHITE);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                showFileAlteration.setForeground(Color.BLUE);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                showFileAlteration.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                showFileAlteration.setForeground(Color.CYAN);
            }
        });

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

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;

        this.add(scroll, gbc);
        gbc.gridy++; 
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        this.add(showFileAlteration, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(conflictComboBox, gbc);
        gbc.gridx++;
        this.add(regionComboBox, gbc);


    }

    private void switchConflict() {
        regionComboBox.removeAllItems();
        textArea.setText("Parent 1's file:\nParent 2's file:\nAncestor's file:\nConflict Type:\nConflict Regions:Has Outside Alterations:\nHas Outside Alterations Ignoring Formatting:");
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
                if (conflicts.get(conflictComboBox.getSelectedIndex()).getConflictRegions().isEmpty()) {
                    mergePanel.updateConflictRegion(null);
                } else {
                    mergePanel.updateConflictRegion(conflicts.get(conflictComboBox.getSelectedIndex()).getConflictRegions().get(regionComboBox.getSelectedIndex()));
                }
            }
        }

    }

}
