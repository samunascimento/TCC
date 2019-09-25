/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Merge {
    public static void main(String[] args) {
        String repository = "/ice/UFJF";
        /*List<Formats> list = new ArrayList<>();
        list = Git.log(repository);
        for(int i=0;i<list.size(); i++){
            System.out.println(
                    list.get(i).getAuthorName()+ " " + 
                    list.get(i).getCommitHash() + " " +
                    list.get(i).getAuthorDate() + " " +
                    list.get(i).getCommitDescription()
            );
        }
        */
        Conflits.getConflit(repository);
    }
}
