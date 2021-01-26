package br.ufjf.dcc.gmr.core.mergenature.model;

import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;

/**
 * Class to record the conflict regions in files
 *
 * @author João Pedro Lima
 * @since 13-11-2020
 */
public class ConflictRegion {

    private int id;
    private transient Conflict conflict;
    private String rawConflict;

    //IN CONFLICT
    private String beforeContext;   // BEFORE CONTEXT
    private int beginLine;          // <<<<<<< PARENT 1
    private String v1Text;          // V1 TEXT
    private int separatorLine;      // =======
    private String v2Text;          // V2 TEXT
    private int endLine;            // >>>>>>> PARENT 2
    private String afterContext;    // AFTER CONTEXT

    //AFTER CONFLICT (SOLUTION)
    private String solutionText;
    private DeveloperDecision developerDecision;

    //BEFORE CONFLICT
    private String structures;
    private String outmostedStructures;
    private int originalV1FirstLine;
    private int originalV2FirstLine;

    /**
     * Normal constructor
     *
     * @param id Id for databases
     * @param conflict The conflict that the conflictRegion belongs
     * @param rawConflict The entire conflict with context
     * @param beforeContext The context before the conflict
     * @param beginLine The line that has the begin marker
     * @param v1Text The parent 1 text in the conflict region
     * @param separatorLine The line that has the separator marker
     * @param v2Text The parent 2 text in the conflict region
     * @param endLine The line that has the end marker
     * @param afterContext The context after the conflict
     * @param solutionText The solution of the conflict
     * @param developerDecision The decision that developer used to resolve the
     * conflict region
     * @param structures The language structures of the conflict region
     * @param outmostedStructures The language structures of the conflict region
     * outmosted
     * @param originalV1FirstLine The line first line of v1 in parent 1
     * @param originalV2FirstLine The line first line of v2 in parent 2
     */
    public ConflictRegion(int id, Conflict conflict, String rawConflict, String beforeContext, int beginLine, String v1Text, int separatorLine, String v2Text, int endLine, String afterContext, String solutionText, DeveloperDecision developerDecision, String structures, String outmostedStructures, int originalV1FirstLine, int originalV2FirstLine) {
        this.id = id;
        this.conflict = conflict;
        this.beforeContext = beforeContext;
        this.beginLine = beginLine;
        this.v1Text = v1Text;
        this.separatorLine = separatorLine;
        this.v2Text = v2Text;
        this.endLine = endLine;
        this.afterContext = afterContext;
        this.solutionText = solutionText;
        this.developerDecision = developerDecision;
        this.structures = structures;
        this.outmostedStructures = outmostedStructures;
        this.originalV1FirstLine = originalV1FirstLine;
        this.originalV2FirstLine = originalV2FirstLine;
    }

    /**
     * No id constructor
     *
     * @param conflict The conflict that the conflictRegion belongs
     * @param rawConflict The entire conflict with context
     * @param beforeContext The context before the conflict
     * @param beginLine The line that has the begin marker
     * @param v1Text The parent 1 text in the conflict region
     * @param separatorLine The line that has the separator marker
     * @param v2Text The parent 2 text in the conflict region
     * @param endLine The line that has the end marker
     * @param afterContext The context after the conflict
     * @param solutionText The solution of the conflict
     * @param developerDecision The decision that developer used to resolve the
     * conflict region
     * @param structures The language structures of the conflict region
     * @param outmostedStructures The language structures of the conflict region
     * outmosted
     * @param originalV1FirstLine The line first line of v1 in parent 1
     * @param originalV2FirstLine The line first line of v2 in parent 2
     */
    public ConflictRegion(Conflict conflict, String rawConflict, String beforeContext, int beginLine, String v1Text, int separatorLine, String v2Text, int endLine, String afterContext, String solutionText, DeveloperDecision developerDecision, String structures, String outmostedStructures, int originalV1FirstLine, int originalV2FirstLine) {
        this.conflict = conflict;
        this.beforeContext = beforeContext;
        this.beginLine = beginLine;
        this.v1Text = v1Text;
        this.separatorLine = separatorLine;
        this.v2Text = v2Text;
        this.endLine = endLine;
        this.afterContext = afterContext;
        this.solutionText = solutionText;
        this.developerDecision = developerDecision;
        this.structures = structures;
        this.outmostedStructures = outmostedStructures;
        this.originalV1FirstLine = originalV1FirstLine;
        this.originalV2FirstLine = originalV2FirstLine;
    }

    public ConflictRegion() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conflict getConflict() {
        return conflict;
    }

    public void setConflict(Conflict conflict) {
        this.conflict = conflict;
    }

    public String getRawConflict() {
        return rawConflict;
    }

    public void setRawConflict(String rawConflict) {
        this.rawConflict = rawConflict;
    }

    public String getBeforeContext() {
        return beforeContext;
    }

    public int getBeforeContextSize() {
        int size = 0;
        for (String str : beforeContext.replaceAll("\n", " \n").split("\n")) {
            if (!str.equals("<SOF>")) {
                size++;
            }
        }
        return size;
    }

    public void setBeforeContext(String beforeContext) {
        this.beforeContext = beforeContext;
    }

    public int getBeginLine() {
        return beginLine;
    }
    
    public int getBeginIndex() {
        return beginLine - 1;
    }

    public String getBeginText() {
        for (String str : rawConflict.replaceAll("\n", " \n").split("\n")) {
            if (str.startsWith("<<<<<<< HEAD")) {
                return str;
            }
        }
        return "Not found";
    }

    public void setBeginLine(int beginLine) {
        this.beginLine = beginLine;
    }

    public String getV1Text() {
        return v1Text;
    }

    public void setV1Text(String v1Text) {
        this.v1Text = v1Text;
    }

    public int getSeparatorLine() {
        return separatorLine;
    }
    
    public int getSeparatorIndex() {
        return separatorLine - 1;
    }

    public void setSeparatorLine(int separatorLine) {
        this.separatorLine = separatorLine;
    }

    public String getV2Text() {
        return v2Text;
    }

    public void setV2Text(String v2Text) {
        this.v2Text = v2Text;
    }

    public int getEndLine() {
        return endLine;
    }
    
    public int getEndIndex() {
        return endLine - 1;
    }

    public String getEndText() {
        for (String str : rawConflict.replaceAll("\n", " \n").split("\n")) {
            if (MergeNatureTools.checkIfIsEnd(str)) {
                return str;
            }
        }
        return "Not found";
    }

    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    public String getAfterContext() {
        return afterContext;
    }

    public int getAfterContextSize() {
        int size = 0;
        for (String str : afterContext.replaceAll("\n", " \n").split("\n")) {
            if (!str.equals("<EOF>")) {
                size++;
            }
        }
        return size;
    }

    public void setAfterContext(String afterContext) {
        this.afterContext = afterContext;
    }

    public String getSolutionText() {
        return solutionText;
    }

    public String getSolutionTextWithoutContext() {
        if (developerDecision != DeveloperDecision.IMPRECISE
                && developerDecision != DeveloperDecision.FILE_DELETED
                && developerDecision != DeveloperDecision.POSTPONED
                && developerDecision != DeveloperDecision.DIFF_PROBLEM) {
            String[] auxArray = solutionText.split("\n");
            StringBuilder result = new StringBuilder("");
            for (int i = 1; i < auxArray.length - 1; i++) {
                result.append("\n").append(auxArray[i]);
            }
            return result.toString().replaceFirst("\n", "");
        } else {
            return solutionText;
        }
    }

    public void setSolutionText(String solutionText) {
        this.solutionText = solutionText;
    }

    public DeveloperDecision getDeveloperDecision() {
        return developerDecision;
    }

    public void setDeveloperDecision(DeveloperDecision developerDecision) {
        this.developerDecision = developerDecision;
    }

    public String getStructures() {
        return structures;
    }

    public void setStructures(String structures) {
        this.structures = structures;
    }

    public String getOutmostedStructures() {
        return outmostedStructures;
    }

    public void setOutmostedStructures(String outmostedStructures) {
        this.outmostedStructures = outmostedStructures;
    }

    public int getOriginalV1FirstLine() {
        return originalV1FirstLine;
    }

    public int getOriginalV1FinalLine() {
        return (originalV1FirstLine + (separatorLine - beginLine - 2));
    }

    public void setOriginalV1FirstLine(int originalV1FirstLine) {
        this.originalV1FirstLine = originalV1FirstLine;
    }

    public int getOriginalV2FirstLine() {
        return originalV2FirstLine;
    }

    public int getOriginalV2FinalLine() {
        return (originalV2FirstLine + (endLine - separatorLine - 2));
    }

    public void setOriginalV2FirstLine(int originalV2FirstLine) {
        this.originalV2FirstLine = originalV2FirstLine;
    }

}
