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
        String repository = "/ice/UFJF";
        List<String> status = new ArrayList<>();
        status = Git.status(repository);
        for(int i=0;i<status.size();i++)
            System.out.println(status.get(i)+ "\n");
    }
}
