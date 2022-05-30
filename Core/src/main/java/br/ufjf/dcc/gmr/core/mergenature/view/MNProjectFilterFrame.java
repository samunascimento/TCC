package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Chunk;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFileType;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 01-02-2021
 */
public class MNProjectFilterFrame extends JDialog {

    private MNMergesTable panel;
    private List<Merge> defaultList;
    private List<Merge> currentList;

    private JRadioButton ascendingOrder = new JRadioButton("Ascending Order", true);
    private JRadioButton descendingOrder = new JRadioButton("Descending Order");
    private ButtonGroup orientationOfOrderBG;

    private JRadioButton defaultOrder = new JRadioButton("Default Order", true);
    private JRadioButton numberOfConflictRegionOrder = new JRadioButton("Number of Chunks Order");
    private JRadioButton numberOfConflicsOrder = new JRadioButton("Number of Conflict Files Order");
    private JRadioButton chronologicalOrder = new JRadioButton("Chronological Order");
    private ButtonGroup typeOfOrderBG;

    private JCheckBox conflictedMerge = new JCheckBox("Conflicted Merge", true);
    private JCheckBox notConflictedMerge = new JCheckBox("Not Conflicted Merge", true);
    private JCheckBox octopusMerge = new JCheckBox("Octopus Merge", true);
    private JCheckBox conflictedMergeOfUnrelatedHistories = new JCheckBox("Conflicted Merge Of Unrelated Histories", true);
    private JCheckBox notConflictedMergeOfUnrelatedHistories = new JCheckBox("Not Conflicted Merge Of Unrelated Histories", true);
    private JCheckBox octopusMergeOfUnrelatedHistories = new JCheckBox("Octopus Merge Of Unrelated Histories", true);
    private JCheckBox outOfMemory = new JCheckBox("Out of Memory", true);
    private JCheckBox unexpectedOccurrence = new JCheckBox("Unexpected Occurrence", true);
    private JButton selectAllMergeTypes = new JButton("Select All");
    private JButton unselectAllMergeTypes = new JButton("Unselect All");

    private JCheckBox content = new JCheckBox("Content", true);
    private JCheckBox coincidenceAdding = new JCheckBox("Coincidence Adding", true);
    private JCheckBox fileRename = new JCheckBox("File Rename", true);
    private JCheckBox directoryRename = new JCheckBox("Directory Rename", true);
    private JCheckBox modifyDelete = new JCheckBox("Modify Delete", true);
    private JCheckBox renameDelete = new JCheckBox("Rename Delete", true);
    private JCheckBox p1RenamedP2Add = new JCheckBox("P1 Renamed P2 Add", true);
    private JCheckBox p2RenamedP1Add = new JCheckBox("P2 Renamed P1 Add", true);
    private JCheckBox fileLocation = new JCheckBox("File Location", true);
    private JCheckBox submodule = new JCheckBox("Submodule", true);
    private JCheckBox contentWithUnilateralRenaming = new JCheckBox("Content With Unilateral Renaming", true);
    private JButton selectAllConflicts = new JButton("Select All");
    private JButton unselectAllConflicts = new JButton("Unselect All");

    private JCheckBox version1 = new JCheckBox("Version 1", true);
    private JCheckBox version2 = new JCheckBox("Version 2", true);
    private JCheckBox concatenation = new JCheckBox("Concatenation", true);
    private JCheckBox combination = new JCheckBox("Combination", true);
    private JCheckBox newCode = new JCheckBox("New Code", true);
    private JCheckBox none = new JCheckBox("None", true);
    private JCheckBox imprecise = new JCheckBox("Imprecise", true);
    private JCheckBox fileDeleted = new JCheckBox("File Deleted", true);
    private JCheckBox postponed = new JCheckBox("Postponed", true);
    private JCheckBox diffProblem = new JCheckBox("Diff Problem", true);
    private JButton selectAllDevDecisions = new JButton("Select All");
    private JButton unselectAllDevDecisions = new JButton("Unselect All");

    private JTextField hashInput = new JTextField("");

    private JTextField structuresInput = new JTextField("");
    private JCheckBox onlyOutmost = new JCheckBox("Only Outmost", false);
    private JCheckBox needToHaveAll = new JCheckBox("Need To Have All", false);

    private JTextField extensionInput = new JTextField("");

    public MNProjectFilterFrame(List<Merge> defaultList, List<Merge> currentList, MNMergesTable panel) {
        this.defaultList = defaultList;
        this.currentList = currentList;
        this.panel = panel;
        set();
    }

    private void set() {

        this.setModal(true);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.setTitle("Set filter");
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(600, 600));
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setOpaque(false);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP));

        JPanel orientationPanel = new JPanel();
        orientationPanel.setLayout(new GridBagLayout());
        orientationPanel.setBorder(BorderFactory.createTitledBorder("Orientation of the list"));

        JPanel typePanel = new JPanel();
        typePanel.setLayout(new GridBagLayout());
        typePanel.setBorder(BorderFactory.createTitledBorder("Type of order"));

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBorder(BorderFactory.createTitledBorder("Filter By"));

        JPanel mergeTypePanel = new JPanel();
        mergeTypePanel.setLayout(new GridBagLayout());

        JPanel conflictTypePanel = new JPanel();
        conflictTypePanel.setLayout(new GridBagLayout());

        JPanel developerDecisionPanel = new JPanel();
        developerDecisionPanel.setLayout(new GridBagLayout());

        JPanel hashPanel = new JPanel();
        hashPanel.setLayout(new GridBagLayout());

        JPanel structuresPanel = new JPanel();
        structuresPanel.setLayout(new GridBagLayout());

        JPanel extensionPanel = new JPanel();
        extensionPanel.setLayout(new GridBagLayout());

        JButton filterCurrentTable = new JButton("Filter Current Table");
        filterCurrentTable.addActionListener((ActionEvent evt) -> {
            switch (tabbedPane.getSelectedIndex()) {
                case 0:
                    filterByMerge(currentList);
                    break;
                case 1:
                    filterByConflict(currentList);
                    break;
                case 2:
                    filterByConflictRegion(currentList);
                    break;
                case 3:
                    filterByHash(currentList);
                    break;
                case 4:
                    filterByStructures(currentList);
                    break;
                default:
                    filterByExtension(currentList);
            }
        });

        JButton filterDefaultTable = new JButton("Filter Default Table");
        filterDefaultTable.addActionListener((ActionEvent evt) -> {
            switch (tabbedPane.getSelectedIndex()) {
                case 0:
                    filterByMerge(defaultList);
                    break;
                case 1:
                    filterByConflict(defaultList);
                    break;
                case 2:
                    filterByConflictRegion(defaultList);
                    break;
                case 3:
                    filterByHash(defaultList);
                    break;
                case 4:
                    filterByStructures(defaultList);
                    break;
                default:
                    filterByExtension(defaultList);

            }
        });

        selectAllMergeTypes.addActionListener((ActionEvent evt) -> {
            conflictedMerge.setSelected(true);
            notConflictedMerge.setSelected(true);
            octopusMerge.setSelected(true);
            conflictedMergeOfUnrelatedHistories.setSelected(true);
            notConflictedMergeOfUnrelatedHistories.setSelected(true);
            octopusMergeOfUnrelatedHistories.setSelected(true);
            outOfMemory.setSelected(true);
            unexpectedOccurrence.setSelected(true);
        });
        unselectAllMergeTypes.addActionListener((ActionEvent evt) -> {
            conflictedMerge.setSelected(false);
            notConflictedMerge.setSelected(false);
            octopusMerge.setSelected(false);
            conflictedMergeOfUnrelatedHistories.setSelected(false);
            notConflictedMergeOfUnrelatedHistories.setSelected(false);
            octopusMergeOfUnrelatedHistories.setSelected(false);
            outOfMemory.setSelected(false);
            unexpectedOccurrence.setSelected(false);
        });
        selectAllConflicts.addActionListener((ActionEvent evt) -> {
            content.setSelected(true);
            coincidenceAdding.setSelected(true);
            fileRename.setSelected(true);
            directoryRename.setSelected(true);
            modifyDelete.setSelected(true);
            renameDelete.setSelected(true);
            p1RenamedP2Add.setSelected(true);
            p2RenamedP1Add.setSelected(true);
            fileLocation.setSelected(true);
            submodule.setSelected(true);
            contentWithUnilateralRenaming.setSelected(true);
        });
        unselectAllConflicts.addActionListener((ActionEvent evt) -> {
            content.setSelected(false);
            coincidenceAdding.setSelected(false);
            fileRename.setSelected(false);
            directoryRename.setSelected(false);
            modifyDelete.setSelected(false);
            renameDelete.setSelected(false);
            p1RenamedP2Add.setSelected(false);
            p2RenamedP1Add.setSelected(false);
            fileLocation.setSelected(false);
            submodule.setSelected(false);
            contentWithUnilateralRenaming.setSelected(false);
        });
        selectAllDevDecisions.addActionListener((ActionEvent evt) -> {
            version1.setSelected(true);
            version2.setSelected(true);
            concatenation.setSelected(true);
            combination.setSelected(true);
            newCode.setSelected(true);
            none.setSelected(true);
            imprecise.setSelected(true);
            fileDeleted.setSelected(true);
            postponed.setSelected(true);
            diffProblem.setSelected(true);
        });
        unselectAllDevDecisions.addActionListener((ActionEvent evt) -> {
            version1.setSelected(false);
            version2.setSelected(false);
            concatenation.setSelected(false);
            combination.setSelected(false);
            newCode.setSelected(false);
            none.setSelected(false);
            imprecise.setSelected(false);
            fileDeleted.setSelected(false);
            postponed.setSelected(false);
            diffProblem.setSelected(false);
        });

        tabbedPane.addTab("Merge Type", null, mergeTypePanel, "Filter the merges by Merge Type");
        tabbedPane.addTab("Conflict File Type", null, conflictTypePanel, "Filter the conflict files by Conflict File Type");
        tabbedPane.addTab("Developer Decision", null, developerDecisionPanel, "Filter the chunks by Developer Decision");
        tabbedPane.addTab("Hash", null, hashPanel, "Filter the merges by their hashes");
        tabbedPane.addTab("Language Constructs", null, structuresPanel, "Filter the chunks by their structures");
        tabbedPane.addTab("Extension", null, extensionPanel, "Filter the conflict files by the extension of their file");

        orientationOfOrderBG = new ButtonGroup();
        orientationOfOrderBG.add(ascendingOrder);
        orientationOfOrderBG.add(descendingOrder);

        typeOfOrderBG = new ButtonGroup();
        typeOfOrderBG.add(defaultOrder);
        typeOfOrderBG.add(numberOfConflictRegionOrder);
        typeOfOrderBG.add(numberOfConflicsOrder);
        typeOfOrderBG.add(chronologicalOrder);

        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        //====================ORIENTATION PANEL====================
        orientationPanel.add(ascendingOrder, gbc);
        gbc.gridx++;
        orientationPanel.add(descendingOrder, gbc);

        //====================TYPE PANEL====================
        gbc.gridy = 0;
        typePanel.add(defaultOrder, gbc);
        gbc.gridy++;
        typePanel.add(numberOfConflictRegionOrder, gbc);
        gbc.gridy++;
        typePanel.add(numberOfConflicsOrder, gbc);
        gbc.gridy++;
        typePanel.add(chronologicalOrder, gbc);

        //====================MERGE TYPE PANEL====================
        gbc.gridy = 0;
        mergeTypePanel.add(conflictedMerge, gbc);
        gbc.gridy++;
        mergeTypePanel.add(notConflictedMerge, gbc);
        gbc.gridy++;
        mergeTypePanel.add(octopusMerge, gbc);
        gbc.gridy++;
        mergeTypePanel.add(conflictedMergeOfUnrelatedHistories, gbc);
        gbc.gridy++;
        mergeTypePanel.add(notConflictedMergeOfUnrelatedHistories, gbc);
        gbc.gridy++;
        mergeTypePanel.add(octopusMergeOfUnrelatedHistories, gbc);
        gbc.gridy++;
        mergeTypePanel.add(outOfMemory, gbc);
        gbc.gridy++;
        mergeTypePanel.add(unexpectedOccurrence, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        mergeTypePanel.add(selectAllMergeTypes, gbc);
        gbc.gridy++;
        mergeTypePanel.add(unselectAllMergeTypes, gbc);

        //====================CONFLICT TYPE PANEL====================
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        conflictTypePanel.add(content, gbc);
        gbc.gridy++;
        conflictTypePanel.add(coincidenceAdding, gbc);
        gbc.gridy++;
        conflictTypePanel.add(fileRename, gbc);
        gbc.gridy++;
        conflictTypePanel.add(directoryRename, gbc);
        gbc.gridy++;
        conflictTypePanel.add(modifyDelete, gbc);
        gbc.gridy++;
        conflictTypePanel.add(renameDelete, gbc);
        gbc.gridy++;
        conflictTypePanel.add(p1RenamedP2Add, gbc);
        gbc.gridy++;
        conflictTypePanel.add(p2RenamedP1Add, gbc);
        gbc.gridy = 0;
        gbc.gridx = 1;
        conflictTypePanel.add(fileLocation, gbc);
        gbc.gridy++;
        conflictTypePanel.add(submodule, gbc);
        gbc.gridy++;
        conflictTypePanel.add(contentWithUnilateralRenaming, gbc);
        gbc.gridy = 8;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_START;
        conflictTypePanel.add(selectAllConflicts, gbc);
        gbc.gridy++;
        conflictTypePanel.add(unselectAllConflicts, gbc);

        //====================DEVELOPER DECISION PANEL====================
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        developerDecisionPanel.add(version1, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(version2, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(concatenation, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(combination, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(newCode, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(none, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(imprecise, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(fileDeleted, gbc);
        gbc.gridy = 0;
        gbc.gridx = 1;
        developerDecisionPanel.add(postponed, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(diffProblem, gbc);
        gbc.gridy = 8;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_START;
        developerDecisionPanel.add(selectAllDevDecisions, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(unselectAllDevDecisions, gbc);

        //====================HASH PANEL====================
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        hashPanel.add(new JLabel("Input the entire hash or the its start"), gbc);

        gbc.gridy++;
        hashPanel.add(hashInput, gbc);

        //====================STRUCTURES PANEL====================
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        structuresPanel.add(new JLabel("Input the structures separeted by ';'. Ex.: Variable;IfStatement;Field"), gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        structuresPanel.add(structuresInput, gbc);

        gbc.gridy++;
        structuresPanel.add(onlyOutmost, gbc);
        
        gbc.gridy++;
        structuresPanel.add(needToHaveAll, gbc);

        //====================EXTENSION PANEL====================
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        extensionPanel.add(new JLabel("Input the extensions separeted by ';'. Ex.: java;cpp;py"), gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        extensionPanel.add(extensionInput, gbc);

        //====================MAIN PANEL====================
        gbc.gridy = 0;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(orientationPanel, gbc);

        gbc.gridx = 1;
        mainPanel.add(typePanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        mainPanel.add(tabbedPane, gbc);

        gbc = new GridBagConstraints();
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_START;
        mainPanel.add(filterCurrentTable, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        mainPanel.add(filterDefaultTable, gbc);

        this.add(mainPanel);
        this.setVisible(true);
    }

    private void filterByMerge(List<Merge> list) {

        List<MergeType> mergeTypeList = new ArrayList<>();
        List<RelationMergeOrginalCR> filteredList = new ArrayList<>();

        if (conflictedMerge.isSelected()) {
            mergeTypeList.add(MergeType.CONFLICTED_MERGE);
        }
        if (notConflictedMerge.isSelected()) {
            mergeTypeList.add(MergeType.NOT_CONFLICTED_MERGE);
        }
        if (octopusMerge.isSelected()) {
            mergeTypeList.add(MergeType.OCTOPUS_MERGE);
        }
        if (conflictedMergeOfUnrelatedHistories.isSelected()) {
            mergeTypeList.add(MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES);
        }
        if (notConflictedMergeOfUnrelatedHistories.isSelected()) {
            mergeTypeList.add(MergeType.NOT_CONFLICTED_MERGE_OF_UNRELATED_HISTORIES);
        }
        if (octopusMergeOfUnrelatedHistories.isSelected()) {
            mergeTypeList.add(MergeType.OCTOPUS_MERGE_OF_UNRELATED_HISTORIES);
        }
        if (outOfMemory.isSelected()) {
            mergeTypeList.add(MergeType.OUT_OF_MEMORY);
        }
        if (unexpectedOccurrence.isSelected()) {
            mergeTypeList.add(MergeType.UNEXPECTED_OCCURRENCE);
        }

        for (Merge merge : list) {
            if (mergeTypeList.contains(merge.getMergeType())) {
                filteredList.add(new RelationMergeOrginalCR(merge, Integer.toString(merge.getNumberOfConflictRegions())));
            }
        }

        endsFilterProcess(filteredList);

    }

    private void filterByConflict(List<Merge> list) {

        Merge auxMerge;
        List<ConflictFileType> conflictTypeList = new ArrayList<>();
        List<RelationMergeOrginalCR> filteredList = new ArrayList<>();

        if (content.isSelected()) {
            conflictTypeList.add(ConflictFileType.CONTENT);
        }
        if (coincidenceAdding.isSelected()) {
            conflictTypeList.add(ConflictFileType.COINCIDENCE_ADDING);
        }
        if (fileRename.isSelected()) {
            conflictTypeList.add(ConflictFileType.FILE_RENAME);
        }
        if (directoryRename.isSelected()) {
            conflictTypeList.add(ConflictFileType.DIRECTORY_RENAME);
        }
        if (modifyDelete.isSelected()) {
            conflictTypeList.add(ConflictFileType.MODIFY_DELETE);
        }
        if (renameDelete.isSelected()) {
            conflictTypeList.add(ConflictFileType.RENAME_DELETE);
        }
        if (p1RenamedP2Add.isSelected()) {
            conflictTypeList.add(ConflictFileType.P1_RENAMED_P2_ADD);
        }
        if (p2RenamedP1Add.isSelected()) {
            conflictTypeList.add(ConflictFileType.P2_RENAMED_P1_ADD);
        }
        if (fileLocation.isSelected()) {
            conflictTypeList.add(ConflictFileType.FILE_LOCATION);
        }
        if (submodule.isSelected()) {
            conflictTypeList.add(ConflictFileType.SUBMODULE);
        }
        if (contentWithUnilateralRenaming.isSelected()) {
            conflictTypeList.add(ConflictFileType.CONTENT_WITH_UNILATERAL_RENAMNING);
        }

        for (Merge merge : list) {
            auxMerge = new Merge(merge);
            auxMerge.setConflictFiles(new ArrayList<>());
            for (ConflictFile conflict : merge.getConflictFiles()) {
                if (conflictTypeList.contains(conflict.getConflictFileType())) {
                    auxMerge.addConflictFile(conflict);
                }
            }
            filteredList.add(new RelationMergeOrginalCR(auxMerge, Integer.toString(merge.getNumberOfConflictRegions())));
        }

        endsFilterProcess(filteredList);

    }

    private void filterByConflictRegion(List<Merge> list) {

        Merge auxMerge;
        ConflictFile auxConflict;
        List<RelationMergeOrginalCR> filteredList = new ArrayList<>();
        List<DeveloperDecision> developerDecisionList = new ArrayList<>();

        if (version1.isSelected()) {
            developerDecisionList.add(DeveloperDecision.VERSION1);
        }
        if (version2.isSelected()) {
            developerDecisionList.add(DeveloperDecision.VERSION2);
        }
        if (concatenation.isSelected()) {
            developerDecisionList.add(DeveloperDecision.CONCATENATION);
        }
        if (combination.isSelected()) {
            developerDecisionList.add(DeveloperDecision.COMBINATION);
        }
        if (newCode.isSelected()) {
            developerDecisionList.add(DeveloperDecision.NEWCODE);
        }
        if (none.isSelected()) {
            developerDecisionList.add(DeveloperDecision.NONE);
        }
        if (imprecise.isSelected()) {
            developerDecisionList.add(DeveloperDecision.IMPRECISE);
        }
        if (fileDeleted.isSelected()) {
            developerDecisionList.add(DeveloperDecision.FILE_DELETED);
        }
        if (postponed.isSelected()) {
            developerDecisionList.add(DeveloperDecision.POSTPONED_1);
            developerDecisionList.add(DeveloperDecision.POSTPONED_2);
            developerDecisionList.add(DeveloperDecision.POSTPONED_3);
        }
        if (diffProblem.isSelected()) {
            developerDecisionList.add(DeveloperDecision.DIFF_PROBLEM);
        }

        for (Merge merge : list) {
            auxMerge = new Merge(merge);
            auxMerge.setConflictFiles(new ArrayList<>());
            for (ConflictFile conflict : merge.getConflictFiles()) {
                auxConflict = new ConflictFile(conflict);
                auxConflict.setChunks(new ArrayList<>());
                for (Chunk chunk : conflict.getChunks()) {
                    if (developerDecisionList.contains(chunk.getDeveloperDecision())) {
                        auxConflict.addChunk(chunk);
                    }
                }
                auxMerge.addConflictFile(auxConflict);
            }
            filteredList.add(new RelationMergeOrginalCR(auxMerge, Integer.toString(merge.getNumberOfConflictRegions())));
        }

        endsFilterProcess(filteredList);
    }

    private void filterByHash(List<Merge> list) {
        List<RelationMergeOrginalCR> filteredList = new ArrayList<>();
        for (Merge merge : list) {
            if (merge.getMergeCommit().getHash().startsWith(hashInput.getText())) {
                filteredList.add(new RelationMergeOrginalCR(merge, Integer.toString(merge.getNumberOfConflictRegions())));
            }
        }

        endsFilterProcess(filteredList);
    }

    private void filterByStructures(List<Merge> list) {
        boolean haveAll;
        Merge auxMerge;
        String auxString;
        ConflictFile auxConflict;
        List<RelationMergeOrginalCR> filteredList = new ArrayList<>();
        boolean needToHaveAll = this.needToHaveAll.isSelected();
        String[] structures = structuresInput.getText().toLowerCase().split(";");
        for (Merge merge : list) {
            auxMerge = new Merge(merge);
            auxMerge.setConflictFiles(new ArrayList<>());
            for (ConflictFile conflict : merge.getConflictFiles()) {
                auxConflict = new ConflictFile(conflict);
                auxConflict.setChunks(new ArrayList<>());
                for (Chunk chunk : conflict.getChunks()) {
                    if (onlyOutmost.isSelected()) {
                        haveAll = true;
                        auxString = chunk.getOutmostedStructures().toLowerCase();
                        for (String structure : structures) {
                            if (needToHaveAll) {
                                if(!auxString.contains(structure)){
                                    haveAll = false;
                                    break;
                                }
                            } else if (auxString.contains(structure)) {
                                auxConflict.addChunk(chunk);
                                break;
                            }
                        }
                        if(needToHaveAll && haveAll){
                            auxConflict.addChunk(chunk);
                        }
                    } else {
                        haveAll = true;
                        auxString = chunk.getStructures().toLowerCase();
                        for (String structure : structures) {
                            if (needToHaveAll) {
                                if(!auxString.contains(structure)){
                                    haveAll = false;
                                    break;
                                }
                            } else if (auxString.contains(structure)) {
                                auxConflict.addChunk(chunk);
                                break;
                            }
                        }
                        if(needToHaveAll && haveAll){
                            auxConflict.addChunk(chunk);
                        }
                    }
                }
                auxMerge.addConflictFile(auxConflict);
            }
            filteredList.add(new RelationMergeOrginalCR(auxMerge, Integer.toString(merge.getNumberOfConflictRegions())));
        }

        endsFilterProcess(filteredList);
    }

    private void filterByExtension(List<Merge> list) {
        Merge auxMerge;
        List<RelationMergeOrginalCR> filteredList = new ArrayList<>();
        List<String> extensions = Arrays.asList(extensionInput.getText().toLowerCase().split(";"));
        for (Merge merge : list) {
            auxMerge = new Merge(merge);
            auxMerge.setConflictFiles(new ArrayList<>());
            for (ConflictFile conflict : merge.getConflictFiles()) {
                if (extensions.contains(getExtension(conflict.getParent1FileName()))) {
                    auxMerge.addConflictFile(conflict);
                }
            }
            filteredList.add(new RelationMergeOrginalCR(auxMerge, Integer.toString(merge.getNumberOfConflictRegions())));
        }

        endsFilterProcess(filteredList);
    }

    private void endsFilterProcess(List<RelationMergeOrginalCR> filteredList) {
        filteredList = ordenateList(filteredList);
        List<Merge> mergeResult = new ArrayList<>();
        List<String> originalCR = new ArrayList<>();
        for (RelationMergeOrginalCR data : filteredList) {
            mergeResult.add(data.merge);
            originalCR.add(data.originalCR);
        }

        panel.setTableModel(mergeResult, originalCR);
        this.dispose();
    }

    private List<RelationMergeOrginalCR> ordenateList(List<RelationMergeOrginalCR> filteredList) {
        if (filteredList.size() > 1) {
            boolean check;
            List<RelationMergeOrginalCR> auxList = new ArrayList<>();
            if (numberOfConflictRegionOrder.isSelected()) {
                auxList.add(filteredList.get(0));
                for (int i = 1; i < filteredList.size(); i++) {
                    check = false;
                    for (int j = 0; j < auxList.size(); j++) {
                        if (filteredList.get(i).merge.getNumberOfConflictRegions() >= auxList.get(j).merge.getNumberOfConflictRegions()) {
                            auxList.add(j, filteredList.get(i));
                            check = true;
                            j = auxList.size();
                        }
                    }
                    if (!check) {
                        auxList.add(filteredList.get(i));
                    }
                }
                filteredList = auxList;

            } else if (numberOfConflicsOrder.isSelected()) {
                auxList.add(filteredList.get(0));
                for (int i = 1; i < filteredList.size(); i++) {
                    check = false;
                    for (int j = 0; j < auxList.size(); j++) {
                        if (filteredList.get(i).merge.getConflictFiles().size() >= auxList.get(j).merge.getConflictFiles().size()) {
                            auxList.add(j, filteredList.get(i));
                            check = true;
                            j = auxList.size();
                        }
                    }
                    if (!check) {
                        auxList.add(filteredList.get(i));
                    }
                }
                filteredList = auxList;
            } else if (chronologicalOrder.isSelected()) {
                auxList.add(filteredList.get(0));
                for (int i = 1; i < filteredList.size(); i++) {
                    check = false;
                    for (int j = 0; j < auxList.size(); j++) {
                        if (filteredList.get(i).merge.getMergeCommit().getCommitterDate().getTime() >= auxList.get(j).merge.getMergeCommit().getCommitterDate().getTime()) {
                            auxList.add(j, filteredList.get(i));
                            check = true;
                            j = auxList.size();
                        }
                    }
                    if (!check) {
                        auxList.add(filteredList.get(i));
                    }
                }
                filteredList = auxList;
            }

            if (ascendingOrder.isSelected()) {
                Collections.reverse(filteredList);
            }
        }

        return filteredList;
    }

    private String getExtension(String file) {
        String[] auxArray = file.split("\\.");
        if (auxArray.length == 1) {
            return "";
        } else {
            return auxArray[1];
        }
    }

    private class RelationMergeOrginalCR {

        public Merge merge;
        public String originalCR;

        public RelationMergeOrginalCR(Merge merge, String originalCR) {
            this.merge = merge;
            this.originalCR = originalCR;
        }

    }

}
