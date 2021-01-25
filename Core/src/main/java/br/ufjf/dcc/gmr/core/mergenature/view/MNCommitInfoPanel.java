package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
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
public class MNCommitInfoPanel extends JPanel {

    private Commit merge;
    private List<Commit> parents;
    private Commit ancestor;
    private JTextArea textArea;
    private JComboBox comboBox;

    public MNCommitInfoPanel(Commit merge, List<Commit> parents, Commit ancestor) {
        this.merge = merge;
        this.parents = parents;
        this.ancestor = ancestor;
        set();
    }

    private void set() {

        int i = 0;

        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        textArea = new JTextArea(merge.toString());
        textArea.setEditable(false);
        textArea.setBackground(MNFrame.PRIMARY_COLOR);
        textArea.setForeground(MNFrame.SECUNDARY_COLOR);
        JScrollPane scroll = new JScrollPane(textArea);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(scroll, gbc);

        comboBox = new JComboBox();
        comboBox.addItem("Merge");
        for (Commit parent : parents) {
            comboBox.addItem("Parent " + (++i));
        }
        comboBox.addItem("Ancestor");
        comboBox.addActionListener((ActionEvent evt) -> {
            switchCommit();
        });
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(comboBox, gbc);

    }

    private void switchCommit() {
        if (comboBox.getSelectedIndex() == 0) {
            textArea.setText(merge.toString());
        } else if (comboBox.getSelectedIndex() == comboBox.getItemCount() - 1) {
            textArea.setText(ancestor.toString());
        } else {
            textArea.setText(parents.get(comboBox.getSelectedIndex() - 1).toString());
        }
    }

}
