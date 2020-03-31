package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import java.util.ArrayList;
import java.util.List;

public class ConflictRegion {

    private final List<String> beforeContext;
    private final List<String> afterContext;
    private final List<String> v1;
    private final List<String> v2;
    private final int beginLine;
    private final int separatorLine;
    private final int endLine;

    private final int originalV1FirstLine;
    private final int originalV2FirstLine;
    private List<SyntaxStructure> syntaxV1 = new ArrayList<>();
    private List<SyntaxStructure> syntaxV2 = new ArrayList<>();

    public ConflictRegion(List<String> beforeContext, List<String> afterContext, List<String> v1, List<String> v2, int beginLine, int separatorLine, int endLine, int originalV1FirstLine, int originalV2FirstLine) {
        this.beforeContext = beforeContext;
        this.afterContext = afterContext;
        this.v1 = v1;
        this.v2 = v2;
        this.beginLine = beginLine;
        this.separatorLine = separatorLine;
        this.endLine = endLine;
        this.originalV1FirstLine = originalV1FirstLine;
        this.originalV2FirstLine = originalV2FirstLine;
    }

    public void setSyntaxV1(List<SyntaxStructure> syntaxV1) {
        this.syntaxV1 = syntaxV1;
    }

    public void setSyntaxV2(List<SyntaxStructure> syntaxV2) {
        this.syntaxV2 = syntaxV2;
    }

    public int getOriginalV1FirstLine() {
        return originalV1FirstLine;
    }

    public int getOriginalV2FirstLine() {
        return originalV2FirstLine;
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
        int j = 0;
        for (String line : this.beforeContext) {
            str = str + line + "\n";
        }
        str = str + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< (" + this.beginLine + ")\n";
        if (syntaxV1.isEmpty()) {
            for (String line : this.v1) {
                str = str + line + "\n";
            }
        } else {
            for (int i = 0; i < v1.size(); i++) {
                if (j < this.syntaxV1.size()) {
                    if (this.originalV1FirstLine + i == this.syntaxV1.get(j).getStart().getLine()) {
                        str = str + v1.get(i) + "\t(" + syntaxV1.get(i).getStructureType() + ")\n";
                        j++;
                    } else {
                        str = str + v1.get(i) + "\n";
                    }
                } else {
                    str = str + v1.get(i) + "\n";
                }
            }
        }
        j = 0;
        str = str + "============================== (" + this.separatorLine + ")\n";
        if (syntaxV2.isEmpty()) {
            for (String line : this.v2) {
                str = str + line + "\n";
            }
        } else {
            for (int i = 0; i < v2.size(); i++) {
                if (j < this.syntaxV2.size()) {
                    if (this.originalV2FirstLine + i == this.syntaxV2.get(j).getStart().getLine()) {
                        str = str + v2.get(i) + "\t(" + syntaxV2.get(i).getStructureType() + ")\n";
                        j++;
                    } else {
                        str = str + v2.get(i) + "\n";
                    }
                } else {
                    str = str + v2.get(i) + "\n";
                }
            }
        }
        str = str + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>> (" + this.endLine + ")\n";
        for (String line : this.afterContext) {
            str = str + line + "\n";
        }
        return str;
    }
    }

    public String getForm() {
        return generateForm();
    }

    public void print() {
        System.out.println(generateForm());
    }

}
