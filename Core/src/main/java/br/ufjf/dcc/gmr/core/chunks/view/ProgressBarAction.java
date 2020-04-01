/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.view;

import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.principal.InitProject;
import br.ufjf.dcc.gmr.core.vcs.types.Project;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author icout
 */
public class ProgressBarAction implements Runnable{

    /**
     * @return the project
     */
    public Project getProject() {
        return project;
    }

    /**
     * @param project the project to set
     */
    public void setProject(Project project) {
        this.project = project;
    }
    private JProgressBar progressBar;
    private String name;
    private String projectPath;
    private Project project;
    public ProgressBarAction(JProgressBar progressBar, String name, String projectPath){
        this.progressBar =  progressBar;
        this.name = name;
        this.projectPath = projectPath;
    }
    
    @Override
    public void run() {
        try {
            project = InitProject.createProject(name, projectPath);
        } catch (IOException | LocalRepositoryNotAGitRepository | ParseException | OptionNotExist | RepositoryNotFound | InvalidDocument | UnknownSwitch | RefusingToClean | IsOutsideRepository | CheckoutError | ThereIsNoMergeToAbort | NotSomethingWeCanMerge | NoRemoteForTheCurrentBranch | AlreadyUpToDate | ThereIsNoMergeInProgress ex) {
            Logger.getLogger(ProgressBarAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
