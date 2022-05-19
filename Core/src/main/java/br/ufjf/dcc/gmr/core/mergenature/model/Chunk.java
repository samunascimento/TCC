package br.ufjf.dcc.gmr.core.mergenature.model;

import br.ufjf.dcc.gmr.core.mergenature.model.*;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import java.util.List;

/**
 * Class to record the conflictFile regions in files
 *
 * @author João Pedro Lima
 * @since 13-11-2020
 */
public class Chunk {

    private int id;
    private transient ConflictFile conflictFile;
    private String chunkText;

    //IN CONFLICT
    private int firstPrefixLine;
    private int beginLine;
    private int separatorLine;
    private int endLine;
    private int lastSuffixLine;

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
     * @param conflict The conflictFile that the conflictRegion belongs
     * @param rawConflict The entire conflictFile with context
     * @param firstPrefixLine First line of prefix
     * @param beginLine The line that has the begin marker
     * @param separatorLine The line that has the separator marker
     * @param endLine The line that has the end marker
     * @param lastSuffixLine Last line of suffix
     * @param solutionText The solution of the conflictFile
     * @param developerDecision The decision that developer used to resolve the
     * conflictFile region
     * @param structures The language structures of the conflictFile region
     * @param outmostedStructures The language structures of the conflictFile
     * region outmosted
     * @param originalV1FirstLine The line first line of v1 in parent 1
     * @param originalV2FirstLine The line first line of v2 in parent 2
     */
    public Chunk(int id, ConflictFile conflict, String rawConflict, int firstPrefixLine, int beginLine, int separatorLine, int endLine, int lastSuffixLine, String solutionText, DeveloperDecision developerDecision, String structures, String outmostedStructures, int originalV1FirstLine, int originalV2FirstLine) {
        this.id = id;
        this.conflictFile = conflict;
        this.chunkText = rawConflict;
        this.firstPrefixLine = firstPrefixLine;
        this.beginLine = beginLine;
        this.separatorLine = separatorLine;
        this.endLine = endLine;
        this.lastSuffixLine = lastSuffixLine;
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
     * @param conflict The conflictFile that the conflictRegion belongs
     * @param rawConflict The entire conflictFile with context
     * @param firstPrefixLine First line of prefix
     * @param beginLine The line that has the begin marker
     * @param separatorLine The line that has the separator marker
     * @param endLine The line that has the end marker
     * @param lastSuffixLine Last line of suffix
     * @param solutionText The solution of the conflictFile
     * @param developerDecision The decision that developer used to resolve the
     * conflictFile region
     * @param structures The language structures of the conflictFile region
     * @param outmostedStructures The language structures of the conflictFile
     * region outmosted
     * @param originalV1FirstLine The line first line of v1 in parent 1
     * @param originalV2FirstLine The line first line of v2 in parent 2
     */
    public Chunk(ConflictFile conflict, String rawConflict, int firstPrefixLine, int beginLine, int separatorLine, int endLine, int lastSuffixLine, String solutionText, DeveloperDecision developerDecision, String structures, String outmostedStructures, int originalV1FirstLine, int originalV2FirstLine) {
        this.conflictFile = conflict;
        this.chunkText = rawConflict;
        this.firstPrefixLine = firstPrefixLine;
        this.beginLine = beginLine;
        this.separatorLine = separatorLine;
        this.endLine = endLine;
        this.lastSuffixLine = lastSuffixLine;
        this.solutionText = solutionText;
        this.developerDecision = developerDecision;
        this.structures = structures;
        this.outmostedStructures = outmostedStructures;
        this.originalV1FirstLine = originalV1FirstLine;
        this.originalV2FirstLine = originalV2FirstLine;
    }

    public Chunk() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ConflictFile getConflictFile() {
        return conflictFile;
    }

    public void setConflictFile(ConflictFile conflictFile) {
        this.conflictFile = conflictFile;
    }

    public String getChunkText() {
        return chunkText;
    }

    public List<String> getRawConflictList() {
        return MergeNatureTools.stringTextToListText(this.chunkText);
    }

    public void setChunkText(String chunkText) {
        this.chunkText = chunkText;
    }

    public int getFirstPrefixLine() {
        return firstPrefixLine;
    }

    public int getFirstPrefixIndex() {
        return firstPrefixLine - 1;
    }

    public void setFirstPrefixLine(int firstPrefixLine) {
        this.firstPrefixLine = firstPrefixLine;
    }

    public int getBeginLine() {
        return beginLine;
    }

    public int getBeginIndex() {
        return beginLine - 1;
    }

    public void setBeginLine(int beginLine) {
        this.beginLine = beginLine;
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

    public int getEndLine() {
        return endLine;
    }

    public int getEndIndex() {
        return endLine - 1;
    }

    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    public int getLastSuffixLine() {
        return lastSuffixLine;
    }

    public int getLastSuffixIndex() {
        return lastSuffixLine - 1;
    }

    public void setLastSuffixLine(int lastSuffixLine) {
        this.lastSuffixLine = lastSuffixLine;
    }

    public String getSolutionText() {
        return solutionText;
    }

    public String getSolutionTextWithoutContext() {
        if (developerDecision != DeveloperDecision.IMPRECISE
                && developerDecision != DeveloperDecision.FILE_DELETED
                && developerDecision != DeveloperDecision.DIFF_PROBLEM) {
            List<String> text = MergeNatureTools.stringTextToListText(solutionText);
            StringBuilder result = new StringBuilder("");
            for (int i = 1; i < text.size() - 1; i++) {
                result.append("\n").append(text.get(i));
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

    public List<String> getPrefixList(boolean bof) {
        if (this.chunkText.startsWith("<BOF>") && !bof) {
            return ListUtils.getSubList(this.getRawConflictList(), 1, this.beginLine - this.firstPrefixLine - 1);
        } else {
            return ListUtils.getSubList(this.getRawConflictList(), 0, this.beginLine - this.firstPrefixLine - 1);
        }
    }

    public String getPrefix(boolean bof) {
        return ListUtils.getTextListStringToString(this.getPrefixList(bof));
    }

    public String getBegin() {
        return this.getRawConflictList().get(this.beginLine - this.firstPrefixLine);
    }

    public List<String> getV1List() {
        return ListUtils.getSubList(this.getRawConflictList(), this.beginLine - this.firstPrefixLine + 1, this.separatorLine - this.firstPrefixLine - 1);
    }

    public String getV1() {
        return ListUtils.getTextListStringToString(this.getV1List());
    }

    public String getSeparator() {
        return this.getRawConflictList().get(this.separatorLine - this.firstPrefixLine);
    }

    public List<String> getV2List() {
        return ListUtils.getSubList(this.getRawConflictList(), this.separatorLine - this.firstPrefixLine + 1, this.endLine - this.firstPrefixLine - 1);
    }

    public String getV2() {
        return ListUtils.getTextListStringToString(this.getV2List());
    }

    public String getEnd() {
        return this.getRawConflictList().get(this.endLine - this.firstPrefixLine);
    }

    public List<String> getSuffixList(boolean sof) {
        if (this.chunkText.endsWith("EOF") && !sof) {
            return ListUtils.getSubList(this.getRawConflictList(), this.endLine - this.firstPrefixLine + 1, this.lastSuffixLine - this.firstPrefixLine);
        } else {
            return ListUtils.getSubList(this.getRawConflictList(), this.endLine - this.firstPrefixLine + 1, this.lastSuffixLine - this.firstPrefixLine - 1);
        }
    }

    public String getSuffix(boolean sof) {
        return ListUtils.getTextListStringToString(this.getSuffixList(sof));
    }

}
