package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 31-01-2021
 */
public class MNAlternativeViewFrame extends JFrame {

    private ConflictRegion region;

    public MNAlternativeViewFrame(ConflictRegion region) {
        this.region = region;
        set();
    }

    private void set() {
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("(" + region.getBeginLine() + " - " + region.getEndLine()+ ")");
        this.setResizable(true);
        this.setBounds(100, 100, MNFrame.MAX_BOUNDS.width - 200, MNFrame.MAX_BOUNDS.height - 200);
        this.setMinimumSize(new Dimension(800, 450));
        
        
        this.setVisible(true);
        
    }

}
