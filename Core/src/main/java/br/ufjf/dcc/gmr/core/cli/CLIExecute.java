/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.cli;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gleiph
 */
public class CLIExecute {
    
    public static CLIExecution execute(String command, String directory) throws IOException {
        
        CLIExecution execution = new CLIExecution();
        
        
        Runtime runtime = Runtime.getRuntime();
        Process exec = runtime.exec(command, null,
                new File(directory));

        String s;

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(exec.getErrorStream()));

        // read the output from the command
        while ((s = stdInput.readLine()) != null) {
            execution.addOutput(s);
        }

        // read any errors from the attempted command
        while ((s = stdError.readLine()) != null) {
            execution.addError(s);
        }
        
        return execution;
    }
    
    public static CLIExecution execute(String[] cmd) throws IOException{
        
        CLIExecution execution = new CLIExecution();
        
        Runtime runtime = Runtime.getRuntime();
        Process exec = runtime.exec(cmd);
        String s;

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(exec.getErrorStream()));

        // read the output from the command
        while ((s = stdInput.readLine()) != null) {
            execution.addOutput(s);
        }

        // read any errors from the attempted command
        while ((s = stdError.readLine()) != null) {
            execution.addError(s);
        }
        
        return execution;
    }
    
}
