/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictType;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author luan
 */
public class EstruturasLuan {

    int numMerges;
    int numConf;
    int mergeConflit;
    int numChunks;
    Map<DeveloperDecision, Integer> solucao;
    Map<ConflictType, Integer> tipoDeConflito;
    Map<String, Integer> ChunkDistribution;
     Map<String, ArrayList<Integer>> LinesNumbers;


    public Map<DeveloperDecision, Integer> getSolucao() {
        return solucao;
    }

    public void setSolucao(Map<DeveloperDecision, Integer> solucao) {
        this.solucao = solucao;
    }
    Map<String, Integer> estruturas;

    public EstruturasLuan() {

    }

    public int getNumMerges() {
        return numMerges;
    }

    public void setNumMerges(int numMerges) {
        this.numMerges = numMerges;
    }

    public int getNumConf() {
        return numConf;
    }

    public void setNumConf(int numConf) {
        this.numConf = numConf;
    }

    public int getMergeConflit() {
        return mergeConflit;
    }

    public void setMergeConflit(int mergeConflit) {
        this.mergeConflit = mergeConflit;
    }

    public int getNumChunks() {
        return numChunks;
    }

    public void setNumChunks(int numChunks) {
        this.numChunks = numChunks;
    }

    public Map<ConflictType, Integer> getTipoDeConflito() {
        return tipoDeConflito;
    }

    public void setTipoDeConflito(Map<ConflictType, Integer> tipoDeConflito) {
        this.tipoDeConflito = tipoDeConflito;
    }

    public Map<String, Integer> getEstruturas() {
        return estruturas;
    }

    public void setEstruturas(Map<String, Integer> estruturas) {
        this.estruturas = estruturas;
    }

    public Map<String, Integer> getChunkDistribution() {
        return ChunkDistribution;
    }

    public void setChunkDistribution(Map<String, Integer> ChunkDistribution) {
        this.ChunkDistribution = ChunkDistribution;
    }

    public Map<String, ArrayList<Integer>> getLinesNumbers() {
        return LinesNumbers;
    }

    public void setLinesNumbers(Map<String, ArrayList<Integer>> LinesNumbers) {
        this.LinesNumbers = LinesNumbers;
    }
    
}
