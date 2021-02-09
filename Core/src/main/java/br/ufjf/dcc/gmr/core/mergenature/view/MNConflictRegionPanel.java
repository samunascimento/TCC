package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 07-01-2021
 */
public class MNConflictRegionPanel extends JPanel {

    private static GridBagConstraints INSIDE_CONSTRAINTS;
    private ConflictRegion region;

    public MNConflictRegionPanel(ConflictRegion region) {
        this.region = region;
        set();
    }

    private void set() {

        this.setOpaque(true);
        this.setLayout(new GridBagLayout());
        this.setBackground(MNFrame.PRIMARY_COLOR);

        INSIDE_CONSTRAINTS = new GridBagConstraints();
        INSIDE_CONSTRAINTS.weightx = 1;
        INSIDE_CONSTRAINTS.weighty = 1;
        INSIDE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
        INSIDE_CONSTRAINTS.insets = new Insets(0, 0, 0, 0);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;

        JLabel conflictLabel = new JLabel("Conflict Region");
        conflictLabel.setFont(conflictLabel.getFont().deriveFont((float) 30.0));
        conflictLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        conflictLabel.setOpaque(false);
        gbc.gridwidth = 2;
        this.add(conflictLabel, gbc);

        JLabel altenativeView = new JLabel("Show alternative view");
        altenativeView.setFont(conflictLabel.getFont().deriveFont((float) 10.0));
        altenativeView.setForeground(Color.CYAN);
        altenativeView.setOpaque(false);
        altenativeView.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MNAlternativeView.openAlternativeView(region);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                altenativeView.setForeground(Color.WHITE);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                altenativeView.setForeground(Color.BLUE);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                altenativeView.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                altenativeView.setForeground(Color.CYAN);
            }
        });
        gbc.gridy = 1;
        gbc.weightx = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        this.add(altenativeView, gbc);

        JPanel lateralAjust = new JPanel();
        lateralAjust.setOpaque(false);
        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(lateralAjust, gbc);

        JPanel conflictPanel = getConflictTextArea(this.region);
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(conflictPanel, gbc);

        JLabel solutionLabel = new JLabel("Solution: " + region.getDeveloperDecision());
        solutionLabel.setFont(conflictLabel.getFont().deriveFont((float) 30.0));
        solutionLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        solutionLabel.setOpaque(false);
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        this.add(solutionLabel, gbc);

        JTextArea solutionTextArea = new JTextArea(region.getSolutionText());
        solutionTextArea.setBackground(MNFrame.PRIMARY_COLOR);
        solutionTextArea.setBorder(BorderFactory.createEmptyBorder(0, 2 * MNFrame.BORDER_GAP, 0, 2 * MNFrame.BORDER_GAP));
        solutionTextArea.setForeground(MNFrame.SECUNDARY_COLOR);
        solutionTextArea.setEditable(false);
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        this.add(solutionTextArea, gbc);

        JLabel structuresLabel = new JLabel("Structures");
        structuresLabel.setFont(conflictLabel.getFont().deriveFont((float) 30.0));
        structuresLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        structuresLabel.setOpaque(false);
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        this.add(structuresLabel, gbc);

        JTextArea structuresTextArea = new JTextArea(region.getStructures());
        structuresTextArea.setBackground(MNFrame.PRIMARY_COLOR);
        structuresTextArea.setForeground(MNFrame.SECUNDARY_COLOR);
        structuresTextArea.setEditable(false);
        structuresTextArea.setBorder(BorderFactory.createEmptyBorder(0, 2 * MNFrame.BORDER_GAP, 0, 2 * MNFrame.BORDER_GAP));
        gbc.gridy = 6;
        gbc.gridwidth = 3;
        this.add(structuresTextArea, gbc);

        JRadioButton useOutmost = new JRadioButton("Show only outmost");
        useOutmost.setBackground(MNFrame.PRIMARY_COLOR);
        useOutmost.setForeground(MNFrame.SECUNDARY_COLOR);
        useOutmost.addActionListener((ActionEvent evt) -> {
            if (useOutmost.isSelected()) {
                structuresTextArea.setText(region.getOutmostedStructures());
            } else {
                structuresTextArea.setText(region.getStructures());
            }
        });
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        this.add(useOutmost, gbc);

        JPanel bottonAjust = new JPanel();
        bottonAjust.setOpaque(false);
        gbc.gridy = 8;
        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(bottonAjust, gbc);

    }

    public static JPanel getConflictTextArea(ConflictRegion region) {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 2 * MNFrame.BORDER_GAP, 0, 2 * MNFrame.BORDER_GAP));
        GridBagConstraints gbc = INSIDE_CONSTRAINTS;

        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JTextArea beforeContext = new JTextArea(region.getBeforeContext() + "\n" + region.getBeginText());
        beforeContext.setBackground(MNFrame.PRIMARY_COLOR);
        beforeContext.setForeground(MNFrame.SECUNDARY_COLOR);
        beforeContext.setEditable(false);
        beforeContext.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        gbc.gridy = 0;
        panel.add(beforeContext, gbc);

        JTextArea v1 = new JTextArea(region.getV1Text());
        v1.setBackground(MNFrame.PRIMARY_COLOR);
        v1.setForeground(Color.CYAN);
        v1.setEditable(false);
        v1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        gbc.gridy = 1;
        panel.add(v1, gbc);

        JTextArea separator = new JTextArea("=======");
        separator.setBackground(MNFrame.PRIMARY_COLOR);
        separator.setForeground(MNFrame.SECUNDARY_COLOR);
        separator.setEditable(false);
        separator.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        gbc.gridy = 2;
        panel.add(separator, gbc);

        JTextArea v2 = new JTextArea(region.getV2Text());
        v2.setBackground(MNFrame.PRIMARY_COLOR);
        v2.setForeground(Color.MAGENTA);
        v2.setEditable(false);
        v2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        gbc.gridy = 3;
        panel.add(v2, gbc);

        JTextArea afterContext = new JTextArea(region.getEndText() + "\n" + region.getAfterContext());
        afterContext.setBackground(MNFrame.PRIMARY_COLOR);
        afterContext.setForeground(MNFrame.SECUNDARY_COLOR);
        afterContext.setEditable(false);
        afterContext.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        gbc.gridy = 4;
        panel.add(afterContext, gbc);

        JPanel bottonAjust = new JPanel();
        bottonAjust.setOpaque(false);
        gbc.gridy = 5;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(bottonAjust, gbc);

        return panel;
    }

}
