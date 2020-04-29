package br.ufjf.dcc.gmr.core.utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao_lima
 */
public class ListUtils {

    public static List<String> getSubList(List<String> content, int begin, int end) {

        List<String> result = new ArrayList<>();

        for (int i = begin; i <= end; i++) {
            result.add(content.get(i));
        }

        return result;

    }

    public static String getRawStringForm(List<String> list) {
        String raw = "";
        for (String line : list) {
            if (line.replaceAll("\n", "").equals("")) {
                raw = raw + line;
            } else if (line.replaceAll("\t", "").equals("")) {
                raw = raw + line;
            } else if (line.replaceAll(" ", "").equals("")) {
                raw = raw + line;
            } else {
                raw = raw + (line.replaceAll("\n", "").replaceAll(" ", "").replaceAll("\t", ""));
            }
        }
        return raw;
    }

    public static List<String> getRawListStringForm(List<String> list) {
        List<String> raw = new ArrayList<>();
        for (String line : list) {
            if (line.replaceAll("\n", "").equals("")) {
                raw.add(line);
            } else if (line.replaceAll("\t", "").equals("")) {
                raw.add(line);
            } else if (line.replaceAll(" ", "").equals("")) {
                raw.add(line);
            } else {
                raw.add(line.replaceAll("\n", "").replaceAll(" ", "").replaceAll("\t", ""));
            }
        }
        return raw;
    }

}
