/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.utils;

import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;
import br.ufjf.dcc.gmr.core.vcs.types.MyFile;
import br.ufjf.dcc.gmr.core.vcs.types.Version;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipepe
 *
 */
public class DiffTranslator {

    private List<RemoveOperation> removeOpList;
    private List<AddOperation> addOpList;

    public DiffTranslator() {
        this.removeOpList = new ArrayList<>();
        this.addOpList = new ArrayList<>();
    }

    public void findIntervals(Version version) {

        for (MyFile myFile : version.getFile()) {
            for (ConflictChunk chunk : myFile.getChunks()) {
                int removeSizeBefore = 0;
                int addSizeBefore = 0;
                while (removeOpList.get(removeSizeBefore).getLine() < chunk.getBegin().getLineNumber() && removeOpList.size() - 1 > removeSizeBefore) {
                    removeSizeBefore++;

                }
                while (addOpList.get(addSizeBefore).getLine() < chunk.getBegin().getLineNumber() && addOpList.size() - 1 > addSizeBefore) {
                    addSizeBefore++;
                }
                int BeginChunk = (chunk.getBegin().getLineNumber() + 1) - addSizeBefore;
                int EndChunk = (chunk.getSeparator().getLineNumber() - 1) - addSizeBefore;
                chunk.getChunkVersion1().setLineBegin(BeginChunk);
                chunk.getChunkVersion1().setLineEnd(EndChunk);

                BeginChunk = (chunk.getSeparator().getLineNumber() + 1) - (chunk.getSeparator().getLineNumber() - chunk.getBegin().getLineNumber()) - removeSizeBefore;
                EndChunk = (chunk.getEnd().getLineNumber() - 1) - (chunk.getSeparator().getLineNumber() - chunk.getBegin().getLineNumber()) - removeSizeBefore;
                chunk.getChunkVersion2().setLineBegin(BeginChunk);
                chunk.getChunkVersion2().setLineEnd(EndChunk);
                
            }
        }

    }

    public void translator(String initialFile, String finalFile, String repository) throws IOException {

        int initialLine = 0;
        int currentLine = 0;

        List<String> fileDiffExample = Git.fileDiffExample(initialFile, finalFile, repository);

        for (int i = 0; i < fileDiffExample.size(); i++) {

            String line = fileDiffExample.get(i);

            if (line.startsWith("@@")) {

                String[] auxArray = line.split("/+");
                String aux = auxArray[0];

                //@@-12,8
                aux = aux.replaceAll(" ", "");

                auxArray = aux.split("-");

                aux = auxArray[1];

                auxArray = aux.split(",");

                aux = auxArray[0];

                initialLine = Integer.parseInt(aux);

                currentLine = initialLine;

            } else if (line.startsWith("- ")) {

                RemoveOperation removeOp = new RemoveOperation(currentLine);
                currentLine++;
                removeOpList.add(removeOp);
            } else if (line.startsWith("+ ")) {

                int size = 1;

                for (; fileDiffExample.get(i + 1).startsWith("+ "); size++, i++) {
                }

                AddOperation addOp = new AddOperation(currentLine, size);
                addOpList.add(addOp);
            } else {
                currentLine++;
            }
        }
    }

    public List<RemoveOperation> getRemoveOpList() {
        return removeOpList;
    }

    public void setRemoveOpList(List<RemoveOperation> removeOpList) {
        this.removeOpList = removeOpList;
    }

    public List<AddOperation> getAddOpList() {
        return addOpList;
    }

    public void setAddOpList(List<AddOperation> addOpList) {
        this.addOpList = addOpList;
    }
}

// @@ são conhecidos como hunk header ou cabeçalhos de bloco
// os numeros seguidos por - (menos) ou + (mais) são a linha 
// onde se inicia o bloco em cada versão, e o número pós 
// virgula representa a quantidade de linhas do bloco
// em cada versão
//@@ -12,8 +12,6 @@ import java.util.Date;
//  * @author anton
//  */
// public class Point {
//-    private int versionID;
//-    private int parentID;
//     private int x;
//     private Double y;
//     private String nameProject;
//@@ -22,33 +20,32 @@ public class Point {
