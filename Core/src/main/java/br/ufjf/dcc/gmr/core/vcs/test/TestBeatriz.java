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
        String repository = "C:\\Users\\Beatr\\Documents\\GitHub\\ufjf";
        List<String> status = new ArrayList<>();
        status = Git.status(repository);
        System.out.println(status);
    }
}
