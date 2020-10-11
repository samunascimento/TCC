/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.chunks.view.View;
import br.ufjf.dcc.gmr.core.exception.*;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.*;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felip
 *
 */
public class InitProject implements Runnable {

    JProgressBar progressBar = new JProgressBar();
    int progress;
    String name;
    String projectPath;
    View view;

    public InitProject(View view, String name, String projectPath) {
        this.progressBar = view.getProgressBar();
        this.progressBar.setMinimum(1);
        this.progressBar.setVisible(true);

        this.progress = 0;
        this.name = name;
        this.projectPath = projectPath;
        this.view = view;
    }

    public InitProject() {

    }

    private static List<String> readFile(String filePath) {

        List<String> content = new ArrayList<>();
        String linha;

        try {

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            while ((linha = br.readLine()) != null) {
                content.add(linha);
            }
        } catch (IOException e) {
            System.out.println("filePath: " + filePath);
            e.printStackTrace();
        }

        return content;
    }

    private static List<ConflictChunk> createConflictChunksList(String filePath) {

        List<ConflictChunk> result = new ArrayList<>();
        ConflictChunk chunk = new ConflictChunk();

        List<String> content = readFile(filePath);

        int chunkNumber = 0;

        for (int i = 0; i < content.size(); i++) {

            if (content.get(i).startsWith("<<<<<<<")) {
                chunk = new ConflictChunk();
                chunk.setBegin(new Line(ListUtils.getSubList(content, i, i), i + 1));
            }

            if (content.get(i).startsWith("=======")) {
                chunk.setSeparator(new Line(ListUtils.getSubList(content, i, i), i + 1));
            }

            if (content.get(i).startsWith(">>>>>>>")) {
                chunk.setEnd(new Line(ListUtils.getSubList(content, i, i), i + 1));
                chunk.setErrorContent(ListUtils.getSubList(content, chunk.getBegin().getLineNumber() - 1, chunk.getEnd().getLineNumber() - 1));
                chunk.setPath(filePath);
                chunk.setLabel("CC" + (++chunkNumber));
                result.add(chunk);
            }
        }
        return result;
    }

    private static MyFile updateFile(MyFile file) {

        MyFile result = file;
        result.setType(null);
        result.setChuncks(createConflictChunksList(result.getPath()));
        result.setContent(readFile(result.getPath()));
        return result;
    }

    public static Version updateVersion(String pathProject, Version version) throws LocalRepositoryNotAGitRepository, OptionNotExist, IOException, RepositoryNotFound, InvalidDocument, UnknownSwitch, RefusingToClean, IsOutsideRepository, CheckoutError, ThereIsNoMergeToAbort, ThereIsNoMergeToAbort, NotSomethingWeCanMerge, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, AlreadyUpToDate, NotSomethingWeCanMerge {

        Version result = version;

        if (result.getParent().size() == 2) {

            String firstParent = result.getParent().get(0);
            String secondParent = result.getParent().get(1);

            Git.reset(pathProject, true, false, false, null);
            Git.clean(pathProject, true, 0);
            Git.checkout(firstParent, pathProject);

            if (Git.isFailedMerge(pathProject, firstParent, secondParent)) {

                List<MyFile> statusUnmerged = Git.statusUnmerged(pathProject);

                for (MyFile file : statusUnmerged) {
                    while (file.getPath().startsWith(" ")) {
                        file.setPath(file.getPath().replaceFirst(" ", ""));
                    }
                    file.setPath(pathProject.concat(File.separator).concat(file.getPath()));
                    result.getFile().add(updateFile(file));
                }

                result.setStatus(MergeStatus.CONFLICT);

            } else {
                result.setStatus(MergeStatus.NON_CONFLICT);
            }

        } else {
            result.setMerge(false);
            result.setStatus(MergeStatus.NON_CONFLICT);
        }

        result.setCommiter(null);

        return result;
    }

    @Override
    public void run() {

        Project result = new Project();
        result.setName(this.name);
        result.setPath(this.projectPath);

        List<Version> versions = null;
        try {
            progressBar.setIndeterminate(true);
            versions = Git.logAllVersion(this.projectPath);
            progressBar.setIndeterminate(false);
        } catch (IOException | RepositoryNotFound | LocalRepositoryNotAGitRepository | ParseException | OptionNotExist ex) {
            Logger.getLogger(InitProject.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.progressBar.setMaximum(versions.size());

        for (Version version : versions) {

            try {
                version = updateVersion(this.projectPath, version);
            } catch (LocalRepositoryNotAGitRepository | OptionNotExist | IOException | RepositoryNotFound | InvalidDocument | UnknownSwitch | RefusingToClean | IsOutsideRepository | CheckoutError | ThereIsNoMergeToAbort | NotSomethingWeCanMerge | NoRemoteForTheCurrentBranch | ThereIsNoMergeInProgress | AlreadyUpToDate ex) {
                Logger.getLogger(InitProject.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.view.getProgressBar().setValue(this.progress++);

        }

        result.setVersions(versions);
        view.setProject(result);
        DefaultTableModel model = (DefaultTableModel) this.view.getTable().getModel();
        for (int i = 0; i < versions.size(); i++) {
            Version version = versions.get(i);
            model.addRow(new String[]{version.getSHA(), version.getStatus().toString()});
        }

        this.view.getTable().setModel(model);
        
        this.view.getSplitPane().setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        this.view.getSplitPane().setLeftComponent(this.view.getLeftPanel());
        this.view.getSplitPane().setRightComponent(this.view.getRightPanel());
        this.view.add(this.view.getSplitPane());
        this.view.getSplitPane().setDividerSize(5);

        this.view.getSplitPaneInside().setOrientation(JSplitPane.VERTICAL_SPLIT);
        this.view.getSplitPaneInside().setLeftComponent(new JScrollPane(this.view.getTable()));
        this.view.getSplitPaneInside().setRightComponent(this.view.getTreePane());
        this.view.getLeftPanel().add(this.view.getSplitPaneInside());
        this.view.getSplitPaneInside().setDividerSize(5);
        this.view.getSplitPaneInside().setDividerLocation(750);

        if (this.view.getProject().getVersions().size() > 0) {
            this.view.getLeftPanel().setVisible(true);
            this.view.getRightPanel().setVisible(true);
        } else {
            this.view.getRightPanel().setVisible(true);
            this.view.getTextArea().setText("Empty Project");
            this.view.getTextArea().setFont(new Font(null, 1, 15));
        }
        this.view.getProgressBar().setVisible(false);
        this.view.getLeftPanel().setVisible(true);

    }

}
