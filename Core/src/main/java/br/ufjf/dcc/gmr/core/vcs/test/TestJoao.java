package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaLexer;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.conflictanalysis.GUI.view.JavaVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.GUI.view.MergeEvent;
import br.ufjf.dcc.gmr.core.conflictanalysis.GUI.view.CommitData;
import br.ufjf.dcc.gmr.core.conflictanalysis.GUI.view.RepositoryAnalysis;
import br.ufjf.dcc.gmr.core.conflictanalysis.GUI.view.SyntaxStructure;
import br.ufjf.dcc.gmr.core.exception.AlreadyUpToDate;
import br.ufjf.dcc.gmr.core.exception.BranchNotFound;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.NoRemoteForTheCurrentBranch;
import br.ufjf.dcc.gmr.core.exception.NotSomethingWeCanMerge;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeInProgress;
import br.ufjf.dcc.gmr.core.exception.ThereIsNoMergeToAbort;
import java.io.IOException;
import java.util.List;
import br.ufjf.dcc.gmr.core.conflictanalysis.GUI.view.RepositoryAnalysis;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
/**
 *
 * @author gleiph
 */
public class TestJoao {

    public static void main(String[] args) throws IOException, BranchNotFound, LocalRepositoryNotAGitRepository, CheckoutError, NoRemoteForTheCurrentBranch, ThereIsNoMergeInProgress, ThereIsNoMergeToAbort, AlreadyUpToDate, NotSomethingWeCanMerge, InvalidCommitHash {

        String repositoryPath = "C:\\Users\\joaop\\Git\\Cobaia";
        List<MergeEvent> list = RepositoryAnalysis.searchAllConflicts(repositoryPath,3,true);
        if(list.isEmpty())
            System.out.println("Tá vazio");
        for(MergeEvent merge : list){
            if(true){
                merge.print();
            }
        }
        
        /*String filePath = "/home/joao/Git/UFJF/Core/src/main/java/br/ufjf/dcc/gmr/core/vcs/test/TestBeatriz.java";
        for(SyntaxStructure ss : RepositoryAnalysis.getStructureTypeInInterval(filePath,14,18)){
            System.out.println(ss.getStartLine() + " " + ss.getText() + "\t(" + ss.getStructureType() + ")\n");
        }*/
        
        /*String repositoryPath = "/home/joao/Git/UFJF";
        CommitData commit = new CommitData("44d54ec033e6fcb6905099d07ce08636db771cca",repositoryPath);
        System.out.println(commit.getTitle() + "\n" + commit.getCommitHash() + "\n" + commit.getAuthor() + "\n" + commit.getAuthorDate().toString() + "\n" + commit.getCommitter()+ "\n" + commit.getCommitterDate().toString());
        */
    }

}
