package br.ufjf.dcc.gmr.core.vcs.types;

import br.ufjf.dcc.gmr.core.chunks.antlr4.model.DiffAnalyze;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icout
 */
public class MyFile {

    private String path;
    private Status status;
    private String type;
    private boolean renamed;
    private List<ConflictChunk> chuncks;
    private List<String> content;
    private DiffAnalyze diffAnalyze;

    public MyFile() {
        path = new String();
        status = Status.UNTRACKED;
        type = new String();
        renamed = false;
        chuncks = new ArrayList<>();
        diffAnalyze = new DiffAnalyze();
    }

    public MyFile(String path, Status status) {
        this.path = path;
        this.status = status;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the renamed
     */
    public boolean isRenamed() {
        return renamed;
    }

    /**
     * @param renamed the renamed to set
     */
    public void setRenamed(boolean renamed) {
        this.renamed = renamed;
    }

    /**
     * @return the chuncks
     */
    public List<ConflictChunk> getChuncks() {
        return chuncks;
    }

    /**
     * @param chuncks the chuncks to set
     */
    public void setChuncks(List<ConflictChunk> chuncks) {
        this.chuncks = chuncks;
    }

    /**
     * @return the content
     */
    public List<String> getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(List<String> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        String javaClassName = "";
        String[] aux = this.path.split("java", 2);
        if (aux.length == 2) {
            aux = aux[1].split(File.separator);

            for (String string : aux) {
                if (string.equals("")) {
                    continue;
                }

                javaClassName = javaClassName.concat(string);

                if (!aux[aux.length - 1].equals(string)) {
                    javaClassName = javaClassName.concat(".");
                }
            }

        } else {
            javaClassName = this.path;
        }

        return javaClassName;
    }

    /**
     * @return the diffAnalyze
     */
    public DiffAnalyze getDiffAnalyze() {
        return diffAnalyze;
    }

    /**
     * @param diffAnalyze the diffAnalyze to set
     */
    public void setDiffAnalyze(DiffAnalyze diffAnalyze) {
        this.diffAnalyze = diffAnalyze;
    }

}
