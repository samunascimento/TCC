package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFileType;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import br.ufjf.dcc.gmr.core.vcs.types.LanguageConstructs;
import java.awt.Dialog;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 15-06-2022
 */
public class MNMetrics {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void openMetrics(Project project) {

        JDialog dialog = new JDialog();
        dialog.setModal(true);
        dialog.setSize(800, 600);
        dialog.setResizable(true);
        dialog.setAlwaysOnTop(false);
        dialog.setTitle("Metrics");
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.getRootPane().setBackground(MNFrame.PRIMARY_COLOR);
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dialog.getRootPane().setBorder(BorderFactory.createEmptyBorder(2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(MNFrame.PRIMARY_COLOR);
        mainPanel.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, 3, true));

        JTable mergeTypesTable = mergeTypesTable(project);
        JTable conflictFileTypesTable = conflictFileTypesTable(project);
        JTable developerDecisionTable = developerDecisionTable(project);
        JTable langaugeConstructsTable = langaugeConstructsTable(project);

        mainPanel.add(mergeTypesTable.getTableHeader(), gbc);
        gbc.gridy++;
        mainPanel.add(mergeTypesTable, gbc);
        gbc.gridy++;
        mainPanel.add(conflictFileTypesTable.getTableHeader(), gbc);
        gbc.gridy++;
        mainPanel.add(conflictFileTypesTable, gbc);
        gbc.gridy++;
        mainPanel.add(developerDecisionTable.getTableHeader(), gbc);
        gbc.gridy++;
        mainPanel.add(developerDecisionTable, gbc);
        gbc.gridy = 1;
        gbc.gridx++;
        mainPanel.add(langaugeConstructsTable.getTableHeader(), gbc);
        gbc.gridy++;
        gbc.gridheight = 99;
        mainPanel.add(langaugeConstructsTable, gbc);
        dialog.add(mainPanel);
        dialog.setVisible(true);

    }

    private static JTable mergeTypesTable(Project project) {

        JTable table = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Merge Type", "F.", "R.F.", "C.F.", "C.R.F."
                }
        ) {
            Class[] types = new Class[]{
                String.class, String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int merges = project.getMerges().size();
        if (merges == 0) {
            merges = 1;
        }
        MergeType mergeType;
        int freq;
        double relFreq = 0;
        int acuFreq = 0;
        double acuRelFreq = 0;
        for (int i = 1; i <= MergeType.NUMBER_OF_TYPES; i++) {
            mergeType = MergeType.getEnumFromInt(i);
            freq = project.numberOfMergeType(mergeType);
            relFreq = ((double) freq / (double) merges) * 100;
            acuFreq += freq;
            acuRelFreq += relFreq;
            model.addRow(new Object[]{
                mergeType,
                freq,
                df.format(relFreq) + "%",
                acuFreq,
                df.format(acuRelFreq) + "%"
            });
        }
        table.setFillsViewportHeight(true);
        table.getColumnModel().getColumn(0).setPreferredWidth(300);
        table.getColumnModel().getColumn(1).setPreferredWidth(20);
        table.getColumnModel().getColumn(2).setPreferredWidth(20);
        table.getColumnModel().getColumn(3).setPreferredWidth(20);
        table.getColumnModel().getColumn(4).setPreferredWidth(20);
        return table;
    }

    private static JTable conflictFileTypesTable(Project project) {

        JTable table = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Conflict File Type", "F.", "R.F.", "C.F.", "C.R.F."
                }
        ) {
            Class[] types = new Class[]{
                String.class, String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int conflictFiles = project.numberOfConflictFiles();
        if (conflictFiles == 0) {
            conflictFiles = 1;
        }
        ConflictFileType conflictFileType;
        int freq;
        double relFreq = 0;
        int acuFreq = 0;
        double acuRelFreq = 0;
        for (int i = 1; i <= ConflictFileType.NUMBER_OF_TYPES; i++) {
            conflictFileType = ConflictFileType.getEnumFromInt(i);
            freq = project.numberOfConflictFileType(conflictFileType);
            relFreq = ((double) freq / (double) conflictFiles) * 100;
            acuFreq += freq;
            acuRelFreq += relFreq;
            model.addRow(new Object[]{
                conflictFileType,
                freq,
                df.format(relFreq) + "%",
                acuFreq,
                df.format(acuRelFreq) + "%"
            });
        }
        table.setFillsViewportHeight(true);
        table.getColumnModel().getColumn(0).setPreferredWidth(300);
        table.getColumnModel().getColumn(1).setPreferredWidth(20);
        table.getColumnModel().getColumn(2).setPreferredWidth(20);
        table.getColumnModel().getColumn(3).setPreferredWidth(20);
        table.getColumnModel().getColumn(4).setPreferredWidth(20);
        return table;
    }

    private static JTable developerDecisionTable(Project project) {

        JTable table = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Developer Decision", "F.", "R.F.", "C.F.", "C.R.F."
                }
        ) {
            Class[] types = new Class[]{
                String.class, String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int chunks = project.numberOfChunks();
        if (chunks == 0) {
            chunks = 1;
        }
        DeveloperDecision developerDecision;
        int freq;
        double relFreq = 0;
        int acuFreq = 0;
        double acuRelFreq = 0;
        for (int i = 1; i <= DeveloperDecision.NUMBER_OF_TYPES; i++) {
            developerDecision = DeveloperDecision.getEnumFromInt(i);
            freq = project.numberOfConflictFileType(developerDecision);
            relFreq = ((double) freq / (double) chunks) * 100;
            acuFreq += freq;
            acuRelFreq += relFreq;
            model.addRow(new Object[]{
                developerDecision,
                freq,
                df.format(relFreq) + "%",
                acuFreq,
                df.format(acuRelFreq) + "%"
            });
        }
        table.setFillsViewportHeight(true);
        table.getColumnModel().getColumn(0).setPreferredWidth(300);
        table.getColumnModel().getColumn(1).setPreferredWidth(20);
        table.getColumnModel().getColumn(2).setPreferredWidth(20);
        table.getColumnModel().getColumn(3).setPreferredWidth(20);
        table.getColumnModel().getColumn(4).setPreferredWidth(20);
        return table;
    }

    private static JTable langaugeConstructsTable(Project project) {

        JTable table = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Language Constructs", "F.", "R.F.", "C.F.", "C.R.F."
                }
        ) {
            Class[] types = new Class[]{
                String.class, String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int languagesConstructs = project.numberOfLanguagesConstructs();
        if (languagesConstructs == 0) {
            languagesConstructs = 1;
        }
        String langaugeConstruct;
        int freq;
        double relFreq = 0;
        int acuFreq = 0;
        double acuRelFreq = 0;
        for (int i = 1; i <= LanguageConstructs.NUMBER_OF_TYPES; i++) {
            langaugeConstruct = LanguageConstructs.getStringFromInt(i);
            freq = project.numberOfLanguagesConstructs(langaugeConstruct);
            relFreq = ((double) freq / (double) languagesConstructs) * 100;
            acuFreq += freq;
            acuRelFreq += relFreq;
            model.addRow(new Object[]{
                langaugeConstruct,
                freq,
                df.format(relFreq) + "%",
                acuFreq,
                df.format(acuRelFreq) + "%"
            });
        }
        table.setFillsViewportHeight(true);
        table.getColumnModel().getColumn(0).setPreferredWidth(300);
        table.getColumnModel().getColumn(1).setPreferredWidth(20);
        table.getColumnModel().getColumn(2).setPreferredWidth(20);
        table.getColumnModel().getColumn(3).setPreferredWidth(20);
        table.getColumnModel().getColumn(4).setPreferredWidth(20);
        return table;
    }
}
