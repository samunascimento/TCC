/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luand
 */
public class returnNewLineNumber {
    
    String directory;
    String commitSource;
    String commitTarget;
    int originalLineNumber;
    List<String> aFiles=new ArrayList<>();
    List<String> bFiles=new ArrayList<>();
   
    
   
    
    
    public returnNewLineNumber(){
    
    String directory=new String();
    String commitSource=new String();
    String commitTarget=new String();
    int originalLineNumber;
     
    }

    public int returnNewLineNumber(String directory, String commitSource, String commitTarget, int originalLineNumber) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {
        //Verificar se a linha existe no arquivo original, e se existir
         this.directory=directory;
         this.commitSource=commitSource;
         this.commitTarget=commitTarget;
         this.originalLineNumber=originalLineNumber;
        
        List<String> output = new ArrayList<>();
        int counter = 0;
        int currentLine = 0;
        output = Git.auxiliardiff(directory, commitSource, commitTarget);
        for (String line : output) {
            if (line.charAt(0) == '@' && line.charAt(1) == '@') {
                currentLine=StartingLine(line);
            }
            if (currentLine >= originalLineNumber) {
                break;
            } else {
                if (line.length() > 2 && line.charAt(0) == '+' && line.charAt(1) == '+' && line.charAt(2) == '+') {
                   setACommit(line); 

                } else if (line.charAt(0) == '+' || line.charAt(1) == '+') {
                    currentLine++;
                    counter++;
                } else if (line.length() > 2 && line.charAt(0) == '-' && line.charAt(1) == '-' && line.charAt(2) == '-') {

                    setBCommit(line);
                } else if (line.charAt(0) == '-' || line.charAt(1) == '-') {
                    currentLine++;
                    counter--;
                }

            }
            currentLine++;

        }

        int newNumber = originalLineNumber - counter;

        return newNumber;
    }
    
    private void setACommit(String line){
        String newLine;
        newLine=line.replace("+++ a", "");
        aFiles.add(line);
        
    }
    private void setBCommit(String line){
        String newLine;
        newLine=line.replace("--- b", "");
        bFiles.add(line);
    }
    
    
    private int StartingLine(String a){
    
       if(a.contains("-"))
       {
           String c[];
           c=a.split("-");
           a=c[1];
           String g[];
           g=a.split(",");
           int startingLine;
           startingLine=Integer.parseInt(c[0]);
           
           return startingLine;
       }else{
           
           String c[];
           c=a.split("+");
           a=c[1];
           String g[];
           g=a.split(",");
           int startingLine;
           startingLine=Integer.parseInt(c[0]);
           
           return startingLine;
           
           
       }
    }
    
}
