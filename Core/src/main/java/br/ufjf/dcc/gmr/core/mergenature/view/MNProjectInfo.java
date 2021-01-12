package br.ufjf.dcc.gmr.core.mergenature.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 07-01-2021
 */
public class MNProjectInfo extends JPanel {
    
    private String name;
    private String url;
    private String organization;

    public MNProjectInfo(String name, String url, String organization) {
        this.name = name;
        this.url = url;
        this.organization = organization;
        set();
    }
    
    private void set(){
        
        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        
        String form = "Name: " + name + "\nURL: " + url + "\nOrganization: " + organization;
        JTextArea textArea = new JTextArea(form);
        textArea.setEditable(false);
        textArea.setBackground(MNFrame.PRIMARY_COLOR);
        textArea.setForeground(MNFrame.SECUNDARY_COLOR);
        
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        
        this.add(scroll, gbc);
        
    }
    
    
    
}
