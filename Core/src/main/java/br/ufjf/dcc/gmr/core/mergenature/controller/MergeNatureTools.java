package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Auxiliaries methods for MergeNature
 *
 * @author João Pedro Lima
 * @since 14-10-2020
 */
public class MergeNatureTools {

    public static String getRawForm(String string) {
        return string.replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", "");
    }

    public static List<String> getRawForm(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, getRawForm(list.get(i)));
        }
        return list;
    }

    public static String getFileName(String filePath) {
        String[] auxArray = filePath.split(File.separator);
        return auxArray[auxArray.length - 1];
    }

    public static void createAndWriteInFile(String filePath, String content) throws IOException {
        File yourFile = new File(filePath);
        yourFile.createNewFile();
        FileOutputStream oFile = new FileOutputStream(yourFile, false);
        OutputStreamWriter myOutWriter = new OutputStreamWriter(oFile);
        myOutWriter.append(content);
        myOutWriter.close();
        oFile.close();
    }

    public static List<String> getFileContentInList(String filePath) throws FileNotFoundException, IOException {
        List<String> content = new ArrayList<>();
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            content.add(st);
        }
        br.close();
        return content;
    }

    public static List<String> stringTextToListText(String text) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                list.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(text.charAt(i));
            }
        }
        list.add(sb.toString());
        return list;
    }

    public static String getFileContentInString(String filePath) throws FileNotFoundException, IOException {
        String content = "";
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            content = content + "\n" + st;
        }
        br.close();
        return content.replaceFirst("\n", "");
    }

    public static boolean isDirectory(File file) {
        if (file.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDirectory(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }

    public static void prepareAnalysis(String repositoryPath) {
        try {
//            System.out.println("remove all in Work...");
            Git.removeAllInWorkspace(repositoryPath);
//            System.out.println("passou do remove ...");
        } catch (Exception ex) {
        }
        try {
//            System.out.println("clean");
            Git.clean(repositoryPath, true, 0);
//            System.out.println("passou do clean");
        } catch (Exception ex) {
        }
        try {
            Git.reset(repositoryPath, true, false, false, null);
            System.out.println("prepare");
        } catch (Exception ex) {
        }

    }

    public static boolean checkIfIsBegin(String line) {
        if (line.startsWith("<<<<<<< HEAD")) {
            if (line.replaceAll("<<<<<<< HEAD", "").equals("")) {
                return true;
            } else if (line.replaceAll("<<<<<<< HEAD", "").startsWith(":") && line.replaceAll("<<<<<<< HEAD", "").length() > 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean checkIfIsSeparator(String line) {
        return line.replaceAll("=======", "").equals("") && line.startsWith("=======");
    }

    public static boolean checkIfIsEnd(String line) {
        if (line.startsWith(">>>>>>> ")) {
            return true;
        } else {
            return false;
        }
    }
}
