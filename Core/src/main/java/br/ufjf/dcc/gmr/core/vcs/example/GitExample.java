/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gleiph
 */
public class GitExample {

    public static void main(String[] args) throws IOException {

        String repositoryPath = "/Users/gleiph/Dropbox/UFJF/extensao/projeto-extensao-direito";
        log(repositoryPath);
        clone("https://github.com/gleiph/testeDCC099.git", "/Users/gleiph/Dropbox/UFJF/extensao");

    }

    public static void log(String repositoryPath) {
        String command1 = "git log --merges --pretty=format:\"%H|%aN|%ae\"";
        try {
            execute(command1, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void clone(String url, String directory){
        String command1 = "git clone " + url;
        try {
            execute(command1, directory);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void execute(String command, String repositoryPath) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process exec = runtime.exec(command, null,
                new File(repositoryPath));

        String s;

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(exec.getInputStream()));

        BufferedReader stdError = new BufferedReader(new InputStreamReader(exec.getErrorStream()));

        // read the output from the command
        System.out.println("==================Saida============================");
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }

        // read any errors from the attempted command
        System.out.println("==================Erro============================");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }
}
