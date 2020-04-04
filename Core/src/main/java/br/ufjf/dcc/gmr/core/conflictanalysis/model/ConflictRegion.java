package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import br.ufjf.dcc.gmr.core.conflictanalysis.controller.RepositoryAnalysis;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
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
    private final int beginLine;
    private final int separatorLine;
    private final int endLine;

    private final int originalV1StartLine;
    private final int originalV1StopLine;
    private final int originalV2StartLine;
    private final int originalV2StopLine;
    private List<SyntaxStructure> syntaxV1 = new ArrayList<>();
    private List<SyntaxStructure> syntaxV2 = new ArrayList<>();

    public ConflictRegion(List<String> beforeContext, List<String> afterContext, List<String> v1, List<String> v2, int beginLine, int separatorLine,
            int endLine, int originalV1StartLine, int originalV2StartLine) {
        this.beforeContext = beforeContext;
        this.afterContext = afterContext;
        this.v1 = v1;
        this.v2 = v2;
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

    public void setSyntaxV1SyntaxV2(String repositoryPath, String filePath, String v1Commit, String v2Commit) throws IOException {
        try {
            if (this.originalV1StartLine > 0) {
                Git.checkout(v1Commit, repositoryPath);
                this.syntaxV1 = RepositoryAnalysis.getStructureTypeInInterval(filePath, this.originalV1StartLine, this.originalV1StopLine);
                Git.checkout("master", repositoryPath);
            }
            if (this.originalV2StartLine > 0) {
                Git.checkout(v2Commit, repositoryPath);
                this.syntaxV2 = RepositoryAnalysis.getStructureTypeInInterval(filePath, this.originalV2StartLine, this.originalV2StopLine);
                Git.checkout("master", repositoryPath);
            }
        } catch (IOException ex) {
            throw new IOException();
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("ERROR: LocalRepositoryNotAGitRepository error!");
            throw new IOException();
        } catch (CheckoutError ex) {
            System.out.println("ERROR: CheckoutError error!");
            throw new IOException();
        }
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

    private String generateForm() {
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

    public String getV1StructureTypes() {
        String str = "";
        for (SyntaxStructure ss : this.syntaxV1) {
            if (!str.contains(ss.getStructureType())) {
                str = str + ss.getStructureType() + ", ";
            }
        }
        if (str == "") {
            return "V1 doesn't has any structure type!";
        } else {
            return str;
        }
    }

    public String getV2StructureTypes() {
        String str = "";
        for (SyntaxStructure ss : this.syntaxV2) {
            if (!str.contains(ss.getStructureType())) {
                str = str + ", ";
                str = str + ss.getStructureType();
            }
        }
        if (str == "") {
            return "V2 doesn't has any structure type!";
        } else {
            return str.replaceFirst(", ", "");
        }
    }

    public String getForm() {
        return generateForm();
    }

    public void print() {
        System.out.println(generateForm());
    }

}
