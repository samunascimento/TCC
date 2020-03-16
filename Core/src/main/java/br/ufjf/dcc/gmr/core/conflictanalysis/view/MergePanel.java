package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictFile;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joao_lima
 */
public class MergePanel extends JPanel {

    //Merges (Main Info)
    private List<MergeEvent> list;
    //Tables
    private JTable mainTable = new JTable();
    //Text Areas
    private JTextArea conflictTextArea;
    private JTextArea mergeInfoTextArea;
    //Separator
    private JSeparator separator;
    //ScrollPane
    private JScrollPane mainTableScrollPane = new JScrollPane();
    private JScrollPane conflictTextAreaScrollPane = new JScrollPane();
    private JScrollPane mergeInfoTextAreaScrollPane = new JScrollPane();
    //Currents
    private MergeEvent currentMerge = null;
    private ConflictFile currentFile = null;
    private int currentFileIndex = 0;
    private int currentConflictIndex = 0;
    private int currentMaxFileIndex = 0;
    private int currentMaxConflictIndex = 0;
    //Sub Panel
    private JPanel subPanel = new JPanel();
    private JButton previousFileButton = new JButton("Previous File");
    private JButton nextFileButton = new JButton("Next File");
    private JButton previousConflictButton = new JButton("Previous Conflict");
    private JButton nextConflictButton = new JButton("Next Conflict");
    private JLabel fileNameLabel = new JLabel("File Name:");
    private JLabel fileIndexLabel = new JLabel("0/0");
    private JLabel conflictIndexLabel = new JLabel("0/0");

    public MergePanel(List<MergeEvent> list) {
        this.list = list;
        setPanel();
    }

    private void setPanel() {

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(8, 8, 5, 5);

        gbc.gridheight = 3;
        customizeTable();
        this.add(this.mainTableScrollPane, gbc);
        gbc.gridx = 1;
        this.add(this.separator, gbc);
        gbc.gridheight = 1;
        gbc.gridx = 2;
        this.customizeSubPanel();
        this.add(this.subPanel, gbc);
        gbc.gridy = 1;
        this.customizeConflictTextArea();
        this.add(this.conflictTextAreaScrollPane, gbc);
        gbc.gridy = 2;
        this.customizeMergeInfoTextArea();
        this.add(this.mergeInfoTextAreaScrollPane, gbc);

        this.changeInfo(this.list.get(0));
        this.updateFileChangeByMerge(list.get(0));
        this.currentMerge = list.get(0);

    }

    private void customizeTable() {
        this.mainTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Title ", "Date", "Hash", "Conflict"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
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
        DefaultTableModel model = (DefaultTableModel) this.mainTable.getModel();
        for (MergeEvent merge : this.list) {
            model.addRow(new Object[]{
                merge.getHash().getTitle(),
                merge.getHash().getCommitterDate(),
                merge.getHash().getCommitHash(),
                merge.isConflict()
            });
        }
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }
        });
        this.mainTableScrollPane.setViewportView(this.mainTable);
    }

    private void customizeMergeInfoTextArea() {
        this.mergeInfoTextArea.setText("Commit\n "
                + "Title:\n "
                + "Hash:\n "
                + "Author:\n "
                + "Author Date:\n "
                + "Committer:\n "
                + "Committer Date:\n"
                + "\n"
                + "Parent 1\n "
                + "Title:\n "
                + "Hash:\n "
                + "Author:\n "
                + "Author Date:\n "
                + "Committer:\n "
                + "Committer Date:\n"
                + "\n"
                + "Parent 2\n "
                + "Title:\n "
                + "Hash:\n "
                + "Author:\n "
                + "Author Date:\n "
                + "Committer:\n "
                + "Committer Date:");
        this.mergeInfoTextArea.setEditable(false);
        this.mergeInfoTextAreaScrollPane.setViewportView(this.mergeInfoTextArea);
    }

    private void customizeConflictTextArea() {
        this.conflictTextArea.setEditable(false);
        this.conflictTextAreaScrollPane.setViewportView(this.conflictTextArea);
    }

    private void customizeSubPanel() {
        this.subPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(8, 8, 5, 5);
        this.customizeButtons();

        gbc.gridwidth = 6;
        this.subPanel.add(this.fileNameLabel, gbc);
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        this.subPanel.add(this.previousFileButton, gbc);
        gbc.gridx = 1;
        this.subPanel.add(this.fileIndexLabel, gbc);
        gbc.gridx = 2;
        this.subPanel.add(this.nextFileButton, gbc);
        gbc.gridx = 3;
        this.subPanel.add(this.previousConflictButton, gbc);
        gbc.gridx = 4;
        this.subPanel.add(this.conflictIndexLabel, gbc);
        gbc.gridx = 5;
        this.subPanel.add(this.nextFileButton, gbc);
    }

    private void customizeButtons() {
        previousFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousFileButtonMouseClicked(evt);
            }
        });

        nextFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextFileButtonMouseClicked(evt);
            }
        });

        nextConflictButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextConflictButtonMouseClicked(evt);
            }
        });

        previousConflictButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousConflictButtonMouseClicked(evt);
            }
        });
    }

    private void nextFileButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if (this.currentMaxFileIndex != 0 && this.currentMaxFileIndex != 1) {
            if (this.currentFileIndex == this.currentMaxFileIndex) {
                this.currentFileIndex = 1;
            } else {
                this.currentFileIndex = this.currentFileIndex + 1;
            }
            updateFile(this.currentMerge.getConflictFiles().get(this.currentFileIndex - 1));
        }
    }

    private void previousFileButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if (this.currentMaxFileIndex != 0 && this.currentMaxFileIndex != 1) {
            if (this.currentFileIndex == 1) {
                this.currentFileIndex = this.currentMaxFileIndex;
            } else {
                this.currentFileIndex = this.currentFileIndex - 1;
            }
            updateFile(this.currentMerge.getConflictFiles().get(this.currentFileIndex - 1));
        }
    }

    private void previousConflictButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if (this.currentMaxConflictIndex != 0 && this.currentMaxConflictIndex != 1) {
            if (this.currentConflictIndex == 1) {
                this.currentConflictIndex = this.currentMaxConflictIndex;
            } else {
                this.currentConflictIndex = this.currentConflictIndex - 1;
            }
            this.updateRegion(this.currentFile.getConflictRegion().get(this.currentConflictIndex - 1));
        }
    }

    private void nextConflictButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if (this.currentMaxConflictIndex != 0 && this.currentMaxConflictIndex != 1) {
            if (this.currentConflictIndex == this.currentMaxConflictIndex) {
                this.currentConflictIndex = 1;
            } else {
                this.currentConflictIndex = this.currentConflictIndex + 1;
            }
            this.updateRegion(this.currentFile.getConflictRegion().get(this.currentConflictIndex - 1));
        }

    }

    private void changeInfo(MergeEvent merge) {
        this.currentMerge = merge;
        this.mergeInfoTextArea.setText("Commit\n"
                + " Title: " + merge.getHash().getTitle() + "\n"
                + " Hash: " + merge.getHash().getCommitHash() + "\n"
                + " Author: " + merge.getHash().getAuthor() + "\n"
                + " Author Date: " + merge.getHash().getAuthorDate() + "\n"
                + " Committer:: " + merge.getHash().getCommitter() + "\n"
                + " Committer Date: " + merge.getHash().getCommitterDate() + "\n"
                + "\nParent 1\n"
                + " Title: " + merge.getParents().get(0).getTitle() + "\n"
                + " Hash: " + merge.getParents().get(0).getCommitHash() + "\n"
                + " Author: " + merge.getParents().get(0).getAuthor() + "\n"
                + " Author Date: " + merge.getParents().get(0).getAuthorDate() + "\n"
                + " Committer:: " + merge.getParents().get(0).getCommitter() + "\n"
                + " Committer Date: " + merge.getParents().get(0).getCommitterDate() + "\n"
                + "\nParent 2\n"
                + " Title: " + merge.getParents().get(1).getTitle() + "\n"
                + " Hash: " + merge.getParents().get(1).getCommitHash() + "\n"
                + " Author: " + merge.getParents().get(1).getAuthor() + "\n"
                + " Author Date: " + merge.getParents().get(1).getAuthorDate() + "\n"
                + " Committer:: " + merge.getParents().get(1).getCommitter() + "\n"
                + " Committer Date: " + merge.getParents().get(1).getCommitterDate() + "\n"
        );
    }

    private void updateFileChangeByMerge(MergeEvent merge) {
        if (merge.isConflict()) {
            this.fileNameLabel.setText("File Name: " + merge.getConflictFiles().get(0).getFileName());
            this.currentFile = merge.getConflictFiles().get(0);
            this.fileIndexLabel.setText("1/" + merge.getConflictFiles().size());
            this.currentFileIndex = 1;
            this.currentMaxFileIndex = merge.getConflictFiles().size();

            if (!merge.getConflictFiles().get(0).getConflictRegion().equals(null)) {
                this.conflictIndexLabel.setText("1/" + merge.getConflictFiles().get(0).getConflictRegion().size());
                this.currentConflictIndex = 1;
                this.currentMaxConflictIndex = merge.getConflictFiles().get(0).getConflictRegion().size();
                this.conflictTextArea.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getForm());
            } else {
                this.conflictIndexLabel.setText("0/0");
                this.currentConflictIndex = 0;
                this.currentMaxConflictIndex = 0;
                this.conflictTextArea.setText(merge.getConflictFiles().get(0).getFileName() + "has not been\nmerged as it has been renamed or deleted.");
            }
        } else {
            this.fileNameLabel.setText("File Name: ");
            this.currentFile = null;

            this.fileIndexLabel.setText("0/0");
            this.currentFileIndex = 0;
            this.currentMaxFileIndex = 0;

            this.conflictIndexLabel.setText("0/0");
            this.currentConflictIndex = 0;
            this.currentMaxConflictIndex = 0;

            this.conflictTextArea.setText("");
        }
    }

    private void updateFile(ConflictFile file) {
        this.fileNameLabel.setText("File Name: " + file.getFileName());
        this.fileIndexLabel.setText(this.currentFileIndex + "/" + this.currentMaxFileIndex);
        this.currentFile = file;
        if (file.getConflictRegion() != null) {
            this.conflictIndexLabel.setText("1/" + file.getConflictRegion().size());
            this.currentConflictIndex = 1;
            this.currentMaxConflictIndex = file.getConflictRegion().size();
            this.conflictTextArea.setText(file.getConflictRegion().get(0).getForm());
        } else {
            this.conflictIndexLabel.setText("0/0");
            this.currentConflictIndex = 0;
            this.currentMaxConflictIndex = 0;
            this.conflictTextArea.setText(file.getFileName() + "has not been\nmerged as it has been renamed or deleted.");
        }
    }

    private void updateRegion(ConflictRegion region) {
        this.conflictIndexLabel.setText(this.currentConflictIndex + "/" + this.currentMaxConflictIndex);
        this.conflictTextArea.setText(region.getForm());

    }

}
