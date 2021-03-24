package br.ufjf.dcc.gmr.core.chunks.antlr4.model;

import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.DependencyType;
import br.ufjf.dcc.gmr.core.vcs.types.ConflictChunk;

public class Dependency {
    private ConflictChunk chunk1;
    private ConflictChunk chunk2;
    private DependencyType type;

    public Dependency(ConflictChunk chunk1, ConflictChunk chunk2, DependencyType type) {
        this.chunk1 = chunk1;
        this.chunk2 = chunk2;
        this.type = type;
    }

    public DependencyType getType() {
        return type;
    }

    public void setType(DependencyType type) {
        this.type = type;
    }

    public ConflictChunk getChunk1() {
        return chunk1;
    }

    public void setChunk1(ConflictChunk chunk1) {
        this.chunk1 = chunk1;
    }

    public ConflictChunk getChunk2() {
        return chunk2;
    }

    public void setChunk2(ConflictChunk chunk2) {
        this.chunk2 = chunk2;
    }
    
}
