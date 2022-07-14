package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Results;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.ANTLR4Tools;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import br.ufjf.dcc.gmr.core.mergenature.dao.ConnectionFactory;
import br.ufjf.dcc.gmr.core.mergenature.controller.Algorithm;
import br.ufjf.dcc.gmr.core.mergenature.controller.GSONClass;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import br.ufjf.dcc.gmr.core.mergenature.dao.ProjectDAO;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.sql.Connection;
import java.util.Locale;

/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {

        //ANTLR4Results results = ANTLR4Tools.analyzeCPPSyntaxTree("/home/joaolima/Git/UFJFRepositories/RepoDeIA/src/Main.cpp", true);
        ANTLR4Results results = ANTLR4Tools.analyzeJava9SyntaxTree("/home/joaolima/Git/antlr4/runtime/Java/src/org/antlr/v4/runtime/DefaultErrorStrategy.java", true);
        for (SyntaxStructure ss : results.getAll()) {
            System.out.println(ss.getForm()+ "\n");
        }

    }

}
