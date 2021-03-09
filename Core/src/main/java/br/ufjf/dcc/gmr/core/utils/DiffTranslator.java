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

    public int findLines(String sourceFile, String targetFile, int originalLine) {

        int result = 0;

        List<String> sourceContent = ListUtils.readFile(sourceFile);
        List<String> targetContent = ListUtils.readFile(targetFile);

        result = originalLine - countAdds(originalLine + 1) + countRemoves(originalLine + 1);
        if (result < targetContent.size()) {
            if (sourceContent.get(originalLine).equals(targetContent.get(result))) {
                return result;

            }

        }

        result = originalLine - countRemoves(originalLine + 1) + countAdds(originalLine + 1);
        if (result < targetContent.size()) {
            if (sourceContent.get(originalLine).equals(targetContent.get(result))) {
                return result;
            }
        }

        if ( result == targetContent.size()) {

            if (sourceContent.get(originalLine).equals(targetContent.get(result-1))) {
                return result-1;
            }

        }

        return -1;
    }

    private int countAdds(int line) {
        int result = 0;

        int j;

        for (int i = 0; addOpList.get(i).getLine() <= line && i < addOpList.size() - 1; i++) {
            j = 0;
            while (j != addOpList.get(i).getSize()) {
                j++;

            }
            result += j;
        }
        result += addOpList.get(addOpList.size() - 1).getSize();

        return result;
    }

    private int countRemoves(int line) {
        int result = 0;

        for (int i = 0; removeOpList.get(i).getLine() <= line && i < removeOpList.size() - 1; i++) {
            result++;
        }

        return result;

    }

    public void translator(String initialFile, String finalFile, String repository) throws IOException {

        int initialLine = 0;
        int currentLine = 0;

        List<String> fileDiffExample = Git.fileDiffExample(initialFile, finalFile, repository);

        for (int i = 4; i < fileDiffExample.size(); i++) {

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

            } else if (line.startsWith("-")) {

                RemoveOperation removeOp = new RemoveOperation(currentLine);
                currentLine++;
                removeOpList.add(removeOp);
            } else if (line.startsWith("+")) {

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
