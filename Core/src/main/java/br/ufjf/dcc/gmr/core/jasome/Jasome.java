/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author antonio henrique
 */
public class Jasome {
    public static void main(String[] args) throws IOException {
        
        String command = "C:\\Users\\antonio henrique\\Desktop\\hello-world-java";
        String directory = "C:\\Users\\antonio henrique\\Desktop\\jasome-master\\build\\distributions\\jasome-master\\bin\\jasome-master.bat";
        
        String[] cmd = {directory,command};
        
        CLIExecution execution = null;
        //execution = CLIExecute.execute(cmd);
        //problemas quando vou utilizar o execute com dois parametros
        execution = CLIExecute.execute(cmd);
        for (String line : execution.getOutput()) {
            System.out.println(line);
        }
    }

}
