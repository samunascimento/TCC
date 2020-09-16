package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.Translator;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConflictRegion {

    private final String rawText;
    private final String beforeContext;
    private final String afterContext;
    private final String v1;
    private final int v1Size;
    private final String v2;
    private final int v2Size;
    private final String solution;
    private final int beginLine;
    private final int separatorLine;
    private final int endLine;

    private final int originalV1StartLine;
    private final int originalV1StopLine;
    private final int originalV2StartLine;
    private final int originalV2StopLine;

    private List<SyntaxStructure> syntaxV1;
    private List<SyntaxStructure> syntaxV2;
    private List<SyntaxStructure> outmostedSyntaxV1;
    private List<SyntaxStructure> outmostedSyntaxV2;

    private String typesOfConflicts;
    private String outmostedTypesOfConflicts;

    private DeveloperDecision developerDecision;

    public ConflictRegion(List<String> rawText, List<String> beforeContext, List<String> afterContext, List<String> v1, List<String> v2, List<String> solution, int beginLine, int separatorLine,
            int endLine, int originalV1StartLine, int originalV2StartLine) {

        this.rawText = ListUtils.getTextListStringToString(rawText);
        this.beforeContext = ListUtils.getTextListStringToString(beforeContext);
        this.afterContext = ListUtils.getTextListStringToString(afterContext);
        this.v1 = ListUtils.getTextListStringToString(v1);
        this.v1Size = v1.size();
        this.v2 = ListUtils.getTextListStringToString(v2);
        this.v2Size = v2.size();
        if (solution.contains("POSTPONED")) {
            this.solution = this.beforeContext + this.rawText + this.afterContext;
        } else {
            this.solution = ListUtils.getTextListStringToString(solution);
        }
        this.beginLine = beginLine;
        this.separatorLine = separatorLine;
        this.endLine = endLine;
        if (originalV1StartLine < 0) {
            this.originalV1StartLine = -1;
            this.originalV1StopLine = -1;
        } else if (originalV1StartLine == 0) {
            this.originalV1StartLine = 0;
            this.originalV1StopLine = 0;
        } else {
            this.originalV1StartLine = originalV1StartLine;
            this.originalV1StopLine = originalV1StartLine + (separatorLine - beginLine - 2);
        }
        if (originalV2StartLine < 0) {
            this.originalV2StartLine = -1;
            this.originalV2StopLine = -1;
        } else if (originalV2StartLine == 0) {
            this.originalV2StartLine = 0;
            this.originalV2StopLine = 0;
        } else {
            this.originalV2StartLine = originalV2StartLine;
            this.originalV2StopLine = originalV2StartLine + (endLine - separatorLine - 2);
        }
        this.developerDecision = generateDeveloperDecision(solution, v1, v2);

    }

    public int getOriginalV1StartLine() {
        return originalV1StartLine;
    }

    public int getOriginalV1StopLine() {
        return originalV1StopLine;
    }

    public int getOriginalV2StartLine() {
        return originalV2StartLine;
    }

    public int getOriginalV2StopLine() {
        return originalV2StopLine;
    }

    public int getOriginalV1FirstLine() {
        return originalV1StartLine;
    }

    public int getOriginalV2FirstLine() {
        return originalV2StartLine;
    }

    public List<SyntaxStructure> getSyntaxV1() {
        return syntaxV1;
    }

    public List<SyntaxStructure> getSyntaxV2() {
        return syntaxV2;
    }

    public List<SyntaxStructure> getSyntaxV1Outmost() {
        return outmostedSyntaxV1;
    }

    public List<SyntaxStructure> getSyntaxV2Outmost() {
        return outmostedSyntaxV2;
    }

    public String getAfterContext() {
        return afterContext;
    }

    public String getBeforeContext() {
        return beforeContext;
    }

    public String getV1() {
        return v1;
    }

    public int getV1Size() {
        return v1Size;
    }

    public String getV2() {
        return v2;
    }

    public int getV2Size() {
        return v2Size;
    }

    public int getBeginLine() {
        return beginLine;
    }

    public int getSeparatorLine() {
        return separatorLine;
    }

    public int getEndLine() {
        return endLine;
    }

    public String getDeveloperDecision() {
        return developerDecision.name();
    }

    public String getTypesOfConflict() {
        return typesOfConflicts;
    }

    public String getOutmostedTypeOfConflict() {
        return outmostedTypesOfConflicts;
    }

    public void setSyntaxV1SyntaxV2(String repositoryPath, String filePath, String v1Commit, String v2Commit) throws IOException {
        SSCShelf shelf;
        try {
            if (this.originalV1StartLine == 0) {
                this.syntaxV1 = new ArrayList<>();
                this.outmostedSyntaxV1 = new ArrayList<>();
            } else if (this.originalV1StartLine < 0) {
                this.syntaxV1 = null;
                this.outmostedSyntaxV1 = null;
            } else {
                Git.checkout(v1Commit, repositoryPath);
                shelf = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV1StartLine, this.originalV1StopLine);
                this.syntaxV1 = shelf.getAll();
                this.outmostedSyntaxV1 = shelf.getAllOutmosted();
            }
            if (this.originalV2StartLine == 0) {
                this.syntaxV2 = new ArrayList<>();
                this.outmostedSyntaxV2 = new ArrayList<>();
            } else if (this.originalV2StartLine < 0) {
                this.syntaxV2 = null;
                this.outmostedSyntaxV2 = null;
            } else {
                Git.checkout(v2Commit, repositoryPath);
                shelf = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV2StartLine, this.originalV2StopLine);
                this.syntaxV2 = shelf.getAll();
                this.outmostedSyntaxV2 = shelf.getAllOutmosted();
            }
            this.generateTypeOfConflict(filePath);
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("ERROR: LocalRepositoryNotAGitRepository error!");
            throw new IOException();
        } catch (CheckoutError ex) {
            System.out.println("ERROR: CheckoutError error!");
            throw new IOException();
        } catch (IOException ex) {
            throw new IOException();
        }
    }

    public void setSyntaxV1SyntaxV2(String repositoryPath, String filePath, String extraFilePath, String v1Commit, String v2Commit) throws IOException {
        SSCShelf shelf;
        try {
            if (this.originalV1StartLine == 0) {
                this.syntaxV1 = new ArrayList<>();
                this.outmostedSyntaxV1 = new ArrayList<>();
            } else if (this.originalV1StartLine < 0) {
                this.syntaxV1 = null;
                this.outmostedSyntaxV1 = null;
            } else {
                Git.checkout(v1Commit, repositoryPath);
                shelf = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV1StartLine, this.originalV1StopLine);
                this.syntaxV1 = shelf.getAll();
                this.outmostedSyntaxV1 = shelf.getAllOutmosted();
            }
            if (this.originalV2StartLine == 0) {
                this.syntaxV2 = new ArrayList<>();
                this.outmostedSyntaxV2 = new ArrayList<>();
            } else if (this.originalV2StartLine < 0) {
                this.syntaxV2 = null;
                this.outmostedSyntaxV2 = null;
            } else {
                Git.checkout(v2Commit, repositoryPath);
                shelf = ConflictAnalysisTools.getStructureTypeInInterval(extraFilePath, this.originalV2StartLine, this.originalV2StopLine);
                this.syntaxV2 = shelf.getAll();
                this.outmostedSyntaxV2 = shelf.getAllOutmosted();
            }
            this.generateTypeOfConflict(filePath);
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("ERROR: LocalRepositoryNotAGitRepository error!");
            throw new IOException();
        } catch (CheckoutError ex) {
            System.out.println("ERROR: CheckoutError error!");
            throw new IOException();
        } catch (IOException ex) {
            throw new IOException();
        }
    }

    public String getConflictForm() {
        return this.beforeContext + this.rawText + this.afterContext;
    }

    public String getSolutionForm() {
        if (solution == null) {
            return "The file was deleted!";
        } else {
            return solution;
        }

    }

    private List<String> getSortedStructureType(List<SyntaxStructure> list) {
        List<String> structureType = new ArrayList<>();
        for (SyntaxStructure struc : list) {
            if (!structureType.contains(struc.getStructureType())) {
                structureType.add(struc.getStructureType());
            }
        }
        Collections.sort(structureType);
        if (list.get(0).getWarning()) {
            structureType.add(0, "WARNING!");
        }
        return structureType;
    }

    private void generateTypeOfConflict(String filePath) {
        List<String> auxTypesOfConflicts;
        List<String> auxOutmostedTypesOfConflicts;
        if (this.originalV1StartLine < 0 || this.originalV2StartLine < 0) {
            this.typesOfConflicts = "Untreatable error in Diff command!";
            this.outmostedTypesOfConflicts = "Untreatable error in Diff command!";
        } else {
            List<String> rawList = this.getV1StructureTypes();
            for (String str : this.getV2StructureTypes()) {
                if (!rawList.contains(str)) {
                    rawList.add(str);
                }
            }
            List<String> outmostedRawList = this.getOutmostedV1StructureTypes();
            for (String str : this.getOutmostedV2StructureTypes()) {
                if (!outmostedRawList.contains(str)) {
                    outmostedRawList.add(str);
                }
            }
            Collections.sort(rawList);
            if (filePath.endsWith(".java")) {
                auxTypesOfConflicts = Translator.JavaTranslator(rawList);
                auxOutmostedTypesOfConflicts = Translator.JavaTranslator(outmostedRawList);
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
                auxTypesOfConflicts = Translator.CPPTranslator(rawList);
                auxOutmostedTypesOfConflicts = Translator.JavaTranslator(outmostedRawList);
            } else if (filePath.endsWith(".py")) {
                auxTypesOfConflicts = rawList;
                auxOutmostedTypesOfConflicts = outmostedRawList;
            } else {
                auxTypesOfConflicts = rawList;
                auxOutmostedTypesOfConflicts = outmostedRawList;
            }
            Collections.sort(auxTypesOfConflicts);
            Collections.sort(auxOutmostedTypesOfConflicts);
            this.typesOfConflicts = ListUtils.getTextListStringToString(auxTypesOfConflicts);
            this.outmostedTypesOfConflicts = ListUtils.getTextListStringToString(auxOutmostedTypesOfConflicts);
        }
    }

    public List<String> getV1StructureTypes() {
        List<String> result = new ArrayList<>();
        if (this.syntaxV1 == null) {
            result.add("Extension not parseble!");
        } else if (this.originalV1StartLine == 0 || this.syntaxV1.isEmpty()) {
            result.add("Nothing");
        } else {
            for (String str : this.getSortedStructureType(syntaxV1)) {
                result.add(str);
            }
        }
        return result;
    }

    public List<String> getV2StructureTypes() {
        List<String> result = new ArrayList<>();
        if (this.syntaxV2 == null) {
            result.add("Extension not parseble!");
        } else if (this.originalV2StartLine == 0 || this.syntaxV2.isEmpty()) {
            result.add("Nothing");
        } else {
            for (String str : this.getSortedStructureType(syntaxV2)) {
                result.add(str);
            }
        }
        return result;
    }

    public List<String> getOutmostedV1StructureTypes() {
        List<String> result = new ArrayList<>();
        if (this.outmostedSyntaxV1 == null) {
            result.add("Extension not parseble!");
        } else if (this.originalV1StartLine == 0 || this.outmostedSyntaxV1.isEmpty()) {
            result.add("Nothing");
        } else {
            for (String str : this.getSortedStructureType(outmostedSyntaxV1)) {
                result.add(str);
            }
        }
        return result;
    }

    public List<String> getOutmostedV2StructureTypes() {
        List<String> result = new ArrayList<>();
        if (this.outmostedSyntaxV2 == null) {
            result.add("Extension not parseble!");
        } else if (this.originalV2StartLine == 0 || this.outmostedSyntaxV2.isEmpty()) {
            result.add("Nothing");
        } else {
            for (String str : this.getSortedStructureType(outmostedSyntaxV2)) {
                result.add(str);
            }
        }
        return result;
    }

    private DeveloperDecision generateDeveloperDecision(List<String> solution, List<String> v1, List<String> v2) {
        if (solution.contains("DELETED")) {
            return DeveloperDecision.DELETED;
        } else if (solution.isEmpty()) {
            return DeveloperDecision.IMPRECISE;
        } else if (solution.size() == 2) {
            return DeveloperDecision.NONE;
        } else if (containsNewCode(solution, v1, v2)) {
            return DeveloperDecision.NEWCODE;
        } else if (solution.contains("POSTPONED")) {
            return DeveloperDecision.POSTPONED;
        } else {
            String rawSolution = ListUtils.getRawStringForm(ListUtils.getSubList(solution, 1, solution.size() - 2));
            String rawV1 = ListUtils.getRawStringForm(v1);
            String rawV2 = ListUtils.getRawStringForm(v2);

            if (rawSolution.equals(rawV1)) {
                return DeveloperDecision.VERSION1;
            } else if (rawSolution.equals(rawV2)) {
                return DeveloperDecision.VERSION2;
            } else if (rawSolution.equals(rawV1 + rawV2) || rawSolution.equals(rawV2 + rawV1)) {
                return DeveloperDecision.CONCATENATION;
            } else {
                return DeveloperDecision.COMBINATION;
            }
        }
    }

    private boolean containsNewCode(List<String> solution, List<String> v1, List<String> v2) {

        List<String> rawSolution = ListUtils.getRawListStringForm(ListUtils.getSubList(solution, 1, solution.size() - 2));
        List<String> rawV1 = ListUtils.getRawListStringForm(v1);
        List<String> rawV2 = ListUtils.getRawListStringForm(v2);
        for (String line : rawSolution) {
            if (!(rawV1.contains(line) || rawV2.contains(line))) {
                return true;
            }
        }
        return false;
    }
}
