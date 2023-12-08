package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.sql.Connection;

public class TestJoao {

    public static void main(String[] args) throws Exception {
        Git.diff("/home/joaolima/Git/toAnalyze/brackets", 
                "11a4cc5a059b6b68ad8528d7d41531674cfd5f6f:src/extensions/default/JavaScriptRefactoring/RefactoringUtils.js",
                "src/extensions/default/JavaScriptRefactoring/RefactoringUtils.js", true, 0);
    }

}
