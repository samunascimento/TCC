package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.GSONClass;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import java.io.IOException;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luand
 */
public class TestLuan {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     * @throws br.ufjf.dcc.gmr.core.exception.InvalidCommitHash
     */
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        /*List<MergeEvent> test = new ArrayList<>();

        test = RepositoryAnalysis.searchAllMerges("/home/luan/Github/UFJFTestes", 1);
        GSONClass.save("/home/luan/Github/teste.json", test);
        List<MergeEvent> read = GSONClass.read("/home/luan/Github/teste.json");
        for (MergeEvent mergeEvent : read) {

            System.out.println(mergeEvent.getParents());
        }
        */
    }

}
