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
     * @param id              Id for databases
     * @param name            Name of the project
     * @param url             URL of the project on GitHub
     * @param organization    Name of the organization that created the project
     * @param merges          List of all merges involved in the history of the 
     *                        project
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
     * @param name            Name of the project
     * @param url             URL of the project on GitHub
     * @param organization    Name of the organization that created the project
     * @param merges          List of all merges involved in the history of the 
     *                        project
     */
    public Project(String name, String url, String organization, List<Merge> merges) {
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
    
    public void addMerge(Merge merge){
        this.merges.add(merge);
    }
    
    

}
