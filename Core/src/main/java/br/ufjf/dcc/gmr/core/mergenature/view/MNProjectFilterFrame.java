package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 01-02-2021
 */
public class MNProjectFilterFrame extends JFrame {
    
    private List<Merge> defaultList;
    private List<Merge> filteredList;
    
    private JRadioButton defaultOrder = new JRadioButton("Default Order");
    private JRadioButton numberOfConflictRegionOrder = new JRadioButton("Number of Conflict Regions Order");
    private JRadioButton numberOfConflicsOrder = new JRadioButton("Number of Conflicts Order");
    private JRadioButton chronologicalOrder = new JRadioButton("Chronological Order");
    private ButtonGroup typeOfOrder;
    
    private JRadioButton ascendingOrder = new JRadioButton("Ascending Order");
    private JRadioButton descendingOrder = new JRadioButton("Descending Order");
    private ButtonGroup orientationOfOrderBG;
    
    private JCheckBox conflictedMerge = new JCheckBox("Conflicted Merge");
    private JCheckBox notConflictedMerge = new JCheckBox("Not Conflict Merge");
    private JCheckBox octopusMerge = new JCheckBox("Octopus Merge");
    private JCheckBox conflictedMergeOfUnrelatedHistories = new JCheckBox("Conflicted Merge Of Unrelated Histories");
    private JCheckBox notConflictedMergeOfUnrelatedHistories = new JCheckBox("Not Conflict Merge Of Unrelated Histories");
    private JCheckBox octopusMergeOfUnrelatedHistories = new JCheckBox("Octopus Merge Of Unrelated Histories");

    private JCheckBox content = new JCheckBox("Content");
    private JCheckBox coincidenceAdding = new JCheckBox("Coincidence Adding");
    private JCheckBox fileRename = new JCheckBox("File Rename");
    private JCheckBox directoryRename = new JCheckBox("Directory Rename");
    private JCheckBox modifyDelete = new JCheckBox("Modify Delete");
    private JCheckBox renameDelete = new JCheckBox("Rename Delete");
    private JCheckBox p1RenamedP2Add = new JCheckBox("P1 Renamed P2 Add");
    private JCheckBox p2RenamedP1Add = new JCheckBox("P2 Renamed P1 Add");
    private JCheckBox fileLocation = new JCheckBox("File Location");
    private JCheckBox submodule = new JCheckBox("Submodule");
    private JCheckBox contentWithUnilateralRenaming = new JCheckBox("Content With Unilateral Renaming");

    private JCheckBox version1 = new JCheckBox("VERSION_1");
    private JCheckBox version2 = new JCheckBox("VERSION_2");
    private JCheckBox concatenation = new JCheckBox("CONCATENATION");
    private JCheckBox combination = new JCheckBox("COMBINATION");
    private JCheckBox newCode = new JCheckBox("NEWCODE");
    private JCheckBox none = new JCheckBox("NONE");
    private JCheckBox imprecise = new JCheckBox("IMPRECISE");
    private JCheckBox fileDeleted = new JCheckBox("FILE_DELETED");
    private JCheckBox postponed = new JCheckBox("POSTPONED");
    private JCheckBox diffProblem = new JCheckBox("DIFF_PROBLEM");
    
    
    public MNProjectFilterFrame(List<Merge> defaultList){
        this.defaultList = defaultList;
        set();
    }
    
    private void set(){
        
    }
    
}
