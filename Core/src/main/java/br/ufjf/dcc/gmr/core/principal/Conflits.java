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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Conflits {
    
    public static List <Formats> getMerges(String repository) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, OptionNotExist{
        List <Formats> merge =  Git.logMergeAll(repository);
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
        for(int i = merge.size()-1; i >= 0 ; i--){
            System.out.print(merge.get(i).getAuthorName());
            //calculates how much blank spaces are needed for the formatting be correct 
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
    	String path;
    	 List<String> conflitsArchives = new ArrayList<>();
    	 List<String> status = new ArrayList<>();
    	
    	try {
            Git.checkout("master", repository);
        } catch (IOException | LocalRepositoryNotAGitRepository | CheckoutError e) {
        }
    	
    	System.out.println("***************STARTING MERGE LOOP***************");
    	
    	for(int i = mergeList.size()-1; i >= 0; i--) {
    		
    		System.out.println("***************MERGE NUMBER "+i+"***************");
    		
            List<String> parents = Git.parent(repository, mergeList.get(i).getCommitHash());
           
            System.out.println("**************PREPARING MERGE BETWEEN:***************");
            System.out.println("***************PARENT 1: "+parents.get(0) +"***************");
            System.out.println("***************PARENT 2: "+parents.get(1) +"***************");
            try {
                Git.checkout(parents.get(0), repository);
            } catch (IOException | LocalRepositoryNotAGitRepository | CheckoutError e) {
             }
            
            System.out.println("***************RUNNING MERGE***************");
            try {
            	Git.mergeBranch(repository, parents.get(0), parents.get(1), "Teste");
            } catch (NoRemoteForTheCurrentBranch | ThereIsNoMergeInProgress | ThereIsNoMergeToAbort | IOException | AlreadyUpToDate | NotSomethingWeCanMerge e) {
            	System.out.println("***************ERROR IN MERGE EXECUTION***************");
            }
            
            System.out.println("***************RUNNING STATUS***************");
            try {
            	 System.out.println("***************GENERAL STATUS***************");
                status = Git.status(repository);
                
                for(int i1=0; i1 < status.size(); i1++) {
                	System.out.println(status.get(i1));
                }
                System.out.println("***************UNMERGE ARCHIVES***************");
                conflitsArchives = Git.statusUnmerged(repository);
                
                for(int i1=0; i1 < status.size(); i1++) {
                	System.out.println(status.get(i1));
                }
            } catch (RepositoryNotFound | IOException e) {
            	 System.out.println("***************ERROR IN STATUS EXECUTION***************");
            }
            
         
            System.out.println("***************CONFLITS AREA***************");
			for(int i2=0; i2 < conflitsArchives.size(); i2++) {
				 System.out.println("***************STARTS ARCHIVE: "+conflitsArchives.get(i2)+"***************");
				
				String aux = repository.replace("\\", "/");
							
				String conflitPath = conflitsArchives.get(i2);
				String aux2 = conflitPath.replaceFirst("UU ", "");
				String aux5 = aux2.replaceFirst("Core", "/Core");
				
				String aux3 = aux.concat(aux5);
				String completePath = aux3.replace("\\", "/");
				
				
				getAreaConflits(completePath);
				
				 System.out.println("***************ENDS ARCHIVE**************");
			}
			 System.out.println("***************FINISH CONFLITS AREA***************");
            
            System.out.println("***************MERGE ABORT AND CLEAR***************");
            try {
            	Git.mergeAbort(repository);
            } catch (NoRemoteForTheCurrentBranch | ThereIsNoMergeInProgress | ThereIsNoMergeToAbort | IOException | AlreadyUpToDate | NotSomethingWeCanMerge e) {
            }
            
            try {
            	Git.clean(repository, true, 0);
            } catch (UnknownSwitch | IsOutsideRepository | RefusingToClean | IOException e) {           	
            }
            
    	}
    	
    	System.out.println("***************FINISH MERGE LOOP***************");
        
        
    }
    
    public static void getAreaConflits(String filePath) {
    	
    	 try{

             FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr);

             String linha;
             List <String> str = new ArrayList<>();
             //List <String> areaConflit = new ArrayList<>();
             //List <String> areaIncomeConflit = new ArrayList<>();
             //List <String> areaCurrentConflit = new ArrayList<>();
             while( (linha = br.readLine()) != null ) {
                 str.add(linha);
             }


             for(int i=0; i < str.size(); i++){
                 if ( str.get(i).contains("<<<<<<<") ) {
                     for(int j=i; !str.get(j).contains("======="); j++) {
                         //areaCurrentConflit.add(str.get(j));
                         System.out.println(str.get(j) + "\n");
                     }
                 }
                 if ( str.get(i).startsWith("=======") ) {

                     for(int w=i; !str.get(w).contains(">>>>>>>"); w++) {
                         //areaIncomeConflit.add(str.get(w));
                         System.out.println(str.get(w) + "\n");
                     }
                 }

                 if ( str.get(i).contains(">>>>>>>") )
                     System.out.println(str.get(i) + "\n");
             }

         }
         catch(IOException e){
             System.out.println("Arquivo não encontrado!");
         }
     }
    	
    	
    	
    }
    

