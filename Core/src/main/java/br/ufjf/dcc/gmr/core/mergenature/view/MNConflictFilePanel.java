package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Chunk;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
public class MNConflictFilePanel extends JPanel {

    private List<ConflictFile> conflicts;

    private MNMergePanel mergePanel;
    private JComboBox conflictComboBox;
    private JComboBox regionComboBox;
    private JTextArea textArea;

    public MNConflictFilePanel(MNMergePanel mergePanel, List<ConflictFile> conflicts) {
        this.mergePanel = mergePanel;
        this.conflicts = conflicts;
        set();
    }

    private void set() {

        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        textArea = new JTextArea("Parent 1's file:\nParent 2's file:\nMerge-Base's file:\nConflict File Type:\nChunks:\nHas Outside Alterations:\nHas Outside Alterations Ignoring Formatting:");
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
        showFileAlteration.setForeground(MNFrame.OPTION_COLOR);
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
                showFileAlteration.setForeground(MNFrame.OPTION_COLOR);
            }
        });

        conflictComboBox = new JComboBox();
        for (ConflictFile conflict : conflicts) {
            if (!conflict.getParent1FilePath().equals("Absent")) {
                conflictComboBox.addItem(conflict.getParent1FilePath() + " (" + conflict.getChunks().size() + " regions)");
            } else {
                conflictComboBox.addItem(conflict.getParent2FilePath() + " (" + conflict.getChunks().size() + " regions)");
            }

        }
        conflictComboBox.addActionListener((ActionEvent evt) -> {
            switchConflict();
        });

        regionComboBox = new JComboBox();
        if (!conflicts.isEmpty()) {
            for (Chunk chunk : conflicts.get(0).getChunks()) {
                regionComboBox.addItem(chunk.getBeginLine() + " - " + chunk.getEndLine());
            }
            if (conflicts.get(0).getChunks().isEmpty()) {
                mergePanel.updateConflictRegion(null);
            } else {
                mergePanel.updateConflictRegion(conflicts.get(0).getChunks().get(0));
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
        textArea.setText("Parent 1's file:\nParent 2's file:\nMerge-Base's file:\nConflict File Type:\nChunks:Has Outside Alterations:\nHas Outside Alterations Ignoring Formatting:");
        if (conflictComboBox.getSelectedIndex() >= 0 && conflictComboBox.getSelectedIndex() < conflicts.size()) {
            for (Chunk chunk : conflicts.get(conflictComboBox.getSelectedIndex()).getChunks()) {
                regionComboBox.addItem(chunk.getBeginLine() + " - " + chunk.getEndLine());
            }
            textArea.setText(conflicts.get(conflictComboBox.getSelectedIndex()).toString());
        }
        switchRegion();

    }

    private void switchRegion() {
        if (conflictComboBox.getSelectedIndex() >= 0 && conflictComboBox.getSelectedIndex() < conflicts.size()) {
            if (regionComboBox.getSelectedIndex() >= 0 && regionComboBox.getSelectedIndex() < conflicts.get(conflictComboBox.getSelectedIndex()).getChunks().size()) {
                if (conflicts.get(conflictComboBox.getSelectedIndex()).getChunks().isEmpty()) {
                    mergePanel.updateConflictRegion(null);
                } else {
                    mergePanel.updateConflictRegion(conflicts.get(conflictComboBox.getSelectedIndex()).getChunks().get(regionComboBox.getSelectedIndex()));
                }
            }
        }

    }

}
