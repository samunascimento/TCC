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

    private List<String> rawText;
    private List<String> beforeContext;
    private List<String> afterContext;
    private List<String> v1;
    private List<String> v2;
    private List<String> solution;
    private int beginLine;
    private int separatorLine;
    private int endLine;

    private int originalV1StartLine;
    private int originalV1StopLine;
    private int originalV2StartLine;
    private int originalV2StopLine;

    private List<SyntaxStructure> syntaxV1;
    private List<SyntaxStructure> syntaxV2;
    private List<SyntaxStructure> outmostedSyntaxV1;
    private List<SyntaxStructure> outmostedSyntaxV2;

    private List<String> typesOfConflicts;
    private List<String> outmostedTypesOfConflicts;

    private DeveloperDecision developerDecision;

    public ConflictRegion(List<String> rawText, List<String> beforeContext, List<String> afterContext, List<String> v1, List<String> v2, List<String> solution, int beginLine, int separatorLine,
            int endLine, int originalV1StartLine, int originalV2StartLine) {

        this.rawText = rawText;
        this.beforeContext = beforeContext;
        this.afterContext = afterContext;
        this.v1 = v1;
        this.v2 = v2;
        this.solution = solution;
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
        this.developerDecision = generateDeveloperDecision();

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

    public List<String> getAfterContext() {
        return afterContext;
    }

    public List<String> getBeforeContext() {
        return beforeContext;
    }

    public List<String> getV1() {
        return v1;
    }

    public List<String> getV2() {
        return v2;
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

    public String getTypeOfConflict() {
        String result = "";
        for (String str : this.typesOfConflicts) {
            result = result + "\n" + str;
        }
        return result.replaceFirst("\n", "");
    }

    public String getOutmostedTypeOfConflict() {
        String result = "";
        for (String str : this.outmostedTypesOfConflicts) {
            result = result + "\n" + str;
        }
        return result.replaceFirst("\n", "");
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
        String str = "";
        for (String line : this.beforeContext) {
            str = str + line + "\n";
        }
        for (String line : this.rawText) {
            str = str + line + "\n";
        }
        for (String line : this.afterContext) {
            str = str + line + "\n";
        }

        return str;
    }

    public String getSolutionForm() {
        String str = "";
        if (solution == null) {
            str = str + "The file was deleted!";
        } else {
            for (String line : this.solution) {
                str = str + "\n" + line;
            }
        }

        return str.replaceFirst("\n", "");
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
        if (this.originalV1StartLine < 0 || this.originalV2StartLine < 0) {
            this.typesOfConflicts = new ArrayList<>();
            this.typesOfConflicts.add("Untreatable error in Diff command!");
            this.outmostedTypesOfConflicts = new ArrayList<>();
            this.outmostedTypesOfConflicts.add("Untreatable error in Diff command!");
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
                this.typesOfConflicts = Translator.JavaTranslator(rawList);
                this.outmostedTypesOfConflicts = Translator.JavaTranslator(outmostedRawList);
            } else if (filePath.endsWith(".cpp") || filePath.endsWith(".h")) {
                this.typesOfConflicts = Translator.CPPTranslator(rawList);
                this.outmostedTypesOfConflicts = Translator.JavaTranslator(outmostedRawList);
            } else if (filePath.endsWith(".py")) {
                this.typesOfConflicts = rawList;
                this.outmostedTypesOfConflicts = outmostedRawList;
            } else {
                this.typesOfConflicts = rawList;
                this.outmostedTypesOfConflicts = outmostedRawList;
            }
            Collections.sort(this.typesOfConflicts);
            Collections.sort(this.outmostedTypesOfConflicts);
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

    private DeveloperDecision generateDeveloperDecision() {
        if (solution.contains("DELETED")) {
            return DeveloperDecision.DELETED;
        } else if (solution.isEmpty()) {
            return DeveloperDecision.IMPRECISE;
        } else if (solution.size() == 2) {
            return DeveloperDecision.NONE;
        } else if (containsNewCode()) {
            return DeveloperDecision.NEWCODE;
        } else if (solution.contains("POSTPONED")) {
            this.solution.clear();
            this.solution.add(this.getConflictForm());
            return DeveloperDecision.POSTPONED;
        } else {
            String rawSolution = ListUtils.getRawStringForm(ListUtils.getSubList(this.solution, 1, this.solution.size() - 2));
            String rawV1 = ListUtils.getRawStringForm(this.v1);
            String rawV2 = ListUtils.getRawStringForm(this.v2);

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

    private boolean containsNewCode() {

        List<String> rawSolution = ListUtils.getRawListStringForm(ListUtils.getSubList(this.solution, 1, this.solution.size() - 2));
        List<String> rawV1 = ListUtils.getRawListStringForm(this.v1);
        List<String> rawV2 = ListUtils.getRawListStringForm(this.v2);
        for (String line : rawSolution) {
            if (!(rawV1.contains(line) || rawV2.contains(line))) {
                return true;
            }
        }
        return false;
    }

    //----------------------------------------------------------------------------
    public List<String> getRawText() {
        return rawText;
    }

    public List<String> getSolution() {
        return solution;
    }

    public List<SyntaxStructure> getOutmostedSyntaxV1() {
        return outmostedSyntaxV1;
    }

    public List<SyntaxStructure> getOutmostedSyntaxV2() {
        return outmostedSyntaxV2;
    }

    public List<String> getOutmostedTypesOfConflicts() {
        return outmostedTypesOfConflicts;
    }
    
    public ConflictRegion(){}
   

    private int id;
    
    public void setRawText(List<String> rawText) {
        this.rawText = rawText;
    }

    public void setBeforeContext(List<String> beforeContext) {
        this.beforeContext = beforeContext;
    }

    public void setAfterContext(List<String> afterContext) {
        this.afterContext = afterContext;
    }

    public void setV1(List<String> v1) {
        this.v1 = v1;
    }

    public void setV2(List<String> v2) {
        this.v2 = v2;
    }

    public void setSolution(List<String> solution) {
        this.solution = solution;
    }

    public void setBeginLine(int beginLine) {
        this.beginLine = beginLine;
    }

    public void setSeparatorLine(int separatorLine) {
        this.separatorLine = separatorLine;
    }

    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    public void setOriginalV1StartLine(int originalV1StartLine) {
        this.originalV1StartLine = originalV1StartLine;
    }

    public void setOriginalV1StopLine(int originalV1StopLine) {
        this.originalV1StopLine = originalV1StopLine;
    }

    public void setOriginalV2StartLine(int originalV2StartLine) {
        this.originalV2StartLine = originalV2StartLine;
    }

    public void setOriginalV2StopLine(int originalV2StopLine) {
        this.originalV2StopLine = originalV2StopLine;
    }

    public void setSyntaxV1(List<SyntaxStructure> syntaxV1) {
        this.syntaxV1 = syntaxV1;
    }

    public void setSyntaxV2(List<SyntaxStructure> syntaxV2) {
        this.syntaxV2 = syntaxV2;
    }

    public void setTypesOfConflicts(List<String> typesOfConflicts) {
        this.typesOfConflicts = typesOfConflicts;
    }

    public void setOutmostedTypesOfConflicts(List<String> outmostedTypesOfConflicts) {
        this.outmostedTypesOfConflicts = outmostedTypesOfConflicts;
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     //----------------------------------------------------------------------------
}
