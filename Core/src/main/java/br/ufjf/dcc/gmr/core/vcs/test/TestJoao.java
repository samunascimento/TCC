package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import static br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools.analyzeCPPSyntaxTree;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.util.List;

public class TestJoao {

    public static void main(String[] args) throws Exception{
        /*Connection connection = ConnectionFactory.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "kraken");
        Algorithm algorithm = new Algorithm();
        algorithm.setSqlConnection(connection);
        algorithm.run("https://github.com/yuzu-emu/yuzu.git","/home/joaolima/Git");*/
        String commit = "a46df409397855812812e83ae3ed6ce6261b72cb";
        String filePathProjectAsRoot = "src/yuzu/main.h";
        String repositoryPath = "/home/joaolima/Git/yuzu";
        List<String> lines = Git.getFileContentFromCommit(commit, filePathProjectAsRoot, repositoryPath);
        for (String line : lines) {
            System.out.println(line);
        }
        ANTLR4Results results = analyzeCPPSyntaxTree(filePathProjectAsRoot, commit, repositoryPath, true);
        System.out.println(results.getStringAll());
    }

}
