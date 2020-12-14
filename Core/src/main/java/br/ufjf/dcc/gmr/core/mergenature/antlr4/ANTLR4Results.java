package br.ufjf.dcc.gmr.core.mergenature.antlr4;

import java.util.List;

/**
 * Class to record results from ANTLR4 analysis
 *
 * @author João Pedro Lima
 * @since 14-12-2020
 */
public class ANTLR4Results {

    List<SyntaxStructure> normalAnalysis;
    List<SyntaxStructure> commentAnalysis;
    List<SyntaxStructure> outmostedNormalAnalysis;
    List<SyntaxStructure> outmostedCommentAnalysis;

    public ANTLR4Results(List<SyntaxStructure> normalAnalysis, List<SyntaxStructure> commentAnalysis, List<SyntaxStructure> outmostedNormalAnalysis, List<SyntaxStructure> outmostedCommentAnalysis) {
        this.normalAnalysis = normalAnalysis;
        this.commentAnalysis = commentAnalysis;
        this.outmostedNormalAnalysis = outmostedNormalAnalysis;
        this.outmostedCommentAnalysis = outmostedCommentAnalysis;
    }

    public ANTLR4Results(List<SyntaxStructure> normalAnalysis, List<SyntaxStructure> commentAnalysis) {
        this.normalAnalysis = normalAnalysis;
        this.commentAnalysis = commentAnalysis;
        this.outmostedNormalAnalysis = null;
        this.outmostedCommentAnalysis = null;
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

    public List<SyntaxStructure> getOutmostedNormalAnalysis() {
        return outmostedNormalAnalysis;
    }

    public void setOutmostedNormalAnalysis(List<SyntaxStructure> outmostedNormalAnalysis) {
        this.outmostedNormalAnalysis = outmostedNormalAnalysis;
    }

    public List<SyntaxStructure> getOutmostedCommentAnalysis() {
        return outmostedCommentAnalysis;
    }

    public void setOutmostedCommentAnalysis(List<SyntaxStructure> outmostedCommentAnalysis) {
        this.outmostedCommentAnalysis = outmostedCommentAnalysis;
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
