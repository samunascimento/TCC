package br.ufjf.dcc.gmr.core.conflictanalysis;

import br.ufjf.dcc.gmr.core.conflictanalysis.models.ConflictFile;
import br.ufjf.dcc.gmr.core.conflictanalysis.models.ConflictRegion;
import br.ufjf.dcc.gmr.core.conflictanalysis.models.MergeEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
import java.util.logging.Level;
import java.util.logging.Logger;

public class MergesTest {

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

    public static List<MergeEvent> searchAllConflicts(String repositoryPath, int linesContext, boolean printProgress) throws IOException, 
            LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, 
            ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, InvalidCommitHash {

        List<String> allMerges = Git.giveAllMerges(repositoryPath);
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
            mergeEvent.setHash(family[1]);
            parents = family[0].split(" ");
            for (String parent : parents) {
                mergeEvent.addParents(parent);
            }
            mergeEvent.setCommonAncestorOfParents(Git.mergeBaseCommand(repositoryPath, mergeEvent.getParents()));
            try {
                Git.reset(repositoryPath, true, false, false, null);
                Git.clean(repositoryPath, true, 0);
            } catch (InvalidDocument ex) {
                Logger.getLogger(MergesTest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownSwitch ex) {
                Logger.getLogger(MergesTest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RefusingToClean ex) {
                Logger.getLogger(MergesTest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IsOutsideRepository ex) {
                Logger.getLogger(MergesTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            Git.checkout(mergeEvent.getParents().get(0), repositoryPath);
            if (Git.mergeIsConflicting(mergeEvent.getParents().get(1), repositoryPath, false, false)) {
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
                                for(int j = i - linesContext; j < i;j++){
                                    if(j<0)
                                        j=-1;
                                    else
                                        conflictRegion.getAfterContext().add(conflict.get(j));
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
                                for (int j = i+1; j < i+1+linesContext ; j++) {
                                    if (j == conflict.size())
                                        break;
                                    else
                                        conflictRegion.getBeforeContext().add(conflict.get(j));
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
            
            if(printProgress){
                progress = Math.ceil((analysed/allMerges.size())*100);
                if(progress > analysedPercentage){
                    System.out.println((int)progress + "%...");
                   analysedPercentage = progress;
                }
                analysed = analysed + 1.0;
            }
            
        }
        return list;
    }

}
