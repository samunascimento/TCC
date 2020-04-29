package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.MergeEvent;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.List;

/**
 *
 * @author Luan
 */
public class GSONClass {

    /**
     * Function that save, in a GSON format, a "MergeEvent" list in the provided
     * path.
     *
     * @param path Path where the GSON will be saved
     * @param event Object that will be saved in GSON format
     * @throws IOException
     */
    public static void save(String path, List<MergeEvent> event) throws IOException {

        Gson toSave = new Gson();
        String toJson = toSave.toJson(event);
        File myFile = new File(path);
        myFile.createNewFile();
        FileOutputStream fOut = new FileOutputStream(myFile);
        OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
        myOutWriter.append(toJson);
        myOutWriter.close();
        fOut.close();

    }

    /**
     * Function that receives a path that contains a GSON file and return it on
     * an List of the object "MergeEVent" format.
     *
     * @param path path where the GSON is saved
     * @return MergeEvent List
     * @throws FileNotFoundException
     */
    public static List<MergeEvent> read(String path) throws FileNotFoundException {

        Gson recover = new Gson();
        List<MergeEvent> get = null;
        FileReader read = new FileReader(path);
        Type myType = new TypeToken<List<MergeEvent>>() {
        }.getType();
        List<MergeEvent> mergeEvents = recover.fromJson(read, myType);

        return mergeEvents;
    }

}
