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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class RepositoryAnalysisGUI extends javax.swing.JFrame {

    private List<MergeEvent> currentList = null;
    private MergeEvent currentMerge = null;
    private ConflictFile currentFile = null;
    private int currentFileIndex = 0;
    private int currentConflictIndex = 0;
    private int currentMaxFileIndex = 0;
    private int currentMaxConflictIndex = 0;

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

            //Progress Bar of GUI
            if (gui) {
                this.progressBar.setStringPainted(true);    
            }

            //Scanning and processing the hash list
            for (String merge : allMerges) {

                //Getting hash from merge
                auxArray = merge.split(",");
                hash = new CommitData(auxArray[1], repositoryPath);

                //Getting parents from merge
                for (String parent : auxArray[0].split(" ")) {
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

                            //Geting conflict regions from conflict file
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
                                    conflictRegion.add(new ConflictRegion(new ArrayList<>(beforeContext), new ArrayList<>(afterContext), new ArrayList<>(v1), new ArrayList<>(v2), beginLine, separatorLine, endLine));

                                    //Reseting variables
                                    beforeContext.clear();
                                    afterContext.clear();
                                    v1.clear();
                                    v2.clear();
                                }
                            }

                            //Adding a new list of conflcit regions
                            conflictFiles.add(new ConflictFile(fileName, new ArrayList<>(conflictRegion)));

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
                list.add(new MergeEvent(hash, new ArrayList<>(parents), new ArrayList<>(conflictFiles), commonAncestorOfParents));

                //Reseting conflict files and parents
                conflictFiles.clear();
                parents.clear();

                //Progress
                progress = Math.ceil((analysed / allMerges.size()) * 100);
                if (progress > analysedPercentage) {
                    if (gui) {
                        this.progressBar.setValue((int)progress);
                    }
                    System.out.println((int) progress + "%...");
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
    public void initGUI() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RepositoryAnalysisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepositoryAnalysisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepositoryAnalysisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepositoryAnalysisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initComponents();
                setVisible(true);
            }
        });
    }
    private void changeInfo(MergeEvent merge) {
        this.currentMerge = merge;
        this.info.setText("Commit\n"
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
                this.output.setText(merge.getConflictFiles().get(0).getConflictRegion().get(0).getForm());
            } else {
                this.conflictIndexLabel.setText("0/0");
                this.currentConflictIndex = 0;
                this.currentMaxConflictIndex = 0;
                this.output.setText(merge.getConflictFiles().get(0).getFileName() + "has not been\nmerged as it has been renamed or deleted.");
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
            
            this.output.setText("");
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
            this.output.setText(file.getConflictRegion().get(0).getForm());
        } else {
            this.conflictIndexLabel.setText("0/0");
            this.currentConflictIndex = 0;
            this.currentMaxConflictIndex = 0;
            this.output.setText(file.getFileName() + "has not been\nmerged as it has been renamed or deleted.");
        }
    }
    private void updateRegion(ConflictRegion region){
        this.conflictIndexLabel.setText(this.currentConflictIndex + "/" + this.currentMaxConflictIndex);
        this.output.setText(region.getForm());
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        inputPanel = new javax.swing.JPanel();
        repositoryPathLabel = new javax.swing.JLabel();
        findDirectoryButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        numLinesBox = new javax.swing.JComboBox<>();
        numContextLabel = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        analyseButton = new javax.swing.JButton();
        changeFile = new javax.swing.JPanel();
        previousFileButton = new javax.swing.JButton();
        nextFileButton = new javax.swing.JButton();
        fileIndexLabel = new javax.swing.JLabel();
        fileNameLabel = new javax.swing.JLabel();
        nextConflictButton = new javax.swing.JButton();
        previousConflictButton = new javax.swing.JButton();
        conflictIndexLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Git Repository Analysis");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title ", "Date", "Hash", "Conflict"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        repositoryPathLabel.setText("Repository Path:");

        findDirectoryButton.setText("Find Directory");
        findDirectoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findDirectoryButtonMouseClicked(evt);
            }
        });

        numLinesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 Lines", "1 Line", "2 Lines", "3 Lines", "4 Lines", "5 Lines", "6 Lines", "7 Lines", "8 Lines", "9 Lines", "10 Lines" }));

        numContextLabel.setText("Number of Context Lines");

        textField.setEditable(false);

        analyseButton.setText("Analyse");
        analyseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analyseButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(findDirectoryButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                        .addComponent(analyseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numLinesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                        .addComponent(repositoryPathLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numContextLabel)))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repositoryPathLabel)
                    .addComponent(numContextLabel))
                .addGap(1, 1, 1)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLinesBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findDirectoryButton)
                    .addComponent(analyseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        previousFileButton.setText("Previous File");
        previousFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousFileButtonMouseClicked(evt);
            }
        });

        nextFileButton.setText("Next File");
        nextFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextFileButtonMouseClicked(evt);
            }
        });

        fileIndexLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileIndexLabel.setText("0/0");

        fileNameLabel.setText("File Name: ");

        nextConflictButton.setText("Next Conflict");
        nextConflictButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextConflictButtonMouseClicked(evt);
            }
        });

        previousConflictButton.setText("Previous Conflcit");
        previousConflictButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousConflictButtonMouseClicked(evt);
            }
        });

        conflictIndexLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conflictIndexLabel.setText("0/0");

        javax.swing.GroupLayout changeFileLayout = new javax.swing.GroupLayout(changeFile);
        changeFile.setLayout(changeFileLayout);
        changeFileLayout.setHorizontalGroup(
            changeFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeFileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changeFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeFileLayout.createSequentialGroup()
                        .addComponent(fileNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(changeFileLayout.createSequentialGroup()
                        .addComponent(previousFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fileIndexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(previousConflictButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conflictIndexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextConflictButton)))
                .addContainerGap())
        );
        changeFileLayout.setVerticalGroup(
            changeFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeFileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousFileButton)
                    .addComponent(fileIndexLabel)
                    .addComponent(nextFileButton)
                    .addComponent(nextConflictButton)
                    .addComponent(previousConflictButton)
                    .addComponent(conflictIndexLabel))
                .addContainerGap())
        );

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane2.setViewportView(output);

        info.setEditable(false);
        info.setColumns(20);
        info.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        info.setRows(5);
        info.setText("Commit\n Title:\n Hash:\n Author:\n Author Date:\n Committer:\n Committer Date:\n\nParent 1\n Title:\n Hash:\n Author:\n Author Date:\n Committer:\n Committer Date:\n\nParent 2\n Title:\n Hash:\n Author:\n Author Date:\n Committer:\n Committer Date:");
        jScrollPane3.setViewportView(info);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void findDirectoryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findDirectoryButtonMouseClicked
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int check = jfc.showOpenDialog(null);
        if (check == JFileChooser.APPROVE_OPTION) {
            this.textField.setText(jfc.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_findDirectoryButtonMouseClicked
    private void analyseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyseButtonMouseClicked
        if (this.textField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please, choose a directory!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (JOptionPane.showConfirmDialog(null, "Analyse " + this.textField.getText() + " ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            try {
                this.currentList = this.searchAllConflicts(this.textField.getText(), this.numLinesBox.getSelectedIndex(), true);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "The selected directory is not a git repository.\nPlease, choose a new directory!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DefaultTableModel model = (DefaultTableModel) this.table.getModel();
            for (MergeEvent merge : this.currentList) {
                model.addRow(new Object[]{merge.getHash().getTitle(),
                    merge.getHash().getCommitterDate(),
                    merge.getHash().getCommitHash(),
                    merge.isConflict()
                });
            }
            this.changeInfo(this.currentList.get(0));
            this.updateFileChangeByMerge(currentList.get(0));
            this.currentMerge = currentList.get(0);

        }
    }//GEN-LAST:event_analyseButtonMouseClicked
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() > 1) {
            MergeEvent merge = this.currentList.get(this.table.getSelectedRow());
            this.changeInfo(merge);
            this.updateFileChangeByMerge(merge);
            this.currentMerge = merge;
        }
    }//GEN-LAST:event_tableMouseClicked
    private void nextFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextFileButtonMouseClicked
        if (this.currentMaxFileIndex != 0 && this.currentMaxFileIndex != 1) {
            if (this.currentFileIndex == this.currentMaxFileIndex) {
                this.currentFileIndex = 1;
            } else {
                this.currentFileIndex = this.currentFileIndex + 1;
            }
            updateFile(this.currentMerge.getConflictFiles().get( this.currentFileIndex - 1));
        }
    }//GEN-LAST:event_nextFileButtonMouseClicked
    private void previousFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousFileButtonMouseClicked
        if (this.currentMaxFileIndex != 0 && this.currentMaxFileIndex != 1) {
            if (this.currentFileIndex == 1) {
                this.currentFileIndex = this.currentMaxFileIndex;
            } else {
                this.currentFileIndex = this.currentFileIndex - 1;
            }
            updateFile(this.currentMerge.getConflictFiles().get( this.currentFileIndex - 1));
        }
    }//GEN-LAST:event_previousFileButtonMouseClicked
    private void previousConflictButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousConflictButtonMouseClicked
        if (this.currentMaxConflictIndex != 0 && this.currentMaxConflictIndex != 1) {
            if (this.currentConflictIndex == 1) {
                this.currentConflictIndex = this.currentMaxConflictIndex;
            } else {
                this.currentConflictIndex = this.currentConflictIndex - 1;
            }
            this.updateRegion(this.currentFile.getConflictRegion().get(this.currentConflictIndex - 1));
        }
    }//GEN-LAST:event_previousConflictButtonMouseClicked
    private void nextConflictButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextConflictButtonMouseClicked
        if (this.currentMaxConflictIndex != 0 && this.currentMaxConflictIndex != 1) {
            if (this.currentConflictIndex == this.currentMaxConflictIndex) {
                this.currentConflictIndex = 1;
            } else {
                this.currentConflictIndex = this.currentConflictIndex + 1;
            }
            this.updateRegion(this.currentFile.getConflictRegion().get(this.currentConflictIndex - 1));
        }
    }//GEN-LAST:event_nextConflictButtonMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyseButton;
    private javax.swing.JPanel changeFile;
    private javax.swing.JLabel conflictIndexLabel;
    private javax.swing.JLabel fileIndexLabel;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JButton findDirectoryButton;
    private javax.swing.JTextArea info;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nextConflictButton;
    private javax.swing.JButton nextFileButton;
    private javax.swing.JLabel numContextLabel;
    private javax.swing.JComboBox<String> numLinesBox;
    private javax.swing.JTextArea output;
    private javax.swing.JButton previousConflictButton;
    private javax.swing.JButton previousFileButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel repositoryPathLabel;
    private javax.swing.JTable table;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
