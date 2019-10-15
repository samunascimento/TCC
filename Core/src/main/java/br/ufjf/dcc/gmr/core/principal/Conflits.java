package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author ice
 */
public class Conflits {
    
    public static List <Formats> getMerges(String repository) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, OptionNotExist{
        List <Formats> merge =  Git.logMerge(repository);
        //List <String> output = new ArrayList<>();
        //output = Git.logSimple(repository);
        //String pais[][] = new String[merge.size()][merge.size()];
        String biggestAuthorName = merge.get(0).getAuthorName();
        String spaceAux = new String();
        
        System.out.print("||||||||||||||||||||||||||||MERGES||||||||||||||||||||||||||\n");
        for(int i = 1; i < merge.size(); i++){
            if(biggestAuthorName.length() < merge.get(i).getAuthorName().length()){
                biggestAuthorName = merge.get(i).getAuthorName();
            }
        }
        for(int i=0;i<merge.size(); i++){
            System.out.print(merge.get(i).getAuthorName());
            //calculates how much blank spaces are needed for the formatation be correct 
            for(int j = 0; j < biggestAuthorName.length() - merge.get(i).getAuthorName().length(); j++){
                spaceAux += " ";
            }
            System.out.print(spaceAux + " || " );
            spaceAux = "";            
            System.out.print(merge.get(i).getCommitHash());
            System.out.print(" || " );
            List<String> parents = Git.parent(repository, merge.get(i).getCommitHash());
            System.out.print(parents);
            System.out.print(" || " );
            System.out.print(merge.get(i).getAuthorDate());
            System.out.print(" || " );
            System.out.println(merge.get(i).getCommitDescription());
        }  
                  
           return merge;       
        
    }
    
    public static void getConflits(List<Formats> mergeList, String repository) throws LocalRepositoryNotAGitRepository, OptionNotExist, IOException, RepositoryNotFound, CheckoutError  {
    	
    	String array[] = new String[2];
    	
    	try {
            Git.checkout("master", repository);
        } catch (IOException | LocalRepositoryNotAGitRepository | CheckoutError e) {
        }
    	
    	for(int i=0; i< mergeList.size(); i++) {
            List<String> parents = Git.parent(repository, mergeList.get(i).getCommitHash());
            
            
            
            
            try {
                Git.checkout(parents.get(0), repository);
            } catch (IOException | LocalRepositoryNotAGitRepository | CheckoutError e) {
             }

            try {
            	Git.mergeBranch(repository, parents.get(0), parents.get(1), "Teste");
            } catch (NoRemoteForTheCurrentBranch | ThereIsNoMergeInProgress | ThereIsNoMergeToAbort | IOException | AlreadyUpToDate | NotSomethingWeCanMerge e) {
    		}
            
            try {
                Git.status(repository);
            } catch (RepositoryNotFound | IOException e) {
            }
            
            try {
            	Git.mergeAbort(repository);
            } catch (NoRemoteForTheCurrentBranch | ThereIsNoMergeInProgress | ThereIsNoMergeToAbort | IOException | AlreadyUpToDate | NotSomethingWeCanMerge e) {
            }
            
            try {
            	Git.clean(repository, true, 0);
            } catch (UnknownSwitch | IsOutsideRepository | RefusingToClean | IOException e) {           	
            }
            
    	}
        
        
    }
    
}
