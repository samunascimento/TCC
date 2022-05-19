package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 07-01-2021
 */
public class MNCommitInfoPanel extends JPanel {

    private Merge merge;
    private JTextArea textArea;
    private JComboBox comboBox;

    public MNCommitInfoPanel(Merge merge) {
        this.merge = merge;
        set();
    }

    private void set() {

        int i = 0;

        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        textArea = new JTextArea(merge.getMergeCommit().toString());
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

        comboBox = new JComboBox();
        comboBox.addItem("Merge");
        for (Commit parent : merge.getParents()) {
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
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(comboBox, gbc);

        JLabel mergeType = new JLabel(merge.getMergeType().name());
        mergeType.setOpaque(false);
        mergeType.setForeground(MNFrame.SECUNDARY_COLOR);
        mergeType.setFont(mergeType.getFont().deriveFont((float) 9.0));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(mergeType, gbc);

    }

    private void switchCommit() {
        if (comboBox.getSelectedIndex() == 0) {
            textArea.setText(merge.getMergeCommit().toString());
        } else if (comboBox.getSelectedIndex() == comboBox.getItemCount() - 1) {
            if (merge.getMergeBase() == null) {
                textArea.setText("This merge don't have a common\nancestor between it's parents, so the\n ancestor commit not exist");
            } else {
                textArea.setText(merge.getMergeBase().toString());
            }
        } else {
            textArea.setText(merge.getParents().get(comboBox.getSelectedIndex() - 1).toString());
        }
    }

}
