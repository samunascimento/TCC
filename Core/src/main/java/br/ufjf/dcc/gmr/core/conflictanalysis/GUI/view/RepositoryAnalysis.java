package br.ufjf.dcc.gmr.core.conflictanalysis.GUI.view;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class RepositoryAnalysis extends javax.swing.JFrame  {
    
    public RepositoryAnalysis() {
        initComponents();
    }
    
    private void setProgressBarStatus(int status){
        progressBar.setValue(status);
        progressBar.setString(status + "%");
    }
    
      public static List<String> getFileContent(String folderPath) throws IOException {
        List<String> content = new ArrayList<>();
        File file = new File(folderPath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            content.add(st);
        }
        return content;

    }

    public static List<SyntaxStructure> analyzeJavaSyntaxTree(String filePath) throws IOException {

        ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
        JavaLexer lexer = new JavaLexer(fileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        JavaVisitor visitor = new JavaVisitor();
        visitor.visit(tree);

        return visitor.getList();
    }

    public static List<SyntaxStructure> getStructureTypeInInterval(String filePath, int start, int stop) throws IOException {
        List<SyntaxStructure> list = new ArrayList<>();
        for (SyntaxStructure ss : analyzeJavaSyntaxTree(filePath)) {
            if (ss.isOneLine() && ss.getStart().getLine() >= start && ss.getStop().getLine() <= stop) {
                start = ss.getStart().getLine() + 1;
                list.add(ss);
            }
            if (start > stop) {
                break;
            }
        }
        return list;
    }

    public static List<SyntaxStructure> getStructureTypeInInterval(List<SyntaxStructure> main, int start, int stop) throws IOException {
        List<SyntaxStructure> list = new ArrayList<>();
        for (SyntaxStructure ss : main) {
            if (ss.isOneLine() && ss.getStart().getLine() >= start && ss.getStop().getLine() <= stop) {
                start = ss.getStart().getLine() + 1;
                list.add(ss);
            }
            if (start > stop) {
                break;
            }
        }
        return list;
    }

    public static List<MergeEvent> searchAllConflicts(String repositoryPath, int linesContext, boolean gui) throws IOException {
        
        List<String> allMerges = null;
        String[] family = null;
        String[] parents = null;
        String[] auxArray = null;
        MergeEvent mergeEvent = new MergeEvent();
        List<MergeEvent> list = new ArrayList<>();
        ConflictFile conflictFile = new ConflictFile();
        ConflictRegion conflictRegion = new ConflictRegion();
        List<String> conflict = new ArrayList<>();
        int auxInt = 0;
        int soType = -1;
        double analysed = 1.0;
        double analysedPercentage = 0.0;
        double progress = 0.0;

        try {
            allMerges = Git.giveAllMerges(repositoryPath);
            if (repositoryPath.contains("\\")) {
                soType = 1;
                if (!repositoryPath.endsWith("\\")) {
                    repositoryPath = repositoryPath + "\\";
                }
            } else if (repositoryPath.contains("/")) {
                soType = 0;
                if (!repositoryPath.endsWith("/")) {
                    repositoryPath = repositoryPath + "/";
                }
            }
            for (String merge : allMerges) {
                family = merge.split(",");
                mergeEvent.setHash(new CommitData(family[1], repositoryPath));
                parents = family[0].split(" ");
                for (String parent : parents) {
                    mergeEvent.addParents(new CommitData(parent, repositoryPath));
                }
                mergeEvent.setCommonAncestorOfParents(new CommitData(Git.mergeBaseCommand(repositoryPath, Arrays.asList(parents)), repositoryPath));
                Git.reset(repositoryPath, true, false, false, null);
                Git.clean(repositoryPath, true, 0);
                Git.checkout(mergeEvent.getParents().get(0).getCommitHash(), repositoryPath);
                if (Git.mergeIsConflicting(mergeEvent.getParents().get(1).getCommitHash(), repositoryPath, false, false)) {
                    mergeEvent.setConflict(true);
                    for (FileDiff fileDiff : Git.diff(repositoryPath, "", "", false)) {
                        if (!fileDiff.getLines().isEmpty()) {
                            switch (soType) {
                                case 0:
                                    auxArray = fileDiff.getFilePathSource().split("/");
                                    break;
                                case 1:
                                    auxArray = fileDiff.getFilePathSource().split("\\");
                                    break;
                            }
                            conflictFile.setFileName(auxArray[auxArray.length - 1]);
                            conflict = getFileContent(repositoryPath + fileDiff.getFilePathSource());
                            auxInt = conflict.size();
                            for (int i = 0; i < auxInt; i++) {
                                if (conflict.get(i).contains("<<<<<<")) {
                                    conflictRegion.setBeginLine(i + 1);
                                    for (int j = i - linesContext; j < i; j++) {
                                        if (j < 0) {
                                            j = -1;
                                        } else {
                                            conflictRegion.getBeforeContext().add(conflict.get(j));
                                        }
                                    }
                                    i++;
                                    while (!conflict.get(i).contains("=====")) {
                                        conflictRegion.getV1().add(conflict.get(i));
                                        i++;
                                    }
                                    conflictRegion.setSeparatorLine(i + 1);
                                    i++;
                                    while (!conflict.get(i).contains(">>>>>")) {
                                        conflictRegion.getV2().add(conflict.get(i));
                                        i++;
                                    }
                                    conflictRegion.setEndLine(i + 1);
                                    for (int j = i + 1; j < i + 1 + linesContext; j++) {
                                        if (j == conflict.size()) {
                                            break;
                                        } else {
                                            conflictRegion.getAfterContext().add(conflict.get(j));
                                        }
                                    }
                                    conflictFile.addConflictRegion(conflictRegion);
                                    conflictRegion = new ConflictRegion();
                                }
                            }
                            mergeEvent.addConflictFiles(conflictFile);
                            conflictFile = new ConflictFile();
                            conflict.clear();
                        }
                        for (String line : fileDiff.getAllMessage()) {
                            if (line.startsWith("* Unmerged path")) {
                                auxArray = line.split("/");
                                conflictFile.setFileName(auxArray[auxArray.length - 1]);
                                mergeEvent.addConflictFiles(conflictFile);
                                conflictFile = new ConflictFile();
                            }
                        }
                    }
                    Git.mergeAbort(repositoryPath);
                }
                Git.checkout("master", repositoryPath);
                list.add(mergeEvent);
                mergeEvent = new MergeEvent();
                conflictFile = new ConflictFile();
                conflictRegion = new ConflictRegion();
                progress = Math.ceil((analysed / allMerges.size()) * 100);
                if (progress > analysedPercentage) {
                    if(gui){

                    } else {
                        System.out.println((int) progress + "%...");
                    }
                    analysedPercentage = progress;
                }
                analysed = analysed + 1.0;
            }
        } catch (CheckoutError ex) {
            System.out.println("ERROR: CheckoutError error!");
        } catch (NoRemoteForTheCurrentBranch ex) {
            System.out.println("ERROR: NoRemoteForTheCurrentBranch error!");
        } catch (ThereIsNoMergeInProgress ex) {
            System.out.println("ERROR: ThereIsNoMergeInProgress error!");
        } catch (ThereIsNoMergeToAbort ex) {
            System.out.println("ERROR: ThereIsNoMergeToAbort error!");
        } catch (AlreadyUpToDate ex) {
            System.out.println("ERROR: AlreadyUpToDate error!");
        } catch (NotSomethingWeCanMerge ex) {
            System.out.println("ERROR: NotSomethingWeCanMerge error!");
        } catch (InvalidCommitHash ex) {
            System.out.println("ERROR: InvalidCommitHash error!");
        } catch (UnknownSwitch ex) {
            System.out.println("ERROR: UnknownSwitch error!");
        } catch (RefusingToClean ex) {
            System.out.println("ERROR: RefusingToClean error!");
        } catch (IsOutsideRepository ex) {
            System.out.println("ERROR: IsOutsideRepository error!");
        } catch (InvalidDocument ex) {
            System.out.println("ERROR: InvalidDocument error!");
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("ERROR: LocalRepositoryNotAGitRepository error!");
        } catch (IOException ex) {
            throw new IOException();
        }
        return list;
    }

    public static int returnNewLineNumber(String directory, String commitSource, String commitTarget, int originalLineNumber) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        //Verificar se a linha existe no arquivo original, e se existir
        List<String> output = new ArrayList<>();

        int counter = 0;
        output = Git.auxiliardiff(directory, commitSource, commitTarget);
        for (String line : output) {
            if (line.charAt(0) == '@' && line.charAt(1) == '@') {
                String c = line.substring(5);

            }

        }

        return 0;

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

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repositoryPathTF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inputPanelLayout.createSequentialGroup()
                        .addComponent(chooseFileB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(analyseB))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inputPanelLayout.createSequentialGroup()
                        .addComponent(repositoryPathL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(repositoryPathL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repositoryPathTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    }//GEN-LAST:event_analyseBMouseClicked
    private void chooseFileBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseFileBMouseClicked
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int check = jfc.showOpenDialog(null);
        if(check == JFileChooser.APPROVE_OPTION){
            repositoryPathTF.setText(jfc.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_chooseFileBMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyseB;
    private javax.swing.JButton chooseFileB;
    private javax.swing.JPanel inputPanel;
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
