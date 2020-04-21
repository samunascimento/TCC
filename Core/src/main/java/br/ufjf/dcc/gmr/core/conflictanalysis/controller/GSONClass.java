package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author joao_lima
 */
public class GSONClass {

    public static void createGson(String path, String save, String saveFileName) throws IOException {

        File myFile = new File(path + "/" + saveFileName);
        myFile.createNewFile();
        FileOutputStream fOut = new FileOutputStream(myFile);
        OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
        myOutWriter.append(save);
        myOutWriter.close();
        fOut.close();

    }
}
