/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4;

import static br.ufjf.dcc.gmr.core.chunks.antlr4.ParserJava.replaceAll;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.GlobalEnviroment;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.TypeBinding;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author felip
 */
public class ParserTools {

    protected static int[] getParentLines(String targetFile, List<String> sourceBlock) {
        int result[] = {0, 0};

        int preContext = 0;
        int posContext = 0;
        List<String> targetContent = ListUtils.readFile(targetFile);
        int j = 0;
        for (int i = 0; i < targetContent.size() && j < sourceBlock.size(); i++) {
            if (targetContent.get(i).equals(sourceBlock.get(j))) {
                j++;
            }
            posContext = i;
        }
        preContext = posContext - j;
        posContext += 1;

        result[0] = preContext;
        result[1] = posContext;

        return result;
    }

    protected static List<List<String>> cutConflitcContent(List<String> content) {

        List<List<String>> result = new ArrayList<>();

        List<String> aux = new ArrayList<>();
        int i = 1;
        while (!content.get(i).contains("=======")) {

            aux.add(content.get(i));
            i++;
        }
        result.add(aux);
        aux = new ArrayList<>();
        i++;
        while (!content.get(i).contains(">>>>>>>")) {
            aux.add(content.get(i));
            i++;
        }
        result.add(aux);

        return result;

    }

    protected static List<List<String>> filesToStringParent(List<String> filesToCheckParent) {

        List<List<String>> result = new ArrayList<>();

        for (String path : filesToCheckParent) {
            result.add(ListUtils.readFile(path));
        }

        return result;
    }

    protected static void printCompare(List<String> javaFiles, Set<String> paths, GlobalEnviroment globalEnviromentParent1, GlobalEnviroment globalEnviromentParent2) {

        int i = 0, j = 0;
        for (String pathAST1 : javaFiles) {
            for (String pathAST2 : javaFiles) {
                TypeBinding ast1 = new TypeBinding();
                TypeBinding ast2 = new TypeBinding();

                for (String path : paths) {
                    if (pathAST1.endsWith(replaceAll(path, File.separator))) {
                        ast1 = globalEnviromentParent1.getEnviroment().get(path);
                    }
                }

                for (String path : paths) {
                    if (pathAST2.endsWith(replaceAll(path, File.separator))) {
                        ast2 = globalEnviromentParent2.getEnviroment().get(path);
                    }
                }

                if (j != i) {
                    System.out.println("\n" + ast1.getName() + " // " + ast2.getName() + "\n");
                    ParserJava.compare(ast1, ast2, globalEnviromentParent1);
                    ParserJava.compare(ast1, ast2, globalEnviromentParent2);
                }
                i++;
            }
            i = 0;
            j++;

        }
        System.out.println("***************GlobalEnviromentTypes***************");
        for (TypeBinding value : globalEnviromentParent1.getEnviroment().values()) {
            System.out.println(value);

        }
        for (TypeBinding value : globalEnviromentParent2.getEnviroment().values()) {
            System.out.println(value);

        }
    }

    protected static void checkoutToParent(String pathProject, String SHA) throws IOException, UnknownSwitch, RefusingToClean, IsOutsideRepository {
        Git.reset(pathProject, true, false, false, null);
        Git.clean(pathProject, true, 0);
        Git.checkout(SHA, pathProject);

    }


    protected static List<String> filesToCheckParent(String pathRepositoryCopy, List<String> javaFiles) {

        List<String> result = new ArrayList<>();
        File cloneDirectory = new File(pathRepositoryCopy);
        if (cloneDirectory.isDirectory()) {
            List<String> jaja = javaFiles(pathRepositoryCopy);

            for (String javaFile : javaFiles) {
                String[] split = javaFile.split("/");
                for (String string : jaja) {
                    String[] stringSplited = string.split("\\\\");
                    if (stringSplited[stringSplited.length - 1].equals(split[split.length - 1])) {
                        result.add(string);

                    }
                }
            }
        }

        return result;
    }

    protected static List<String> javaFiles(String dir) {
        List<String> javaFiles = new ArrayList<>();
        File file = new File(dir);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getAbsolutePath().endsWith(".java")) {
                javaFiles.add(file1.getAbsolutePath());
            } else if (file1.isDirectory()) {
                javaFiles.addAll(javaFiles(file1.getAbsolutePath()));
            }
        }
        return javaFiles;
    }

}
