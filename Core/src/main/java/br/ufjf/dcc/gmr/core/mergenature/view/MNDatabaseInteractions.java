package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.dao.AnalysisDAO;
import br.ufjf.dcc.gmr.core.mergenature.dao.ProjectDAO;
import java.awt.Dialog.ModalityType;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
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

    public static void initSaveFrame(Connection connection, List<MNProjectPanel> projectPanels) {
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

    /*private static void progressBarForSaving(Connection connection, Project project, JDialog dialogToDispose) {

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
                    ex.printStackTrace();
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
                try {
                    dialog.setVisible(true);
                } catch (IndexOutOfBoundsException ex){}
            }
        }.start();

    }*/
    public static void initGetProjectFrame(Connection connection, MNTabbedPane tabbedPane) {
        try {
            List<Object[]> analysisList = AnalysisDAO.getAllAnalysisInfo(connection);

            JDialog dialog = new JDialog();
            dialog.setModal(true);
            dialog.setSize(800, 600);
            dialog.setResizable(true);
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
                        "ProjectID", "AnalysisID", "Name", "URL", "Organization", "Save Date", "Code Version", "Completed"
                    }
            ) {
                Class[] types = new Class[]{
                    Integer.class,
                    Integer.class,
                    String.class,
                    String.class,
                    String.class,
                    String.class,
                    String.class,
                    Boolean.class

                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            for (Object[] analysis : analysisList) {
                model.addRow(analysis);
            }
            table.setRowHeight(30);
            table.setFillsViewportHeight(true);
            table.setBackground(MNFrame.PRIMARY_COLOR);
            table.setForeground(MNFrame.SECUNDARY_COLOR);
            table.setBorder(BorderFactory.createEmptyBorder());
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    if (evt.getClickCount() > 1) {
                        try {
                            tabbedPane.addRemovableTab((String) analysisList.get(table.getSelectedRow())[2],
                                    null,
                                    new MNProjectPanel(
                                            ProjectDAO.selectEntireProject(connection,
                                                    (int) analysisList.get(table.getSelectedRow())[0],
                                                    (int) analysisList.get(table.getSelectedRow())[1]),
                                            null),
                                    null);
                        } catch (SQLException ex) {
                            Logger.getLogger(MNDatabaseInteractions.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(MNDatabaseInteractions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        dialog.dispose();
                    }
                }
            });

            JScrollPane scroll = new JScrollPane(table);
            mainPanel.add(scroll, gbc);

            dialog.add(mainPanel);
            dialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MNDatabaseInteractions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MNDatabaseInteractions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
