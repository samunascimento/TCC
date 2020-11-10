package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.view.MainFrame;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureAlgorithm;
import java.io.IOException;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws IOException {
        
        //MainFrame frame = new MainFrame();
        MergeNatureAlgorithm algorithm = new MergeNatureAlgorithm("/home/joao_lima/Git/antlr4/", 1);
        algorithm.startAlgorithm();
        
    }

}
