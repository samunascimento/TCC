package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictType;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import br.ufjf.dcc.gmr.core.mergenature.view.MNFrame;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
public class MNProjectFilterFrame extends JFrame {

    private MNMergesTable panel;
    private List<Merge> defaultList;

    private JRadioButton ascendingOrder = new JRadioButton("Ascending Order", true);
    private JRadioButton descendingOrder = new JRadioButton("Descending Order");
    private ButtonGroup orientationOfOrderBG;

    private JRadioButton defaultOrder = new JRadioButton("Default Order", true);
    private JRadioButton numberOfConflictRegionOrder = new JRadioButton("Number of Conflict Regions Order");
    private JRadioButton numberOfConflicsOrder = new JRadioButton("Number of Conflicts Order");
    private JRadioButton chronologicalOrder = new JRadioButton("Chronological Order");
    private ButtonGroup typeOfOrderBG;

    private JCheckBox conflictedMerge = new JCheckBox("Conflicted Merge", true);
    private JCheckBox notConflictedMerge = new JCheckBox("Not Conflicted Merge", true);
    private JCheckBox octopusMerge = new JCheckBox("Octopus Merge", true);
    private JCheckBox conflictedMergeOfUnrelatedHistories = new JCheckBox("Conflicted Merge Of Unrelated Histories", true);
    private JCheckBox notConflictedMergeOfUnrelatedHistories = new JCheckBox("Not Conflicted Merge Of Unrelated Histories", true);
    private JCheckBox octopusMergeOfUnrelatedHistories = new JCheckBox("Octopus Merge Of Unrelated Histories", true);
    private JCheckBox outOfMemory = new JCheckBox("Out of Memory", true);

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

    private JTextField hashInput = new JTextField("");

    public MNProjectFilterFrame(List<Merge> defaultList, MNMergesTable panel) {
        this.defaultList = defaultList;
        this.panel = panel;
        set();
    }

    private void set() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Set filter");
        this.setResizable(true);
        this.setBounds(100, 100, MNFrame.MAX_BOUNDS.width - 200, MNFrame.MAX_BOUNDS.height - 200);
        this.setMinimumSize(new Dimension(500, 300));
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

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

        tabbedPane.addTab("Merge Type", null, mergeTypePanel, "Filter the merges by Merge Type");
        tabbedPane.addTab("Conflict Type", null, conflictTypePanel, "Filter the conflicts by Conflict Type");
        tabbedPane.addTab("Developer Decision", null, developerDecisionPanel, "Filter the conflict regions by Developer Decision");
        tabbedPane.addTab("Hash", null, hashPanel, "Filter the merges by their hashes");

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

        orientationPanel.add(ascendingOrder, gbc);
        gbc.gridy++;
        orientationPanel.add(descendingOrder, gbc);

        gbc.gridy = 0;
        typePanel.add(defaultOrder, gbc);
        gbc.gridy++;
        typePanel.add(numberOfConflictRegionOrder, gbc);
        gbc.gridy++;
        typePanel.add(numberOfConflicsOrder, gbc);
        gbc.gridy++;
        typePanel.add(chronologicalOrder, gbc);

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

        gbc.gridy = 0;
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
        gbc.gridy++;
        conflictTypePanel.add(fileLocation, gbc);
        gbc.gridy++;
        conflictTypePanel.add(submodule, gbc);
        gbc.gridy++;
        conflictTypePanel.add(contentWithUnilateralRenaming, gbc);

        gbc.gridy = 0;
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
        gbc.gridy++;
        developerDecisionPanel.add(postponed, gbc);
        gbc.gridy++;
        developerDecisionPanel.add(diffProblem, gbc);

        gbc.gridy = 0;
        hashPanel.add(new JLabel("Input the entire hash or the its start"), gbc);
        gbc.gridy++;
        hashPanel.add(hashInput, gbc);

        gbc.gridy = 0;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        this.add(orientationPanel, gbc);
        gbc.gridx = 1;
        this.add(typePanel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        this.add(tabbedPane, gbc);
        JButton setFilter = new JButton("Set filter");
        setFilter.addActionListener((ActionEvent evt) -> {
            switch (tabbedPane.getSelectedIndex()) {
                case 0:
                    filterByMerge();
                    break;
                case 1:
                    filterByConflict();
                    break;
                case 2:
                    filterByConflictRegion();
                    break;
                default:
                    filterByHash();
            }
        });
        gbc = new GridBagConstraints();
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(setFilter, gbc);

        this.pack();
        this.setVisible(true);
    }

    private void filterByMerge() {

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

        for (Merge merge : defaultList) {
            if (mergeTypeList.contains(merge.getMergeType())) {
                filteredList.add(new RelationMergeOrginalCR(merge, Integer.toString(merge.getNumberOfConflictRegions())));
            }
        }

        endsFilterProcess(filteredList);

    }

    private void filterByConflict() {

        Merge auxMerge;
        List<ConflictType> conflictTypeList = new ArrayList<>();
        List<RelationMergeOrginalCR> filteredList = new ArrayList<>();

        if (content.isSelected()) {
            conflictTypeList.add(ConflictType.CONTENT);
        }
        if (coincidenceAdding.isSelected()) {
            conflictTypeList.add(ConflictType.COINCIDENCE_ADDING);
        }
        if (fileRename.isSelected()) {
            conflictTypeList.add(ConflictType.FILE_RENAME);
        }
        if (directoryRename.isSelected()) {
            conflictTypeList.add(ConflictType.DIRECTORY_RENAME);
        }
        if (modifyDelete.isSelected()) {
            conflictTypeList.add(ConflictType.MODIFY_DELETE);
        }
        if (renameDelete.isSelected()) {
            conflictTypeList.add(ConflictType.RENAME_DELETE);
        }
        if (p1RenamedP2Add.isSelected()) {
            conflictTypeList.add(ConflictType.P1_RENAMED_P2_ADD);
        }
        if (p2RenamedP1Add.isSelected()) {
            conflictTypeList.add(ConflictType.P2_RENAMED_P1_ADD);
        }
        if (fileLocation.isSelected()) {
            conflictTypeList.add(ConflictType.FILE_LOCATION);
        }
        if (submodule.isSelected()) {
            conflictTypeList.add(ConflictType.SUBMODULE);
        }
        if (contentWithUnilateralRenaming.isSelected()) {
            conflictTypeList.add(ConflictType.CONTENT_WITH_UNILATERAL_RENAMNING);
        }

        for (Merge merge : defaultList) {
            auxMerge = new Merge(merge);
            auxMerge.setConflicts(new ArrayList<>());
            for (Conflict conflict : merge.getConflicts()) {
                if (conflictTypeList.contains(conflict.getConflictType())) {
                    auxMerge.addConflict(conflict);
                }
            }
            filteredList.add(new RelationMergeOrginalCR(auxMerge, Integer.toString(merge.getNumberOfConflictRegions())));
        }

        endsFilterProcess(filteredList);

    }

    private void filterByConflictRegion() {

        Merge auxMerge;
        Conflict auxConflict;
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
            developerDecisionList.add(DeveloperDecision.POSTPONED);
        }
        if (diffProblem.isSelected()) {
            developerDecisionList.add(DeveloperDecision.DIFF_PROBLEM);
        }

        for (Merge merge : defaultList) {
            auxMerge = new Merge(merge);
            auxMerge.setConflicts(new ArrayList<>());
            for (Conflict conflict : merge.getConflicts()) {
                auxConflict = new Conflict(conflict);
                auxConflict.setConflictRegions(new ArrayList<>());
                for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                    if (developerDecisionList.contains(conflictRegion.getDeveloperDecision())) {
                        auxConflict.addConflictRegion(conflictRegion);
                    }
                }
                auxMerge.addConflict(auxConflict);
            }
            filteredList.add(new RelationMergeOrginalCR(auxMerge, Integer.toString(merge.getNumberOfConflictRegions())));
        }

        endsFilterProcess(filteredList);
    }

    private void filterByHash() {
        List<RelationMergeOrginalCR> filteredList = new ArrayList<>();
        for (Merge merge : defaultList) {
            if (merge.getMerge().getCommitHash().startsWith(hashInput.getText())) {
                filteredList.add(new RelationMergeOrginalCR(merge, Integer.toString(merge.getNumberOfConflictRegions())));
            }
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
                        if (filteredList.get(i).merge.getConflicts().size() >= auxList.get(j).merge.getConflicts().size()) {
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
                        if (filteredList.get(i).merge.getMerge().getCommitterDate().getTime() >= auxList.get(j).merge.getMerge().getCommitterDate().getTime()) {
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

    private class RelationMergeOrginalCR {

        public Merge merge;
        public String originalCR;

        public RelationMergeOrginalCR(Merge merge, String originalCR) {
            this.merge = merge;
            this.originalCR = originalCR;
        }

    }

}
