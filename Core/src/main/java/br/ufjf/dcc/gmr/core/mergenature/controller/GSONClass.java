package br.ufjf.dcc.gmr.core.mergenature.controller;


import br.ufjf.dcc.gmr.core.mergenature.model.Chunk;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import br.ufjf.dcc.gmr.core.mergenature.model.Merge;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import br.ufjf.dcc.gmr.core.vcs.test.EstruturasLuan;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;

/**
 *
 * @author Luan
 */


public class GSONClass {

    /**
     * Function that save, in a GSON format, a "Project" list in the provided
     * path.
     *
     * @param path Path where the GSON will be saved
     * @param event Object that will be saved in GSON format
     * @throws IOException
     */
    public static void save(String path, Project project) throws IOException {

        Gson toSave = new Gson();
        String toJson = toSave.toJson(project);
        File myFile = new File(path);
        myFile.createNewFile();
        FileOutputStream fOut = new FileOutputStream(myFile);
        OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
        myOutWriter.append(toJson);
        myOutWriter.close();
        fOut.close();

    }

        public static void saveRep(String path, EstruturasLuan rep ) throws IOException {

        Gson toSave = new Gson();
        String toJson = toSave.toJson(rep);
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
     * an List of the object "Project" format.
     *
     * @param path path where the GSON is saved
     * @return Project
     * @throws FileNotFoundException
     */
    public static Project readProject(String path) throws FileNotFoundException {

        Gson recover = new Gson();
        Project project = null;
        FileReader read = new FileReader(path);
        Type myType = new TypeToken<Project>() {
        }.getType();

        project = recover.fromJson(read, myType);
        
        for (Merge merge : project.getMerges()) {
            merge.setProject(project);
            for (ConflictFile conflict : merge.getConflictFiles()) {
                conflict.setMerge(merge);
                for (Chunk chunk : conflict.getChunks()) {
                    chunk.setConflictFile(conflict);
                }
            }
        }
        
        return project;
        
    }

}
