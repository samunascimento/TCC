package br.ufjf.dcc.gmr.core.mergenature.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;

/**
 * Custom Tab Title for JTabbedPane
 *
 * @author João Pedro Lima
 * @since 05-01-2021
 */
public class RemovableTabTitle extends JPanel {

    public RemovableTabTitle(JTabbedPane tabbedPane, Component component, String title) {
        set(tabbedPane, component, title);
    }
    
    private void set(JTabbedPane tabbedPane, Component component, String title) {
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        this.setOpaque(false);

        JLabel titleLbl = new JLabel(title);
        titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        this.add(titleLbl);

        JButton closeButton = new JButton("x");
        closeButton.setPreferredSize(new Dimension(12, 12));
        closeButton.setToolTipText("Close");
        closeButton.setContentAreaFilled(false);
        closeButton.setBorder(new EtchedBorder());
        closeButton.setBorderPainted(false);
        closeButton.setFocusable(false);
        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tabbedPane.remove(component);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                closeButton.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                closeButton.setForeground(Color.BLACK);
            }
        }
        );
        this.add(closeButton);
    }
    
}
