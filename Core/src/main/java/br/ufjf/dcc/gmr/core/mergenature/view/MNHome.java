package br.ufjf.dcc.gmr.core.mergenature.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * The home panel to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 05-01-2021
 */
public class MNHome extends JPanel {

    private MNFrame frame;

    private MNInputPanel inputPanel;

    public MNHome(MNFrame frame) {
        this.frame = frame;
        inputPanel = new MNInputPanel(this);
        set();
    }

    public MNFrame getFrame() {
        return frame;
    }

    public MNInputPanel getInputPanel() {
        return inputPanel;
    }
    
    private void set() {

        this.setBackground(MNFrame.PRIMARY_COLOR);
        this.setBorder(BorderFactory.createEmptyBorder(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP));
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(inputPanel, gbc);

    }

}
