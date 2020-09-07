package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import br.ufjf.dcc.gmr.core.conflictanalysis.view.MainFrame;
import java.io.IOException;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws IOException {

        ConflictAnalysisTools.analyzeCPPSyntaxTree("/home/joao_lima/CodeBlocksProjects/Test/main.cpp");
        //MainFrame mainFrame = new MainFrame();
    }

}
