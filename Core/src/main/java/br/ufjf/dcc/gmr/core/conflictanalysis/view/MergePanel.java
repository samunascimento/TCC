package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GSONClass;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictFile;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    private JTextArea conflictTextArea = new JTextArea();
    private JTextArea mergeInfoTextArea = new JTextArea();
    private JTextArea solutionTextArea = new JTextArea();
    //ScrollPane
    private JScrollPane mainTableScrollPane = new JScrollPane();
    private JScrollPane conflictTextAreaScrollPane = new JScrollPane();
    private JScrollPane mergeInfoTextAreaScrollPane = new JScrollPane();
    private JScrollPane subPanelV1StructureTypeTextAreaScrollPane = new JScrollPane();
    private JScrollPane subPanelV2StructureTypeTextAreaScrollPane = new JScrollPane();
    private JScrollPane subPanelDeveloperDecisionTextAreaScrollPane = new JScrollPane();
    private JScrollPane solutionTextAreaScrollPane = new JScrollPane();
    //Currents
    private MergeEvent currentMerge = null;
    private ConflictFile currentFile = null;
    private int currentFileIndex = 0;
    private int currentConflictIndex = 0;
    private int currentMaxFileIndex = 0;
    private int currentMaxConflictIndex = 0;
    //Sub Panel
    private JPanel subPanel = new JPanel();
    private JButton subPanelPreviousFileButton = new JButton("Previous File");
    private JButton subPanelNextFileButton = new JButton("Next File");
    private JButton subPanelPreviousConflictButton = new JButton("Previous Conflict");
    private JButton subPanelNextConflictButton = new JButton("Next Conflict");
    private JLabel subPanelFileNameLabel = new JLabel("File Name:");
    private JLabel subPanelFileIndexLabel = new JLabel("0/0");
    private JLabel subPanelConflictIndexLabel = new JLabel("0/0");
    private JTextArea subPanelV1StructureTypeTextArea = new JTextArea("\n");
    private JTextArea subPanelV2StructureTypeTextArea = new JTextArea("\n");
    private JTextArea subPanelDeveloperDecisionTextArea = new JTextArea("DEVELOPER DECISION:");
    private JButton subPanelSaveAnalysisButton = new JButton("Save Analysis");
    //Block Panel
    private JPanel lineStartPanel = new JPanel();
    private JPanel centerPanel = new JPanel();
    private JPanel lineEndPanel = new JPanel();
    
    public MergePanel(List<MergeEvent> list) {
        this.list = list;
        setPanel();
    }
    
    private void setPanel() {
        
        this.setLayout(new GridLayout(1,3,3,3));
        this.lineStartPanel.setLayout(new GridLayout(1, 1, 3, 3));
        this.centerPanel.setLayout(new GridLayout(2, 1, 3, 3));
        this.lineEndPanel.setLayout(new GridLayout(2, 1, 3, 3));
        this.add(this.lineStartPanel);
        this.add(this.centerPanel);
        this.add(this.lineEndPanel);
        
        customizeTable();
        this.lineStartPanel.add(this.mainTableScrollPane);
        
        this.customizeSubPanel();
        this.centerPanel.add(this.subPanel);
        this.customizeMergeInfoTextArea();
        this.centerPanel.add(this.mergeInfoTextAreaScrollPane);
        
        this.customizeConflictTextArea();
        this.lineEndPanel.add(this.conflictTextAreaScrollPane);
        this.customizeSolutionTextArea();;
        this.lineEndPanel.add(this.solutionTextAreaScrollPane);
        
        
        
        this.changeInfo(this.list.get(0));
        this.updateFileChangeByMerge(list.get(0));
        this.currentMerge = list.get(0);
        
    }
    
    private void customizeTable() {
        this.mainTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Hash", "Conflict"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
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
                merge.getHash().getCommitHash(),
                merge.isConflict()
            });
        }
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() > 1) {
                    MergeEvent merge = list.get(mainTable.getSelectedRow());
                    changeInfo(merge);
                    updateFileChangeByMerge(merge);
                    currentMerge = merge;
                }
            }
        });
        this.mainTableScrollPane.setViewportView(this.mainTable);
    }
    
    private void customizeMergeInfoTextArea() {
        this.mergeInfoTextArea.setText("\nCommit\n "
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
        this.mergeInfoTextArea.setBackground(this.lineStartPanel.getBackground());
        this.mergeInfoTextAreaScrollPane.setViewportView(this.mergeInfoTextArea);
    }
    
    private void customizeConflictTextArea() {
        this.conflictTextArea.setEditable(false);
        this.conflictTextAreaScrollPane.setBorder(BorderFactory.createTitledBorder("Conflict"));
        this.conflictTextAreaScrollPane.setViewportView(this.conflictTextArea);
    }
    
    private void customizeSolutionTextArea(){
        this.solutionTextArea.setEditable(false);
        this.solutionTextAreaScrollPane.setBorder(BorderFactory.createTitledBorder("Solution"));
        this.solutionTextAreaScrollPane.setViewportView(this.solutionTextArea);
    }
    
    private void customizeSubPanel() {
        this.subPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(8, 8, 5, 5);
        this.customizeButtons();
        this.customizeSubPanelTextArea();
        
        
        gbc.gridwidth = 6;
        this.subPanel.add(this.subPanelFileNameLabel, gbc);
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        this.subPanel.add(this.subPanelPreviousFileButton, gbc);
        gbc.gridx = 1;
        this.subPanel.add(this.subPanelFileIndexLabel, gbc);
        gbc.gridx = 2;
        this.subPanel.add(this.subPanelNextFileButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.subPanel.add(this.subPanelPreviousConflictButton, gbc);
        gbc.gridx = 1;
        this.subPanel.add(this.subPanelConflictIndexLabel, gbc);
        gbc.gridx = 2;
        this.subPanel.add(this.subPanelNextConflictButton, gbc);
        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 3;
        this.subPanel.add(this.subPanelV1StructureTypeTextAreaScrollPane, gbc);
        gbc.gridy = 4;
        this.subPanel.add(this.subPanelV2StructureTypeTextAreaScrollPane, gbc);
        gbc.gridy = 5;
        this.subPanel.add(this.subPanelDeveloperDecisionTextArea, gbc);
        gbc.gridwidth = 1;
        gbc.gridy = 6;
        this.subPanel.add(this.subPanelSaveAnalysisButton, gbc);
    }
    
    private void customizeSubPanelTextArea() {
        this.subPanelV1StructureTypeTextArea.setEditable(false);
        this.subPanelV1StructureTypeTextArea.setBackground(this.subPanel.getBackground());
        this.subPanelV1StructureTypeTextAreaScrollPane.setViewportView(this.subPanelV1StructureTypeTextArea);
        this.subPanelV1StructureTypeTextAreaScrollPane.setBorder(BorderFactory.createTitledBorder("V1"));
        this.subPanelV2StructureTypeTextArea.setEditable(false);
        this.subPanelV2StructureTypeTextArea.setBackground(this.subPanel.getBackground());
        this.subPanelV2StructureTypeTextAreaScrollPane.setViewportView(this.subPanelV2StructureTypeTextArea);
        this.subPanelV2StructureTypeTextAreaScrollPane.setBorder(BorderFactory.createTitledBorder("V2"));
        this.subPanelDeveloperDecisionTextArea.setEditable(false);
        this.subPanelDeveloperDecisionTextArea.setBackground(this.subPanel.getBackground());
        this.subPanelDeveloperDecisionTextAreaScrollPane.setViewportView(this.subPanelDeveloperDecisionTextArea);
    }
    
    private void customizeButtons() {
        subPanelPreviousFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousFileButtonMouseClicked(evt);
            }
        });
        
        subPanelNextFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextFileButtonMouseClicked(evt);
            }
        });
        
        subPanelNextConflictButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextConflictButtonMouseClicked(evt);
            }
        });
        
        subPanelPreviousConflictButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousConflictButtonMouseClicked(evt);
            }
        });
        /*
        subPanelSaveAnalysisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String fileName = JOptionPane.showInternalInputDialog(null, "Choose the filename\nMax: 20 characters", "Save Analysis", JOptionPane.QUESTION_MESSAGE);
                while (fileName.length() > 20) {
                    fileName = JOptionPane.showInternalInputDialog(null, "Limit of characters overpast, please, choose another filename\nMax: 20 characters", "Save Analysis", JOptionPane.QUESTION_MESSAGE);
                }
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int check = jfc.showOpenDialog(null);
                if (check == JFileChooser.APPROVE_OPTION) {
                    String savePath = jfc.getSelectedFile().getPath();
                    GSONClass.createGson();
                }
            }
        });
         */
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
            this.subPanelFileNameLabel.setText("File Name: " + merge.getConflictFiles().get(0).getFileName());
            this.currentFile = merge.getConflictFiles().get(0);
            this.subPanelFileIndexLabel.setText("1/" + merge.getConflictFiles().size());
            this.currentFileIndex = 1;
            this.currentMaxFileIndex = merge.getConflictFiles().size();
            
            if (!merge.getConflictFiles().get(0).getConflictRegion().equals(null)) {
                this.subPanelConflictIndexLabel.setText("1/" + merge.getConflictFiles().get(0).getConflictRegion().size());
                this.currentConflictIndex = 1;
                this.currentMaxConflictIndex = merge.getConflictFiles().get(0).getConflictRegion().size();
                this.conflictTextArea.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getConflictForm());
                this.solutionTextArea.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getSolutionForm());
                this.subPanelV1StructureTypeTextArea.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getV1StructureTypes() + "\n");
                this.subPanelV2StructureTypeTextArea.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getV2StructureTypes() + "\n");
                this.subPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: " + merge.getConflictFiles().get(0).getConflictRegion().get(0).getDeveloperDecision());
            } else {
                this.subPanelConflictIndexLabel.setText("0/0");
                this.currentConflictIndex = 0;
                this.currentMaxConflictIndex = 0;
                this.conflictTextArea.setText(merge.getConflictFiles().get(0).getFileName() + "has not been\nmerged as it has been renamed or deleted.");
                this.solutionTextArea.setText("Impossible to get the solution");
                this.subPanelV1StructureTypeTextArea.setText("\n");
                this.subPanelV2StructureTypeTextArea.setText("\n");
                this.subPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: ");
            }
        } else {
            this.subPanelFileNameLabel.setText("File Name: ");
            this.currentFile = null;
            
            this.subPanelFileIndexLabel.setText("0/0");
            this.currentFileIndex = 0;
            this.currentMaxFileIndex = 0;
            
            this.subPanelConflictIndexLabel.setText("0/0");
            this.currentConflictIndex = 0;
            this.currentMaxConflictIndex = 0;
            
            this.conflictTextArea.setText("");
            this.solutionTextArea.setText("");
            this.subPanelV1StructureTypeTextArea.setText("\n");
            this.subPanelV2StructureTypeTextArea.setText("\n");
            this.subPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: ");
        }
    }
    
    private void updateFile(ConflictFile file) {
        this.subPanelFileNameLabel.setText("File Name: " + file.getFileName());
        this.subPanelFileIndexLabel.setText(this.currentFileIndex + "/" + this.currentMaxFileIndex);
        this.currentFile = file;
        if (file.getConflictRegion() != null) {
            this.subPanelConflictIndexLabel.setText("1/" + file.getConflictRegion().size());
            this.currentConflictIndex = 1;
            this.currentMaxConflictIndex = file.getConflictRegion().size();
            this.conflictTextArea.setText(file.getConflictRegion().get(0).getConflictForm());
            this.solutionTextArea.setText(file.getConflictRegion().get(0).getSolutionForm());
            this.subPanelV1StructureTypeTextArea.setText(file.getConflictRegion().get(0).getV1StructureTypes() + "\n");
            this.subPanelV2StructureTypeTextArea.setText(file.getConflictRegion().get(0).getV2StructureTypes() + "\n");
            this.subPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: " + file.getConflictRegion().get(0).getDeveloperDecision());
            
        } else {
            this.subPanelConflictIndexLabel.setText("0/0");
            this.currentConflictIndex = 0;
            this.currentMaxConflictIndex = 0;
            this.conflictTextArea.setText(file.getFileName() + "has not been\nmerged as it has been renamed or deleted.");
            this.solutionTextArea.setText("Impossible to get the solution");
            this.subPanelV1StructureTypeTextArea.setText("\n");
            this.subPanelV2StructureTypeTextArea.setText("\n");
            this.subPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: ");
        }
    }
    
    private void updateRegion(ConflictRegion region) {
        this.subPanelConflictIndexLabel.setText(this.currentConflictIndex + "/" + this.currentMaxConflictIndex);
        this.conflictTextArea.setText(region.getConflictForm());
        this.solutionTextArea.setText(region.getSolutionForm());
        this.subPanelV1StructureTypeTextArea.setText(region.getV1StructureTypes() + "\n");
        this.subPanelV2StructureTypeTextArea.setText(region.getV2StructureTypes() + "\n");
        this.subPanelDeveloperDecisionTextArea.setText("DEVELOPER DECISION: " + region.getDeveloperDecision());
        
    }
    
}
