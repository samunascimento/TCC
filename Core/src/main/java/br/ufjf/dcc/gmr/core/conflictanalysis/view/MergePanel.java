package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictFile;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joao_lima
 */
public class MergePanel extends JPanel {

//  *** Merge Panel **************************************  
    private String projectName;
    private List<MergeEvent> mergeEventList;
    private List<MergeEvent> filteredMergeEventList;
    private JPanel westPanel;
    private JPanel centerPanel;
    private JPanel eastPanel;
//  ******************************************************

//  *** West Panel ***************************************
    private JTable mainTable;
    private JScrollPane mainTableScrollPane;
//  === Filters Buttons Panel ============================
    private JPanel filtersButtonsPanel;
    private JButton setFilterButton;
    private JButton resetFilterButton;
//  ======================================================    
//  ******************************************************

//  *** Center Panel *************************************    
    private JTextArea mergeInfoTextArea;
    private JScrollPane mergeInfoTextAreaScrollPane;

//  === Control Panel ====================================
    private JPanel controlPanel;
    private JButton controlPanelPreviousFileButton;
    private JButton controlPanelNextFileButton;
    private JButton controlPanelPreviousConflictButton;
    private JButton controlPanelNextConflictButton;
    private JTextArea controlPanelFileNameTextArea;
    private JLabel controlPanelFileIndexLabel;
    private JLabel controlPanelConflictIndexLabel;
    private JLabel controlPanelV1LinesLabel;
    private JLabel controlPanelV2LinesLabel;
    private JTextArea controlPanelTypeOfConflictTextArea;
    private JCheckBox controlPanelOutmostCheckBox;
    private JTextArea controlPanelDeveloperDecisionTextArea;
    private JScrollPane controlPanelTypeOfConflictTextAreaScrollPane;
//  ======================================================

//  ******************************************************
//  *** East Panel ***************************************
    private JTextArea conflictTextArea;
    private JScrollPane conflictTextAreaScrollPane;
    private JTextArea solutionTextArea;
    private JScrollPane solutionTextAreaScrollPane;
//  ******************************************************

//  *** Currents *****************************************
    private MergeEvent currentMerge = null;
    private ConflictFile currentFile = null;
    private int currentFileIndex = 0;
    private int currentConflictIndex = 0;
    private int currentMaxFileIndex = 0;
    private int currentMaxConflictIndex = 0;
//  ******************************************************

    public MergePanel(String projectName, List<MergeEvent> mergeEventList) {
        this.projectName = projectName;
        this.mergeEventList = mergeEventList;
        this.filteredMergeEventList = mergeEventList;
        this.setLayout(new GridLayout(1, 3, 3, 3));
        this.startGenerator();
        this.startCouplers();
    }

    public List<MergeEvent> getMergeEventList() {
        return this.mergeEventList;
    }

//  ******************************************************************
//  *                                                                *
//  *                           Generators                           *
//  *                                                                *
//  ******************************************************************
    private void startGenerator() {
        this.westPanel = generateWestPanel();
        this.centerPanel = generateCenterPanel();
        this.eastPanel = generateEastPanel();
        this.mainTable = generateMainTable();
        this.mainTableScrollPane = generateMainTableScrollPane();
        this.filtersButtonsPanel = generateFiltersButtonsPanel();
        this.setFilterButton = generateSetFilterButton();
        this.resetFilterButton = generateResetFilterButton();
        this.mergeInfoTextArea = generateMergeInfoTextArea();
        this.mergeInfoTextAreaScrollPane = generateMergeInfoTextAreaScrollPane();
        this.controlPanel = generateControlPanel();
        this.controlPanelPreviousFileButton = generateControlPanelPreviousFileButton();
        this.controlPanelNextFileButton = generateControlPanelNextFileButton();
        this.controlPanelPreviousConflictButton = generateControlPanelPreviousConflictButton();
        this.controlPanelNextConflictButton = generateControlPanelNextConflictButton();
        this.controlPanelFileNameTextArea = generateControlPanelFileNameLabel();
        this.controlPanelFileIndexLabel = generateControlPanelFileIndexLabel();
        this.controlPanelConflictIndexLabel = generateControlPanelConflictIndexLabel();
        this.controlPanelV1LinesLabel = generateControlPanelV1LinesLabel();
        this.controlPanelV2LinesLabel = generateControlPanelV2LinesLabel();
        this.controlPanelTypeOfConflictTextArea = generateControlPanelTypeOfConflictTextArea();
        this.controlPanelOutmostCheckBox = generateControlPanelOutmostCheckBox();
        this.controlPanelDeveloperDecisionTextArea = generateControlPanelDeveloperDecisionTextArea();
        this.controlPanelTypeOfConflictTextAreaScrollPane = generateControlPanelTypeOfConflictTextAreaScrollPane();
        this.conflictTextArea = generateConflictTextArea();
        this.conflictTextAreaScrollPane = generateConflictTextAreaScrollPane();
        this.solutionTextArea = generateSolutionTextArea();
        this.solutionTextAreaScrollPane = generateSolutionTextAreaScrollPane();
    }

    private JPanel generateWestPanel() {
        JPanel prototype = new JPanel();
        prototype.setLayout(new BorderLayout());
        return prototype;
    }

    private JPanel generateCenterPanel() {
        JPanel prototype = new JPanel();
        prototype.setLayout(new GridLayout(2, 1, 3, 3));
        return prototype;
    }

    private JPanel generateEastPanel() {
        JPanel prototype = new JPanel();
        prototype.setLayout(new GridLayout(2, 1, 3, 3));
        return prototype;
    }

    private JTable generateMainTable() {
        JTable prototype = new JTable();
        prototype.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Hash", "Conflict Regions", "Conflict"
                }
        ) {
            Class[] types = new Class[]{
                String.class, Integer.class, Boolean.class
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
        prototype.getColumnModel().getColumn(0).setPreferredWidth(300);
        prototype.getColumnModel().getColumn(2).setPreferredWidth(30);
        DefaultTableModel model = (DefaultTableModel) prototype.getModel();
        for (MergeEvent merge : this.mergeEventList) {
            model.addRow(new Object[]{
                merge.getHash().getCommitHash(),
                merge.getNumberOfConflictRegions(),
                merge.isConflict()
            });
        }
        prototype.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() > 1) {
                    mainTableMouseClicked();
                }
            }
        });
        return prototype;
    }

    private JScrollPane generateMainTableScrollPane() {
        JScrollPane prototype = new JScrollPane();
        return prototype;
    }

    private JPanel generateFiltersButtonsPanel() {
        JPanel prototype = new JPanel();
        prototype.setLayout(new GridLayout(1, 2));
        return prototype;
    }

    private JButton generateSetFilterButton() {
        JButton prototype = new JButton("Set Filter");
        prototype.addActionListener((ActionEvent evt) -> {
            setFilterActionPerformed();
        });
        return prototype;
    }

    private JButton generateResetFilterButton() {
        JButton prototype = new JButton("Reset Filter");
        prototype.addActionListener((ActionEvent evt) -> {
            resetFilterButtonActionPerformed();
        });
        return prototype;
    }

    private JTextArea generateMergeInfoTextArea() {
        JTextArea prototype = new JTextArea();
        prototype.setText("\nCommit\n "
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
        prototype.setEditable(false);
        prototype.setBackground(this.getBackground());
        return prototype;
    }

    private JScrollPane generateMergeInfoTextAreaScrollPane() {
        JScrollPane prototype = new JScrollPane();
        prototype.setBackground(this.getBackground());
        prototype.setBorder(BorderFactory.createTitledBorder("Merge Info"));
        return prototype;
    }

    private JPanel generateControlPanel() {
        JPanel prototype = new JPanel();
        prototype.setLayout(new GridBagLayout());
        return prototype;
    }

    private JButton generateControlPanelPreviousFileButton() {
        JButton prototype = new JButton("Previous File");
        prototype.addActionListener((ActionEvent evt) -> {
            controlPanelPreviousFileButtonActionPerformed();
        });
        return prototype;
    }

    private JButton generateControlPanelNextFileButton() {
        JButton prototype = new JButton("Next File");
        prototype.addActionListener((ActionEvent evt) -> {
            controlPanelNextFileButtonActionPerformed();
        });
        return prototype;
    }

    private JButton generateControlPanelPreviousConflictButton() {
        JButton prototype = new JButton("Previous Conflict");
        prototype.addActionListener((ActionEvent evt) -> {
            controlPanelPreviousConflictButtonActionPerformed();
        });
        return prototype;
    }

    private JButton generateControlPanelNextConflictButton() {
        JButton prototype = new JButton("Next Conflict");
        prototype.addActionListener((ActionEvent evt) -> {
            controlPanelNextConflictButtonActionPerformed();
        });
        return prototype;
    }

    private JTextArea generateControlPanelFileNameLabel() {
        JTextArea prototype = new JTextArea();
        prototype.setBorder(BorderFactory.createTitledBorder("FILE NAME"));
        prototype.setBackground(this.getBackground());
        return prototype;
    }

    private JLabel generateControlPanelFileIndexLabel() {
        JLabel prototype = new JLabel("0/0");
        return prototype;
    }

    private JLabel generateControlPanelConflictIndexLabel() {
        JLabel prototype = new JLabel("0/0");
        return prototype;
    }

    private JLabel generateControlPanelV1LinesLabel() {
        JLabel prototype = new JLabel("V1: ");
        return prototype;
    }

    private JLabel generateControlPanelV2LinesLabel() {
        JLabel prototype = new JLabel("V2: ");
        return prototype;
    }

    private JTextArea generateControlPanelTypeOfConflictTextArea() {
        JTextArea prototype = new JTextArea("\n");
        prototype.setBackground(this.getBackground());
        prototype.setMinimumSize(new Dimension(500, 100));
        prototype.setEditable(false);
        return prototype;
    }

    private JTextArea generateControlPanelDeveloperDecisionTextArea() {
        JTextArea prototype = new JTextArea("DEVELOPER DECISION:");
        prototype.setBackground(this.getBackground());
        prototype.setEditable(false);
        return prototype;
    }

    private JScrollPane generateControlPanelTypeOfConflictTextAreaScrollPane() {
        JScrollPane prototype = new JScrollPane();
        prototype.setBackground(this.getBackground());
        prototype.setMinimumSize(new Dimension(500, 200));
        prototype.setBorder(BorderFactory.createTitledBorder("Type Of Conflict"));
        return prototype;
    }

    private JCheckBox generateControlPanelOutmostCheckBox() {
        JCheckBox prototype = new JCheckBox("Outmost");
        prototype.setSelected(false);
        prototype.addActionListener((ActionEvent evt) -> {
            controlPanelOutmostCheckBoxActionPerformed();
        });
        return prototype;
    }

    private JTextArea generateConflictTextArea() {
        JTextArea prototype = new JTextArea();
        prototype.setEditable(false);
        return prototype;
    }

    private JScrollPane generateConflictTextAreaScrollPane() {
        JScrollPane prototype = new JScrollPane();
        prototype.setBorder(BorderFactory.createTitledBorder("Conflict"));
        return prototype;
    }

    private JTextArea generateSolutionTextArea() {
        JTextArea prototype = new JTextArea();
        prototype.setEditable(false);
        return prototype;
    }

    private JScrollPane generateSolutionTextAreaScrollPane() {
        JScrollPane prototype = new JScrollPane();
        prototype.setBorder(BorderFactory.createTitledBorder("Solution"));
        return prototype;
    }

//  ****************************************************************
//  *                                                              *
//  *                           Couplers                           *
//  *                                                              *
//  ****************************************************************
    private void startCouplers() {
        this.scrollPanesCoupler();
        this.controlPanelCoupler();
        this.filtersButtonsCoupler();
        this.westPanelCoupler();
        this.centerPanelCoupler();
        this.eastPanelCoupler();
        this.mergePanelCoupler();
    }

    private void scrollPanesCoupler() {
        this.mainTableScrollPane.setViewportView(this.mainTable);
        this.mergeInfoTextAreaScrollPane.setViewportView(this.mergeInfoTextArea);
        this.controlPanelTypeOfConflictTextAreaScrollPane.setViewportView(this.controlPanelTypeOfConflictTextArea);
        this.conflictTextAreaScrollPane.setViewportView(this.conflictTextArea);
        this.solutionTextAreaScrollPane.setViewportView(this.solutionTextArea);
    }

    private void controlPanelCoupler() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 1, 1);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 6;
        this.controlPanel.add(this.controlPanelFileNameTextArea, gbc);
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        this.controlPanel.add(this.controlPanelPreviousFileButton, gbc);
        gbc.gridx = 1;
        this.controlPanel.add(this.controlPanelFileIndexLabel, gbc);
        gbc.gridx = 2;
        this.controlPanel.add(this.controlPanelNextFileButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.controlPanel.add(this.controlPanelPreviousConflictButton, gbc);
        gbc.gridx = 1;
        this.controlPanel.add(this.controlPanelConflictIndexLabel, gbc);
        gbc.gridx = 2;
        this.controlPanel.add(this.controlPanelNextConflictButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        this.controlPanel.add(this.controlPanelV1LinesLabel, gbc);
        gbc.gridy = 4;
        this.controlPanel.add(this.controlPanelV2LinesLabel, gbc);
        gbc.gridy = 5;
        this.controlPanel.add(this.controlPanelTypeOfConflictTextAreaScrollPane, gbc);
        gbc.gridy = 6;
        this.controlPanel.add(this.controlPanelOutmostCheckBox, gbc);
        gbc.gridy = 7;
        this.controlPanel.add(this.controlPanelDeveloperDecisionTextArea, gbc);
    }

    private void filtersButtonsCoupler() {
        this.filtersButtonsPanel.add(this.setFilterButton);
        this.filtersButtonsPanel.add(this.resetFilterButton);
    }

    private void westPanelCoupler() {
        this.westPanel.add(this.mainTableScrollPane, BorderLayout.CENTER);
        this.westPanel.add(this.filtersButtonsPanel, BorderLayout.SOUTH);
    }

    private void centerPanelCoupler() {
        this.centerPanel.add(this.controlPanel);
        this.centerPanel.add(this.mergeInfoTextAreaScrollPane);
    }

    private void eastPanelCoupler() {
        this.eastPanel.add(this.conflictTextAreaScrollPane);
        this.eastPanel.add(this.solutionTextAreaScrollPane);
    }

    private void mergePanelCoupler() {
        this.add(this.westPanel);
        this.add(this.centerPanel);
        this.add(this.eastPanel);
    }

//  ***********************************************************************
//  *                                                                     *
//  *                           ActionPerformed                           *
//  *                                                                     *
//  ***********************************************************************
    private void mainTableMouseClicked() {
        MergeEvent merge = this.filteredMergeEventList.get(mainTable.getSelectedRow());
        changeInfo(merge);
        updateFileChangeByMerge(merge);
        currentMerge = merge;
    }

    private void setFilterActionPerformed() {
        JButton applyButton = new JButton("Apply Filter");
        SetFilterFrame setFilterFrame = new SetFilterFrame(applyButton, this.projectName);
        applyButton.addActionListener((ActionEvent evt) -> {
            filterTable(setFilterFrame.getFirstChoice(), setFilterFrame.getSecondChoice(), setFilterFrame.getThirdChoice());
            setFilterFrame.dispose();
        });
        setFilterFrame.setVisible(true);
    }

    private void resetFilterButtonActionPerformed() {
        this.filteredMergeEventList = this.mergeEventList;
        this.updateTable();
    }

    private void controlPanelPreviousFileButtonActionPerformed() {
        if (this.currentMaxFileIndex != 0 && this.currentMaxFileIndex != 1) {
            if (this.currentFileIndex == 1) {
                this.currentFileIndex = this.currentMaxFileIndex;
            } else {
                this.currentFileIndex = this.currentFileIndex - 1;
            }
            updateFile(this.currentMerge.getConflictFiles().get(this.currentFileIndex - 1));
        }
    }

    private void controlPanelNextFileButtonActionPerformed() {
        if (this.currentMaxFileIndex != 0 && this.currentMaxFileIndex != 1) {
            if (this.currentFileIndex == this.currentMaxFileIndex) {
                this.currentFileIndex = 1;
            } else {
                this.currentFileIndex = this.currentFileIndex + 1;
            }
            updateFile(this.currentMerge.getConflictFiles().get(this.currentFileIndex - 1));
        }
    }

    private void controlPanelPreviousConflictButtonActionPerformed() {
        if (this.currentMaxConflictIndex != 0 && this.currentMaxConflictIndex != 1) {
            if (this.currentConflictIndex == 1) {
                this.currentConflictIndex = this.currentMaxConflictIndex;
            } else {
                this.currentConflictIndex = this.currentConflictIndex - 1;
            }
            this.updateRegion(this.currentFile.getConflictRegion().get(this.currentConflictIndex - 1));
        }
    }

    private void controlPanelNextConflictButtonActionPerformed() {
        if (this.currentMaxConflictIndex != 0 && this.currentMaxConflictIndex != 1) {
            if (this.currentConflictIndex == this.currentMaxConflictIndex) {
                this.currentConflictIndex = 1;
            } else {
                this.currentConflictIndex = this.currentConflictIndex + 1;
            }
            this.updateRegion(this.currentFile.getConflictRegion().get(this.currentConflictIndex - 1));
        }
    }

    private void controlPanelOutmostCheckBoxActionPerformed() {
        if (this.currentFile != null) {
            this.updateRegion(this.currentFile.getConflictRegion().get(this.currentConflictIndex - 1));
        }
    }

//  ***********************************************************************    
//  *                                                                     *
//  *                           Process Methods                           *
//  *                                                                     *
//  ***********************************************************************
    private void changeInfo(MergeEvent merge) {
        this.currentMerge = merge;
        this.mergeInfoTextArea.setText("\nCommit\n"
                + " Title: " + merge.getHash().getTitle() + "\n"
                + " Hash: " + merge.getHash().getCommitHash() + "\n"
                + " Author: " + merge.getHash().getAuthor() + "\n"
                + " Author Date: " + merge.getHash().getAuthorDate() + "\n"
                + " Committer: " + merge.getHash().getCommitter() + "\n"
                + " Committer Date: " + merge.getHash().getCommitterDate() + "\n"
                + "\nParent 1\n"
                + " Title: " + merge.getParents().get(0).getTitle() + "\n"
                + " Hash: " + merge.getParents().get(0).getCommitHash() + "\n"
                + " Author: " + merge.getParents().get(0).getAuthor() + "\n"
                + " Author Date: " + merge.getParents().get(0).getAuthorDate() + "\n"
                + " Committer: " + merge.getParents().get(0).getCommitter() + "\n"
                + " Committer Date: " + merge.getParents().get(0).getCommitterDate() + "\n"
                + "\nParent 2\n"
                + " Title: " + merge.getParents().get(1).getTitle() + "\n"
                + " Hash: " + merge.getParents().get(1).getCommitHash() + "\n"
                + " Author: " + merge.getParents().get(1).getAuthor() + "\n"
                + " Author Date: " + merge.getParents().get(1).getAuthorDate() + "\n"
                + " Committer: " + merge.getParents().get(1).getCommitter() + "\n"
                + " Committer Date: " + merge.getParents().get(1).getCommitterDate() + "\n"
        );
    }

    private void updateFileChangeByMerge(MergeEvent merge) {
        if (merge.isConflict()) {
            this.controlPanelFileNameTextArea.setText(merge.getConflictFiles().get(0).getFormedFileName());
            this.currentFile = merge.getConflictFiles().get(0);
            this.controlPanelFileIndexLabel.setText("1/" + merge.getConflictFiles().size());
            this.currentFileIndex = 1;
            this.currentMaxFileIndex = merge.getConflictFiles().size();

            if (!(merge.getConflictFiles().get(0).getConflictRegion() == null)) {
                this.controlPanelConflictIndexLabel.setText("1/" + merge.getConflictFiles().get(0).getConflictRegion().size());
                this.currentConflictIndex = 1;
                this.currentMaxConflictIndex = merge.getConflictFiles().get(0).getConflictRegion().size();
                this.conflictTextArea.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getConflictForm());
                this.solutionTextArea.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getSolutionForm());
                this.controlPanelV1LinesLabel.setText("V1: " + merge.getConflictFiles().get(0).getConflictRegion().get(0).getV1Size() + " lines");
                this.controlPanelV2LinesLabel.setText("V2: " + merge.getConflictFiles().get(0).getConflictRegion().get(0).getV2Size() + " lines");
                if (this.controlPanelOutmostCheckBox.isSelected()) {
                    this.controlPanelTypeOfConflictTextArea.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getOutmostedTypeOfConflict() + "\n");
                } else {
                    this.controlPanelTypeOfConflictTextArea.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getTypesOfConflict() + "\n");
                }
                this.controlPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: " + merge.getConflictFiles().get(0).getConflictRegion().get(0).getDeveloperDecision());
            } else {
                this.controlPanelConflictIndexLabel.setText("0/0");
                this.currentConflictIndex = 0;
                this.currentMaxConflictIndex = 0;
                this.conflictTextArea.setText(merge.getConflictFiles().get(0).getFileName() + "has not been\nmerged as it has been renamed or deleted.");
                this.solutionTextArea.setText("Impossible to get the solution");
                this.controlPanelV1LinesLabel.setText("V1: ");
                this.controlPanelV2LinesLabel.setText("V2: ");
                this.controlPanelTypeOfConflictTextArea.setText("\n");
                this.controlPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: ");
            }
        } else {
            this.controlPanelFileNameTextArea.setText("");
            this.currentFile = null;

            this.controlPanelFileIndexLabel.setText("0/0");
            this.currentFileIndex = 0;
            this.currentMaxFileIndex = 0;

            this.controlPanelConflictIndexLabel.setText("0/0");
            this.currentConflictIndex = 0;
            this.currentMaxConflictIndex = 0;

            this.conflictTextArea.setText("");
            this.solutionTextArea.setText("");
            this.controlPanelV1LinesLabel.setText("V1: ");
            this.controlPanelV2LinesLabel.setText("V2: ");
            this.controlPanelTypeOfConflictTextArea.setText("\n");
            this.controlPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: ");
        }
    }

    private void updateFile(ConflictFile file) {
        this.controlPanelFileNameTextArea.setText(file.getFormedFileName());
        this.controlPanelFileIndexLabel.setText(this.currentFileIndex + "/" + this.currentMaxFileIndex);
        this.currentFile = file;
        if (file.getConflictRegion() != null) {
            this.controlPanelConflictIndexLabel.setText("1/" + file.getConflictRegion().size());
            this.currentConflictIndex = 1;
            this.currentMaxConflictIndex = file.getConflictRegion().size();
            this.conflictTextArea.setText(file.getConflictRegion().get(0).getConflictForm());
            this.solutionTextArea.setText(file.getConflictRegion().get(0).getSolutionForm());
            this.controlPanelV1LinesLabel.setText("V1: " + file.getConflictRegion().get(0).getV1Size() + " lines");
            this.controlPanelV2LinesLabel.setText("V2: " + file.getConflictRegion().get(0).getV2Size() + " lines");
            if (this.controlPanelOutmostCheckBox.isSelected()) {
                this.controlPanelTypeOfConflictTextArea.setText(file.getConflictRegion().get(0).getOutmostedTypeOfConflict() + "\n");
            } else {
                this.controlPanelTypeOfConflictTextArea.setText(file.getConflictRegion().get(0).getTypesOfConflict() + "\n");
            }
            this.controlPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: " + file.getConflictRegion().get(0).getDeveloperDecision());

        } else {
            this.controlPanelConflictIndexLabel.setText("0/0");
            this.currentConflictIndex = 0;
            this.currentMaxConflictIndex = 0;
            this.conflictTextArea.setText(file.getFileName() + "has not been\nmerged as it has been renamed or deleted.");
            this.solutionTextArea.setText("Impossible to get the solution");
            this.controlPanelV1LinesLabel.setText("V1: ");
            this.controlPanelV2LinesLabel.setText("V2: ");
            this.controlPanelTypeOfConflictTextArea.setText("\n");
            this.controlPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: ");
        }
    }

    private void updateRegion(ConflictRegion region) {
        this.controlPanelConflictIndexLabel.setText(this.currentConflictIndex + "/" + this.currentMaxConflictIndex);
        this.conflictTextArea.setText(region.getConflictForm());
        this.solutionTextArea.setText(region.getSolutionForm());
        this.controlPanelV1LinesLabel.setText("V1: " + region.getV1Size() + " lines");
        this.controlPanelV2LinesLabel.setText("V2: " + region.getV2Size() + " lines");
        if (this.controlPanelOutmostCheckBox.isSelected()) {
            this.controlPanelTypeOfConflictTextArea.setText(region.getOutmostedTypeOfConflict() + "\n");
        } else {
            this.controlPanelTypeOfConflictTextArea.setText(region.getTypesOfConflict() + "\n");
        }
        this.controlPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: " + region.getDeveloperDecision());

    }

    private void filterTable(int f, int s, int t) {
        if (t == 0) {
            this.filteredMergeEventList = this.mergeEventList;
        } else {
            this.filteredMergeEventList = new ArrayList<>();
            for (MergeEvent merge : this.mergeEventList) {
                if (merge.isConflict()) {
                    this.filteredMergeEventList.add(merge);
                }
            }
        }
        if (!this.filteredMergeEventList.isEmpty()) {
            if (s == 1) {
                this.conflictRegionsOrderFilterType();
            } else if (s == 2) {
                this.conflictFilesOrderFilterType();
            } else if (s == 3) {
                this.chronologicalOrderFilterType();
            }
            if (f == 0) {
                Collections.reverse(this.filteredMergeEventList);
            }
        }
        this.updateTable();

    }

    private void conflictRegionsOrderFilterType() {
        boolean check;
        List<MergeEvent> newList = new ArrayList<>();
        newList.add(this.filteredMergeEventList.get(0));
        for (int i = 1; i < this.filteredMergeEventList.size(); i++) {
            check = false;
            for (int j = 0; j < newList.size(); j++) {
                if (this.filteredMergeEventList.get(i).getNumberOfConflictRegions() >= newList.get(j).getNumberOfConflictRegions()) {
                    newList.add(j, this.filteredMergeEventList.get(i));
                    check = true;
                    j = newList.size();
                }
            }
            if (!check) {
                newList.add(this.filteredMergeEventList.get(i));
            }
        }
        this.filteredMergeEventList = newList;
    }

    private void conflictFilesOrderFilterType() {
        boolean check;
        List<MergeEvent> newList = new ArrayList<>();
        newList.add(this.filteredMergeEventList.get(0));
        for (int i = 1; i < this.filteredMergeEventList.size(); i++) {
            check = false;
            for (int j = 0; j < newList.size(); j++) {
                if (this.filteredMergeEventList.get(i).getConflictFiles().size() >= newList.get(j).getConflictFiles().size()) {
                    newList.add(j, this.filteredMergeEventList.get(i));
                    check = true;
                    j = newList.size();
                }
            }
            if (!check) {
                newList.add(this.filteredMergeEventList.get(i));
            }
        }
        this.filteredMergeEventList = newList;
    }

    private void chronologicalOrderFilterType() {
        boolean check;
        List<MergeEvent> newList = new ArrayList<>();
        newList.add(this.filteredMergeEventList.get(0));
        for (int i = 1; i < this.filteredMergeEventList.size(); i++) {
            check = false;
            for (int j = 0; j < newList.size(); j++) {
                if (this.filteredMergeEventList.get(i).getHash().getCommitterDate().getTime() >= newList.get(j).getHash().getCommitterDate().getTime()) {
                    newList.add(j, this.filteredMergeEventList.get(i));
                    check = true;
                    j = newList.size();
                }
            }
            if (!check) {
                newList.add(this.filteredMergeEventList.get(i));
            }
        }
        this.filteredMergeEventList = newList;
    }

    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) this.mainTable.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (MergeEvent merge : this.filteredMergeEventList) {
            model.addRow(new Object[]{
                merge.getHash().getCommitHash(),
                merge.getNumberOfConflictRegions(),
                merge.isConflict()
            });
        }
    }
}
