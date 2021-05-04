package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.dao.ProjectDAO;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.awt.Dialog.ModalityType;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
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
        JDialog dialog = new JDialog();
        dialog.setModal(true);
        dialog.setSize(400, 125);
        dialog.setResizable(false);
        dialog.setAlwaysOnTop(true);
        dialog.setTitle("Save Analysis");
        dialog.setLocationRelativeTo(null);
        dialog.setModalityType(ModalityType.APPLICATION_MODAL);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        JComboBox comboBox = new JComboBox();
        comboBox.setBorder(BorderFactory.createTitledBorder("Choose the analysis"));
        for (MNProjectPanel projectPanel : projectPanels) {
            comboBox.addItem(projectPanel.getProject().getName());
        }

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener((ActionEvent evt) -> {
            progressBarForSaving(connection, projectPanels.get(comboBox.getSelectedIndex()).getProject(), dialog);
        });

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

        dialog.add(mainPanel);
        dialog.setVisible(true);
    }

    private static void progressBarForSaving(Connection connection, Project project, JDialog dialogToDispose) {

        dialogToDispose.dispose();

        JDialog dialog = new JDialog();
        dialog.setModal(true);
        dialog.setSize(400, 75);
        dialog.setLayout(new GridBagLayout());
        dialog.setResizable(false);
        dialog.setAlwaysOnTop(true);
        dialog.setTitle("Saving " + project.getName() + " in database");
        dialog.setLocationRelativeTo(null);
        dialog.setModalityType(ModalityType.APPLICATION_MODAL);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        dialog.add(progressBar, gbc);

        new Thread() {
            @Override
            public void run() {
                boolean check = true;
                ProjectDAO projectDAO = new ProjectDAO(connection, progressBar);
                try {
                    projectDAO.insert(project);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Some error!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    check = false;
                } finally {
                    dialog.dispose();
                    if (check) {
                        JOptionPane.showMessageDialog(null, project.getName() + " was saved in DB!", "Done", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                dialog.setVisible(true);
            }
        }.start();

    }

    public static void getGetProjectFromDBFrame(Connection connection, MNTabbedPane tabbedPane) {
        List<Project> projects;
        ProjectDAO projectDAO = new ProjectDAO(connection);
        List<Date> dates;
        try {
            projects = projectDAO.selectAllProjectsWithoutMerges();
            dates = projectDAO.selectAllDateSaveOfProjects();
        } catch (SQLException ex) {
            System.out.println("Deu ruim");
            return;
        }

        JDialog dialog = new JDialog();
        dialog.setModal(true);
        dialog.setSize(500, 500);
        dialog.setResizable(false);
        dialog.setAlwaysOnTop(true);
        dialog.setLocationRelativeTo(null);
        dialog.setModalityType(ModalityType.APPLICATION_MODAL);
        dialog.setTitle("Double click a row to get a project");
        dialog.getRootPane().setBackground(MNFrame.PRIMARY_COLOR);
        dialog.getRootPane().setBorder(BorderFactory.createEmptyBorder(2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP));

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
                    "ID", "Project Name", "Save Date"
                }
        ) {
            Class[] types = new Class[]{
                Integer.class,
                String.class,
                String.class

            };
            boolean[] canEdit = new boolean[]{
                false, false, false
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
                    dialog.dispose();
                }
            }
        });
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (int i = 0; i < projects.size(); i++) {
            model.addRow(new Object[]{
                projects.get(i).getId(),
                projects.get(i).getName(),
                dates.get(i).toString()
            });
        }
        JScrollPane scroll = new JScrollPane(table);
        mainPanel.add(scroll, gbc);

        dialog.add(mainPanel);
        dialog.setVisible(true);
    }
}
