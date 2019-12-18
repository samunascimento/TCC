package br.ufjf.dcc.gmr.core.vcs.test;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.FileStatus;
import br.ufjf.dcc.gmr.core.vcs.types.FileUnmerged;
import java.io.IOException;

/**
 *
 * @author Beatr
 */
public class TestBeatriz {
    public static void main(String [] args) throws RepositoryNotFound, IOException{
        String repository = "C:\\Users\\Beatr\\Desktop\\UFJF";
        FileStatus status = Git.status(repository);
        FileUnmerged unmerged = Git.statusUnmerged(repository);
        
        for (String lines : status.files.allStatus) {
            System.out.println(lines);
        }
        System.out.println("==================================================================");
        for (String lines : unmerged.file.unmerged) {
            System.out.println(lines);
        }
    }
        
}
