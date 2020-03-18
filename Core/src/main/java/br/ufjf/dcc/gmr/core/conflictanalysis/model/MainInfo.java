package br.ufjf.dcc.gmr.core.conflictanalysis.model;

/**
 *
 * @author joao_lima
 */
public class MainInfo {

    private String repositoryPath;
    private int numContext;

    public String getRepositoryPath() {
        return repositoryPath;
    }

    public int getNumContext() {
        return numContext;
    }

    public MainInfo(String repositoryPath, int numContext) {
        this.repositoryPath = repositoryPath;
        this.numContext = numContext;
    }

}
