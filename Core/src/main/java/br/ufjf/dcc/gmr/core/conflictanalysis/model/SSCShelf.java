
package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.util.List;

/**
 *
 * @author joao_lima
 */
public class SSCShelf {
    
    List<SyntaxStructure> normalAnalysis;
    List<SyntaxStructure> commentAnalysis;

    public SSCShelf(List<SyntaxStructure> normalAnalysis, List<SyntaxStructure> commentAnalysis) {
        this.normalAnalysis = normalAnalysis;
        this.commentAnalysis = commentAnalysis;
    }
    
    public List<SyntaxStructure> getNormalAnalysis() {
        return normalAnalysis;
    }

    public void setNormalAnalysis(List<SyntaxStructure> normalAnalysis) {
        this.normalAnalysis = normalAnalysis;
    }

    public List<SyntaxStructure> getCommentAnalysis() {
        return commentAnalysis;
    }

    public void setCommentAnalysis(List<SyntaxStructure> commentAnalysis) {
        this.commentAnalysis = commentAnalysis;
    }
    
    
}
