package br.ufjf.dcc.gmr.core.mergenature.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to record basic info about Git projects and store a list of all merges
 *
 * @author João Pedro Lima
 * @since 10-10-2020
 */
public class Project {

    private int id;
    private String name;
    private String url;
    private String organization;
    List<Merge> merges;

    /**
     * Normal constructor
     *
     * @param id Id for databases
     * @param name Name of the project
     * @param url URL of the project on GitHub
     * @param organization Name of the organization that created the project
     * @param merges List of all merges involved in the history of the project
     */
    public Project(int id, String name, String url, String organization, List<Merge> merges) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.organization = organization;
        this.merges = merges;
    }

    /**
     * No id constructor
     *
     * @param name Name of the project
     * @param url URL of the project on GitHub
     * @param organization Name of the organization that created the project
     * @param merges List of all merges involved in the history of the project
     */
    public Project(String name, String url, String organization, List<Merge> merges) {
        this.id = 0;
        this.name = name;
        this.url = url;
        this.organization = organization;
        this.merges = merges;
    }

    public Project() {
        this.merges = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public List<Merge> getMerges() {
        return merges;
    }

    public void setMerges(List<Merge> merges) {
        this.merges = merges;
    }

    public void addMerge(Merge merge) {
        this.merges.add(merge);
    }

    public int numberOfConflictFiles() {
        int cont = 0;
        for (Merge merge : merges) {
            cont += merge.getConflictFiles().size();
        }
        return cont;
    }

    public int numberOfChunks() {
        int cont = 0;
        for (Merge merge : merges) {
            for (ConflictFile conflictFile : merge.getConflictFiles()) {
                cont += conflictFile.getChunks().size();
            }
        }
        return cont;
    }

    public int numberOfMergeType(MergeType mergeType) {
        int cont = 0;
        for (Merge merge : merges) {
            if (merge.getMergeType() == mergeType) {
                cont++;
            }
        }
        return cont;
    }

    public int numberOfConflictFileType(ConflictFileType conflictFileType) {
        int cont = 0;
        for (Merge merge : merges) {
            for (ConflictFile conflictFile : merge.getConflictFiles()) {
                if (conflictFile.getConflictFileType() == conflictFileType) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public int numberOfConflictFileType(DeveloperDecision developerDecision) {
        int cont = 0;
        for (Merge merge : merges) {
            for (ConflictFile conflictFile : merge.getConflictFiles()) {
                for (Chunk chunk : conflictFile.getChunks()) {
                    if (chunk.getDeveloperDecision() == developerDecision) {
                        cont++;
                    }
                }
            }
        }
        return cont;
    }

    public int numberOfLanguagesConstructs() {
        int cont = 0;
        for (Merge merge : merges) {
            for (ConflictFile conflictFile : merge.getConflictFiles()) {
                for (Chunk chunk : conflictFile.getChunks()) {
                    if (!chunk.getLanguageConstructs().contains("has an extension not parseable!") 
                            && !chunk.getLanguageConstructs().contains("Untreatable git's error")
                            && !chunk.getLanguageConstructs().replaceAll("\n", "").replaceAll("\t", "").replaceAll(" ", "").equals("")) {
                        cont += chunk.numberOfLanguageConstructs();
                    }
                }
            }
        }
        return cont;
    }

    public int numberOfLanguagesConstructs(String languageConstruct) {
        int cont = 0;
        for (Merge merge : merges) {
            for (ConflictFile conflictFile : merge.getConflictFiles()) {
                for (Chunk chunk : conflictFile.getChunks()) {
                    if (chunk.getLanguageConstructs().contains(languageConstruct)) {
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
}
