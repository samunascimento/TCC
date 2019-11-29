/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.vcs.Git;
//import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Merge {
/*
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, ParseException, OptionNotExist, RepositoryNotFound {
        String repository = "C:\\Users\\icout\\OneDrive\\Área de Trabalho\\UFJF - Copia";
        List<Formats> list = new ArrayList<>();
        List<Formats> mergeList = new ArrayList<>();

        try {
            list = Git.logAll(repository);
        } catch (IOException | LocalRepositoryNotAGitRepository | ParseException e) {
        }

        //get the biggest author name for the formatting be correct
        String biggestAuthorName = list.get(0).getAuthorName();
        String spaceAux = new String();
        for (int i = 1; i < list.size(); i++) {
            if (biggestAuthorName.length() < list.get(i).getAuthorName().length()) {
                biggestAuthorName = list.get(i).getAuthorName();
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i).getAuthorName());
            //calculates how much blank spaces are needed for the formatting be correct 
            for (int j = 0; j < biggestAuthorName.length() - list.get(i).getAuthorName().length(); j++) {
                spaceAux += " ";
            }
            System.out.print(spaceAux + " || ");
            spaceAux = "";
            System.out.print(list.get(i).getCommitHash());
            System.out.print(" || ");
            System.out.print(list.get(i).getAuthorDate());
            System.out.print(" || ");
            System.out.print(Git.parent(repository, list.get(i).getCommitHash()));
            System.out.print(" || ");
            System.out.println(list.get(i).getCommitDescription());
        }

        mergeList = Conflicts.getMerges(repository);
        try {
            Conflicts.getConflicts(mergeList, repository);
        } catch (LocalRepositoryNotAGitRepository | OptionNotExist | IOException | RepositoryNotFound | CheckoutError e) {
        }
        List status = new ArrayList();
        try {
            status = Git.status(repository);
        } catch (RepositoryNotFound | IOException e) {
        }

        System.out.println("||||||||||||||||||||||||||||MERGES||||||||||||||||||||||||||");
         for (Object statu : status) {
            System.out.println(statu);
         }
    }
*/}
