package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Conflits {
    
    public static List <Formats> getMerges(String repository) throws IOException{
        List <Formats> merge = new ArrayList<>();
        merge = Git.logMerge(repository);
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
            System.out.print(merge.get(i).getMergeParents());
            System.out.print(" || " );
            System.out.print(merge.get(i).getAuthorDate());
            System.out.print(" || " );
            System.out.println(merge.get(i).getCommitDescription());
        }  
                  
           return merge;       
        
    }
    
    public static void getConflits(List<Formats> mergeList) throws Exception{
    	
    	String array[] = new String[2];
    	String directory = "C:\\Users\\felip\\Desktop\\Laravel Projetos\\PetTop2\\PetTop";
    	
		Git.checkoutSwitchBranches("master", directory);
		
    	for(int i=0; i< mergeList.size(); i++) {    		
    		
    		array = mergeList.get(i).getMergeParents().split(" ");    		
    		String commitP1 = array[0];
    		String commitP2 = array[1];
    		Git.checkoutSwitchBranches(commitP1, directory);
    		//Git.merge(commitP2, directory); 
    		Git.status(directory);
    		//git.clean
    		
    	}
        
        
    }
    
}
