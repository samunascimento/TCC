/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.OutmostInformation;
import br.ufjf.dcc.gmr.core.vcs.types.OutmostTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Test class for outmost 
 * @author luan
 */
public class OutmostTest {

    public OutmostTest(String commitSource,String commitTarget,String directory) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {
        //Receive the antlr output, but using diff for an easy test
       
        List<String> output= new ArrayList<>();
        output=Git.auxiliarDiff(directory, commitSource, commitTarget);
        List<OutmostInformation> save= new ArrayList<>();
        OutmostInformation aux = new OutmostInformation(null,null);
        //we will process the output using a serie of ifs
        for (String line : output) {
            
            if(line.startsWith("import")){
                aux.setContent(line);
                aux.setType(OutmostTypes.Import);
                save.add(aux);
            }
            if(line.startsWith("int")||line.startsWith("float")||line.startsWith("double")||line.startsWith("String")){
                aux.setContent(line);
                aux.setType(OutmostTypes.Variable);
                save.add(aux);
            }
            if(line.startsWith("if")){
                if(blockTest(output)){
                    aux.setContent(line);
                    aux.setType(OutmostTypes.IfStatement);
                    save.add(aux);
                    
                }else{
                    aux.setContent(line);
                    aux.setType(OutmostTypes.Ifcall);
                    save.add(aux);
                }
                
            }
            aux=new OutmostInformation(null, null);
        }
        save.add(aux);
        

        
    }
    
  
    
   private boolean blockTest(List<String> output){
       
       for (String auxLine : output) {
           
           if(auxLine.contains("}"))
           return true;
           
       }
       
     return false;  
   }
    
    
    
    
    
}
