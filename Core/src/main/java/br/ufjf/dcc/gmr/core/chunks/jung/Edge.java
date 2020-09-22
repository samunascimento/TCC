package br.ufjf.dcc.gmr.core.chunks.jung;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.BaseBinding;
import java.util.ArrayList;
import java.util.List;

public class Edge {

    private int id;
    private List<BaseBinding> dependencies;
    
    public Edge(int id, List<BaseBinding> dependencies) {
        this.id = id;
        this.dependencies = dependencies;
    }
    
    public Edge() {
        this.dependencies = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BaseBinding> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<BaseBinding> dependencies) {
        this.dependencies = dependencies;
    }
    
}
