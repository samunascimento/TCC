package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.controller.GSONClass;
import br.ufjf.dcc.gmr.core.mergenature.dao.ProjectDAO;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * The frame to save a project in a database.
 *
 * @author João Pedro Lima
 * @since 15-04-2021
 */
public class MNDatabaseInteractions {

    public static void getSaveAnalysisInDBFrame(Connection connection, List<MNProjectPanel> projectPanels) {

        JFrame mainFrame = new JFrame("Save Analysis");
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setSize(400, 125);
        mainFrame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        JComboBox comboBox = new JComboBox();
        comboBox.setBorder(BorderFactory.createTitledBorder("Choose the analysis"));
        for (MNProjectPanel projectPanel : projectPanels) {
            comboBox.addItem(projectPanel.getProject().getName());
        }

        JProgressBar progressBar = new JProgressBar();
        progressBar.setVisible(false);
        progressBar.setIndeterminate(true);
        progressBar.setPreferredSize(new Dimension(1, 25));

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener((ActionEvent evt) -> {
            Thread barThread = new Thread() {
                @Override
                public void run() {
                    progressBar.setVisible(true);
                }
            };
            barThread.start();
            boolean check = true;
            Project project = projectPanels.get(comboBox.getSelectedIndex()).getProject();
            ProjectDAO projectDAO = new ProjectDAO(connection);
            try {
                projectDAO.insert(project);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Some error!", "ERROR", JOptionPane.ERROR_MESSAGE);
                check = false;
            } finally {
                barThread.interrupt();
                mainFrame.dispose();
                if (check) {
                    JOptionPane.showMessageDialog(null, project.getName() + " was saved in DB!", "Done", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        );

        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        mainPanel.add(comboBox, gbc);

        gbc.gridy++;
        gbc.weightx = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_START;

        mainPanel.add(saveButton, gbc);

        gbc.gridx++;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.LINE_START;

        mainPanel.add(progressBar, gbc);

        mainFrame.add(mainPanel);

        mainFrame.setVisible(
                true);

    }

    public static void getGetProjectFromDBFrame(Connection connection, MNTabbedPane tabbedPane) {

        ProjectDAO projectDAO = new ProjectDAO(connection);
        List<Project> projects;
        try {
            projects = projectDAO.selectAllProjectsWithoutMerges();
        } catch (SQLException ex) {
            System.out.println("Deu ruim");
            return;
        }

        JFrame mainFrame = new JFrame("Double click a row to get a project");
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setSize(500, 500);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.getRootPane().setBackground(MNFrame.PRIMARY_COLOR);
        mainFrame.getRootPane().setBorder(BorderFactory.createEmptyBorder(2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP));

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(MNFrame.PRIMARY_COLOR);
        mainPanel.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, 3, true));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        JTable table = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Project Name"
                }
        ) {
            Class[] types = new Class[]{
                Integer.class,
                String.class

            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        table.setRowHeight(30);
        table.setFillsViewportHeight(true);
        table.setBackground(MNFrame.PRIMARY_COLOR);
        table.setForeground(MNFrame.SECUNDARY_COLOR);
        table.setBorder(BorderFactory.createEmptyBorder());
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() > 1) {
                    Project project = projects.get(table.getSelectedRow());
                    try {
                        tabbedPane.addRemovableTab(project.getName() + "DB - " + project.getId(), null, new MNProjectPanel(projectDAO.select(project.getId())), null);
                    } catch (SQLException ex) {
                        System.out.println("Deu ruim 2");
                    }
                    mainFrame.dispose();
                }
            }
        });
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (Project project : projects) {
            model.addRow(new Object[]{
                project.getId(),
                project.getName()
            });
        }
        JScrollPane scroll = new JScrollPane(table);

        mainPanel.add(scroll, gbc);

        mainFrame.add(mainPanel);

        mainFrame.setVisible(true);
    }
}
