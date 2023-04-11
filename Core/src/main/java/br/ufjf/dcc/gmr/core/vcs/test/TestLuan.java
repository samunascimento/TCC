package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.GitException;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import br.ufjf.dcc.gmr.core.mergenature.model.Commit;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.vcs.Git;
import static br.ufjf.dcc.gmr.core.vcs.Git.merge;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Luan
 */
public class TestLuan {

    public static Merge getMergeDataInSystem(String repositoryPath, String logLine) throws IOException, GitException {
        Merge merge = new Merge();
        String[] auxStringArray;
        String auxString;
        auxStringArray = logLine.split("/");
        merge.setMergeCommit(new Commit(auxStringArray[0], repositoryPath));
        auxStringArray = auxStringArray[1].split(" ");
        for (String parent : auxStringArray) {
            merge.addParent(new Commit(parent, repositoryPath));
        }
        auxString = Git.mergeBase(repositoryPath, auxStringArray);
        merge.setMergeBase((auxString == null ? null : new Commit(auxString, repositoryPath)));
        return merge;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, GitException {

        String repositoryPath = "C:\\Users\\luanr\\OneDrive\\Codigos\\Scripts\\Conflitos_Merge";
        String logLine = "e6807dfe022ec6252dbd047deb65b9d65bf82992/3b460bbd3822b02ca8091f58274543723e0c732e 37d77b6c7270d26abfcdf0119c4abce49db8f5e7";
        Merge merge = getMergeDataInSystem(repositoryPath, logLine);

        if (null != merge.getConflictFiles() && !merge.getConflictFiles().isEmpty()) {

            for (ConflictFile paths : merge.getConflictFiles()) {

                if (null != paths.getAncestorFilePath()) {
                    System.out.println("Ancestral: ");
                    System.out.println(paths.getAncestorFilePath());
                    System.out.println("\n");
                } else {
                    System.out.println("Não tem ancestral");
                    System.out.println("\n");
                }

                if (null != paths.getParent1FilePath()) {
                    System.out.println("File path pai 1: ");
                    System.out.println(paths.getParent1FilePath());
                    System.out.println("\n");
                } else {
                    System.out.println("Não tem pai 1 ?");
                    System.out.println("\n");
                }
                if (null != paths.getParent2FilePath()) {
                    System.out.println("File path pai 2: ");
                    System.out.println(paths.getParent2FilePath());
                    System.out.println("\n");

                } else {
                    System.out.println("Não tem pai 2 ???");
                    System.out.println("\n");
                }
            }

        } else {
            System.out.println("Não tem conflict file");
        }

        System.out.println("\n");
        if (merge.getParents().size() == 2) {

            MergeNatureTools.prepareAnalysis(repositoryPath);

            Git.checkout(merge.getParents().get(0).getHash(), repositoryPath);
            MergeNatureTools.prepareAnalysis(repositoryPath);

            List<String> mergeMessage = Git.merge(merge.getParents().get(1).getHash(), repositoryPath);
            for (String string : mergeMessage) {
                System.out.println(string);
            }
        }
    }
}
