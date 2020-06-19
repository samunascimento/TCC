package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Test class for outmost
 *
 * @author luan
 */
public class Outmost {

    public Outmost() {

    }

    public static List<SyntaxStructure> outmostSyntaxStructure(String filePath, int beginLine, int endLine) throws IOException {
        if (beginLine < 1 || endLine < 1) {
            return null;
        }
        try {
            int currentLine = beginLine;
            int currentColumn = 0;
            List<SyntaxStructure> rawList = null;
            List<SyntaxStructure> list = new ArrayList();
            SyntaxStructure auxStructure = null;
            if (filePath.endsWith(".java")) {
                rawList = ConflictAnalysisTools.analyzeJavaSyntaxTree(filePath);
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
                rawList = ConflictAnalysisTools.analyzeCPPSyntaxTree(filePath);
            } else if (filePath.endsWith(".py")) {
                rawList = ConflictAnalysisTools.analyzePythonSyntaxTree(filePath);
            } else {
                return null;
            }

            if (rawList != null) {
                while (currentLine <= endLine) {
                    auxStructure = null;
                    for (SyntaxStructure ss : rawList) {

                        if (ss.getStartLine() >= currentLine && ss.getStartLineStartColumn() >= currentColumn && ss.getStopLine() <= endLine) {
                            if (auxStructure == null) {
                                auxStructure = ss;
                            } else {
                                if (auxStructure.getStartLine() > ss.getStartLine()) {
                                    auxStructure = ss;
                                } else {
                                    if (auxStructure.getStartLine() == ss.getStartLine() && auxStructure.getStartLineStartColumn() > ss.getStartLineStartColumn()) {
                                        auxStructure = ss;
                                    }
                                }
                            }
                        }

                    }
                    if (auxStructure != null) {
                        list.add(auxStructure);
                        currentLine = auxStructure.getStopLine();
                        currentColumn = auxStructure.getStopLineStopColumn();
                    } else {
                        currentLine++;
                        currentColumn = 0;
                    }
                }

            } else {
                return null;
            }
            return list;
        } catch (IOException ex) {
            System.out.println("ERROR: FilePath of analyseSyntaxTree: " + filePath + " does not exist!");
            throw new IOException();
        }
    }
}
