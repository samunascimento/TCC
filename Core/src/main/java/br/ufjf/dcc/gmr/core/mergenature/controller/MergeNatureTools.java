package br.ufjf.dcc.gmr.core.mergenature.controller;

import java.io.File;

/**
 * Auxiliaries methods for MergeNature
 *
 * @author João Pedro Lima
 * @since 14-10-2020
 */
public class MergeNatureTools {
    
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
    
}
