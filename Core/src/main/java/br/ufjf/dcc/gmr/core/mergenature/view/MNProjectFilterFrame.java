package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictType;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.MergeType;
import static br.ufjf.dcc.gmr.core.mergenature.view.MNFrame.MAX_BOUNDS;
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
import javax.swing.JPanel;
import javax.swing.JRadioButton;

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

    private JCheckBox version1 = new JCheckBox("VERSION_1", true);
    private JCheckBox version2 = new JCheckBox("VERSION_2", true);
    private JCheckBox concatenation = new JCheckBox("CONCATENATION", true);
    private JCheckBox combination = new JCheckBox("COMBINATION", true);
    private JCheckBox newCode = new JCheckBox("NEWCODE", true);
    private JCheckBox none = new JCheckBox("NONE", true);
    private JCheckBox imprecise = new JCheckBox("IMPRECISE", true);
    private JCheckBox fileDeleted = new JCheckBox("FILE_DELETED", true);
    private JCheckBox postponed = new JCheckBox("POSTPONED", true);
    private JCheckBox diffProblem = new JCheckBox("DIFF_PROBLEM", true);

    public MNProjectFilterFrame(List<Merge> defaultList, MNMergesTable panel) {
        this.defaultList = defaultList;
        this.panel = panel;
        set();
    }

    private void set() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Set filter");
        this.setResizable(true);
        this.setBounds(100, 100, MAX_BOUNDS.width - 200, MAX_BOUNDS.height - 200);
        this.setMinimumSize(new Dimension(500, 300));
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JPanel orientationPanel = new JPanel();
        orientationPanel.setLayout(new GridBagLayout());
        orientationPanel.setBorder(BorderFactory.createTitledBorder("Orientation of the list"));

        JPanel typePanel = new JPanel();
        typePanel.setLayout(new GridBagLayout());
        typePanel.setBorder(BorderFactory.createTitledBorder("Type of order"));

        JPanel mergeTypePanel = new JPanel();
        mergeTypePanel.setLayout(new GridBagLayout());
        mergeTypePanel.setBorder(BorderFactory.createTitledBorder("Merges Types"));

        JPanel conflictTypePanel = new JPanel();
        conflictTypePanel.setLayout(new GridBagLayout());
        conflictTypePanel.setBorder(BorderFactory.createTitledBorder("Conflicts Types"));

        JPanel developerDecisionPanel = new JPanel();
        developerDecisionPanel.setLayout(new GridBagLayout());
        developerDecisionPanel.setBorder(BorderFactory.createTitledBorder("Developer Decision"));

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
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);
        this.add(orientationPanel, gbc);
        gbc.gridy++;
        this.add(typePanel, gbc);
        gbc.gridy++;
        this.add(mergeTypePanel, gbc);
        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.gridheight = 2;
        this.add(conflictTypePanel, gbc);
        gbc.gridheight = 1;
        gbc.gridy += 2;
        this.add(developerDecisionPanel, gbc);
        JButton setFilter = new JButton("Set filter");
        setFilter.addActionListener((ActionEvent evt) -> {
            setFilter();
        });
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(setFilter, gbc);

        this.pack();
        this.setVisible(true);
    }

    private void setFilter() {

        boolean check;
        Merge auxMerge;
        Conflict auxConflict;
        List<Merge> filteredList = new ArrayList<>();
        List<Merge> auxList;
        List<MergeType> mergeTypeList = new ArrayList<>();
        List<ConflictType> conflictTypeList = new ArrayList<>();
        List<DeveloperDecision> developerDecisionList = new ArrayList<>();

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

        filteredList = new ArrayList<>();
        for (Merge merge : defaultList) {
            if (mergeTypeList.contains(merge.getMergeType())) {
                auxMerge = new Merge(merge);
                auxMerge.setConflicts(new ArrayList<>());
                for (Conflict conflict : merge.getConflicts()) {
                    if (conflictTypeList.contains(conflict.getConflictType())) {
                        auxConflict = new Conflict(conflict);
                        auxConflict.setConflictRegions(new ArrayList<>());
                        for (ConflictRegion conflictRegion : conflict.getConflictRegions()) {
                            if (developerDecisionList.contains(conflictRegion.getDeveloperDecision())) {
                                auxConflict.addConflictRegion(conflictRegion);
                            }
                        }
                        auxMerge.addConflicts(auxConflict);
                    }
                }
                filteredList.add(auxMerge);
            }
        }
        if (!filteredList.isEmpty()) {
            auxList = new ArrayList<>();
            if (numberOfConflictRegionOrder.isSelected()) {
                auxList.add(filteredList.get(0));
                for (int i = 1; i < filteredList.size(); i++) {
                    check = false;
                    for (int j = 0; j < auxList.size(); j++) {
                        if (filteredList.get(i).getNumberOfConflictRegions() >= auxList.get(j).getNumberOfConflictRegions()) {
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
                        if (filteredList.get(i).getConflicts().size() >= auxList.get(j).getConflicts().size()) {
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
                        if (filteredList.get(i).getMerge().getCommitterDate().getTime() >= auxList.get(j).getMerge().getCommitterDate().getTime()) {
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

            if (descendingOrder.isSelected()) {
                Collections.reverse(filteredList);
            }
        }

        panel.setTableModel(filteredList);
        this.dispose();

    }

}
