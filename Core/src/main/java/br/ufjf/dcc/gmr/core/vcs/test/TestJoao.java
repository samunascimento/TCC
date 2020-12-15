package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureAlgorithm;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictRegion;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws Exception {

        //MainFrame frame = new MainFrame();
        //MergeNatureAlgorithm algorithm = new MergeNatureAlgorithm("/home/joao_lima/Git/antlr4/", 1);
        //algorithm.startAlgorithm();
        /*
        String text = ListUtils.getTextListStringToString(Git.getFileContentFromCommit("HEAD", "Core/src/main/java/br/ufjf/dcc/gmr/core/vcs/test/TestBeatriz.java", "/home/joao_lima/Git/UFJF/"));
        JavaLexer lexer = new JavaLexer(new ANTLRInputStream(text));
        JavaParser parser = new JavaParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.compilationUnit();
        */
        List<ConflictRegion> a = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            a.add(new ConflictRegion());
        }
        for(ConflictRegion b : a){
            b.setBeginLine(1);
        }
        for(ConflictRegion b : a){
            System.out.println(b.getBeginLine());
        }

    }

}
