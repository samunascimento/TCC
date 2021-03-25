package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 07-01-2021
 */
public class MNMergesTable extends JPanel {

    private MNProjectPanel projectPanel;
    private List<Merge> merges;
    private List<Merge> filteredList;
    private JTable table;

    public MNMergesTable(MNProjectPanel projectPanel, List<Merge> merges) {
        this.projectPanel = projectPanel;
        this.merges = merges;
        this.filteredList = merges;
        set();
    }

    private void set() {
        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        table = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "", "Hash", "Conflict Regions", "Conflict"
                }
        ) {
            Class[] types = new Class[]{
                Integer.class, String.class, String.class, Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        setTableModel(this.filteredList);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.LEFT);
        table.setDefaultRenderer(table.getColumnClass(0), renderer);
        table.getColumnModel().getColumn(0).setPreferredWidth(25);
        table.getColumnModel().getColumn(1).setPreferredWidth(33);
        table.getColumnModel().getColumn(3).setPreferredWidth(17);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() > 1) {
                    projectPanel.upadateMergePanel(filteredList.get(table.getSelectedRow()));
                }
            }
        });
        table.setBackground(MNFrame.PRIMARY_COLOR);
        table.setForeground(MNFrame.SECUNDARY_COLOR);
        table.setFillsViewportHeight(true);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        JScrollPane scroll = new JScrollPane(table);
        this.add(scroll, gbc);

        JButton setFilter = new JButton("Set Filter");
        setFilter.addActionListener((ActionEvent evt) -> {
            new MNProjectFilterFrame(merges, filteredList, this);
        });
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(setFilter, gbc);

        JButton resetFilter = new JButton("Reset Filter");
        resetFilter.addActionListener((ActionEvent evt) -> {
            setTableModel(this.merges);
        });
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(resetFilter, gbc);
    }

    public void setTableModel(List<Merge> mergeList) {
        this.filteredList = mergeList;
        int index = 0;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (Merge merge : mergeList) {
            model.addRow(new Object[]{
                ++index,
                merge.getMerge().getShortCommitHash(),
                merge.getNumberOfConflictRegions(),
                (merge.getMergeType() == MergeType.CONFLICTED_MERGE || merge.getMergeType() == MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES)
            });
        }
    }

    public void setTableModel(List<Merge> mergeList, List<String> originalConflictRegions) {
        this.filteredList = mergeList;
        int index = 0;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (Merge merge : mergeList) {
            model.addRow(new Object[]{
                ++index,
                merge.getMerge().getShortCommitHash(),
                merge.getNumberOfConflictRegions() + "/" + originalConflictRegions.get(index - 1),
                (merge.getMergeType() == MergeType.CONFLICTED_MERGE || merge.getMergeType() == MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES)
            });
        }
    }

}
