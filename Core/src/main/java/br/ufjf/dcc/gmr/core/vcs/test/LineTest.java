/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ReturnNewLineNumber;
import br.ufjf.dcc.gmr.core.exception.EmptyOutput;
import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.PathDontExist;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gleiph
 */
public class LineTest {

    public static void main(String[] args) throws IOException, EmptyOutput {

        File directory = new File("/Users/gleiph/Desktop/sandbox/left");
        if(!directory.isDirectory())
            directory.mkdir();
        
        
        ReturnNewLineNumber newLine = new ReturnNewLineNumber();
        try {
            int initReturnNewLineNumberFile = newLine.initReturnNewLineNumberFile("/Users/gleiph/Dropbox/UFJF/repositorios/UFJFCopy2",
                    "/Users/gleiph/Dropbox/UFJF/repositorios/UFJFCopy1/Core/src/main/java/br/ufjf/dcc/gmr/core/cli/CLIExecute.java",
                    "/Users/gleiph/Dropbox/UFJF/repositorios/UFJFCopy2/Core/src/main/java/br/ufjf/dcc/gmr/core/cli/CLIExecute.java", 49);

            System.out.println("initReturnNewLineNumberFile = " + initReturnNewLineNumberFile);

        } catch (LocalRepositoryNotAGitRepository ex) {
            Logger.getLogger(LineTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidCommitHash ex) {
            Logger.getLogger(LineTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PathDontExist ex) {
            Logger.getLogger(LineTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
