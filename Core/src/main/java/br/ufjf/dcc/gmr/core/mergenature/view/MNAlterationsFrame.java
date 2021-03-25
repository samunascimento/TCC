package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import br.ufjf.dcc.gmr.core.vcs.types.LineType;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 25-03-2021
 */
public class MNAlterationsFrame {
    
    private static Font FONT = new JTextArea().getFont();

    public static void openAlterations(List<LineInformation> lines, Conflict conflict) {

        JFrame frame = new JFrame();

        frame.setTitle(conflict.getParent1FileName());
        frame.setResizable(true);
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(MNFrame.PRIMARY_COLOR);
        JScrollPane scroll = new JScrollPane(mainPanel);

        JPanel bottonAjust = new JPanel();
        bottonAjust.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(0, 0, 0, 0);

        for (LineInformation line : lines) {
            mainPanel.add(generateLabel(line), gbc);
            gbc.gridy++;
        }
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(bottonAjust, gbc);

        frame.add(scroll);
        frame.setVisible(true);

    }

    private static JLabel generateLabel(LineInformation line) {
        JLabel label = new JLabel("");
        label.setFont(FONT);
        label.setOpaque(true);
        label.setBackground(Color.DARK_GRAY);
        if (line.getType() == LineType.ADDED) {
            label.setForeground(Color.RED);
            label.setText(" - " + line.getContent());
        } else {
            label.setForeground(Color.GREEN);
            label.setText(" + " + line.getContent());
        }
        return label;
    }

}
