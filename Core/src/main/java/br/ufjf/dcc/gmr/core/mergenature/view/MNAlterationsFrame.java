package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import br.ufjf.dcc.gmr.core.vcs.types.LineType;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
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

    private static String allText;

    public static void openAlterations(List<LineInformation> lines, ConflictFile conflict) {

        int beforeLine = 0;
        allText = "";

        JFrame frame = new JFrame();

        frame.setTitle(conflict.getParent1FileName());
        frame.setResizable(true);
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(MNFrame.PRIMARY_COLOR);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP));

        JPanel topPanel = new JPanel(new GridBagLayout());
        topPanel.setBackground(MNFrame.PRIMARY_COLOR);
        topPanel.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, MNFrame.BORDER_GAP, true));
        JScrollPane scroll = new JScrollPane(topPanel);
        scroll.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        JButton copyButton = new JButton("Copy Text");
        copyButton.addActionListener((ActionEvent evt) -> {
            StringSelection selection = new StringSelection(allText);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, selection);
        });

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
            if (line.getLineNumber() != beforeLine) {
                beforeLine = line.getLineNumber();
                gbc.insets = new Insets(20, MNFrame.BORDER_GAP, 0, 0);
                topPanel.add(generateLabel(line), gbc);
                allText = allText + "\n\n" + line.getContent();
            } else {
                gbc.insets = new Insets(0, MNFrame.BORDER_GAP, 0, 0);
                topPanel.add(generateLabel(line), gbc);
                allText = allText + "\n" + line.getContent();
            }
            gbc.gridy++;
        }
        gbc.gridy++;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        topPanel.add(bottonAjust, gbc);

        gbc = new GridBagConstraints();
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        mainPanel.add(scroll, gbc);
        gbc.gridy++;
        gbc.weighty = 0;
        gbc.fill = gbc.fill = GridBagConstraints.NONE;
        mainPanel.add(copyButton, gbc);

        allText = allText.replaceFirst("\n\n", "");
        frame.add(mainPanel);
        frame.setVisible(true);

    }

    private static JLabel generateLabel(LineInformation line) {
        JLabel label = new JLabel("");
        label.setFont(FONT);
        label.setOpaque(false);
        label.setBackground(Color.DARK_GRAY);
        if (line.getType() == LineType.ADDED) {
            label.setForeground(Color.RED);
            label.setText(line.getContent());
        } else {
            label.setForeground(Color.GREEN);
            label.setText(line.getContent());
        }
        return label;
    }

}
