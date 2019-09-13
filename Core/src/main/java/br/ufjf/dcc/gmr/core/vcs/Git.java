/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs;

import static br.ufjf.dcc.gmr.core.cli.CLIExecute.execute;
import br.ufjf.dcc.gmr.core.vcs.example.GitExample;
import br.ufjf.dcc.gmr.core.vcs.example.GitExample;
import static br.ufjf.dcc.gmr.core.vcs.example.GitExample.execute;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class created to implement Git commands 
 * @author gleiph
 */
public class Git {
    
    /*--------------------------------------------------------------------------
     * Inicio comandos do Antônio 
    --------------------------------------------------------------------------*/
    
    public static void show(String repositoryPath) {
        String command1 = "git show";
        GitExample g = new GitExample();
        try {
            g.execute(command1, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void log(String repositoryPath) {
        String command1 = "git log";
        GitExample g = new GitExample();
        try {
            g.execute(command1, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(GitExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /*--------------------------------------------------------------------------
     * Fim comandos do Antônio 
    --------------------------------------------------------------------------*/
    
    
    
    
    /*--------------------------------------------------------------------------
     * Inicio comandos do Beatriz 
    --------------------------------------------------------------------------*/
    
    /// STATUS GIT
    public void gitStatus(String repositoryPath) {
        String command = "git status";
        GitExample g = new GitExample();
        try {
            g.execute(command, repositoryPath);
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    ///GIT CLONE
    public void gitClone(String url, String directory){
        GitExample g = new GitExample();
        String command = "git clone " + url;
        try {
            g.execute(command, directory);
        } catch (IOException ex) {
            Logger.getLogger(Git.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    /*--------------------------------------------------------------------------
     * Fim comandos do Beatriz 
    --------------------------------------------------------------------------*/
    
    /*--------------------------------------------------------------------------
     * Inicio comandos do Felippe 
    --------------------------------------------------------------------------*/
    
    
    /*--------------------------------------------------------------------------
     * Fim comandos do Felippe 
    --------------------------------------------------------------------------*/
    
    /*--------------------------------------------------------------------------
     * Inicio comandos do Guilherme 
    --------------------------------------------------------------------------*/
    
    
    /*--------------------------------------------------------------------------
     * Fim comandos do Guilherme 
    --------------------------------------------------------------------------*/
    
    /*--------------------------------------------------------------------------
     * Inicio comandos do Guilherme 
    --------------------------------------------------------------------------*/
    
    
    /*--------------------------------------------------------------------------
     * Fim comandos do Guilherme 
    --------------------------------------------------------------------------*/
    
    
    /*--------------------------------------------------------------------------
     * Inicio comandos do Ian 
    --------------------------------------------------------------------------*/
    
    
    /*--------------------------------------------------------------------------
     * Fim comandos do Ian 
    --------------------------------------------------------------------------*/
    
    
    /*--------------------------------------------------------------------------
     * Inicio comandos do João 
    --------------------------------------------------------------------------*/
    
    
    /*--------------------------------------------------------------------------
     * Fim comandos do João 
    --------------------------------------------------------------------------*/
    
    
    /*--------------------------------------------------------------------------
     * Inicio comandos do Luan 
    --------------------------------------------------------------------------*/
    
    
    /*--------------------------------------------------------------------------
     * Fim comandos do Luan 
    --------------------------------------------------------------------------*/
}
