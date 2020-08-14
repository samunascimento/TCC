package br.ufjf.dcc.gmr.core.chunks.antlr4.binding;

import java.io.File;

public class PackageBinding extends BaseBinding{
    
    public PackageBinding(){
       
    }
    public String getPath(){
        String path = "";
        for (String string : super.getName().split("\\.")) {
            path = path.concat(string).concat(File.separator);
        }
        return path;
    }
}
