package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import java.io.IOException;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.RepositoryAnalysis;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.Writer;
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
     */
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        List<SyntaxStructure> analyzeCPPSyntaxTree = RepositoryAnalysis.analyzeCPPSyntaxTree("C:\\Users\\luand.LAPTOP-78V9SGN0\\Documents\\GitHub\\estrutura-de-dados-2\\src\\main.cpp");
        Gson gson = new Gson();

        Writer writerJ = new FileWriter("keep.json");
        gson.toJson(analyzeCPPSyntaxTree, writerJ);

    }

}
