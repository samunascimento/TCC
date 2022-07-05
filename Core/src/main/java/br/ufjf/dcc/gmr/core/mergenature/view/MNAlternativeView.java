package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Chunk;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

/**
 * The frame is for an alternative form to see the data inside a ConflictRegion
 *
 * @author João Pedro Lima
 * @since 09-02-2021
 */
public class MNAlternativeView {

    public static void openAlternativeView(Chunk chunk) {

        //Frame
        JFrame alternativeView = new JFrame();
        alternativeView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        alternativeView.setTitle("(" + chunk.getBeginLine() + " - " + chunk.getEndLine() + ")");
        alternativeView.setResizable(true);
        alternativeView.setBounds(100, 100, MNFrame.MAX_BOUNDS.width - 200, MNFrame.MAX_BOUNDS.height - 200);
        alternativeView.setMinimumSize(new Dimension(800, 450));
        alternativeView.getContentPane().setBackground(MNFrame.PRIMARY_COLOR);
        alternativeView.setLayout(new GridBagLayout());

        GridBagConstraints panelsGBC = new GridBagConstraints();
        panelsGBC.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        GridBagConstraints itensGBC = new GridBagConstraints();
        itensGBC.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        //Conflict Panel
        JPanel conflictPanel = new JPanel();
        conflictPanel.setLayout(new GridBagLayout());
        conflictPanel.setBackground(MNFrame.PRIMARY_COLOR);
        conflictPanel.setBorder(BorderFactory.createEmptyBorder());
        JScrollPane conflictScroll = new JScrollPane(conflictPanel);
        conflictScroll.setBorder(BorderFactory.createEmptyBorder());

        JLabel conflictLabel = new JLabel("Chunk");
        conflictLabel.setFont(conflictLabel.getFont().deriveFont((float) 30.0));
        conflictLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        conflictLabel.setOpaque(false);
        itensGBC.weightx = 1;
        itensGBC.fill = GridBagConstraints.HORIZONTAL;
        conflictPanel.add(conflictLabel, itensGBC);

        JPanel conflictText = MNConflictRegionPanel.getConflictTextArea(chunk);
        JScrollPane conflictTextScroll = new JScrollPane(conflictText);
        conflictTextScroll.getViewport().setBackground(MNFrame.PRIMARY_COLOR);
        itensGBC.gridy = 1;
        itensGBC.weighty = 1;
        itensGBC.fill = GridBagConstraints.BOTH;
        conflictPanel.add(conflictTextScroll, itensGBC);

        itensGBC = new GridBagConstraints();
        itensGBC.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        //Solution Panel
        JPanel solutionPanel = new JPanel();
        solutionPanel.setLayout(new GridBagLayout());
        solutionPanel.setBackground(MNFrame.PRIMARY_COLOR);
        solutionPanel.setBorder(BorderFactory.createEmptyBorder());
        JScrollPane solutionScroll = new JScrollPane(solutionPanel);
        solutionScroll.setBorder(BorderFactory.createEmptyBorder());

        JLabel solutionLabel = new JLabel("Resolution: " + chunk.getDeveloperDecision());
        solutionLabel.setFont(conflictLabel.getFont().deriveFont((float) 30.0));
        solutionLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        solutionLabel.setOpaque(false);
        itensGBC.weightx = 1;
        itensGBC.fill = GridBagConstraints.HORIZONTAL;
        solutionPanel.add(solutionLabel, itensGBC);

        JTextArea solutionTextArea = new JTextArea(chunk.getSolutionText());
        solutionTextArea.setEditable(false);
        solutionTextArea.setBackground(MNFrame.PRIMARY_COLOR);
        solutionTextArea.setForeground(MNFrame.SECUNDARY_COLOR);
        solutionTextArea.setBorder(BorderFactory.createEmptyBorder(0, 2 * MNFrame.BORDER_GAP, 0, 2 * MNFrame.BORDER_GAP));
        JScrollPane solutionTextScroll = new JScrollPane(solutionTextArea);
        itensGBC.gridy = 1;
        itensGBC.weighty = 1;
        itensGBC.fill = GridBagConstraints.BOTH;
        solutionPanel.add(solutionTextScroll, itensGBC);

        //Split Pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, conflictScroll, solutionScroll);
        splitPane.setDividerLocation(MNFrame.MAX_BOUNDS.width / 2);
        splitPane.setLastDividerLocation(MNFrame.MAX_BOUNDS.width / 2);

        panelsGBC.weightx = 1;
        panelsGBC.weighty = 9;
        panelsGBC.fill = GridBagConstraints.BOTH;
        alternativeView.add(splitPane, panelsGBC);

        itensGBC = new GridBagConstraints();
        itensGBC.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        //Structures Panel
        JPanel structuresPanel = new JPanel();
        structuresPanel.setLayout(new GridBagLayout());
        structuresPanel.setBackground(MNFrame.PRIMARY_COLOR);
        structuresPanel.setBorder(BorderFactory.createEmptyBorder());

        JLabel structuresLabel = new JLabel("Language Constructs");
        structuresLabel.setFont(conflictLabel.getFont().deriveFont((float) 30.0));
        structuresLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        structuresLabel.setOpaque(false);
        itensGBC.weightx = 1;
        itensGBC.fill = GridBagConstraints.HORIZONTAL;
        structuresPanel.add(structuresLabel, itensGBC);

        JTextArea structuresText = new JTextArea(chunk.getLanguageConstructs());
        structuresText.setBackground(MNFrame.PRIMARY_COLOR);
        structuresText.setForeground(MNFrame.SECUNDARY_COLOR);
        structuresText.setEditable(false);
        structuresText.setBorder(BorderFactory.createEmptyBorder(0, 2 * MNFrame.BORDER_GAP, 0, 2 * MNFrame.BORDER_GAP));
        JScrollPane structuresTextScroll = new JScrollPane(structuresText);
        structuresTextScroll.getViewport().setBackground(MNFrame.PRIMARY_COLOR);
        structuresTextScroll.setPreferredSize(new Dimension(30, 60));
        itensGBC.gridy = 1;
        itensGBC.weighty = 1;
        itensGBC.fill = GridBagConstraints.BOTH;
        structuresPanel.add(structuresTextScroll, itensGBC);


        panelsGBC.gridy = 1;
        panelsGBC.weighty = 1;
        alternativeView.add(structuresPanel, panelsGBC);

        //END
        alternativeView.setVisible(true);

    }

}
