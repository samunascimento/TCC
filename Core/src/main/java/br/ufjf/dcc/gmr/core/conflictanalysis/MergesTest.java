package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;

public class MergesTest {
	private static String auxGetFileContentLinux(String folderPath, String file) throws IOException{
		CLIExecution cliE = CLIExecute.execute("ls -p",folderPath);
		String aux = "";
		if(cliE.getOutput().contains(file)) {
			folderPath = folderPath + file;
			return folderPath;
		} else {
			for(String line : cliE.getOutput()) {
				if(line.endsWith("/")) {
					aux = auxGetFileContentLinux(folderPath+line,file);
					if(aux != "")
						return aux;
				}
			}
		}
		return "";
	}
	private static void auxGetFileContentWindows(String folderPath, String file) throws IOException{

	}

	public static List<String> getFileContent(String folderPath, String fileName) throws IOException{
		List<String> content = new ArrayList<>();
		String path = "";
		if(folderPath.startsWith("C") || folderPath.startsWith("c") ) {
			
		} else {
			if(!folderPath.endsWith("/"))
				folderPath = folderPath + "/";
			path = auxGetFileContentLinux(folderPath,fileName);
		}
		if(path == "")
			return null;
		else {
			File file = new File(path);   
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			String st; 
			while ((st = br.readLine()) != null) 
				content.add(st);
		}
		return content;
		
	}
	
    public static void searchAllConflicts(String repositoryPath) throws IOException, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, InvalidCommitHash {
        
    	
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
        
        
        
        for (String merge : allMerges) {
            family = merge.split(",");
            mergeEvent.setHash(family[1]);
            parents = family[0].split(" ");
            for (String parent : parents) {
                mergeEvent.addParents(parent);
            }
            mergeEvent.setCommonAncestorOfParents(Git.mergeBaseCommand(repositoryPath, mergeEvent.getParents()));
            Git.checkout(mergeEvent.getParents().get(0), repositoryPath);
            if (Git.mergeIsConflicting(mergeEvent.getParents().get(1), repositoryPath, false, false)) {
                mergeEvent.setConflict(true);
                for (FileDiff fileDiff : Git.diff(repositoryPath, "", "", false)) {
                    auxArray = fileDiff.getFilePathSource().split("/");
                    conflictFile.setFileName(auxArray[auxArray.length - 1]);
                    conflict = getFileContent(repositoryPath,conflictFile.getFileName());
                    auxInt = conflict.size(); 
                    for(int i = 0; i < auxInt; i++) {
                        if (conflict.get(i).contains("<<<<<<")) {
                        	conflictRegion.setBeginLine(i+1);
                            i++;
                            while (!conflict.get(i).contains("=====")) {
                                conflictRegion.getV1().add(conflict.get(i));
                                i++;
                            }
                            conflictRegion.setSeparatorLine(i+1);
                            i++;
                            while (!conflict.get(i).contains(">>>>>")) {
                                conflictRegion.getV2().add(conflict.get(i));
                                i++;
                            }
                            conflictRegion.setEndLine(i+1);
                            conflictFile.addConflictRegion(conflictRegion);
                            conflictRegion = new ConflictRegion();
                        }
                    }
                    mergeEvent.addConflictFiles(conflictFile);
                    conflictFile = new ConflictFile();
                    conflict.clear();
                }
                Git.mergeAbort(repositoryPath);
            }
            Git.checkout("master", repositoryPath);
            mergeEvent.print();
            list.add(mergeEvent);
            mergeEvent = new MergeEvent();
            conflictFile = new ConflictFile();
            conflictRegion = new ConflictRegion();
        }
        
        

    }

}
