package br.ufjf.dcc.gmr.core.mergenature.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    
    public int getNumberOfMerges() {
        
        return merges.size();
    }
    
    public int getNumberOfConflicts() {
        int count = 0;
        for (Merge merge : merges) {
            count += merge.getConflicts().size();
        }
        return count;
    }
    
    public int getNumberOfConflictedMerges() {
        int count = 0;
        count = merges.stream().filter(merge -> (merge.getMergeType() == MergeType.CONFLICTED_MERGE || merge.getMergeType() == MergeType.CONFLICTED_MERGE_OF_UNRELATED_HISTORIES)).map(_item -> 1).reduce(count, Integer::sum);
        return count;
    }
    
    public int getNumberOfChunks() {
        int count = 0;
        for (Merge merge : merges) {
            count += merge.getNumberOfConflictRegions();
        }
        return count;
    }
    
    public  Map<DeveloperDecision, Integer>  getSolucoes() {
        
        int[] contaSolucao = new int[12];
        
        for (int i = 0; i < 12; i++) {
            contaSolucao[i] = 0;
        }
        
        merges.forEach(merge -> {
            merge.getConflicts().forEach(conflict -> {
                conflict.getConflictRegions().forEach(conflictRegion -> {
                    contaSolucao[DeveloperDecision.getIntFromEnum(conflictRegion.getDeveloperDecision()) - 1]++;
                });
            });
        });
        
     
        Map<DeveloperDecision, Integer> solucoes = new HashMap<>();
        
        for (int i = 0; i < 12; i++) {
            solucoes.put(DeveloperDecision.getEnumFromInt(i + 1), contaSolucao[i]);
        }
         
       
        
        return solucoes;
    }
    
    public Map<String, Integer> getEstruturas() {
        
        Map<String, Integer> estruturas = new HashMap<>();
        merges.forEach(merge -> {
            merge.getConflicts().forEach(conflict -> {
                conflict.getConflictRegions().forEach(conflictRegion -> {
                    Set<String> mySet = new HashSet<>(Arrays.asList(conflictRegion.getStructures()));
                    mySet.stream().filter(st -> (st != null && !st.isEmpty())).forEachOrdered(st -> {
                        for (String s : st.split("\n")) {
                            s=s.replaceAll(" ", "").replaceAll("\t","");
                            if(s.contains("extensionnotparseable") || s.contains("Untreatablegit'serror")){
                            }else{
                            if (estruturas.containsKey(s)) {
                                estruturas.put(s, estruturas.get(s) + 1);
                            } else {
                                estruturas.put(s, 1);
                            }
                            }
                        }
                    }); 
                });
            });
        });
       // Set teste = estruturas.entrySet();
       // System.out.println(teste);
        
        return estruturas;
    }
    
    public Map<ConflictType, Integer> getConflictType() {
        
        int[] conflicType = new int[12];
        
        for (int i = 0; i < 12; i++) {
            conflicType[i] = 0;
        }
        
        merges.forEach(merge -> {
            merge.getConflicts().forEach(conflict -> {
                conflicType[ConflictType.getIntFromEnum(conflict.getConflictType()) - 1]++;
                
            });
        });
        
        Map<ConflictType, Integer> conflicTypes = new HashMap<>();
        
         for (int i = 0; i < 12; i++) {
            conflicTypes.put(ConflictType.getEnumFromInt(i + 1), conflicType[i]);
        }
        
        return conflicTypes;
    }
}
