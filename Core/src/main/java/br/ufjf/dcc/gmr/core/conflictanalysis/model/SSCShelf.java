package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.util.List;

/**
 *
 * @author joao_lima
 */
public class SSCShelf {

    List<SyntaxStructure> normalAnalysis;
    List<SyntaxStructure> commentAnalysis;
    List<SyntaxStructure> outmostedNormalAnalysis;
    List<SyntaxStructure> outmostedCommentAnalysis;

    public SSCShelf(List<SyntaxStructure> normalAnalysis, List<SyntaxStructure> commentAnalysis, List<SyntaxStructure> outmostedNormalAnalysis, List<SyntaxStructure> outmostedCommentAnalysis) {
        this.normalAnalysis = normalAnalysis;
        this.commentAnalysis = commentAnalysis;
        this.outmostedNormalAnalysis = outmostedNormalAnalysis;
        this.outmostedCommentAnalysis = outmostedCommentAnalysis;
    }

    public SSCShelf(List<SyntaxStructure> normalAnalysis, List<SyntaxStructure> commentAnalysis) {
        this.normalAnalysis = normalAnalysis;
        this.commentAnalysis = commentAnalysis;
        this.outmostedNormalAnalysis = null;
        this.outmostedCommentAnalysis = null;
    }
    
    

    public List<SyntaxStructure> getNormalAnalysis() {
        return normalAnalysis;
    }

    public List<SyntaxStructure> getCommentAnalysis() {
        return commentAnalysis;
    }

    public List<SyntaxStructure> getOutmostedNormalAnalysis() {
        return outmostedNormalAnalysis;
    }

    public List<SyntaxStructure> getOutmostedCommentAnalysis() {
        return outmostedCommentAnalysis;
    }

    public List<SyntaxStructure> getAll() {
        if (this.normalAnalysis == null) {
            return null;
        } else {
            List<SyntaxStructure> result = this.normalAnalysis;
            result.addAll(this.commentAnalysis);
            return result;
        }
    }
    
    public List<SyntaxStructure> getAllOutmosted() {
        if (this.outmostedNormalAnalysis == null) {
            return null;
        } else {
            List<SyntaxStructure> result = this.outmostedNormalAnalysis;
            result.addAll(this.outmostedCommentAnalysis);
            return result;
        }
    }

}
