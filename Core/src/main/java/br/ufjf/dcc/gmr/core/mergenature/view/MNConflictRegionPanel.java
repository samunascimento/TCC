package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Chunk;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 07-01-2021
 */
public class MNConflictRegionPanel extends JPanel {

    private static GridBagConstraints INSIDE_CONSTRAINTS;
    private Chunk chunk;

    public MNConflictRegionPanel(Chunk region) {
        this.chunk = region;
        set();
    }

    private void set() {
        
        INSIDE_CONSTRAINTS = new GridBagConstraints();
        INSIDE_CONSTRAINTS.weightx = 1;
        INSIDE_CONSTRAINTS.weighty = 1;
        INSIDE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
        INSIDE_CONSTRAINTS.insets = new Insets(0, 0, 0, 0);

        this.setOpaque(true);
        this.setLayout(new GridBagLayout());
        this.setBackground(MNFrame.PRIMARY_COLOR);

        JLabel conflictLabel = new JLabel("Chunk");
        conflictLabel.setFont(conflictLabel.getFont().deriveFont((float) 30.0));
        conflictLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        conflictLabel.setOpaque(false);

        JLabel altenativeView = new JLabel("Show alternative view");
        //altenativeView.setFont(conflictLabel.getFont().deriveFont((float) 10.0));
        altenativeView.setForeground(MNFrame.OPTION_COLOR);
        altenativeView.setOpaque(false);
        altenativeView.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MNAlternativeView.openAlternativeView(chunk);
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
                altenativeView.setForeground(MNFrame.OPTION_COLOR);
            }
        });
        
        JPanel conflictPanel = getConflictTextArea(this.chunk);

        JLabel solutionLabel = new JLabel("Resolution: " + chunk.getDeveloperDecision());
        solutionLabel.setFont(conflictLabel.getFont().deriveFont((float) 30.0));
        solutionLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        solutionLabel.setOpaque(false);
        

        JTextArea solutionTextArea = new JTextArea(chunk.getSolutionText());
        solutionTextArea.setBackground(MNFrame.PRIMARY_COLOR);
        solutionTextArea.setBorder(BorderFactory.createEmptyBorder(0, 2 * MNFrame.BORDER_GAP, 0, 2 * MNFrame.BORDER_GAP));
        solutionTextArea.setForeground(MNFrame.SECUNDARY_COLOR);
        solutionTextArea.setEditable(false);

        JLabel structuresLabel = new JLabel("Language Constructs");
        structuresLabel.setFont(conflictLabel.getFont().deriveFont((float) 30.0));
        structuresLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        structuresLabel.setOpaque(false);

        JTextArea structuresTextArea = new JTextArea(chunk.getLanguageConstructs());
        structuresTextArea.setBackground(MNFrame.PRIMARY_COLOR);
        structuresTextArea.setForeground(MNFrame.SECUNDARY_COLOR);
        structuresTextArea.setEditable(false);
        structuresTextArea.setBorder(BorderFactory.createEmptyBorder(0, 2 * MNFrame.BORDER_GAP, 0, 2 * MNFrame.BORDER_GAP));
        
        JPanel bottonAjust = new JPanel();
        bottonAjust.setOpaque(false);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        
        this.add(conflictLabel, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        this.add(altenativeView, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(conflictPanel, gbc);
        gbc.gridy++;
        this.add(solutionLabel, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(solutionTextArea, gbc);
        gbc.gridy++;
        this.add(structuresLabel, gbc);
        gbc.gridy++;
        this.add(structuresTextArea, gbc);
        gbc.gridy++;
        gbc.weighty = 1;
        this.add(bottonAjust, gbc);

    }

    public static JPanel getConflictTextArea(Chunk chunk) {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 2 * MNFrame.BORDER_GAP, 0, 2 * MNFrame.BORDER_GAP));
        GridBagConstraints gbc = INSIDE_CONSTRAINTS;

        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JTextArea beforeContext = new JTextArea(chunk.getPrefix(true)+ "\n" + chunk.getBegin());
        beforeContext.setBackground(MNFrame.PRIMARY_COLOR);
        beforeContext.setForeground(MNFrame.SECUNDARY_COLOR);
        beforeContext.setEditable(false);
        beforeContext.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        gbc.gridy = 0;
        panel.add(beforeContext, gbc);

        JTextArea v1 = new JTextArea(chunk.getV1());
        v1.setBackground(MNFrame.PRIMARY_COLOR);
        v1.setForeground(MNFrame.V1_COLOR);
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

        JTextArea v2 = new JTextArea(chunk.getV2());
        v2.setBackground(MNFrame.PRIMARY_COLOR);
        v2.setForeground(MNFrame.V2_COLOR);
        v2.setEditable(false);
        v2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        gbc.gridy = 3;
        panel.add(v2, gbc);

        JTextArea afterContext = new JTextArea(chunk.getEnd()+ "\n" + chunk.getSuffix(true));
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
