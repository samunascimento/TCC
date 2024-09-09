package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.GitException;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeMessageReader;
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
        merge.setMergeCommit(Commit.getCommit(auxStringArray[0], repositoryPath));
        auxStringArray = auxStringArray[1].split(" ");
        for (String parent : auxStringArray) {
            merge.addParent(Commit.getCommit(parent, repositoryPath));
        }
        auxString = Git.mergeBase(repositoryPath, auxStringArray);
        merge.setMergeBase((auxString == null ? null : Commit.getCommit(auxString, repositoryPath)));
        return merge;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, GitException {

        String repositoryPath = "C:\\Users\\luanr\\OneDrive\\Codigos\\Scripts\\Conflitos_Merge";
        String logLine = "4841432c16af1965b308d2a78416a90cde960684/46c14a8e9c8effba3de2fb71d798db2e5d99691f ab7b41d3a71ced97bf3f4a2a4dc4f182534c95b8";
        Merge merge = getMergeDataInSystem(repositoryPath, logLine);

        MergeNatureTools.prepareAnalysis(repositoryPath);
        Git.checkout(merge.getParents().get(0).getHash(), repositoryPath);
        MergeNatureTools.prepareAnalysis(repositoryPath);

        if (merge.getConflictFiles() != null) {

            String message = "CONFLICT (rename/rename): Rename directory Dir_novo->Dir_novo_branch in HEAD. Rename directory Dir_novo->Dir_novo_master in ab7b41d3a71ced97bf3f4a2a4dc4f182534c95b8";
            ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);

            if (conflictFile != null) {
                if (null != conflictFile.getAncestorFilePath()) {
                    System.out.println("Ancestral: ");
                    System.out.println(conflictFile.getAncestorFilePath());
                    System.out.println("\n");
                } else {
                    System.out.println("Não tem ancestral");
                    System.out.println("\n");
                }
            }
            if (conflictFile != null) {
                if (null != conflictFile.getParent1FilePath()) {
                    System.out.println("File path pai 1: ");
                    System.out.println(conflictFile.getParent1FilePath());
                    System.out.println("\n");
                } else {
                    System.out.println("Não tem pai 1 ?");
                    System.out.println("\n");
                }
            }
            if (conflictFile != null) {
                if (null != conflictFile.getParent2FilePath()) {
                    System.out.println("File path pai 2: ");
                    System.out.println(conflictFile.getParent2FilePath());
                    System.out.println("\n");

                } else {
                    System.out.println("Não tem pai 2 ???");
                    System.out.println("\n");
                }
            }
            if (conflictFile != null) {
                if (null != conflictFile.getConflictFilePath()) {
                    System.out.println("File path: ");
                    System.out.println(conflictFile.getConflictFilePath());
                    System.out.println("\n");

                } else {
                    System.out.println("Não tem file path");
                    System.out.println("\n");
                }
            }

        } else {
            System.out.println("Não tem conflict file");
        }
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
