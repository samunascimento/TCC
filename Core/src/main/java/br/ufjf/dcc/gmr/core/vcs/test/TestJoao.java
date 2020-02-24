package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import br.ufjf.dcc.gmr.core.conflictanalysis.view.RepositoryAnalysisGUI;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args){
        String repositoryPath = "C:\\Users\\joaop\\Git\\Twitter4J";
        RepositoryAnalysisGUI gui = new RepositoryAnalysisGUI();
        /*try {
            for(MergeEvent merge : gui.searchAllConflicts(repositoryPath, 2, false)){
                merge.print();
            }
        } catch (IOException ex) {
            Logger.getLogger(TestJoao.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        gui.initGUI();
    }

}
