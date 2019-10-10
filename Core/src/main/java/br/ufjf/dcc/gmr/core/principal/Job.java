package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.ufjf.dcc.gmr.core.vcs.Git;
//Passando tudo pra nossa biblioteca
/**
 * 
 * @author joaop
 * @author Luan
 */
public class Job {

    public static void showConflicts(String directory) throws IOException, RepositoryNotFound, Exception{
        CLIExecution exec = null;
        String parent1, parent2, children;
        List<String> allMerges;
        // Chamar comando log do git.java
        try{
            //move to Git class
            exec = CLIExecute.execute("git log --max-parents=2 --min-parents=2 --pretty=format:%p,%h", directory);
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(exec.getOutput().isEmpty()){
            System.out.println("Não há merges com apenas dois pais");
        }
        else {
            //Se tiver dois pais fazer
            allMerges = exec.getOutput();
            for(String merge : allMerges){
                parent1 = merge.substring(0, 7);
                parent2 = merge.substring(8,15);
                children = merge.substring(16, 23);
                System.out.println("Parent 1: " + parent1);
                System.out.println("Parent 2: " + parent2);
                System.out.println("Children: " + children);
                try{
                    //Chamar checkout do git.java
                    exec = CLIExecute.execute("git checkout " + parent1, directory);
                    //chamar merge do pai 2 com 1 no git.java
                    exec = CLIExecute.execute("git merge " + parent2, directory);
                } catch (IOException ex) {
                    Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
                }//Se tiver conflito
                if(exec.getOutput().toString().contains("CONFLICT")){
                    try{
                        //chamar diff
                        exec = CLIExecute.execute("git diff --exit-code",directory);
                    } catch (IOException ex) {
                        Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
                    }  
                    for(String s : exec.getOutput()){
                        System.out.println(s);
                    }
                    try{
                        exec = CLIExecute.execute("git merge --abort ",directory);
                    } catch (IOException ex) {
                        Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                try{
                    //chamar checkout
                    exec = CLIExecute.execute("git checkout master", directory);
                } catch (IOException ex) {
                    Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } 
    }
}
