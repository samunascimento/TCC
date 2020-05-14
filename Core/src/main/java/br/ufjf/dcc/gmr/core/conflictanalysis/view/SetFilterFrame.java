package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author joao_lima
 */
public class SetFilterFrame extends JFrame {

    private JPanel adOrderPanel;
    private JRadioButton ascendingOrderRB;
    private JRadioButton descendingOrderRB;
    private ButtonGroup adOrderBG;

    private JPanel typeOfOrderPanel;
    private JRadioButton processingOrder;
    private JRadioButton numberOfConflictRegionOrder;
    private JRadioButton numberOfConflictFilesOrder;
    private JRadioButton chronologicalOrder;
    private ButtonGroup typeOfOrderBG;

    private JPanel withNoConflictsPanel;
    private JRadioButton withNoConflict;
    private JRadioButton withoutNoConflict;
    private ButtonGroup withNoConflictsBG;

    private JButton setFilterButton;
    
    private String size = "                                                                                                             ";
    
    public SetFilterFrame(JButton setFilterButton, String projectName) {
        this.setFilterButton = setFilterButton;
        this.setTitle("Set " + projectName + " Table Filter");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new GridBagLayout());
        this.startGenerator();
        this.startCouplers();
        this.pack();
        this.ascendingOrderRB.setSelected(true);
        this.processingOrder.setSelected(true);
        this.withNoConflict.setSelected(true);

    }

//  ******************************************************************
//  *                                                                *
//  *                           Generators                           *
//  *                                                                *
//  ******************************************************************
    public void startGenerator() {
        this.adOrderPanel = generateADOrderPanel();
        this.ascendingOrderRB = generateAscendingOrderRB();
        this.descendingOrderRB = generateDescendingOrderRB();
        this.adOrderBG = generateADOrderBG();
        this.typeOfOrderPanel = generateTypeOfOrderPanel();
        this.processingOrder = generateProcessingOrder();
        this.numberOfConflictRegionOrder = generateNumberOfConflictRegionOrder();
        this.numberOfConflictFilesOrder = generateNumberOfConflictFilesOrder();
        this.chronologicalOrder = generateChronologicalOrder();
        this.typeOfOrderBG = generateTypeOfOrderBG();
        this.withNoConflictsPanel = generateWithNoConflictsPanel();
        this.withNoConflict = generateWithNoConflict();
        this.withoutNoConflict = generateWithoutNoConflict();
        this.withNoConflictsBG = generateWithNoConflictsBG();
    }

    private JPanel generateADOrderPanel() {
        JPanel prototype = new JPanel();
        prototype.setBorder(BorderFactory.createTitledBorder("Ascending or Descending Order"));
        prototype.setLayout(new GridBagLayout());
        return prototype;
    }

    private JRadioButton generateAscendingOrderRB() {
        JRadioButton prototype = new JRadioButton("Ascending Order                    ");
        return prototype;
    }

    private JRadioButton generateDescendingOrderRB() {
        JRadioButton prototype = new JRadioButton("Descending Order                   ");
        return prototype;
    }

    private ButtonGroup generateADOrderBG() {
        ButtonGroup prototype = new ButtonGroup();
        return prototype;
    }

    private JPanel generateTypeOfOrderPanel() {
        JPanel prototype = new JPanel();
        prototype.setBorder(BorderFactory.createTitledBorder("Type of Order"));
        prototype.setLayout(new GridBagLayout());
        return prototype;
    }

    private JRadioButton generateProcessingOrder() {
        JRadioButton prototype = new JRadioButton("Order of Processing (default)      ");
        return prototype;
    }

    private JRadioButton generateNumberOfConflictRegionOrder() {
        JRadioButton prototype = new JRadioButton("Order of Number of Conflict Regions");
        return prototype;
    }

    private JRadioButton generateNumberOfConflictFilesOrder() {
        JRadioButton prototype = new JRadioButton("Order of Number of Conflict Files  ");
        return prototype;
    }

    private JRadioButton generateChronologicalOrder() {
        JRadioButton prototype = new JRadioButton("Chronological Order                ");
        return prototype;
    }

    private ButtonGroup generateTypeOfOrderBG() {
        ButtonGroup prototype = new ButtonGroup();
        return prototype;
    }

    private JPanel generateWithNoConflictsPanel() {
        JPanel prototype = new JPanel();
        prototype.setBorder(BorderFactory.createTitledBorder("With or without Not Conflict Merges"));
        prototype.setLayout(new GridBagLayout());
        return prototype;
    }

    private JRadioButton generateWithNoConflict() {
        JRadioButton prototype = new JRadioButton("With Not Conflict Merges           ");
        return prototype;
    }

    private JRadioButton generateWithoutNoConflict() {
        JRadioButton prototype = new JRadioButton("Without Not Conflict Merges        ");
        return prototype;
    }

    private ButtonGroup generateWithNoConflictsBG() {
        ButtonGroup prototype = new ButtonGroup();
        return prototype;
    }

//  ****************************************************************
//  *                                                              *
//  *                           Couplers                           *
//  *                                                              *
//  ****************************************************************    
    private void startCouplers() {
        this.buttonGroupCoupler();
        this.adOrderPanelCoupler();
        this.typeOfOrderCoupler();
        this.withNConflcitCoupler();
        this.panelsCoupler();
    }

    private void buttonGroupCoupler() {
        this.adOrderBG.add(this.ascendingOrderRB);
        this.adOrderBG.add(this.descendingOrderRB);

        this.typeOfOrderBG.add(this.processingOrder);
        this.typeOfOrderBG.add(this.numberOfConflictRegionOrder);
        this.typeOfOrderBG.add(this.numberOfConflictFilesOrder);
        this.typeOfOrderBG.add(this.chronologicalOrder);

        this.withNoConflictsBG.add(this.withNoConflict);
        this.withNoConflictsBG.add(this.withoutNoConflict);

    }

    private void adOrderPanelCoupler() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 1, 1);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth++;
        gbc.gridy++;
        this.adOrderPanel.add(new JLabel(this.size),gbc);
        gbc.gridwidth--;
        gbc.gridy++;
        this.adOrderPanel.add(this.ascendingOrderRB, gbc);
        gbc.gridy++;
        this.adOrderPanel.add(this.descendingOrderRB, gbc);
        gbc.gridwidth++;
        gbc.gridy++;
        this.adOrderPanel.add(new JLabel(this.size),gbc);
    }

    private void typeOfOrderCoupler() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 1, 1);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth++;
        gbc.gridy++;
        this.typeOfOrderPanel.add(new JLabel(this.size),gbc);
        gbc.gridwidth--;
        gbc.gridy++;
        this.typeOfOrderPanel.add(this.processingOrder, gbc);
        gbc.gridy++;
        this.typeOfOrderPanel.add(this.numberOfConflictRegionOrder, gbc);
        gbc.gridy++;
        this.typeOfOrderPanel.add(this.numberOfConflictFilesOrder, gbc);
        gbc.gridy++;
        this.typeOfOrderPanel.add(this.chronologicalOrder, gbc);
        gbc.gridwidth++;
        gbc.gridy++;
        this.typeOfOrderPanel.add(new JLabel(this.size),gbc);
    }

    private void withNConflcitCoupler() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 1, 1);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth++;
        gbc.gridy++;
        this.withNoConflictsPanel.add(new JLabel(this.size),gbc);
        gbc.gridwidth--;
        gbc.gridy++;
        this.withNoConflictsPanel.add(this.withNoConflict, gbc);
        gbc.gridy++;
        this.withNoConflictsPanel.add(this.withoutNoConflict, gbc);
        gbc.gridwidth++;
        gbc.gridy++;
        this.withNoConflictsPanel.add(new JLabel(this.size),gbc);
    }

    private void panelsCoupler() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 1, 1);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth++;
        gbc.gridy++;
        this.add(this.adOrderPanel, gbc);
        gbc.gridy++;
        this.add(this.typeOfOrderPanel, gbc);
        gbc.gridy++;
        this.add(this.withNoConflictsPanel, gbc);
        gbc.gridy++;
        gbc.gridwidth--;
        this.add(this.setFilterButton, gbc);
    }

//  ***********************************************************************    
//  *                                                                     *
//  *                           Process Methods                           *
//  *                                                                     *
//  ***********************************************************************
    
    public int getFirstChoice(){
        if(this.ascendingOrderRB.isSelected()){
            return 0;
        } else {
            return 1;
        }
    }
    
    public int getSecondChoice(){
        if(this.processingOrder.isSelected()){
            return 0;
        } else if (this.numberOfConflictRegionOrder.isSelected()){
            return 1;
        } else if (this.numberOfConflictFilesOrder.isSelected()){
            return 2;
        } else {
            return 3;
        }
    }
    
    public int getThirdChoice(){
        if(this.withNoConflict.isSelected()){
            return 0;
        } else {
            return 1;
        }
    }

}
