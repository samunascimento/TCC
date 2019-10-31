package br.ufjf.dcc.gmr.core.vcs.test;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Beatr
 */
public class TestBeatriz {
    public static void main(String [] args) throws RepositoryNotFound, IOException{
        String repository = "C:\\Users\\Beatr\\Documents\\GitHub\\TrabalhoOO";
        List<String> status = new ArrayList<>();
        List<String> unmerged = new ArrayList<>();
        status = Git.status(repository);
        for(int i=0;i<status.size();i++)
            System.out.println(status.get(i)+ "\n");
        System.out.println("-----------------------------UNMERGED----------------------------------------");
        unmerged = Git.statusUnmerged(repository);
        if(!unmerged.isEmpty()){
            for(int i=0;i<unmerged.size();i++)
                System.out.println(unmerged.get(i)+ "\n");
        }else System.out.println("Nao tem conflito de merge");       
    }
}
