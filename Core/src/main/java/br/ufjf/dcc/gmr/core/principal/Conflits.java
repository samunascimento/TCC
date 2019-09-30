package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Conflits {
    
    public static void getConflit(String repository){
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
                  
                  
        
    }
    
}
