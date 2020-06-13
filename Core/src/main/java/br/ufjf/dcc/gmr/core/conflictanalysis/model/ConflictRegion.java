package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.ConflictAnalysisTools;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.Outmost;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.utils.ListUtils;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        if (originalV1StartLine > 0) {
            this.originalV1StopLine = originalV1StartLine + (separatorLine - beginLine - 2);
        } else {
            this.originalV1StopLine = -1;
        }
        this.originalV2StartLine = originalV2StartLine;
        if (originalV2StartLine > 0) {
            this.originalV2StopLine = originalV2StartLine + (endLine - separatorLine - 2);
        } else {
            this.originalV2StopLine = -1;
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
            if (this.originalV1StartLine > 0) {
                Git.checkout(v1Commit, repositoryPath);
                if(useOutmost)
                    this.syntaxV1 = Outmost.outmostSyntaxStructure(filePath, this.originalV1StartLine, this.originalV1StopLine);
                else
                    this.syntaxV1 = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV1StartLine, this.originalV1StopLine);
                Git.checkout("master", repositoryPath);
            }
            if (this.originalV2StartLine > 0) {
                Git.checkout(v2Commit, repositoryPath);
                if(useOutmost)
                    this.syntaxV2 = Outmost.outmostSyntaxStructure(filePath, this.originalV2StartLine, this.originalV2StopLine);
                else
                    this.syntaxV2 = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV2StartLine, this.originalV2StopLine);
                Git.checkout("master", repositoryPath);
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
            if (this.originalV1StartLine > 0) {
                Git.checkout(v1Commit, repositoryPath);
                try {
                    if(useOutmost)
                    this.syntaxV1 = Outmost.outmostSyntaxStructure(filePath, this.originalV1StartLine, this.originalV1StopLine);
                else
                    this.syntaxV1 = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV1StartLine, this.originalV1StopLine);
                } catch (IOException ex) {
                    if(useOutmost)
                    this.syntaxV1 = Outmost.outmostSyntaxStructure(filePath, this.originalV1StartLine, this.originalV1StopLine);
                else
                    this.syntaxV1 = ConflictAnalysisTools.getStructureTypeInInterval(filePath, this.originalV1StartLine, this.originalV1StopLine);
                }
                Git.checkout("master", repositoryPath);
            }
            if (this.originalV2StartLine > 0) {
                Git.checkout(v2Commit, repositoryPath);
                try {
                    if(useOutmost)
                    this.syntaxV2 = Outmost.outmostSyntaxStructure(extraFilePath, this.originalV2StartLine, this.originalV2StopLine);
                else
                    this.syntaxV2 = ConflictAnalysisTools.getStructureTypeInInterval(extraFilePath, this.originalV2StartLine, this.originalV2StopLine);
                } catch (IOException ex) {
                    if(useOutmost)
                    this.syntaxV2 = Outmost.outmostSyntaxStructure(extraFilePath, this.originalV2StartLine, this.originalV2StopLine);
                else
                    this.syntaxV2 = ConflictAnalysisTools.getStructureTypeInInterval(extraFilePath, this.originalV2StartLine, this.originalV2StopLine);
                }
                Git.checkout("master", repositoryPath);
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

    public String getV1StructureTypes() {
        if (syntaxV1 == null) {
            return "Extension not parseble,or file don't\nexists in this version,impossible to get syntax structures!";
        } else {
            String str = "";
            if (!syntaxV1.isEmpty()) {
                if (syntaxV1.get(0).getWarning()) {
                    str = str + "WARNING!\n";
                }
            } else {
                return "V1 doesn't has any structure type!";
            }
            int i = 0;
            for (SyntaxStructure ss : this.syntaxV1) {
                if (!str.contains(ss.getStructureType())) {
                    if (i == 2) {
                        str = str + ", " + ss.getStructureType() + "\n";
                        i = 0;
                    } else {
                        str = str + ", " + ss.getStructureType();
                        i++;
                    }
                }
            }
            if (str == "") {
                return "V1 doesn't has any structure type!";
            } else {
                return str.replaceFirst(", ", "").replaceAll("\n,", "\n");
            }
        }
    }

    public String getV2StructureTypes() {
        if (syntaxV2 == null) {
            return "Extension not parseble,or file don't\nexists in this version,impossible to get syntax structures!";
        } else {
            String str = "";
            if (!syntaxV2.isEmpty()) {
                if (syntaxV2.get(0).getWarning()) {
                    str = str + "WARNING!\n";
                }
            } else {
                return "V2 doesn't has any structure type!";
            }
            int i = 0;
            for (SyntaxStructure ss : this.syntaxV2) {
                if (!str.contains(ss.getStructureType())) {
                    if (i == 2) {
                        str = str + ", " + ss.getStructureType() + "\n";
                        i = 0;
                    } else {
                        str = str + ", " + ss.getStructureType();
                        i++;
                    }
                }
            }
            if (str == "") {
                return "V2 doesn't has any structure type!";
            } else {
                return str.replaceFirst(", ", "").replaceAll("\n,", "\n");
            }
        }
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
        } else if(solution.contains("POSTPONED")) {
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
