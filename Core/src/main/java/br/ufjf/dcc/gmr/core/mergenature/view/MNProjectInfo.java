package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
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

    private Project project;

    public MNProjectInfo(Project project) {
        this.project = project;
        set();
    }

    private void set() {

        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        String form = "Name: " + project.getName() + "\nURL: " + project.getUrl() + "\nOrganization: " + project.getOrganization();
        JTextArea textArea = new JTextArea(form);
        textArea.setEditable(false);
        textArea.setBackground(MNFrame.PRIMARY_COLOR);
        textArea.setForeground(MNFrame.SECUNDARY_COLOR);

        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        JButton metricsButton = new JButton("Metrics");
        metricsButton.addActionListener((ActionEvent evt) -> {
            MNMetrics.openMetrics(project);
        });

        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(scroll, gbc);

        gbc.gridx++;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(metricsButton, gbc);
    }

}
