package br.ufjf.dcc.gmr.core.conflictanalysis.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.RepositoryAnalysis;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.CommitData;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictFile;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;

public class RepositoryAnalysisGUI extends javax.swing.JFrame {

    public List<MergeEvent> searchAllConflicts(String repositoryPath, int linesContext, boolean gui) throws IOException {

        //Main list
        List<MergeEvent> list = new ArrayList<>();

        //MergeEvent's field
        CommitData hash;
        List<CommitData> parents = new ArrayList<>();
        List<ConflictFile> conflictFiles = new ArrayList<>();
        CommitData commonAncestorOfParents;

        //ConflictFile's field
        String fileName;
        List<ConflictRegion> conflictRegion = new ArrayList<>();

        //ConflictRegion's field
        List<String> afterContext = new ArrayList<>();
        List<String> beforeContext = new ArrayList<>();
        List<String> v1 = new ArrayList<>();
        List<String> v2 = new ArrayList<>();
        int beginLine;
        int separatorLine;
        int endLine;

        //Assistants
        String[] auxArray;
        List<String> allFile;
        double progress;
        double analysed = 0.0;
        double analysedPercentage = 0.0;

        //Start
        try {
            //Getting all merges's hashes
            List<String> allMerges = Git.giveAllMerges(repositoryPath);

            //Scanning and processing the hash list
            for (String merge : allMerges) {
                
                //Getting hash from merge
                auxArray = merge.split(",");
                hash = new CommitData(auxArray[1], repositoryPath);

                //Getting parents from merge
                for (String parent : auxArray[0].split(" ")){
                    parents.add(new CommitData(parent, repositoryPath));
                }

                //Getting commonAncestorOfParents from parents's array
                commonAncestorOfParents = new CommitData(Git.mergeBaseCommand(repositoryPath, Arrays.asList(merge.split(",")[0].split(" "))), repositoryPath);

                //Moving to first parent
                Git.checkout(parents.get(0).getCommitHash(), repositoryPath);

                //Checking if merge is a conflcit 
                if (Git.mergeIsConflicting(parents.get(1).getCommitHash(), repositoryPath, false, false)) {
                    
                    //Processing conflcit
                    for (FileDiff fileDiff : Git.diff(repositoryPath, "", "", false)) {
                        //
                        if (!fileDiff.getLines().isEmpty()) {
                            //Getting file name ("if" to differentiate the operating system: CMD and Linux)
                            if (fileDiff.getFilePathSource().contains("/")) {
                                auxArray = fileDiff.getFilePathSource().split("/");
                            } else {
                                auxArray = fileDiff.getFilePathSource().split("\\");
                            }
                            fileName = auxArray[auxArray.length - 1];

                            //Getting conflcit file content
                            allFile = RepositoryAnalysis.getFileContent(repositoryPath + fileDiff.getFilePathSource());

                            ////Geting conflict regions from conflict file
                            for (int i = 0; i < allFile.size(); i++) {
                                if (allFile.get(i).contains("<<<<<<")) {
                                    beginLine = i + 1;
                                    for (int j = i - linesContext; j < i; j++) {
                                        if (j < 0) {
                                            j = 1;
                                        } else {
                                            beforeContext.add(allFile.get(j));
                                        }
                                    }
                                    i++;
                                    while (!allFile.get(i).contains("=====")) {
                                        v1.add(allFile.get(i));
                                        i++;
                                    }
                                    separatorLine = i + 1;
                                    i++;
                                    while (!allFile.get(i).contains(">>>>>")) {
                                        v2.add(allFile.get(i));
                                        i++;
                                    }
                                    endLine = i + 1;
                                    for (int j = i + 1; j < i + 1 + linesContext; j++) {
                                        if (j == allFile.size()) {
                                            break;
                                        } else {
                                            afterContext.add(allFile.get(j));
                                        }
                                    }
                                    //Adding a new conflict region
                                    conflictRegion.add(new ConflictRegion(beforeContext, afterContext, v1, v2, beginLine, separatorLine, endLine));

                                    //Reseting variables
                                    beforeContext.clear();
                                    afterContext.clear();
                                    v1.clear();
                                    v2.clear();
                                }
                            }

                            //Adding a new list of conflcit regions
                            conflictFiles.add(new ConflictFile(fileName, conflictRegion));

                            //Reseting conflictRegion
                            conflictRegion.clear();

                        }

                        //Search and getting special types of conflcit
                        for (String line : fileDiff.getAllMessage()) {
                            if (line.startsWith("* Unmerged path")) {
                                auxArray = line.split("/");
                                conflictFiles.add(new ConflictFile(auxArray[auxArray.length - 1], null));
                            }
                        }

                    }

                    //Aborting conflictuos merge
                    Git.mergeAbort(repositoryPath);

                }

                //Return to master and reseting repository
                Git.checkout("master", repositoryPath);
                Git.reset(repositoryPath, true, false, false, null);
                Git.clean(repositoryPath, true, 0);

                //Adding merge event in list
                list.add(new MergeEvent(hash, parents, conflictFiles, commonAncestorOfParents));

                //Reseting conflict files and parents
                conflictFiles.clear();
                parents.clear();

                //Progress
                progress = Math.ceil((analysed / allMerges.size()) * 100);
                if (progress > analysedPercentage) {
                    if (gui) {

                    } else {
                        System.out.println((int) progress + "%...");
                    }
                    analysedPercentage = progress;
                }
                analysed = analysed + 1.0;
                
            }
        } catch (CheckoutError ex) {
            System.out.println("ERROR: CheckoutError error!");
            throw new IOException();
        } catch (NoRemoteForTheCurrentBranch ex) {
            System.out.println("ERROR: NoRemoteForTheCurrentBranch error!");
            throw new IOException();
        } catch (ThereIsNoMergeInProgress ex) {
            System.out.println("ERROR: ThereIsNoMergeInProgress error!");
            throw new IOException();
        } catch (ThereIsNoMergeToAbort ex) {
            System.out.println("ERROR: ThereIsNoMergeToAbort error!");
            throw new IOException();
        } catch (AlreadyUpToDate ex) {
            System.out.println("ERROR: AlreadyUpToDate error!");
            throw new IOException();
        } catch (NotSomethingWeCanMerge ex) {
            System.out.println("ERROR: NotSomethingWeCanMerge error!");
            throw new IOException();
        } catch (InvalidCommitHash ex) {
            System.out.println("ERROR: InvalidCommitHash error!");
            throw new IOException();
        } catch (UnknownSwitch ex) {
            System.out.println("ERROR: UnknownSwitch error!");
            throw new IOException();
        } catch (RefusingToClean ex) {
            System.out.println("ERROR: RefusingToClean error!");
            throw new IOException();
        } catch (IsOutsideRepository ex) {
            System.out.println("ERROR: IsOutsideRepository error!");
            throw new IOException();
        } catch (InvalidDocument ex) {
            System.out.println("ERROR: InvalidDocument error!");
            throw new IOException();
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("ERROR: LocalRepositoryNotAGitRepository error!");
            throw new IOException();
        } catch (IOException ex) {
            throw new IOException();
        }

        return list;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPanel = new javax.swing.JPanel();
        repositoryPathTF = new javax.swing.JTextField();
        repositoryPathL = new javax.swing.JLabel();
        chooseFileB = new javax.swing.JButton();
        analyseB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        progressBar = new javax.swing.JProgressBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        outputPanel = new javax.swing.JPanel();
        scrollPaneOutput = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        repositoryPathL.setText("RepositoryPath");

        chooseFileB.setText("Choose File");
        chooseFileB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseFileBMouseClicked(evt);
            }
        });
        chooseFileB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileBActionPerformed(evt);
            }
        });

        analyseB.setText("Analyse");
        analyseB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analyseBMouseClicked(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Date", "Hash", "Conflict"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setToolTipText("");
        table.setName(""); // NOI18N
        jScrollPane1.setViewportView(table);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Number of Context Lines");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(repositoryPathTF)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addComponent(repositoryPathL)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(chooseFileB)
                                .addGap(218, 218, 218)))
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(analyseB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repositoryPathL)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repositoryPathTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseFileB)
                    .addComponent(analyseB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        textArea.setColumns(20);
        textArea.setRows(5);
        scrollPaneOutput.setViewportView(textArea);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outputPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPaneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        menu.add(jMenu1);

        jMenu2.setText("Edit");
        menu.add(jMenu2);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(outputPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analyseBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyseBMouseClicked
        if (repositoryPathTF.getText().isEmpty()) {

        } else {

        }
    }//GEN-LAST:event_analyseBMouseClicked
    private void chooseFileBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseFileBMouseClicked
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int check = jfc.showOpenDialog(null);
        if (check == JFileChooser.APPROVE_OPTION) {
            repositoryPathTF.setText(jfc.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_chooseFileBMouseClicked

    private void chooseFileBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseFileBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyseB;
    private javax.swing.JButton chooseFileB;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel repositoryPathL;
    private javax.swing.JTextField repositoryPathTF;
    private javax.swing.JScrollPane scrollPaneOutput;
    private javax.swing.JTable table;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
