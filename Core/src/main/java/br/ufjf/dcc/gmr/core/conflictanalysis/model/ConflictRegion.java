package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.Outmost;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConflictRegion {

    private final List<String> beforeContext;
    private final List<String> afterContext;
    private final List<String> v1;
    private final List<String> v2;
    private final List<String> solution;
    private final int beginLine;
    private final int separatorLine;
    private final int endLine;

    private final int originalV1StartLine;
    private final int originalV1StopLine;
    private final int originalV2StartLine;
    private final int originalV2StopLine;
    private List<SyntaxStructure> syntaxV1;
    private List<SyntaxStructure> syntaxV2;

    private DeveloperDecision developerDecision;

    public ConflictRegion(List<String> beforeContext, List<String> afterContext, List<String> v1, List<String> v2, List<String> solution, int beginLine, int separatorLine,
            int endLine, int originalV1StartLine, int originalV2StartLine) {

        this.beforeContext = beforeContext;
        this.afterContext = afterContext;
        this.v1 = v1;
        this.v2 = v2;
        this.solution = solution;
        this.beginLine = beginLine;
        this.separatorLine = separatorLine;
        this.endLine = endLine;
        this.originalV1StartLine = originalV1StartLine;
        if (this.originalV1StartLine == 0) {
            this.originalV1StopLine = 0;
        } else {
            this.originalV1StopLine = originalV1StartLine + (separatorLine - beginLine - 2);
        }
        this.originalV2StartLine = originalV2StartLine;
        if (this.originalV2StartLine == 0) {
            this.originalV2StopLine = 0;
        } else {
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

    public void setSyntaxV1SyntaxV2(String repositoryPath, String filePath, String v1Commit, String v2Commit, boolean useOutmost) throws IOException {
        try {
            if (this.originalV1StartLine == 0) {
                this.syntaxV1 = new ArrayList<>();
            } else {
                Git.checkout(v1Commit, repositoryPath);
                if (useOutmost) {
                    this.syntaxV1 = Outmost.outmostSyntaxStructure(filePath, this.originalV1StartLine, this.originalV1StopLine);
                } else {
                    this.syntaxV1 = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV1StartLine, this.originalV1StopLine);
                }

            }
            if (this.originalV2StartLine == 0) {
                this.syntaxV2 = new ArrayList<>();
            } else {
                Git.checkout(v2Commit, repositoryPath);
                if (useOutmost) {
                    this.syntaxV2 = Outmost.outmostSyntaxStructure(filePath, this.originalV2StartLine, this.originalV2StopLine);
                } else {
                    this.syntaxV2 = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV2StartLine, this.originalV2StopLine);
                }

            }
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

    public void setSyntaxV1SyntaxV2(String repositoryPath, String filePath, String extraFilePath, String v1Commit, String v2Commit, boolean useOutmost) throws IOException {
        try {
            if (this.originalV1StartLine == 0) {
                this.syntaxV1 = new ArrayList<>();
            } else {
                Git.checkout(v1Commit, repositoryPath);
                try {
                    if (useOutmost) {
                        this.syntaxV1 = Outmost.outmostSyntaxStructure(filePath, this.originalV1StartLine, this.originalV1StopLine);
                    } else {
                        this.syntaxV1 = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV1StartLine, this.originalV1StopLine);
                    }
                } catch (IOException ex) {
                    if (useOutmost) {
                        this.syntaxV1 = Outmost.outmostSyntaxStructure(filePath, this.originalV1StartLine, this.originalV1StopLine);
                    } else {
                        this.syntaxV1 = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV1StartLine, this.originalV1StopLine);
                    }
                }
            }
            if (this.originalV2StartLine == 0) {
                this.syntaxV2 = new ArrayList<>();
            } else {
                Git.checkout(v2Commit, repositoryPath);
                try {
                    if (useOutmost) {
                        this.syntaxV2 = Outmost.outmostSyntaxStructure(extraFilePath, this.originalV2StartLine, this.originalV2StopLine);
                    } else {
                        this.syntaxV2 = ConflictAnalysisTools.getStructureTypeInInterval(extraFilePath, this.originalV2StartLine, this.originalV2StopLine);
                    }
                } catch (IOException ex) {
                    if (useOutmost) {
                        this.syntaxV2 = Outmost.outmostSyntaxStructure(extraFilePath, this.originalV2StartLine, this.originalV2StopLine);
                    } else {
                        this.syntaxV2 = ConflictAnalysisTools.getStructureTypeInInterval(extraFilePath, this.originalV2StartLine, this.originalV2StopLine);
                    }
                }
            }
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
        str = str + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< (" + this.beginLine + ")\n";
        for (String line : this.v1) {
            str = str + line + "\n";
        }
        str = str + "============================== (" + this.separatorLine + ")\n";
        for (String line : this.v2) {
            str = str + line + "\n";
        }
        str = str + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>> (" + this.endLine + ")\n";
        for (String line : this.afterContext) {
            str = str + line + "\n";
        }
        str = str + "\n\n\n\n";
        if (this.syntaxV1 != null) {
            for (SyntaxStructure v1 : this.syntaxV1) {
                str = str + v1.getStructureType() + "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n" + v1.getText() + "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\n";
            }
        }
        if (this.syntaxV2 != null) {
            for (SyntaxStructure v2 : this.syntaxV2) {
                str = str + v2.getStructureType() + "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n" + v2.getText() + "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\n";
            }
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

    public String getV1StructureTypes() {
        if (this.syntaxV1 == null) {
            return "Extension not parseble!";
        } else if (this.originalV1StartLine == 0 || this.syntaxV1.isEmpty()) {
            return "Nothing";
        } else {
            String result = "";
            for (String str : this.getSortedStructureType(syntaxV1)) {
                result = result + "\n" + str;
            }
            result = result.replaceFirst("\n", "");
            return result;
        }
    }

    public String getV2StructureTypes() {
        if (this.syntaxV2 == null) {
            return "Extension not parseble!";
        } else if (this.originalV2StartLine == 0 || this.syntaxV2.isEmpty()) {
            return "Nothing";
        } else {
            String result = "";
            for (String str : this.getSortedStructureType(syntaxV2)) {
                result = result + "\n" + str;
            }
            result = result.replaceFirst("\n", "");
            return result;
        }
    }

    public String getTypeOfConflict() {
        List<String> v1SS = Arrays.asList(this.getV1StructureTypes().split("\n"));
        List<String> v2SS = Arrays.asList(this.getV2StructureTypes().split("\n"));
        List<String> tof = new ArrayList<>();
        String result = "";
        if (v1SS.contains("WARNING!") && v2SS.contains("WARNING!")) {
            result = "\nWARNING! [V1 & V2]";
            v1SS.remove("WARNING");
            v2SS.remove("WARNING");
        } else if (v1SS.contains("WARNING!")) {
            result = "\nWARNING! [V1]";
            v1SS.remove("WARNING");
        } else if (v2SS.contains("WARNING!")) {
            result = "\nWARNING! [V2]";
            v2SS.remove("WARNING");
        }
        for (String str : v1SS) {
            if (v2SS.contains(str)) {
                tof.add(str + " [V1 & V2]");
            } else {
                tof.add(str + " [V1]");
            }

        }
        for (String str : v2SS) {
            if (!tof.contains(str + " [V1 & V2]") && !tof.contains(str + " [V1]")) {
                tof.add(str + " [V2]");
            }
        }
        Collections.sort(tof);
        for(String str : tof){
            result = result + "\n" + str;
        }
        return result.replaceFirst("\n", "");
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

}
