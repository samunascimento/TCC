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
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import br.ufjf.dcc.gmr.core.vcs.types.LineType;

/**
 *
 * @author luand
 */
public class returnNewLineNumber {

    String directory;
    String commitSource;
    String commitTarget;
    int originalLineNumber;
    List<FileDiff> chunks;
    String FilePath;

    public returnNewLineNumber() {

        chunks = new ArrayList<>();
    }

    public List<FileDiff> FillFileDiff(String directory, String commitSource, String commitTarget) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {
        //Verificar se a linha existe no arquivo original, e se existir

        List<String> output = new ArrayList<>();
        FileDiff aux = new FileDiff();

        int currentLine = 0;
        output = Git.auxiliardiff(directory, commitSource, commitTarget);
        String line;
        for (int i = 0; i < output.size(); i++) {
            line = output.get(i);
            if (line.startsWith("diff --") && currentLine != 0) {

                chunks.add(aux);
                aux = new FileDiff();
            }

            if (line.length() > 2 && line.charAt(0) == '+' && line.charAt(1) == '+' && line.charAt(2) == '+') {
                String c = line.substring(5);
                aux.setFilePathTarget(c);
            } else if (line.charAt(0) == '+') {
                String c = line.substring(1);
                aux.getLines().add(new LineInformation(c, LineType.ADDED, currentLine));

            } else if (line.length() > 2 && line.charAt(0) == '-' && line.charAt(1) == '-' && line.charAt(2) == '-') {
                String c = line.substring(5);
                aux.setFilePathSource(c);
            } else if (line.charAt(0) == '-') {

                String c = line.substring(1);
                aux.getLines().add(new LineInformation(c, LineType.DELETED, currentLine));
                currentLine++;
            } else if (line.charAt(0) == '@' && line.charAt(1) == '@') {
                currentLine = StartingLine(line);
            }

        }
        chunks.add(aux);
        aux = new FileDiff();
        return chunks;
    }

    private int StartingLine(String a) {

        if (a.contains("-")) {
            String c[];
            c = a.split("-");
            a = c[1];
            String g[];
            if (a.contains(",")) {
                g = a.split(",");
                if (g[0].contains("+")) {
                    g = g[0].split("\\+");
                    g[0] = g[0].replace(" ", "");
                }
            } else {
                g = a.split("\\+");
                g[0] = g[0].replace(" ", "");
            }
            int startingLine;
            startingLine = Integer.parseInt(g[0]);

            return startingLine;
        } else {

            String c[];
            c = a.split("\\+");
            a = c[1];

            String g[];
            if (a.contains(",")) {
                g = a.split(",");
            } else {
                g = a.split("/+");
            }
            int startingLine;
            startingLine = Integer.parseInt(g[0]);

            return startingLine;

        }
    }

    private int processingChunkModifiedLine(List<FileDiff> chunk, int originalLineNumber, String filePath) {

        int cont = 0;
        int j = 0;
        while (!chunk.get(j).getFilePathSource().equals(filePath)) {
            j++;
        }

        for (int i = 0; i < chunk.get(j).getLines().size(); i++) {

            if (chunk.get(j).getLines().get(i).getLineNumber() > originalLineNumber) {
                return cont;
            } else {
                    if (chunk.get(j).getLines().get(i).getType() == LineType.ADDED) {
                        cont++;
                    }
                    if (chunk.get(j).getLines().get(i).getType() == LineType.DELETED) {
                       
                        if(originalLineNumber == chunk.get(j).getLines().get(i).getLineNumber()){
                        return -1;
                         }else{
                         cont--;
                         }
                    }
                }
            }
        
        return cont;
    }

    public int InitreturnNewLineNumber(String directory1, String commitSource1, String commitTarget1, int originalLineNumber, String filePath1) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {
        this.FilePath = filePath1;
        this.directory = directory1;
        this.commitTarget = commitTarget1;
        this.commitSource = commitSource1;
        chunks = FillFileDiff(directory, commitSource, commitTarget);
        int i = processingChunkModifiedLine(chunks, originalLineNumber, filePath1);
        
        if(i==-1){
            System.out.println("A linha desejada foi excluida");
            return -1;
        }
        

        return originalLineNumber+i;
    }

}
